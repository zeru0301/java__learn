package object7;

public class Dog extends Animal{
	Dog(String name, int age){
		super(name, age);
		
	}
	@Override
	void makeSound() {
		System.out.println("ワン");
	}
	

}
