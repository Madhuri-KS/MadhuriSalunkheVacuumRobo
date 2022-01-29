package edu.fiu.jit;

//Class Dustbin is a Type of Cleansing Component having its own special features and operations like checking if the bin is full before start

public class Dustbin extends Cleansing{
 
	private boolean isFull; 
	public void Check_Full()
	{
		System.out.println("\nDustbin available and not full");
	}

}
 