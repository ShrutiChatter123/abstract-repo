package com.xworkz.interFace.usage;

import com.xworkz.interFace.thing.ExamRule;

public class Students {

	public ExamRule examrule;
	private String name;
	
	public void Student(ExamRule examrule) {
		this.examrule=examrule;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		double ref=examrule.timing();
		System.out.println("exm consist timing :"+ref);
		
		boolean b=examrule.extraTime();
		System.out.println("time consist of exm:"+b);
		return name;
	}
	
	
}
