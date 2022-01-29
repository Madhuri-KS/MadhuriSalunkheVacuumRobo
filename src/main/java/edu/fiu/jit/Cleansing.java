package edu.fiu.jit;
 
public abstract class Cleansing extends Component  
{ 


	int Cleaning_PartID;
	String Cleaning_PartName;
	
 
	public void perform(String comp_name)
	{
		System.out.println("\nPerforming " + comp_name);
	}

}
