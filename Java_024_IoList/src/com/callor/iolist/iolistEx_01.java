package com.callor.iolist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;

public class iolistEx_01 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				strList.add(str);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String str : strList) {
			String[] nums = str.split(",");
			IolistVO vo = new IolistVO();
			vo.setDate(nums[0]);
			vo.setpName(nums[4]);
			vo.setdName(nums[5]);
			vo.setcName(nums[6]);
			vo.setNum(Integer.valueOf(nums[7]));
			vo.setiPrice(Integer.valueOf(nums[8]));
			vo.setoPrice(Integer.valueOf(nums[9]));
			vo.setQty(Integer.valueOf(nums[10]));
			
		}
	}
}
