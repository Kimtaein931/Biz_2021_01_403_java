package com.callor.student.model;

public class StudentVO {

	/*
	 * 학번[0] : String
	 * 이름[1] : String
	 * 학과[2] : String
	 * 학년[3] : int
	 * 반[4] : int
	 * 주소[5] : String
	 * 전화번호[6] : int
	 */
	
	String stuNum;
	String stuName;
	String stuDept;
	
	int stuYear;
	int stuClass;
	String stuAddress;
	String stuPhone;
	
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentVO(String stuNum, String stuName, String stuDept, int stuYear, int stuClass, String stuAddress,
			String stuPhone) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuDept = stuDept;
		this.stuYear = stuYear;
		this.stuClass = stuClass;
		this.stuAddress = stuAddress;
		this.stuPhone = stuPhone;
	}


	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuDept() {
		return stuDept;
	}
	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}
	public int getStuYear() {
		return stuYear;
	}
	public void setStuYear(int stuYear) {
		this.stuYear = stuYear;
	}
	public int getStuClass() {
		return stuClass;
	}
	public void setStuClass(int stuClass) {
		this.stuClass = stuClass;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	@Override
	public String toString() {
		return "StudentVO [stuNum=" + stuNum + ", stuName=" + stuName + ", stuDept=" + stuDept + ", stuYear=" + stuYear
				+ ", stuClass=" + stuClass + ", stuAddress=" + stuAddress + ", stuPhone=" + stuPhone + "]";
	}
	

	
}
