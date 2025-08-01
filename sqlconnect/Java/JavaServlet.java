import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JavaServlet extends HttpServlet {
    protected void doPost( HttpServletRequest request,HttpServletResponse response)
    throws ServletException , IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        // 応答の文字コードとContent-Type設定（日本語対応）
        response.setContentType("text/html; charset=UTF-8");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zeru_db?useSSL=false&serverTimezone=Asia/Tokyo","user","pass")) {

                String checksql = "SELECT COUNT(*) FROM users WHERE name = ?";
                try (PreparedStatement checkStemt = conn.prepareStatement(checksql)){

                    checkStemt.setString(1, username);
                    ResultSet rs = checkStemt.executeQuery();

                     if (rs.next() && rs.getInt(1) > 0) {

                    response.getWriter().println("そのユーザー名はすでに使われています。");
                    return;
                    
                }


                }

                 String insertsql = "INSERT INTO users(name, password) VALUES(?, ?)";
                    try(PreparedStatement insertStmt = conn.prepareStatement(insertsql)) {

                        insertStmt.setString(1,username);
                        insertStmt.setString(2,password);
                        int count = insertStmt.executeUpdate();


                    if(count > 0) {
                        response.getWriter().println("接続に成功しました");
                    }else {
                        response.getWriter().println("接続に失敗しました");
                    }

                }
 
                
        }
        } catch (Exception event) {
            event.printStackTrace();
            response.getWriter().println("エラー" + event.getMessage());

      }
    }

}