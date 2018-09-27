package test;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

@Path("/hello")
public class Hello {
@GET
@Produces(MediaType.TEXT_XML)
			public String sayHelloXML()
			{
			  String resource="<? xml version='1.0' ?>" 
			  		+ "<hello>This is xml</hello>";
			  return resource;
			}
@GET
@Produces(MediaType.APPLICATION_JSON)
			public String sayHelloJASON()
			{
			  String resource=null;
			  return resource;
			}
@GET
@Produces(MediaType.TEXT_HTML)
			public String sayHelloHTML()
			{
			  String resource="<h1>This is html</h1>";
			  return resource;
			}

}
