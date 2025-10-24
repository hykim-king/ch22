package com.pwck.ch22.ed03;

import java.io.*;

public class ByteOutputMain {

	public static void main(String[] args) {

		// try-with-resourse: AutoCLoseable 구현한 클래스
		// OutputStream은 AutoCLoseable 인터페이스를 구현
		try (OutputStream fos = new FileOutputStream("single_byte.txt");) {

			fos.write(65); // ACII 'A'
			fos.write(66);
			fos.write(67);
			fos.write('F');

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}
}
