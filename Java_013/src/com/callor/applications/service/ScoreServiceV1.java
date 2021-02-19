package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	/*
	 * input(), sum(), avg(), print() 메서드 선언 
	 * 국어 영어 수학 총점 평균을 저장할 인스턴스 변수를 선언 
	 * input() 메서드에서 국어, 영어, 수학 성적을 키보드로 입력받아 인스턴스 변수에 저장 
	 * print() 메서드에서 인스턴스 변수에 저장된 국어, 영어, 수학 성적을 출력
	 */

	// 인스턴스 변수(클래스 영역에 선언된 변수들(멤버영역)) 선언
	// ScoreServiceV1 ssV1; 클래스를 객체로 선언하고
	// 초기화( = new SSV1() ) 
	// 인스턴스 : 객체가 초기화되면 자동으로 사용할 준비가 되는 변수들
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	
	Scanner scan = new Scanner(System.in);

	// input() method가 호출되면 키보드를 통해서 국어, 영어, 수학 점수를 입력받고
	// intKor, intEng, intMath에 저장
	public void input() {
		
		System.out.print("국어 점수 입력 >> ");
		intKor = scan.nextInt();
		System.out.print("영어 점수 입력 >> ");
		intEng = scan.nextInt();
		System.out.print("수학 점수 입력 >> ");
		intMath = scan.nextInt();
		
	}

	// 합계 점수
	public void sum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
	}

	// 평균 점수
	public void avg() {
		floatAvg = (float) intSum / 3;
	}

	// 입력받은 값 출력
	// intKor, intEng, intMath '인스턴스' 변수에 저장된 값을 출력
	// 인스턴스 변수 : 클래스 영역에 선언된 변수
	public void print() {
		System.out.println("=========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(intKor + "\t" 
							+ intEng + "\t" 
								+ intMath + "\t" 
									+ intSum + "\t" 
										+ floatAvg);
		
		// %3.2f : 실수값을 출력하는데 
		// 정수부분 3자리, 소수점 이하 2자리 출력
		// 소수점 이하 3번째에서 반올림
		System.out.println("=========================================");
		System.out.printf("평균 : %3.2f", floatAvg);
	}

}
