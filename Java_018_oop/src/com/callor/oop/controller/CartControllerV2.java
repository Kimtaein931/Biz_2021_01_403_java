package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		CartVO[] cartVO = new CartVO[3];

		cartVO[0] = new CartVO();
		
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartTotal(1000 * 10);
		
		cartVO[1] = new CartVO();
		
		cartVO[1].setCartUserName("이몽룡");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("10:44:42");
		cartVO[1].setCartPName("바나나킥");
		cartVO[1].setCartQty(10);
		cartVO[1].setCartStd("오리지널");
		cartVO[1].setCartPrice(700);
		cartVO[1].setCartTotal(700 * 10);
		
		cartVO[2] = new CartVO();
		
		cartVO[2].setCartUserName("성춘향");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("10:47:40");
		cartVO[2].setCartPName("다이제");
		cartVO[2].setCartQty(10);
		cartVO[2].setCartStd("초코맛");
		cartVO[2].setCartPrice(2000);
		cartVO[2].setCartTotal(2000 * 10);
		
		// ------------cartVO의 개수가 3개인 상태
		// 상품 한 가지를 더 넣으려면
		cartVO = new CartVO[4];
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("임꺽정");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("======================================");
		System.out.println("카트내용");
		System.out.println("======================================");
		for(int i = 0 ; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
		}
		System.out.println("======================================");
	}

}
