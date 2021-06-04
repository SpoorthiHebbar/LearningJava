package recursion;

public class RightAndDownPaths {

	public static void main(String[] args) {
		
		System.out.println(func(2,3));
	}
	
	static int func(int rows,int cols) {
		if(rows==1||cols==1)
			return 1;
		
		return func(rows,cols-1)+func(rows-1,cols);
	}

}
