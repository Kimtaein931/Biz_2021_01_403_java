package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	public void inputCart() {

		System.out.println("=========================================");
		System.out.println("장바구니 넣기");
		System.out.println("-----------------------------------------");
		System.out.print("구매자 : ");
		String strUserName = scan.nextLine();
		System.out.print("상품 : ");
		String strPName = scan.nextLine();

		// 단가를 담을 정수형 변수 선언
		int intPrice = 0;
		
		while (true) {
			System.out.print("단가 : ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하십시오.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력바랍니다.");
			}
		}

		// 수량을 담을 정수형 변수 선언
		int intQty = 0;
		
		while (true) {
			System.out.print("수량 : ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1 이상 입력하십시오.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 1 ~ 3 정수로 입력바랍니다.");
			}
		}

		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName); // 고객 이름
		cartVO.setProductName(strPName); // 상품 이름
		cartVO.setPrice(intPrice); // 상품 단가
		cartVO.setQty(intQty); // 상품 수량
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);
	}

	public void printCart() {
		int nSize = cartList.size();
		int pCount = 0;
		int pSum = 0;
		System.out.println("* 전체 장바구니 리스트");
		System.out.println("=========================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < nSize; i++) {
			pSum += cartList.get(i).getTotal();
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
					cartList.get(i).getUserName(), 
					cartList.get(i).getProductName(),
					cartList.get(i).getPrice(),
					cartList.get(i).getQty(),
					cartList.get(i).getTotal());
			pCount++;
		}
		System.out.println("=========================================");
		System.out.printf("합계\t%d가지\t\t\t%d\n", pCount, pSum);
	}

	public void printSolo() {
		System.out.println("=========================================");
		System.out.println("출력할 고객의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String username = scan.nextLine();
		int nSize = cartList.size();
		int pCount = 0;
		int pSum = 0;
		System.out.println(username + " 장바구니 리스트");
		for (int i = 0; i < nSize; i++) {
			if (username.equals(cartList.get(i).getUserName())) {
				pSum += cartList.get(i).getTotal();
				System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(),
						cartList.get(i).getPrice(),
						cartList.get(i).getQty(),
						cartList.get(i).getTotal());
				pCount++;
			}
		}
		System.out.println("=========================================");
		System.out.printf("합계\t%d가지\t\t\t%d\n", pCount, pSum);
	}
}
