package edu.fiu.jit;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.DateTimeSyntax;

public class VacuumRobo {	
	public String ModelName;
	private String SerialNumber;

	/**
	 * Check Battery before performing Any operation
	 * @return 0 on success
	 */
	
	public VacuumRobo(String ModelName) {
		
		this.ModelName = ModelName; 
		this.SerialNumber = "1234";
	}
	public int CheckBattery() {
		System.out.println("Checking Battery before Starting");
		return 0;
	}

	/**
	 *  Start The Device
	 */
	public int StartDevice() {
		System.out.println("Start Device");
		return 0;
	}
	/**
	 *  Sleep The Device
	 */
	public int SleepDevice() {
		System.out.println("Sleep Device");
		return 0;
	}

	/**
	 *  Check if device is scheduled, if Yes Return the time else return current time
	 */
	public int IsScheduled() {
		Calendar c1 = Calendar.getInstance();
         // creating a date object with specified time.
        Date dateOne = c1.getTime();
		System.out.println("Scheduler has been set to " + dateOne + " for device serial " + this.SerialNumber ); 
		return 0;
	}
}


