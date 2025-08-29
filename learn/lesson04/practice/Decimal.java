package practice;
//
//整数の配列が与えられたとき、要素の平均値を求めて小数点まで表示するプログラムを書きなさい。
//条件
//配列は int[] nums = {5, 8, 12, 20, 7}; とする
//
//平均値は 小数点あり（double）で計算すること

public class Decimal {
	public static void main(String[] args){
		int[] nums = {5,8,12,20,7};
		double ave = 0;
		
		for(int i :nums) {
			 ave += i; 
		}
		System.out.println("bot:この配列の平均は"+(ave / nums.length)+"です");
		
	}

}
