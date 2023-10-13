package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltratefrHomepagePage extends BaseClass{
	
	public CaltratefrHomepagePage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "(//a[text()='Essayez les Gelées'])[1]")
    private static WebElement BannerImage;		
	
    @FindBy(xpath = "(//a[text()='Économisez maintenant'])[2]")
    private static WebElement BannerImage1;		
	
    @FindBy(xpath = "//div[@class=\"image component section p-m-l-2 image-w-auto even last col-xs-12\"]//child::img")
    private static WebElement couponsfr;	
	
	
	
	
	
	
	
	
  
  	
  //Methods//	
  	
  	public void clickonBannerImage() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(BannerImage);
  		
  		
  }	
  	public void clickonBannerImage1() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(BannerImage1);
  		
  		
  }	
	public void clickonCoupons() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(couponsfr);
	}
	
	
	
	
	
	
	

}
