package com.callor.iolist.service;

/*
 * 파일을 읽어서 iolist에 담기
 * iolist에 담긴 데이터를 '구분' 값을 기준으로 
 * 		매입금액과 매출금액을 계산하자.
 * iolist에 담긴 데이터를 출력하기
 */
public interface IolistService {

	public void loadDataFromFile(); // 데이터파일 읽어오기
	public void iolistSum();		// 구분값에 따라 매입금액, 판매금액 계산하기
	public void printIolist();		// 매입매출 리스트 출력
	
}