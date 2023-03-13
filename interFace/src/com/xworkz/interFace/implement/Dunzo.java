package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.Delivary;

public class Dunzo implements Delivary {

	@Override
	public double charges() {
		System.out.println("delivary runing in dunzo");
		return 40;
	}

	@Override
	public double timeTaken() {
		System.out.println("time taken ");
		return 10.30;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Agent name running in dunzo");
		if(rating==1) {
			return"Basavraj";
		}if(rating==2) {
			return"Dinakar";
		}if(rating==3) {
			return"Shivu";
		}
		
		return "Rating wise";
	}

}
