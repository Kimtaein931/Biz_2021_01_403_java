package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {

	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		/*
		 *MyGuGuDan 클래스에 정의된 print() method 호출
		 *MyGuGuDan 클래스의 print() method 호출
		 *
		 *print(int) ... arguments ()
		 */
		myGu.print(0);
		
		//Random 클래스의 nextInt() method를 호출하라
		Random rnd = new Random();
		rnd.nextInt(10); //호출과 동시에 정수 10을 주입
		rnd.nextInt(); // 그냥 호출
		
		//Scanner 클래스의 nextInt() method를 호출하라
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		
		Random rd = new Random();
		rd.nextInt(10);
		
	}
	
}
