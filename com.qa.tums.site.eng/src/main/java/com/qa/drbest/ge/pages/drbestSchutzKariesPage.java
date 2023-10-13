package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestSchutzKariesPage extends BaseClass{
	
	public drbestSchutzKariesPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;	
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//img")
		private static WebElement XZwischenxahn;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement XZwischenxahnProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement XZwischenxahnBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement VibrationPolimed;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationPolimedProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage=\"/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html\"]")
		private static WebElement VibrationPolimedBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//img")
		private static WebElement VibrationMultiExpert;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationMultiExpertProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationMultiExpertBuyNow;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Article1;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Link1;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/empfindliche-zaehne/']")
		private static WebElement Article2;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/empfindliche-zaehne/']")
		private static WebElement Link2;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Article3;
		
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Link3;
		
		
		
		
		
		
	
	
	
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
		public void ClickonXZwischenzahn() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(XZwischenxahn);
			clickElementUsingJavaScript(XZwischenxahn);
			pageLoad();
		}
		public void ClickonXZwischenzahnProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(XZwischenxahnProduct);
			clickElementUsingJavaScript(XZwischenxahnProduct);
			pageLoad();
		}
		public void ClickonXZwischenzahntBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(XZwischenxahnBuyNow);
			moveToElement(XZwischenxahnBuyNow);
			if (XZwischenxahnBuyNow.isDisplayed()) {
				actionClick(XZwischenxahnBuyNow);
				
			} else {
				throw new Exception("XZwischenxahnBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonVibrationPolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationPolimed);
			clickElementUsingJavaScript(VibrationPolimed);
			pageLoad();
		}
		public void ClickonVibrationPolimedProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationPolimedProduct);
			clickElementUsingJavaScript(VibrationPolimedProduct);
			pageLoad();
		}
		public void ClickonVibrationPolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationPolimedBuyNow);
			moveToElement(VibrationPolimedBuyNow);
			if (VibrationPolimedBuyNow.isDisplayed()) {
				actionClick(VibrationPolimedBuyNow);
				
			} else {
				throw new Exception("VibrationPolimedBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonVibrationMultiExpert() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpert);
			clickElementUsingJavaScript(VibrationMultiExpert);
			pageLoad();
		}
		public void ClickonVibrationMultiExpertProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpertProduct);
			clickElementUsingJavaScript(VibrationMultiExpertProduct);
			pageLoad();
		}
		public void ClickonVibrationMultiExpertBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpertBuyNow);
			moveToElement(VibrationMultiExpertBuyNow);
			if (VibrationMultiExpertBuyNow.isDisplayed()) {
				actionClick(VibrationMultiExpertBuyNow);
				
			} else {
				throw new Exception("VibrationMultiExpertBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonArticle1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Article1);
			clickElementUsingJavaScript(Article1);
			pageLoad();
		}
		public void ClickonLink1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Link1);
			clickElementUsingJavaScript(Link1);
			pageLoad();
		}
		public void ClickonArticle2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Article2);
			clickElementUsingJavaScript(Article2);
			pageLoad();
		}
		public void ClickonLink2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Link2);
			clickElementUsingJavaScript(Link2);
			pageLoad();
		}
		public void ClickonArticle3() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Article3);
			clickElementUsingJavaScript(Article3);
			pageLoad();
		}
		public void ClickonRelatedLink3() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Link3);
			clickElementUsingJavaScript(Link3);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
