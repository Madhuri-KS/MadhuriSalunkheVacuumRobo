package VacuumRobo_Package;
 
public  class Cleansing  
{ 

	// Class Cleansing is a Type of Component  having its own special features and operations
	int Cleaning_PartID;
	String Cleaning_PartName;
	
 
	public void perform(String comp_name)
	{
		System.out.println("\nPerforming " + comp_name);
	}

}
