package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];
		int intSum = 0;
		int intEvenSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

		// 배열에 저장된 전체 합계 계산
		for (int i = 0; i < intNum.length; i++) {
			intSum += intNum[i];
		}

		// 배열에 저장된 값 중 짝수들의 합계 계산
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				intEvenSum += intNum[i];
			}
		}
		System.out.printf("intNum 배열에 저장된 값의 합계 : %d\n", intSum);
		System.out.printf("intNum 배열에 저장된 값 중 짝수의 합 : %d\n", intEvenSum);
	}
}
