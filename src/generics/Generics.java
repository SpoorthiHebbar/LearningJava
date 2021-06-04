package generics;

public class Generics<X,Y> {

		
		X x;
		Y y;
		
		public Generics(X x,Y y){
			this.x = x;
			this.y = y;
		}
		public void getDescription() {
			System.out.println(x+" and "+y);
		}

}

