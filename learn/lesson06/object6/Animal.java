package object6;

public class Animal {
	String name;
	int age;
	
	Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
		void introduce() {
	        System.out.println("名前は" + name + "、年は" + age + "歳です。");
	    }

	    void makeSound() {
	        System.out.println("動物の鳴き声");
	    }

	    void run() {
	        System.out.println(name + "が走ります！");
	    }

	    void eat() {
	        System.out.println(name + "が食べます！");
		
	
	    }
}
