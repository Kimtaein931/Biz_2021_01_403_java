package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductVO pVO = new ProductVO();
		// System.out.println("toString() : " + pVO.toString());

		System.out.println("==========================================================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("==========================================================");
		System.out.println("상품정보를 입력하세요.");
		System.out.println("==========================================================");
		
		System.out.print("※상품코드 입력 : ");
		pVO.strPCode = scan.nextLine();
		System.out.print("※상품명 입력 : ");
		pVO.strPName = scan.nextLine();
		System.out.print("※품목명 입력 : ");
		pVO.strItem = scan.nextLine();
		System.out.print("※거래처 입력 : ");
		pVO.strDName = scan.nextLine();
		System.out.print("※매입단가 입력 : ");
		pVO.IPrice = scan.nextInt();
		System.out.print("※매출단가 입력 : ");
		pVO.OPrice = scan.nextInt();
		
		pVO.toString();

	}

}
