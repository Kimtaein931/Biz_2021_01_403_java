package com.callor.var;

//가.
public class Var_01 {

	// 1
	public static void main(String[] args) {

		// Top 부분에 선언된 변수는 down에서 또 선언해서는 안 된다.
		// 한번 선언된 변수 이름으로 또 다시 선언할 수 없다.

		int num1 = 30;
		int num2 = 40;
		int num3 = 50;

		/*
		 * 변수 이름 짓기 첫 글자는 영문소문자 이후 숫자, 영문대소문자, _ 사용할 수 있다. 
		 * 두 개 이상의 단어를 조합하여 사용하는 것을 권장한다. 
		 * 두 번째 단어부터는 첫 글자를 대문자로 작성 (lower) Camel Case
		 */

		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;

		// 2개 이상의 단어로 조합이 다소 불편할 때
		// 변수명 접두사로 변수의 형(type)을 붙인다.
		// 헝가리언 표기법
		
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float fNum1 = 20.0F;
		float fNum2 = 30.0F;
		float fNum3 = 40.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		double doNum3 = 40.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-0000-0000";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어 사이에 UnderScore(_)
		 * 
		 * snake case
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들 때 주로 사용하는 명명법
		 */
		
		String str_name = "이몽룡";
		String st_name = "성춘향"; // student_name
		String st_num = "20210101"; // student_num
		String dept_name = "컴퓨터공학";
		
	}// 2
		// 1~2의 구역을 main() method의 local area, local scope라고 하며 줄여서 그냥 local이라고 한다.
}
//나.
//	가~나의 구역을 클래스 Var_01의 private 영역이라고 한다.
//	또는 그냥 Var_01 클래스의 local 영역이라고도 한다.