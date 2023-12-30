package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_connection {

	public static void main(String[] args) {
		try {
			Class.forName("oraclle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","arvind");
			
			Statement smt = con.createStatement();
			smt.executeUpdate("create table emp3(Eid number,Ename varchar(20), sal number)");
			System.out.println("Table Created Successfully...");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	

	}

}
