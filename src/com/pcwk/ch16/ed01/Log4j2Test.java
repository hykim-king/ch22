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

public class Log4j2Test {

	static final Logger log = LogManager.getLogger(Log4j2Test.class);
	
	public static void main(String[] args) {
		// FATAL>ERROR>WARN>INFO>DEBUG>TRACE
		log.trace("TRACE");
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");  
		log.error("ERROR");
		log.fatal("FATAL");

	}

}
