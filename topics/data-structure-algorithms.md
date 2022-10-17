# Data structure and Algorithms

### **Big O Notation**
Big O Notation is a way to measure an algorithm's efficiency. It measures the time it takes to run your function as the input grows. Or in other words, how well does the function scale. There are two parts to measuring efficiency — time complexity and space complexity
It’s the upper bound of algorithm

Time complexity cheat sheet - https://miro.medium.com/max/1400/1*J8w0UxN-D5dqtWV4Dl3vXQ.png

### **Time/Space complexity - Notations**
Other notations: Big Theta and Big Omega

The difference between Big O notation and Big Ω notation is that Big O is used to describe the worst-case running time for an algorithm. But, Big Ω notation, on the other hand, is used to describe the best-case running time for a given algorithm.

Big Theta = Big O and Big Omega

### **Time Complexity**
Time Complexity defines time taken by the algorithm to complete its execution.

### **Space Complexity**
Space complexity defines space needed by the alorithm during the execution. 

### **Data structure: Stack**
It's a data structure which implements LIFO (last in, first out) approach.

### **Data structure: Trie**
TODO

### **Data structure: Heap**
Heap is a specific tree data structure, where a max or a min value is in the root, so time complexity to get min or max value is constant O(1). Heap coule be implemented by using array.  

### **Data structure: Read/Black Tree**
TODO

### **minimum value from Minimum Heap**
Get first item from an array. Time complexity - O(1)

### **Data structure: `Binary Search Tree`**
It's a type of Tree Data Structure. Each node has maximum 2 children nodes, A value in the left child is less then value in root node, and value in right child is greater then value in root node. 

### **Data structure: HashMap**
HashMap is a key - value data structure, where time to get value is constant - time complexity O(1) using `hashing` technique.  

### **Hashing**

TODO

### **Handling `collision` in `hashing`**


### `Time complexity` of getting object from HashMap
Constant time - O(1).

### **Tree Traversals**
inorder, preorder, postorder

### **Inorder traversal**
Inorder traversl first visit left child, then current node, and right child.

### **Preorder traversal**
Preorder traversal first visit first current node, then left child, and right child.

### **Postorder traversal**
Posorder traversal first visit left child, then right child, and current node.

### **DFS**
Depth-first search

### **BFS** 
Breadth-first

### **DFS: data structure**
Stack

### **BFS: data structure**
Queue

### **Dynamic Programming**
It's a technique to resolve problem by calculate result of subproblem, and then use it calculate the result of the problem.

### **Divide and conquer**
It's a technique to resolve problem by divide problem into smaller subproblem, calculate a result, and combine results into the result of the problem.  

## **Graphs**

### **Eulerian path**
It's a path passes throught all nodes exactly once.

### **Eulerian cycle**
It's a Eulerian path which is a cycle.

### **Hamilton path**
It's a path which visit all vertex exactly once.

### **Hamilton cycle**
It's a Hamilton path which a cycle, so begins and ends in the same vertex.

### **strongly connected components**
Strongly connected components is a subgraph in a graph, in which exists path from each vertex to another vertex.

### **strongly connected graph**
Strongly connected graph is a graph, in which exists path from each vertex to another vertex.

### **connected graph**
Connected graph is a graph, where each node is a port of same graph. All nodes (vertexes) have edge to the other node (vertex) in the same graph.

### **unidirected graph**
Unidirected graph is a graph with edges without any specific direction. each edge is bidirectional.

### **articulation point** or **cut vertex**
The vertex is an articaulation point, when removing it and associated edges disconnects the graph.

### **bridge**
FIXME: It's an edge in a graph, which removing it increases number of connected component - verify ME 

### `maximum flow`
It's a maximum flow of a graph, from single source/vertex to sink (which could be a representant of single or multiple vertex). Ford-Fulkerson algorithm could be used to find maximum flow with time complexity  

