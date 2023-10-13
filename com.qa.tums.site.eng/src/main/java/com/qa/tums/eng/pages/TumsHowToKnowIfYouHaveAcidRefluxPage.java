package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsHowToKnowIfYouHaveAcidRefluxPage extends BaseClass{
	
	public TumsHowToKnowIfYouHaveAcidRefluxPage() {
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
	
	@FindBy(xpath = "//a[text()='over-the-counter medication']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[text()='causes of heartburn']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[text()='how to treat heartburn']")
	private static WebElement hyperLinkThree;
	
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
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
	
	
	

}
