package com.callor.start.loop;

public class Loop_02 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) { // i : index
		}
		
		int num = 0;
		num = num + 1;
		num += 1;
		num++;	// num 변수를 1 증가시켜라 (단항연산자)
		++num;
		
		num = num - 1;
		num -= 1;
		num--;
		--num;
		
		// i 값이 100부터 시작하여 i < 0까지 1씩 감소하면서 반복한다.
		for(int i = 100 ; i > 0 ; i--) {
			System.out.println(i);
		}
	}
}
