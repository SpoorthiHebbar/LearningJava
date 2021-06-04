package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoEqualSumSubArrays {

	public static void main(String[] args) {
		int a[] = {2,1,2,3,4,10};
		
		int sum=0;
		for(int i : a) {
			sum+=i;
		}
		if((sum&1)==1) {
			System.out.println("not possible");
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		int req = sum/2;
		int cur = 0;
		int i=0,j=a.length-1;
		
		while(i<j) {
			cur=a[i]+a[j];
			arr.add(a[i]);
			arr.add(a[j]);
			if(cur>req)
				{System.out.println("not possible");
				break;
				}
			else {
				
				if(cur==req)
					{System.out.println(arr);
					 System.out.println("found");
				     return;}
				else {
					i++;
					cur+=a[i];
					arr.add(a[i]);
				}
			}
		}

	}

}
