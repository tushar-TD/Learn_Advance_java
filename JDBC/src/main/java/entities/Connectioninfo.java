package entities;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectioninfo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection Established");
		con.close();
	}

}
