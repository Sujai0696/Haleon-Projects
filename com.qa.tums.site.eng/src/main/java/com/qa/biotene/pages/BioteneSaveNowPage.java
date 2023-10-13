package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneSaveNowPage extends BaseClass{
	
	public BioteneSaveNowPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement emailBtn;

	@FindBy(xpath = "//div[@class='box component section cf-popup-form first odd last alpha']")
	private static WebElement emailClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Save Now']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//h4[text()='DRY MOUTH SELF-ASSESSMENT']//following::a[text()='TAKE THE QUIZ']")
	private static WebElement takeTheQuiz;
	
	@FindBy(xpath = "//h4[text()='SAVE ON BIOTENE']//following::a[text()='GET COUPONS']")
	private static WebElement getCoupons;
	
	@FindBy(xpath = "//h4[text()='BUY Biotène']//following::a[text()='SHOP NOW']")
	private static WebElement saveNow;


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

	public void clickEmailBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(emailBtn)) {
			elementToBeClickable(emailBtn);
			try {
				if (emailBtn.isDisplayed()) {
					clickElementUsingJavaScript(emailBtn);
				}
				implicitWait();
				Assert.assertFalse(elementIsDisplayed(emailClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickTakeTheQuiz() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(takeTheQuiz)) {
			scrollDownUsingElement(takeTheQuiz);
			clickElementUsingJavaScript(takeTheQuiz);
			System.out.println("Take the quiz button clicked successfully");
		} else {
			System.out.println("Take The Quiz button is not presented in the page");
			throw new Exception("Take The Quiz button is not presented in the page");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(getCoupons)) {
			scrollDownUsingElement(getCoupons);
			clickElementUsingJavaScript(getCoupons);
			System.out.println("Get Coupons button clicked successfully");
		} else {
			System.out.println("Get Coupons button is not presented in the page");
			throw new Exception("Get Coupons button is not presented in the page");
		}
	}
	
	
	public void clickSaveNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(saveNow)) {
			scrollDownUsingElement(saveNow);
			clickElementUsingJavaScript(saveNow);
			System.out.println("Save Now button clicked successfully");
		} else {
			System.out.println("Save Now button is not presented in the page");
			throw new Exception("Save Now button is not presented in the page");
		}
	}

}
