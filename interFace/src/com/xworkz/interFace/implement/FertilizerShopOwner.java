package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.FarmRule;

public class FertilizerShopOwner implements FarmRule {

	@Override
	public boolean seasonfarming() {
		return true;
	}

	@Override
	public boolean seasonRain() {
		return false;
	}

}
