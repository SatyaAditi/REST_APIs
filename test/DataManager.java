package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Path("/dbconnection")
public class DataManager {
	DbManager db= new DbManager();
	Connection conn=db.getConnection();
	ArrayList<String> list=new ArrayList<>();
	@Path("/showdata")
	@GET
	
	@Produces(MediaType.APPLICATION_XML)
	public String getinfo()
	{
    String response = null;
	
	Statement stmt;
	try {
		stmt = conn.createStatement();
	
	ResultSet rs=stmt.executeQuery("select * from user");
	while(rs.next())
	{
	  response="<?xml version=1.0?>"+ "name " + "<name>"+ rs.getString(2) +"</name>";
	  //list.add(response);
	  
	 }
	conn.close();
	//GenericEntity<ArrayList<String>> entity = new GenericEntity<ArrayList<String>>(list) {};
	return response;
	}
	catch (SQLException e) {
		
		e.printStackTrace();
		return response="error";
	}
	}
	
	@Path("/insertinfo")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String insertinfo(@QueryParam("id")int id,@QueryParam("name")String username,@QueryParam("password")String password)
	{
		String responsenew="";
		Statement stmt;
		try {
		stmt=conn.createStatement();
		String sql="insert into user(id,username,password) values("+ id + "," + username + "," + password +")";
		
			stmt.executeUpdate(sql);
			conn.close();
	    return responsenew="updated successfully";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return responsenew="error";
		}
		

		}
	
	
}
