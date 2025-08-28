package practice;

import java.util.Scanner;

public class OddEvenChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bot:好きな整数を入力してください>>");
		
		int number = scan.nextInt();
		
		if(number % 2 == 0){
			System.out.println("bot:" +number + "は偶数です");
			
		}else {
			System.out.println("bot:" + number + "は奇数です");
		
		}
		scan.close();
		
	}

}
