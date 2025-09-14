package kintai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static final String URL = "jdbc:mysql://localhost:3306/kintai?serverTimezone=UTC";
	private static final String USER = "userName";
	private static final String PASSWORD = "password";
	
	public static Connection getConection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
}
