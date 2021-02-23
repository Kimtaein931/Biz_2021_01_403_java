package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int intNums[] = new int[100];
		for( int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		System.out.print("1 ~ 10 중 숫자 입력 : ");
		int keyNum = scan.nextInt();
		int count = 0;
		/*
		 * 변수는 앞에서 어떤 값을 저장했더라도 가장 마지막에 대입한 값만 가지고있다.
		 */
		System.out.println(keyNum + " 저장된 마지막 위치는 ");
		for(int i = 0; i < intNums.length; i++) {
			int num = i + 1;
			if(keyNum == intNums[i]) {
				// 키보드로 입력한 값이 일치할 때마다 그 위치를 count에 저장
				count = num;
			}
		}
		System.out.println("====================");
		// 가장 마지막으로 대입한 num의 값을 count가 담고있다.
		System.out.println(count + " 번째");
	}
	
}
