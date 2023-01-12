package tips.java.demo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	
	final static Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String [] args) {
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal stuff");
	}

}
