public class A_Collection {
}

/*
| Interface        | Description                                                                                   | Implementation Classes                                                | Characteristics                                         |
|------------------|-----------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------|
| Collection       | Root interface representing a group of objects.                                               | List, Set, Queue, Deque                                               | Can contain duplicate elements (List), unique elements (Set) |
| List             | Ordered collection (sequence) that allows duplicate elements.                                 | ArrayList, LinkedList, Vector, Stack                                  | Indexed, allows positional access                      |
| Set              | Collection that does not allow duplicate elements.                                            | HashSet, LinkedHashSet, TreeSet                                       | Unordered, ensures uniqueness of elements              |
| Queue            | Collection designed for holding elements prior to processing (FIFO order).                    | LinkedList, PriorityQueue                                             | Typically used for tasks like job scheduling           |
| Deque            | Double-ended queue that supports insertion and removal at both ends.                          | ArrayDeque, LinkedList                                                | Supports both FIFO and LIFO access patterns             |
| Map              | Collection that maps keys to values; each key is unique and associated with a single value.   | HashMap, LinkedHashMap, TreeMap, Hashtable, ConcurrentHashMap         | Key-value pairs, keys are unique                        |

*/


/*
| Class           | Use Cases                                                                                                                                                   | Differences                                                                                                                                                                     |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **ArrayList**   | - Fast access and traversal by index.<br>- Suitable for scenarios with infrequent additions/removals but frequent access by index.                            | - Implements dynamic array that automatically grows when elements are added.<br>- Fast access by index (O(1) complexity).<br>- Slower for insertions/deletions in the middle.  |
| **LinkedList**  | - Dynamic addition and removal of elements.<br>- Suitable for implementing queues, deques, or scenarios with frequent insertions/deletions.                    | - Doubly linked list structure.<br>- Efficient for insertions/deletions at both ends (head/tail).<br>- Slower random access (O(n) complexity).                                   |
| **Vector**      | - Thread-safe alternative to ArrayList.<br>- Legacy use cases requiring synchronized access to a list.                                                     | - Synchronized, ensuring thread safety.<br>- Slower than ArrayList due to synchronization overhead.<br>- Legacy class, generally replaced by ArrayList in modern code.         |
| **Stack**       | - LIFO (Last-In-First-Out) operations.<br>- Suitable for applications requiring stack-based operations such as expression evaluation or backtracking.        | - Extends Vector with stack-specific methods (push, pop, peek).<br>- Not recommended for new code; use Deque interface implementations like ArrayDeque or LinkedList.     |
| **HashSet**     | - Unordered collection ensuring uniqueness of elements.<br>- Efficient for add, remove, and contains operations with constant-time performance.               | - Uses hashing to store elements.<br>- No duplicate elements allowed.<br>- Unpredictable order of elements when iterating (order not guaranteed).                             |
| **LinkedHashSet** | - Maintains insertion order of elements while ensuring uniqueness.<br>- Suitable for scenarios requiring predictable iteration order of elements.            | - Hash table and linked list implementation.<br>- Maintains insertion order of elements.<br>- Slower than HashSet for add/remove operations (slight overhead for maintaining order). |
| **TreeSet**     | - Sorted set implementation based on natural ordering or custom comparator.<br>- Suitable for scenarios requiring elements in sorted order.                      | - Uses a red-black tree for storage.<br>- Elements are ordered based on their natural ordering or a custom comparator.<br>- Slower insertion/removal than HashSet (logarithmic time). |
| **LinkedList (Queue)** | - FIFO (First-In-First-Out) operations.<br>- Efficient for implementing queues with operations like enqueue and dequeue.                                      | - Implements Queue interface.<br>- Efficient for adding elements at the end (enqueue) and removing from the beginning (dequeue).                                            |
| **PriorityQueue** | - Priority-based processing where elements are processed based on priority.<br>- Suitable for scheduling and priority-based scenarios.                        | - Implements Queue interface with priority ordering.<br>- Uses a heap data structure (min-heap by default) to maintain priority order.<br>- Slower than Queue for basic operations.  |
| **ArrayDeque**  | - Efficient double-ended queue operations.<br>- Suitable for implementing deques where elements can be added or removed from both ends.                          | - Implements Deque interface.<br>- Efficient for adding or removing elements at both ends (head/tail).<br>- More memory efficient than LinkedList.                       |
| **LinkedList (Deque)** | - Supports both FIFO (Queue) and LIFO (Stack) operations.<br>- Flexible for implementing both queues and stacks in scenarios requiring dynamic operations.   | - Implements Deque interface.<br>- Doubly linked list structure.<br>- Efficient for insertions/deletions at both ends (head/tail).<br>- Slower random access (O(n) complexity).  |
| **HashMap**     | - Efficient key-value mapping with constant-time operations for add, remove, and retrieve based on keys.<br>- Suitable for general-purpose key-value storage. | - Uses hashing to store key-value pairs.<br>- No guarantee on order of keys when iterating (order not guaranteed).<br>- Allows one null key and multiple null values.         |
| **LinkedHashMap** | - Maintains insertion order of key-value pairs.<br>- Suitable for scenarios requiring predictable iteration order based on insertion sequence.               | - Hash table and linked list implementation.<br>- Maintains insertion order of key-value pairs.<br>- Slightly slower than HashMap for add/remove operations (maintaining order). |
| **TreeMap**     | - Sorted key-value mapping based on natural ordering or custom comparator.<br>- Suitable for scenarios requiring key-value pairs in sorted order.             | - Uses a red-black tree for storage.<br>- Elements are ordered based on their natural ordering or a custom comparator.<br>- Slower insertion/removal than HashMap (logarithmic time). |
| **Hashtable**   | - Legacy thread-safe key-value mapping.<br>- Suitable for synchronized access to key-value pairs in multi-threaded environments.                              | - Synchronized, ensuring thread safety.<br>- Legacy class, replaced by ConcurrentHashMap for better concurrency control in modern applications.                       |
| **ConcurrentHashMap** | - High-performance concurrent access to key-value pairs.<br>- Suitable for scalable multi-threaded applications without explicit synchronization.               | - Uses advanced synchronization techniques (lock striping) for better concurrency.<br>- Provides higher throughput than Hashtable for concurrent access scenarios.                 |

 */