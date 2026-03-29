package section18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JDBCClass {
    private Connection con;

    public Connection getConnection() throws SQLException {
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

    public void exampleSelect() throws SQLException {
        String sql = "SELECT idclient, name, surname, email, telephone FROM client";
        PreparedStatement ps = getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("idclient = " + rs.getInt(1));
            System.out.println("name = " + rs.getString(2));
            System.out.println("surname = " + rs.getString(3));
            System.out.println("email = " + rs.getString(4));
            System.out.println("letephone = " + rs.getString(5));
            System.out.println("--------------------------------------");
        }
    }

    public void exampleSelect2() throws SQLException {
        String sql = "SELECT idclient, name, surname, email, telephone FROM client WHERE surname LIKE '%Ro%'";
        PreparedStatement ps = getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("idclient = " + rs.getInt(1));
            System.out.println("name = " + rs.getString(2));
            System.out.println("surname = " + rs.getString(3));
            System.out.println("email = " + rs.getString(4));
            System.out.println("letephone = " + rs.getString(5));
            System.out.println("--------------------------------------");
        }
    }
}
