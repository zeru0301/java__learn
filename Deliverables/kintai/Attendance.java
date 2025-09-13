package kintai;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Attendance {
	public static void main(String[] ages) {
		Employee employee = new Employee();
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formated = time.format(formatter);

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bot:社員番号を入力してください>>");
		String id = scan.nextLine();
		employee.setId(id);
		
		System.out.println("bot:社員名を入力してください>>");
		String name = scan.nextLine();
		employee.setName(name);
		
		System.out.println("bot:打刻完了" + employee.getName() + "さん（" + employee.getId() + ") at"  + formated);
		scan.close();
		
	}


	
	

}
