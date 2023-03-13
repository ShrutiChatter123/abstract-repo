package com.xworkz.interFace.boot;

import com.xworkz.interFace.implement.Abharan1;
import com.xworkz.interFace.implement.DevendraSetu1;
import com.xworkz.interFace.implement.Mahalakshmi1;
import com.xworkz.interFace.implement.Malabar;
import com.xworkz.interFace.thing.GoldSeller;
import com.xworkz.interFace.usage.Anita1;
import com.xworkz.interFace.usage.Bhairavi1;
import com.xworkz.interFace.usage.Priyanka1;
import com.xworkz.interFace.usage.Shruti1;

public class GolSeller1Runner {

	public static void main(String[] args) {

		GoldSeller goldSeller = new Malabar();

		Anita1 ani = new Anita1(goldSeller);
		ani.buyGold();

		System.out.println("----------------");

		GoldSeller goldSeller1 = new DevendraSetu1();

		Priyanka1 pre = new Priyanka1(goldSeller1);
		pre.purchaseGold();

		System.out.println("----------");

		GoldSeller goldSeller2 = new Abharan1();
		Shruti1 shru = new Shruti1(goldSeller2);
		shru.ChinnaTago();

		System.out.println("------------------");

		GoldSeller goldSeller3 = new Mahalakshmi1();

		Bhairavi1 bhai = new Bhairavi1(goldSeller3);
		bhai.bangarKaridi();

	}
}
