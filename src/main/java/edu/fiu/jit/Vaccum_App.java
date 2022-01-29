package edu.fiu.jit;
import edu.fiu.jit.VacuumRobo;  

public class Vaccum_App {
	public static void main(String[] args) {
		System.out.println("The Robo Vacuum Working");
		
		// Create a new Instance of Robo
		VacuumRobo my_robo = new VacuumRobo("Madhuri_Vacuum_TestInstance");
		System.out.println("Model Name is : " + my_robo.ModelName);

		// Check Status
		System.out.println("\nChecking Status Before Start..");

		System.out.println("\nStep 1");
		my_robo.CheckBattery();
		System.out.println("\nStep 2");
		// On Checking Battery Start The Device
		my_robo.StartDevice();
		System.out.println("\nStep 3");
		// Check if its already scheduled to start at another time 
		my_robo.IsScheduled(); 
		
		// Activate - Port, Engines and Navigation to Perform Operations
		
		// Activate - Cleansing Component's Port, Dustbin, Fan  
		new Port().perform("Port");
		new Port().suction();
		new Dustbin().perform("Dustbin");
		new Dustbin().Check_Full();
		new Port().perform("Fan");
		new Fan().rotate();
		
		new Engine().start(my_robo.ModelName);
		
		// Activate - Navigation   
		Navigation n1 = new Navigation();
		// Check before movement whether the distance is a enough to move forward  
		n1.check_safedistance("Forward");
		
		// Activate the Sensor - Check if the Vacuum encounters a Cliff
		Sensor s1 = new Sensor("CLIFF",my_robo.ModelName);
		
		// Activate the Sensor - Check if the Vacuum encounters a Bump
		Sensor s2 = new Sensor("BUMP",my_robo.ModelName);
	
		// Activate the Sensor - Check if the Vacuum encounters a Wall 
		Sensor s3 = new Sensor("WALL",my_robo.ModelName);
		
		// Activate the Sensor - Check if the Vacuum has no obstacles 
		Sensor s4 = new Sensor("NONE",my_robo.ModelName);
		
		// Check before movement whether the distance is a enough to move forward
		n1.check_safedistance("Forward");
		
		// Check before movement whether there is any obstacle
		s1.check_obstacle(my_robo.ModelName);
		// Move the Robo Backward as there is an obstacle
		n1.move("Backward");
		
		// Check before movement whether there is any obstacle
		s2.check_obstacle(my_robo.ModelName);
		// Move the Robo Backward as there is an obstacle
		n1.move("Backward");
		
		// Check before movement whether there is any obstacle
		s3.check_obstacle(my_robo.ModelName);
		// Move the Robo Backward as there is an obstacle
		n1.move("Backward");
		
		// Check before movement whether there is any obstacle
		s4.check_obstacle(my_robo.ModelName); 
		
		// Stop the Robo
		new Engine().stop(my_robo.ModelName);
}
}
