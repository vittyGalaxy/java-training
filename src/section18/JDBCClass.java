package section18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
            System.out.println("telephone = " + rs.getString(5));
            System.out.println("--------------------------------------");
        }
    }

    public void exampleInsert(String name, String surname, String email, String telephone) throws SQLException{
        String sql = "INSERT INTO client(name, surname, email, telephone) " + "VALUES('"+name+"', '"+surname +"', '"+email+"', '"+telephone+"')";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();

        System.out.println("the id is " + rs.getInt(1));
    }

    public void exampleUpdate() throws SQLException {
        String sql = "UPDATE client SET telephone = '1234567' WHERE idclient = 3";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
    }
    
    public void exampleDelete() throws SQLException {
        String sql = "DELETE FROM client WHERE idclient = 5";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
    }

    public void exampleSelect3(String surname) throws SQLException {
        String sql = "SELECT idclient, name, surname, email, telephone FROM client WHERE surname LIKE ?";
        PreparedStatement ps = getConnection().prepareStatement(sql);
        ps.setString(1, surname);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("idclient = " + rs.getInt(1));
            System.out.println("name = " + rs.getString(2));
            System.out.println("surname = " + rs.getString(3));
            System.out.println("email = " + rs.getString(4));
            System.out.println("telephone = " + rs.getString(5));
            System.out.println("--------------------------------------");
        }
    }
}
