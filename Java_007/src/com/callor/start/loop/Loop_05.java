package com.callor.start.loop;

public class Loop_05 {

	public static void main(String[] args) {

		int intSum = 0;
		for (int i = 0; i < 10; i += 2) {
			intSum += (i + 1);
			// 0부터 10 미만의 숫자 중 홀수들의 합
		}
		System.out.println("0 부터 10 미만의 숫자 중 홀수들의 합 : " + intSum);
		intSum = 0; // intSum을 clear 하지 않으면 이후의 계산 결과가 엉뚱한 값이 나온다.
		for (int i = 1; i < 10; i += 2) {
			intSum += (i + 1);
		}
		intSum = 0;
		for (int i = 0; i < 10; i += 2) {
			intSum += (i + 1);
		}
	}
}
