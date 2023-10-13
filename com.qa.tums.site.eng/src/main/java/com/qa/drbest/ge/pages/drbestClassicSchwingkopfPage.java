package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestClassicSchwingkopfPage extends BaseClass{
	
	public drbestClassicSchwingkopfPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style even last col-xs-12 col-md-12 reference-buy_now_button_drbest']//child::buynow-button[@class='red']")
		private static WebElement BuyNow1;			
	
		@FindBy(xpath = "//button[@class='bv_button_buttonMinimalist bv_war_button ']")
		private static WebElement Review;
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Schwingkopf Mittel']")
		private static WebElement Reviewtxt;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;
	
		@FindBy(xpath = "//button[@class='bv-write-review-label bv-text-link bv-focusable bv-submission-button bv-first-to-review']")
		private static WebElement Review1;
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Schwingkopf Mittel']")
		private static WebElement Reviewtxt1;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//img")
		private static WebElement polimed;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement polimedproduct;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue']//child::buynow-button[@product='6']")
		private static WebElement polimedBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement Vibrationpolimed;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement Vibrationpolimedproduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//buynow-button[@product='77']")
		private static WebElement VibrationpolimedBuyNow;
		
		
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
			clickElementUsingJavaScript(BuyNow1);
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
		public void clickonpolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(polimed);
			clickElementUsingJavaScript(polimed);
			pageLoad();
		}
		public void clickonpolimedproduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(polimedproduct);
			clickElementUsingJavaScript(polimedproduct);
			pageLoad();
		}
		public void clickonpolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(polimedBuyNow);
			moveToElement(polimedBuyNow);
//			visibilityOf(polimedBuyNow);
//			Thread.sleep(1000);
			actionClick(polimedBuyNow);
//			System.out.println("Polimed is successfully visible");
		}
		public void clickonVibrationpolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Vibrationpolimed);
			clickElementUsingJavaScript(Vibrationpolimed);
			pageLoad();
		}
		public void clickonVibrationpolimedProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Vibrationpolimedproduct);
			clickElementUsingJavaScript(Vibrationpolimedproduct);
			pageLoad();
		}
		public void clickonVibrationpolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationpolimedBuyNow);
			moveToElement(VibrationpolimedBuyNow);
			actionClick(VibrationpolimedBuyNow);
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	

}
