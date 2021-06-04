package oops.inheritence;

public class Teacher extends Person {
	public void teach() {
		System.out.println(name + "is teaching");
	}
	public void walk() {
		System.out.println("teacher "+ name + "is walking");
	}
}
 
class Singer extends Person{
	public void sing() {
	
		System.out.println( "is singing");
	}
}