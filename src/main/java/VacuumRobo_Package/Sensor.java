package VacuumRobo_Package;

// Class Sensor is a part of the Mobility Component 
public class Sensor extends Mobility {  
		String sensor_type, ID ,status;
		public Sensor(String type,String name)
		{
			// Setting up the object to move in direction based on the input 
			if (type=="CLIFF") 
			{
				status="MOVE Back Cliff Detected";
				this.ID=name;
			}
			else if (type=="BUMP") 
			{
				status="MOVE Back Bump Detected";
				this.ID=name;
			}			
			else if (type=="WALL") 
			{
				status="MOVE Back Wall Detected";
				this.ID=name;
			}
			else 
			{
				status="MOVE Ahead no obstacle Detected";
				this.ID=name;
			}
		}
		public void check_obstacle(String ID)
		{
			// Check Obstacle
			System.out.println("\n " +status +" "+ ID);
		}

 
}


