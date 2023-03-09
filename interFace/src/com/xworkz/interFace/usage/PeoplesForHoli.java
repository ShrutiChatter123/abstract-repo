package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.HoliRule;

public class PeoplesForHoli {

	public HoliRule holirule;
	private int date;
	
	public PeoplesForHoli( HoliRule holirule) {
		this.holirule=holirule;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getDate() {
		String str=holirule.chemicalFree();
		System.out.println("chemicals may restricted :"+str);
		
		boolean b=holirule.restrictedTime();
		System.out.println("restricted the time for holi:"+b);
		return date;
	}
}
