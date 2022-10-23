/**
 * Alghoritm Ford-Fulkerson
 *  
 */


import java.util.ArrayDeque
import java.util.Queue

val entrances = intArrayOf(0,1)
val exits = intArrayOf(4,5)
val input = arrayOf(
    intArrayOf(0, 0, 4, 6, 0, 0),
    intArrayOf(0, 0, 5, 2, 0, 0),
    intArrayOf(0, 0, 0, 0, 4, 4),
    intArrayOf(0, 0, 0, 0, 6, 6),
    intArrayOf(0, 0, 0, 0, 0, 0),
    intArrayOf(0, 0, 0, 0, 0, 0),
)

fun main() {
    val network = transform(entrances, exits, input) // convert input to new network for algorithm purpose 
    var path = bfs(network) // find available path
    var capacity = 0  // result
    
    while(path != null) {
        // find min capacity in path
        var u = 0
        var minCapacity = Int.MAX_VALUE
        for(vertex in path) {
            minCapacity = Math.min(minCapacity, network[u][vertex])
            u = vertex
        }
        
        capacity += minCapacity
       
        // override capacity and create 
        u=0
        for(vertex in path) {
            network[u][vertex] -= minCapacity
            network[vertex][u] += minCapacity
            u = vertex
        }
        
        path = bfs(network)
    }
    
    println("Result is $capacity")
}

private fun transform(entrances: IntArray, exits: IntArray, network: Array<IntArray>): Array<IntArray> {
    val newLength = network.size + 2
    val newNetwork = Array(newLength) { IntArray(newLength) }
    
    for(row in 0 until network.size) {
        for(col in 0 until network[row].size) {
            newNetwork[row + 1][col + 1] = network[row][col]
        }
    }
    
    // add edge from soruce to entraces with infinity value
    for(entrance in entrances) {
        newNetwork[0][entrance+1] = Int.MAX_VALUE
    }
    
    // add edge from exits to sink with infinity value
    for(exit in exits) {
        newNetwork[exit+1][newLength-1] = Int.MAX_VALUE
    }  
    
    return newNetwork
}

private fun bfs(network: Array<IntArray>): IntArray? {
    val parents = IntArray(network.size) { -1 }
    val queue: Queue<Int> = ArrayDeque()
    queue.add(0)
    
    while(queue.size != 0 && parents[parents.size - 1] == -1) {
        val u = queue.remove()
        for(v in 0 until network.size) {
            if(network[u][v] > 0 && parents[v] == -1) {
                queue.add(v)
                parents[v] = u
            }
        }
    }
    
    val path = mutableListOf<Int>()
    var item = parents[parents.size - 1]
    
    while (item != 0) {
        if(item == -1) return null
        path.add(item)
        item = parents[item]
    }
    
    path.reverse()
    
    return path.toIntArray()
}
