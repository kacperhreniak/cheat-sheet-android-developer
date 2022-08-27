/*
* Find missing routes in flight network to being able to reach each airport from start airport.
* The idea for this task is:
* 1. create graph from the input
* 2. find all strongly connected components to optimize graph
* 3. find parent for each node
* 4. each node without parent is an airport with missing route, so that's the answer/result
*/

fun main(args: Array<String>) {
    val routes = listOf(
        "DSM" to "ORD", "ORD" to "BGI", "BGI" to "LGA", "SIN" to "CDG", "CDG" to "SIN",
        "CDG" to "BUD", "DEL" to "DOH", "DEL" to "CDG", "TLV" to "DEL", "EWR" to "HND",
        "HND" to "ICN", "HND" to "JFK", "ICN" to "JFK", "JFK" to "LGA", "EYW" to "LHR",
        "LHR" to "SFO", "SFO" to "SAN", "SFO" to "DSM", "SAN" to "EYW"
    )
    val startingAirport = "LGA"
    val result = solution(routes, startingAirport)
    
    result.forEach { println("From: ${it.first} to ${it.second}") }
}

private fun solution(
    routes: List<Pair<String, String>>,
    startingPoint: String
): List<Pair<String, String>> {
    // create graph
    val graph: HashMap<String, MutableList<String>> = createGraph(routes)

    // find strongly connected components
    val stronglyConnectedComponents = kosarajuAlgorithm(graph)

    // optimize graph
    val optimizedGraph = optimizeGraph(stronglyConnectedComponents, graph)

    // find parents for each node
    val parents = hashMapOf<String, Boolean>()
    findParents(parents, optimizedGraph)

    // find node without parents and that's the result - required routes to add 
    return parents.filter { it.value.not() }
        .map { it.key }
        .map { startingPoint to it }
}

private fun createGraph(routes: List<Pair<String, String>>): HashMap<String, MutableList<String>> {
    val graph: HashMap<String, MutableList<String>> = hashMapOf()

    for (route in routes) {
        val values = graph.getOrDefault(route.first, mutableListOf())
        values.add(route.second)
        graph[route.first] = values
    }
    return graph
}

private fun kosarajuAlgorithm(graph: HashMap<String, MutableList<String>>): HashMap<String, String> {
    val visited = mutableSetOf<String>()
    val stack = Stack<String>()

    fun initialDfs(graph: HashMap<String, MutableList<String>>, node: String?) {
        val values = graph[node].orEmpty()
        values.forEach {
            if (visited.contains(it)) return@forEach
            visited.add(it)
            initialDfs(graph, it)
            stack.push(it)
        }
    }

    fun reversGraph(initialGraph: HashMap<String, MutableList<String>>): HashMap<String, MutableList<String>> {
        val reversedGraph = hashMapOf<String, MutableList<String>>()
        for ((key, value) in initialGraph) {
            value.forEach {
                val items = reversedGraph.getOrDefault(it, mutableListOf())
                items.add(key)
                reversedGraph[it] = items
            }
        }
        return reversedGraph
    }

    fun stronglyConnectedComponents(graph: HashMap<String, MutableList<String>>): HashMap<String, String> {
        val result: HashMap<String, String> = hashMapOf()
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            if (visited.contains(node)) continue

            val tempStack = Stack<String>()
            val tempVisited = mutableSetOf<String>()
            tempStack.push(node)
            while (tempStack.isNotEmpty()) {
                val item = tempStack.pop()
                if (visited.contains(item)) continue
                tempVisited.add(item)
                visited.add(item)
                graph[item].orEmpty().forEach { tempStack.push(it) }
            }

            tempVisited.forEach {
                result[it] = tempVisited.first()
            }
        }
        return result
    }

    // first DFS
    graph.forEach {
        if (visited.contains(it.key)) return@forEach
        initialDfs(graph, it.key)
        stack.push(it.key)
    }
    visited.clear()

    // reverse graph
    val reversedGraph = reversGraph(graph)

    // DFS to find strongly connected components
    return stronglyConnectedComponents((reversedGraph))
}

private fun optimizeGraph(
    components: HashMap<String, String>,
    graph: HashMap<String, MutableList<String>>
): HashMap<String, MutableList<String>> {
    val optimizedGraph = hashMapOf<String, MutableList<String>>()

    val stack = Stack<String>()
    val visited = hashSetOf<String>()
    graph.forEach { stack.push(it.key) }

    while (stack.isNotEmpty()) {
        val item = stack.pop()
        if (visited.contains(item)) continue

        visited.add(item)
        val component = components[item]
        graph[item].orEmpty().forEach {
            stack.push(it)
            val componentChild = components[it]
            val values = optimizedGraph.getOrDefault(component, mutableListOf())
            values.add(componentChild!!)
            optimizedGraph[component!!] = values
        }
    }
    return optimizedGraph
}

private fun findParents(parents: HashMap<String, Boolean>, graph: HashMap<String, MutableList<String>>) {
    val stack = Stack<String>()

    graph.forEach {
        stack.push(it.key)
        parents[it.key] = false
    }

    while (stack.isNotEmpty()) {
        val item = stack.pop()
        val value = graph.getOrDefault(item, listOf())

        value.forEach {
            if (it != item && !parents.getOrDefault(it, false)) {
                parents[it] = true
                stack.push(it)
            }
        }
    }
}
