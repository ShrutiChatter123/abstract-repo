package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.GoldSeller;

public class Bhairavi1 {

	private GoldSeller gogoldSeller;
	
	public Bhairavi1(GoldSeller gogoldSeller) {
		this.gogoldSeller=gogoldSeller;
	}
	public void bangarKaridi() {
		double charge=this.gogoldSeller.pricePerGram();
		String number=this.gogoldSeller.getGstNo();
		String location=this.gogoldSeller.getLocation();
		System.out.println("Price of gold is:"+charge);
		System.out.println("GSTnumber of gold is:"+number);
		System.out.println("location of gold is :"+location);
		if(charge<6000 && charge>4500) {
			System.out.println("Bhairavi will buy the bangara");
		}else {
			System.out.println("Bhairavi will not buy the bangara");
		}
	}
	
	
	
}
