package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateHomepagePage extends BaseClass{
	
	public CaltrateHomepagePage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "(//div[@class=\"box component section max-content-width p-d-b-2 even last col-xs-12\"])[2]")
    private static WebElement BannerImage;	
	
    @FindBy(xpath = "(//div[@class=\"box component section max-content-width p-d-b-2 even last col-xs-12\"])[3]")
    private static WebElement BannerImage1;	
	
    @FindBy(xpath = "(//a[@href=\"/products/caltrate-gummies/\"])[4]")
    private static WebElement trygummies;
	
    @FindBy(xpath = "(//a[@href=\"/special-offers/\"])[3]")
    private static WebElement savenow;
	
    @FindBy(xpath = "//div[@class=\"image component section image-w-auto max-content-width even last col-xs-12\"]//img")
    private static WebElement getcoupons;
	
	
	
	
	
	
	
	
	
	
	
	
	
//methods
  	
  
  	
  	
  	
  	public void clickonBannerImage() throws Throwable {
  		clickElementUsingJavaScript(BannerImage);
  		visibilityOf(BannerImage);
  		boolean elementIsDisplayed=elementIsDisplayed(BannerImage);
  		Assert.assertTrue(elementIsDisplayed);
  		
  }	
	public void clickonBannerImage1() throws Throwable {
  		clickElementUsingJavaScript(BannerImage1);
  		visibilityOf(BannerImage1);
  		boolean elementIsDisplayed=elementIsDisplayed(BannerImage1);
  		Assert.assertTrue(elementIsDisplayed);
  		
  }	
	public void clickonTryGummies() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(trygummies);
  		
  		
  }	
	public void clickonSavenow() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(savenow);
  		
  		
  }	
	public String clickongetcoupons() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(getcoupons);
  		String currentUrl=getCurrentUrl();
  		return currentUrl;
  		
  		
  }	
	
	
	

}
