package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CaltrateNousrejoindrePage extends BaseClass{
	
	public CaltrateNousrejoindrePage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Home']")
    private static WebElement homebreadcrumbs;			
	
    @FindBy(xpath = "//li[text()=' Nous rejoindre ']")
    private static WebElement Nousrejoindrebreadcrumbs;	
	
   
	
	
	
  //Methods//
  	
      public void clickonHomebreadcrumbs() throws Throwable {
    		waitForPageLoadJava();
    		scrollDownUsingElement(homebreadcrumbs);
    		clickElementUsingJavaScript(homebreadcrumbs);
  	}	
      public void clickonNousejoindrebreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Nousrejoindrebreadcrumbs);
  		clickElementUsingJavaScript(Nousrejoindrebreadcrumbs);
	}	
	
	
	
	
	

}
