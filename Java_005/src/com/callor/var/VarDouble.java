package com.callor.var;

/*
 * 실수, 배정도실수
 * 
 * int : 2^32 범위의 숫자 표현
 * double : 2^64 범위의 숫자표현
 * 	소수점 자릿수 감안
 * 	소수점 이하 16자리까지 표현
 * 
 * 컴퓨터에서 큰 수를 저장(표현)하는 방법
 * 	323.0000
 * 	= 3.23000 x 10^2
 * 	= 3.23E2  E2 -> 10^2승을 표현
 * 
 * 
 */

public class VarDouble {
	
	public static void main(String[] args) {
		
		double num1 = 30.0;
		double num2 = 40.0;
		double num3 = 50;
		double num4 = 50.1111111111111111111111111;
		double num5 = 50.0000000000000000000000000;
		double num6 = 50.2222222222222222222222222;
		double num7 = 50.5555555555555555555555555;
		
		/*
		 * 1. double형 변수를 선언하고 실수 30.0을 저장하라.
		 * 2. double형 변수를 선언하고 실수 40.0을 저장하라.
		 */
		
		System.out.println(num1 + num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}
}
