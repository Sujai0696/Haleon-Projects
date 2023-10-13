package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsHeartburnAndExercise extends BaseClass{
	public TumsHeartburnAndExercise() {
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
	
	@FindBy(xpath = "//a[text()='GERD (gastroesophageal reflux disease)']")
	private static WebElement GERD;
	
	@FindBy(xpath = "//a[text()='heartburn symptoms']")
	private static WebElement HeartburnSymptoms;
	
	@FindBy(xpath = "//a[text()='other lifestyle modifications']")
	private static WebElement OtherLifestyleModifications;
	
	@FindBy(xpath = "//a[text()='more articles on heartburn from TUMS']")
	private static WebElement MoreArticlesOnHeartburnFromTUMS;
	
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
	public void clickOnGERD() throws Throwable {
		moveToElement(GERD);
		clickElementUsingJavaScript(GERD);
	}
	public void clickOnHeartburnSymptoms() throws Throwable {
		moveToElement(HeartburnSymptoms);
		clickElementUsingJavaScript(HeartburnSymptoms);
	}
	public void clickOnOtherLifestyleModifications() throws Throwable {
		moveToElement(OtherLifestyleModifications);
		clickElementUsingJavaScript(OtherLifestyleModifications);
	}
	public void clickOnMoreArticlesOnHeartburnFromTUMS() throws Throwable {
		moveToElement(MoreArticlesOnHeartburnFromTUMS);
		clickElementUsingJavaScript(MoreArticlesOnHeartburnFromTUMS);
	}
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}


}
