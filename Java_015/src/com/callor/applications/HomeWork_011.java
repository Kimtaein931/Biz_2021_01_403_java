package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_011 {
	/*
	 * 1. HomeWork_01의 main() method에서 Random 클래스를 사용하여
	 * 2. 임의의 정수 100개를 만들고
	 * 3. PrimeServiceV2의 prime() method를 호출하여
	 * 4. 임의의 정수 100개 중 소수인 수들의 리스트를 출력
	 * 5. 소수인 수들의 합을 계산하여 출력
	 */
	public static void main(String[] args) {
		/*
		 * Java에서는 변수, 객체를 선언할 때
		 * 사용하기 직전에 선언 및 초기화를 하면 된다.
		 * 통상적으로 코딩을 할 때 변수, 객체 등의 선언코드는
		 * 가급적 코드의 시작 부분(클래스 선언 명령문 아래, method 선언문 아래)에
		 * 작성을 한다.
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		int rndNums[] = new int[100];
		
		// 생성된 rndNums[] 배열에 임의 정수 100개를 저장해두었다.
		// 이처럼 배열을 만들어두면 이후의 코드에서 한 번 생성된 임의 정수 100개를
		// 자유롭게 활용할 수 있다.
		for(int i = 0; i < rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(100) + 2;
		}
		
		// rndNums 배열에 담겨있는 정수들을
		// psV2.prime() method에게 보내서 소수인가를 검사
		// *psV2.prime(rndNums)
		// 위처럼 prime() method에 배열을 통째로 전달하여 코드를 실행할 수 없는 이유
		// psV2.prime() method는 매개변수가 (int num)로 선언되어 있다.
		// 즉, 이 method는 전달받을 수 있는 값이 정수 '1개'
		// 그런데 배열(100개의 정수)를 한꺼번에 전달하려고 시도하기 때문에
		// 안 되는 것이다.
		// 그렇다면 psV2.prime() method를 사용하기 위해서는
		// rndNums의 요소들을 한 개씩 전달해야한다.
		// 결론은 for() 반복문을 사용해야한다.
		for(int i = 0; i < rndNums.length; i++) {
			int result= psV2.prime(rndNums[i]);
			if(result > 0) {
				System.out.print(result + ", ");
			}
		}
		
		for(int i = 0; i < rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeSum += result;
			}
		}
		
		for(int i = 0; i < rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeCount++;
			}
		}
		System.out.println();
		System.out.println("소수 합계 : " + intPrimeSum);
		System.out.println("소수 개수 : " + intPrimeCount);
	}
}
