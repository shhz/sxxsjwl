package com.test.util;

import com.test.conf.Math;

public class MathRandom {
	/**
	 * ����һ�����С��֮���������Χƥ�䣬�����Ӧ�����ҷ�����Ӧ�������ֵ
	 */
	public int RandomEight() {
		double random = java.lang.Math.random();
		if (random <= com.test.conf.Math.MATH_ONE) {
			if (testMax(1)) {
				System.out.println("�齱����1");
				return 1;
			}
		} else if (random <= com.test.conf.Math.MATH_TWO) {
			if (testMax(2)) {
				System.out.println("�齱����2");
				return 2;
			}
		} else if (random <= com.test.conf.Math.MATH_THR) {
			if (testMax(3)) {
				System.out.println("�齱����3");
				return 3;
			}
		} else if (random <= com.test.conf.Math.MATH_FOR) {
			if (testMax(4)) {
				System.out.println("�齱����4");
				return 4;
			}
		} else {
			System.out.println("�齱����5");
			return 5;
		}
		System.out.println("�����Ѵ�����");
		return 5;
	}

	/**
	 * �Ƚ����ж������Ƿ�Ϊ�� ֮������ֵ�����Լ������� true ��������Ϊ���򷵻� false �����Ƕ�Ӧ�����ֵ int
	 */
	private boolean testMax(int type) {
		switch (type) {
		case 1:
			if (Math.MATH_ONE_MAX > 0) {
				Math.MATH_ONE_MAX--;
				return true;
			}
			break;
		case 2:
			if (Math.MATH_TWO_MAX > 0) {
				Math.MATH_TWO_MAX--;
				return true;
			}
			break;
		case 3:
			if (Math.MATH_THR_MAX > 0) {
				Math.MATH_THR_MAX--;
				return true;
			}
			break;
		case 4:
			if (Math.MATH_FOR_MAX > 0) {
				Math.MATH_FOR_MAX--;
				return true;
			}
			break;

		default:
			break;
		}
		return false;
	}
}
