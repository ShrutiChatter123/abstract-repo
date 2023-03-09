package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.CricketRule;

public class Umpire implements CricketRule {

	@Override
	public double timing() {
		System.out.println("Implimentation done inside the umpire");
		return 12.4;
	}

	@Override
	public int noOfMembers() {
		System.out.println("Implimentation done in umpire");
		return 12;
	}

}
