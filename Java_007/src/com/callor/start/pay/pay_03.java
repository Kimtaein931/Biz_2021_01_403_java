package com.callor.start.pay;

public class pay_03 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

		for (int i = 0; pay > 0; i++) {
			int count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권 : " + count);
			if (i % 2 == 0) { // i가 짝수이면 출력
				paper = paper / 5;
			} else { // 그렇지 않다면 출력
				paper = paper / 2;
			}
			

		}

	}

}