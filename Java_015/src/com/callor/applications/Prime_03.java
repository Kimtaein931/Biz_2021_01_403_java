package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_03 {

	public static void main(String[] args) {

		// Scanner 클래스를 사용하기 위한 변수 선언
		Scanner scan = new Scanner(System.in);
		// PrimeServiceV1 클래스를 사용하기 위한 변수 선언
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		System.out.print("2 이상의 숫자 입력 : ");
		int keyNum = scan.nextInt();

		// prime() method에 키보드로 입력받은 값을 매개변수에 보내고
		// return된 값을 returnNum 변수에 저장 후 출력
		int returnNum = psV1.prime(keyNum);
		if (returnNum < 0) {
			// 만약 return 받은 값이 소수가 아니라면(-1을 return하기 때문에 0보다 작다면) 출력
			System.out.println(keyNum + "는(은) 소수가 아닙니다.");
		} else {
			// 그렇지 않고 소수라면 '(키보드로 입력한 값) 은 소수입니다.' 출력
			System.out.println(keyNum + "는(은) 소수입니다.");
		}
	}

}
