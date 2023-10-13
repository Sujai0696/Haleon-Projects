package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateSelectPage extends BaseClass{
	
	public CaltrateSelectPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Home']")
    private static WebElement HomeBreadcrumbs;	
	
    @FindBy(xpath = "//a[text()='Products']")
    private static WebElement ProductsBreadcrumbs;	
	
    @FindBy(xpath = "//li[text()=' Caltrate SELECT ']")
    private static WebElement CaltrateSelectBreadcrumbs;	
	
    @FindBy(xpath = "//span[text()='BUY NOW']")
    private static WebElement CaltrateBuyNow;
	
    @FindBy(xpath = "//h2[text()='Caltrate SELECT 50s']")
    private static WebElement CaltrateBuyNowtxt;
    
    @FindBy(xpath = "//a[@tabindex=\"0\"]")
	private static WebElement buyNowVisibility;
	
    @FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]//self::span")
    private static WebElement CaltrateBuyNowClose;
	
    @FindBy(xpath = "(//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage default-style first odd component\"]//a)[1]")
    private static WebElement getcoupons;
	
    @FindBy(xpath = "(//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage default-style first odd component\"]//a)[2]")
    private static WebElement seeAllproducts;
	
    @FindBy(xpath = "//div[@class=\"image component section image-w-auto odd last\"]//img")
    private static WebElement Coupons;
	
	
	
	
	
	
	
	//Methods//
	
  	public void clickonHomeBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(HomeBreadcrumbs);
  		
  		
  }	
  	public void clickonProductsBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(ProductsBreadcrumbs);
 	
  }	
	public void clickonCaltrateSelectBreadcrumbs() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(CaltrateSelectBreadcrumbs);
 	
  }	
	public void clickonCaltrateBuyNow() throws Throwable {
  		clickElementUsingJavaScript(CaltrateBuyNow);
  		visibilityOf(CaltrateBuyNowtxt);
//  		boolean elementIsDisplayed=elementIsDisplayed(CaltrateBuyNowtxt);
//  		Assert.assertTrue(elementIsDisplayed);
//  		clickElementUsingJavaScript(CaltrateBuyNowClose);
  		if (isElementPresent(CaltrateBuyNowtxt)) {
  			visibilityOf(CaltrateBuyNowtxt);
			Assert.assertTrue(elementIsDisplayed(CaltrateBuyNowtxt));
			visibilityOf(CaltrateBuyNowClose);
			clickElementUsingJavaScript(CaltrateBuyNowClose);
			implicitWait();
			if (isElementPresent(buyNowVisibility)) {
				Assert.assertTrue(true);
				System.out.println("BuyNow button is verified successdully");
			} else {
				throw new Exception("BuyNow button is not closed");
			}
		} else {
			throw new Exception("BuyNow Text is not verified");
		}
	
  		
  		
  }	
  		
 	
  
	public void clickongetcoupons() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(getcoupons);
 	
  }	
	public void clickonAllProducts() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(seeAllproducts);
 	
  }	
	public String clickonCoupons() throws Throwable {
		waitForPageLoadJava();
		scrollDownUsingElement(Coupons);
  		clickElementUsingJavaScript(Coupons);
  		String currentUrl=getCurrentUrl();
  		return currentUrl;
 	
  }	
	
	
	
	
	
	
	

}
