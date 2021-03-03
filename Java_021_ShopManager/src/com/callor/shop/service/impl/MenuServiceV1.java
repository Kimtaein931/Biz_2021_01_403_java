package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		// 생성자 메스드에서 scanner 초기화
		scan = new Scanner(System.in);
	}

	public Integer selectmenu() {

		while (true) {

			System.out.println("=========================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("-----------------------------------------");
			System.out.println("1. 장바구니 상품담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT : 끝내기");
			System.out.println("=========================================");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				System.out.println("장바구니를 종료합니다.");
				break;
			}
			while (true) {
				try {
					int intMenu = Integer.valueOf(strMenu);
					if (intMenu >= 1 && intMenu <= 3) {
						return intMenu;
					} else {
						System.out.println("1 ~ 3 사이의 숫자를 입력해주십시오.");
					}
					break;
				} catch (Exception e) {
					System.out.println("1 ~ 3 정수 혹은 'QUIT' 입력");
					break;
				}
			}
		}
		return null;
	}
}
