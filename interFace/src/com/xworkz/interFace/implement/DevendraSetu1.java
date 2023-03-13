package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.GoldSeller;

public class DevendraSetu1 implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram running in DevendraSetu1");
		return 45678;
	}

	@Override
	public String getGstNo() {
		System.out.println("getGstNo running in DevendraSetu1 ");
		return "Us123Ka";
	}

	@Override
	public String getLocation() {
		System.out.println("getLocation running in DevendraSetu1 ");
		return "Bagalkot";
	}

}
