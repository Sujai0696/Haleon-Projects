package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaSenzaMedicinaliPage extends BaseClass{
	
	public RinazinaSenzaMedicinaliPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Prodotti']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Senza Medicinali']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-6 col-md-3 reference-rinazina-aquamarina-isotonica-aloe-delicata']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement  productOne;
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbOne);
		pageLoad();
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbTwo);
		pageLoad();
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
			System.out.println(getElementText(breadcrumbThree)+": Breadcrumb verified successfully");
		} else {
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	

}
