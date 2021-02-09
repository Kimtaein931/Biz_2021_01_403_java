package com.callor.start.random;

import java.util.Random;
/*
 * Copy & Understand, Past
 * 복사 붙이기 ( Ctrl + C, Ctrl + V)
 */

public class Random_06 {

	public static void main(String[] args) {
		// 1 ~ 100 까지 임의의 숫자 100개를 만들고 생성된 숫자 중 '34'보다 큰 값이 나오면 몇 번째인지 보여주고 반복문을 중단하시오.

		Random rnd = new Random();
//		int intNum = 0;
//		for (int i = 0; i < 100; i++) {
//			int num = rnd.nextInt(100) + 1; // 0 ~ 99 -> 1 ~ 100
//			intNum = i + 1;
//			boolean bYes = num < 5;
//			if (bYes) {
//				System.out.println(intNum + "번째 " + num);
//				break;
//			}
//		}

		int intEnd = 100;
		int count = 0;
		for (count = 0; count < intEnd; count++) {

			int num = rnd.nextInt(100) + 1;
			if (num < 5) {
				break;
			}

		}
		// count 값을 읽을 수 있다.
		// 만약 for() 반복문이 중단되지 않고 모두 정상적으로 수행되고나면
		// count 와 intEnd 는 count == intEnd 가 된다.

		if (intEnd > count) {
			// for()가 어떤 이유로 중간에 break 되었다.
			System.out.println("for() 중단");
			System.out.println((count + 1) + " 번째에서 값 발견");
		} else {
			System.out.println("for() 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
		if (intEnd <= count) {
			// for()가 정상 종료되었다.
		}
	}
}
