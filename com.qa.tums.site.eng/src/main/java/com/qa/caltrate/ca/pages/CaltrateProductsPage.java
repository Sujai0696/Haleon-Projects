package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateProductsPage extends BaseClass{
	
	public CaltrateProductsPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Home']")
    private static WebElement HomeBreadcrumbs;	
		
    @FindBy(xpath = "//a[text()='Products']")
    private static WebElement ProductsBreadcrumbs;	
	
    @FindBy(xpath = "//li[text()=' Caltrate ']")
    private static WebElement CaltrateBreadcrumbs;	
		
    @FindBy(xpath = "//span[text()='BUY NOW']")
    private static WebElement BuyNowbtn;
	
    @FindBy(xpath = "//h2[text()='Caltrate 60s']")
    private static WebElement BuyNowTxt;
    
    @FindBy(xpath = "(//a[@tabindex=\"0\"])[1]")
   	private static WebElement buyNowVisibility;
	
    @FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]//self::span")
    private static WebElement BuyNowClose;
	
    @FindBy(xpath = "//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage default-style first odd component\"]//a[1]")
    private static WebElement getcoupons;
	
    @FindBy(xpath = "//a[text()='See All Products']")
    private static WebElement seeAllProducts;
	
    @FindBy(xpath = "//div[@class=\"image component section image-w-auto odd last\"]//img")
    private static WebElement ProductsCoupons;
	
	
	
	
	
	
	
	

	//Methods//
	
  	public void clickonHomeBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(HomeBreadcrumbs);
  
  }	
  	public void clickonProductsBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(ProductsBreadcrumbs);
  	
  }	
  	public void clickonCaltrateBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(CaltrateBreadcrumbs);
  
  }	
  	public void clickonBuyNow() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(BuyNowbtn);
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
  		clickElementUsingJavaScript(getcoupons);
  
  }	
  	public void clickonseeAllProducts() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(seeAllProducts);
  
  }	
  	public String clickonProductsCoupons() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(ProductsCoupons);
  		clickElementUsingJavaScript(ProductsCoupons);
  		String currentUrl=getCurrentUrl();
  		return currentUrl;
  
  }	
	
	
	
	
	
	
	
	
	

}
