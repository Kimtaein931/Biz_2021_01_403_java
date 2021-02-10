package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("     구구단       ");
		System.out.println("================");
		Scanner scan = new Scanner(System.in);
		while (true) {
			// Scanner 클래스를 사용하여 키보드에서 2 ~ 9까지 중 1개의 숫자를 입력 받고 구구단을 출력하시오.
			System.out.print("숫자 입력 >>> ");
			int dan = scan.nextInt();
			if (dan > 9 || dan < 2) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력하십시오.");
				// break로 멈추는 게 아닌 다시 while() 실행
				continue;
			}
			if (dan < 9 && dan > 2) {
				System.out.println("구구단 : " + dan + "단 실행");
			}
			for (int i = 0; i < 8; i++) {
				
//				if (dan > 9 || dan < 2) {
//					System.out.println("잘못 입력하셨습니다.");
//					System.out.println("다시 입력하십시오.");
//					break;
				
				System.out.println(dan + " x " + (i + 2) + " = " + dan * (i + 2));
			}
		}
	}
}
