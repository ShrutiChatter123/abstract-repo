package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.SystemsInCode;

public class CodingRuleRunner {

	public static void main(String[] args) {

		SystemsInCode systm = new SystemsInCode();
		boolean safe = systm.safe();
		System.out.println(safe);
		String secure = systm.secure();
		System.out.println(secure);
		boolean realability = systm.reliable();
		System.out.println(realability);
		String tast = systm.tastsble();
		System.out.println(tast);
		double maintain = systm.maintainable();
		System.out.println(maintain);
		double portable = systm.portable();
		System.out.println(portable);
		String compli = systm.complianceWithIndustry();
		System.out.println(compli);
		boolean code = systm.codeQuality();
		System.out.println(code);
		int reduce = systm.reduceAccelerationTime();
		System.out.println(reduce);
		int cost = systm.reduceAccelerationCost();
		System.out.println(cost);
		int hashcode = systm.hashCode();
		System.out.println(hashcode);
		String str = systm.toString();
		System.out.println(str);
		

	}

}
