package com.Amokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest2 
{

	@Test(invocationCount = 2,groups = "integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(invocationCount = 2,dependsOnMethods = "addProduct",groups = "functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD Sucessfuly",true);
	}
	//priority,depends on method then go for alphbetical order execute
	@Test(invocationCount = 2,dependsOnMethods = "addProduct",groups = "smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}
