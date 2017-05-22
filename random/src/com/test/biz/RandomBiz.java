package com.test.biz;

import com.test.conf.Math;
import com.test.util.MathRandom;

public class RandomBiz {
	// 需要连接数据库进行对往期记录的查询和添加
	public synchronized int random() {
		MathRandom mr = new MathRandom();
		// 这里返回的是中奖区域的id数(1-5)
		return mr.RandomEight();
	}

	/**
	 * 设置概率,设置全部的百分比值(和为1) 参数是百分比值(小数形式)
	 */
	public boolean setRandom(double data1, double data2, double data3, double data4, double data5, double data6) {
		// 判断和为1
		double math = data1 + data2 + data3 + data4 + data5 + data6;
		if (math != 1) {
			// 和不为1则退出循环
			System.out.println("设置错误，六值之和不等于1");
			return false;
		}

		// 写入数据
		System.out.println("开始写入区域概率");
		Math.MATH_ONE = data1;
		math = data1 + data2;
		Math.MATH_TWO = math;
		math = +data3;
		Math.MATH_THR = math;
		math = +data4;
		Math.MATH_FOR = math;
		math = +data5;
		Math.MATH_FIF = math;
		System.out.println("设置成功");
		return true;
	}

	/**
	 * 设置中奖区域的上限值，参数1是中奖区域，参数2是数值
	 */
	public void setMax(int type, int data) {
		switch (type) {
		case 1:
			Math.MATH_ONE_MAX = data;
			System.out.println("区域一 数值" + data);
			break;
		case 2:
			Math.MATH_TWO_MAX = data;
			System.out.println("区域二 数值" + data);
			break;
		case 3:
			Math.MATH_THR_MAX = data;
			System.out.println("区域三 数值" + data);
			break;
		case 4:
			Math.MATH_FOR_MAX = data;
			System.out.println("区域四 数值" + data);
			break;
		case 5:
			Math.MATH_FIF_MAX = data;
			System.out.println("区域五 数值" + data);
			break;
		default:
			break;
		}
	}

	public void show() {
		System.out.println("-----------------随机数区域--------------------");
		System.out.println("区域一:" + 0.00 + " 到 " + Math.MATH_ONE);
		System.out.println("区域二:" + Math.MATH_ONE + " 到 " + Math.MATH_TWO);
		System.out.println("区域三:" + Math.MATH_TWO + " 到 " + Math.MATH_THR);
		System.out.println("区域四:" + Math.MATH_THR + " 到 " + Math.MATH_FOR);
		System.out.println("区域五:" + Math.MATH_FOR + " 到 " + Math.MATH_FIF);
		System.out.println("区域六:" + Math.MATH_FIF + " 到 " + 1);
		System.out.println("-----------------上限区域----------------------");
		System.out.println("区域一上限 ：" + Math.MATH_ONE_MAX);
		System.out.println("区域二上限 ：" + Math.MATH_TWO_MAX);
		System.out.println("区域三上限 ：" + Math.MATH_THR_MAX);
		System.out.println("区域四上限 ：" + Math.MATH_FOR_MAX);
		System.out.println("区域五上限 ：" + Math.MATH_FIF_MAX);
		System.out.println("区域六上限 ：无限制");
		System.out.println("---------------------------------------------\n\n");
	}
}
