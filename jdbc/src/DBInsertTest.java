import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsertTest {
    String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    String USER = "root";
    String PASSWORD = "playdata";
    static String sql = "insert into employees (emp_no, birth_date, first_name, gender, hire_date) values(?,?,?,?,?,?)";

    private static void insert(Connection conn) {
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 1);
            stmt.setString(2, "조시언");
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 삽입했습니다.");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
            e.printStackTrace();
        }
    }
}
