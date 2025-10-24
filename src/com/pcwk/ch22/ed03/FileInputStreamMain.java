package com.pcwk.ch22.ed03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamMain {

    public static void main(String[] args) {

        String filePath = "D:\\ACON_20250916\\01_JAVA\\workspace\\ch22\\byte.data.text";

        // ✅ try-with-resources 구문: 자동으로 close() 호출됨
        try (InputStream fis = new FileInputStream(filePath)) {

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {  // ✅ 파일을 찾지 못했을 때
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {            // ✅ 입출력 중 에러 발생 시
            System.out.println("IOException: " + e.getMessage());
        } catch (Exception e) {              // ✅ 기타 모든 예외
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("프로그램 종료");
    }
}

/*
 * byte[] buffer = new byte[100]; int byteRead; while((byteRead =
 * fis.read(buffer)) != -1){ System.out.println(new String(buffer,0,byreRead));
 * }
 * 
 * 
 */
