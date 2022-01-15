// SORT function
// base condition ---> if array size  == 0 || == 1 return array
// hypothesis     ---> sort returns sorted array for (n-1) inputs
// induction      ---> insert element in n-1 array at correct position



package Recursion;

public class SortArray {
	static int[] sort(int arr[], int n) {
		if(n == 0) return arr;
		
		else {
			sort(arr, n - 1);	
			return insert(arr, n);
		}
	}
	
	static int[] insert(int[] arr, int n) {
		
		
			int last = arr[n];
			int i = n-1;
			while(i>= 0 && arr[i] > last) {
				arr[i+1] = arr[i--];
			}
			arr[i+1] = last; 
			return arr;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,0,8,5,3,7,2,4,9,6};
		
		for(int i : sort(arr, arr.length - 1)) System.out.println(i);
	}
}
