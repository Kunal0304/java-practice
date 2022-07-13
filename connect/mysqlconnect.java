package connect;
// import java.sql.*;

public class mysqlconnect {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception :"+ e.getMessage());
            e.printStackTrace();
        }
    }
    
}
