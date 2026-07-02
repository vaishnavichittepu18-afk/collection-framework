import java.util.*;
COMMON SET METHODS

Set<Integer> set = new HashSet<>();
set.add(10);                         - Adds an element
set.addAll(set2);                    - Adds all elements from another collection

set.remove(10);                      - Removes an element
set.removeAll(set2);                 - Removes all matching elements
set.retainAll(set2);                 - Keeps only common elements (intersection)

set.contains(20);                    - Checks if element exists
set.containsAll(set2);               - Checks if all elements exist

set.size();                          - Returns number of elements
set.isEmpty();                       - Checks if set is empty

set.clear();                         - Removes all elements

set.iterator();                      - Returns iterator for traversal

set.toArray();                       - Converts set to array
set.toArray(new Integer[0]);         - Converts set to typed array

set.forEach(System.out::println);    - Traverses elements
set.removeIf(x -> x > 10);           - Removes elements matching condition

set.stream();                        - Creates stream
set.parallelStream();                - Creates parallel stream

set.equals(set2);                    - Compares sets
set.hashCode();                      - Returns hash code

set.spliterator();                   - Returns spliterator

//All Set implementations do NOT allow duplicate elements.

//1. HashSet

HashSet<Integer> hashSet = new HashSet<>();
/*About:
- Unique elements only
- No insertion order
- Not sorted
- Fastest Set implementation
- Average O(1) operations*/

//Additional Method:
hashSet.clone();                     - Creates shallow copy


//2. LinkedHashSet

LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

/*About:
- Unique elements only
- Maintains insertion order
- Not sorted
- Slightly slower than HashSet*/

Additional Method:
linkedHashSet.clone();               - Creates shallow copy


//3. TreeSet

TreeSet<Integer> treeSet = new TreeSet<>();

/*About:
- Unique elements only
- Automatically sorted
- Uses Red-Black Tree internally
- O(log n) operations*/

//Additional Methods:
treeSet.first();                     - Returns first element
treeSet.last();                      - Returns last element
treeSet.higher(10);                  - Next greater element
treeSet.lower(10);                   - Next smaller element
treeSet.ceiling(10);                 - Greater than or equal element
treeSet.floor(10);                   - Smaller than or equal element
treeSet.pollFirst();                 - Removes and returns first element
treeSet.pollLast();                  - Removes and returns last element
treeSet.headSet(10);                 - Elements less than given element
treeSet.tailSet(10);                 - Elements greater than or equal element
treeSet.subSet(10, 20);              - Elements in a range
treeSet.descendingSet();             - Reverse-order view
treeSet.descendingIterator();        - Reverse iterator
