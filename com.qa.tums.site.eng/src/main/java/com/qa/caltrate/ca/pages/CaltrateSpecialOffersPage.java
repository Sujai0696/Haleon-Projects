package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateSpecialOffersPage extends BaseClass{
	
	public CaltrateSpecialOffersPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item even last is-current ']//self::li[normalize-space()='Coupons']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/bp-caltrate/en_CA/global/top-coupon.PNG?auto=format')]")
	private static WebElement saveNowImg;
	
	@FindBy(xpath = "//a[normalize-space()='Haleon’s Get Healthy Savings']")
	private static WebElement getHealthySavings;
	
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
	
	public String clickSaveNowImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(saveNowImg);
		clickElementUsingJavaScript(saveNowImg);
		pageLoad();
		String currentUrl = getCurrentUrl();
		return currentUrl;
	}
	
	public String clickGetHealthySavingsLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getHealthySavings);
		clickElementUsingJavaScript(getHealthySavings);
		pageLoad();
		String currentUrl = getCurrentUrl();
		return currentUrl;
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
