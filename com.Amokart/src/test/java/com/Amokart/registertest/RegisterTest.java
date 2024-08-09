package com.Amokart.registertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Amazokart.generic.common.BaseClass;
import com.Amazokart.generic.excelutility.ReadExcelFile;
import com.Amazokart.generic.pagerepository.Registerpage;

@Listeners(com.Amazokart.generic.listenerutility.Listeners.class)
public class RegisterTest extends BaseClass {

	//@DataProvider(name = "register")
	@Test(enabled = false)
	public void createUser_validData(String name, String Email, String dept) {

		// Assert.fail();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify Page Using Assert
		String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);

		// Create Object for RegisterPage
		// Registerpage regpage = new Registerpage(driver);

		// Step1:Clear the Name in The Name TextField
		// regpage.getName().clear();

		WebElement ele = driver.findElement(By.id("name"));
		ele.clear();
		ele.sendKeys(name);

		// Create an Object for ExcelUtilityFile class
		ReadExcelFile excel_f = new ReadExcelFile();

		// Step 2: write the Name in the Name Text Field
		ele.sendKeys(excel_f.readdata("student", 1, 1));

		// Step3:Display the Email
		System.out.println(excel_f.readdata("student", 1, 2));
		// System.out.println(excel_f.readdata("Sheet", 1, 2));

		// Step4:Write the Data
		excel_f.writedata("student", 2, 1, "Himanshu");
		// excel_f.writedata("Sheet1", 10, 1,"Laxmi");

		// Execution Completed Message
		Reporter.log("createUser_validData for Register Test", true);
	}

	@Test(dataProvider = "register")
	public void createUser_invalidData(String name, String email, String password) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Name:" + name);
		System.out.println("Email:" + email);
		System.out.println("Password:" + password);
		Reporter.log("createUser_InvalidData for Register Test", true);
        //Assert.fail();
	}

}
