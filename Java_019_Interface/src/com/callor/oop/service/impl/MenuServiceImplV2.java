package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV2 {

	/*
	 * 인스턴스 객체변수 선언 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;

	public MenuServiceImplV2() {
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
			String strKeyNum = scan.nextLine();
			
			// 1. Q를 입력하면 끝내기
			if (strKeyNum == "Q") {
				System.out.println("끝내기");
				return;
			}
			
			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				if (Integer.valueOf(strKeyNum) == 1) {
					System.out.println("1. 카트추가");
				} else if (Integer.valueOf(strKeyNum) == 2) {
					System.out.println("2. 카트삭제");
				} else if (Integer.valueOf(strKeyNum) == 3) {
					System.out.println("3. 카트리스트");
				} else {
					System.out.println("메뉴는 1 ~ 3까지만 입력해주십시오.");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("1 ~ 3 숫자 또는 'Q'를 입력하십시오.");
			}
		}
	}
}
