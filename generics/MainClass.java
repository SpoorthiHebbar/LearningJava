package generics;

public class MainClass {

	public static void main(String[] args) {
		Generics<String,Integer> obj1 = new Generics("hello",43);
		Generics<String,String> obj2 = new Generics("hello","heyy");
		
		obj1.getDescription();
		obj2.getDescription();

	}

}
