package test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

	private String response;
	
	public Response()
	{
		
	}
	
	Response(String response)
	{
		this.response=response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
