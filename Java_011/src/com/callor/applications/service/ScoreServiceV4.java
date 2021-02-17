package com.callor.applications.service;

public class ScoreServiceV4 {

//	public void score(int intSum, float floatAvg) {
//		// 총점(intSum), 평균(floatAvg)을 전달받는 매개변수
//		System.out.println("총점 : " + intSum);
//		System.out.println("평균 : " + floatAvg);
//	}
//	
	public void print(int intKor, int intEng, int intMath) {
//		int sum = intKor + intEng + intMath;
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		float avg = (float)sum / 3;
		System.out.println("=======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(sum + "\t");
		System.out.println(avg);
		System.out.println("=======================================");
		
	}
}
