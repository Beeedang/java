import java.sql.*;

public class DBSelectTest {
    public static void main(String[] args) {
        String URL = "jdbc:mariadb://localhost:3306/mydatabase";
        String USER = "root";
        String PASSWORD = "playdata";
        String sql = "SELECT first_name, last_name, hire_date FROM employees";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String hireDate = rs.getString("hire_date");
                System.out.println(firstName + "" + lastName + "" + hireDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
