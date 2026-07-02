ArrayList<String> list = new ArrayList<>();

list.add("A");              // Adds element at end
list.add(1, "B");           // Adds element at specified index
list.get(0);                // Returns element at index
list.set(0, "C");           // Updates element at index
list.remove(0);             // Removes element at index
list.remove("B");           // Removes specified element
list.contains("C");         // Checks whether element exists
list.indexOf("C");          // Returns first occurrence index
list.lastIndexOf("C");      // Returns last occurrence index
list.size();                // Returns number of elements
list.isEmpty();             // Checks whether list is empty
list.addAll(list2);         // Adds all elements of another collection
list.removeAll(list2);      // Removes all matching elements
list.retainAll(list2);      // Keeps only common elements
list.subList(0, 2);         // Returns portion of list
list.toArray();             // Converts list to array
list.iterator();            // Returns iterator for traversal
list.clone();               // Creates shallow copy
list.ensureCapacity(20);    // Increases internal capacity
list.trimToSize();          // Shrinks capacity to current size
list.clear();               // Removes all elements
