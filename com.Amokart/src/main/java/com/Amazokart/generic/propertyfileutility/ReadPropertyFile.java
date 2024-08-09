package com.Amazokart.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amazokart.generic.common.FrameworkConstant;

public class ReadPropertyFile implements FrameworkConstant {
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;

	public String readData(String key){
		// Convert the Physical file into Java Understandable
		try {
	
		fis = new FileInputStream(propertyPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// creating Instance for Properties class
		p = new Properties();

		// load the all Common Data
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// fetch the data
		String data = p.getProperty(key);

		return data;
	}

	public void writeData(String key, String value) throws IOException {
		// enter the data
		p.put(key, value);

		// create instance for FILE output Stream
		fos = new FileOutputStream("./src/test/resources/data/commondata.properties");

		// store the Data
		p.store(fos, "Updated the New Key-value Sucessfully");
	}

	public void displaydata(String key) {
		// Convert the Physical file into Java Understandable
		try {
			fis = new FileInputStream("./src/test/resources/data/commondata.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// creating Instance for Properties class
		p = new Properties();

		// load the all Common Data
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fetch the data
		String data = p.getProperty(key);
		
		//Print on Console
		System.out.println(data);

	}
}
