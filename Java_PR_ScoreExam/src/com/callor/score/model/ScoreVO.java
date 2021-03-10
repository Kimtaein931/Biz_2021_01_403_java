package com.callor.score.model;

public class ScoreVO {

	private String stNum; // 학번
	private int intKor; // 국어
	private int intEng; // 영어
	private int intMath; // 수학
	private int intMusic; // 음악

	private int intSum; // 총점
	private float floatAvg; // 평균

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(String stNum, int intKor, int intEng, int intMath, int intMusic, int intSum, float floatAvg) {
		super();
		this.stNum = stNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intMusic = intMusic;
		this.intSum = intSum;
		this.floatAvg = floatAvg;
	}

	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntMusic() {
		return intMusic;
	}

	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFloatAvg() {
		return floatAvg;
	}

	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	@Override
	public String toString() {
		return "studentVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intMusic=" + intMusic + ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}

}
