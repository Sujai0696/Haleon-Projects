package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneContactusPage extends BaseClass{
	
	public bioteneContactusPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='CONTACT US FOR INFORMATION ABOUT BIOTÈNE PRODUCTS']")
	private static WebElement contactus_Breadcrumbs;			
	
	@FindBy(xpath = "//a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//a[text()='GET COUPONS']")
	private static WebElement getcoupons;	
	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//a[text()='SHOP NOW']")
	private static WebElement shopnow;	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Methods//
	
	public void clickonCookieBtn() throws Exception {
		waitForPageLoadJava();
		if(isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if(cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
		}
	public void clickonEmailBtn() throws Exception {	
	waitForPageLoadJava();
	if(isElementPresent(email_text)) {
		elementToBeClickable(email_text);
		try {
			if(email_text.isDisplayed()) {
				clickElementUsingJavaScript(email_text);
			}
			implicitWait();
			visibilityOf(emailpopup_Close);
			Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
		}
		catch (Exception e) {
			
		}
	}else {
		System.out.println("Email Pop-Up is not presented");
		throw new Exception("Unable to click on Email Pop-up");
	}
	}
	
	public void clickonHomeBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(Home_Breadcrumbs);
		pageLoad();
	}
	public void clickonContactusBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(contactus_Breadcrumbs);
		pageLoad();
	}
	
	public void clickonTakeQuiz() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(takequiz);
		clickElementUsingJavaScript(takequiz);
		pageLoad();
	}
	public void clickonGetCoupons() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(getcoupons);
		clickElementUsingJavaScript(getcoupons);
		pageLoad();
	}
	public void clickonShopNow() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(shopnow);
		clickElementUsingJavaScript(shopnow);
		pageLoad();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
