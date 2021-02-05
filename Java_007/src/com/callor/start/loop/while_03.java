package com.callor.start.loop;

public class while_03 {

	public static void main(String[] args) {

		int index = 0;
		while (true) {
			// 매우 불편한 코드
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			
			// 정상적인 코드
			if (++index % 3 == 0) {
				System.out.println(index + " 는 3의 배수");
			} else {
				System.out.println(index + "는 3의 배수가 아님");
			}

			// index == 999라는 조건식은 사용하지 않는 게 좋고,
			// 999에서 멈추길 바란다면 index > 1000으로 확실하게 하는 게 좋다.
			if(index > 1000) {
				break;
			}
		}
	}
}
