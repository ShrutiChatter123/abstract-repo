package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.HoliRule;

public class Festival implements HoliRule {

	@Override
	public String chemicalFree() {
		return "Acidic contents";
	}

	@Override
	public boolean restrictedTime() {
		return false;
	}

	
}
