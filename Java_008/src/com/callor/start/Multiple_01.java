package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		// 7 ~ 106까지 범위 수 중에서 3의 배수가 아닌 수들의 합을 구하시오.
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			int sum = i + 7;
			boolean bool = sum % 3 == 0;
			if (!bool) {
				intSum += sum;
			}
		}
		System.out.println("3의 배수가 아닌 수들의 합은 : " + intSum);

	}

}
