package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Allemp {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection Success.");
		
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("select * from emp");
		ResultSet rs=st.executeQuery("select * from emp order by sal desc");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getInt(4)+" ");
			
			System.out.println();
		}
		rs.close();
		st.close();
		con.close();

	}

}
