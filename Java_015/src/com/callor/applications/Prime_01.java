package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner 클래스를 사용하여 2 이상의 정수를 입력받아 변수에 저장 
		 * 2. 변수에 저장한 정수가 소수(Prime)인가를 판별하여 출력 
		 * # 소수 
		 * (1) '1과 자신 이외의 값'으로 나누어지지 않는 수 
		 * (2) '1과 자신 이외'의 약수를 갖지 않는 수
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수 입력 : ");
		int keyNum = scan.nextInt();
		for (int i = 2; i < keyNum; i++) {
			boolean byes = keyNum % i == 0;
			if (byes) {
				System.out.println("소수가 아니다.");
				break;
			}
		}
		int pos = 0;
		for (pos = 2; pos < keyNum; pos++) {
			if (keyNum % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 항상 pos < keyNum 관계가 된다.

		if (pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");

			// for 반복문이 break 없이 모두 완료되었으면
		} else {
			System.out.println(keyNum + "는 소수임");
		}

	}

}
