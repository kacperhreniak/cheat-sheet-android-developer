# Data structure and Algorithms

## Questions:
- #### `Big O Notation`
- #### `Time Complexity`
- #### `Space Complexity`
- #### Concept of `Dynamic Programming`
- #### Concept of `Dizel i zwyciezaj`
- #### Data structure: `Stack`
- #### Data structure: `Trie`
- #### Data structure: `Heap`
- #### How to get minimum value from `Minimum Heap`?
    Get first item from an array. Time complexity - O(1)

- #### Data structure: `Binary Search Tree`
    It's a type of Tree Data Structure. Each node has maximum 2 children nodes, A value in the left child is less then value in root node, and value in right child is greater then value in root node. 

- #### How a `HashMap` works?
- #### How `Hashing` works?
- #### Handling `collision` in `HashMap`
- #### `Time complexity` of getting object from HashMap
    Constant time - O(1).

- #### Describe a types of `Tree Traversals`
    inorder, preorder, postorder

- #### `Inorder traversal`
    Inorder traversl first visit left child, then current node, and right child.

- #### `Preorder traversal`
    Preorder traversal first visit first current node, then left child, and right child.

- #### `Postorder traversal`
    Posorder traversal first visit left child, then right child, and current node.

- #### `DFS` - Depth-first search
    Example

- #### `BFS` - Breadth-first search 
    Breadth-first search

- #### `data structure` to implement `DFS`?
    Stack - during traversal push/pop node from/to the stack

- #### `data structure` to implement `BFS`?

## Graphs
- #### `strongly connected components`
    Strongly connecte components are FI~XME means that in graph exists subgraph where all vertex are achivable.To find all of them se a Kosaraju's Algorithm - time complexity is O(V+E). This term is applicable only to directed graphs.

- #### `connected graph`
    Connected graph is a graph, where each node is a port of same graph. All nodes (vertexes) have edge to the other node (vertex) in the same graph.

- #### `unidirected graph`
    Unidirected graph is a graph with edges without any specific direction. each edge is bidirectional.

- #### `spanning tree`
    Spanning tree is a minimum set of edges to connect all vertes in a single connected graph. 

- #### minimum `spanning tree`
    Minimum spanning tree is a spanning tree, where sum of edges used to create it is minimum. Algorithm to find MSP are Prime's and Kruskal's 

- #### enumerate alghoritms to find minimum spanning tree
    For example: Prime's algortihm and Kruskal's algohoritm

    Links to alghrotims

- #### adjacency list
    Adjacency list is a list of LinkedList to represent graph, where each item is a single connection between nodes and index is a single node. It consumes less memory space than adjacency matrix.

- #### adjacency matrix
   FIXME It's a representation of connection in graphs based on 2D-array of booleans. Each row and column is a number of specific node and boolean flag means connection or no connection between two nodes. 

- #### Adventage of `adjacency list` over `adjacency matrix`:
    Adjacency list, mostly time, requries less memory space than adjacency matrix.


- #### Pros of adjacency matrix:
    https://www.programiz.com/dsa/graph-adjacency-matrix
    

- #### Bellamn Ford's algortihm
    shortest path in weigthed graph with negative weight edges
    
## Ideas to reslove Alghoritm or Data structure for problem:
- #### Find `Kth smallest element` from an Array
    Answer: Put all item to minimum `Heap` and the get first Kth elements
- #### Valid parenthesis
    Answer: Use a `Stack` to put all open parenthesis, and get close parenthesis.  


