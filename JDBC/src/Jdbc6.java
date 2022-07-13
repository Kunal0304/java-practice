import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int r=sc.nextInt();
		System.out.println("enter new name");
		String n=sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			
			String qr="update student set name=? where roll=?";
			
			PreparedStatement ps=con.prepareStatement(qr);
			
			ps.setString(1, n);
			ps.setInt(2, r);
			
			int i=ps.executeUpdate();
			System.out.println(i+" record updated");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
