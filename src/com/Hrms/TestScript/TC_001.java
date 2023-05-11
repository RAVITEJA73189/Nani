package com.Hrms.TestScript;

import com.Hrms.lib.General;
public class TC_001 {
	//TestSteps
	public static void main(String[] args) throws Exception{
		General gn  = new General();
		gn.openApplication();
		gn.logintoApplication();
		gn.logoutfromApplication();
		gn.closeApplication();
	}

}
