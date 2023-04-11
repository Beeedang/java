import java.sql.*;
import java.util.Scanner;

public class InsertIntoExample {
    public static void main(String[] args) {
        final String url = "jdbc:mariadb://localhost:3306/mydatabase";
        final String user = "root";
        final String pwd = "playdata";

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String s = scanner.nextLine();
        String sql = "insert into mytable (id, name) value (6,'한종훈'), (6,'한종훈'), (6,'한종훈')";

        try (
                Connection conn = DriverManager.getConnection(url, user, pwd);
                Statement statement = conn.createStatement();
        ) {
            int resultCount = statement.executeUpdate(sql);
            System.out.println(resultCount + "개의 행이 삽입되었습니다.");
        } catch (SQLException e) {
            System.out.println("데이터베이스로부터 데이터를 가져오는데 실패했습니다." + e.getMessage());
        }
    }
}
