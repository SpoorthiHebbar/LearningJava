package basicAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {23,77,13,0,1};
		
		mergeSort(arr,0,4);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}
	
	public static void mergeSort(int[] a,int beg,int end) {
		
		if(beg<end) {
		int mid = (beg+end)/2;
		mergeSort(a,beg,mid);
		mergeSort(a,mid+1,end);
		merge(a,beg,mid,end);
		}
	}
	
	public static void merge(int[] a,int beg,int mid,int end) {
		int left,right,k=beg;
		
		left=mid-beg+1;
		right=end-mid;
		int[] leftArray = new int[left];
		int[] rightArray = new int[right];
		
		for(int i=0;i<left;i++)
			leftArray[i]=a[beg+i];
		for(int i=0;i<right;i++)
			rightArray[i]=a[mid+1+i];
		
		int i=0,j=0;
		
		while(i<left && j<right) {
			if(leftArray[i]<=rightArray[j]) {
				a[k]=leftArray[i];
				i++;
			}
			else {
				a[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<left) {
			a[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<right) {
			a[k]=rightArray[j];
			j++;
			k++;
		}
	}

}
