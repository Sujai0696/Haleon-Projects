package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbesthilfsmittelPage extends BaseClass{
	
	public drbesthilfsmittelPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//img")
		private static WebElement Atemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement AtemfrischProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement AtemfrischBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement Vibration;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement VibrationAtemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationAtemfrischProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationAtemfrischBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//img")
		private static WebElement VibrationMultiExpert;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationMultiExpertProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationMultiExpertBuyNow;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnputztechnik-erwachsene/']")
		private static WebElement Rutteln;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnputztechnik-erwachsene/']")
		private static WebElement Rutteln1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/weissere-zaehne/']")
		private static WebElement Wiebekomme;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/weissere-zaehne/']")
		private static WebElement Wiebekomme1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Dieschleichende;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Dieschleichende1;
		
		
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
		public void ClickonAtemfrisch() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Atemfrisch);
			clickElementUsingJavaScript(Atemfrisch);
			pageLoad();
		}
		public void ClickonAtemfrischProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AtemfrischProduct);
			clickElementUsingJavaScript(AtemfrischProduct);
			pageLoad();
		}
		public void ClickonAtemfrischBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AtemfrischBuyNow);
			moveToElement(AtemfrischBuyNow);
			if (isElementPresent(AtemfrischBuyNow)) {
				actionClick(AtemfrischBuyNow);
				
			} else {
				throw new Exception("AtemfrischBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonVibration() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Vibration);
			clickElementUsingJavaScript(Vibration);
			pageLoad();
		}
		public void ClickonVibrationProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationProduct);
			clickElementUsingJavaScript(VibrationProduct);
			pageLoad();
		}
		public void ClickonVibrationBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationBuyNow);
			moveToElement(VibrationBuyNow);
			if (isElementPresent(VibrationBuyNow)) {
				actionClick(VibrationBuyNow);
				
			} else {
				throw new Exception("VibrationBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonVibratioAtemfrisch() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrisch);
			clickElementUsingJavaScript(VibrationAtemfrisch);
			pageLoad();
		}
		public void ClickonVibratioAtemfrischProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrischProduct);
			clickElementUsingJavaScript(VibrationAtemfrischProduct);
			pageLoad();
		}
		public void ClickonVibrationAtemfrischBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationAtemfrischBuyNow);
			moveToElement(VibrationAtemfrischBuyNow);
			if (isElementPresent(VibrationAtemfrischBuyNow)) {
				actionClick(VibrationAtemfrischBuyNow);
				
			} else {
				throw new Exception("VibrationAtemfrischBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonVibratioMultiExpert() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpert);
			clickElementUsingJavaScript(VibrationMultiExpert);
			pageLoad();
		}
		public void ClickonVibratioMultiExpertProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpertProduct);
			clickElementUsingJavaScript(VibrationMultiExpertProduct);
			pageLoad();
		}
		public void ClickonVibrationMultiExpertBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(VibrationMultiExpertBuyNow);
			moveToElement(VibrationMultiExpertBuyNow);
			if (isElementPresent(VibrationMultiExpertBuyNow)) {
				actionClick(VibrationMultiExpertBuyNow);
				
			} else {
				throw new Exception("VibrationMultiExpertBuyNow is not Displayed on Page");
			}
			pageLoad();
		}
		public void ClickonRutteln() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Rutteln);
			clickElementUsingJavaScript(Rutteln);
			pageLoad();
		}
		public void ClickonRutteln1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Rutteln1);
			clickElementUsingJavaScript(Rutteln1);
			pageLoad();
		}
		public void ClickonWiebekomme() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wiebekomme);
			clickElementUsingJavaScript(Wiebekomme);
			pageLoad();
		}
		public void ClickonWiebekomme1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wiebekomme1);
			clickElementUsingJavaScript(Wiebekomme1);
			pageLoad();
		}
		public void ClickonDieschleichende() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Dieschleichende);
			clickElementUsingJavaScript(Dieschleichende);
			pageLoad();
		}
		public void ClickonDieschleichende1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Dieschleichende1);
			clickElementUsingJavaScript(Dieschleichende1);
			pageLoad();
		}
		
		
		
		
		
	
	
	

}
