package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestKinderZahnentwicklungPage extends BaseClass{
	
	public drbestKinderZahnentwicklungPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;		
	
		@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']")
		private static WebElement Activeslider1;	
	
		@FindBy(xpath = "(//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::h2[text()='Tipp 1: Vom ersten Zahn an gründlich pflegen'])[1]")
		private static WebElement Text1;	
	
		@FindBy(xpath = "//a[text()='Zahnputztechniken für Kinder']")
		private static WebElement Textclick1;
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']")
		private static WebElement ActiveSlider2;
	
		@FindBy(xpath = "//h2[text()='Tipp 2: Kindgerechte Zahnputztechniken']")
		private static WebElement Text2;
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']")
		private static WebElement ActiveSlider3;
	
		@FindBy(xpath = "(//h2[text()='Tipp 3: Immer auf die Lücken achten'])[2]")
		private static WebElement Text3;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//img")
		private static WebElement ErsteZahne;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//child::a[text()='Mehr erfahren']")
		private static WebElement ErsteZahneProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement ErsteZahneBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//img")
		private static WebElement Milchzahn;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement MilchzahnProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MilchzahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//img")
		private static WebElement JuniorZahn;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement JuniorZahnProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_juniorzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement JuniorZahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//img")
		private static WebElement VibrationJuniorZahn;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationJuniorZahnProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_juniorzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationJuniorZahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//img")
		private static WebElement Coolkids;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::a[text()='Mehr erfahren']")
		private static WebElement CoolkidsProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement CoolkidsBuyNow;
		
		@FindBy(xpath = "//div[@class='box component section element-margin-90 kinderputzen odd col-xs-12 col-md-12']//a[text()='Zur Website']")
		private static WebElement zurwebsite;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement Article1;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement Link1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-bei-festen-zahnspangen/']")
		private static WebElement Article2;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-bei-festen-zahnspangen/']")
		private static WebElement Link2;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Article3;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
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
		public void ClickonSliderText1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Text1);
			visibilityOf(Activeslider1);
			boolean elementIsDisplayed=elementIsDisplayed(Activeslider1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Text1));
			pageLoad();
		}
		public void ClickonSliderText2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Text1);
			visibilityOf(ActiveSlider2);
			boolean elementIsDisplayed=elementIsDisplayed(ActiveSlider2);
			Assert.assertTrue(elementIsDisplayed);
			if (isElementPresent(Text2)) {
				System.out.println(getElementText(Text2));
				clickElementUsingJavaScript(Textclick1);
			} else {
				throw new Exception("Text is not displayed on page");
			}
			
			pageLoad();
		}
		public void ClickonSliderText3() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Text3);
			visibilityOf(ActiveSlider3);
			boolean elementIsDisplayed=elementIsDisplayed(ActiveSlider3);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Text3));
			pageLoad();
		}
		public void ClickonErsteZahne() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(ErsteZahne);
			clickElementUsingJavaScript(ErsteZahne);
			pageLoad();
		}
		public void ClickonErsteZahneProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(ErsteZahneProduct);
			clickElementUsingJavaScript(ErsteZahneProduct);
			pageLoad();
		}
		public void ClickonErsteZahneBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(ErsteZahneBuyNow);
			moveToElement(ErsteZahneBuyNow);
			if (isElementPresent(ErsteZahneBuyNow)) {
				actionClick(ErsteZahneBuyNow);
			} else {
				throw new Exception("ErsteZahneBuyNow is not Displayed on page");
			}
			pageLoad();
		}
			public void ClickonMilchzahn() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Milchzahn);
			clickElementUsingJavaScript(Milchzahn);
			pageLoad();
		}
			public void ClickonMilchzahnProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(MilchzahnProduct);
			clickElementUsingJavaScript(MilchzahnProduct);
			pageLoad();
		}
			public void ClickonMilchzahnBuyNow() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(MilchzahnBuyNow);
				moveToElement(MilchzahnBuyNow);
				if (isElementPresent(MilchzahnBuyNow)) {
					actionClick(MilchzahnBuyNow);
				} else {
					throw new Exception("MilchzahnBuyNow is not Displayed on page");
				}
				pageLoad();
			}
			public void ClickonJuniorZahn() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(JuniorZahn);
				clickElementUsingJavaScript(JuniorZahn);
				pageLoad();
			}
			public void ClickonJuniorZahnProduct() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(JuniorZahnProduct);
				clickElementUsingJavaScript(JuniorZahnProduct);
				pageLoad();
			}
			public void ClickonJuniorZahnBuyNow() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(JuniorZahnBuyNow);
				moveToElement(JuniorZahnBuyNow);
				if (isElementPresent(JuniorZahnBuyNow)) {
					actionClick(JuniorZahnBuyNow);
				} else {
					throw new Exception("JuniorZahnBuyNow is not Displayed on page");
				}
				pageLoad();
			}
			public void ClickonVibrationJuniorZahn() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(VibrationJuniorZahn);
				clickElementUsingJavaScript(VibrationJuniorZahn);
				pageLoad();
			}
			public void ClickonVibrationJuniorZahnProduct() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(VibrationJuniorZahnProduct);
				clickElementUsingJavaScript(VibrationJuniorZahnProduct);
				pageLoad();
			}
			public void ClickonVibrationJuniorZahnBuyNow() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(VibrationJuniorZahnBuyNow);
				moveToElement(VibrationJuniorZahnBuyNow);
				if (isElementPresent(VibrationJuniorZahnBuyNow)) {
					actionClick(VibrationJuniorZahnBuyNow);
				} else {
					throw new Exception("VibrationJuniorZahnBuyNow is not Displayed on page");
				}
				pageLoad();
			}
			public void ClickonCoolkids() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Coolkids);
				clickElementUsingJavaScript(Coolkids);
				pageLoad();
			}
			public void ClickonCoolkidsProduct() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(CoolkidsProduct);
				clickElementUsingJavaScript(CoolkidsProduct);
				pageLoad();
			}
			public void ClickonCoolkidsBuyNow() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(CoolkidsBuyNow);
				moveToElement(CoolkidsBuyNow);
				if (isElementPresent(CoolkidsBuyNow)) {
					actionClick(CoolkidsBuyNow);
				} else {
					throw new Exception("CoolkidsBuyNow is not Displayed on page");
				}
				pageLoad();
			}
			public String ClickonZurWebsite() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(zurwebsite);
				visibilityOf(zurwebsite);
				clickElementUsingJavaScript(zurwebsite);
				pageLoad();
				String currenturl=getCurrentUrl();
				return currenturl;
				
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
			public void ClickonLink3() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Link3);
				clickElementUsingJavaScript(Link3);
				pageLoad();
			}
		
		
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	

}
