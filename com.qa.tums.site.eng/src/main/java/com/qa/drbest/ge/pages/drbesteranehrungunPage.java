package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbesteranehrungunPage extends BaseClass{
	
	public drbesteranehrungunPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;	
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::h2[text()='Vor dem Wechsel: So pflegen Sie Ihre ']")
		private static WebElement Slide1;	
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::h2[text()='Vor dem Wechsel: So pflegen Sie Ihre ']")
		private static WebElement Slide2;	
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::h2[text()='Vor dem Wechsel: So pflegen Sie Ihre ']")
		private static WebElement Slide3;	
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::p[text()='Ggf. zwei Zahnbürsten verwenden (für morgens und abends), um das möglichst vollständige Trocknen der Zahnbürste zu ermöglichen.']")
		private static WebElement Slide4;
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::p[text()='Zahnbürste, Zahnputzbecher und Zahnpastatube nicht mit anderen Angehörigen der Hausgemeinschaft teilen.']")
		private static WebElement Slide5;
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::p[text()='Putzdruck und Putztechnik: Verbiegen sich die Borsten Ihrer Zahnbürste sehr frühzeitig, könnte dies ggf. auf zu hohen Putzdruck hinweisen. Optimal ist ein Auflagegewicht von 150 g. Tipp: Testen Sie den Druck mit einer Küchenwaage.']")
		private static WebElement Slide6;
	
		@FindBy(xpath = "//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::p[text()='Bei weiteren Fragen zur richtigen Zahnbürste, deren Nutzung und Aufbewahrung sowie zur Wechselhäufigkeit, lassen Sie sich auch von Ihrem Zahnarzt beraten.']")
		private static WebElement Slide7;
	
		@FindBy(xpath = "(//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//child::p[text()='Zum Erhalt Ihrer Mundgesundheit denken Sie darüber hinaus an regelmäßige Vorsorgeuntersuchungen bei Ihrem Zahnarzt.'])[2]")
		private static WebElement Slide8;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement VibrationPolimed;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationPolimedProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationPolimedBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//img")
		private static WebElement Atemfrisch;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement AtemfrischProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement AtemfrischBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement Multiexpert;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MultiexpertBuyNow;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Article1;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement link1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Article2;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Link2;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/empfindliche-zaehne/']")
		private static WebElement Article3;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/empfindliche-zaehne/']")
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
					scrollDownUsingElement(Slide1);
					if (isElementPresent(Slide1)) {
						System.out.println(getElementText(Slide1));
						
					} else {
						throw new Exception("Content for slide 1 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide2);
					if (isElementPresent(Slide2)) {
						System.out.println(getElementText(Slide2));
						
					} else {
						throw new Exception("Content for slide 2 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide3);
					if (isElementPresent(Slide3)) {
						System.out.println(getElementText(Slide3));
						
					} else {
						throw new Exception("Content for slide 3 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide4() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide4);
					if (isElementPresent(Slide4)) {
						System.out.println(getElementText(Slide4));
						
					} else {
						throw new Exception("Content for slide 4 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide5() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide5);
					if (isElementPresent(Slide5)) {
						System.out.println(getElementText(Slide5));
						
					} else {
						throw new Exception("Content for slide 5 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide6() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide6);
					if (isElementPresent(Slide6)) {
						System.out.println(getElementText(Slide6));
						
					} else {
						throw new Exception("Content for slide 6 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide7() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide7);
					if (isElementPresent(Slide7)) {
						System.out.println(getElementText(Slide7));
						
					} else {
						throw new Exception("Content for slide 7 is not Verified on page");
					}
					pageLoad();
				}
				public void ClickonSlide8() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Slide8);
					if (isElementPresent(Slide8)) {
						System.out.println(getElementText(Slide8));
						
					} else {
						throw new Exception("Content for slide 8 is not Verified on page");
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
					//scrollDownUsingElement(VibrationPolimedProduct);
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
					if (AtemfrischBuyNow.isDisplayed()) {
						actionClick(AtemfrischBuyNow);
						
					} else {
						throw new Exception("AtemfrischBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonMultiExpert() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Multiexpert);
					clickElementUsingJavaScript(Multiexpert);
					pageLoad();
				}
				public void ClickonMultiExpertBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(MultiexpertBuyNow);
					moveToElement(MultiexpertBuyNow);
					if (MultiexpertBuyNow.isDisplayed()) {
						actionClick(MultiexpertBuyNow);
						
					} else {
						throw new Exception("MultiexpertBuyNow is not Displayed on Page");
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
					scrollDownUsingElement(link1);
					clickElementUsingJavaScript(link1);
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
