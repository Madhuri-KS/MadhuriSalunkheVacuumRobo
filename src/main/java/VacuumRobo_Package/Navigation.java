package VacuumRobo_Package;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

// Class Navigation implements the methods from Wheel depending on direction for which corresponding object was initialized
// Class Navigation Uses attributes from Mobility Class for co-ordination with sensors 

public class Navigation implements SelfCheckCapable  {
	String Navigation_type, direction ;
	public void check_safedistance(String direction)
	{
		System.out.println("\nSafe to move " + direction);
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Madhuri_Vacuum_TestInstance_Sensor";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.01);
	}
 
}
