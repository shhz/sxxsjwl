package com.test.test;

import com.test.biz.RandomBiz;

public class test {
	public static void main(String[] args) {
		RandomBiz rb = new RandomBiz();
		rb.show();
		rb.setRandom(0.1, 0.1, 0.1, 0.1, 0.5, 0.1);
		int a = 0;
		while (a != 1) {
			System.out.println("≤‚ ‘1");
			a = rb.random();
		}
		a = 0;
		int b = 0;
		while (a != 1 && b != 100) {
			System.out.println("≤‚ ‘2");
			a = rb.random();
			b++;
		}
		rb.show();

		rb.setMax(1, 200);
		rb.show();

	}

}
