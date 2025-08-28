package bigAndSnall;

import java.util.Scanner;

public class Conparison {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[3];
		

		System.out.println("bot:好きな整数を３つ入力してください>>");
		
		for(int i = 0;i < 3;i++ ) {	
			System.out.println("bot:"+ (i + 1) + "つ目>>");	
			nums[i] = scan.nextInt();
		}
		int max = Math.max(nums[0], nums[1]);
		int min = Math.min(nums[0], nums[1]);
		
		max = Math.max(max, nums[2]);
		min = Math.min(min, nums[2]);
		
		System.out.println("bot:"+ max + "が一番大きい数値です。");
		System.out.println("bot:"+ min + "が一番小さい数値です。");
		
		scan.close();
	}
	

}
