
package dbprogramming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB10 {

    
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "jame12345s";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement= con.createStatement();
            String sql = "update student set email = 'nattahphol.nira@mail.kmutt.ac.th' where studentID = '651105'";
            
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
