package com.callor.applications.service;

	/*
	 * -Java의 class와 method() 호출
	 * ScoreService 클래스에는 main() method가 없어서 
	 * 여기에 있는 코드는 직접 Run(^F11)하여 실행할 수 없다.
	 * 누군가가 ScoreService를 객체, 인스턴스로 만들고
	 * score() method를 호출해주어야만 코드를 실행할 수 있다.
	 */

public class ScoreService {
	/*
	 * Class 와 Method의 명명법
	 * Class : 첫 글자 영문 대문자, 이후는 영문 대소문자, 숫자
	 * Method : 첫 글자 영문 소문자, 이후는 영문 대소문자, 숫자
	 * 
	 * Class 명명법 (Upper) CamelCase라고 한다.
	 * Method 명명법 (Lower) CamelCase라고 한다.
	 */

	// 성적을 입력 받는 method
	public void score(int kor, int eng, int mat) {

		// main() method에서 넘어온 kor, eng, mat 값을 sum에 합하고 출력
		int sum = kor + eng + mat;

		// 평균 계산 (강제 형변환)
		float avg = (float) sum / 3;

		// 출력
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(sum + "\t");
		System.out.println(avg + "\t");
		System.out.println("===========================================");

	}

}
