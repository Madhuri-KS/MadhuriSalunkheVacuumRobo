package VacuumRobo_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

public class Vaccum_App implements GenericComponent {
	private String ModelNum; 
	private Engine engineInstance; 
	private Navigation navigationObject;
	private Sensor sensorObject;
	
	public Vaccum_App()
	{  
		engineInstance= new Engine();
		navigationObject = new Navigation();
		sensorObject=new Sensor("");
	}
	
	public static void main(String[] args) {
		System.out.println("The Robo Vacuum Working");
		
		// Create a new Instance of Robo
		//VacuumRobo my_robo = new VacuumRobo("Madhuri_Vacuum_TestInstance");
		//System.out.println("Model Name is : " + my_robo.ModelName);

		 
}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Madhuri_Vacuum_TestInstance";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, navigationObject,sensorObject, engineInstance); // add all your sub components
		return internalComponents;
	}
}
