package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.DanceCompitationRule;

public class Judges implements DanceCompitationRule{

	@Override
	public int age() {
		return 18;
	}

	@Override
	public boolean money() {
		return false;
	}

}
