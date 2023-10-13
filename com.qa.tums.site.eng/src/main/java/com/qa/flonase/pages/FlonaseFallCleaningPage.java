package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseFallCleaningPage extends BaseClass{
	
	public FlonaseFallCleaningPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//span[text()='BE ONE WITH YOUR VACUUM']//ancestor::header[@class='accordion-head']")
	private static WebElement AccOne;
	
	@FindBy(xpath = "//span[text()='BE ONE WITH YOUR VACUUM']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement AccActiveOne;
	
	@FindBy(xpath = "//span[text()='BE ONE WITH YOUR VACUUM']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadOne;
	
	@FindBy(xpath = "//span[text()='BE ONE WITH YOUR VACUUM']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement AccCloseOne;
	
	@FindBy(xpath = "//span[text()='CLEAR THE AIR AND TURN ON YOUR AIR CONDITIONER']//ancestor::header[@class='accordion-head']")
	private static WebElement AccTwo;
	
	@FindBy(xpath = "//span[text()='CLEAR THE AIR AND TURN ON YOUR AIR CONDITIONER']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement AccActiveTwo;
	
	@FindBy(xpath = "//span[text()='CLEAR THE AIR AND TURN ON YOUR AIR CONDITIONER']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadTwo;
	
	@FindBy(xpath = "//span[text()='CLEAR THE AIR AND TURN ON YOUR AIR CONDITIONER']//ancestor::li[@class='accordion-slide even']")
	private static WebElement AccCloseTwo;
	
	@FindBy(xpath = "//span[text()='IT’S LAUNDRY DAY']//ancestor::header[@class='accordion-head']")
	private static WebElement AccThree;
	
	@FindBy(xpath = "//span[text()='IT’S LAUNDRY DAY']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement AccActiveThree;
	
	@FindBy(xpath = "//span[text()='IT’S LAUNDRY DAY']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadThree;
	
	@FindBy(xpath = "//span[text()='IT’S LAUNDRY DAY']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement AccCloseThree;
	
	
	
	
	@FindBy(xpath = "//a[@href='/allergies/#fall-allergies' and normalize-space()='Fall Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#about-allergies' and normalize-space()='About Allergies']")
	private static WebElement tagsLinksTwo;
	
	
	@FindBy(xpath = "//a[@href='/products/' and text()='BUY NOW']")
	private static WebElement btnBuyNow;
	
	
	
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickAllAcc() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(AccOne)) {
			scrollDownUsingElement(AccOne);
			clickElementUsingJavaScript(AccOne);
			visibilityOf(AccActiveOne);
			Assert.assertTrue(elementIsDisplayed(AccActiveOne));
			clickElementUsingJavaScript(AccHeadOne);
			visibilityOf(AccCloseOne);
			Assert.assertTrue(elementIsDisplayed(AccCloseOne));
			System.out.println("Accordion One verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccTwo);
			clickElementUsingJavaScript(AccTwo);
			visibilityOf(AccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(AccActiveTwo));
			clickElementUsingJavaScript(AccHeadTwo);
			visibilityOf(AccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(AccCloseTwo));
			System.out.println("Accordion Two verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccThree);
			clickElementUsingJavaScript(AccThree);
			visibilityOf(AccActiveThree);
			Assert.assertTrue(elementIsDisplayed(AccActiveThree));
			clickElementUsingJavaScript(AccHeadThree);
			visibilityOf(AccCloseThree);
			Assert.assertTrue(elementIsDisplayed(AccCloseThree));
			System.out.println("Accordion Three verified Successfully");
		} else {
			System.out.println("Acc One is not presented in the page");
			throw new Exception("Acc One is not presented in the page");
		}
	}
	
	public void clickTagsLinksOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksOne)) {
			scrollDownUsingElement(tagsLinksOne);
			clickElementUsingJavaScript(tagsLinksOne);
			pageLoad();
			System.out.println("tagsLinksOne clicked successfully");
		} else {
			System.out.println("tagsLinksOne is not presented in the page");
			throw new Exception("tagsLinksOne is not presented in the page");
		}
	}
	
	public void clickTagsLinksTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksTwo)) {
			scrollDownUsingElement(tagsLinksTwo);
			clickElementUsingJavaScript(tagsLinksTwo);
			pageLoad();
			System.out.println("tagsLinksTwo clicked successfully");
		} else {
			System.out.println("tagsLinksTwo is not presented in the page");
			throw new Exception("tagsLinksTwo is not presented in the page");
		}
	}
	
	public void clickBtnBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnBuyNow)) {
			scrollDownUsingElement(btnBuyNow);
			clickElementUsingJavaScript(btnBuyNow);
			pageLoad();
			System.out.println("btnBuyNow clicked successfully");
		} else {
			System.out.println("btnBuyNow is not presented in the page");
			throw new Exception("btnBuyNow is not presented in the page");
		}
	}
	

}
