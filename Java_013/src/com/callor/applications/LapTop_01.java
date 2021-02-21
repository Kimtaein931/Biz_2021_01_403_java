package com.callor.applications;

import java.util.Scanner;

public class LapTop_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 입력 >> ");
		int student = scan.nextInt();
		int[] intKor = new int[student];
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생 국어 점수 : ", (i + 1));
			intKor[i] = scan.nextInt();
			
		}
		System.out.println("===============================");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생 점수 : %d\n", (i + 1), intKor[i]);
		}
	}

}
