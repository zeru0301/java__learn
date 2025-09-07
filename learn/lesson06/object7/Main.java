package object7;

import java.util.ArrayList;

public class Main {
	public static void main(String[] ages) {
		ArrayList<Animal> zoo = new ArrayList<>();
		
		zoo.add(new Dog("ポチ", 4));
		zoo.add(new Cat("ミケ", 2));
		zoo.add(new Dog("ハチ", 5));
		zoo.add(new Cat("タマ", 3));
		
		for(Animal a : zoo) {
	         a.introduce();
	         a.makeSound();
	         a.run();
	         a.eat();
	         System.out.println("--------------");
	        }

	        // 1匹削除（例：ミケを削除）
	        zoo.remove(1);

	        System.out.println("=== ミケがいなくなった後 ===");
	        for (Animal a : zoo) {
	            a.introduce();
			
		}
	}

}
