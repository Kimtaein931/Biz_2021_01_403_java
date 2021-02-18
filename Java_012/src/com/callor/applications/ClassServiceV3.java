package com.callor.applications;

import java.util.Scanner;

public class ClassServiceV3 {

	/*
	 * 1. 
	 * a. 정수형 intNum1, intNum2 인스턴스변수 선언
	 * b. Scanner 클래스를 사용하여 scan 인스턴스변수 선언
	 * 
	 * 2. input() method 선언
	 * a. 두 개의 숫자를 키보드로 입력 받아 각각 인스턴스변수 intNum1, intNum2에 저장
	 * 
	 * 3. algebra() method 선언
	 * a. 인스턴스변수 intNum1과 intNum2 변수 값을 사용하여 사칙연산 결과를 출력
	 * 
	 * 4. Class_02의 main() method에서 호출하여 실행
	 */
	
	int intNum1, intNum2;
	Scanner scan = new Scanner(System.in);
	
	public void input() {
		System.out.print("숫자 1번 입력 : ");
		intNum1 = scan.nextInt();
		System.out.print("숫자 2번 입력 : ");
		intNum2 = scan.nextInt();
		
	}
	
	public void algebra() {
		System.out.println("==============================");
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1+intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1-intNum2));
		System.out.println(intNum1 + " * " + intNum2 + " = " + intNum1*intNum2);
		System.out.println(intNum1 + " / " + intNum2 + " = " + intNum1/intNum2);
		System.out.println("==============================");
	}
	
	
}
