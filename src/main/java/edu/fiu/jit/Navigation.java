package edu.fiu.jit;

// Class Navigation implements the methods from Wheel depending on direction for which corresponding object was initialized
// Class Navigation Uses attributes from Mobility Class for co-ordination with sensors 

public class Navigation extends Mobility implements Wheel {
	String Navigation_type, direction ;
	public void check_safedistance(String direction)
	{
		System.out.println("\nSafe to move " + direction);
	}

	  public void move(String direction)  {
		  System.out.println("\nMoving Wheels " + direction);
	  }
}
