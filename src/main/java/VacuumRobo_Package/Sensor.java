package VacuumRobo_Package;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

// Class Sensor is a part of the Mobility Component 
public class Sensor extends Mobility implements SelfCheckCapable{  
		String sensor_type, ID ,status;
		public Sensor(String type)
		{
			// Setting up the object to move in direction based on the input 
			if (type=="CLIFF") 
			{
				status="MOVE Back Cliff Detected";
			
			}
			else if (type=="BUMP") 
			{
				status="MOVE Back Bump Detected";
			
			}			
			else if (type=="WALL") 
			{
				status="MOVE Back Wall Detected";
			
			}
			else 
			{
				status="MOVE Ahead no obstacle Detected";
			
			}
		}
		public void check_obstacle(String ID)
		{
			// Check Obstacle
			System.out.println("\n " +status );
		}
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "Madhuri_Vacuum_TestInstance_Sensor";
		}
		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.1);
		}

 
}


