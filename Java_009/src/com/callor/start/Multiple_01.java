package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int intSum = 0;
		int num = 0;
		for (int i = 0; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			// 3의 배수이면서 9의 배수
			if (bYes3M && bYes9M) {
				System.out.println("3의 배수이면서 9의 배수인 수 : " + num1);
				intSum += num1;
			}
		}
		System.out.println("3의 배수이면서 9의 배수인 수들의 합은 : " + (intSum));
		
		System.out.println("===========================================");
		intSum = 0;
		for(int i = 0; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			// if() 비교연산문을 중복 처리하는 방식
			if(bYes3M) { // 3의 배수를 검사하고 맞으면
				if(bYes9M) { // 9의 배수를 검사하는 방식
					intSum += num1;
					System.out.println("3의 배수이면서 9의 배수인 수 : " + num1);
				}
			}
		}
		System.out.println("3의 배수이면서 9의 배수인 수들의 합 : " + intSum);
	}
}
