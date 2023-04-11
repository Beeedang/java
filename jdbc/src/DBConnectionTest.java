import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "playdata";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("데이터베이스 연결 성공");

        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
            e.printStackTrace();
        }
    }
}
