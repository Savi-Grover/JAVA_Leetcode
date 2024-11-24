package priorityQueues;
/*
 * Time Complexity: O(n log n)
Auxiliary Space: O(log n),
 */
public class HeapSort {
	 // To heapify a subtree rooted with node i
    // which is an index in arr[].
    static void heapify(int arr[], int n, int i) {

        // Initialize largest as root
        int largest = i; 

        // left index = 2*i + 1
        int l = 2 * i + 1; 

        // right index = 2*i + 2
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to do heap sort
    static void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0]; 
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver's code
    public static void main(String args[]) {
        int arr[] = {9, 4, 3, 8, 10, 2, 5}; 
        heapSort(arr);
        System.out.println("Sorted array is ");
        printArray(arr);
    }
    
    
    /*
     * 1. Use create heap function to build a max heap from the given array of elements. This
operation will take O(N) time.

2. Dequeue the max value from the heap and store this value to the end of the array at location
arr[size-1]
a) Copy the value at the root of the heap to end of the array.
b) Copy the last element of the heap to the root, and then reduce the size of heap by 1.
This element is called the "out-of-place" element.
c) Restore heap property by swapping the out-of-place element with its greatest-value
child. Repeat this process until the out-of-place element reaches a leaf or it has a
value that is greater or equal to all its children

3. Repeat this operation till there is just one element in the heap.
Let’s take example of the heap which we had created at the start of the chapter. Heap sort is
algorithm starts by creating a heap of the given array which is done in linear time. Then at each
step head of the heap is swapped with the end of the heap and the heap size is reduced by 1. Then
percolate down is used to restore the heap property. And this same is done multiple times till the
heap contain just one element.

O(nlogn) = best, avg,worst
O(1)= space

: Heap-Sort is not a Stable sort and do not require any extra space for sorting a list
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}