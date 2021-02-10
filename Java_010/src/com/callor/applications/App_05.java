package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_05 {

	public static void main(String[] args) {
		
		//내가 프로젝트에 선언(정의, 만듦)한
		//MyGuGuDan 클래스에 있는 어떤 기능들을 사용하기 위하여
		//클래스를 객체로 선언하고 초기화하여 준비를 하는 절차
		//이후에는 myGu 객체를 사용하여 메서드들을 실행하는 코드를 사용할 수 있다.
		MyGuGuDan myGu = new MyGuGuDan();
		
		/*
		 * 키보드에서 숫자를 입력받고 구구단을 출력하기 위하여 MyGuGuDan 클래스를 사용하여
		 * myGu 객체를 선언 및 초기화하고
		 * while(true) 무한반복문 내에서 gugu()method를 호출하여 구구단 계산을 무한 반복하며 실행하는 효과를 낸다.
		 */
		
		while(true) {
			//MyGuGuDan 클래스에 선언(정의, 만듦)된 gugu() 메서드를 실행하라.
			//myGu 객체(Object, instance(인스턴스))의 gugu() method를 호출(실행)
			myGu.gugu();
		}
		
	}
	
}
