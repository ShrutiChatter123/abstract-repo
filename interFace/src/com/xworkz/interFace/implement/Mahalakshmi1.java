package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.GoldSeller;

public class Mahalakshmi1 implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram running in Mahalakshmi1 ");
		return 3454;
	}

	@Override
	public String getGstNo() {
		System.out.println("getGstNo running in Mahalakshmi1 ");
		return "Up000Ts";
	}

	@Override
	public String getLocation() {
		System.out.println("getLocation running in Mahalakshmi1 ");
		return "Gadag";
	}

}
