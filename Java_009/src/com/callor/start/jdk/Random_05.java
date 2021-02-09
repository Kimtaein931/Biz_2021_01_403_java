package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		// 1 ~ 100까지 임의의 숫자 100개를 만들고 그 수들 중에서 짝수들만의 합을 구하시오.
		Random rnd = new Random();
		int evenSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			int even = rnd.nextInt(100) + 1;
			boolean bYes = even % 2 == 0;
			if (bYes) {
				evenSum += even;
				System.out.println("Random 숫자 100 중 " + num + "번 째 짝수 :  " + even);
			}
		}
		System.out.println("1 ~ 100까지 임의의 숫자 중 짝수들의 합은 : " + evenSum);

	}

}
