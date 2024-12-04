package practice_LC;

import java.util.HashSet;
import java.util.Set;

//Given an array, find the first duplicate element.
//Eg. I/P : [1, 2, 4, 4, 1, 3, 7, 5, 5, 2]
//O/P : 4
public class FirstDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9, 7, 2, 4, 4, 1, 9, 7, 5, 5, 2};
    int res= FindFirstDuplicate(arr);
    System.out.println(res);
	}

	private static int FindFirstDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		Set<Integer> abc= new HashSet<Integer>();
		int n= arr.length-1;
		for ( int i=1; i<n; i++){
			
			
			
			if(abc.contains(arr[i])) {
				return arr[i];
			}
			else
				abc.add(arr[i]);
		}
		
		return -1;
	}

	
}
