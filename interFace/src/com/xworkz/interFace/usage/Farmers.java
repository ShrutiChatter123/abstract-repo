package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.FarmRule;

public class Farmers {

	public FarmRule farmrule;
	private String village;
	
	public Farmers(FarmRule farmrule) {
		
		this.farmrule=farmrule;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getVillage() {
		boolean b=farmrule.seasonfarming();
		System.out.println("season considerd by farmers:"+b);
		
		boolean b1=farmrule.seasonRain();
		System.out.println("rain considers by farmers:"+b1);
		return village;
	}
}
