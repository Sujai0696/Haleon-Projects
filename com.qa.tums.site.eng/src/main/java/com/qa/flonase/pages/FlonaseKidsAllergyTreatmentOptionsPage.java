package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseKidsAllergyTreatmentOptionsPage extends BaseClass{
	
	public FlonaseKidsAllergyTreatmentOptionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/allergies/treatment/' and text()='Click here for treatment for ages 12+']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//div[@class='lSAction']//a[@class='lSPrev']")
	private static WebElement tabPrevious;
	
	@FindBy(xpath = "//div[@class='lSAction']//a[@class='lSNext']")
	private static WebElement tabNext;
	
	@FindBy(xpath = "//h3[text()='TREATMENT #1']//ancestor::li[@class='carousel-slide clearfix odd is-active first lslide active']")
	private static WebElement slideOne;
	
	@FindBy(xpath = "//h3[text()='TREATMENT #2']//ancestor::li[@class='carousel-slide clearfix even lslide active']")
	private static WebElement slideTwo;
	
	@FindBy(xpath = "//h3[text()='TREATMENT #3']//ancestor::li[@class='carousel-slide clearfix odd lslide active']")
	private static WebElement slideThree;
	
	@FindBy(xpath = "//h3[text()='TREATMENT #4']//ancestor::li[@class='carousel-slide clearfix even lslide active']")
	private static WebElement slideFour;
	
	@FindBy(xpath = "//h3[text()='TREATMENT #5']//ancestor::li[@class='carousel-slide clearfix odd lslide active']")
	private static WebElement slideFive;
	
	@FindBy(xpath = "//h2[text()='TREATMENT #6']//ancestor::li[@class='carousel-slide clearfix even last lslide active']")
	private static WebElement slideSix;
	
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
	
	
	public void clickAllSlides() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(slideOne)) {
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideTwo);
			Assert.assertTrue(elementIsDisplayed(slideTwo));
			
			pageLoad();
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideThree);
			Assert.assertTrue(elementIsDisplayed(slideThree));
			
			pageLoad();
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideFour);
			Assert.assertTrue(elementIsDisplayed(slideFour));
			
			pageLoad();
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideFive);
			Assert.assertTrue(elementIsDisplayed(slideFive));
			
			pageLoad();
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideSix);
			Assert.assertTrue(elementIsDisplayed(slideSix));
			
			pageLoad();
			clickElementUsingJavaScript(tabNext);
			visibilityOf(slideOne);
			Assert.assertTrue(elementIsDisplayed(slideOne));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideSix);
			Assert.assertTrue(elementIsDisplayed(slideSix));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideFive);
			Assert.assertTrue(elementIsDisplayed(slideFive));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideFour);
			Assert.assertTrue(elementIsDisplayed(slideFour));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideThree);
			Assert.assertTrue(elementIsDisplayed(slideThree));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideTwo);
			Assert.assertTrue(elementIsDisplayed(slideTwo));
			
			pageLoad();
			clickElementUsingJavaScript(tabPrevious);
			visibilityOf(slideOne);
			Assert.assertTrue(elementIsDisplayed(slideOne));
		} else {
			System.out.println("Slide One is not presented in the page");
			throw new Exception("Slide One is not presented in the page");
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
