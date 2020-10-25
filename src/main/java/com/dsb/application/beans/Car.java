package com.dsb.application.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public void start()
	{
		System.out.println("Car is Starting");
	}
	
	public void stop()
	{
		//Jira HIS-122 Working
		System.out.println("Stoping the car");
	}
	
	public void devBike()
	{
		System.out.println("This is Developer branch");
	}
	
}
