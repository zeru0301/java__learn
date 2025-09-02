package averageOccupancyRate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		サービス提供時間
		double serviceProvision = 0;
		
//		週の稼働日数
		double serviceDay = 0;
		
//		許容停止時間
		double stopTime = 0;
		
//		許容故障回数
		double stopCount = 0;
		
//	　　　　総サービス時間
		double totalTime = 0;
		
//		稼働時間
		double workingTime = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("bot:週のサービス提供時間を入力してください(小数可)>>");
		serviceProvision = s.nextDouble();
		
		System.out.println("bot:週何日稼働しますか？（1～7　小数可）>>");
		serviceDay = s.nextDouble();
		
		System.out.println("bot:週の許容停止時間を入力してください（小数可）>>");
		stopTime = s.nextDouble();
		
		System.out.println("bot:週の許容停止回数を入力してください（小数可）>>");
		stopCount = s.nextDouble();
		
		totalTime = serviceProvision * serviceDay;
		
		workingTime = totalTime - stopTime;
		
		double MTBF = workingTime / stopCount;
		double MTTR = stopTime / stopCount ;
		
		
		System.out.println("bot:" + MTBF / (MTBF+ MTTR) + "です。");
		s.close();
	}

}
