package basicAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {12,1,45,13,8};
		Arrays.parallelSort(a);
		int key = 8;
		int key2 = 46;
		
		System.out.println(binSearch(a,0,a.length-1,key2));
		System.out.println(binSearch(a,0,a.length-1,key));

	}
	
	public static boolean binSearch(int[] a,int low,int high,int k) {
		int mid;
		while(low<=high) {
			mid = (low+high)/2;
			if(a[mid]==k)
				return true;
			else if(a[mid]<k){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}return false;
	}

}
