package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

	/*
	 * 클래스의 extends(확장, 상속)
	 * 
	 * ScoreServiceV4 : Parent(부모) 클래스 
	 * ScoreServiceV1 : Child(자식) 클래스
	 * 
	 * 단순한 extends 부모 클래스에 정의된 모든 method를 코드 한 줄 추가, 수정 없이 그대로 사용할 수 있다.
	 * 
	 * 추가 extends 부모 클래스에 정의된 method와 새롭게 추가된 method가 있는 확장된 클래스의 생성
	 * 
	 */

	public int input(String subject) {
		/*
		 * 문자열형 변수 1개를 매개변수로 갖는 input() method
		 */
		
		// Scanner 클래스 객체 선언 -> import java.util.Scanner; 가 되어 있어야만 Scanner 사용 가능
		Scanner scan = new Scanner(System.in);
		
		// 정수형 변수 intScore를 선언하고 0으로 초기화
		int intScore = 0;
		
		while (true) {
			// 점수를 입력하라는 prompt 작성
			System.out.print(subject + "점수 입력 : ");
			
			// intScore 변수에 정수형 값을 입력
			intScore = scan.nextInt();
			
			// 만약 intScore가 0점 미만이라면 0점 이상 입력하라는 문구가 출력
			if (intScore < 0) {
				System.out.println(subject + "점수 0점 이상 입력");
			// 그게 아니고 intScore가 100점 초과라면 100점 이하 입력하라는 문구가 출력
			} else if (intScore > 100) {
				System.out.println(subject + "점수 100점 이하 입력");
			// intScore가 위의 내용에 전부 해당되지 않는다면 break
			} else {
				break;
			}

		}
		// intScore 변수에 입력한 점수를 출력
		// System.out.println("입력한 점수 : " + intScore);
		return intScore;
		
		// 호출한 코드에서
		// return 30; -> int intKor에 30을 담아라.
		// return 100; -> int intKor에 100을 담아라.
		
		// input() method가 하는 일
		// 점수를 입력받고 그 점수가 0점 미만이면 "점수 0점 이상 입력"이라는 문구가 뜨고, 100점 초과라면 "점수 100점 이하 입력"이라는 문구가 출력.
		// 둘 다 해당되지 않는다면 break 후 입력한 점수 출력
	}

}
