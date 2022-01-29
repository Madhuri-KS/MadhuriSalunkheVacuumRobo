package edu.fiu.jit;
 
public abstract class Cleansing extends Component  
{ 

	// Class Cleansing is a Type of Component  having its own special features and operations
	int Cleaning_PartID;
	String Cleaning_PartName;
	
 
	public void perform(String comp_name)
	{
		System.out.println("\nPerforming " + comp_name);
	}

}
