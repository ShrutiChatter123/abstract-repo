package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Squide;
import com.xworkz.interFace.thing.ExamRule;
import com.xworkz.interFace.usage.Students;

public class ExamRuleRunner {

	public static void main(String[] args) {
		
		ExamRule exm=new Squide();
		double ref=exm.timing();
		System.out.println("exm consist of timeing:"+ref);
		
		boolean b=exm.extraTime();
		System.out.println("time consist of exm:"+b);
		
		System.out.println("-------------------");
		
		Students std=new Students();
		std.setName("ravi");
		std.getName();
		
		
		
		
	}
	
	
}


