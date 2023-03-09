package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.FertilizerShopOwner;
import com.xworkz.interFace.thing.FarmRule;
import com.xworkz.interFace.usage.Farmers;

public class FarmRuleRunner {

	public static void main(String[] args) {

		FarmRule farmRule = new FertilizerShopOwner();
		boolean b = farmRule.seasonfarming();
		System.out.println("season considerd by farmers:" + b);

		boolean b1 = farmRule.seasonRain();
		System.out.println("rain considers by farmers:" + b1);
		
		System.out.println("======================");
		
		Farmers farmers=new Farmers(farmRule);
		farmers.setVillage("hallur");
		farmers.getVillage();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
