package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(2 ~ 9) : ");
		int num1 = scan.nextInt();
		if (num1 > 9 || num1 < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		if (num1 < 10 && num1 > 1) {
			System.out.println("입력한 값 : " + num1 + "단 시작");
			for (int i = 0; i < 8; i++) {
				System.out.println(num1 + " x " + (i + 2) + " = " + num1 * (i + 2));
			}
		}

	}

}
