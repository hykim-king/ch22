package com.pcwk.ch22.ed04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageBuffCopy {

	public static void main(String[] args) {
		// 원본 이미지 경로
		String sourceImagePath = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\image.png";
		// 복사 이미지 이름
		String destinationImagePath = "images2.png";
		try (FileInputStream fis = new FileInputStream(sourceImagePath);
				FileOutputStream fos = new FileOutputStream(destinationImagePath)) {
			int byteRead = 0;
			byte[] buffer = new byte[1024];
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("이미지 복사 성공");
	}

}
