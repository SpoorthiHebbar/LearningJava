package Mock;
import java.util.*;

public class MockPlacements {

	public static void main(String[] args) {
		int[] arr = {12,9,5,0,-4,-1};
		int n= arr.length,sum;
//		int count=0;
		
		for(int i=0;i<n;i++) {
			sum = 0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
				if(sum==0) {
//					count++;
					System.out.println("true");
					System.out.println(i+" "+j);
					 return;
					
					}
			}
		}System.out.println("False");
	}

}
