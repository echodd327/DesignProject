package logtest;

import java.util.logging.Logger;



public class LoggingTest {
	
	private static Logger logger = Logger.getLogger(LoggingTest.class.getName());
	public static void main(String[] args) {
		logger.info("jdk logging info : a msg");
	}
}
