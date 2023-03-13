package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Dunzo;
import com.xworkz.interFace.implement.Rapido;
import com.xworkz.interFace.thing.Delivary;
import com.xworkz.interFace.usage.Person;

public class DelivaryRunner {

	public static void main(String[] args) {

		Delivary delivary = new Dunzo();

		Person per = new Person(delivary);
		per.owner();

		System.out.println("==========================");

		Delivary delivary1 = new Rapido();
		Person per1 = new Person(delivary1);
		per1.owner();

	}

}
