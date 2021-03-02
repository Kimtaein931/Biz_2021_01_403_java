package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	private Scanner scan = new Scanner(System.in);
	private List<CartVO> cartList = new ArrayList<CartVO>();
	CartVO cartVO = new CartVO();

	public void inputCart() {
		System.out.println("===============================");
		System.out.println("장바구니에 담을 데이터 입력하기");
		System.out.println("===============================");
		for (int i = 0; i < 3; i++) {
			cartVO = new CartVO();
			System.out.println((i + 1) + " 번 상품입력");
			System.out.print("이름 입력 : ");
			String strUserName = scan.nextLine();
			cartVO.setCartUserName(strUserName);
			System.out.print("상품명 : ");
			String strPName = scan.nextLine();
			cartVO.setCartPName(strPName);

			while (true) {
				System.out.print("수량 : ");
				String strQty = scan.nextLine();
				try {
					int intQty = Integer.valueOf(strQty);
					if (intQty < 2) {
						System.out.println("수량은 2개 이상 입력해주십시오.");
					} else {
						cartVO.setCartQty(intQty);
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력해주십시오.");
				}
			}
			while (true) {
				System.out.print("가격 : ");
				String strPrice = scan.nextLine();
				try {
					int intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("가격은 1000원 이상 입력해주십시오.");

					} else {
						cartVO.setCartPrice(intPrice);
						break;
					}
				} catch (Exception e) {
					System.out.println("가격은 숫자로 입력해주십시오.");

				}
			}
			cartList.add(cartVO);
		}
	}

	public void printCartList() {

		System.out.println("===============================");
		System.out.println("장바구니 안에 담겨있는 데이터 확인");
		System.out.println("===============================");
		System.out.println("이름\t상품\t수량\t가격");
		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartVO.getCartUserName(), 
					cartVO.getCartPName(), 
					cartVO.getCartQty(),
					cartVO.getCartPrice());
		}

	}
}
