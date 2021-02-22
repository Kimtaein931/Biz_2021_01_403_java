package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		/*
		 * 1. 학생 3명의 이름, 국어, 영어, 수학 점수를 저장할 배열 strName, intKor, intEng, intMath를 선언 2.
		 * 키보드를 통해 3명 학생의 이름, 국어, 영어, 수학 점수를 입력 받고 배열에 저장
		 */

		Scanner scan = new Scanner(System.in);
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		for (int i = 0; i < strName.length; i++) {
			int num = i + 1;
			System.out.print(num + "번 째 학생 이름 : ");
			strName[i] = scan.nextLine();
			System.out.print("국어 점수 : ");
			String str = scan.nextLine();
			intKor[i] = Integer.valueOf(str);
			System.out.print("영어 점수 : ");
			intEng[i] = Integer.valueOf(str);
			System.out.print("수학 점수 : ");
			intMath[i] = Integer.valueOf(str);
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
