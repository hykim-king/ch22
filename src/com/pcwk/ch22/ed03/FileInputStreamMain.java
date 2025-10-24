/**
 * 파일명: FileInputStreamMain.java
 * 설명:
 * 작성자: user
 * 작성일: 2025-10-24
 * 버전 : 1.0
 */
package com.pcwk.ch22.ed03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamMain {

	public static void main(String[] args) {
		// D:\ACON_20250916\01_JAVA\workspace\ch22\byte_data.txt
		String filePath = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\byte_data.txt";

		try (InputStream fis = new FileInputStream(filePath);) {

			int data;
			// 입력 스트림에서 1바이트를 읽고, 스트림에 끝에 도달하면 -1 반환.
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}

		System.out.println("프로그램 종료!");
	}

}
