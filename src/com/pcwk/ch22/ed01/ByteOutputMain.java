package com.pcwk.ch22.ed01;
import java.io.*;

public class ByteOutputMain {
	
	public static void main(String[] args) {
		
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("single_byte.txt"); // ✅ 선언 제거, 대입만
			try {
				fos.write(65); // 아스키 코드 'A'
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
