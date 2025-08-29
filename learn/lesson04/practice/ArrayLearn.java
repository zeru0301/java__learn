package practice;
//整数の配列が与えられたとき、「偶数の合計」と「奇数の合計」 を求めて出力するプログラムを書きなさい。
//int[] nums = {3, 7, 2, 9, 5, 8};
public class ArrayLearn {
	public static void main(String[] args) {
		
		int[] nums = {3, 7, 2, 9, 5, 8};
		int odd  = 0;
		int even = 0;
		
		for(int i : nums){
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
			
		}
		System.out.println("bot:奇数の合計は"+ odd +"で偶数の合計は" + even +"です。");
		
	}
		

}
