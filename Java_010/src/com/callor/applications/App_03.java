package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {
		// Scanner() 클래스를 사용하여 키보드에서 2 ~ 9까지 중 1개의 숫자를 입력 받고.
		// 입력한 숫자가 2 ~ 9 이외의 값이면 경고를 보이고 다시 숫자를 입력 받은 후 구구단을 출력
		System.out.println("=================");
		System.out.println("      구구단       ");
		System.out.println("=================");
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if (num > 9 || num < 2) {
				System.out.println("다시 입력하십시오.");
				continue;
			} else {
				System.out.println(num + "단 시작");
			}
			for (int i = 0; i < 8; i++) {
				System.out.println(num + " x " + (i + 2) + " = " + num * (i + 2));
			}
			System.out.println("=================");
		}
	}

}
