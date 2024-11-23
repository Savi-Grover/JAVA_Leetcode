package sorting;
/*
 * External Sort (External Merge-Sort)
When data need to be sorted is huge. Moreover, it is not possible to load it completely in memory
(RAM) for such a dataset we use external sorting. Specific data is sorted using external MergeSort algorithm. 

- Whole data are sorted in chunks using Merge-Sort. Now we need to
combine these sorted chunks into final sorted data.

-Then we create queues for the data, which will read from the sorted chunks. Each chunk will have
its own queue. 

-We will pop from this queue and these queues are responsible for reading from the
sorted chunks. Let us suppose we have K different chunks of sorted data each of length M.

-The third step is using a Min-Heap, which will take input data from each of this queue. It will
take one element from each queue. The minimum value is taken from the Heap and added to the
final sorted element output. 

-Then queue from which this min element is inserted in the heap will
again popped and one more element from that queue is added to the Heap. 

-Finally, when the data is exhausted from some queue that queue is removed from the input list. Finally, we will get a
sorted data came out from the heap.

We can optimize this process further by adding an output buffer, which will store data coming out
of Heap and will do a limited number of the write operation in the final Disk space.
 */
public class ExternalSort {

}
