import java.sql.*;

public class DBUpdateTest {
    public static void main(String[] args) {
        String URL = "jdbc:mariadb://localhost:3306/mydatabase";
        String USER = "root";
        String PASSWORD = "playdata";

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)){
            update(conn, new String[]{"update employees set first_name = 'Jane' where emp_no = 10006"});
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void update(Connection conn, String[] sqls){
        int rowCount = 0;
        for(String sql : sqls){
            try(PreparedStatement stmt = conn.prepareStatement(sql)) {
                rowCount += stmt.executeUpdate();
            }catch (SQLException e){
                System.out.println("실패 : " + sql);
                e.printStackTrace();
            }
        }
        System.out.println(rowCount + "개의 행을 업데이트했습니다.");
    }
}

