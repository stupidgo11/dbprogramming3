
package dbprogramming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB14 {

   
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "jame12345s";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database product name: " + meta.getDatabaseProductName());
            System.out.println("database product version: " + meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + meta.getDriverName());
            System.out.println("JCBC driver version: " + meta.getDriverVersion());
            System.out.println("JCBC driver major version: " + meta.getDriverMajorVersion());
            System.out.println("JCBC driver minor version: " + meta.getDriverMinorVersion());
            System.out.println("JCBC driver major version: " + meta.getDriverMajorVersion());
            System.out.println("Max number of connections: " + meta.getMaxConnections());
            System.out.println("MaxTableNameLength: " + meta.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable: " + meta.getMaxColumnsInTable());
            con.close();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
