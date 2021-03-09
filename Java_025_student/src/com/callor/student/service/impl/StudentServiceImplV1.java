package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;
import com.callor.student.values.ValuesStudent;

public class StudentServiceImplV1 implements StudentService {

	List<StudentVO> studentList;

	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	// 파일 읽어오는 method
	public void loadDataFromFile() {

		// TODO 학생파일을 읽어오기
		String fileName = "src/com/callor/student/학생정보리스트.txt";

		// 파일을 읽기 위한 객체 선언
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// 파일을 읽기 위한 객체 생성 (초기화)
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			// buffer에 읽어들인 text 학생데이터에서 한 줄씩 데이터를 읽어서 처리
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				/*
				 * reader 변수에 담긴 문자열을 연산하기
				 * 
				 * 1. 문자열을 특별한 구분자로 나누어서 
				 * 2. 분해한 후 studentVO 객체에 담고 
				 * 3. List<studentVO> 리스트에 추가해두기
				 */

				String[] stuDatas = reader.split(":");

				// 필드생성자를 사용하여 studentVO 객체를 생성하면서
				// 각 인스턴스 변수에 값 담기
				StudentVO studentVO = new StudentVO(stuDatas[ValuesStudent.STU_NUM], // 학번
						stuDatas[ValuesStudent.STU_NAME], // 이름
						stuDatas[ValuesStudent.STU_DEPT], // 전공
						Integer.valueOf(stuDatas[ValuesStudent.STU_YEAR]), // 학년
						Integer.valueOf(stuDatas[ValuesStudent.STU_CLASS]), // 반
						stuDatas[ValuesStudent.STU_ADDRESS], // 주소
						stuDatas[ValuesStudent.STU_PHONE] // 번호
				);
				studentList.add(studentVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 문제가 발생하였습니다.");
		}
	}

	@Override
	// 학생이름을 입력받고 일치하는 학생이 있는 경우 배열에 저장 후 출력
	public void studentName() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생 이름을 입력하세요.(종료하려면 QUIT를 입력)");
			System.out.print("이름 >> ");
			String stuName = scan.nextLine();
			System.out.println(Values.sLine(50));
			StudentVO sVO = null;
			for (StudentVO vo : studentList) {
				if (stuName.equals("QUIT")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				if (vo.getStuName().equals(stuName)) {
//					System.out.println("이름 : " + vo.getStuName());
//					System.out.println("학과 : " + vo.getStuDept());
//					System.out.println("학년 : " + vo.getStuYear());
//					System.out.println("반 : " + vo.getStuClass());
//					System.out.println("주소 : " + vo.getStuAddress());
//					System.out.println("번호 : " + vo.getStuPhone());
					sVO = vo;
				}
			}
			if (sVO == null) {
				System.out.println("찾는 학생의 데이터가 없습니다.");
			} else {
				this.printStVO(sVO);
			}
			System.out.println(Values.dLine(50));
		}
	}

	protected void printStVO(StudentVO sVO) {

		System.out.printf("학번 : %s\n", sVO.getStuNum());
		System.out.printf("이름 : %s\n", sVO.getStuName());
		System.out.printf("학년 : %s\n", sVO.getStuYear());
		System.out.printf("반 : %s\n", sVO.getStuClass());
		System.out.printf("주소 : %s\n", sVO.getStuAddress());
		System.out.printf("번호 : %s\n", sVO.getStuPhone());

	}
}