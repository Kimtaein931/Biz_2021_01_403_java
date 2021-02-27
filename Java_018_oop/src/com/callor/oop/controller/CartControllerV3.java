package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

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
			System.out.print("수량 : ");
			String strqty = (scan.nextLine());
			cartVO.setCartQty(Integer.valueOf(strqty));
			System.out.print("가격 : ");
			String strprice = (scan.nextLine());
			cartVO.setCartPrice(Integer .valueOf(strprice));

			cartList.add(cartVO);
		}

		System.out.println("===============================");
		System.out.println("장바구니");
		System.out.println("===============================");System.out.println("=============================");
		System.out.println("이름\t상품\t수량\t가격");
		System.out.println("===============================");
		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartVO.getCartUserName(), 
					cartVO.getCartPName(), 
					cartVO.getCartQty(),
					cartVO.getCartPrice());
		}
		System.out.println("===============================");
	}
}
