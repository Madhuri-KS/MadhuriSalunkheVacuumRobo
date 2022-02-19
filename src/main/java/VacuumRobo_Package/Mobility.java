package VacuumRobo_Package;
 

// Class Mobility is a Type of Component  having its own special features and operations

public abstract class Mobility { 
		int status;
		String movement_category; 
		
		//MyMethod to Check Movement Status	
	 
	 	public void check_movementstatus(String movement_category)
		{
			System.out.println("\nPerformed " + movement_category);
		}
 
		 
	 	
	 	

}
