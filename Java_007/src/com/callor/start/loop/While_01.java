package com.callor.start.loop;

public class While_01 {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println(3 + 4 * 3 - 3);
		System.out.println(3 - 4 * 3 + 3);
		
		/*
		 * 단항연산자(++, --)가 변수의 뒤(끝)에 있을 경우 
		 * 현재 명령어를 모두 실행하고 그 이후에 1을 증가(++), 감소(--)한다.
		 */
		System.out.println(10 + 20 + 30 + count++);
		
		// 무한반복
		// for( ;; ) {}
		System.out.println("-----------------------");
		count = 0;
		while(true) {
			
			System.out.println(count++ + "번 : 대한민국");
			
			// 어떤 조건을 검사하여 true면 중단
			if(count > 10) {
				break;	// while() 안에서 특별한 조건을 만날 때 멈추는 명령어
			}
			
		}
		
	}
	
}
