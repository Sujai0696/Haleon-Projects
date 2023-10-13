package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestKinderCoolKidsPage extends BaseClass{
	
	public drbestKinderCoolKidsPage() {
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
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//img")
		private static WebElement Vibrationjuniorzahn;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationjuniorzahnProduct;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationjuniorzahnBuyNow;	
		
		
		
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
		public void clickonVibrationjuniorzahn() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Vibrationjuniorzahn);
			clickElementUsingJavaScript(Vibrationjuniorzahn);
			pageLoad();
		}
		public void clickonVibrationjuniorzahnProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationjuniorzahnProduct);
			clickElementUsingJavaScript(VibrationjuniorzahnProduct);
			pageLoad();
		}
		public void clickonVibrationjuniorzahnBuyNow() throws Exception {
			waitForPageLoadJava();
			moveToElement(VibrationjuniorzahnBuyNow);
			if (isElementPresent(VibrationjuniorzahnBuyNow)) {
				actionClick(VibrationjuniorzahnBuyNow);
				
			} else {
				throw new Exception("VibrationjuniorzahnBuyNow is not displayed on Page");
			}
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
