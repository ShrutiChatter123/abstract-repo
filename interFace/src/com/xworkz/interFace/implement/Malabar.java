package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.GoldSeller;

public class Malabar implements GoldSeller  {

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram running in malabar");
		return 8765.99D;
	}

	@Override
	public String getGstNo() {
		System.out.println("gstNo Running in malabar");
		return "D244f33";
	}

	@Override
	public String getLocation() {
		System.out.println("Getlocation running in malabar");
		return "Banglore";
	}

	
	
	
}
