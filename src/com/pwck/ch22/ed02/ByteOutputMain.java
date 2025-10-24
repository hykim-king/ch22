package com.pwck.ch22.ed02;

import java.io.*;

public class ByteOutputMain {

	public static void main(String[] args) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("single_byte.txt");
			fos.write(65);
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
		System.out.println("프로그램 종료");

	}
}
