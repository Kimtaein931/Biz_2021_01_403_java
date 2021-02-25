package com.callor.oop.model;

/*
 *  쇼핑몰에서 판매되는 상품을 관리하기 위한 데이터를 저장할 용도의 Value Object 클래스 디자인(설계)
 *  
 *  ProductVO 클래스는
 *  ProductVO.java 파일로 생성되어 저장된다.
 *  클래스를 만들고 파일로 저장하는 과정
 *  클래스 디자인, 설계
 *  '클래스 프로토타입(Proto type) 작성'
 *  클래스 프로토타입은 객체를 생성하기 위한 설계도 코드
 *  
 *  VO(Value Object) 클래스는 가장 중요한 부분이 
 *  인스턴스변수를 선언하는 부분
 *  
 *  상품관리를 위해 필요한 데이터들
 *  상품코드, 상품명, 품목명, 거래처, 매입단가, 매출단가
 */

public class ProductVO {

	public String strPCode; // 상품코드, Product
	public String strPName; // 상품명, Product
	public String strItem;  // 품목명, Item
	public String strDName; // 거래처, Department
	public int IPrice;		// 매입단가
	public int OPrice; 		// 매출단가
	
	/*
	 *  Java에서는 클래스를 선언하면 public String toString() method가 자동으로 생성
	 *  	하지만 기본적으로 코드는 보이지 않는다.
	 *  	toString() method는 객체를 생성했을 때
	 *  	어떤 클래스를 사용했는지 와 생성된 객체가 컴퓨터 기억장치의 어떤 곳(주소)에
	 *  	만들어져 저장되어 있는지 알려주는 코드가 담겨있다.
	 *  
	 *  Java 코딩에서 toString() method의 기본 역할은 크게 필요하지 않다.
	 * 		그래서 일반적으로 VO 클래스를 만들 때는
	 *  	임의로 toString() method를 '다시 만들어준다.'
	 *  	그리소 인스턴스변수에 입력된 값을 알려주는 디버깅 코드를 생성한다.
	 *  
	 *  - method의 재정의 ( metohd Override (Overriding))
	 *  (Java가) 자동으로 만들어져 있는 toString()을 개발자가 임의로 다시 만들었다.
	 *  
	 *  원래 Java가 자동으로 생성한 코드는 감춰진다.
	 */
	public String toString() {
		System.out.println("================================");
		System.out.println("입력한 상품정보");
		System.out.println("================================");
		System.out.printf("상품코드 : %s\n", this.strPCode);
		System.out.printf("상품명 : %s\n", this.strPName);
		System.out.printf("품목명 : %s\n", this.strItem);
		System.out.printf("거래처 : %s\n", this.strDName);
		System.out.printf("매입단가 : %d\n", this.IPrice);
		System.out.printf("매출단가 : %d\n", this.OPrice);
		System.out.println("================================");
		return "";
	}
}