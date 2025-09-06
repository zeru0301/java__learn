package object6;

public class Main {
	public static void main(String[] ages) {
		Animal[] animals  = {
				new Dog("ポチ", 4),
	            new Cat("ミケ", 2),
	            new Dog("ハチ", 5),
	            new Cat("タマ", 3)
			
		};
		
		for(Animal a : animals) {
			a.introduce();
			a.makeSound();
			a.run();
			a.eat();
			System.out.println("======================");
		}
	}

}
