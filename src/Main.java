import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Main {
    private Connection con;

    public static void main(String[] args) {
        Main m = new Main();

        try {
            System.out.println(m.getConnection().isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        if (con == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("esercizi");
            dataSource.setPort(3306);
            dataSource.setServerName("127.0.0.1");
            dataSource.setUser("dev");
            dataSource.setPassword("devpass");

            con = dataSource.getConnection();
        }

        return con;
    }
}