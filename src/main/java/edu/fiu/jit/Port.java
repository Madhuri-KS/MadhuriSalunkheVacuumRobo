package edu.fiu.jit;


// Class Ports is a Type of Cleansing Component having its own special features and operations like activating the in and out ports and performing suction
public class Port extends Cleansing{
	private int in_port_pressure, out_port_pressure; 
	public void suction()
	{
		System.out.println("\nPerforming Suction of Dust");
	}

}
