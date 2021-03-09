package com.callor.student;

/*
 * ========================
 * 구구단 7단
 * ------------------------
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63
 * ------------------------
 */

public class Ex_10 {

	public static void main(String[] args) {
		
		int dan = 7;
		System.out.println("============================");
		System.out.println("구구단 " + dan + "단");
		System.out.println("----------------------------");
		for(int i = 0; i < 9; i++) {
			int num = i + 1;
			System.out.println(dan + " * " + num + " = " + (dan * num));
		}
		System.out.println("----------------------------");
		
	}
	
}
