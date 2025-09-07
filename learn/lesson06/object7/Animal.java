package object7;

public class Animal {
	String name;
	int    age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("名前は"+ name + "で年は" + age + "歳です");
		
	}
	void makeSound() {
		System.out.println();
	}
	
	void run() {
		System.out.println(name + "が走っています");
	}
	
	void eat() {
		System.out.println(name + "が食べています");
		
	}

}
