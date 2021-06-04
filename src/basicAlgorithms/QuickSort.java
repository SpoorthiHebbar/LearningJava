package basicAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {13,2,1,44,11,5,7};
		
		quickSort(arr,0,6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void quickSort(int[] arr,int beg ,int end) {
		int loc;
		if(beg<end) {
		loc = partition(arr,beg,end);
		quickSort(arr,beg,loc);
		quickSort(arr,loc+1,end);
	}
	}
	
	public static int partition(int[] a,int beg,int end) {
		int left,loc,right,flag,temp;
		left=loc=beg;
		right = end;
		flag=0;
		while(flag!=1) {
			while(a[loc]<=a[right] && loc!=right) {
				right--;
			}if(loc==right) flag=1;
			if(a[loc]>a[right]) {
				temp = a[loc];
				a[loc]=a[right];
				a[right]=temp;
				loc=right;
			}
			
			if(flag!=1) {
				while(a[loc]>=a[left] && loc!=left) {
					left++;
				}if(loc==left) flag=1;
				if(a[loc]<a[left]) {
					temp = a[loc];
					a[loc]=a[left];
					a[left]=temp;
					loc=left;
				}
			}
		}
		return loc;
	}
}
