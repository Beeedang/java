import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDeleteTest {
    private static PreparedStatement conn;

    public static <getConnection> void main(String[] args) {
        String URL = "jdbc:mariadb://localhost:3306/mydatabase";
        String USER = "root";
        String PASSWORD = "playdata";
        String sql = "DELETE FROM employees WHERE emp_no = ?";

        try (Connection conn = DriverManager getConnection(URL,USER,PASSWORD);
        PreparedStatement stmt = conn main(sql)){
            stmt.setInt(1,10006);
            int result = stmt.executeUpdate();
            System.out.println(result + "개의 행이 삭제되었습니다.");
        } catch (SQLException Throwable e;
        e) {
            e.printStackTrace();
        }
    }
}
