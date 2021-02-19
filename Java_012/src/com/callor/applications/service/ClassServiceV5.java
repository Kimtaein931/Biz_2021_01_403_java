package com.callor.applications.service;

public class ClassServiceV5 {

	
	/*
	 * 1. sum(float num1, float num2) method 선언
	 * sum() method는 num1과 num2를 덧셈하여 return
	 * 
	 * 2. Class_03의 main() method에서 sum() method를 호출하면서 실수 55.2와 33.7을 전달
	 * 
	 * 3. sum() method가 return한 결과를 result 변수에 저장
	 * 
	 * 4. result 변수에 담긴 결과를 console에 출력
	 */
	
	public float sum(float num1, float num2) {
		float sum = num1 + num2;
		return sum;
	}
}
