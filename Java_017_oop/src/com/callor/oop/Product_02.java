package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// VO 클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기 등)하려면 선언된 객체배열 요소요소를 모두
		// 다시 추기화(생성)하는 과정이 필요하다.
		// 이 과정이 생략되면 이후 코드에서 NullPointerException이 발생한다.
		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		System.out.println("================================");
		System.out.println("상품정보 데이터 저장 V1");
		System.out.println("================================");
		System.out.println("상품정보를 입력하세요.");
		System.out.println("================================");

		String strN = 3 + ""; // "3" 이라는 문자열로 저장
		int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVOs.length; i++) {
			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + "";
			System.out.println(pCode + "번 상품 입력");
			System.out.print("※상품코드 입력 : ");
			pVOs[i].strPCode = scan.nextLine();
			System.out.print("※상품명 입력 : ");
			pVOs[i].strPName = scan.nextLine();
			System.out.print("※품목명 입력 : ");
			pVOs[i].strItem = scan.nextLine();
			System.out.print("※거래처 입력 : ");
			pVOs[i].strDName = scan.nextLine();
			System.out.print("※매입단가 입력 : ");
			String iPrice = scan.nextLine();
			pVOs[i].IPrice = Integer.valueOf(iPrice);
			System.out.print("※매출단가 입력 : ");
			String oPrice = scan.nextLine();
			pVOs[i].OPrice = Integer.valueOf(oPrice);
			pVOs[i].toString();
		}
	}
}
