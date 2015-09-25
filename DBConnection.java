
package studentRecords;

/**
 *
 * @author Ryan Crossan
 */
import java.sql.*;

final class DBConnection {

  
    static Connection getSimpleConnection() {
       
        String DB_CONN_STRING = "jdbc:mysql://localhost:3306/registrar";
       
        String DRIVER_CLASS_NAME = "org.gjt.mm.mysql.Driver";
        String USER_NAME = "abt1s";
        String PASSWORD = "abt1s";

        Connection result = null;
        try {
            Class.forName(DRIVER_CLASS_NAME).newInstance();
        } catch (Exception ex) {
            log("Check classpath. Unable to load db driver: " + DRIVER_CLASS_NAME);
        }

        try {
            result = DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            log("Driver loaded, however unable to connect to db: " + DB_CONN_STRING);
        }
        return result;
    }

    private static void log(Object aObject) {
        System.out.println(aObject);
    }
}
