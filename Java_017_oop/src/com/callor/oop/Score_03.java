package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScoreVO sVO = new ScoreVO();

		System.out.print("이름 입력 : ");
		sVO.strName = scan.nextLine();
		while (true) {

			System.out.print("국어 성적 : ");
			String strkor = scan.nextLine();
			sVO.setIntKor(strkor);

			// intKor에 -1이 담겨 있으면 다시 입력하도록 해야한다.
			if (sVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사 실패");
				continue;
			}
			break;
		}
		while (true) {

			System.out.print("영어어 성적 : ");
			String streng = scan.nextLine();
			sVO.setIntEng(streng);
			if (sVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue;
			}
			break;

		}
	}

}