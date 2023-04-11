import java.sql.*;

public class MariaDBExample {
    private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "playdata";  // final을 썻으므로 초기화를 시켜줘야해서 값을 지정해줘야함?

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("DB 연결 성공");

            select(conn);
            insert(conn);
            update(conn);
            delete(conn);

        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }

    private static void delete(Connection conn) {
        String sql = "delete from mytable where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 1);
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 삭제했습니다.");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
            e.printStackTrace();
        }
    }

    private static void update(Connection conn) {
        String sql = "update mytable set name = ? where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "한종훈");
            stmt.setInt(2, 1);
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 수정했습니다.");
        } catch (SQLException e) {
            System.out.println("수정 실패");
            e.printStackTrace();
        }
    }

    private static void insert(Connection conn) {
        String sql = "insert into mytable (id, name) values(?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, 1);
            stmt.setString(2, "조시언");
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 삽입했습니다.");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
            e.printStackTrace();
        }
    }

    private static void select(Connection conn) {
        String sql = "select * from mytable";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id = " + id);
                System.out.println("name = " + name);
            }
        } catch (SQLException e) {
            System.out.println("조회 실패");
            e.printStackTrace();
        }
    }
}
