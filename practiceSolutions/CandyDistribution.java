package practiceSolutions;

public class CandyDistribution {

	public static void main(String[] args) {
		
		
		int a[]= {4,6,4,5,4,3,6,8}; 
		int n = a.length;
		int count[]= new int[n];
		
		for(int i=0;i<n;i++)
			count[i]=1;
		//Arrays.fill(count,1);
		
		for(int i=0;i<n-1;i++) {
			if(a[i+1]>a[i])
				count[i+1]=count[i]+1;
		}for(int i=n-1;i>0;i--) {
			if(a[i-1]>a[i])
				count[i-1]=Math.max(count[i]+1,count[i]);
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=count[i];
		}
		System.out.println(sum);

	}

}
