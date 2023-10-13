package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumReplaceTomatoesInYourDishesPage extends BaseClass{
	
	public NexiumReplaceTomatoesInYourDishesPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' Easy, Delicious Tomato-Free Dishes ']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//u[text()='causes your symptoms to flare up']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/']")
	private static WebElement hyperLinkCausesYourSymptoms;  
	
	@FindBy(xpath = "//h3[text()='Discover What Heartburn Feels Like']//preceding::a[@href='/us/understanding-heartburn/what-does-heartburn-feel-like/']//ancestor::figure")
	private static WebElement wholeCardSecOne;
	
	@FindBy(xpath = "//h3[text()='Learn About Heartburn at Night']//preceding::a[@href='/us/understanding-heartburn/heartburn-at-night/']//ancestor::figure")
	private static WebElement wholeCardSecTwo;
	
	@FindBy(xpath = "//h3[text()='Find Out Facts on Acid Reflux and Anxiety']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/acid-reflux-anxiety/']//ancestor::figure")
	private static WebElement wholeCardSecThree;
	
	@FindBy(xpath = "//h3[text()='Discover Common Heartburn Myths and Facts']//preceding::a[@href='/us/understanding-heartburn/myths-about-heartburn/']//ancestor::figure")
	private static WebElement wholeCardSecFour;
	
	
	
	
	
	
	
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
	
	
	public void clickHyperLinkCausesYourSymptoms() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCausesYourSymptoms)) {
			scrollDownUsingElement(hyperLinkCausesYourSymptoms);
			clickElementUsingJavaScript(hyperLinkCausesYourSymptoms);
			pageLoad();
			System.out.println("HyperLink Causes Your Symptoms clicked successfully");
		} else {
			System.out.println("HyperLink Causes Your Symptoms is not presented in the page");
			throw new Exception("HyperLink Causes Your Symptoms is not presented in the page");
		}
	}
	
	public void clickWholeCardSecOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecOne)) {
			scrollDownUsingElement(wholeCardSecOne);
			clickElement(wholeCardSecOne);
			pageLoad();
			System.out.println("Whole Card Sec One clicked successfully");
		} else {
			System.out.println("Whole Card Sec One is not presented in the page");
			throw new Exception("Whole Card Sec One is not presented in the page");
		}
	}
	
	public void clickWholeCardSecTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecTwo)) {
			scrollDownUsingElement(wholeCardSecTwo);
			clickElement(wholeCardSecTwo);
			pageLoad();
			System.out.println("Whole Card Sec Two clicked successfully");
		} else {
			System.out.println("Whole Card Sec Two is not presented in the page");
			throw new Exception("Whole Card Sec Two is not presented in the page");
		}
	}
	
	public void clickWholeCardSecThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecThree)) {
			scrollDownUsingElement(wholeCardSecThree);
			clickElement(wholeCardSecThree);
			pageLoad();
			System.out.println("Whole Card Sec Three clicked successfully");
		} else {
			System.out.println("Whole Card Sec Three is not presented in the page");
			throw new Exception("Whole Card Sec Three is not presented in the page");
		}
	}
	
	public void clickWholeCardSecFour() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecFour)) {
			scrollDownUsingElement(wholeCardSecFour);
			clickElement(wholeCardSecFour);
			pageLoad();
			System.out.println("Whole Card Sec Four clicked successfully");
		} else {
			System.out.println("Whole Card Sec Four is not presented in the page");
			throw new Exception("Whole Card Sec Four is not presented in the page");
		}
	}
}

