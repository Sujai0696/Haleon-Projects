package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumDoBananasCauseHeartburnPage extends BaseClass{
	
	public NexiumDoBananasCauseHeartburnPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' Do Bananas Cause Heartburn? ']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//u[text()='When you experience heartburn']//ancestor::a[@href='/us/understanding-heartburn/what-does-heartburn-feel-like/']")
	private static WebElement hyperLinkWhenYouExperienceHearburn;
	
	@FindBy(xpath = "//u[text()='Spicy foods']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/spicy-foods-and-digestion/']")
	private static WebElement hyperLinkSpicyFoods;
	
	@FindBy(xpath = "//u[text()='avoid eating right before your bedtime']//ancestor::a[@href='/us/understanding-heartburn/heartburn-at-night/']")
	private static WebElement hyperLinkAvoidEatingRightBeforeYourBedtime;
	
	@FindBy(xpath = "//u[text()='ClearMinis']//ancestor::a[@href='/us/products/clearminis/']")
	private static WebElement hyperLinkClearMinis;
	
	@FindBy(xpath = "//u[text()='Tablets']//ancestor::a[@href='/us/products/tablets/']")
	private static WebElement hyperLinkTablets;
	
	@FindBy(xpath = "//u[text()='Capsules']//ancestor::a[@href='/us/products/capsules/']")
	private static WebElement hyperLinkCapsules;
	
	@FindBy(xpath = "//u[text()='Nexium 24HR products']//ancestor::a[@href='/us/products/']")
	private static WebElement hyperLinkNexium24Hr;
	
	@FindBy(xpath = "//h3[text()='How to Eat a Bland Diet Without Getting Bored Beyond Belief']//preceding::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/eat-bland-diet/']//ancestor::figure")
	private static WebElement wholeCardSecOne;
	
	@FindBy(xpath = "//h3[text()='5 Ways to Beat Frequent Heartburn During a Workout']//preceding::a[@href='/us/understanding-heartburn/heartburn-relief/5-ways-to-beat-frequent-heartburn-during-a-workout/']//ancestor::figure")
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
	
	
	public void clickHyperLinkWhenYouExperienceHearburn() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkWhenYouExperienceHearburn)) {
			scrollDownUsingElement(hyperLinkWhenYouExperienceHearburn);
			clickElementUsingJavaScript(hyperLinkWhenYouExperienceHearburn);
			pageLoad();
			System.out.println("HyperLink When You Experience Hearburn clicked successfully");
		} else {
			System.out.println("HyperLink When You Experience Hearburn is not presented in the page");
			throw new Exception("HyperLink When You Experience Hearburn is not presented in the page");
		}
	}
	
	public void clickHyperLinkSpicyFoods() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSpicyFoods)) {
			scrollDownUsingElement(hyperLinkSpicyFoods);
			clickElementUsingJavaScript(hyperLinkSpicyFoods);
			pageLoad();
			System.out.println("HyperLink Spicy Foods clicked successfully");
		} else {
			System.out.println("HyperLink Spicy Foods is not presented in the page");
			throw new Exception("HyperLink Spicy Foods is not presented in the page");
		}
	}
	
	public void clickHyperLinkAvoidEatingRightBeforeYourBedtime() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAvoidEatingRightBeforeYourBedtime)) {
			scrollDownUsingElement(hyperLinkAvoidEatingRightBeforeYourBedtime);
			clickElementUsingJavaScript(hyperLinkAvoidEatingRightBeforeYourBedtime);
			pageLoad();
			System.out.println("HyperLink Avoid Eating Right Before Your Bedtime clicked successfully");
		} else {
			System.out.println("HyperLink Avoid Eating Right Before Your Bedtime is not presented in the page");
			throw new Exception("HyperLink Avoid Eating Right Before Your Bedtime is not presented in the page");
		}
	}
	
	public void clickHyperLinkClearMinis() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkClearMinis)) {
			scrollDownUsingElement(hyperLinkClearMinis);
			clickElementUsingJavaScript(hyperLinkClearMinis);
			pageLoad();
			System.out.println("HyperLink Clear Minis clicked successfully");
		} else {
			System.out.println("HyperLink Clear Minis is not presented in the page");
			throw new Exception("HyperLink Clear Minis is not presented in the page");
		}
	}
	
	public void clickHyperLinkTablets() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTablets)) {
			scrollDownUsingElement(hyperLinkTablets);
			clickElementUsingJavaScript(hyperLinkTablets);
			pageLoad();
			System.out.println("HyperLink Tablets clicked successfully");
		} else {
			System.out.println("HyperLink Tablets is not presented in the page");
			throw new Exception("HyperLink Tablets is not presented in the page");
		}
	}
	
	public void clickHyperLinkCapsules() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCapsules)) {
			scrollDownUsingElement(hyperLinkCapsules);
			clickElementUsingJavaScript(hyperLinkCapsules);
			pageLoad();
			System.out.println("HyperLink Capsules clicked successfully");
		} else {
			System.out.println("HyperLink Capsules is not presented in the page");
			throw new Exception("HyperLink Capsules is not presented in the page");
		}
	}
	
	public void clickHyperLinkNexium24Hr() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkNexium24Hr)) {
			scrollDownUsingElement(hyperLinkNexium24Hr);
			clickElementUsingJavaScript(hyperLinkNexium24Hr);
			pageLoad();
			System.out.println("HyperLink Nexium24Hr clicked successfully");
		} else {
			System.out.println("HyperLink Nexium24Hr is not presented in the page");
			throw new Exception("HyperLink Nexium24Hr is not presented in the page");
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
