package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {
		/*
		 * 1. HomeWork_01의 main() method에서 Random 클래스를 사용하여
		 * 2. 임의의 정수 100개를 만들고
		 * 3. PrimeServiceV2의 prime() method를 호출하여
		 * 4. 임의의 정수 100개 중 소수인 수들의 리스트를 출력
		 * 5. 소수인 수들의 합을 계산하여 출력
		 */
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();
		
		/*
		 * 이 두 개의 변수는 for() 반복문에서 수행한 연산
		 * 덧셈, 개수세기를 수행한 후
		 * 결과를 출력하는 곳에서 사용해야할 변수이다.
		 * 따라서 for() 반복문이 시작되기 전에 변수를 선언 및 초기화 해두어야한다.
		 */
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		int[] rndNum = new int[100];
		int result = 0;
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(100) + 2;
			// psV2 클래스의 prime() method는
			// rndNum가 소수이면 그 수를 그대로 return하고
			// 아니면 -1을 return
		}
		for (int i = 0; i < rndNum.length; i++) {
			result = psV2.prime(rndNum[i]);
			if (result > 0) {
				System.out.println("소수 리스트 : " + result);
			}
			// 소수들의 합을 계산
			if(result > 0) {
				intPrimeSum += result;
			}
			// 소수들의 개수 세기
			if(result > 0) {
				intPrimeCount++;
			}
		} // end for
		System.out.println("소수 합계 : " + intPrimeSum);
		System.out.println("소수 개수 : " + intPrimeCount);
	}

}
