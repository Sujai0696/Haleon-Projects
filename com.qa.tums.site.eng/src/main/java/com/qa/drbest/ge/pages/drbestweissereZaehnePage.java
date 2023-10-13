package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestweissereZaehnePage extends BaseClass{
	
	public drbestweissereZaehnePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;	
	
		@FindBy(xpath = "//div[@class='richText component section blue-text-box element-margin-90 even col-xs-12 col-md-12']//child::a[@href='/zahnbuersten/professional-natuerlich-weiss/']")
		private static WebElement Naturelich;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//img")
		private static WebElement Polimed;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement PolimedProduct;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PolimedBuyNow;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement VibrationPolimed;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationPolimedProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationPolimedBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//img")
		private static WebElement Polimedkurzkof;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//child::a[text()='Mehr erfahren']")
		private static WebElement PolimedkurzkofProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PolimedkurzkofBuyNow;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Wieentshetht;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Wieentshetht1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Gesunde;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Gesunde1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Zurgesunde;
		
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Zurgesunde1;
		
		
	
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
		public void ClickonNaturelich() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Naturelich);
			clickElementUsingJavaScript(Naturelich);
			pageLoad();
		}
		public void ClickonPolimed() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Polimed);
			clickElementUsingJavaScript(Polimed);
			pageLoad();
		}
		public void ClickonPolimedProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedProduct);
			clickElementUsingJavaScript(PolimedProduct);
			pageLoad();
		}
		public void ClickonPolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedBuyNow);
			moveToElement(PolimedBuyNow);
			if (isElementPresent(PolimedBuyNow)) {
				actionClick(PolimedBuyNow);
			} else {
				throw new Exception("PolimedBuyNow is not present /Display on page");
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
			if (isElementPresent(VibrationPolimedBuyNow)) {
				actionClick(VibrationPolimedBuyNow);
			} else {
				throw new Exception("VibrationPolimedBuyNow is not present /Display on page");
			}
			
			pageLoad();
		}
		public void ClickonPolimedkurzkopf() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Polimedkurzkof);
			clickElementUsingJavaScript(Polimedkurzkof);
			pageLoad();
		}
		public void ClickonPolimedkurzkopfProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedkurzkofProduct);
			clickElementUsingJavaScript(PolimedkurzkofProduct);
			pageLoad();
		}
		public void ClickonPolimedkurzkopfBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(PolimedkurzkofBuyNow);
			moveToElement(PolimedkurzkofBuyNow);
			if (isElementPresent(PolimedkurzkofBuyNow)) {
				actionClick(PolimedkurzkofBuyNow);
			} else {
				throw new Exception("PolimedkurzkofBuyNow is not present /Display on page");
			}
			
			pageLoad();
		}
		public void ClickonWieentshetht() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wieentshetht);
			clickElementUsingJavaScript(Wieentshetht);
			pageLoad();
		}
		public void ClickonWieentshetht1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wieentshetht1);
			clickElementUsingJavaScript(Wieentshetht1);
			pageLoad();
		}
		public void Clickongesunde() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Gesunde);
			clickElementUsingJavaScript(Gesunde);
			pageLoad();
		}
		public void Clickongesunde1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Gesunde1);
			clickElementUsingJavaScript(Gesunde1);
			pageLoad();
		}
		public void ClickonZurgesunde() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Zurgesunde);
			clickElementUsingJavaScript(Zurgesunde);
			pageLoad();
		}
		public void ClickonZurgesunde1() throws Exception {
			waitForPageLoadJava();
			//scrollDownUsingElement(Zurgesunde1);
			clickElementUsingJavaScript(Zurgesunde1);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	

}
