package com.callor.hello;

// 한 줄짜리 comment
// 두 번째 comment

/*
 * 여기에 작성되는 내용은 주석문(comment)
 * Java 코드와 관계없이 설명하는 문장
 * 참고하는 문장 등을 작성할 수 있는 곳
 * 
 * 1. Java의 코드 파일을 생성하고(Hello.java)
 * 2. Javac를 사용하여 컴파일을 수행하여 Hello.class를 만드는 과정에서
 * 	  Javac가 아무런 의미없는 문장으로 인식하고 그냥 지나치는 부분
 * 
 * Java class
 * - Java 언어 문법에 맞도록 작성된 문서 파일
 * - public class 키워드로 시작하고 임의로 이름을 작성하여 만든다. (본문에선 Hello)
 * - Hello.java라는 파일에 코드가 저장된다.
 * - 클래스 이름과 파일 이름은 항상 같아야한다.
 * - ex) 클래스가 HelloKorea이면 파일 이름은 HelloKorea.java로 작성을 한다.
 * - 클래스 이름은 반드시 영문 대문자
 * - 영문 대소문자, 숫자, _(Under Bar, Under Score)
 * - 두 개 이상의 단어를 조합할 때는 Camel case로 한다.
 * 	 (단어의 앞글자는 대문자, 낙타등 방식)
 */

public class HelloKorea {

	/*
	 * main() method라고 부른다. 클래스를 만들고 컴파일을 수행한 후 실행했을 때 반드시 있어야 하는 명령문
	 */
	public static void main(String[] args) {
		// console 출력(명령)문
		// debug : 오류를 찾아내어 고치다.
		
		System.out.println("반갑습니다.");
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println("30 * 40 = " + 30 * 40);
		System.out.println("40 - 30 = " + (40 - 30));
		System.out.println("40 / 20 = " + 40 / 20);
		
		/*
		 * 
		 * Console 출력문
		 * "" (문자열 인용문, Double Qute. Mark)
		 * 	  - "" 표시 내의 내용을 그대로 Console에 출력
		 * ""로 묶인 내용을 '문자열(String)'이라고 한다.
		 * 
		 * 숫자(정수, 실수 등)는 숫자 그대로 수학적으로 해석한다.
		 * 
		 * 산술(연산)식
		 * 1. 숫자 산술식 : 수학의 사칙연산을 수행하고 결과를 출력
		 * 2. 문자열 산술식 : ""로 묶인 문자열을 + 연산하면 문자열을 연결하여 출력
		 * 					  문자열 산술식은 + 연산만 가능
		 * 3. 문자열 + 숫자 산술식 : 모든 숫자를 자동으로 문자열화하여 문자열 산술식으로 바꾸어 연산하고 결과를 출력
		 * 
		 */
	}
}
