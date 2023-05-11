package com.Hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Std rule : To provide "Test data & object" of whole application
	
	   //Test data
	   //    DT   var     variable value
	public String Url = "http://183.82.103.245/nareshit/login.php";
	public String Username = "nareshit";
	public String Password = "nareshit";
	//Add employee
	public String LastName = "Teja";
	public String FirstName = "Ravi";
	public String Photo = "C:\\Users\\ravit\\Downloads\\desktop-4k-the-purge-mask-hkp0zyi2qnyx9y4m.jpg";
	//Edit Employee
	public String LastName_F1 = "Beast";
	public String FirstName_F1 = "Blue";
	//Delete Employee 
	public String EmpID = "9352";
	
	//objects/Elements
	//Login
	public String TextBox_Login_Name = "txtUserName" ;
	public String TextBox_Password = "txtPassword";
	public String Button_Login = "Submit";
	//Enter in to Frame 
	public String Frame = "rightMenu";
	//Add Employee
	public String Button_Add_Employee = "//input[@value='Add'][@type='button']";
	public String TextBox_LastName = "txtEmpLastName";
	public String TextBox_FirstName = "txtEmpFirstName";
	public String Button_Photo = "photofile";
	public String Button_save = "btnEdit";
	//Edit Employee
	public String Edit_Button = "EditMain";
	public String TextBox_LastName_F1 = "txtEmpLastName";
	public String TextBox_FirstName_F1 = "txtEmpFirstName";
	public String Button_save_F1 = "EditMain";
	public String Back = "//input[@value = 'Back'][@type = 'button']";
	//Delete Employee
	public String Search_By = "loc_code";
	public String Visible_Text ="Emp. ID";
	public String TextBox_Search_for = "loc_name";
	public String Button_search ="//input[@value ='Search'][@type = 'button']";
	public String CheckBox_EmpId = "chkLocID[]";
	public String Button_Delete = "//input[@value = 'Delete'][@type = 'button']";
	
	//Logout
	public String LinkText_Logout = "Logout";
	
}
