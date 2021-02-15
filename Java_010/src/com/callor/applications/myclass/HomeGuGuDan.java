package com.callor.applications.myclass;

public class HomeGuGuDan {

	public void gugudan(int dan) {
		System.out.println("==================");
		System.out.println("구구단 " + dan + "단 시작");
		System.out.println("==================");
		for (int i = 0; i < 9; i++) {
			int inum = i + 1;
			System.out.println(dan + " x " + inum + " = " + dan * inum);
		}
		System.out.println("==================");

	}

}
