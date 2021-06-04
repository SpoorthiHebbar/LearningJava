package recursion;

import java.util.ArrayList;

public class TwoEqualSubArrays {

	public static void main(String[] args) {
		int a[] = {1,7,8,5,3,2};
		int sum=0;
		for(int x: a) {
			sum+=x;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		if(sum%2 == 0 && partitions(a,sum/2,0,arr)) {
			System.out.println(arr);
		}else {
			System.out.println("Not possible");
		}

	}
	
	private static boolean partitions(int[] a, int sum, int i, ArrayList<Integer> arr) {
		if(sum<0 || i>=a.length)
		return false;
		if(sum==0) return true;
		
		arr.add(a[i]);
		boolean left = partitions(a,sum-a[i],i+1,arr);
		
		if(left) return true;
		arr.remove(arr.size()-1);
		
		return partitions(a,sum,i+1,arr);	
	}


}
