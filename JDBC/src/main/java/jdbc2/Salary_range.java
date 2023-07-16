package jdbc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Salary_range {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection establised");
		
		PreparedStatement ps=con.prepareStatement("select * from emp where sal between ? and ?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Minimum salary:");
		float min=Integer.parseInt(br.readLine());
		System.out.println("Maximum salary:");
		float max=Integer.parseInt(br.readLine());
		ps.setFloat(1, min);
		ps.setFloat(2, max);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) 
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getInt(4)+" ");
			System.out.println();
			
		}
		rs.close();
		ps.close();
		con.close();
		br.close();
	}

}
