package com.h2micro;

public class Pod {
	
	private int step = 1;
	
	public Pod(){
		
	}
	
	public void step(){
		step++;
	}
	
	//Velocity Based on Function
	public double getVelocity(){
		double v = 0;
		
		//Function of step
			//v (1-50) = x^1.5
			//c (50-1000) = 353.5 - (x-50)
		
		if(step <= 50){
			double s = (double) step;
			v = Math.pow(s, 1.5);
			
		} else {
			double s = (double) step;
			v = 353.5 - (s-50);
		}
		
		return v;
	}

}
