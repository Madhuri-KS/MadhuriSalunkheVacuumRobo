package edu.fiu.jit;

public class Sensor extends Mobility {  
		String sensor_type, ID ,status;
		public Sensor(String type,String name)
		{
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
			System.out.println("\n " +status +" "+ ID);
		}

 
}


