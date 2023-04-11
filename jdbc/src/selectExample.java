import java.sql.*;

public class selectExample {

    public static void main(String[] args) {
        final String url = "jdbc:mariadb://localhost:3306/mydatabase";
        final String user = "root";
        final String pwd = "playdata";

        String sql = "select * from mytable";

        try (
                Connection conn = DriverManager.getConnection(url, user, pwd);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {
            // resultSet.next() -> 데이터베이스의 결과값(Result set)에서
            // 다음 값으로 커서를 움직인다. 값이 있으면 true 변환
            // EOF(End of File)에 도달하면 false 변환
            while (resultSet.next()) {
                //resultSet.getInt("컬럼명") --> 해당 컬럼에서 정수 데이터를 가져온다.
                int id = resultSet.getInt("id");

                // resultSet.getString("컬럼명") --> 해당 컬럼에서 문자열 데이터를 가져온다.
                String name = resultSet.getString("name");
                System.out.println("id = " + id + ", name = " + name);
            }
        } catch (SQLException e) {
            System.out.println("데이터베이스로부터 데이터를 가져오는데 실패했습니다." + e.getMessage());
        }
    }
}
