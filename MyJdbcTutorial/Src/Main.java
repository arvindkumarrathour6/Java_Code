

import java.sql.*;

public class Main {

	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String USER = "scott";
			String PASS = "arvind";
			conn = DriverManager.getConnection(URL, USER, PASS);
//			PreparedStatement stm = conn.prepareStatement("insert into student2 values(?,?,?)");
//			stm.setInt(1, 1);
//			stm.setString(2,"Arvind");
//			stm.setString(3, "CSE");
//			int i=stm.executeUpdate();  
//			System.out.println(i+" records inserted");
//			String query="create table Student3(sid number(4),sname varchar(10),branch varchar(10))";
//			 boolean b1=stm.execute(query);
//			ResultSet rs=stm.executeQuery(query);  
//			 
//            while (rs.next()) {
//            	// EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
//			System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"         "+rs.getString(3)+"         "+rs.getInt(4)+"       "+rs.getString(5));  
//            }
			  
			System.out.println("Connected Successfully...");
			DatabaseMetaData dbmd=conn.getMetaData();  
			System.out.println("Driver Name: "+dbmd.getDriverName()); 
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
			
			  
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}

	}

}
