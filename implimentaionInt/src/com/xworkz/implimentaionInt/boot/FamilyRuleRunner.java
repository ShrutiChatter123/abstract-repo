package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.Members;

public class FamilyRuleRunner {

	public static void main(String[] args) {

		Members mem = new Members();
		double wake = mem.wakeUpTime();
		System.out.println(wake);
		boolean sleep = mem.sleepOnTime();
		System.out.println(sleep);
		String resp = mem.respectTo();
		System.out.println(resp);
		String care = mem.careFor();
		System.out.println(care);
		boolean pray = mem.pray();
		System.out.println(pray);
		boolean independent = mem.beingIndependent();
		System.out.println(independent);
		int member = mem.minMembers();
		System.out.println(member);
		double lunch = mem.lunchTime();
		System.out.println(lunch);
		double breakf = mem.breakfastTime();
		System.out.println(breakf);
		boolean unity = mem.unity();
		System.out.println(unity);
		boolean atten = mem.attendFamilyFunction();
		System.out.println(atten);
		double ret = mem.limitTime();
		System.out.println(ret);
		String frd = mem.friendsMaking();
		System.out.println(frd);
		boolean frdly = mem.friendlyWithAll();
		System.out.println(frdly);
		String cls = mem.attendClass();
		System.out.println(cls);
		String strg = mem.toString();
		System.out.println(strg);
		int hashcode = mem.hashCode();
		System.out.println(hashcode);
		boolean boo = mem.equals(mem);
		System.out.println(boo);
		

	}

}
