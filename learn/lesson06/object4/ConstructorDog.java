package object4;

public class ConstructorDog {
	String name;
	int age;
	
	ConstructorDog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void bark(int time) {
		for(int i = 0; i < time; i++) {
			System.out.print("ワン ");
		}
		System.out.println("");
	}
	
	void introduce() {
		System.out.println("名前は" + name +",年は" + age + "歳です");
	}

}