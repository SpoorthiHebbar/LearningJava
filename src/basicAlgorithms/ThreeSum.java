package basicAlgorithms;
import java.util.*;

public class ThreeSum {
	
	    public static List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-2;i++){
	        	ArrayList<Integer> x = twosum(nums,i+1,nums[i]);
	            if(x!=null) {
	            	res.add(x);
	            }
	        }
	        return res;
	    }
	                    
	    public static ArrayList<Integer> twosum(int[] a,int i,int x){
	        
	        int j=a.length-1;
	        while(i<j){
	            if(a[i]+a[j]==-x){
	            	ArrayList<Integer> val = new ArrayList<Integer>();
	            	val.add(a[i]);
	            	val.add(a[j]);
	            	val.add(x);
	            	return val;
	            }
	            else if(a[i]+a[j]<-x){
	                i++;
	            }
	            else
	            	j--;
	        }
	        return null;
	    }

	public static void main(String[] args) {
		int a[] = {9,7,5,3,-7,-5,6,1};
		List<List<Integer>> ans = threeSum(a);
		System.out.println(ans);
	}

}
