//MAP COLLECTIONS(Hashmap, Treemap, LinkedHashMap, HashSet)


//COMMON MAP METHODS

put()              // Inserts key-value pair

putIfAbsent()      // Inserts if key not present

get()              // Returns value by key

getOrDefault()     // Returns value or default value

remove()           // Removes key-value pair

replace()          // Replaces value

containsKey()      // Checks key exists

containsValue()    // Checks value exists

size()             // Returns number of entries

isEmpty()          // Checks map is empty

clear()            // Removes all entries

keySet()           // Returns all keys

values()           // Returns all values

entrySet()         // Returns key-value entries

forEach()          // Traverses map

compute()          // Computes new value

computeIfAbsent()  // Computes if key absent

computeIfPresent() // Computes if key present

merge()            // Merges values

equals()           // Compares maps

hashCode()         // Returns hash code



//1)Hashmap
/*About:
- Uses Hash Table
- Keys are unique
- No ordering guarantee
- Allows one null key
- Allows multiple null values
- Fast search, insert and delete*/

HashMap<Integer, String> map = new HashMap<>();

//Additional methods
map.clone() // Creates shallow copy



//LinkedHashMap
/*About:
- Uses Hash Table + Linked List
- Maintains insertion order
- Keys are unique
- Allows one null key
- Allows multiple null values*/

LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

//Additional methods
clone() // Creates shallow copy



//TreeMap
/*About:
- Uses Red-Black Tree
- Stores keys in sorted order
- Keys are unique
- Does NOT allow null keys
- Allows null values*/

TreeMap<Integer, String> map = new TreeMap<>();

//Additional Methods
map.firstKey() // Returns first (smallest) key
map.lastKey() // Returns last (largest) key
map.higherKey() // Returns next higher key
map.lowerKey() // Returns next lower key
map.ceilingKey() // Returns key >= given key
map.floorKey() // Returns key <= given key
map.pollFirstEntry() // Removes and returns first entry
map.pollLastEntry() // Removes and returns last entry
map.firstEntry() // Returns first entry
map.lastEntry() // Returns last entry
map.higherEntry() // Returns next higher entry
map.lowerEntry() // Returns next lower entry
map.descendingMap() // Reverse order view
map.navigableKeySet() // Returns navigable set of keys



//HashTable
/*About:
- Thread-safe (Synchronized)
- Uses Hash Table
- Keys are unique
- Does NOT allow null key
- Does NOT allow null value*/

Hashtable<Integer, String> table = new Hashtable<>();

//Additional methods
table.keys() // Returns Enumeration of keys
table.elements() // Returns Enumeration of values
