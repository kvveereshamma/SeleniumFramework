package com.Amokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest5 
{

	@Test(groups = "integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD 5 Sucessfuly",true);
	}
	
	@Test(dependsOnMethods = "addProduct",groups = "functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD 5 Sucessfuly",true);
	}
	
	@Test(dependsOnMethods = "addProduct",groups = "smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD 5 Sucessfuly",true);
	}

}
