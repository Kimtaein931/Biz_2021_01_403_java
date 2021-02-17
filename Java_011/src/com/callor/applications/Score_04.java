package com.callor.applications;

import com.callor.applications.service.ScoreServiceV3;

public class Score_04 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scV3 = new ScoreServiceV3();
		
		// ScoreServiceV3 클래스의 2번째 sum() method 호출
		scV3.sum();
		
		// ScoreServiceV3 클래스의 1번째 sum(int num1, int num2) method 호출
		scV3.sum(20, 40);
		
		// 실수형 변수 fnum1과 fnum2에 담긴 값을 
		// sum() method에 전달하면서 호출
		float fnum1 = 43.25f;
		float fnum2 = 32.11f;
		
		scV3.sum(fnum1, fnum2);
		
		scV3.sum(100D, fnum1);
		scV3.sum((double)100, fnum1);
	}
	
}
