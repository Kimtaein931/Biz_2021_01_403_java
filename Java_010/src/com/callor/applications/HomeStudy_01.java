package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class HomeStudy_01 {

	public static void main(String[] args) {

		MyGuGuDan dan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("2 ~ 9 사이의 숫자 입력 ( -1 : Quit ) >> ");
			int num = scan.nextInt();
			if (num == -1) {
				System.out.println("구구단을 종료합니다.");
				break;
			} else if (num > 9 || num < 2) {
				System.out.println("==============================");
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("2 ~ 9 사이의 숫자를 입력해주십시오.");
				System.out.println("==============================");
			} else {
				dan.print(num);
			}

		}

	}

}
