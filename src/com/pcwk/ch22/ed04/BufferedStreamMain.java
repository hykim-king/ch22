/**
 * 파일명: BufferedStreamMain.java
 * 설명:
 * 작성자: user
 * 작성일: 2025-10-24
 * 버전 : 1.0
 */
package com.pcwk.ch22.ed04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamMain {

	public static void main(String[] args) {

		String sourceFile = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\src\\com\\pcwk\\ch22\\ed04\\ImageBufferCopy.java";
		String desFile = "ImageBufferCopy999.java";

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
