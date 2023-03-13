package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.GoldSeller;

public class Priyanka1 {

	private GoldSeller goldSeller;

	public Priyanka1(GoldSeller goldSeller) {
		this.goldSeller=goldSeller;
	}

	public void purchaseGold() {
		double price = this.goldSeller.pricePerGram();
		String number = this.goldSeller.getGstNo();
		String location = this.goldSeller.getLocation();
		System.out.println("Price of gold is:"+price);
		System.out.println("GSTnumber of gold is:"+number);
		System.out.println("location of gold is :"+location);
		if (price < 4500) {
			System.out.println(" priyanka1 Will buy");
		} else {
			System.out.println("more than charge priyanka1 will not buy");
		}
	}

}
