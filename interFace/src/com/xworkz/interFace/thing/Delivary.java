package com.xworkz.interFace.thing;

public interface Delivary {

	double charges();
	double timeTaken();
	String agentName(int rating);
	
//	dummy defult example
	
	 default double getPrice(String plan) {
		 System.out.println(" dummy default price ");
		return-1;
	}
}
