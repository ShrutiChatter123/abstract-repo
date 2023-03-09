package com.xworkz.interFace.implement;

import com.xworkz.interFace.thing.ExamRule;

public class Squide implements ExamRule {

	@Override
	public double timing() {
		return 10;
	}

	@Override
	public boolean extraTime() {
		return false;
	}

}
