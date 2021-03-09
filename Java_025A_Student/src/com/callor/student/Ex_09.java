package com.callor.student;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;

public class Ex_09 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		StudentVO stdVO = new StudentVO();
		for (int i = 0; i < 10; i++) {
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			stdList.add(stdVO);
		}
		System.out.println(stdVO.getStName());
		System.out.println(stdVO.getStNum());
	}
}
