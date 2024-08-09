package com.Amokart.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest 
{

	@Test
	public void login_ValidData() {
		
		Reporter.log("login_ValidData for register Test Sucessfuly",true);
	}
	
	@Test
	public void login_inValidData() {
		
		Reporter.log("login_inValidData Sucessfuly",true);
	}
}
