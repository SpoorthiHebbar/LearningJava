package recursion;

public class Floodfill {

	public static void main(String[] args) {
		int[][] a = {{1,0,0,1},
				     {1,2,0,1},
				     {1,2,0,2},
				     {2,2,2,2}};
		
		floodfill(a,2,2,3,0);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
					
	}
	static void floodfill(int[][] a, int r,int c,int fill,int prev) {
		int row = a.length;
		int col = a[0].length;
		
		if(r<0||c<0||r>=row||c>=col) {
			return;
		}
		if(a[r][c]!=prev)
			return;
		
		a[r][c]= fill;
		
		floodfill(a,r-1,c,fill,prev);
		floodfill(a,r,c+1,fill,prev);
		floodfill(a,r+1,c,fill,prev);
		floodfill(a,r,c-1,fill,prev);
	}

}
