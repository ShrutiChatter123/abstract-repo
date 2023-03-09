package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Festival;
import com.xworkz.interFace.thing.HoliRule;
import com.xworkz.interFace.usage.PeoplesForHoli;

public class HoliRuleRunner {

	public static void main(String[] args) {

		HoliRule holiRule=new Festival();
		String str=holiRule.chemicalFree();
		System.out.println("chemicals may restricted:"+str);
		
		boolean b1=holiRule.restrictedTime();
		System.out.println("restricted the time for holi:"+b1);
		
		System.out.println("===============");
		
		PeoplesForHoli PeoplesForHoli= new PeoplesForHoli(holiRule);
		PeoplesForHoli.setDate(22);
		PeoplesForHoli.getDate();
	}

	}
