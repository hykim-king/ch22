/**
 * 파일명: Log4j2Test.java
 * 설명:
 * 작성자: user
 * 작성일: 2025-10-16
 * 버전 : 1.0
 */
package com.pcwk.ch16.ed01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test02 {

	static final Logger log = LogManager.getLogger(Log4j2Test02.class);

	public static void main(String[] args) {
		// FATAL>ERROR>WARN>INFO>DEBUG>TRACE
		String name = "이상무";
		int age = 21;
		double height = 180.5;

		log.debug("이름: {}", name);
		log.debug("나이: {}", age);
		log.debug("키: {}", height);

		log.debug("회원 정보 - 이름: {}, 나이: {}, 키: {}", name, age, height);

	}

}
