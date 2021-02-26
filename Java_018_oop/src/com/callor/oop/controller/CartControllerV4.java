package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();
		System.out.println("===============================");
		System.out.println("쇼핑카트 테스트 작업 V1");
		System.out.println("===============================");

		for (int i = 0; i < 3; i++) {
			cartVO = new CartVO();
			System.out.print("구매자 이름 : ");
			cartVO.setCartUserName(scan.nextLine());
			System.out.print("상품명 : ");
			cartVO.setCartPName(scan.nextLine());
			/*
			 * 데이터를 키보드에서 입력받는 부분과
			 * VO에 담아 리스트에 추가하는 부분을 
			 * 분리하여 코딩할 경우 
			 * 키보드에 입력한 값을 정수로 변환하여 값을 담아둘 intqty 변수를 
			 * while() 실행 이전에 선언해 두어야한다.
			 */
			
			int intqty = 0;
			while (true) {
				System.out.print("수량 : ");
				String strqty = (scan.nextLine());
				try {
					intqty = Integer.valueOf(strqty);
					if (intqty < 1) {
						System.out.println("수량은 1개 이상 입력하십시오.");
						continue;
					}
					cartVO.setCartQty(intqty);
					break;
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하십시오.");
					continue;
				}
			}
			
			int intprice = 0;
			while (true) {
				System.out.print("가격 : ");
				String strprice = (scan.nextLine());
				try {
					intprice = (Integer.valueOf(strprice));
					if (intprice < 1000) {
						System.out.println("가격은 1000원 이상 입력하십시오.");
						continue;
					}
					cartVO.setCartPrice(intprice);
					break;
				} catch (Exception e) {
					System.out.println("가격은 숫자로 입력하십시오.");
					continue;
				}

			}
			cartList.add(cartVO);
		}

		System.out.println("===============================");
		System.out.println("장바구니");
		System.out.println("===============================");
		System.out.println("=============================");
		System.out.println("이름\t상품\t수량\t가격");
		System.out.println("===============================");
		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", cartVO.getCartUserName(), cartVO.getCartPName(), cartVO.getCartQty(),
					cartVO.getCartPrice());
		}
		System.out.println("===============================");
	}
}
