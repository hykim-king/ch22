package com.pcwk.ch22.ed02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayMain {

	public static void main(String[] args) {
		byte[] data = {68,69,70,71,72};
		try (OutputStream fos = new FileOutputStream("byte_array.txt");){
			fos.write(data);
		}catch(IOException e) {
			System.out.println("IOException"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception"+e.getMessage());
		}
		System.out.println("프로그램 종료");
	}

}
