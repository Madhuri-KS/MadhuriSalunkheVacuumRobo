package edu.fiu.jit;  
public abstract class Component { 
	int Component_ID;
	String type;
	String part_status;
	/**
	 *  Check if Component is working fine
	 */
	public String  checkcomponent_status(int Component_ID)
	{
		System.out.println("\nChecking Component Status Before Start..");
		return "No Error";
		
	}

}
