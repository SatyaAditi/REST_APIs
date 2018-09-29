package test;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class  MessageResource {
  
	
	MessageService messages= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public List<Message> getMessage()
	{
		return messages.getAllMessages();
	}
}
