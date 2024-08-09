package com.Amokart.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void waitForElementPresent(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
	public void provideWaiteStatement(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	//SWITCH TO FRAME
	public void switchToFrame(WebDriver driver,int index) 
    {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameID) 
    {
		driver.switchTo().frame(nameID);
	}
	public void switchToFrame(WebDriver driver,WebElement element) 
    {
		driver.switchTo().frame(element);
	}
	
	//SWITCH TO ALERT HANDLING
	public void switchToAlertAndAccept(WebDriver driver) 
    {
		driver.switchTo().alert().accept();
	}
	public void switchToAlertAndCancel(WebDriver driver) 
    {
		driver.switchTo().alert().dismiss();;
	}
	
	//Select class handle the dropdowns
	public void select(WebElement element,String text) 
    {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void select(WebElement element,int index) 
    {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	
	//Actions class to handle the mouse &keyboard actions
	public void mousemoveonElement(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.doubleClick(element).perform();
	}
    public void clickonElement() 
    {
		
	}
   public void passDataOnElement()
   {
	
   }
   public void clearDataOnElement()
   {
		
   }
   public void  validateOnElementDisplayed()
   {
		
   }
   public void  validateOnElementEnabled() 
   {
		
   }
   public void  validateOnElementSelected() 
   {
		
   }
   public void  selectOptionONDropdown(int index) 
   {
		
   }
   public void  selectOptionONDropdown_value(String value)
   {
		
   }
   public void  selectOptionONDropdown(String visibletext) 
   {
		
   }
   public void  SwitchControlToAlert() 
   {
		
   }
   public void  SwitchControlToFrame() 
   {
		
   }
	/*public void provideWaitStatement() {
		
	}
	public void clicOnElement() {
		
		
	}
	public void passDataOnElement() {
		
		
	}
  public void clearDataOnElement() {
	
	
  }
  public void validateOnElementDisplayed() {
	
  }
 public void validateOnElementEnabled() {
	
 }
 public void validateOnElementSelected() {
	
 }
 public void selectionOnDropdoen(int index) {
	 
		
 }
 public void selectionOnDropdown(String visibletext) {
	 
		
 }
 public void selectionOnDropdown_Value(String value) {
	 
	
}
 public void switchControlToAlert() {
	 
	
}
 public void switchControlToFrame() {
	
}*/
}
