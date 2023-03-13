package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.GoldSeller;

public class Anita1 {

	private GoldSeller goldSeller;
	
	public Anita1( GoldSeller goldSeller) {
		this.goldSeller=goldSeller;
	}
	
	public void buyGold() {
		double price=this.goldSeller.pricePerGram();
		String number=this.goldSeller.getGstNo();
		String location=this.goldSeller.getLocation();
		System.out.println("Price of gold is:"+price);
		System.out.println("GSTnumber of gold is:"+number);
		System.out.println("location of gold is :"+location);
		if(price<5000) {
			System.out.println("will buy");
		}else {
			System.out.println("more than expectation will not buy");
		}
		
	}
}
