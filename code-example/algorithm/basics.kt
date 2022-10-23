// Queue implementation
val queue = LinkedList() // linked list implement deque interface 
queue.addFirst() // add item an the beginning of this queue
queue.removeLast() // get the last item from the queue

/* or */
queue.add() /* or */ queue.addLast() // add item at the end of this queue
queue.removeFirst() // get first item from list

val queue = PriorityQueue() // priority queue also implement deque interface, so it could be used as stack or queue
// API same as above

// Stack implementation
import java.util.Stack

val stack = Stack() // create stack
stack.push() // add item on the top of this stack 
stack.peek() // return item on the top of this stack
stack.pool() // get and remove item on the top of this stack

// Array deque is a double ended queue. It allows to implement to stack or queue with add and remove data with O(1) time complexity 
val stack = ArrayDeque() // create stack
stack.addFirst() // add item on the top of this stack
stack.removeFirst() // revemo item from the top of this stack
 
// Priority queue
val queue = PriorityQueue<EdgePoint> { firstItem, secondItem -> firstItem.cost - secondItem.cost } // more Java way
val pq: PriorityQueue<Pair<Int, Int>> = PriorityQueue(k, compareBy { -it.second }) // more kotlin way
