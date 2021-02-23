package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		/*
		 * 1. 100개의 요소를 저장할 수 있는 정수형 배열 intNums 선언 및 생성(초기화) 
		 * 2. Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 intNums 배열에 저장 
		 * 3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지 중 정수를 입력받아
		 *    입력받은 정수가 배열 intNums에 몇 개 저장되어 있는지 찾아 개수를 출력
		 */
 
		// 인스턴스 변수 생성 및 초기화
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		// 배열 생성
		int[] intNums = new int[100];
		
		// 0 ~ (intNums.length - 1) 횟수만큼 반복문을 실행
		/*
		 * 0 ~ intNums.length 까지의 정수를 만들어서 intNums의 위치값으로 정하고
		 * 1 ~ 10까지의 임의의 숫자를 생성하여 intNums의 배열에 채워 넣음
		 */
	
		for (int i = 0; i < intNums.length; i++) {
			/*
			 * Random 클래스의 nextInt() method에 정수 10을 전달하고 실행하여 
			 * 랜덤으로 return하는 결과를 for() 반복문을
			 * 사용하여 intNums[i]에 순차적으로 저장
			 */
			
			/*
			 * Random 클래스의 nextInt() method를 호출하면서 정수 10을 전달하고
			 * return된 결과에 1을 더하라. 1 ~ 10까지 중 임의 숫자 1개를 만들고 임의로 생성된 숫자를
			 * intNums의 i번 째 위치에 저장
			 */
			intNums[i] = rnd.nextInt(10) + 1;
		}

		// 프롬프트
		System.out.print("1 ~ 10 중 숫자 입력 : ");
		int numbs = scan.nextInt();

		// 입력받은 수가 몇 개 포함되어 있는지 카운트
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			System.out.println(intNums[i]);
			if (numbs == intNums[i]) {
				count++;
			}
		}
		System.out.println("===============================");
		System.out.println(numbs + " 는 " + count + "개 저장되어 있습니다.");
	}

}
