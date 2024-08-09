package com.Amazokart.generic.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass extends ObjectUtility {
	public WebDriver driver = null;
	public static WebDriver driver_static;

	@DataProvider(name = "register")
	public Object[][] registerdata() {

		Object[][] data = new Object[3][3];

		data[0][0] = "Veera";
		data[0][1] = "kvveereshamma@gmail.com";
		data[0][2] = "Testing";

		data[1][0] = "Laxmi";
		data[1][1] = "kvlakshmi2981@gmail.com";
		data[1][2] = "Developer";

		data[2][0] = "Omkar";
		data[2][1] = "guruvaomkari@gmail.com";
		data[2][2] = "Devops";

		return data;
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String bname) {

		
		// if User gives browsername="chrome"
		if (bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			// Step1:Launch the Browser-Chrome
			driver = new ChromeDriver();
		}
		// if User gives browsername="firefox"
		else if (bname.equals("firefox")) {
			// Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
		// if User gives browsername="edge"
		else if (bname.equals("edge")) {
			// Launch the Browser-Edge
			driver = new EdgeDriver();
		} else {
			System.out.println("U have Enter the InValid Browser Name and Im Executing DefaultBrowser ");
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

			driver = new ChromeDriver();
		}

		// Create Object for all =Property File - made extends baseclass child-object
		// utility parentclass
		objectCreation();

		String url = propertyobj.readData("url");
		// Step 2 :Navigate to the Application via URL
		driver.get(url);

		Reporter.log("BrowserSetup Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// Close The Browser
		driver.close();
		Reporter.log("Closebrowser Sucessful", true);

	}

	@BeforeTest
	public void precondition() {
		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		Reporter.log("postcondition Done Sucessful", true);

	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}

}
