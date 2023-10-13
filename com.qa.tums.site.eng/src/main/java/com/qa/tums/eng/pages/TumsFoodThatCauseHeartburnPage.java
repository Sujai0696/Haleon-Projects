package com.qa.tums.eng.pages;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsFoodThatCauseHeartburnPage extends BaseClass{
	
	public TumsFoodThatCauseHeartburnPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='Heartburn 101']")
	private static WebElement breadCrumbOne;
	
	@FindBy(xpath = "//a[text()='causes of heartburn.']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[text()='heartburn and indigestion symptoms']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[text()='stomach acid']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[text()='antacid such as TUMS']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[text()='small changes to your diet']")
	private static WebElement hyperLinkFive;
	
	@FindBy(id = "seeproducts-link")
	private static WebElement seeProducts;
	
	
	public void clickCookieBtn() throws Exception {
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
		}
	}
	
	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}
	
	public void clickBreadCrumbOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbOne);
		clickElementUsingJavaScript(breadCrumbOne);
	}
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkOne);
		clickElementUsingJavaScript(hyperLinkOne);
	}
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkTwo);
		clickElementUsingJavaScript(hyperLinkTwo);
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkThree);
		clickElementUsingJavaScript(hyperLinkThree);
	}
	
	public void clickHyperLinkFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkFour);
		clickElementUsingJavaScript(hyperLinkFour);
	}
	
	public void clickHyperLinkFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkFive);
		clickElementUsingJavaScript(hyperLinkFive);
	}
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
	
	
}
