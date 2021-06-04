package oops;

public class Constructors {

	public static void main(String[] args) {
		Dogs dog1 = new Dogs("Mooshka",2);
		Dogs dog2 = new Dogs("bubba",3);
		Dogs dog3 = new Dogs();
		
		dog1.bark();
		dog2.bark();
		dog3.bark();

	}

}

class Dogs{
	String name;
	int age;
	void bark() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	Dogs(String name,int age){
		this.name = name;
		this.age = age;
	}
	Dogs(){
		age = 4;
	}
}
