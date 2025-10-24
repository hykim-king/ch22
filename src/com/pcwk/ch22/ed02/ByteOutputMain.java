/**
 * 파일명: ByteOutputMain.java
 * 설명:
 * 작성자: user
 * 작성일: 2025-10-24
 * 버전 : 1.0
 */
package com.pcwk.ch22.ed02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputMain {

	public static void main(String[] args) {

		// try-with-resource: AutoCloseable 구현한 클래스
		//OutputStream은 AutoCloseable 인터페이스를 구현함.
		try (OutputStream fos = new FileOutputStream("single_byte.txt");) {

			fos.write(65);// ASCII 'A'
			fos.write(66);
			fos.write(67);
			fos.write('F');

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료!");

	}

}
