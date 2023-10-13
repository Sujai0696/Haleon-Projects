package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateCaltratePlus extends BaseClass{

	public CaltrateCaltratePlus() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Products']")
	private static WebElement breadcrumbTwo;
	
//	@FindBy(xpath = "//*[@class='breadcrumb-list-item odd last is-current ']//self::li[normalize-space()='Caltrate Soft Chews']")
//	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[normalize-space()='BUY NOW']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//h2[normalize-space()='Caltrate PLUS 60s']")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//a[normalize-space()='Get Coupons']")
	private static WebElement getCoupons;
	
	@FindBy(xpath = "//a[normalize-space()='See All Products']")
	private static WebElement seeAllProducts;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/bp-caltrate/en_CA/global/product-coupons.PNG?auto=format')]")
	private static WebElement saveNowImg;
	
	
	
	
	public void clickBreadcrumbOne ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void clickBreadcrumbTwo ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
//	public void textBreadcrumbThree ()throws Exception {
//		waitForPageLoadJava();
//		if (isElementPresent(breadcrumbThree)) {
//			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
//			System.out.println("Breadcrumb Three is verified");
//		} else {
//			throw new Exception("Bredcrumb Coupons ia not presented in the page");
//		}
//	}
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(buyNow);
		clickElementUsingJavaScript(buyNow);
		if (isElementPresent(buyNowText)) {
			Assert.assertTrue(elementIsDisplayed(buyNowText));
			visibilityOf(buyNowClose);
			clickElementUsingJavaScript(buyNowClose);
			Assert.assertTrue(elementIsDisplayed(buyNow));
		} else {
			throw new Exception("BuyNow Text is not verified");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupons);
		clickElementUsingJavaScript(getCoupons);
	}
	
	public void clickSeeAllProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeAllProducts);
		clickElementUsingJavaScript(seeAllProducts);
	}
	
	public String clickSaveNowImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(saveNowImg);
		clickElementUsingJavaScript(saveNowImg);
		pageLoad();
		String currentUrl = getCurrentUrl();
		return currentUrl;
	}
	
	
}
