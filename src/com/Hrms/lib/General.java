package com.Hrms.lib;
//Std rule : To provide "all re-usable fun:/methods " of whole application
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Hrms.Utility.Log;



public class General extends Global {
	public void openApplication () throws Exception{
		driver = new ChromeDriver();
		driver.navigate().to(Url);
		System.out.println("Application Opened");
		Thread.sleep(3000);
		Log.info("Application opened");
	}
	
	public void logintoApplication () throws Exception{
		driver.findElement(By.name(TextBox_Login_Name)).sendKeys(Username);
		driver.findElement(By.name(TextBox_Password)).sendKeys(Password);
		driver.findElement(By.name(Button_Login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
		Thread.sleep(3000);
		   
	}

	public void enterintoFrame () {
		  driver.switchTo().frame("rightMenu");
		  System.out.println("Entered in  to Frame");
		  Log.info("Entered in to Frame");
	}
	
  public void addEmployee ()throws Exception {
	  driver.findElement(By.xpath(Button_Add_Employee)).click();
	  driver.findElement(By.name(TextBox_LastName)).sendKeys(LastName);
	  driver.findElement(By.name(TextBox_FirstName)).sendKeys(FirstName);
	  driver.findElement(By.id(Button_Photo)).sendKeys(Photo);
	  driver.findElement(By.id(Button_save)).click();
	  System.out.println("Employee Added");
	  Log.info("Employee Added");
  }
  
  public void editEmployee ()throws Exception {
	  driver.findElement(By.name(Edit_Button)).click();
	  driver.findElement(By.name(TextBox_LastName_F1)).clear();
	  driver.findElement(By.name(TextBox_FirstName_F1)).clear();
	  Thread.sleep(3000);
	  driver.findElement(By.name(TextBox_LastName_F1)).sendKeys(LastName_F1);
	  driver.findElement(By.name(TextBox_FirstName_F1)).sendKeys(FirstName_F1);
	  Thread.sleep(3000);
	  driver.findElement(By.name(Button_save_F1)).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(Back)).click();
	  System.out.println("Edit Employee Completed");
	  Log.info("Edit Employee Completed");
  }
   
  public void deleteEmployee() throws Exception{
	  Select st = new Select(driver.findElement(By.name(Search_By)));
	   st.selectByVisibleText(Visible_Text);
	  driver.findElement(By.name(TextBox_Search_for)).sendKeys(EmpID);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(Button_search)).click();
	  driver.findElement(By.name(CheckBox_EmpId)).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(Button_Delete)).click();
	  System.out.println("Employee Deleted");
	  Log.info("Employee Deleted");
  }
  
  public void exitFromFrame () {
	  driver.switchTo().defaultContent();
	  System.out.println("Exited from Frame");
	  Log.info("Exited from Frame");
  }
  public void logoutfromApplication ()throws Exception {
	  driver.findElement(By.linkText(LinkText_Logout)).click();
		System.out.println("Logout Completed");
		Log.info("Log out completed");
		Thread.sleep(3000);
  }
  
  public void closeApplication () {
	  driver.close();
		System.out.println("Application Closed");
		Log.info("Close Application");
  }
	
}
