package com.callor.applications.service;

public class PrimeServiceV2 {

	public void prime(int[] num) {
		int sum = 0;
		int i = 0;
		for (i = 2; i < num.length; i++) {
			boolean byes = num[i - 2] % i == 0;
			if (!byes) {
				sum += num[i];
				System.out.println(num[i]);
			}
		}
		System.out.println("합계 : " + sum);
	}
}
