package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScoreVO sVO = new ScoreVO();
		while (true) {

			System.out.print("이름 입력 : ");
			sVO.strName = scan.nextLine();
			while (true) {

				System.out.print("국어 성적 : ");
				String strkor = scan.nextLine();
				try {
					int intKor = Integer.valueOf(strkor);
					sVO.setIntKor(strkor);
					break;
				} catch (Exception e) {
					System.out.println("숫자로만 입력");
					continue;
				}

			}
			while (true) {

				System.out.print("영어 성적 : ");
				String streng = scan.nextLine();
				try {
					int intEng = Integer.valueOf(streng);
					sVO.setIntEng(streng);
					break;
				} catch (Exception e) {
					System.out.println("숫자로만 입력");
					continue;
				}

			}
			while (true) {

				System.out.print("수학 성적 : ");
				String strmath = scan.nextLine();
				try {
					int intMath = Integer.valueOf(strmath);
					sVO.intMath = intMath;
					break;
				} catch (Exception e) {
					System.out.println("숫자로만 입력");
					continue;
				}

			}
		}
	}
}
