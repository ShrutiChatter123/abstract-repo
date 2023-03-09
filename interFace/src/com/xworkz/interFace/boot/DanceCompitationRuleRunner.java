package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Judges;
import com.xworkz.interFace.thing.DanceCompitationRule;
import com.xworkz.interFace.usage.Participates;

public class DanceCompitationRuleRunner {

	public static void main(String[] args) {

		DanceCompitationRule danceCompitationRule=new Judges();
		 int i=danceCompitationRule.age();
		 System.out.println("age running in participates:"+i);
		
		 boolean b=danceCompitationRule.money();
		 System.out.println("money running in danceCompitationRule:"+b);
		 
		 System.out.println("--------------------");
		 
		 Participates Participates=new Participates(danceCompitationRule);
		 Participates.setName("Kaveri");
		 Participates.getName();
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
