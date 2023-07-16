package jdbc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcceptEmpno {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url,"root","root");
		System.out.println("Connection establised");
		
		PreparedStatement ps=con.prepareStatement("select * from emp where empno=?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter emp number:");
		int empid1=Integer.parseInt(br.readLine());
		ps.setInt(1, empid1);
		int empid2=0;
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			empid2=rs.getInt(1);
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		if(empid1!=empid2)
		{
			System.out.println("Empid not found");
		}
		rs.close();
		ps.close();
		con.close();
		br.close();

}
}
