package com.Hrms.TestScript;

import org.testng.annotations.Test;

import com.Hrms.lib.General;

public class TC_004 {
	@Test
public void tc003() throws Exception {
	//public static void main(String[] args)throws Exception {
		General gn = new General();
		gn.openApplication();
		gn.logintoApplication();
		gn.enterintoFrame();
		gn.deleteEmployee();
		gn.exitFromFrame();
		gn.logoutfromApplication();	
		gn.closeApplication();

	}

}
