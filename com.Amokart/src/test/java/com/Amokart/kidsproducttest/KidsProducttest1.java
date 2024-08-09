package com.Amokart.kidsproducttest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class KidsProducttest1 
{

	@Test(priority = 1 ,invocationCount = 2,groups = "integration")
	public void addProduct() {
		//Assert.fail();
		Reporter.log("Addproduct--Kids PRD 1 Sucessfuly",true);
	}
	
	@Test(priority = 2 ,dependsOnMethods = "addProduct",groups = "functionality")
	public void updateProduct() {
		//Reporter.log("Browser is :"+browser,true);
		Reporter.log("Updateproduct--Kids PRD 1 Sucessfuly",true);
	}
	//@Parameter()
	@Test(priority = 3 ,dependsOnMethods = "addProduct",enabled = false,groups = "smoke")
	public void deleteProduct() {
		//Reporter.log("Browser is :"+browser,true);
		//Assert.fail();
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}
