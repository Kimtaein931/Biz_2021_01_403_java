package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {
		/*
		 * 1. 두 개의 정수형 변수 intNum1, intNum2를 선언하고 
		 * 2. 각각 33과 77을 저장하라.
		 * 3. 두 정수형 변수의 값을 서로 교환하라.
		 * 즉 intNum1 = 33, intNum2 = 77을 
		 *    intNum1 = 77, intNum2 = 33이 되도록 만들어라.
		 */
		
		int intNum1 = 33;
		int intNum2 = 77;
		System.out.println("intNum1의 값은 : " + intNum1);
		System.out.println("intNum2의 값은 : " + intNum2);
		System.out.println("=======================");
		
		// 1. (임시)로 사용할 temp를 만들고
		// 2. num1 변수값을 복사해둔다(백업)
		int temp = intNum1;
		// 3. num1 변수에 num2값을 복사
		// num1 == num2 상태가 된다.
		intNum1 = intNum2;
		// 4. 임시로 백업해둔 num1의 값을
		// num2에 복사
		intNum2 = temp;
		// 5. num1과 num2의 값이 서로 바뀐다.
		// 변수값의 swap 코드
		
		System.out.println("교환한 intNum1의 값은 : " + intNum1);
		System.out.println("교환한 intNum2의 값은 : " + intNum2);

	}
	
}
