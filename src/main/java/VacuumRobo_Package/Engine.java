package VacuumRobo_Package;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

// Class Engine is a Type of Component  having its own special features and operations
public class Engine implements SelfCheckCapable {   
			int numberOfCylinders;
			float capacity;
	//MyMethod to Start engine
		 	public void start(String name)
			{
				System.out.println("\nStarted " + name);
			}
	//MyMethod to Stop engine		 	
		 	public void stop(String name)
			{
				System.out.println("\nStop " + name);
			}
    //MyMethod to check engine heating			 	
		 	public void heatingcheck(String name)
			{
				System.out.println("\nNot Heated " + name);
			}

			@Override
			public String getComponentName() {
				// TODO Auto-generated method stub
				return "Madhuri_Vacuum_TestInstance_Engine";
			}

			@Override
			public boolean selfCheck() {
				// TODO Auto-generated method stub
				return SelfCheckUtils.randomCheck(0.5);
			}


	}
 
