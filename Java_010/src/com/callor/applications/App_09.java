package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;
import com.callor.applications.myclass.MyGuGuWhile;

public class App_09 {

	public static void main(String[] args) {

		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 (2 ~ 9) : ");
			int num = scan.nextInt();
				myDan.print(num);
			
		}

	}
}
