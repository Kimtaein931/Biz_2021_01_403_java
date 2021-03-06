package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

/*
 * Service 클래스
 * main() method에서 구현한 코드들을 별도의 클래스로 분리하고
 * 작은 method 단위로 코드를 작성하여 전체적으로 단위코드가 작아지도록 하기 위한 기법
 * 이후에 유지보수(업그레이드, 오류정정)를 유리하게 하기 위한 방법
 */

public class CartServiceV2 {

	/*
	 * inputCart() method에서 계속 사용할 Scanner를 인스턴스 영역으로 이동했다.
	 * 인스턴스 영역에 선언된 객체들은 특별한 경우가 아니면 Private으로 일단 선언한다.
	 */
	private Scanner scan = new Scanner(System.in);
	private List<CartVO> cartList = new ArrayList<CartVO>();
	CartVO cartVO = new CartVO();
	
	/*
	 * 사용자로부터 키보드로 상품정보를 입력받아 카트리스트에 추가 코드
	 */
	public void inputCart() {
		/*
		 * Scanner.File, Network 이러한 클래스들은 운영체제와 연동하여
		 * 컴퓨터 자체의 자원(Resouce)을 사용하게된다.
		 * 컴퓨터 자체의 자원Resouce)은 유한하다.
		 * 때문에 자원은 무턱대고 열고 사용만 해서는 안 된다.
		 * 자원을 사용하기 위해 선언한 후 사용이 끝나면 반드시
		 * 반납(Close)를 해줘야 한다. 그래야만 Application이 실행되는 과정에서
		 * 자원의 누수(leak)가 발생하지 않는다.
		 * 
		 * 여기(inputCart() method)는 사용방법에 따라서 
		 * 수 회 반복적으로 호출이 될 것이다.수 회 반복적으로 호출되는 동안에
		 * Scanner가 열리고(연결) 닫히는 과정이 계속 반복된다.
		 * Resouce를 열고, 닫는 과정은 실체 컴퓨터, 운영체제, 어플리케이션 입장에서는 
		 * 상당히 많은 일을 수행해야 한다.
		 * 이러한 과정은 어플리케이션의 성능을 저하시키는 중대한 원인이 될 수 있다.
		 * 
		 * 그래서 Scanner를 method() 내부에서 선언하지 않고
		 * 클래스의 인스턴스 영역으로 보낸다.
		 */
		//Scanner scan = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("빛나라 쇼핑몰 카트시스템");
		System.out.println("=============================");
		System.out.print("구매자 이름 : ");
		String strName = scan.nextLine();
		cartVO.setCartUserName(strName);
		
		
		
		scan.close();
	}
	
	public void printCart() {
		
	}
	
}
