package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneDiabetes extends BaseClass{
	public BioteneDiabetes() {
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
	
	@FindBy(xpath = "(//span[text()='LEARN MORE'])[1]")
	private static WebElement LearnMore1;
	
	@FindBy(xpath = "(//span[text()='LEARN MORE'])[2]")
	private static WebElement LearnMore2;
	
	@FindBy(xpath = "(//span[text()='LEARN MORE'])[3]")
	private static WebElement LearnMore3;
	
	@FindBy(xpath = "(//span[text()='LEARN MORE'])[4]")
	private static WebElement LearnMore4;
	
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

	public void clickonLearnMore1() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LearnMore1);
		clickElementUsingJavaScript(LearnMore1);
	}
	public void clickonLearnMore2() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LearnMore2);
		clickElementUsingJavaScript(LearnMore2);
	}
	public void clickonLearnMore3() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LearnMore3);
		clickElementUsingJavaScript(LearnMore3);
	}
	public void clickonLearnMore4() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LearnMore4);
		clickElementUsingJavaScript(LearnMore4);
	}

}

