import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        response.setContentType("text/html; charset=UTF-8");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=Asia/Tokyo&allowPublicKeyRetrieval=true",
                    "user", "pass")) {

                String sql = "SELECT * FROM users WHERE name = ? AND password = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, username);
                    stmt.setString(2, password);
                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        response.getWriter().println("ログイン成功");
                    } else {
                        response.getWriter().println("ログイン失敗");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("エラー: " + e.getMessage());
        }
    }
}
// コンパイル　javac -encoding UTF-8 -classpath "C:\Users\qa114\Desktop\apache-tomcat-9.0.107\lib\servlet-api.jar" -d WEB-INF\classes Java\LoginServlet.java