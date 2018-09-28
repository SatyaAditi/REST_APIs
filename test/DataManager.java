package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dbconnection")
public class DataManager {
	
	@GET
	
	@Produces(MediaType.APPLICATION_XML)
	public String getinfo()
	{
    String response = null;
	DbManager db= new DbManager();
	Connection conn=db.getConnection();
	Statement stmt;
	try {
		stmt = conn.createStatement();
	
	ResultSet rs=stmt.executeQuery("select * from user");
	while(rs.next())
	{
	  response="<?xml version=1.0?>"+ "name " + "<name>"+rs.getString(2)+"<name>";
	 }
	conn.close();
	return "hey"+response;
	}
	catch (SQLException e) {
		
		e.printStackTrace();
		return null;
	}
	}
	
	
}
