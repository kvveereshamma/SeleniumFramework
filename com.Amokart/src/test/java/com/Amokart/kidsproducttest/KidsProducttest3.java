package com.Amokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest3 
{

	@Test(enabled = false,groups = "integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(invocationCount = 0,dependsOnMethods = "addProduct",groups = "functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(enabled = false,dependsOnMethods = "addProduct",groups = "smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}
