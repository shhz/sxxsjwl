package com.test.biz;

import com.test.conf.Math;
import com.test.util.MathRandom;

public class RandomBiz {
	// ��Ҫ�������ݿ���ж����ڼ�¼�Ĳ�ѯ�����
	public synchronized int random() {
		MathRandom mr = new MathRandom();
		// ���ﷵ�ص����н������id��(1-5)
		return mr.RandomEight();
	}

	/**
	 * ���ø���,����ȫ���İٷֱ�ֵ(��Ϊ1) �����ǰٷֱ�ֵ(С����ʽ)
	 */
	public boolean setRandom(double data1, double data2, double data3, double data4, double data5, double data6) {
		// �жϺ�Ϊ1
		double math = data1 + data2 + data3 + data4 + data5 + data6;
		if (math != 1) {
			// �Ͳ�Ϊ1���˳�ѭ��
			System.out.println("���ô�����ֵ֮�Ͳ�����1");
			return false;
		}

		// д������
		System.out.println("��ʼд���������");
		Math.MATH_ONE = data1;
		math = data1 + data2;
		Math.MATH_TWO = math;
		math = +data3;
		Math.MATH_THR = math;
		math = +data4;
		Math.MATH_FOR = math;
		math = +data5;
		Math.MATH_FIF = math;
		System.out.println("���óɹ�");
		return true;
	}

	/**
	 * �����н����������ֵ������1���н����򣬲���2����ֵ
	 */
	public void setMax(int type, int data) {
		switch (type) {
		case 1:
			Math.MATH_ONE_MAX = data;
			System.out.println("����һ ��ֵ" + data);
			break;
		case 2:
			Math.MATH_TWO_MAX = data;
			System.out.println("����� ��ֵ" + data);
			break;
		case 3:
			Math.MATH_THR_MAX = data;
			System.out.println("������ ��ֵ" + data);
			break;
		case 4:
			Math.MATH_FOR_MAX = data;
			System.out.println("������ ��ֵ" + data);
			break;
		case 5:
			Math.MATH_FIF_MAX = data;
			System.out.println("������ ��ֵ" + data);
			break;
		default:
			break;
		}
	}

	public void show() {
		System.out.println("-----------------���������--------------------");
		System.out.println("����һ:" + 0.00 + " �� " + Math.MATH_ONE);
		System.out.println("�����:" + Math.MATH_ONE + " �� " + Math.MATH_TWO);
		System.out.println("������:" + Math.MATH_TWO + " �� " + Math.MATH_THR);
		System.out.println("������:" + Math.MATH_THR + " �� " + Math.MATH_FOR);
		System.out.println("������:" + Math.MATH_FOR + " �� " + Math.MATH_FIF);
		System.out.println("������:" + Math.MATH_FIF + " �� " + 1);
		System.out.println("-----------------��������----------------------");
		System.out.println("����һ���� ��" + Math.MATH_ONE_MAX);
		System.out.println("��������� ��" + Math.MATH_TWO_MAX);
		System.out.println("���������� ��" + Math.MATH_THR_MAX);
		System.out.println("���������� ��" + Math.MATH_FOR_MAX);
		System.out.println("���������� ��" + Math.MATH_FIF_MAX);
		System.out.println("���������� ��������");
		System.out.println("---------------------------------------------\n\n");
	}
}
