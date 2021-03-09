package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여 
 * 10 ~ 100까지 임의의 정수를 생성하여 저장
 * 100개의 배열에 담긴 정수 중에 소수들만 찾아서 
 * Console에 출력
 */
public class Ex_08 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 10;
		}
		int j = 0;
		for(int i = 2; i < num.length; i++) {
				if(num[j] % i == 0) {
					System.out.println("난수가 아닙니다.");
				}else {
					System.out.println("난수 : " + num[j]);
				}
				j++;
			}
		}
	}

