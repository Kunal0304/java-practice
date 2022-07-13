

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class Try {

	public static void main(String[] args) {
		System.out.println("try to connect database");
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs =null;
		try
		{
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:xe","mydb","kunal");
			String sql="select * from emp";
			pst =conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) +" "+rs.getString(2));
				conn.close();
			}
		}
			catch(Exception e){
				System.out.println(e);
			}
	}

}
