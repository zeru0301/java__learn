
//整数の配列 nums が与えられたとき、
//クイックソートで配列を昇順に並べる
//並べ替えた配列の 中央値 を求める（要素の個数が偶数の場合は中央2つの平均）
//クイックソートでおこなうこと
//模写
package count;

public class SortNumber {
	public static void main(String[] args) {
	int[] nums = {3,4,7,14,10,5,8};
	
		QuickSort.sort(nums);
		
		System.out.print("昇順:");
		for(int n : nums) {
			System.out.print(n + " ");
			
		}System.out.println();
		
	
		// 中央値の計算
		double median;
		int mid = nums.length / 2;
		if(nums.length % 2 ==0) {
			median = (nums[mid - 1] + nums[mid]) / 2.0;
			
		}else{
			median = nums[mid];
			
		}
		System.out.println("中央値：" + median);
		
	}

}
