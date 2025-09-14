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

		AttendanceDAO dao = new AttendanceDAO();
		String name = dao.getUserNameById(id);

		if (name == null) {
		    System.out.println("bot: 社員IDが存在しません！");
		    return; // 処理中断
		}
		
		employee.setId(id);
		employee.setName(name);

		System.out.println("bot:こんにちは" + name + "さん、出勤ですか? y/n");

		// 入力に応じて出勤 or 退勤処理
		String atten = scan.nextLine();
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		if (atten.equals("y")) {
		    dao.insertAttendance(employee, timestamp);
		} else if (atten.equals("n")) {
		    dao.updateAttendance(employee, timestamp);
		}

	
	
	}
}
