package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.CricketRule;

public class Cricketers {
	
	public CricketRule cricketers;
	private String captain;
	
	public Cricketers(CricketRule cricketers) {
		this.cricketers=cricketers;
	}
	
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getCaptain() {
		double d=cricketers.timing();
		System.out.println("Timing in exact way :"+ d);
		
		int i=cricketers.noOfMembers();
		System.out.println("no of members in cricket:"+i);
		return captain;
	}
	
	
	
	
	
	
	
}
