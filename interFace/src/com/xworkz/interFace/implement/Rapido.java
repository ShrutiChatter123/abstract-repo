package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.Delivary;

public class Rapido implements Delivary {

	@Override
	public double charges() {
		System.out.println("running charges in Rapido");
		return 43;
	}

	@Override
	public double timeTaken() {
		System.out.println("running time in rapido");
		return 11.33;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("running in strung agent");
		if(rating==1)
			return "Basavraj";
		if(rating==2)
			return "dinakar";
		if(rating==3)
			return "Shivu";
		return "rating wise";
	}

}
