package btap14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mondai22")
public class mondai22 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response
    		) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            Class.forName("");

            conn = DriverManager.getConnection("");

            String sql = "SELECT * FROM STUDENT";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>STUDENT TABLE</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>STUDENT TABLE</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>学生番号</th><th>学生名</th><th>コース番号</th></tr>");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("学生番号") + "</td>");
                out.println("<td>" + rs.getString("学生名") + "</td>");
                out.println("<td>" + rs.getString("コース番号") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}