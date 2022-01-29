package edu.fiu.jit;
import edu.fiu.jit.VacuumRobo;  

public class Vaccum_App {
	public static void main(String[] args) {
		System.out.println("The Robo Vacuum Working");
		
		// Create a new Instance of Robo
		VacuumRobo my_robo = new VacuumRobo("Madhuri_Vacuum_TestInstance");
		System.out.println("Model Name is" + my_robo.ModelName);

		// Check Status
		System.out.println("\nChecking Status Before Start..");

		System.out.println("\nStep 1");
		my_robo.CheckBattery();
		System.out.println("\nStep 2");
		my_robo.StartDevice();
		System.out.println("\nStep 3");
		my_robo.IsScheduled(); 
		 
		new Port().perform("Port");
		new Port().suction();
		new Dustbin().perform("Dustbin");
		new Dustbin().Check_Full();
		new Port().perform("Fan");
		new Fan().rotate();
		
		new Engine().start(my_robo.ModelName);
		Navigation n1 = new Navigation();
		n1.check_safedistance("Forward"); 
		Sensor s1 = new Sensor("CLIFF",my_robo.ModelName);

		Sensor s2 = new Sensor("BUMP",my_robo.ModelName);
	
		Sensor s3 = new Sensor("WALL",my_robo.ModelName); 
		Sensor s4 = new Sensor("NONE",my_robo.ModelName);
		n1.check_safedistance("Forward");
		
		s1.check_obstacle(my_robo.ModelName);
		n1.move("Backward");
		s2.check_obstacle(my_robo.ModelName);
		n1.move("Backward");
		s3.check_obstacle(my_robo.ModelName);
		n1.move("Backward");
		s4.check_obstacle(my_robo.ModelName); 
		
	
		new Engine().stop(my_robo.ModelName);
}
}
