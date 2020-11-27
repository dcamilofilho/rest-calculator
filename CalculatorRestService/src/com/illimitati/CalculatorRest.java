 
package com.illimitati;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("CalculatorRest")
public class CalculatorRest {
	
	
	/**
     * Default constructor. 
     */
    public CalculatorRest() {

    }
    
   
    /**
     * Retrieves representation of an instance of CalculatorRest
     * @return an instance of String
     * @throws NamingException 
     */
	@GET
	@Produces("text/plain")
	@Path("add")
	public String addGet() throws NamingException { 
				
		Context initContext = new InitialContext();
		
		// chamada efetuada com sucesso.
		CalculatorLocal testLocal = (CalculatorLocal) initContext.lookup("java:comp/env/ejb/CalculatorEJB");
		testLocal.sum(10, 10);
		
		return String.valueOf(testLocal.sum(10, 10));
	}
	
	/**
     * Retrieves representation of an instance of CalculatorRest
     * @return an instance of String
     * @throws NamingException 
     */
	@GET
	@Produces("text/plain")
	@Path("subtraction")
	public String subtractionGET() throws NamingException { 
				
		Context initContext = new InitialContext();
		
		// chamada efetuada com sucesso.
		CalculatorLocal testLocal = (CalculatorLocal) initContext.lookup("java:comp/env/ejb/CalculatorEJB");
		testLocal.sum(10, 10);
		
		return String.valueOf(testLocal.subtraction(10, 10));
	}
	
	/**
     * Retrieves representation of an instance of CalculatorRest
     * @return an instance of String
     * @throws NamingException 
     */
	@GET
	@Produces("text/plain")
	@Path("multiplication")
	public String multiplicationGET() throws NamingException { 
				
		Context initContext = new InitialContext();
		
		// chamada efetuada com sucesso.
		CalculatorLocal testLocal = (CalculatorLocal) initContext.lookup("java:comp/env/ejb/CalculatorEJB");
		testLocal.sum(10, 10);
		
		return String.valueOf(testLocal.multiplication(10, 10));
	}
	
	/**
     * Retrieves representation of an instance of CalculatorRest
     * @return an instance of String
     * @throws NamingException 
     */
	@GET
	@Produces("text/plain")
	@Path("division")
	public String divisonGET() throws NamingException { 
				
		Context initContext = new InitialContext();
		
		// chamada efetuada com sucesso.
		CalculatorLocal testLocal = (CalculatorLocal) initContext.lookup("java:comp/env/ejb/CalculatorEJB");
		testLocal.sum(10, 10);
		
		return String.valueOf(testLocal.division(10, 10));
	}
	

	/**
     * PUT method for updating or creating an instance of CalculatorRest
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@POST
	@Consumes("text/plain")
	public void resourceMethodPOST(String content) { 
		throw new UnsupportedOperationException();
	}
	
	/**
     * PUT method for updating or creating an instance of CalculatorRest
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		throw new UnsupportedOperationException();
	}
}