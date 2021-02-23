package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		// 키보드 입력을 받기 위해 Scanner 클래스를 scan 객체로 선언
		// scan 객체를 인스턴스화하기(사용할 준비, 인스턴스 변수 선언)
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10까지 중 숫자 입력 : ");
		int keyNum = scan.nextInt();
		
		// intNums[]에는 어떤 값이 저장되어 있는지 모른다.
		// 단, 1 ~ 10까지의 숫자들이 들어있을 것이다.
		// intNums[]에 저장된 숫자들 중에서 키보드로 입력받은 값(keyNum에 저장)과 같은 값들이
		// 몇 번(몇 개) 저장되어 있는지
		int count = 0;
		for(int i = 0; i < intNums.length; i++) {
			
			if(intNums[i] == keyNum) {
				System.out.println(intNums[i]);
				count++;
			}
			
		}
		System.out.println("개수 : " + count);
	}

}
