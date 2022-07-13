import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int r=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			
			String qr="delete from student where roll=?";
			
			PreparedStatement ps=con.prepareStatement(qr);
			
			ps.setInt(1, r);
			
			int i=ps.executeUpdate();
			System.out.println(i+" record deleted");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
