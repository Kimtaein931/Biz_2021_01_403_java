package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_10 {

	public static void main(String[] args) {
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 ( 2 ~ 9 ) >> ");
			int num = scan.nextInt();
			if(num < 2 || num > 9) {
				System.out.println("다시 입력하십시오.");
				System.out.println("2 ~ 9 안에서 입력 바랍니다.");
			}else {
				myDan.print(num);
			}
		}
	}
	
}
