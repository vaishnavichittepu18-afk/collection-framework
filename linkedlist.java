LinkedList<Integer> list = new LinkedList<>(); 
//Deque<Integer> list=new LinkedList<>();
list.add(10);               // Adds element at end and if list is  full throws exception 
list.addFirst(10);          // Adds element at beginning
list.addLast(20);           // Adds element at end
list.getFirst();            // Returns first element
list.getLast();             // Returns last element
list.offer(30);             // Inserts element and if list is full returns false
list.offerFirst(5);         // Inserts at front
list.offerLast(40);         // Inserts at rear
list.peek();                // Views first element
list.peekFirst();           // Views first element
list.peekLast();            // Views last element
list.poll();                // Removes and returns first element
list.pollFirst();           // Removes first element
list.pollLast();            // Removes last element
list.push(100);             // Pushes onto stack
list.pop();                 // Removes top stack element
list.descendingIterator();  // Traverses in reverse order
list.size();                // Returns the sixe of the list
list.isEmpty();             // Returns true is list is empty else false
list.clear();               // Empties the list
list.contains(10);          // Checks if element is present in the list
list.remove(10);            // Remove the element
list.iterator();            // Traverse in actual order
//Queue<Integer> dq=new LinkedList<>();
/* If linked list is created using queue it follows fifo so add(),offer(),peek(),poll(),size(),isEmpty(),contains(),remove(),clear(),iterator() methods are there.*/
