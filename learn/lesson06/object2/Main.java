package object2;

public class Main {
	public static void main(String[] arge) {
		Doghikisu dog = new Doghikisu();
		dog.name = "メリ";
		dog.age =3;
		
		 System.out.println("名前は" + dog.name + "、年は" + dog.age + "歳です。");
		 dog.bark(3);
	}

}
