package tree;
/*
 * You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].

Implement the SmallestInfiniteSet class:

SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
int popSmallest() Removes and returns the smallest integer contained in the infinite set.
void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.
 

Example 1:

Input
["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", 
"popSmallest", "popSmallest", "popSmallest"]
[[], [2], [], [], [], [1], [], [], []]
Output
[null, null, 1, 2, 3, null, 1, 4, 5]

Explanation
SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
                                   // is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.
 

Constraints:

1 <= num <= 1000
At most 1000 calls will be made in total to popSmallest and addBack.

 */
import java.util.TreeSet;

class SmallestInfiniteSet {

    private TreeSet<Integer> s = new TreeSet<>();

    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; ++i) {
            s.add(i);
        }
    }

    public int popSmallest() {
        return s.pollFirst();
    }

    public void addBack(int num) {
        s.add(num);
    }
    
    /*
     * We note that the range of elements in the set given by the problem is [1,1000], and the operations we need to support are:
popSmallest: Pop the smallest element from the set
addBack: Add an element back to the set

Therefore, we can use an ordered set to simulate this. Let's denote the ordered set as s, and the elements 
in the set as s1,s2,⋯,sn, where n is the number of elements in the ordered set. In this problem, n≤1000.

During initialization, we add all elements in [1,1000] to the ordered set. The time complexity is O(n×log⁡n).

In the popSmallest operation, we just need to pop the first element from the ordered set. The time complexity for a 
single operation is O(log⁡n).

In the addBack operation, we just need to add the element back to the ordered set. The time complexity for a single operation is 
O(log⁡n).

The space complexity is O(n).
     */
}