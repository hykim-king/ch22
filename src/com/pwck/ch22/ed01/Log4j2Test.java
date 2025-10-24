package com.pwck.ch22.ed01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.pcwk.ch15.ed01.Log4j2Test;

public class Log4j2Test {

		static final Logger log = LogManager.getLogger(Log4j2Test.class);

		public static void main(String[] args) {
			// FATAL > ERROR > WARN > INFO > DEBUG > TRACE
			log.trace("TRACE");
			log.debug("DEBUG");
			log.info("INFO");
			log.warn("WARN");
			log.error("ERROR");
			log.fatal("FATAL");
			
		}


	}


