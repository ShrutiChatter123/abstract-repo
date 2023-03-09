package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Umpire;
import com.xworkz.interFace.thing.CricketRule;
import com.xworkz.interFace.usage.Cricketers;

public class CricketRunner {

	public static void main(String[] args) {

		CricketRule rule=new Umpire();//Is a relationship
		double d=rule.timing();
		System.out.println("timing in exact way:"+d);
		
		int i=rule.noOfMembers();
		System.out.println("no of members in cricket:"+i);
		
		System.out.println("=====================");
		
		
		Cricketers cricketers=new Cricketers(rule);//has a relation
		cricketers.setCaptain("MahendrSing dhoni");
		cricketers.getCaptain();
		
		
		
		
		
		
		
	}

}
