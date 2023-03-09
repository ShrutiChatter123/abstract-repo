package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.DanceCompitationRule;

public class Participates {

	public DanceCompitationRule danceCompitationRule;
	private String name;

	public Participates(DanceCompitationRule danceCompitationRule) {

		this.danceCompitationRule = danceCompitationRule;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		int i=danceCompitationRule.age();
		System.out.println("age running in participates:"+i);
		
		boolean b=danceCompitationRule.money();
		System.out.println("moneyy  running in danceCompitationRule :"+b);
		return name;
	}

}
