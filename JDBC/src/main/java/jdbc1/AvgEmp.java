package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AvgEmp {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection Success.");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT job, AVG(sal) FROM emp GROUP BY JOB ORDER BY AVG(sal) DESC");
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getFloat(2)+" ");
			System.out.println();
		}
		rs.close();
		st.close();
		con.close();

	}

}
