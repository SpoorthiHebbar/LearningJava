package practiceSolutions;

import java.util.Arrays;

public class SortAndMerge {

	public static void main(String[] args) {
		int[] a = {12,1,45,23};
		int[] b = {1,3,56,22};
		int[] rl = new int[a.length+b.length];
		
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		
		sortAndMerge(a,b,rl);
		
		
		for(int i=0;i<rl.length;i++) {
			System.out.print(rl[i]+" ");
		}

	}
	
	public static void sortAndMerge(int[] a,int[] b,int[] res) {
		int m=a.length;
		int n=b.length;
		int i=0,j=0,k=0;
		
		while(i<m&&j<n) {
			if(a[i]<b[j]) {
				res[k]=a[i];
				i++;
				k++;
			}
			else {
				res[k]=b[j];
				j++;
				k++;
			}
		}while(i<m) {
			res[k]=a[i];
			i++;
			k++;
		}while(j<n) {
			res[k]=b[j];
			j++;
			k++;
		}
	}

}
