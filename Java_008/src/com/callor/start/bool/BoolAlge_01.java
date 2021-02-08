package com.callor.start.bool;

public class BoolAlge_01 {

	/*
	 * Boolean algebra
	 * 
	 * (3x * 3) + (4x *2) + (5x * 3) A B C A + B + C
	 */

	public static void main(String[] args) {

		boolean bYes = true;
		boolean bNo = false;

		// && : AND, 그리고
		System.out.println(bYes && bNo);
		// ||(filter 기호) : or, 또는
		System.out.println(bYes || bNo);

		// bYes1 or bYes2
		// 1 + 0 = 1
		// 0 + 1 = 1
		// 0 + 0 = 0
		// 1 + 1 = 1 ( 1 이상은 무조건 true)

		// true or true == true
		// true or false == true
		// false or true == true
		// false or false == false

		// true and true == true
		// true and false == false
		// false and true == false
		// false and false == false
		
		System.out.println("===========================");
		System.out.println("t && t : " + (true && true));
		System.out.println("t && f : " + (true && false));
		System.out.println("f && t : " + (false && true));
		System.out.println("f && f : " + (false && false));
		System.out.println("===========================");
		System.out.println("t || t : " + (true || true));
		System.out.println("t || f : " + (true || false));
		System.out.println("f || t : " + (false || true));
		System.out.println("f || f : " + (false || false));
		System.out.println("===========================");
		
		

	}

}
