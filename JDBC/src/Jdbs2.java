import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbs2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		
			String qr="delete from student where roll=101";
			
			Statement st=con.createStatement();
			
			int i=st.executeUpdate(qr);
			System.out.println(i+" deleted");
			
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
