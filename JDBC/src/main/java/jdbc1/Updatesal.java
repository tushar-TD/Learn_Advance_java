package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updatesal {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection Success.");
		
		Statement st=con.createStatement();
		int n=st.executeUpdate("update emp set sal=1000 where empno=7900");
		System.out.println("Records Updated:"+n);
		st.close();
		con.close();

	}

}
