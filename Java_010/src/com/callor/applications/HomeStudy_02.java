package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.HomeGuGuDan;

public class HomeStudy_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HomeGuGuDan dan = new HomeGuGuDan();
		while (true) {
			System.out.print("2 ~ 9 사이의 수 입력 >> ");
			int num = scan.nextInt();
			if (num > 9 || num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주십시오.");
			} else if (num == -1) {
				System.out.println("구구단을 종료합니다.");
				break;
			} else {
				dan.gugudan(num);
			}
		}
	}

}
