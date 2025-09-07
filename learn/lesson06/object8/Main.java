package object8;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {
	public static void main(String[] ages) {
//		Person.p = new Person();
//		p.setName("太郎");
//		p.setAge(20);
//		System.out.println("名前は" + p.getName() + "、年は"+ p.getAge() +"歳です");
		ArrayList<Person> hito = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		

        System.out.print("名前を入力してください: ");
        String name = scan.nextLine();

        System.out.print("年齢を入力してください: ");
        int age = Integer.parseInt(scan.nextLine());
		
        scan.close();
        
        hito.add(new Person(name,age));
		hito.add(new Person("太郎", 20));
		hito.add(new Person("花子",18));
		hito.add(new Person("次郎", 25));
		
		for(Person p :  hito) {
		System.out.println("名前は" + p.getName() + "、年は"+ p.getAge() +"歳です");
		
	}
  }
		

}