### **Augementing path**
It's a path from source to sink increasing maximum flow.

### **Residual edge** / **Residual graph**
hmmmmm

### **spanning tree**
Spanning tree is a minimum set of edges to connect all vertes in a single connected graph. 

### **minimum `spanning tree`**
Minimum spanning tree is a spanning tree, where sum of edges used to create it is minimum. Algorithm to find MSP are Prime's and Kruskal's 

### **Algorihtm to find minimum spanning tree**
For example: Prime's algortihm and Kruskal's algohoritm

### **Adjacency list**
Adjacency list is a list of LinkedList to represent graph, where each item is a single connection between nodes and index is a single node. It consumes less memory space than adjacency matrix.

### **Adjacency matrix**
FIXME It's a representation of connection in graphs based on 2D-array of booleans. Each row and column is a number of specific node and boolean flag means connection or no connection between two nodes. 

### **`adjacency list` over `adjacency matrix`**
Adjacency list, mostly time, requries less memory space than adjacency matrix.

### Pros of adjacency matrix:
https://www.programiz.com/dsa/graph-adjacency-matrix

## **Design patterns**

### **Factory method** `easy`

### **Builder** `easy`
allows to create different representations of an object. For example, 

## **Algorithm**

### Dijkstra's algorithm
Algorithm use to find short path for single source to each vertex in a graph without negative edges. This algorithm is similar to Prime's algoritihm. Time complexity is O((V+E) log V)

### Bellamn Ford's algorithm
Algorithm use to find short path for single source to each vertex in a graph with negative edges, but withou negative cycle. There is at most V - 1 iterations, and we coulde optimize algorithm by detect that in current iterations there wasn't any chcange. Time complexity is O(VE)

### Floyd Wharshall's alorithm
TODO: Algorithm to find shorte paths from each vertex to other in a graph.

### Kosaraju's alorithm
Algorithm to find all strongly connected components with time complexity O(V+E). This alogrithm is applicable only to directed graph. Steps of the algorithm:
  1. DFS on a graph and add vertex to a stack starting from the end.
  2. Revers edges in directed graph
  3. Call DFS for vertex getting one by one from the stack
  4. Each successful DFS traversal is an single strongly connected graph.

### Tarjan's algorithm
Algorithm to find all strongly connected components with time complexity O(V+E), applicable to directed graph.
[TBA]

### Ford-Fulkerson algorithm
Algorithm to compute maximum flow in flow network/graph.

### Kruskal's algorithm
Alogrithm to find minimum spanning tree with time complexity O(E log E). Steps of the algorithm:
1. Sort edges ascending - you could use PriorityQueue
2. Take an edge with the lowest value with condition that one of vertex is not visited
3. Repeate until visiting all vertexes

### Primes's algorithm
Alogrithm to find minimum spanning tree with time complexity O((V+E) log V). Steps of the algorithm:
1. Sort all edges for first vertex - you can use PriorityQueue
2. Take the edge with minimum value and add to all edges for visited vertex
3. Take the edege with minim lowest edege with contidion that one of the vertex is unvisited
4. Repeat unitl visiting all vertexes

### Floyd's cycle detection
Alogrithm to find position/graph/index of a begining of a cycle. Time complexity O(2N) and Space complexity O(1)
1. initialize to index slow, and fast
2. Iterate over linkedList, array by get next item for slow index, and item after the item for fast index
3. If indexes are equal remeber the fast index, and set slow index to 0.
3.1 If fast index is null - no cycle in the arary/linkedlies
4. Continue iteration increasing both index by 1.
5. If slow and fast items are equal it means that you found the begining of the cycle.

## Ideas to reslove Alghoritm or Data structure for problem:

### Find `Kth smallest element` from an Array
Answer: Put all item to minimum `Heap` and the get first Kth elements

### **Valid parenthesis**
Answer: Use a `Stack` to put all open parenthesis, and get close parenthesis. 
