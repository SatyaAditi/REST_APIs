package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
public class Test
{
	@InjectMocks private DbManager db;
    @Mock private Connection mockconn;
    @Mock private Statement mockstatement;
	
    @Before
    public void setUp() {
    
    	    MockitoAnnotations.initMocks(this);
    
    	  }
    @org.junit.Test
    public void testMockDBConnection() throws Exception {
    
    	    Mockito.when(mockconn.createStatement()).thenReturn(mockstatement);
    
    	    Mockito.when(mockconn.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
    
    	    int value = db.executeQuery("select * from user");
    
    	    Assert.assertEquals(value, 1);
    
    	  //  Mockito.verify(mockconn.createStatement(), Mockito.times(1));
    
    	  }
    	 
	
	
	Hello h=new Hello();
	
	@org.junit.Test
	public void testing()
	{
		assertEquals("this is json", h.sayHelloJASON());

	}
	
	
	
	
}