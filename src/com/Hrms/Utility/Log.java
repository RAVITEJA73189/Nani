package com.Hrms.Utility;

import org.apache.log4j.Logger;

public class Log {
   //intialize Log4j logs
	private static Logger log =Logger.getLogger(Log.class.getName());
	
	//need to create these methods, so that they can be called
	public static void info(String Message) {
		log.info(Message);
		
	}
}
