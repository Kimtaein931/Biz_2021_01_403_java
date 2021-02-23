package com.callor.applications.service;

public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime() method
	public int prime(int num) {
		int i = 0;
		for (i = 2; i < num; i++) {
			// true면 소수가 아니다.
			if (num % i == 0) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라.

				// 매개변수 값이 소수가 아니라면 -1을 return
				return -1;
			}
		}
		// num 값이 소수가 아니면 for() 반복문을 모두 수행한 뒤
		// num 값을 그대로 return

		// 매개변수 값이 소수라면 for() 반복문을 빠져나온 후
		// 매개변수 값을 return
		return num;
	}
}