package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsAcidRefluxVsGERD extends BaseClass{
	
	public TumsAcidRefluxVsGERD() {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//button[text()='Accept Cookies']")
//	private static WebElement cookiesAcceptBtn;
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item odd first ']")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item even ']")
	private static WebElement Bread_Heartburn101;

	@FindBy(xpath = "//div[@class='richText-content']//p//a[text()='Gas-X']")
	private static WebElement GASxLink;
	
	@FindBy(xpath = "//div[@class='richText-content']//p//a[text()='lifestyle suggestions']")
	private static WebElement lifestyleSuggestionsLink;
	
	@FindBy(xpath = "//div[@class='richText-content']//p//a[text()='heartburn']")
	private static WebElement heartburnLink;
	
	@FindBy(xpath = "//div[@class='richText-content']//p//a[text()='TUMS Chewy Bites with Gas Relief']")
	private static WebElement TUMSChewyLink;
	
	
//	public void clickOncookiesAccept() throws Exception {
//		elementClick(cookiesAcceptBtn);
//		//navigateBack();
//	}
	
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
			Assert.assertTrue(false);
		}
	}
	
	public void clickOnHomeIcon() throws Throwable {
		implicitWait();
		clickElementUsingJavaScript(Bread_HomeIcon);
		
	}

	public void clickOnHeartBurn101() throws Throwable {
		
		moveToElement(Bread_Heartburn101);
		elementClick(Bread_Heartburn101);
	}
	
	public void clickOnlifestyleSuggestionsLink() throws Throwable {
		
		moveToElement(lifestyleSuggestionsLink);
		elementClick(lifestyleSuggestionsLink);
	}
	
	public void clickOnheartburnLink() throws Throwable {
		moveToElement(heartburnLink);
		elementClick(heartburnLink);
	}
	
	public void clickOnTUMSChewyLink() throws Throwable {
		moveToElement(TUMSChewyLink);
		elementClick(TUMSChewyLink);
	}
}
