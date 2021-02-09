package com.callor.start.keyinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. Random 클래스를 사용하여 1 ~ 100까지 임의의 수를
 * 생성하여 rndNum 변수에 담아놓는다.
 * 2. Console에 "숫자입력 : " 프롬프트를 보여주고 
 * 3. 1 ~ 100까지 정수를 입력받는다.
 * 4. 입력된 정수와 rndNum 변수에 저장된 값을 비교하여 
 * 5. 큰가, 작은가를 알려주고 rndNum에 저장된 값을 맞추는 게임
 * 6. 2 ~ 5까지를 계속 반복하면서 값을 맞춘다.
 * 7. 만약 정수값에 -1을 입력하면 게임을 종료한다.
 */

public class LupingGame {

	public static void main(String[] args) {
		int count = 0;
		while (true) {
			Random rnd = new Random();
			Scanner scan = new Scanner(System.in);
			int rndNum = rnd.nextInt(100) + 1;
			// while (true) {
			for (int i = 0; i < 5;) {
				System.out.print("숫자 입력 (-1:Quit) >> ");
				int keyNum = scan.nextInt();
				if (keyNum < 0) {
					System.out.println("=====You Lose=====");
					break;
				} else if (keyNum == rndNum) {
					System.out.println("=====You Win=====");
					count += 1;
					break;
				} else if (keyNum >= rndNum) {
					System.out.println("Down");
				} else if (keyNum <= rndNum) {
					System.out.println("Up");
				}
				i++;
				if (i == 5) {
					System.out.println("=====You Lose=====");
				}
			}
			// }
			System.out.println("Win : " + count + " 번 우승");

		}
	}
}
