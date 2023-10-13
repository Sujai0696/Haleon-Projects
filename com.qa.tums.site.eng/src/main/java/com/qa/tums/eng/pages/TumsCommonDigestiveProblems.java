package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsCommonDigestiveProblems extends BaseClass{
	public TumsCommonDigestiveProblems() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement heartburn101;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[2]")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even ']//a)[2]")
	private static WebElement Bread_Heartburn101;
	
	@FindBy(xpath = "//a[text()='symptoms of heartburn?']")
	private static WebElement SymptomsofHeartburn;
	
	@FindBy(xpath = "//a[text()='TUMS']")
	private static WebElement TumsLink;
	
	@FindBy(xpath = "//a[text()='reduce heartburn']")
	private static WebElement ReduceHeartburnLink;
	
	@FindBy(xpath = "//a[text()='heartburn relief']")
	private static WebElement HeartburnReliefLink;
	
	@FindBy(xpath = "//a[text()='GERD and heartburn']")
	private static WebElement GERDAndHeartburnLink;
	
	@FindBy(xpath = "//a[text()='indigestion']")
	private static WebElement IndigestionLink;
	
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
	
	public void clickSymptomsofHeartburn() throws Throwable {
		moveToElement(SymptomsofHeartburn);
		clickElementUsingJavaScript(SymptomsofHeartburn);
	}
	
	public void clickTumsLink() throws Throwable {
		moveToElement(TumsLink);
		clickElementUsingJavaScript(TumsLink);
	}
	
	public void clickReduceHeartburnLink() throws Throwable {
		moveToElement(ReduceHeartburnLink);
		clickElementUsingJavaScript(ReduceHeartburnLink);
	}
	
	public void clickHeartburnReliefLink() throws Throwable {
		moveToElement(HeartburnReliefLink);
		clickElementUsingJavaScript(HeartburnReliefLink);
	}
	
	public void clickGERDAndHeartburnLink() throws Throwable {
		moveToElement(GERDAndHeartburnLink);
		clickElementUsingJavaScript(GERDAndHeartburnLink);
	}
	
	public void clickIndigestionLink() throws Throwable {
		moveToElement(IndigestionLink);
		clickElementUsingJavaScript(IndigestionLink);
	}
	
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}
}
	

