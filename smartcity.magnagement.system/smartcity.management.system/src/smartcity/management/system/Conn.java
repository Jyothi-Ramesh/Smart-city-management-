package smartcity.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver");
          c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","ishika1310");
          s = c.createStatement();
        }catch(Exception e){
          e.printStackTrace();
        }
    }
        
        
}
