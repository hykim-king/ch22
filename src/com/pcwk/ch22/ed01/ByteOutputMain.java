/**
 * 파일명: ByteOutputMain.java
 * 설명:
 * 작성자: user
 * 작성일: 2025-10-24
 * 버전 : 1.0
 */
package com.pcwk.ch22.ed01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputMain {

	public static void main(String[] args) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("single_byte.txt");
			fos.write(65);// ASCII 'A'
			fos.write(66);
			fos.write(67);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("프로그램 종료!");

	}

}
