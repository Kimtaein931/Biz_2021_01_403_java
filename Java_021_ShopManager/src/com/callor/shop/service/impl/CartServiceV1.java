package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

// CartServiceV1에서 CartService 인터페이스를 implements 함 
public class CartServiceV1 implements CartService {
	/*
	 * 1. VO 클래스에 선언되어 있는 인스턴스 변수들을 저장할 
	 * 2. 기억장소를 예약하고 그 기억장소의 주소를 객체변수에 저장한다.
	 * 3. 결국 cartVO에 실제로 담긴 값은 인스턴스 변수에 저장한 값들이 아니라
	 *	  인스턴스 변수들의 주소가 된다.
	 */
	// 인스턴스 변수 선언'만'
	private List<CartVO> cartList;
	private Scanner scan;

	// 생성자 method에서 초기화
	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	// 구매자, 상품, 단가, 수량을 입력하는 inputCart() method 생성
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
				// 입력한 단가가 1 미만이라면
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하십시오.");
				} else {
					break;
				}
			} catch (Exception e) {
				// 입력한 단가가 정수가 아니라면
				System.out.println("단가는 숫자로 입력바랍니다.");
			}
		}// while end

		// 수량을 담을 정수형 변수 선언
		int intQty = 0;
		
		while (true) {
			System.out.print("수량 : ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				// 입력한 수량이 1 미만이라면
				if (intQty < 1) {
					System.out.println("수량은 1 이상 입력하십시오.");
				} else {
					break;
				}
			} catch (Exception e) {
				// 입력한 수량이 정수가 아니라면
				System.out.println("수량은 1 ~ 3 정수로 입력바랍니다.");
			}
		}// while end

		// CartVO를 새롭게 선언한 뒤 입력한 고객, 상품, 단가, 수량, 합계 값 넘김
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName); // 고객 이름
		cartVO.setProductName(strPName); // 상품 이름
		cartVO.setPrice(intPrice); // 상품 단가
		cartVO.setQty(intQty); // 상품 수량
		cartVO.setTotal(intPrice * intQty); // 합계
		
		// cartList 배열에 cartVO 전체값 넘김
		cartList.add(cartVO);
	}

	public void printCart() {
		System.out.println("* 전체 장바구니 리스트");
		System.out.println("=========================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-----------------------------------------");
		
		// CartList에 들어있는 배열 개수를 세어서 저장
		int nSize = cartList.size();
		int pCount = 0;
		int pSum = 0;
		for (int i = 0; i < nSize; i++) {
			// 전체 합계값을 알기 위해 pSum 변수에 누적대입
			pSum += cartList.get(i).getTotal();
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
					cartList.get(i).getUserName(), 
					cartList.get(i).getProductName(),
					cartList.get(i).getPrice(),
					cartList.get(i).getQty(),
					cartList.get(i).getTotal());
			// 상품수량을 알기 위해 pCount값 1씩 증가
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
			// 입력한 username과 일치한 값이 있을 경우 실행
			if (username.equals(cartList.get(i).getUserName())) {
				
				// 전체 합계값
				pSum += cartList.get(i).getTotal();
				System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(),
						cartList.get(i).getPrice(),
						cartList.get(i).getQty(),
						cartList.get(i).getTotal());
				
				// 상품수량을 알기 위해 pCount값 1씩 증가
				pCount++;
			}
		}
		System.out.println("=========================================");
		System.out.printf("합계\t%d가지\t\t\t%d\n", pCount, pSum);
	}
}
