# Hashtables
<!-- Short summary or background information -->
A hash table is a data structure that allows key-value pairs to be stored within it. The advantage of a hash table over other data structures is that adding, removing, and lookup operations all take O(1) time to execute. This is achieved through utilizing a hash function that takes a key and convert that key into a integer index that determine where in the array that entry would be stored. The hash function is the heart of a hash table and the ability of the hash function to spread all entries somehwat evenly throughout all slots in the array determine how efficient the hash table is.

## Challenge
<!-- Description of the challenge -->
#### Implement a Hashtable with the following methods:

- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- all function take O(1) time.

- This hash table will implement separate chaining as the method to deal with collisions. Separate chaining involves storing entries in the hashtable in an array of linked lists so that even if a collision was to happen, the entry would just be added on to the linked list at that index of the array.

## API
<!-- Description of each method publicly available in each of your hashtable -->
- Implement a hash table that has the following methods:

- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in a key and returns the value from the hashTable.
- getNode: takes in a key and returns the Node from the LinkedList.

- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.
