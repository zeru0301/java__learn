package objectBasic.mosya;

//模写
public class Main {
	public static void main(String[] args) {
		
	Student[] students =  {
			
		new Student("Alise", 85),
		new Student("Bob", 92),
		new Student("Caroi",78)
		
	};
	
	double sum = 0;
	int max = Integer.MIN_VALUE;// 最大値探し用 → 最小からスタート
	int min = Integer.MAX_VALUE;// 最小値探し用 → 最大からスタート
	
	
	for(Student s : students) {
		s.printInfo();
		sum += s.getScore();
		if(s.getScore() > max) max = s.getScore();
		if(s.getScore() < min) min = s.getScore();
		
	}
	
	double average = sum / students.length;
	
	System.out.printf("平均点 %.2f\n",average);
	System.out.println("最高点" + max);
	System.out.println("最低点" + min);
	
	

 }
}
