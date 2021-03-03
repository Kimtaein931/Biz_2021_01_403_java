package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

// MenuServiceV1 클래스에서 MenuService 인터페이스를 implements 함
public class MenuServiceV1 implements MenuService {

	// 인스턴수 변수를 선언'만'
	private Scanner scan;

	public MenuServiceV1() {
		// 생성자 메스드에서 scanner 초기화
		scan = new Scanner(System.in);
	}

	// 반환타입이 정수형인 seletmenu() method 생성
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
			// 키보드로 QUIT를 입력하면 장바구니 끝내기(종료)
			if (strMenu.equals("QUIT")) {
				System.out.println("장바구니를 종료합니다.");
				break;
			}
			while (true) {
				try {
					Integer intMenu = Integer.valueOf(strMenu);
					if (intMenu >= 1 && intMenu <= 3) {
						// 입력한 값이 1 ~ 3 이라면 intMenu값 CartEx로 return, 값에 따른 메뉴 시작
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
