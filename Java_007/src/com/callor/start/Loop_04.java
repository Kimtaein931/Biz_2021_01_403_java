package com.callor.start;

public class Loop_04 {

	public static void main(String[] args) {

		int intSum = 0;
		int intStart = 10;
		int intEnd = 100;
		
		for (int i = intStart; i < intEnd; i++) {

//			int num1 = i + 1;
//			intSum += num1;
			intSum += (i + 1);
		}
		System.out.print(intStart);
		System.out.print(" 부터 ");
		System.out.print(intEnd);
		System.out.print(" 까지의 덧셈 : ");
		System.out.println(intSum);

	}
}
