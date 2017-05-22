package com.test.util;

import com.test.conf.Math;

public class MathRandom {
	/**
	 * 生成一个随机小数之后进行区域范围匹配，输出对应区域并且返还对应区域的数值
	 */
	public int RandomEight() {
		double random = java.lang.Math.random();
		if (random <= com.test.conf.Math.MATH_ONE) {
			if (testMax(1)) {
				System.out.println("抽奖区域1");
				return 1;
			}
		} else if (random <= com.test.conf.Math.MATH_TWO) {
			if (testMax(2)) {
				System.out.println("抽奖区域2");
				return 2;
			}
		} else if (random <= com.test.conf.Math.MATH_THR) {
			if (testMax(3)) {
				System.out.println("抽奖区域3");
				return 3;
			}
		} else if (random <= com.test.conf.Math.MATH_FOR) {
			if (testMax(4)) {
				System.out.println("抽奖区域4");
				return 4;
			}
		} else {
			System.out.println("抽奖区域5");
			return 5;
		}
		System.out.println("区域已达上限");
		return 5;
	}

	/**
	 * 先进行判断上限是否为零 之后上限值进行自减并返还 true 若上限已为零则返还 false 参数是对应区域的值 int
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
