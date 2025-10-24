package com.pcwk.ch22.ed02;
import java.io.*;

public class ByteOutputMain {
	
	public static void main(String[] args) {
		
		
		try(OutputStream fos = new FileOutputStream("single_byte.txt");) {
			 
			try {
				fos.write(65); // 아스키 코드 'A'
				fos.write(66);
				fos.write(67);
				fos.write('F');
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
