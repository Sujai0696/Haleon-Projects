package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutPage extends BaseClass{

	public Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Heartburn Relief']//self::a[@href='/us/understanding-heartburn/heartburn-relief/']")
	private static WebElement breadcrumbThree;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' 5 Ways to Beat Frequent Heartburn During a Workout ']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//u[text()='tomatoes']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/replace-tomatoes-in-your-dishes/']")
	private static WebElement hyperLinkTomatoes;

	@FindBy(xpath = "//u[text()='carbonated beverages.']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/reason-to-skip-soda/']")
	private static WebElement hyperLinkCarbonatedBeverages;

	@FindBy(xpath = "//u[text()='acid reflux symptoms']//ancestor::a[@href='/us/understanding-heartburn/what-does-heartburn-feel-like/']")
	private static WebElement hyperLinkAcidRefluxSymptoms;

	@FindBy(xpath = "//h3[text()='How to Eat a Bland Diet Without Getting Bored Beyond Belief']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/eat-bland-diet/']//ancestor::figure")
	private static WebElement wholeCardSecOne;
	
	@FindBy(xpath = "//h3[text()='The Truth About Spicy Foods and Digestion']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/spicy-foods-and-digestion/']//ancestor::figure")
	private static WebElement wholeCardSecTwo;
	
	@FindBy(xpath = "//h3[text()='How to Replace Tomatoes in Your Favorite Dishes']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/replace-tomatoes-in-your-dishes/']//ancestor::figure")
	private static WebElement wholeCardSecThree;
	
	@FindBy(xpath = "//h3[text()='Do You Pay Attention to Your Microbiome? Here’s Why You Should']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/pay-attention-to-microbiome/']//ancestor::figure")
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
	
	
	public void clickHyperLinkTomatoes() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTomatoes)) {
			scrollDownUsingElement(hyperLinkTomatoes);
			clickElementUsingJavaScript(hyperLinkTomatoes);
			pageLoad();
			System.out.println("HyperLink Tomatoes clicked successfully");
		} else {
			System.out.println("HyperLink Tomatoes is not presented in the page");
			throw new Exception("HyperLink Tomatoes is not presented in the page");
		}
	}
	
	public void clickHyperLinkCarbonatedBeverages() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCarbonatedBeverages)) {
			scrollDownUsingElement(hyperLinkCarbonatedBeverages);
			clickElementUsingJavaScript(hyperLinkCarbonatedBeverages);
			pageLoad();
			System.out.println("HyperLink Carbonated Beverages clicked successfully");
		} else {
			System.out.println("HyperLink Carbonated Beverages is not presented in the page");
			throw new Exception("HyperLink Carbonated Beverages is not presented in the page");
		}
	}
	
	public void clickHyperLinkAcidRefluxSymptoms() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAcidRefluxSymptoms)) {
			scrollDownUsingElement(hyperLinkAcidRefluxSymptoms);
			clickElementUsingJavaScript(hyperLinkAcidRefluxSymptoms);
			pageLoad();
			System.out.println("HyperLink Acid Reflux Symptoms clicked successfully");
		} else {
			System.out.println("HyperLink Acid Reflux Symptoms is not presented in the page");
			throw new Exception("HyperLink Acid Reflux Symptoms is not presented in the page");
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
