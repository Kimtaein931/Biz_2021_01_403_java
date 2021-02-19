package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {

	public static void main(String[] args) {

		ClassServiceV1 csV1 = new ClassServiceV1();
		csV1.add(30, 20);
		csV1.add(20, 20.1f);
		csV1.add(30.2d, 21.2f);

	}

}
