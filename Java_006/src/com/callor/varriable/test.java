package com.callor.varriable;

public class test {

	public static void main(String[] args) {
		
		System.out.println("====================");
		System.out.println("      구구단 연습");
		System.out.println("--------------------");
		
		int intDan = 2;
		int num1 = 1;
		for(int i = 2; i <= 9; i++) {
			for(int q = 1; q<= 9; q++) {
				num1 = q;
				System.out.println(intDan + " x " + num1);
			}
			intDan = i;
			System.out.println(intDan + " x " + num1);
			System.out.println();
		}
	
	}
}
