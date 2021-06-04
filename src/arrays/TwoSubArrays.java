package arrays;
import java.util.*;

public class TwoSubArrays {

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();
		int a[] = {2,1,2,3};
		int sum = 0;
		for(int x : a) {
			sum += x;
		}
		if(sum%2 == 0  && PartitionArr(a,sum/2,0,ans)) {
			System.out.println(ans);
		}
		else {
			System.out.println("Not Possible");
		}

	}
	
	static boolean PartitionArr(int a[],int sum, int i, ArrayList<Integer> ans) {
		if(i>=a.length || sum<0)
			return false;
		if(sum==0) return true;
		
		ans.add(a[i]);
		boolean left = PartitionArr(a,sum-a[i],i+1,ans);
		if(left) {
			return true;
		}
		ans.remove(ans.size()-1);
		return PartitionArr(a,sum,i+1,ans);
	}

}
