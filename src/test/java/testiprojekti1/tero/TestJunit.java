package testiprojekti1.tero;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestJunit {

	   String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, messageUtil.printMessage());     
	   }
	}