package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumAcidRefluxAnxietyPage extends BaseClass{
	
	public NexiumAcidRefluxAnxietyPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' Acid Reflux and Anxiety ']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//u[text()='heartburn is actually a symptom of acid reflux']//ancestor::a[@href='/us/understanding-heartburn/what-does-heartburn-feel-like/']")
	private static WebElement hyperLinkHearburnIsActuallyASymptom;
	
	@FindBy(xpath = "//u[text()='heartburn triggers']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/']")
	private static WebElement hyperLinkHeartburnTriggers;
	
	@FindBy(xpath = "//u[text()='Nexium 24 HR']//ancestor::a[@href='/us/products/']")
	private static WebElement hyperLinkNexium24Hr;
	
	@FindBy(xpath = "//u[text()='eating a healthy diet']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/eat-bland-diet/']")
	private static WebElement hyperLinkEatingAHealthyDiet;
	
	@FindBy(xpath = "//u[text()='common heartburn myths']//ancestor::a[@href='/us/understanding-heartburn/myths-about-heartburn/']")
	private static WebElement hyperLinkCommonHearburnMyths;
	
	
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
	
	
	public void clickHyperLinkHearburnIsActuallyASymptom() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHearburnIsActuallyASymptom)) {
			scrollDownUsingElement(hyperLinkHearburnIsActuallyASymptom);
			clickElementUsingJavaScript(hyperLinkHearburnIsActuallyASymptom);
			pageLoad();
			System.out.println("HyperLink Hearburn Is Actually A Symptom clicked successfully");
		} else {
			System.out.println("HyperLink Hearburn Is Actually A Symptom is not presented in the page");
			throw new Exception("HyperLink Hearburn Is Actually A Symptom is not presented in the page");
		}
	}
	
	public void clickHyperLinkHeartburnTriggers() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHeartburnTriggers)) {
			scrollDownUsingElement(hyperLinkHeartburnTriggers);
			clickElementUsingJavaScript(hyperLinkHeartburnTriggers);
			pageLoad();
			System.out.println("HyperLink Heartburn Triggers clicked successfully");
		} else {
			System.out.println("HyperLink Heartburn Triggers is not presented in the page");
			throw new Exception("HyperLink Heartburn Triggers is not presented in the page");
		}
	}
	
	public void clickHyperLinkNexium24Hr() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkNexium24Hr)) {
			scrollDownUsingElement(hyperLinkNexium24Hr);
			clickElementUsingJavaScript(hyperLinkNexium24Hr);
			pageLoad();
			System.out.println("HyperLink Nexium 24 Hr clicked successfully");
		} else {
			System.out.println("HyperLink Nexium 24 Hr is not presented in the page");
			throw new Exception("HyperLink Nexium 24 Hr is not presented in the page");
		}
	}
	
	public void clickHyperLinkEatingAHealthyDiet() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkEatingAHealthyDiet)) {
			scrollDownUsingElement(hyperLinkEatingAHealthyDiet);
			clickElementUsingJavaScript(hyperLinkEatingAHealthyDiet);
			pageLoad();
			System.out.println("HyperLink Eating A Healthy Diet clicked successfully");
		} else {
			System.out.println("HyperLink Eating A Healthy Diet is not presented in the page");
			throw new Exception("HyperLink Eating A Healthy Diet is not presented in the page");
		}
	}
	
	public void clickHyperLinkCommonHearburnMyths() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCommonHearburnMyths)) {
			scrollDownUsingElement(hyperLinkCommonHearburnMyths);
			clickElementUsingJavaScript(hyperLinkCommonHearburnMyths);
			pageLoad();
			System.out.println("HyperLink Common Hearburn Myths clicked successfully");
		} else {
			System.out.println("HyperLink Common Hearburn Myths  is not presented in the page");
			throw new Exception("HyperLink Common Hearburn Myths  is not presented in the page");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
