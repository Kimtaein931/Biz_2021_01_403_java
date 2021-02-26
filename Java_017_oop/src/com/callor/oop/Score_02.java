package com.callor.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Scanner scan = new Scanner(System.in);
		ScoreVO sVO = new ScoreVO();

		System.out.print("이름 입력 : ");
		sVO.strName = scan.nextLine();

		sVO.setIntKor(ssV1.inputScore("국어") + "");
		sVO.setIntEng(ssV1.inputScore("영어") + "");
		sVO.intMath = ssV1.inputScore("수학");

		
	}
}
