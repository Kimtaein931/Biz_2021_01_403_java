package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {
		/*
		 * 학생 3명의 국어, 영어, 수학 점수를 저장할 배열 intKor, intEng, intMath를 선언 키보드를 통해 3명 학생의 국어,
		 * 영어, 수학 점수를 입력받고 배열에 저장 후 console에 리스트를 출력하기
		 * 
		 * 1. 학생 3명의 3과목 점수를 저장할 배열 2. 배열이 나오면 for() 반복문이 한 번쯤은 나타난다. 3. 학생 3명의 3과목 점수를
		 * 어떻게 입력 받을 것인가? 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가?
		 */

		Scanner scan = new Scanner(System.in);

		int intKor[] = new int[3];
		int intEng[] = new int[3];
		int intMath[] = new int[3];
		String[] str = new String[] { "국어", "영어", "수학" };
		String[] student = new String[3];

		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d번 학생 이름 입력 : ", (i + 1));
			student[i] = scan.nextLine();
		}
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d번 학생 국어 점수 입력 : ", (i + 1));
			intKor[i] = scan.nextInt();
			System.out.printf("%d번 학생 영어 점수 입력 : ", (i + 1));
			intEng[i] = scan.nextInt();
			System.out.printf("%d번 학생 수학 점수 입력 : ", (i + 1));
			intMath[i] = scan.nextInt();
		}
		System.out.println("======================");
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%s학생\t", student[i]);
			System.out.println();
			for (int j = 0; j < str.length; j++) {
				System.out.printf("%s\t", str[j]);
			}
			System.out.println();
			for (int k = 0; k < 1; k++) {
				System.out.printf("%d점\t", intKor[k]);
				System.out.printf("%d점\t", intEng[k]);
				System.out.printf("%d점\t", intMath[k]);
			}
			System.out.println();
			System.out.println("======================");
		}
//		for (int i = 0; i < str.length; i++) {
//			System.out.printf("%s\t", str[i]);
//		}
		System.out.println("---------------------");
//		for (int i = 0; i < str.length; i++) {
//			System.out.printf("%d\t", intKor[i]);
//			System.out.printf("%d\t", intEng[i]);
//			System.out.printf("%d\t", intMath[i]);
//			System.out.println();
//		}

	}

}
