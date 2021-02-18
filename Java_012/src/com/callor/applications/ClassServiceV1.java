package com.callor.applications;

public class ClassServiceV1 {
	/*
	 * 1. add() 메서드 3개 생성
	 * a. 정수 2개를 매개변수로 받아 덧셈 계산 후 출력
	 * b. 정수 1개, float형 실수 1개를 매개변수로 받아 덧셈 계산 후 출력
	 * c. double형 실수 1개, float형 실수 1개를 매개변수로 받아
	 * 4칙 연산 수행한 후 다음과 같이 출력
	 * (값은 임의로 설정)
	 * 예) 30.2 x 21.2 = ??
	 * 
	 * 2. Class_01의 main() method에서 호출하여 실행
	 */
	
	public void add(int intA, int intB) {
		
		System.out.println(intA + " + " + intB + " = " + (intA + intB));
		
	}
	
	public void add(int intA, float floatB) {
		
		System.out.println(intA + " + " + floatB + " = " + (intA + floatB));
		
	}
	
	public void add(double doubleA, float floatB) {
		
		System.out.println(doubleA + " + " + floatB + " = " + (doubleA + floatB));
		System.out.println(doubleA + " - " + floatB + " = " + (doubleA - floatB));
		System.out.println(doubleA + " x " + floatB + " = " + (doubleA * floatB));
		System.out.println(doubleA + " / " + floatB + " = " + (doubleA / floatB));
		
	}
	
	
}
