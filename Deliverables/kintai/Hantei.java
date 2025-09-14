package kintai;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hantei {
	public void inputAttendance(Employee employee) {
		
	LocalDateTime time = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formated = time.format(formatter);
	Scanner  scan = new Scanner(System.in);
	
	System.out.println("bot:こんにちは"+ employee.getName() + "さん、出勤ですか?y/n");
	String atten = scan.nextLine();
	if(atten.equals("y")) {
		
		System.out.println("bot:出勤打刻完了" + employee.getName() + "さん（" + employee.getId() + ") at"  + formated);
		
	}else if(atten.equals("n")) {
		
		System.out.println("bot:退勤打刻完了" + employee.getName() + "さん（" + employee.getId() + ") at"  + formated);
	
	}else {
		 System.out.println("bot:正しい情報を入力してください >> y または n");
		 inputAttendance(employee);
		 
	}
	scan.close();

}
}
