package com.Hrms.TestScript;

import com.Hrms.lib.General;

public class TC_002 {
	public static void main(String[] args) throws Exception{
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
