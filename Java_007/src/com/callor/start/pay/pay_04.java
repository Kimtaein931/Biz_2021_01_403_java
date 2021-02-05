package com.callor.start.pay;

public class pay_04 {
/*
 * 
 * 이 코드는 for() 반복문의 코드 실행순서를 참조하는 용도이며
 * pay 계산에는 오류가 있다.
 * 
 */
	public static void main(String[] args) {

		int paper = 50_000;
		int sw = -1;
		int count = 0;
		for (int pay = 4_789_800; pay > 0; pay -= paper * count) {
			count = pay / paper;

			System.out.println(paper + "원권 : " + count);
			if (sw < 0) { // sw가 0보다 작으면 출력
				paper = paper / 5;
			} else { // 그렇지 않다면 출력
				paper = paper / 2;
			}
			sw *= (-1);

		}

	}

}
