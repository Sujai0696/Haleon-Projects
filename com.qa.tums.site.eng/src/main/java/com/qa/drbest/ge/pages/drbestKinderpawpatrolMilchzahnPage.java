package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestKinderpawpatrolMilchzahnPage extends BaseClass{
	
	public drbestKinderpawpatrolMilchzahnPage() {
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
			
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//img")
		private static WebElement Juniorzahn;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement JuniorzahnProduct;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement JuniorzahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//img")
		private static WebElement VibrationJuniorzahn;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationJuniorzahnProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationJuniorzahnBuyNow;
		
		
		
		
		
		
		
		
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
				public void clickonJuniorzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Juniorzahn);
					clickElementUsingJavaScript(Juniorzahn);
					pageLoad();
				}
				public void clickonJuniorzahnProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(JuniorzahnProduct);
					clickElementUsingJavaScript(JuniorzahnProduct);
					pageLoad();
				}
				public void clickonjuniorzahnBuyNow() throws Exception {
					waitForPageLoadJava();
					moveToElement(JuniorzahnBuyNow);
					if (isElementPresent(JuniorzahnBuyNow)) {
						actionClick(JuniorzahnBuyNow);
						
					} else {
						throw new Exception("JuniorzahnBuyNow is not displayed on Page");
					}
					pageLoad();
				}
				public void clickonVibrationJuniorzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationJuniorzahn);
					clickElementUsingJavaScript(VibrationJuniorzahn);
					pageLoad();
				}
				public void clickonVibrationJuniorzahnProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationJuniorzahnProduct);
					clickElementUsingJavaScript(VibrationJuniorzahnProduct);
					pageLoad();
				}
				public void clickonVibrationjuniorzahnBuyNow() throws Exception {
					waitForPageLoadJava();
					moveToElement(VibrationJuniorzahnBuyNow);
					if (isElementPresent(VibrationJuniorzahnBuyNow)) {
						actionClick(VibrationJuniorzahnBuyNow);
						
					} else {
						throw new Exception("VibrationJuniorzahnBuyNow is not displayed on Page");
					}
					pageLoad();
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
