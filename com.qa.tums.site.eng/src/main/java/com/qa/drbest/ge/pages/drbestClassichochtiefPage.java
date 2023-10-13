package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestClassichochtiefPage extends BaseClass{
	
	public drbestClassichochtiefPage() {
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
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Hoch-Tief Mittel']")
		private static WebElement Reviewtxt;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;	
	
		@FindBy(xpath = "//button[@id='first-to-write']")
		private static WebElement Review1;
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Hoch-Tief Mittel']")
		private static WebElement Reviewtxt1;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_interdentaktiv']//img")
		private static WebElement Interdentaktiv;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_interdentaktiv']//child::a[text()='Mehr erfahren']")
		private static WebElement InterdentaktivProduct;
	
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[1]")
		private static WebElement InterdentaktivBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//img")
		private static WebElement XZwischenzahn;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement XZwischenzahnproduct;
		
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[2]")
		private static WebElement XZwischenzahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement VibrationAstemfrisch;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationAstemfrischProduct;
		
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd last reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[3]")
		private static WebElement VibrationAstemfrischBuyNow;
		
		
	
	
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
				public void clickonReviewButton() throws Exception {
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
				public void clickonReview1Button() throws Exception {
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
				public void clickonInterdentAktivButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Interdentaktiv);
					clickElementUsingJavaScript(Interdentaktiv);
					pageLoad();
				}
				public void clickonInterdentAktivProductButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(InterdentaktivProduct);
					clickElementUsingJavaScript(InterdentaktivProduct);
					pageLoad();
				}
				public void clickonInterdentAktivBuyNowButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(InterdentaktivBuyNow);
					moveToElement(InterdentaktivBuyNow);
					actionClick(InterdentaktivBuyNow);
					pageLoad();
				}
				public void clickonBESTXZwischenzahnButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahn);
					
					clickElementUsingJavaScript(XZwischenzahn);
					pageLoad();
				}
				public void clickonBESTXZwischenzahnProductButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahnproduct);
					
					clickElementUsingJavaScript(XZwischenzahnproduct);
					pageLoad();
				}
				public void clickonBESTXZwischenzahnBuyNowButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahnBuyNow);
					moveToElement(XZwischenzahnBuyNow);
					actionClick(XZwischenzahnBuyNow);
					pageLoad();
				}
				public void clickonVibrationAstemfrischButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationAstemfrisch);
					
					clickElementUsingJavaScript(VibrationAstemfrisch);
					pageLoad();
				}
				public void clickonVibrationAstemfrischProductButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationAstemfrischProduct);
					
					clickElementUsingJavaScript(VibrationAstemfrischProduct);
					pageLoad();
				}
				public void clickonVibrationAstemfrischBuyNowButton() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationAstemfrischBuyNow);
					moveToElement(VibrationAstemfrischBuyNow);
					actionClick(VibrationAstemfrischBuyNow);
					pageLoad();
				}
	
	

}
