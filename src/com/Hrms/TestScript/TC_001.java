package com.Hrms.TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.Hrms.lib.General;
public class TC_001 {
	@Test
	public void tc001() throws Exception{
	//public static void main(String[] args) throws Exception{
		//Test Steps
		DOMConfigurator.configure("log4j.xml");
	 General gn  = new General();
		gn.openApplication();
		gn.logintoApplication();
		gn.logoutfromApplication();
		gn.closeApplication();
	}

}
                        