package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestPremiumxzZwischenzahnPage extends BaseClass{
	
	public drbestPremiumxzZwischenzahnPage() {
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
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.Best X-Zwischenzahn Mittel']")
		private static WebElement Reviewtxt;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;
	
		@FindBy(xpath = "//button[@class='bv-write-review-label bv-text-link bv-focusable bv-submission-button bv-first-to-review']")
		private static WebElement Review1;
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.Best X-Zwischenzahn Mittel']")
		private static WebElement Reviewtxt1;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//img")
		private static WebElement Atemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement Atemfrischproduct;
	
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[1]")
		private static WebElement AtemfrischBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement VibrationAtemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationAtemfrischProduct;
		
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue'])[2]//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationAtemfrischBuyNow;
		
		
		
		
		
		
		
		
	
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
		public void clickonAtemfrisch() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Atemfrisch);
			clickElementUsingJavaScript(Atemfrisch);
			pageLoad();
		}
		public void clickonAtemfrischProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Atemfrischproduct);
			clickElementUsingJavaScript(Atemfrischproduct);
			pageLoad();
		}
		public void clickonAtemfrischBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AtemfrischBuyNow);
			moveToElement(AtemfrischBuyNow);
			actionClick(AtemfrischBuyNow);
			pageLoad();
		}
		public void clickonVibrationAtemfrisch() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrisch);
			moveToElement(VibrationAtemfrisch);
			clickElementUsingJavaScript(VibrationAtemfrisch);
			pageLoad();
		}
		public void clickonVibrationAtemfrischProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrischProduct);
			moveToElement(VibrationAtemfrischProduct);
			clickElementUsingJavaScript(VibrationAtemfrischProduct);
			pageLoad();
		}
		public void clickonVibrationAtemfrischBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrischBuyNow);
			moveToElement(VibrationAtemfrischBuyNow);
			actionClick(VibrationAtemfrischBuyNow);
			pageLoad();
		}
	
	
	

}
