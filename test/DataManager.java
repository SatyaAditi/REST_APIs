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
	ArrayList<Response> list=new ArrayList<>();
	@Path("/showdata")
	@GET
	
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Response> getinfo()
	{
   
	String response=null;
	Statement stmt;
	try {
		stmt = conn.createStatement();
	
	ResultSet rs=stmt.executeQuery("select * from user");
	while(rs.next())
	{
	  response= "name " + rs.getString(2) ;
	  Response res=new Response(response);
	  list.add(res);
	  
	 }
	conn.close();
	
	}
	catch (SQLException e) {
		
		e.printStackTrace();
		
	}
	return list;
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
	    return responsenew="inserted successfully";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return responsenew="error";
		}
		

    }
	@Path("/updateinfo")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String updateinfo(@QueryParam("id")int id,@QueryParam("name")String newusername,@QueryParam("password")String newpassword)
	{
		String responsenew="";
		Statement stmt;
		try {
		stmt=conn.createStatement();
		if(newusername==null)
		{
		String sql="update user set password="+ newpassword + "where id="+id ;
		
			stmt.executeUpdate(sql);
		}
		else if(newpassword==null)
		{
			String sql="update user set username="+ newusername + "where id="+id ;
			stmt.executeUpdate(sql);
		}
			conn.close();
	    return responsenew="updated successfully";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return responsenew="error";
		}
		

    }
	
	@Path("/deleteinfo")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String deleteinfo(@QueryParam("id")int id)
	{
		String responsenew="";
		Statement stmt;
		try {
		stmt=conn.createStatement();
		
		String sql="delete from user where id="+id;
		
		
			stmt.executeUpdate(sql);
		
			conn.close();
	    return responsenew="deleted successfully";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return responsenew="error";
		}
		

    }
	
	
	
}
