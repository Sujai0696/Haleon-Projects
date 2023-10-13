package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestempfindlichePage extends BaseClass{
	
	public drbestempfindlichePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;			
	
		@FindBy(xpath = "(//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::a[text()='Zahnseide oder Interdentalbürsten'])[2]")
		private static WebElement SlideText1;	
	
		@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']")
		private static WebElement SlideText2;	
	
		@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']")
		private static WebElement SlideText3;	
	
		@FindBy(xpath = "(//a[@href='/zahnpflege/ernaehrung-und-zaehne/'])[4]")
		private static WebElement SlideText4;	
	
		@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']")
		private static WebElement SlideText5;	
	
		@FindBy(xpath = "(//div[@class='box component section container-main article-main-content odd last col-xs-12']//child::h2[text()='Fluorid zur Remineralisierung'])[2]")
		private static WebElement Text5;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//img")
		private static WebElement Polimed;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement PolimedProduct;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PolimedBuyNow;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement MultiExpertProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MultiExpertBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-4 reference-Parodontitis']//img")
		private static WebElement Article1;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Link1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Article2;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Link2;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Article3;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
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
		public void ClickonSlide1() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(SlideText1);
			pageLoad();
		}
		public void ClickonSlide2() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(SlideText2)) {
				System.out.println(getElementText(SlideText2));
				
			} else {
				throw new Exception("Element2 is not visible on Page");
			}
		}
		public void ClickonSlide3() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(SlideText3)) {
				System.out.println(getElementText(SlideText3));
				
			} else {
				throw new Exception("Element3 is not visible on Page");
			}
		}
		public void ClickonSlide4() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(SlideText4);
			pageLoad();
		}
		public void ClickonSlide5() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(Text5)) {
				System.out.println(getElementText(Text5));
				
			} else {
				throw new Exception("Element5 is not visible on Page");
			}
			pageLoad();
		}
		public void ClickonPolimed() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Polimed);
			pageLoad();
		}
		public void ClickonPolimedProduct() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(PolimedProduct);
			pageLoad();
		}
		public void ClickonPolimedBuyNow() throws Exception {
			waitForPageLoadJava();
			moveToElement(PolimedBuyNow);
			if (isElementPresent(PolimedBuyNow)) {
				actionClick(PolimedBuyNow);
				
			} else {
				throw new Exception(" PolimedBuyNow is not visible on Page");
			}
			pageLoad();
		}
		public void ClickonMultiExpertProduct() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(MultiExpertProduct);
			pageLoad();
		}
		public void ClickonMultiExpertBuyNow() throws Exception {
			waitForPageLoadJava();
			moveToElement(MultiExpertBuyNow);
			if (isElementPresent(MultiExpertBuyNow)) {
				actionClick(MultiExpertBuyNow);
				
			} else {
				throw new Exception(" MultiExpert is not visible on Page");
			}
			pageLoad();
		}
		public void ClickonArticle1() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Article1);
			pageLoad();
		}
		public void ClickonLink1() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Link1);
			pageLoad();
		}
		public void ClickonArticle2() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Article2);
			pageLoad();
		}
		public void ClickonLink2() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Link2);
			pageLoad();
		}
		public void ClickonArticle3() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Article3);
			pageLoad();
		}
		public void ClickonLink3() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Link3);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
