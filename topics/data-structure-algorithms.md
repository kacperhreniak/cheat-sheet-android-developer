# Data structure and Algorithms

### **Big O Notation**
```
Big O Notation is a way to measure an algorithm's efficiency. It measures the time it takes to run your function as the input grows. Or in other words, how well does the function scale. There are two parts to measuring efficiency — time complexity and space complexity
It’s the upper bound of algorithm
```
Time complexity cheat sheet - https://miro.medium.com/max/1400/1*J8w0UxN-D5dqtWV4Dl3vXQ.png

### **Time/Space complexity - Notations**
```
Other notations: Big Theta and Big Omega

The difference between Big O notation and Big Ω notation is that Big O is used to describe the worst-case running time for an algorithm. But, Big Ω notation, on the other hand, is used to describe the best-case running time for a given algorithm.

Big Theta = Big O and Big Omega
```

### `Time Complexity`
```
Time Complexity defines time taken by the algorithm to complete its execution.
```

### `Space Complexity`
```
Space complexity defines space needed by the alorithm during the execution. 
```

### **Data structure: Stack**
```
TODO
```

### **Data structure: Trie**
```
TODO
```

### **Data structure: Heap**
```
TODO
```

### **Data structure: Read/Black Tree**
```
TODO
```

### **minimum value from Minimum Heap**
```
Get first item from an array. Time complexity - O(1)
```

### Data structure: `Binary Search Tree`
```
It's a type of Tree Data Structure. Each node has maximum 2 children nodes, A value in the left child is less then value in root node, and value in right child is greater then value in root node. 
```
### How a `HashMap` works?
### How `Hashing` works?
### Handling `collision` in `HashMap`

### `Time complexity` of getting object from HashMap
```
Constant time - O(1).
```

### Describe a types of `Tree Traversals`
```
inorder, preorder, postorder
```

### `Inorder traversal`
```
Inorder traversl first visit left child, then current node, and right child.
```

### `Preorder traversal`
```
Preorder traversal first visit first current node, then left child, and right child.
```

### `Postorder traversal`
```
Posorder traversal first visit left child, then right child, and current node.
```

### `DFS` - Depth-first search
```
Example
```

### `BFS` - Breadth-first search 
```
Breadth-first search
```

### `data structure` to implement `DFS`?
```
Stack - during traversal push/pop node from/to the stack
```

### `data structure` to implement `BFS`?
```
Queue
```

### Concept of `Dynamic Programming`
```
TODO
```

### Concept of `Dizel i zwyciezaj`
```
TODO
```

## Graphs
```
TODO
```

### `strongly connected components`
```
Strongly connecte components are FI~XME means that in graph exists subgraph where all vertex are achivable.To find all of them se a Kosaraju's Algorithm - time complexity is O(V+E). This term is applicable only to directed graphs.
```

### `connected graph`
```
Connected graph is a graph, where each node is a port of same graph. All nodes (vertexes) have edge to the other node (vertex) in the same graph.
```

### `unidirected graph`
```
Unidirected graph is a graph with edges without any specific direction. each edge is bidirectional.
```

### `spanning tree`
```
Spanning tree is a minimum set of edges to connect all vertes in a single connected graph. 
```

### minimum `spanning tree`
```
Minimum spanning tree is a spanning tree, where sum of edges used to create it is minimum. Algorithm to find MSP are Prime's and Kruskal's 
```

### enumerate alghoritms to find minimum spanning tree
```
For example: Prime's algortihm and Kruskal's algohoritm
```

### adjacency list
```
Adjacency list is a list of LinkedList to represent graph, where each item is a single connection between nodes and index is a single node. It consumes less memory space than adjacency matrix.
```

### adjacency matrix
```
FIXME It's a representation of connection in graphs based on 2D-array of booleans. Each row and column is a number of specific node and boolean flag means connection or no connection between two nodes. 
```

### Adventage of `adjacency list` over `adjacency matrix`:
```
Adjacency list, mostly time, requries less memory space than adjacency matrix.
```

### Pros of adjacency matrix:
https://www.programiz.com/dsa/graph-adjacency-matrix


### Bellamn Ford's algortihm
```
FIXME
shortest path in weigthed graph with negative weight edges
```
## Ideas to reslove Alghoritm or Data structure for problem:

### Find `Kth smallest element` from an Array
```
Answer: Put all item to minimum `Heap` and the get first Kth elements
```

### **Valid parenthesis**
```
Answer: Use a `Stack` to put all open parenthesis, and get close parenthesis.  
```