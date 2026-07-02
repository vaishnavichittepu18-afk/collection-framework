//LIST COLLECTIONS (ArrayList, LinkedList, Vector, Stack)


//COMMON METHODS (Available in All)

add(E e)                  // Adds element
add(int index, E e)       // Adds at index
addAll(Collection c)      // Adds all elements

get(int index)            // Returns element
set(int index, E e)       // Replaces element

remove(int index)         // Removes by index
remove(Object o)          // Removes by value
removeAll(Collection c)   // Removes matching elements
retainAll(Collection c)   // Keeps common elements
clear()                   // Removes all elements

contains(Object o)        // Checks existence
containsAll(Collection c) // Checks all exist

indexOf(Object o)         // First occurrence index
lastIndexOf(Object o)     // Last occurrence index

size()                    // Returns number of elements
isEmpty()                 // Checks if empty

iterator()                // Returns iterator
listIterator()            // Returns list iterator

forEach()                 // Traverses elements

toArray()                 // Converts to array
toArray(T[] a)            // Converts to typed array

removeIf()                // Removes matching elements

stream()                  // Creates stream
parallelStream()          // Creates parallel stream

spliterator()             // Returns spliterator

equals()                  // Compares collections
hashCode()                // Returns hash code



//1. ArrayList
//About:
 // Dynamic Array
 // Maintains insertion order
 // Allows duplicates
 // Allows null values
 // Not synchronized
 // Fast random access

ArrayList<Integer> list = new ArrayList<>();

//Additional Methods:

list.ensureCapacity(int min)   // Increases internal capacity
list.trimToSize()              // Shrinks capacity to current size
list.clone()                   // Creates shallow copy




//2. LinkedList
//About:
 // Doubly Linked List
 // Maintains insertion order
 // Allows duplicates
 // Allows null values
 // Fast insertion/deletion
LinkedList<Integer> list = new LinkedList<>();

//Additional Methods:

list.addFirst(E e)             // Adds at beginning
list.addLast(E e)              // Adds at end
list.getFirst()                // Returns first element
list.getLast()                 // Returns last element
list.removeFirst()             // Removes first element
list.removeLast()              // Removes last element
list.peek()                    // Returns first element
list.peekFirst()               // Returns first element
list.peekLast()                // Returns last element
list.poll()                    // Removes first element
list.pollFirst()               // Removes first element
list.pollLast()                // Removes last element
list.offer(E e)                // Adds at end
list.offerFirst(E e)           // Adds at beginning
list.offerLast(E e)            // Adds at end
list.push(E e)                 // Inserts at front
list.pop()                     // Removes first element
list.descendingIterator()      // Reverse traversal
list.clone()                   // Creates shallow copy



//3. Vector
//About:
 // Dynamic Array
 // Maintains insertion order
 // Allows duplicates
 // Allows null values
 // Synchronized (Thread-safe)

Vector<Integer> vt = new Vector<>();

//Additional Methods:

vt.capacity()                // Returns current capacity
vt.ensureCapacity(int min)   // Increases capacity
vt.trimToSize()              // Shrinks capacity
vt.setSize(int size)         // Changes size
vt.firstElement()            // Returns first element
vt.lastElement()             // Returns last element
vt.elementAt(int index)      // Returns element at index
vt.insertElementAt(E e, int index) // Inserts element at index
vt.removeElement(Object o)   // Removes specified element
vt.removeElementAt(int index)// Removes element at index
vt.removeAllElements()       // Removes all elements
vt.copyInto(Object[] arr)    // Copies elements into array
vt.elements()                // Returns Enumeration
vt.clone()                   // Creates shallow copy



//4. Stack
//About:
 // LIFO (Last In First Out)
 // Extends Vector
 // Allows duplicates
 // Allows null values
 // Synchronized (Thread-safe)

Stack<Integer> st = new Stack<>();

//Additional Methods:

st.push(E e)                 // Pushes element onto stack
st.pop()                     // Removes and returns top element
st.peek()                    // Returns top element
st.empty()                   // Checks stack is empty
st.search(Object o)          // Returns position from top
