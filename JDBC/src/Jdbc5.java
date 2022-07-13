import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.Statement;
import java.util.Scanner;

public class Jdbc5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int r=sc.nextInt();
		System.out.println("enter name");
		String n=sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			
			String qr="insert into student values(?,?)";
			
			PreparedStatement ps=con.prepareStatement(qr);
			
			ps.setInt(1, r);
			ps.setString(2, n);
			
			int i=ps.executeUpdate();
			System.out.println(i+" record added");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
