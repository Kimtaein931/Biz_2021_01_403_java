package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ScoreService;

public class Score_02 {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			// Class 호출
			ScoreService scService = new ScoreService();

			// kor, eng, mat 점수 입력 받기
			System.out.print("국어 점수 입력 >> ");
			int kor = scan.nextInt();
			if (kor > 100 || kor < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}

			System.out.print("영어 점수 입력 >> ");
			int eng = scan.nextInt();
			if (eng > 100 || eng < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}

			System.out.print("수학 점수 입력 >> ");
			int mat = scan.nextInt();
			if (mat > 100 || mat < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}

			// ScoreService 클래스의 score() method 호출 kor, eng, mat 값 입력
			scService.score(kor, eng, mat);
		}
	}
}
