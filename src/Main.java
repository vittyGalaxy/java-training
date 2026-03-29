import java.sql.SQLException;
import section18.JDBCClass;

public class Main {
    public static void main(String[] args) {
        JDBCClass j = new JDBCClass();

        try {
            System.out.println(j.getConnection().isClosed());
            System.out.println("------------------------");
            j.exampleSelect();
            j.exampleSelect2();
            j.exampleInsert("Luca", "Bianchi", "lucabianchi@gmail.com", "9999999");
            j.exampleUpdate();
            j.exampleDelete();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}