package differenceInSize;

//整数の配列 nums が与えられたとき、
//配列内の「最小値」と「最大値」の差」を求めるプログラムを書け。
//nums = [3, 7, 2, 9, 5]

public class SizeBS {
		public static void main(String[] args) {
//			定義
			int[] nums = {3,7,2,9,5};
			int max = nums[0];
			int min = nums[0];
					
//			最大値・最小値を特定選択　　線形探索
			for(int i : nums) {
				  max = Math.max(max, i);
				  min = Math.min(min, i);
			}
		
			System.out.println("bot:この配列の最大値と最小値の差は" + (max - min) + "です" );
			
			
		}
}
