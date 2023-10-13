package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateContactUsPage extends BaseClass{
	
	public CaltrateContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item even last is-current ']//self::li[normalize-space()='Contact Us']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[normalize-space()='Get Coupons']")
	private static WebElement getCoupons;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/bp-caltrate/en_CA/products/coupon%20(1).PNG?auto=format')]")
	private static WebElement healthySavingsImg;
	
	
	public void clickBreadcrumbOne ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void textBreadcrumbTwo ()throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbTwo));
			System.out.println("Breadcrumb Two is verified");
		} else {
			throw new Exception("Bredcrumb Two ia not presented in the page");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupons);
		clickElementUsingJavaScript(getCoupons);
	}
	
	public String clickHealthySavingsImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(healthySavingsImg);
		clickElementUsingJavaScript(healthySavingsImg);
		pageLoad();
		String currentUrl = getCurrentUrl();
		return currentUrl;
	}

}
