package hashtable;
/*
 * What is Hash Table?
A Hash table is defined as a data structure used to insert, look up, and remove key-value pairs quickly. 
It operates on the hashing concept, where each key is translated by a hash function into a distinct index in an array. 
The index functions as a storage location for the matching value. In simple words, it maps the keys with the value.

dataobjects--> hash function--> hash codes - stored in diff indexes in Hash table

Hashing is a technique or process of mapping keys, and values into the hash table by using a hash function. 
It is done for faster access to elements. 
The efficiency of mapping depends on the efficiency of the hash function used.

The process of storing objects using a hash function is as follows:
1. Create an array of size M to store objects; this array is called Hash-Table.
2. Find a hash code of an object by passing it through the hash function.
3. Take module of hash code by the size of Hashtable to get the index of the table where objects
will be stored.
4. Finally store these objects in the designated index.

The process of searching objects in Hash-Table using a hash function is as follows:
1. Find a hash code of the object we are searching for by passing it through the hash function.
2. Take module of hash code by the size of Hashtable to get the index of the table where objects
are stored.
3. Finally, retrieve the object from the designated index.

Hash-Table
A Hash-Table is a data structure that maps keys to values. Each position of the Hash-Table is
called a slot. The Hash-Table uses a hash function to calculate an index of an array of slots. We
use the Hash-Table when the number of keys actually stored is small relatively to the number of
possible keys.


Hash Function
A hash function is a function that generates an index in a table for a given object.
An ideal hash function should generate a unique index for each and every object is called the
perfect hash function.


Properties of good hash function:
1. It should provide a uniform distribution of hash values. A non-uniform distribution
increased the number of collisions and the cost of resolving them.
2. Choose a hash function which can be computed quickly and returns values within the range
of the Hash-Table.
3. Chose a hash function with a good collision resolution algorithm which can be used to
compute alternative index if the collision occurs.
4. Choose a hash function which uses the necessary information provided in the key.
5. It should have high load factor for a given set of keys.



What is Load factor?
A hash table�s load factor is determined by how many elements are kept there in relation to how big the 
table is. The table may be cluttered and have longer search times and collisions if the load factor is high. 
An ideal load factor can be maintained with the use of a good hash function and proper table resizing.

What is a Hash function?
A Function that translates keys to array indices is known as a hash function. The keys should be evenly 
distributed across the array via a decent hash function to reduce collisions and ensure quick lookup speeds.

Integer universe assumption: The keys are assumed to be integers within a certain range according to the 
integer universe assumption. This enables the use of basic hashing operations like division or multiplication 
hashing.

Hashing by division: This straightforward hashing technique uses the key�s remaining value after dividing it by 
the array�s size as the index. When an array size is a prime number and the keys are evenly spaced out, it 
performs well. 

Hashing by multiplication: This straightforward hashing operation multiplies the key by a constant between 0 and 
1 before taking the fractional portion of the outcome. After that, the index is determined by multiplying the 
fractional component by the array�s size. Also, it functions effectively when the keys are scattered equally.

Choosing a hash function:
Selecting a decent hash function is based on the properties of the keys and the intended functionality of the hash table. Using a function that evenly distributes the keys and reduces collisions is crucial.

Criteria based on which a hash function is chosen:

To ensure that the number of collisions is kept to a minimum, a good hash function should distribute the keys 
throughout the hash table in a uniform manner. This implies that for all pairings of keys, the likelihood of two keys 
hashing to the same position in the table should be rather constant.

To enable speedy hashing and key retrieval, the hash function should be computationally efficient.
It ought to be challenging to deduce the key from its hash value. As a result, attempts to guess the key using the hash 
value are less likely to succeed.

A hash function should be flexible enough to adjust as the data being hashed changes. For instance, the hash function needs 
to continue to perform properly if the keys being hashed change in size or format.

Collision resolution techniques:
Collisions happen when two or more keys point to the same array index. Chaining, open addressing, 
and double hashing are a few techniques for resolving collisions.

Open addressing: collisions are handled by looking for the following empty space in the table. If the first slot is 
already taken, the hash function is applied to the subsequent slots until one is left empty. There are various ways to use 
this approach, including double hashing, linear probing, and quadratic probing.
--Linear Probing
In Linear Probing, we try to resolve the collision of an index of a Hash-Table by sequentially
searching the Hash-Table free location. Let us suppose, if k is the index retrieved from the hash
function. If the kth index is already filled then we will look for (k+1) %M, then (k+2) %M and so
on. When we get a free slot, we will insert the object into that free slot.

--Quadratic Probing
In Quadratic Probing, we try to resolve the collision of the index of a Hash-Table by quadratic
ally increasing the search index free location. Let us suppose, if k is the index retrieved from the
hash function. If the kth index is already filled then we will look for (k+1^2) %M, then (k+2^2)
%M and so on. When we get a free slot, we will insert the object into that free slot.


Separate Chaining: In separate chaining, a linked list of objects that hash to each slot in the hash table is present. 
Two keys are included in the linked list if they hash to the same slot. This method is rather simple to use and can manage 
several collisions.

Robin Hood hashing: To reduce the length of the chain, collisions in Robin Hood hashing are addressed by switching off keys. 
The algorithm compares the distance between the slot and the occupied slot of the two keys if a new key hashes to an 
already-occupied slot. The existing key gets swapped out with the new one if it is closer to its ideal slot. 
This brings the existing key closer to its ideal slot. This method has a tendency to cut down on collisions and 
average chain length.
 */
public class introduction_101 {

}