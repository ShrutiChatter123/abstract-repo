package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.Delivary;

public class Person {
	
	private Delivary delivary;
	
	public Person(Delivary delivary) {
		this.delivary=delivary;
	}
	
	public void owner() {
		double charges=this.delivary.charges();
		if(charges<60) {
			System.out.println("charges are ok");
		}else{
			System.out.println("charges are expensive");
		}
		
		double timeTaken=this.delivary.timeTaken();
		if(timeTaken<30) {
			System.out.println("on time delivary");
		}else{
			System.out.println("delayed delivary");
		}
		
		String agentName=this.delivary.agentName(1);
		System.out.println(agentName);
		
	}
	

}
