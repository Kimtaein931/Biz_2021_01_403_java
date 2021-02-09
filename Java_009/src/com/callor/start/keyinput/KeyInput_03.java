package com.callor.start.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = ran.nextInt(100) + 1;
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		// num > num1 이면 "크다" 출력
		if (num > num1) {
			System.out.println("입력한 값 : " + num + " 은(는) " + num1 + " 보다 큽니다.");
		}
		
		// num < num1 이면 "작다" 출력
		else if (num < num1) {
			System.out.println("입력한 값 : " + num + " 은(는) " + num1 + " 보다 작습니다.");
		}
		
		// 위의 2가지 조건이 모두 해당되지 않으면 출력
		else {
			System.out.println("입력한 값 : " + num + " 은(는) " + num1 + " 와(과) 같습니다.");
		}

	}

}
