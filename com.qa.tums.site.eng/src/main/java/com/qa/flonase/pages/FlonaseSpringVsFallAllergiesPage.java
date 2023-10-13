package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseSpringVsFallAllergiesPage extends BaseClass{
	
	public FlonaseSpringVsFallAllergiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='check your local pollen']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "(//a[@href='/allergies/spring-allergies-causes-symptoms-treatment/' and text()='tap here'])[1]")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "(//a[@href='/allergies/spring-allergies-causes-symptoms-treatment/' and text()='tap here'])[2]")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/#fall-allergies' and text()='Fall Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#about-allergies' and text()='About Allergies']")
	private static WebElement tagsLinksTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/#seasonal-allergies' and text()='Seasonal Allergies']")
	private static WebElement tagsLinksThree;
	
	@FindBy(xpath = "//a[@href='/allergies/#spring-allergies' and text()='Spring Allergies']")
	private static WebElement tagsLinksFour;
	
	@FindBy(xpath = "//a[@href='/allergies/#mold-allergies' and text()='Mold Allergies']")
	private static WebElement tagsLinksFive;
	
	@FindBy(xpath = "//a[@href='/allergies/#pollen-allergies' and text()='Pollen Allergies']")
	private static WebElement tagsLinksSix;
	
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
	
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			System.out.println("hyperLinkOne clicked successfully");
		} else {
			System.out.println("hyperLinkOne is not presented in the page");
			throw new Exception("hyperLinkOne is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo clicked successfully");
		} else {
			System.out.println("hyperLinkTwo is not presented in the page");
			throw new Exception("hyperLinkTwo is not presented in the page");
		}
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			scrollDownUsingElement(hyperLinkThree);
			clickElementUsingJavaScript(hyperLinkThree);
			pageLoad();
			System.out.println("hyperLinkThree clicked successfully");
		} else {
			System.out.println("hyperLinkThree is not presented in the page");
			throw new Exception("hyperLinkThree is not presented in the page");
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
	
	public void clickTagsLinksThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksThree)) {
			scrollDownUsingElement(tagsLinksThree);
			clickElementUsingJavaScript(tagsLinksThree);
			pageLoad();
			System.out.println("tagsLinksThree clicked successfully");
		} else {
			System.out.println("tagsLinksThree is not presented in the page");
			throw new Exception("tagsLinksThree is not presented in the page");
		}
	}
	
	public void clickTagsLinksFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksFour)) {
			scrollDownUsingElement(tagsLinksFour);
			clickElementUsingJavaScript(tagsLinksFour);
			pageLoad();
			System.out.println("tagsLinksFour clicked successfully");
		} else {
			System.out.println("tagsLinksFour is not presented in the page");
			throw new Exception("tagsLinksFour is not presented in the page");
		}
	}
	
	public void clickTagsLinksFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksFive)) {
			scrollDownUsingElement(tagsLinksFive);
			clickElementUsingJavaScript(tagsLinksFive);
			pageLoad();
			System.out.println("tagsLinksFive clicked successfully");
		} else {
			System.out.println("tagsLinksFive is not presented in the page");
			throw new Exception("tagsLinksFive is not presented in the page");
		}
	}
	
	public void clickTagsLinksSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksSix)) {
			scrollDownUsingElement(tagsLinksSix);
			clickElementUsingJavaScript(tagsLinksSix);
			pageLoad();
			System.out.println("tagsLinksSix clicked successfully");
		} else {
			System.out.println("tagsLinksSix is not presented in the page");
			throw new Exception("tagsLinksSix is not presented in the page");
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
