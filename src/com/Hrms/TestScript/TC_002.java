package com.Hrms.TestScript;

import org.testng.annotations.Test;

import com.Hrms.lib.General;

public class TC_002 {
	@Test
	public void tc002() throws Exception {
	//public static void main(String[] args) throws Exception{
		General gn  = new General();
		gn.openApplication();
		gn.logintoApplication();
		gn.enterintoFrame();
		gn.addEmployee();
		gn.exitFromFrame();
		gn.logoutfromApplication();
		gn.closeApplication();
		
	}

}
