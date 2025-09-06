package object6;

public class Cat extends Animal {
	Cat(String name, int age){
		super(name,age);
		
	}
	@Override
	void makeSound() {
		System.out.println(name + "：「ニャー！」");
	}
	
	@Override
	void run() {
		System.out.println(name + "が静かに走ります！");
	}

}
