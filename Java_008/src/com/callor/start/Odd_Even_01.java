package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {

		// for() 반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오.
		// 1 ~ 100까지 범위 수 중에서 짝수들의 합을 구하시오.
		// 1 ~ 100까지 범위 수 중에서 홀수들의 합을 구하시오.

//		int intEven = 0;
//		int intOdd = 0;
//
//		for (int i = 0; i < 100; i++) {
//			int num = i + 1;	
//			if (num % 2 == 0) {
//				// 짝수 비교를 위해 나머지(%)를 사용
//				a += num;
//			}
//		}
//		System.out.println("1 ~ 100 중 짝수들의 합은 : " + a);
//
//		for (int i = 0; i < 100; i++) {
//			int num1 = i + 1;	
//			if (num1 % 2 == 1) {
//				// 홀수 비교를 위해 나머지(%)를 사용
//				b += num1;
//			}
//		}
//		System.out.println("1 ~ 100 중 홀수들의 합은 : " + b);
//
		int i = 0;
		int intEven = 0;
		int intOdd = 0;
		while (true) {
			 int sum = i;
			 int num = i;
			 if (sum % 2 == 0) {
				 intEven += sum;
			 }
			 if (sum % 2 == 1) {
				 intOdd += num;
			 }
			 i++;
			 if(i > 100) {
				 break;
			 }
			
		}
		System.out.println("짝수들의 합 : " + intEven);
		System.out.println("홀수들의 합 : " + intOdd);
		
		int intSumEven = 0;
		int intSumOdd = 0;
//
//		for (int i = 0; i < 100; i++) {
//			int num1 = i + 1;
//			boolean bYes = num1 % 2 == 0;
//			if (bYes) {
//				intSumEven += num1;
//			}
//		}
//
//		for (int i = 0; i < 100; i++) {
//			int num2 = i + 1;
//			boolean bYes = num2 % 2 == 1;
//			if (bYes) {
//				intSumOdd += num2;
//			}
//
//		}
//		System.out.println("짝수의 합 : " + intSumEven);
//		System.out.println("홀수의 합 : " + intSumOdd);

		// for() 반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오.
		// 1 ~ 100까지 범위 수 중에서 3의 배수들의 합을 구하시오.
//
//		int sum = 0;
//		for (int i = 0; i < 100; i++) {
//			int num = i + 7;
//			if (num % 3 == 0) {
//				sum += num;
//				System.out.println("3의 배수는 : " + num);
//			}
//		}
//		System.out.println("3의 배수의 합은 : " + sum);

		// 위에서 선언하고 사용했던 변수를 재사용할 때는 반드시 초기화(clear)를 해야 한다.
		intSumOdd = 0;
		for (int id = 0; id < 100; id++) {
			int num = id + 1;
			boolean bYes = num % 2 == 0;

			// bYes가 true가 아니면 (! : not, 부정형)
			if (!bYes) {
				intSumOdd += num;
			}

		}

		System.out.println("홀수의 합 : " + intSumOdd);

	}

}
