package kintai;

import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {
	public static void appendAttendance(Employee employee, String status,String timestamp) {
		String filePath = " attendance.csv";
		try(FileWriter writer = new FileWriter(filePath, true)){
			writer.write(employee.getId() + "," + employee.getName() + "," + status + "," + timestamp + "\n");
			System.out.println("bot: CSVに出力しました..." + filePath);
			
		}catch(IOException e) {
			e.printStackTrace();
			
			
		}
	}
	

}
