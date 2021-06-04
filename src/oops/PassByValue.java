package oops;

public class PassByValue {

	public static void main(String[] args) {
		int c=10,d=93;
		swap(c,d);
		System.out.println(c+" "+d);
		
		Dog dog1 = new Dog();
		dog1.age = 2;
		dog1.bark();
		Dog dog2 = new Dog();
		dog2.age = 4;
		dog2.bark();
		
		swap(dog1,dog2);
		
		dog1.bark();
		dog2.bark();
		
		changeAge(dog1);
		dog1.bark();
		
		String str = new String();
		str = "hello";
		
		changeString(str);
		
		System.out.println(str);

	}
	static void changeString(String s) {
		s+= " world ";
	}
	
	static void changeAge(Dog a) {
		a.age+=3;
	}
	
	static void swap(int a,int b) {
		int temp= a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);}
		
	static void swap(Dog a,Dog b) {
		Dog temp= a;
		a=b;
		b=temp;
	}
		

}

class Dog{
	int age;
	void bark() {
		System.out.println("age:"+age);
	}
}
