package com.callor.start.logic;

public class Logic_05 {

	/*
	 * 화폐매수 계산
	 * 
	 * 4,789,800원 95 3 1 4 1 3
	 */

	public static void main(String[] args) {

		// 급여
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = pay / paper;
		// 정수를 정수로 나누는 연산을 했을 경우
		// 결과도 정수(몫)으로 나타내는 연산 규칙을 활용한 방식
		
		System.out.println(paper + "원권 : " + count);
		
		// 1만원권 계산
		// pay에서 5만원권 금액만큼 제외하고 1만원권 매수를 계산한다.
		pay -= (paper * count);
		paper = paper / 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		

	}

}
