
package test;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/helloaditi")
public class Hello {
	@Path("/helloxml/{name}/{card_no}/{amount}")
@GET
@Produces(MediaType.TEXT_XML)
			public String sayHelloXML(@PathParam("name")String name,@PathParam("card_no")String card_no,@PathParam("amount")int amount)
			{
			  String resource="<?xml version='1.0'?>" 
			  		+ "<hello>This is xml " + name+"</hello>"+
			  		"<?xml version='1.0'?>"+
					  "<cardno>This is  card_no </cardno>" + "<amount>amount</amount>";
			  		
			  		
			  return resource;
			}
	@Path("/hellojson")
@GET
@Produces(MediaType.APPLICATION_JSON)
			public String sayHelloJASON()
			{
			  String resource="this is json";
			  return resource;
			}
@GET
@Produces(MediaType.TEXT_HTML)
			public String sayHelloHTML()
			{
			  String resource="<h1>This is html</h1>";
			  return resource;
			}

	@Path("/card")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String creditCard(@QueryParam("name")String name,@QueryParam("Card_no")String card_no,@QueryParam("amount") int amount)
	{
		String response;
		if(amount>10000)
		{
			response="Credit card approved";
		}
		else
		{
			response="Credit card not approved";
		}
		
		return "<html>"+"<body>"+"<h1>Hello</h1>" + name + "<br>" +
		response + "</body>" + "</html>";
	}
}
