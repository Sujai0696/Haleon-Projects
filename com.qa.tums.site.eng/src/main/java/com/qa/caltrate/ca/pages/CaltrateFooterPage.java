package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.baseClass.BaseClass;

public class CaltrateFooterPage extends BaseClass{
	
	public CaltrateFooterPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Contact Us']")
    private static WebElement contactus;	
				
    @FindBy(xpath = "//a[text()='Sitemap']")
    private static WebElement sitemap;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Methods//
	
  	public void clickonContactUs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(contactus);
  		if (isElementPresent(contactus)) {
  			clickElementUsingJavaScript(contactus);
		} else {
			throw new Exception("Contact us is not able to click");

		}
  		
  	}
	public void clickonSiteMap() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(sitemap);
  		if (isElementPresent(sitemap)) {
			clickElementUsingJavaScript(sitemap);
		} else {
			throw new Exception("SiteMap is not able to click");
		}
  		
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
