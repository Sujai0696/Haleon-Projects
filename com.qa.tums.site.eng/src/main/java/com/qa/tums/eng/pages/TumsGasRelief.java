package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsGasRelief extends BaseClass{
	public TumsGasRelief() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[2]")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even ']//a)[2]")
	private static WebElement Bread_Heartburn101;
	
//	@FindBy(xpath = "//a[text()='Gas-X']")
//	private static WebElement GasX;
	
	@FindBy(xpath = "//a[text()='lifestyle suggestions']")
	private static WebElement LifestyleSuggestions;
	
	@FindBy(xpath = "//a[text()='heartburn']")
	private static WebElement Heartburn;
	
	@FindBy(xpath = "//a[text()='TUMS Chewy Bites with Gas Relief']")
	private static WebElement TUMSChewyBitesWithGasRelief;
	
	@FindBy(xpath = "//a[text()='See products']")
	private static WebElement SeeProducts;
	
	public void clickOnCookies() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
//				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("Dismiss is not presented");
			Assert.assertTrue(false);
		}
	}

	public void clickOnHomeIcon() throws Throwable {
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
	}

	public void clickOnHeartBurn101() throws Throwable {
		moveToElement(Bread_Heartburn101);
		clickElementUsingJavaScript(Bread_Heartburn101);
	}
//	public void clickOnGasX() throws Throwable {
//		moveToElement(GasX);
//		clickElementUsingJavaScript(GasX);
//	}
	public void clickOnLifestyleSuggestions() throws Throwable {
		moveToElement(LifestyleSuggestions);
		clickElementUsingJavaScript(LifestyleSuggestions);
	}
	public void clickOnHeartburn() throws Throwable {
		moveToElement(Heartburn);
		clickElementUsingJavaScript(Heartburn);
	}
	public void clickOnTUMSChewyBitesWithGasRelief() throws Throwable {
		moveToElement(TUMSChewyBitesWithGasRelief);
		clickElementUsingJavaScript(TUMSChewyBitesWithGasRelief);
	}
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}

}
