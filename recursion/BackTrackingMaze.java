package recursion;

public class BackTrackingMaze {

	public static void main(String[] args) {
		int a[][] = {{1,0,1,0,0,1},
					 {1,1,1,0,1,0},
					 {0,1,1,1,0,1},
					 {1,0,0,0,1,0}
				};
		int res = shortestPath(a,0,0,0,5);
		//int res = shortestPath(a,0,0,0,2);
		
		if(res>=100000) {
			System.out.println("No path");
		}
		else {
			System.out.println(res);
		}

	}
	static int shortestPath(int a[][],int i,int j,int x,int y) {
		int row = a.length;
		int col = a[0].length;
		boolean[][] vis = new boolean[row][col];
		return shortestPath(a,i,j,x,y,vis);
		
	}
	
	static boolean isValid(int a[][],int i,int j,boolean vis[][]) {
		int row = a.length;
		int col = a[0].length;
		return i>=0 && i<row && j>=0 && j<col && (!vis[i][j]) && a[i][j]==1;
	}
	
	static int shortestPath(int a[][],int i,int j,int x,int y,boolean vis[][]) {
		if(!isValid(a,i,j,vis)) return 100000;
		
		if(i==x && j==y) return 0;
		
		vis[i][j] = true;
		int left = shortestPath(a,i,j-1,x,y,vis)+1;
		int right = shortestPath(a,i,j+1,x,y,vis)+1;
		int top = shortestPath(a,i-1,j,x,y,vis)+1;
		int bottom = shortestPath(a,i+1,j,x,y,vis)+1;
		vis[i][j] = false;
		
		return Math.min(Math.min(left, bottom), Math.min(right, top));
	
	}
}