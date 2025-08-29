package objectBasic;

//条件
//Student クラス を作る
//フィールド：name（String）、score（int）
//メソッド：printInfo() → 「名前と点数を出力する」
//Main クラス を作って、3人の学生を作成する
//例：
//Alice: 85
//Bob: 92
//Carol: 78
//配列に入れてループで printInfo() を呼び出す

public class Student {
	String name;
	int score;
	
	
//	点数を出力
	public void printInfo() {
		System.out.println("名前" + name + "点数" + score);
	
	}

	
//	チャレンジ　
//	先ほどの Student クラスを使う
//	配列に複数の Student を入れる（名前と点数）
//	ループを使って 平均点・最高点・最低点 を計算する
//	結果を出力する
	
	public static void main(String[] args) { 
		
		double ave = 0;
		Student s1 = new Student();
		s1.name = "Alise";
		s1.score = 85;
	
		Student s2 = new Student();
		s2.name = "Bob";
		s2.score = 92;
		
		Student s3 = new Student();
		s3.name = "Caroi";
		s3.score = 85;
		
		Student[] studnts = {s1,s2,s3};
		for(Student s :studnts) {
			s.printInfo();
		}
		
		for(Student n :studnts) {
			ave = ave + n.score;
				
		}
		 	ave = ave / studnts.length;
		 	 	
		int max = Math.max(s1.score, s2.score);
		    max = Math.max(max, s3.score);
	 
		int min = Math.min(s1.score, s2.score);
		    min = Math.min(min, s3.score);
//		    										小数点第２まで出力
		    System.out.println("平均点" + "点数" + String.format("%.2f", ave));
			System.out.println("最高点" + "点数" + max);
			System.out.println("最低点" + "点数" + min);
		    
	}
	
}
