package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {
	
	Scanner scan = new Scanner(System.in);
	List<CartVO> cartVO = new ArrayList<CartVO>();
	
	public void inputCart() {

		System.out.print("이름 입력 : ");
		String userName = scan.nextLine();
		
		
	}
	
	public void printCartList() {
		
	}
}
