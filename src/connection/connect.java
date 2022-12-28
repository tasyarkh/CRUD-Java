package connection;

//import package
import java.sql.*;
import javax.swing.JOptionPane; 

public class connect {
    Connection con;
    
    public static Connection connecting() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lsp_resto", "root", "");
            System.out.println("connecting succses");
            
            return con;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
