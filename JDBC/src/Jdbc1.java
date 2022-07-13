import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			System.out.println("connection established");
			
			String qr="insert into student values(102,'veer')";
			System.out.println("write a query");
			
			Statement st=con.createStatement();
			System.out.println("make a statement object");
			
			int i=st.executeUpdate(qr);
			System.out.println(i+" record added");
			
			con.close();
			System.out.println("close the connection");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
