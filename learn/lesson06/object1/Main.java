package object1;

public class Main {

public static void main(String[] args) {
	Dog dog = new Dog();
	dog.name ="ポチ";
	dog.age = 4;
	 dog.bark();
	System.out.println("名前は" + dog.name + "年は" + dog.age + "歳で"  +dog.bark()+ "となきます！");
		
	}

}
