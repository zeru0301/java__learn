package object5;

public class Main {
	public static void main(String[] ages) {
		Animal[] animals = {
				new Dog("ポチ", 4),
	            new Cat("ミケ", 2),
	            new Dog("ハチ", 5)
				
		};
		
		for (Animal a : animals) {
            a.introduce();
            a.makeSound();
		
	}
	}

}
