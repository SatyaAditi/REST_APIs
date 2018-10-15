package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
Connection conn;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","root");
					return conn;
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
			System.out.println("error");
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public int executeQuery(String query) throws ClassNotFoundException, SQLException {
	    return conn.createStatement().executeUpdate(query);
	  }
	
	
}
