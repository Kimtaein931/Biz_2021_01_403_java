package com.callor.start;

public class Loop_05 {

	public static void main(String[] args) {
		
		int intSum = 0;
		for(int i = 0; i < 10; i += 2) {
			intSum += (i + 1);
			// 0부터 10 미만의 숫자 중 홀수들의 합
		}
		System.out.println(intSum);
	}
}
