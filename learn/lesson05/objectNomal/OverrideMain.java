package objectNomal;

class Animal {
	
	public void speak() {
		System.out.println("");
		
	}
}
 class Dog extends Animal{
		@Override
		public void speak() {
			System.out.println("ワン");
		
	}
}


class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("ニャー");
	}
	
}

public class OverrideMain {
	public static void main(String[] args) {
		Animal d = new Dog();
		 Animal c = new Cat();
		 
		 d.speak();
		 c.speak();
		
	}
}
		



