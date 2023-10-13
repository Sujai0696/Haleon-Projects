package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestProfessionalPolimedPage extends BaseClass{
	
	public drbestProfessionalPolimedPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement BuyNow1;				
	
		@FindBy(xpath = "//button[@class='bv_button_buttonMinimalist bv_war_button ']")
		private static WebElement Review;	
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;
	

		@FindBy(xpath = "//div[@class='bv-action-bar']//child::button[text()=' Jetzt Produkt bewerten  ']")
		private static WebElement Review1;
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt1;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement vibrationPolimed;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement vibrationPolimedProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement vibrationPolimedbuynow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-lg-3 reference-learn_more_vibration_multi_expert']//img")
		private static WebElement vibrationMultiexpert;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-lg-3 reference-learn_more_vibration_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement vibrationMultiexpertProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-lg-3 reference-learn_more_vibration_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement vibrationMultiexpertBuyNow;
		
		
		
		
		
		
		
		
		
		
		
		
		
	
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
			
		public void clickonBuyNow1() throws Exception {
			waitForPageLoadJava();
			moveToElement(BuyNow1);
			if (isElementPresent(BuyNow1)) {
				actionClick(BuyNow1);
				
			} else {
				throw new Exception("BuyNow1 is not displayed on Page");
			}
			pageLoad();
		}
		public void clickonReview() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Review);
			clickElementUsingJavaScript(Review);
			//visibilityOf(Reviewtxt);
			if (Reviewtxt.isDisplayed()) {
				Assert.assertTrue(true, "Review Txt is   displayed Successfully");
				System.out.println(getElementText(Reviewtxt));
				clickElementUsingJavaScript(ReviewClose);
			} else {
				Assert.assertTrue(false, "Review Txt is  not displayed Successfully");

			}
			pageLoad();
		}
		public void clickonReview1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Review1);
			clickElementUsingJavaScript(Review1);
			visibilityOf(Reviewtxt1);
			boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Reviewtxt1));
			clickElementUsingJavaScript(ReviewClose1);
			pageLoad();
		}
	
		public void clickonVibrationPolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(vibrationPolimed);
			clickElementUsingJavaScript(vibrationPolimed);
			pageLoad();
		}
		public void clickonVibrationPolimedproduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(vibrationPolimedProduct);
			clickElementUsingJavaScript(vibrationPolimedProduct);
			pageLoad();
		}
		public void clickonVibrationPolimedBuynow() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(vibrationPolimedbuynow)) {
				moveToElement(vibrationPolimedbuynow);
				actionClick(vibrationPolimedbuynow);
				
			} else {
				throw new Exception("VibrationPolimedbuynow is not displayed on Page");
			}
			pageLoad();
		}
		public void clickonVibrationMultiExpert() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(vibrationMultiexpert);
			clickElementUsingJavaScript(vibrationMultiexpert);
			pageLoad();
		}
		public void clickonVibrationMultiExpertProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(vibrationMultiexpertProduct);
			clickElementUsingJavaScript(vibrationMultiexpertProduct);
			pageLoad();
		}
	public void clickonVibrationMultiExpertBuyNow() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vibrationMultiexpertBuyNow);
		moveToElement(vibrationMultiexpertBuyNow);
		if (isElementPresent(vibrationMultiexpertBuyNow)) {
			actionClick(vibrationMultiexpertBuyNow);
			
		} else {
			throw new Exception("vibrationMultiexpertBuyNow is  not Displayed on Page");
		}
		pageLoad();
	}
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
