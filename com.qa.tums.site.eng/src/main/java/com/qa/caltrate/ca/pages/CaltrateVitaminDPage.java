package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateVitaminDPage extends BaseClass{
	
	public CaltrateVitaminDPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[1]")
    private static WebElement HomeBreadcrumbs;	
		
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement ProductsBreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[3]")
    private static WebElement CaltrateVitaminDBreadcrumbs;	
	
    @FindBy(xpath = "(//span[normalize-space()='BUY NOW'])[1]")
    private static WebElement BuyNowBtn;
    
    @FindBy(xpath = "//a[@tabindex=\"0\"]")
	private static WebElement buyNowVisibility;
	
    @FindBy(xpath = "//h2[normalize-space()='Caltrate with Vitamin D 60s']")
    private static WebElement BuyNowTxt;
	
    @FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]//self::span")
    private static WebElement BuyNowClose;
	
    @FindBy(xpath = "(//a[@href=\"/special-offers/\"]//self::a)[2]")
    private static WebElement getcoupons;
	
    @FindBy(xpath = "//a[text()='See All Products']")
    private static WebElement seeallproducts;
	
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/bp-caltrate/en_CA/global/product-coupons.PNG?auto=format')]")
    private static WebElement Couponsproduct;
	
	
	
	
	
    
    
    
    
    
    
    
    
	
	
	//Methods//
	
  	public void clickonHomeBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(HomeBreadcrumbs);
  		clickElementUsingJavaScript(HomeBreadcrumbs);
  		
  		
  }	
  	public void clickonProductsBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(ProductsBreadcrumbs);
  		clickElementUsingJavaScript(ProductsBreadcrumbs);
  		
  		
  }	
  	public void clickonCaltrateVitaminDBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(CaltrateVitaminDBreadcrumbs);
  		clickElementUsingJavaScript(CaltrateVitaminDBreadcrumbs);
  		
  		
  }	
  	public void clickonBuyNow() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(BuyNowBtn);
  		clickElementUsingJavaScript(BuyNowBtn);
//  		visibilityOf(BuyNowTxt);
//  		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
//  		Assert.assertTrue(elementIsDisplayed);
//  		implicitWait();
//  		clickElementUsingJavaScript(BuyNowClose);
  		visibilityOf(BuyNowTxt);
  		if (isElementPresent(BuyNowTxt)) {
  			//visibilityOf(BuyNowTxt);
			Assert.assertTrue(elementIsDisplayed(BuyNowTxt));
			visibilityOf(BuyNowClose);
			clickElementUsingJavaScript(BuyNowClose);
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
  		scrollDownUsingElement(getcoupons);
  		clickElementUsingJavaScript(getcoupons);	
  }	
  	public void clickonSeeAllproducts() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(seeallproducts);
  		clickElementUsingJavaScript(seeallproducts);	
  }	
  	public String clickonCouponsproducts() throws Throwable {
  		waitForPageLoadJava();
  		//scrollDownUsingElement(Couponsproduct);
  		clickElementUsingJavaScript(Couponsproduct);
  		String currentUrl=getCurrentUrl();
  		return currentUrl;
  }	
	
  	
  	
  	
  	
  	
  	
  	
  	
  	
	
	
	

}
