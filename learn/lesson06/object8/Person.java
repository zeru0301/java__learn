package object8;

public class Person{
	private String name;
	private int    age;
	
	public Person(String name ,int age) {
		this.name = name;
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("年齢は0以上にしてください");
			return;
			
		}
		this.age = age;
	}
	
	

}
