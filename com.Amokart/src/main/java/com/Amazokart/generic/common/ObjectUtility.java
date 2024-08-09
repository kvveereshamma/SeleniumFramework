package com.Amazokart.generic.common;

import com.Amazokart.generic.excelutility.ReadExcelFile;
import com.Amazokart.generic.propertyfileutility.ReadPropertyFile;
import com.Amokart.generic.javautility.Javautility;
import com.Amokart.generic.webdriverutility.WebdriverUtility;

public class ObjectUtility implements FrameworkConstant{
	public ReadExcelFile excelobj;
	public Javautility javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverUtility webdriverobj;

	public void objectCreation() {
	 excelobj= new ReadExcelFile();
	 javaobj = new Javautility();
	 propertyobj = new ReadPropertyFile();
	 webdriverobj = new WebdriverUtility();
	
	}

}
