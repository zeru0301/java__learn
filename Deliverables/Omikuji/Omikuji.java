import java.util.Random;
import java.util.Scanner;

public class Omikuji {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		int random;
		System.out.println("bot:ようこそ占いの館へ");
//		名前の取得
		System.out.println("bot:あなたの名前を入力してください>>");
		name = scan.nextLine();
		
//		年齢の取得
		System.out.println("bot:あなたの年齢を入力してください>>");
		age = scan.nextInt();
		
		random = new Random().nextInt(4) + 1;
		System.out.println("bot:占い結果が出ました");
		System.out.println("bot:" + age + "歳" + name + "さんの運気番号は"  + random + "です。");
		System.out.println("bot:1[大吉]　2[中吉]　3[吉]　4[凶]");
		
		scan.close();
		
	}

}
