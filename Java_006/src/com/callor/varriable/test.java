package com.callor.varriable;

public class test {

	public static void main(String[] args) {

		System.out.println("====================");
		System.out.println("      구구단 시작       ");
		System.out.println("--------------------");

		int intDan = 0;
		int num1 = 0;
		for (int i = 2; i <= 9; i++) {
			intDan = i;
			for (int q = 1; q <= 9; q++) {
				num1 = q;
				System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
			}
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
			System.out.println("--------------------");
		}
		
		System.out.println("====================");
		System.out.println("      구구단 종료       ");
		System.out.println("--------------------");

		
	}
}
