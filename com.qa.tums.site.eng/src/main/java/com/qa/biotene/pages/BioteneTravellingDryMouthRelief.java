package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneTravellingDryMouthRelief extends BaseClass{
	public BioteneTravellingDryMouthRelief() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement emailBtn;

	@FindBy(xpath = "//div[@class='box component section cf-popup-form first odd last alpha']")
	private static WebElement emailClose;
	
	@FindBy(xpath = "//span[contains(text(),'Biotène® Dry')]")
	private static WebElement BioteneDryMouthOralRinse;
	
	@FindBy(xpath = "//span[text()='get a good night’s rest']")
	private static WebElement GetaGoodNightRest;
	
	@FindBy(xpath = "//span[@class='text-blue' and text()='Biotène® ']")
	private static WebElement BiotèneMoisturizingSpray;
	
	@FindBy(xpath = "//span[@class='text-blue' and text()='Constantly drinking water ']")
	private static WebElement ConstantlyDrinkingWater;
	
	@FindBy(xpath = "//a[text()='TAKE THE QUIZ']")
	private static WebElement TAKETHEQUIZ;
	
	@FindBy(xpath = "//a[text()='READ MORE']")
	private static WebElement READMORE;
	
	@FindBy(xpath = "//a[text()='SHOP NOW']")
	private static WebElement SHOPNOW;
	
	

	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				 implicitWait();
				 visibilityOf(cookieClose);
				 Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}
		else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
		}
		

public void clickEmailBtn() throws Exception {
	waitForPageLoadJava();
	if (isElementPresent(emailBtn)) {
		elementToBeClickable(emailBtn);
		try {
			if (emailBtn.isDisplayed()) {
				clickElementUsingJavaScript(emailBtn);
			}
			 implicitWait();
			 visibilityOf(emailClose);
			 Assert.assertTrue(elementIsDisplayed(emailClose));
		} catch (Exception e) {
		}
	}
	else {
		System.out.println("Email Pop-Up is not presented");
		throw new Exception("Unable to click on Email Pop-up");
	}
		}

	public void clickonBioteneDryMouthOralRinse() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(BioteneDryMouthOralRinse);
		clickElementUsingJavaScript(BioteneDryMouthOralRinse);
	}
	public void clickonGetaGoodNightRest() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(GetaGoodNightRest);
		clickElementUsingJavaScript(GetaGoodNightRest);
	}
	public void clickonConstantlyDrinkingWater() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ConstantlyDrinkingWater);
		clickElementUsingJavaScript(ConstantlyDrinkingWater);
	}
	public void clickonTAKETHEQUIZ() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(TAKETHEQUIZ);
		clickElementUsingJavaScript(TAKETHEQUIZ);
	}
	public void clickonREADMORE() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(READMORE);
		clickElementUsingJavaScript(READMORE);
	}
	public void clickonSHOPNOW() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(SHOPNOW);
		clickElementUsingJavaScript(SHOPNOW);
	}

}
