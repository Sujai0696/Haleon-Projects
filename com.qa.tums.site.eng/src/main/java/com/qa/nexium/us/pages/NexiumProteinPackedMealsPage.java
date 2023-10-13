package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumProteinPackedMealsPage extends BaseClass{
	
	public NexiumProteinPackedMealsPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Heartburn Causes and Triggers']//self::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/']")
	private static WebElement breadcrumbThree;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' 14 Protein-Packed Meals to Help Heartburn ']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//u[text()='trigger heartburn']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/']")
	private static WebElement hyperLinkTriggerHeartburn;
	
	@FindBy(xpath = "//u[text()='tomatoes are a trigger food']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/replace-tomatoes-in-your-dishes/']")
	private static WebElement hyperLinkTomatoesAreATriggerFood;
	
	
	
	
	
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
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}

	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			scrollDownUsingElement(breadcrumbFour);
			String href = breadcrumbFour.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			System.out.println("Breadcrumb Four verified successfully");
		} else {
			System.out.println("Breadcrumb Four is not presented in the page");
			throw new Exception("Breadcrumb Four is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkTriggerHeartburn() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTriggerHeartburn)) {
			scrollDownUsingElement(hyperLinkTriggerHeartburn);
			clickElementUsingJavaScript(hyperLinkTriggerHeartburn);
			pageLoad();
			System.out.println("HyperLink Trigger Heartburn clicked successfully");
		} else {
			System.out.println("HyperLink Trigger Heartburn is not presented in the page");
			throw new Exception("HyperLink Trigger Heartburn is not presented in the page");
		}
	}
	
	public void clickHyperLinkTomatoesAreATriggerFood() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTomatoesAreATriggerFood)) {
			scrollDownUsingElement(hyperLinkTomatoesAreATriggerFood);
			clickElementUsingJavaScript(hyperLinkTomatoesAreATriggerFood);
			pageLoad();
			System.out.println("HyperLink Tomatoes Are A Trigger Food hyperLink clicked successfully");
		} else {
			System.out.println("HyperLink Tomatoes Are A Trigger Food hyperLink is not presented in the page");
			throw new Exception("HyperLink Tomatoes Are A Trigger Food hyperLink is not presented in the page");
		}
	}
	
	
	

}
