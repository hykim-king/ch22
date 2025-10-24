package com.pwck.ch22.ed05;

import java.io.*;

public class BufferedStreamMain {

	public static void main(String[] args) {

		String sourceFile = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\src\\com\\pwck\\ch22\\ed05\\ImageBufferCopy.java";
		String desFile = "ImageBufferCopy999.java"; // 생성될 파일 이름 지정(겹치지 않게)

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));) {

			int data;
			while ((data = bis.read()) != -1) {
				System.out.println(data);
				bos.write(data);
			}

		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		}
			System.out.println("프로그램 종료!");
	}

}
