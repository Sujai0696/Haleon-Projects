package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumHowLongDoesNexiumTakeToWorkPage extends BaseClass{
	
	public NexiumHowLongDoesNexiumTakeToWorkPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' How Long Does It Take for Nexium 24HR to Work? ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//u[text()='feel a burning pain']//ancestor::a[@href='/us/understanding-heartburn/what-does-heartburn-feel-like/']")
	private static WebElement hyperLinkFeelABurningPain;
	
	@FindBy(xpath = "//u[text()='Some foods']//ancestor::a[@href='/us/understanding-heartburn/heartburn-causes-and-triggers/spicy-foods-and-digestion/']")
	private static WebElement hyperLinkSomeFoods;
	
	
	
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
	
	
	public void clickHyperLinkFeelABurningPain() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFeelABurningPain)) {
			scrollDownUsingElement(hyperLinkFeelABurningPain);
			clickElementUsingJavaScript(hyperLinkFeelABurningPain);
			pageLoad();
			System.out.println("HyperLink Feel A Burning Pain clicked successfully");
		} else {
			System.out.println("HyperLink Feel A Burning Pain is not presented in the page");
			throw new Exception("HyperLink Feel A Burning Pain is not presented in the page");
		}
	}
	
	public void clickHyperLinkSomeFoods() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSomeFoods)) {
			scrollDownUsingElement(hyperLinkSomeFoods);
			clickElementUsingJavaScript(hyperLinkSomeFoods);
			pageLoad();
			System.out.println("HyperLink Some Foods clicked successfully");
		} else {
			System.out.println("HyperLink Some Foods is not presented in the page");
			throw new Exception("HyperLink Some Foods is not presented in the page");
		}
	}
	
	

}
