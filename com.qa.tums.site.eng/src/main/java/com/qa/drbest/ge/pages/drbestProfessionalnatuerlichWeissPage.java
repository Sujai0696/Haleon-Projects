package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestProfessionalnatuerlichWeissPage extends BaseClass{
	
	public drbestProfessionalnatuerlichWeissPage() {
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
	
		@FindBy(xpath = "//button[text()='  Produkt als Erster bewerten  ']")
		private static WebElement Review1;	
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt1;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;		
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement VibrationPolimed;		
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationPolimedProduct;		
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationPolimedBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-md-12 col-lg-3 reference-learn_more_professional_polimed']//img")
		private static WebElement Polimed;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-md-12 col-lg-3 reference-learn_more_professional_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement PolimedProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-md-12 col-lg-3 reference-learn_more_professional_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PolimedBuyNow;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
			visibilityOf(Reviewtxt);
			boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Reviewtxt));
			clickElementUsingJavaScript(ReviewClose);
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
			scrollDownUsingElement(VibrationPolimed);
			clickElementUsingJavaScript(VibrationPolimed);
			pageLoad();
		}
		public void clickonVibrationPolimedProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationPolimedProduct);
			clickElementUsingJavaScript(VibrationPolimedProduct);
			pageLoad();
		}
		public void clickonVibrationPolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationPolimedBuyNow);
			moveToElement(VibrationPolimedBuyNow);
			if (isElementPresent(VibrationPolimedBuyNow)) {
				actionClick(VibrationPolimedBuyNow);
				
			} else {
				throw new Exception("VibrationPolimedBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void clickonPolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Polimed);
			clickElementUsingJavaScript(Polimed);
			pageLoad();
		}
		public void clickonPolimedProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedProduct);
			clickElementUsingJavaScript(PolimedProduct);
			pageLoad();
		}
		public void clickonPolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedBuyNow);
			moveToElement(PolimedBuyNow);
			if (isElementPresent(PolimedBuyNow)) {
				actionClick(PolimedBuyNow);
				
			} else {
				throw new Exception("PolimedBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
