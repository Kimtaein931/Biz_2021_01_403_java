package com.callor.start;

public class Multiple_02 {

	public static void main(String[] args) {
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수 선언
		int intSum = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if(!bYes) {
				intSum += num;
			}
		}
		
		intSum = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 != 0;
			if(bYes) {
				intSum += num;
			}
		}

	}

}
