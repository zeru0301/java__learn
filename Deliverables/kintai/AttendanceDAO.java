package kintai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//出勤

public class AttendanceDAO {
	public void insertAttendance(Employee employee, String timestamp) {
	String sql ="INSERT INTO attendance (user_id, user_name, clock_in) VALUES(?,?,?)";

	try(Connection conn = DBConnector.getConection();
		PreparedStatement pstmt = conn.prepareStatement(sql)){
		
		pstmt.setString(1, employee.getId());
		pstmt.setString(2, employee.getName());
		pstmt.setString(3, timestamp);
		
		int rows = pstmt.executeUpdate();
		System.out.println("bot:DB保存に成功しました" +rows +"件");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
	
//	退勤
	public void updateAttendance(Employee employee, String timestamp) {

		String sql ="UPDATE attendance SET clock_out = ? WHERE user_id = ? AND clock_out IS NULL";

		try(Connection conn = DBConnector.getConection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, timestamp);
			pstmt.setString(2, employee.getId());
			
			
			int rows = pstmt.executeUpdate();
			System.out.println("bot:DB保存に成功しました" +rows +"件");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
}

	 // 社員番号から名前を取得
    public String getUserNameById(String userId) {
        String sql = "SELECT user_name FROM users WHERE user_id = ? ";
        String name = null;

        try (Connection conn = DBConnector.getConection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, userId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    name = rs.getString("user_name");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }
}

