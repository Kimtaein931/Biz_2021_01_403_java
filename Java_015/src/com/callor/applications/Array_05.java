package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		// 배열 선언과 인스턴스 변수 선언
		int[] intNums = new int[100];
		Random rnd = new Random();
		
		// Random 클래스의 nextInt() method를 사용하여 1 ~ 100까지 중 임의의 수 배열에 대입
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		System.out.println("3의 배수이면서 5의 배수인 값");
		
		// 3의 배수이면서 5의 배수인 값들을 합하는 변수 listSum 선언
		int listSum = 0;
		
		// 3의 배수이면서 5의 배수인 값들을 listSum에 누적하며 더하고, 해당하는 값 출력
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 3 == 0 && intNums[i] % 5 == 0) {
				listSum += intNums[i];
				System.out.println(i + "번째 값 : " + intNums[i]);
			}
		}
		
		// listSum에 들어있는 합 출력
		System.out.println("3의 배수이면서 5의 배수인 값의 합 : " + listSum);
	}
}
