package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {


	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;
	private int intKeyNum;
	private String strKeyNum;

	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	public void selectMenu() {
		while (true) {
			System.out.println("==================================");
			System.out.println("Cart Menu System V1");
			System.out.println("----------------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("----------------------------------");
			System.out.print("선택 >> ");
			strKeyNum = scan.nextLine();
			if (strKeyNum == "Q") {
				System.out.println("끝내기");
				break;
			}
			try {
				intKeyNum = Integer.valueOf(strKeyNum);
				if (intKeyNum == 1) {
					System.out.println("1. 카트추가");
					break;
				} else if (intKeyNum == 2) {
					System.out.println("2. 카트삭제");
					break;
				} else if (intKeyNum == 3) {
					System.out.println("3. 카트리스트");
					break;
				}
			} catch (Exception e) {
				System.out.println("1 ~ 3 숫자 또는 'Q'를 입력하십시오.");
			}
		}
	}
}
