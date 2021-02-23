package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int intNums[] = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
 
		System.out.print("1 ~ 10 중 숫자 입력 : ");
		int keyNum = scan.nextInt();
		
		System.out.print(keyNum + " 저장된 최초의 위치는 ");
		for (int i = 0; i < intNums.length; i++) {
			int num = i + 1;
			if (keyNum == intNums[i]) {
				System.out.println(num + " 번째입니다.");
				break;
			}

		}

	}

}
