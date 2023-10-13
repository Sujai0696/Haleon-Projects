package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumHowLongDoesNexiumStayInSystemPage extends BaseClass{
	
	public NexiumHowLongDoesNexiumStayInSystemPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Homepage']//self::a[@href='/us/']")
	private static WebElement breadcrumbOne;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Understanding Heartburn']//self::a[@href='/us/understanding-heartburn/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' How Long Does Nexium 24HR Stay in Your System? ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//u[text()='side effects']//ancestor::a[@href='/us/understanding-heartburn/heartburn-relief/esomeprazole-side-effects/']")
	private static WebElement hyperLinkSideEffects;
	
	@FindBy(xpath = "//u[text()='at the same time']//ancestor::a[@href='/us/compare-treatments/nexium-and-tums/']")
	private static WebElement hyperLinkAtTheSameTime;
	
	@FindBy(xpath = "//u[text()='heartburn at night']//ancestor::a[@href='/us/understanding-heartburn/heartburn-at-night/']")
	private static WebElement hyperLinkHeartburnAtNight;
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}

	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkSideEffects() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSideEffects)) {
			scrollDownUsingElement(hyperLinkSideEffects);
			clickElementUsingJavaScript(hyperLinkSideEffects);
			pageLoad();
			System.out.println("HyperLink Side Effects clicked successfully");
		} else {
			System.out.println("HyperLink Side Effects is not presented in the page");
			throw new Exception("HyperLink Side Effects is not presented in the page");
		}
	}
	
	public void clickHyperLinkAtTheSameTime() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAtTheSameTime)) {
			scrollDownUsingElement(hyperLinkAtTheSameTime);
			clickElementUsingJavaScript(hyperLinkAtTheSameTime);
			pageLoad();
			System.out.println("HyperLink At The Same Time clicked successfully");
		} else {
			System.out.println("HyperLink At The Same Time is not presented in the page");
			throw new Exception("HyperLink At The Same Time is not presented in the page");
		}
	}
	
	public void clickHyperLinkHeartburnAtNight() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHeartburnAtNight)) {
			scrollDownUsingElement(hyperLinkHeartburnAtNight);
			clickElementUsingJavaScript(hyperLinkHeartburnAtNight);
			pageLoad();
			System.out.println("HyperLink Heartburn At Night clicked successfully");
		} else {
			System.out.println("HyperLink Heartburn At Night is not presented in the page");
			throw new Exception("HyperLink Heartburn At Night is not presented in the page");
		}
	}
	
	
	
	
	
	

}
