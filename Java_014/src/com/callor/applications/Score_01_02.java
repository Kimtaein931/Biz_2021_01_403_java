package com.callor.applications;

import java.util.Scanner;

public class Score_01_02 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// 학생별로 과목 전체 점수 입력받기

		Scanner scan = new Scanner(System.in);

		for (int index = 0; index < intKor.length; index++) {
			int num = index + 1;

			System.out.println(num + " 학생 성적을 입력하세요.");

			System.out.print("국어 점수 : ");
			intKor[index] = scan.nextInt();

			System.out.print("영어 점수 : ");
			intEng[index] = scan.nextInt();

			System.out.print("수학 점수 : ");
			intMath[index] = scan.nextInt();

			System.out.println("========================");
		}

		System.out.println("국어\t영어\t수학");
		for (int index = 0; index < intKor.length; index++) {
			System.out.println(intKor[index] + "\t" + intEng[index] + "\t" + intMath[index]);
		}

	}

}
