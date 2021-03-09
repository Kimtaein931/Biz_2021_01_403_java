package com.callor.iolist.values;

public class Values {

	// 정수를 매개변수로 받아서 문자열을 return하는 method\
	
	public static String dLine(int count) {
		// count == 50 : %050d 이라는 문자열이 만들어진다.
		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0).replace("0", "="); // .replace("0", "="); : 0을 =로 변경
		return dLine;
	}

	public static String sLine(int count) {
		// count == 50 : %050d 이라는 문자열이 만들어진다.
		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0).replace("0", "-");
		return sLine;
	}

}
