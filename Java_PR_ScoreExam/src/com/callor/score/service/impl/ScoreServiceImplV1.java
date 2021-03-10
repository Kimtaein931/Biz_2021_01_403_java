package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> stuList;
	private Scanner scan;

	public ScoreServiceImplV1() {
		stuList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		fileName = "src/com/callor/score/data/score.txt";
	}

	@Override
	public void inputScore() {

		System.out.println(Values.dLine(50));
		for (int i = 0; i < 2; i++) {
			ScoreVO ssVO = new ScoreVO();
			System.out.print("학번 >> ");
			String stuNum = scan.nextLine();
			ssVO.setStNum(stuNum);
			while (true) {
				String stuKor;
				System.out.print("국어 >> ");
				try {
					stuKor = scan.nextLine();
					if (Integer.valueOf(stuKor) < 0 || Integer.valueOf(stuKor) > 100) {
						System.out.println("점수는 0 ~ 100점 범위 내에서 입력바랍니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력바랍니다.");
					continue;
				}
				ssVO.setIntKor(Integer.valueOf(stuKor));
				break;
			}
			while (true) {
				String stuEng;
				System.out.print("영어 >> ");
				try {
					stuEng = scan.nextLine();
					if (Integer.valueOf(stuEng) < 0 || Integer.valueOf(stuEng) > 100) {
						System.out.println("점수는 0 ~ 100점 범위 내에서 입력바랍니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력바랍니다.");
					continue;
				}
				ssVO.setIntEng(Integer.valueOf(stuEng));
				break;
			}
			while (true) {
				String stuMath;
				System.out.print("수학 >> ");
				try {
					stuMath = scan.nextLine();
					if (Integer.valueOf(stuMath) < 0 || Integer.valueOf(stuMath) > 100) {
						System.out.println("점수는 0 ~ 100점 범위 내에서 입력바랍니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력바랍니다.");
					continue;
				}
				ssVO.setIntMath(Integer.valueOf(stuMath));
				break;
			}
			while (true) {
				String stuMusic;
				System.out.print("음악 >> ");
				try {
					stuMusic = scan.nextLine();
					if (Integer.valueOf(stuMusic) < 0 || Integer.valueOf(stuMusic) > 100) {
						System.out.println("점수는 0 ~ 100점 범위 내에서 입력바랍니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력바랍니다.");
					continue;
				}
				ssVO.setIntMusic(Integer.valueOf(stuMusic));
				break;
			}
			stuList.add(ssVO);
		}
	}

	@Override
	public void scoreSumFloat() {

		for (ScoreVO vo : stuList) {
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();

			float avg = (float) sum / 4;

			vo.setIntSum(sum);
			vo.setFloatAvg(avg);
		}
	}
	
	public void saveScoreToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			printer.println(Values.dLine(50));
			printer.println("성적알림표");
			printer.println(Values.dLine(50));
			printer.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
			printer.println(Values.sLine(50));
			for (ScoreVO vo : stuList) {
				printer.print(vo.getStNum() + "\t");
				printer.print(vo.getIntKor() + "\t");
				printer.print(vo.getIntEng() + "\t");
				printer.print(vo.getIntMath() + "\t");
				printer.print(vo.getIntMusic() + "\t");
				printer.print(vo.getIntSum() + "\t");
				printer.print(vo.getFloatAvg() + "\n");
			}
			System.out.println(Values.sLine(50));
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공!!!");
		} catch (IOException e) {
			System.out.println("파일 생성 중 문제 발생!!!");
		}

	}

	@Override
	public void outputScore() {

		int totalSum = 0;
		float totalAvg = 0;
		int nSize = stuList.size();
		System.out.println(Values.dLine(50));
		System.out.println("성적알람표");
		System.out.println(Values.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(50));
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t", stuList.get(i).getStNum());
			System.out.printf("%d\t", stuList.get(i).getIntKor());
			System.out.printf("%d\t", stuList.get(i).getIntEng());
			System.out.printf("%d\t", stuList.get(i).getIntMath());
			System.out.printf("%d\t", stuList.get(i).getIntMusic());
			System.out.printf("%d\t", stuList.get(i).getIntSum());
			System.out.printf("%3.2f\n", stuList.get(i).getFloatAvg());
		}
		System.out.println(Values.sLine(50));
		int korSum = 0;
		int engSum = 0;
		int mathSum= 0;
		int musicSum = 0;
		for(int i = 0; i < nSize; i++) {
			korSum += stuList.get(i).getIntKor();
			engSum += stuList.get(i).getIntEng();
			mathSum += stuList.get(i).getIntMath();
			musicSum += stuList.get(i).getIntMusic();
			totalAvg = (float) korSum + engSum + mathSum + musicSum / 4;
		}
		System.out.print("총점 : " + korSum + "\t" + engSum + "\t" + mathSum + "\t" + musicSum + "\n");
		System.out.print("평균 : " + totalAvg);
		System.out.println(Values.dLine(50));

	}
}