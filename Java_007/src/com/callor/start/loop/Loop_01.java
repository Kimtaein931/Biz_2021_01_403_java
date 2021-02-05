package com.callor.start.loop;

public class Loop_01 {

	public static void main(String[] args) {
		/*
		 * for() 반복 명령문을 사용하여 다음 코드를 작성하시오. 
		 * 가. 100 ~ 1000까지 범위 수를 100 단위씩 출력 
		 * 나. 1 ~ 10까지 순서 번호를 붙여 문자열 출력
		 */

//		for(int num1 = 100 ; num1 <= 1000 ; num1 += 100) {
//			System.out.println(num1);
//		}
//		
//		for(int nameNum = 0; nameNum < 10 ; nameNum += 1) {
//			System.out.println((nameNum + 1) + "번 홍길동");
//		}

		System.out.println("시작");
		/*
		 *보편적으로 for() 반복문을 사용하여 코딩을 할 때 
		 *int num = 0 : 시작값은 보통 0으로 초기화를 한다.
		 *num < 10 : 종료를 위한 비교 연산은 등호를 가급적 사용하지 않는다. ( <= x, < o)
		 *num += 1 : 증가값(변화값) 가급적 1씩 증가, 감소 하도록 코딩한다. 
		 */
		for (int num = 0; num < 10; num += 1) {
			int num1 = (num + 1) * 100;
			System.out.println(num1);
		}
		for (int num = 0 ; num < 10 ; num += 1) {
			
			System.out.println((num + 1) + " 번 홍길동");
		}
	}
}
