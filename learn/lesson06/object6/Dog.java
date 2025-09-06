package object6;

public class Dog extends Animal {
	Dog(String name, int age){
		super(name,age);
		
	}
	@Override
	void makeSound() {
		System.out.println(name + "：「ワン！」");
	}
	
	@Override
	void run() {
		System.out.println(name + "が静かに走ります！");
	}

}
