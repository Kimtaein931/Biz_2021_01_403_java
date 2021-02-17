package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		/*
		 * Scanner 클래스를 사용하여 키보드에서 국어, 영어, 수학 점수를 각각 입력받아 변수에 저장 각 점수는 0 ~ 100까지만 입력할 수
		 * 있음 3과목의 합계와 평균을 계산하여 각각 변수에 저장
		 */
		while (true) {
			Scanner scan = new Scanner(System.in);
			// (prompt)
			// Scanner의 nextInt()를 사용하여 키보드 입력을 받는 코드가 실행되면
			// 화면에 아무 것도 없이 멈춘 것처럼 보이는 현상을 미리 어떤 일을 할 것인지
			// 알려주는 메세지
			System.out.print("국어 점수 >> ");
			// 'Blocking' 되었다. Code Blocking
			// scan.nextInt() method를 호출하면 코드 동작이 멈추고, 사용자가 키보드로
			// 무엇인가 입력한 후 Enter를 누를 때까지 다음 코드가 실행되지 않는다.
			int kor = scan.nextInt();
			if (kor > 100 || kor < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}
			System.out.print("영어 점수 >> ");
			int eng = scan.nextInt();
			if (eng > 100 || eng < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}
			System.out.print("수학 점수 >> ");
			int mat = scan.nextInt();
			if (mat > 100 || mat < 0) {
				System.out.println("0 ~ 100 입력바랍니다.");
				continue;
			}
			// int sum = kor + eng + mat;
			int sum = kor + eng + mat;
			// avg 변수는 실수형이지만 sum은 정수형, 3도 정수형이기 때문에 avg 변수에 저장되는 값은
			// 소수점 이하가 무조건 0으로 세팅된다.
			float avg = (float) sum / 3;
			// 결과값을 실수형(float, double)으로 변환하고자 할 때는 sum변수 값이나, 숫자 3을 실수형으로 만들어줘야 한다.
			// 1. sum을 실수형으로 변경하고 계산하기
			// 정수형 sum에 담긴 값을 float형 값으로 변환하여 나눗셈 준비.'강제 형변환'
			// 2. 숫자 3을 실수형으로 만들어서 나눗셈
			// sum을 실수 3.0f로 나눗셈을 지시하면 sum변수에 담긴 값은 자동으로 실수형으로 변환된다.'자동 형변환'
			// avg = sum / 3.0f;, 3.0d;
			System.out.println("===========================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("-------------------------------------------");
			System.out.print(kor + "\t");
			System.out.print(eng + "\t");
			System.out.print(mat + "\t");
			System.out.print(sum + "\t");
			System.out.println(avg + "\t");
			System.out.println("===========================================");
			break;
		}
	}

}
