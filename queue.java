//QUEUE COLLECTIONS(Linkedlist,Priorityqueue,Deque)



//COMMON QUEUE METHODS


add()              // Inserts element, throws exception if failed

offer()            // Inserts element, returns false if failed

remove()           // Removes head element, throws exception if empty

poll()             // Removes and returns head, null if empty

element()          // Returns head element, throws exception if empty

peek()             // Returns head element, null if empty

contains()         // Checks element exists

containsAll()      // Checks all elements exist

size()             // Returns number of elements

isEmpty()          // Checks queue is empty

clear()            // Removes all elements

iterator()         // Returns iterator

forEach()          // Traverses elements

toArray()          // Converts to array

toArray()          // Converts to typed array

removeIf()         // Removes matching elements

stream()           // Creates stream

parallelStream()   // Creates parallel stream

spliterator()      // Returns spliterator

equals()           // Compares queues

hashCode()         // Returns hash code



//1) Priority queue
/*About:
- Implements Queue interface
- Elements stored according to priority
- Uses Min Heap internally
- Smallest element gets highest priority by default
- Does not maintain insertion order
- Allows duplicate elements
- Does NOT allow null values
- Efficient for priority-based processing*/

PriorityQueue<Integer> pq = new PriorityQueue<>();

//Additional methods
pq.comparator()       // Returns comparator used for ordering



//2) Array deque
/*About:
- Implements Deque interface
- Uses dynamic resizable array internally
- Can work as Queue or Stack
- Faster than Stack and LinkedList in most cases
- Allows duplicate elements
- Does NOT allow null values
- Supports insertion/removal from both ends*/

ArrayDeque<Integer> ad = new ArrayDeque<>();

//Additional methods
ad.addFirst()         // Inserts at front
ad.addLast()          // Inserts at rear
ad.offerFirst()       // Inserts at front
ad.offerLast()        // Inserts at rear
ad.getFirst()         // Returns first element
ad.getLast()          // Returns last element
ad.peekFirst()        // Returns first element
ad.peekLast()         // Returns last element
ad.removeFirst()      // Removes first element
ad.removeLast()       // Removes last element
ad.pollFirst()        // Removes first element
ad.pollLast()         // Removes last element
ad.push()             // Pushes element at front
ad.pop()              // Removes first element
ad.descendingIterator() // Reverse iterator
ad.removeFirstOccurrence() // Removes first occurrence
ad.removeLastOccurrence()  // Removes last occurrence
ad.clone()            // Creates shallow copy



//3) Linked List
/*About:
- Implements Queue and Deque interfaces
- Follows FIFO (First In First Out)
- Uses doubly linked list internally
- Allows duplicate elements
- Allows null values
- Fast insertion and deletion at both ends
- Extra memory needed for node links*/

Queue<Integer> queue = new LinkedList<>();
