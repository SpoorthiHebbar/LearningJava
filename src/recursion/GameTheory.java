package recursion;

public class GameTheory {

	public static void main(String[] args) {
		int a[] = {1,5,7,3,2,4};
		int res = MaxCoin(a,0,a.length-1);
		System.out.println(res);

	}
	
	public static int MaxCoin(int[] a,int l,int r) {
		if(l+1==r)
			return Math.max(a[l], a[r]);
		
		return Math.max(a[l] + Math.min(MaxCoin(a,l+2,r),MaxCoin(a,l+1,r-1)), 
						a[r] + Math.min(MaxCoin(a,l+1,r-1), MaxCoin(a,l,r-2)));
	}
}
