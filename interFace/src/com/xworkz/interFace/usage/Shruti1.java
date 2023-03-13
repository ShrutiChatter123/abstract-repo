package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.GoldSeller;

public class Shruti1 {

	private GoldSeller goldSeller1;

	public Shruti1(GoldSeller goldSeller1) {
		this.goldSeller1 = goldSeller1;
	}

	public void ChinnaTago() {
		Double charges = this.goldSeller1.pricePerGram();
		String number = this.goldSeller1.getGstNo();
		String location = this.goldSeller1.getLocation();
		System.out.println("Price of gold is:"+charges);
		System.out.println("GSTnumber of gold is:"+number);
		System.out.println("location of gold is :"+location);
		if (charges < 4000) {
			System.out.println("Shruti will buy the chinna");
		} else {
			System.out.println("Shruti will not buy the chinna");
		}
	}

}
