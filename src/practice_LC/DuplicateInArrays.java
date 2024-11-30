package practice_LC;

public class DuplicateInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,1};
		boolean res=CheckDuplicate(arr);
		System.out.println(res);
		
	}

	private static boolean CheckDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		for (int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
