package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsAboutPage extends BaseClass{
	
	public TumsAboutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='pain of heartburn strikes']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[text()='TUMS antacid products']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[text()='TUMS Chewy Bites Cooling Sensation']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[text()='TUMS Smoothies']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[text()='why you should choose TUMS']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@id='tumsandpregnancy-link' or text()='Read more']")
	private static WebElement readMore;
	
	@FindBy(xpath = "//p[text()='Show References']")
	private static WebElement showReference;
	
	@FindBy(xpath = "//p[text()='Hide References']")
	private static WebElement hideReference;
	
	@FindBy(xpath = "//img[@title='Image of a bottle of TUMS Smoothies Product along with cut oranges and limes']//following::a[text()='How Does TUMS Work?']")
	private static WebElement prdtOne;
	
	@FindBy(xpath = "//img[@title='Man Experiencing Stomach Pain']//following::a[text()='What Causes Heartburn? A Checklist']")
	private static WebElement prdtTwo;
	
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
	
	public void clickReadMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMore);
		clickElementUsingJavaScript(readMore);
	}
	
	public void clickShowReference() throws Exception{
		if (isElementPresent(showReference)) {
			clickElementUsingJavaScript(showReference);
			visibilityOf(hideReference);
			Assert.assertTrue(elementIsDisplayed(hideReference));
			clickElementUsingJavaScript(hideReference);
			visibilityOf(showReference);
			Assert.assertTrue(elementIsDisplayed(showReference));
			System.out.println("Show reference and hide reference is verified successfully");
		} else {
			System.out.println("Show reference and hide reference is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prdtOne);
		clickElementUsingJavaScript(prdtOne);
	}
	
	public void clickPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prdtTwo);
		clickElementUsingJavaScript(prdtTwo);
	}
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}

}
