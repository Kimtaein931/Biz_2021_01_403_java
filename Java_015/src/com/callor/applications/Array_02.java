package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		// Random, Scanner클래스를 사용하여 인스턴스 변수 선언
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		// 100개의 요소를 저장할 수 있는 배열 생성
		int[] intNums = new int[100];

		// (0 ~ intNums.length -1) 까지 중 1 ~ 10 숫자 순차적으로 Random 생성
		for (int i = 0; i < intNums.length; i++) {
			// Random클래스 안의 nextInt() method를 사용하여 1 ~ 10 중 임의 값 대입
			intNums[i] = rnd.nextInt(10) + 1;
		}
		System.out.print("1 ~ 10 중 숫자 입력 : ");
		// Scanner클래스 안의 nextInt() method를 사용하여 키보드로부터 입력받음
		int keyNum = scan.nextInt();

		System.out.print(keyNum + " 저장된 최초의 위치는 ");
		// 입력한 값과 intNums[i] 안에 있는 값이 일치할 때 몇 번째에 있는지
		for (int i = 0; i < intNums.length; i++) {
			int num = i + 1;
			if (keyNum == intNums[i]) {
				System.out.println(num + " 번째입니다.");
				break;
			}
		}
	}

}
