package com.callor.start.pay;

public class pay_05 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;
		int sw = -1;

		/*
		 * 일반적으로 for() 반복문은 반복되는 횟수가 명확할 때 사용
		 * while(조건문) 반복문은 반복되는 횟수가 경우에 따라 다를 때 사용
		 * 			   조건을 부여하여 반복수행을 결정
		 * 			   조건문이 true 일 때만 반복하고 조건문이 false가 되면 종료한다.
		 */
		
		while (pay > 0) {
			int count = pay / paper;
			pay -= (paper * count);
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