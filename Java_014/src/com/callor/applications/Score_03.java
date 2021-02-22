package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {
		/*
		 * 학생 이름을 홍길동, 이몽룡, 성춘향 이름으로 strName 배열 선언 
		 * Random 클래스를 이용하여 3명 학생의 국어, 영어, 수학 점수를 1 ~ 100 중 값으로 생성 후 저장, 출력
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = ran.nextInt(100) + 1;
			intEng[i] = ran.nextInt(100) + 1;
			intMath[i] = ran.nextInt(100) + 1;
		}
		System.out.println("==================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------");
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("----------------------------------");

	}

}