// import java.rmi.server.SocketSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int r=sc.nextInt();
		System.out.println("enter name");
		String n=sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			
			String qr="insert into student values("+r+",'"+n+"')";
			
			Statement st=con.createStatement();
			
			int i=st.executeUpdate(qr);
			System.out.println(i+" record added");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
