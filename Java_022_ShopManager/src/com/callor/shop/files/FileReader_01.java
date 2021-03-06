package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {

		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/nums_rnd.txt";
		/*
		 * 파일을 읽을 때 사용하는 클래스
		 */

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(fileName);

			/* fileReader를 사용한 저수준 코드

			while (true) {

				int ascii = fileReader.read();
				if (ascii == -1) {
					break;
				}
				System.out.printf("%c\n", ascii);
			}
			*/
			
			buffer = new BufferedReader(fileReader);
			while (true) {
				String str = buffer.readLine(); // nextLine()
				if (str == null) {
					break;
				}
				// System.out.println(str);
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 파일 읽기 끝

		for (String str : strLines) {
			String[] nums = str.split(":");
			System.out.printf("첫 번째 숫자 : %s\n", nums[0]);
			System.out.printf("두 번째 숫자 : %s\n", nums[1]);
			System.out.printf("세 번째 숫자 : %s\n", nums[2]);
			System.out.printf("네 번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯 번째 숫자 : %s\n", nums[4]);
			System.out.println(Values.sLine);

			int sum = Integer.valueOf(nums[0]);
			sum += Integer.valueOf(nums[1]);
			sum += Integer.valueOf(nums[2]);
			sum += Integer.valueOf(nums[3]);
			sum += Integer.valueOf(nums[4]);
			System.out.println("합계 : " + sum);
			System.out.println(Values.dLine);
		}

	}

}
