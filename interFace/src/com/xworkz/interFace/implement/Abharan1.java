package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.GoldSeller;

public class Abharan1 implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram riunning in Abharan1");
		return 9876;
	}

	@Override
	public String getGstNo() {
		System.out.println("getGstNo running in Abharan1");
		return "ka653FD";
	}

	@Override
	public String getLocation() {
		System.out.println("getLocation running in Abharan1");
		return "Davangere";
	}

}
