package com.pwck.ch22.ed05;

import java.io.*;

public class ImageCopy {

	public static void main(String[] args) {
		// 원본 이미지 경로
		String sourceImagePath = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\image.png";

		// 복사 이미지 이름
		String destinationImagePath = "pcwk_image.png";

		try (FileInputStream fis = new FileInputStream(sourceImagePath);
				FileOutputStream fos = new FileOutputStream(destinationImagePath);) {

			int data = 0;
			// 1byte씩 이미지 데이터 읽기
			while ((data = fis.read()) != -1) {
				//// 1byte씩 이미지 데이터 쓰기
				fos.write(data);
			}

		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}

		System.out.println("이미지 복사 성공!");

	}

}
