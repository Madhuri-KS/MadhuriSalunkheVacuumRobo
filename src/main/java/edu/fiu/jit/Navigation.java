package edu.fiu.jit;

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
