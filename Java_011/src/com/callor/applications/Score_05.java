package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {
//		ScoreServiceV4 scV4 = new ScoreServiceV4();
//		scV4.score(242, 80.666f);
		
		ScoreServiceV4 scV4 = new ScoreServiceV4();
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 입력 >> ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력 >> ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력 >> ");
		int math = scan.nextInt();
		scV4.print(kor, eng, math);
		
		
	}
}
