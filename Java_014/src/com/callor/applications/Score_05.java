package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

/*
 * 창조적 개발자의 3대 신공
 * - Copy and Paste
 * 		Copy Understand and Paste
 * 
 * - Divide and Conquer(나누어서 정복하라)
 *
 */

public class Score_05 {

	public static void main(String[] args) {
		/*
		 * 학생 이름을 홍길동, 이몽룡, 성춘향 이름으로 strName 배열 선언 Random 클래스를 이용하여 3명 학생의 국어, 영어, 수학
		 * 점수를 1 ~ 100 중 값으로 생성 후 저장, 출력
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };

		// 학생이름 배열 개수만큼 과목성적을 저장할 배열 선언
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		// 학생이름 배열 개수만큼 총점과 평균을 계산 저장할 배열 선언
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];

		// 학생별로 점수를 입력(생성)하는 코드
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = ran.nextInt(100) + 1;
			intEng[i] = ran.nextInt(100) + 1;
			intMath[i] = ran.nextInt(100) + 1;
		}

		// 학생별로 총점을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}

		// 학생별로 평균을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
		}

		// 성적리스트 제목
		System.out.println("==============================================");
		System.out.println("빛나리 학습 성적일람표");
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");

		// 성적리스트 출력
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}

		System.out.println("----------------------------------------------");

	}

}