package VacuumRobo_Package;

// Class Mobility is a Type of Component  having its own special features and operations

public abstract class Mobility extends Component  { 
		int status;
		String movement_category;
		
	 	public void check_movementstatus(String movement_category)
		{
			System.out.println("\nPerformed " + movement_category);
		} 

}
