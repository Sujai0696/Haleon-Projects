package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestErwachsenePage extends BaseClass{
	
	public drbestErwachsenePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section element-margin-90 even col-xs-12 reference-video-forschung-custom-thumbnail']")
		private static WebElement youtubebtn;
		
		@FindBy(xpath = "//div[@class='videoWrapper video-big']//img")
		private static WebElement youtubebtnplay;
	
		@FindBy(xpath = "//iframe[@class='yt-player']")
		private static WebElement iframe1;
	
		@FindBy(xpath = "//div[@class='videoWrapper video-big']//child::img")
		private static WebElement videoplay;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section element-margin-90 even col-xs-12 reference-video-forschung-custom-thumbnail']")
		private static WebElement thumbnailbtn;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//img")
		private static WebElement VibrationPolimed;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationPolimedProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_polimed']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationPolimedbuynow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//img")
		private static WebElement Vibrationmultiexpert;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationmultiexpertProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationmultiexpertBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//img")
		private static WebElement XZwischenzahn;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement XZwischenzahnProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_premium_xzwischenzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement XZwischenzahnBuyNow;
		
		@FindBy(xpath = "//fieldset[@data-question-id='1']//label[text()='Nicht besonders wichtig ']")
		private static WebElement questionbutton1;	
	
		@FindBy(xpath = "//h2[text()='Wie wichtig ist Ihnen Karies-Vorbeugung?']")
		private static WebElement q1;	
		
		@FindBy(xpath = "(//label[text()='Nicht besonders wichtig '])[2]")
		private static WebElement questionbutton2;	
		
		@FindBy(xpath = "//h2[text()='Wie wichtig ist Ihnen Plaque-Vorbeugung?']")
		private static WebElement q2;
		
	
		@FindBy(xpath = "//h2[text()='Wie wichtig ist Ihnen eine gründliche Reinigung der Zahnzwischenräume?']")
		private static WebElement q3;	
		
		@FindBy(xpath = "(//label[text()='Nicht besonders wichtig '])[3]")
		private static WebElement questionbutton3;	
		
		@FindBy(xpath = "//h2[text()='Wie wichtig ist Ihnen Zahnfleischschutz?']")
		private static WebElement q4;	
		
		@FindBy(xpath = "(//label[text()='Nicht besonders wichtig '])[4]")
		private static WebElement questionbutton4;	
		
		@FindBy(xpath = "//h2[text()='Leiden Sie unter Mundgeruch oder ist Ihnen ein frischer Atem besonders wichtig?']")
		private static WebElement q5;	
		
		@FindBy(xpath = "(//label[text()='Nicht besonders wichtig '])[5]")
		private static WebElement questionbutton5;	
		
		@FindBy(xpath = "//h2[text()='Bevorzugen Sie Zahnbürsten mit Vibrationstechnologie?']")
		private static WebElement q6;
		
		@FindBy(xpath = "//label[text()='ja ']")
		private static WebElement questionbutton6;
		
		@FindBy(xpath = "//h2[text()='Bevorzugen Sie eher einen größeren oder kleineren Bürstenkopf?']")
		private static WebElement q7;
		
		@FindBy(xpath = "//label[text()='größerer Bürstenkopf ']")
		private static WebElement questionbutton7;
		
		@FindBy(xpath = "(//h2[@class='result__item__name'])[2]")
		private static WebElement q8;
		
		
		@FindBy(xpath = "//iframe[@class='iframe--toothbrushtest']")
		private static WebElement iframe;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Gesunde;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Gesunde1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/weissere-zaehne/']")
		private static WebElement Wiebekomme;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/weissere-zaehne/']")
		private static WebElement Wiebekomme1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Zahnpflege;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Zahnpflege1;
		
		
		
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
				public void Clickonyoutubebtn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(youtubebtn);
					clickElementUsingJavaScript(youtubebtnplay);
					//visibilityOf(iframe);
					//Thread.sleep(1000);
					//switchToFrameUsingElement(iframe);
					moveToElement(thumbnailbtn);
					
					 // visibilityOf(thumbnailbtn);
					  actionClick(thumbnailbtn); 
					  boolean elementIsDisplayed=elementIsDisplayed(thumbnailbtn);
					  Assert.assertTrue(elementIsDisplayed(thumbnailbtn)); 
					  
					 clickElementUsingJavaScript(videoplay);
					  System.out.println("Video is playing Successfully");
					 
					//frameSwitchingToDefaultContent();
					
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
				public void ClickonVibrationPolimedBuyNoe() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationPolimedbuynow);
					moveToElement(VibrationPolimedbuynow);
					if (isElementPresent(VibrationPolimedbuynow)) {
						actionClick(VibrationPolimedbuynow);
						
					} else {
						throw new Exception("VibrationPolimedbuynow is not Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonVibrationMultiExpert() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Vibrationmultiexpert);
					clickElementUsingJavaScript(Vibrationmultiexpert);
					pageLoad();
				}
				public void ClickonVibrationMultiExpertProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationmultiexpertProduct);
					clickElementUsingJavaScript(VibrationmultiexpertProduct);
					pageLoad();
				}
				public void ClickonVibrationMultiExpertBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationmultiexpertBuyNow);
					moveToElement(VibrationmultiexpertBuyNow);
					if (isElementPresent(VibrationmultiexpertBuyNow)) {
						actionClick(VibrationmultiexpertBuyNow);
						
					} else {
						throw new Exception("VibrationmultiexpertBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonXZwischenzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahn);
					clickElementUsingJavaScript(XZwischenzahn);
					pageLoad();
				}
				public void ClickonXZwischenzahnProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahnProduct);
					clickElementUsingJavaScript(XZwischenzahnProduct);
					pageLoad();
				}
				public void ClickonXZwischenzahnBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahnBuyNow);
					moveToElement(XZwischenzahnBuyNow);
					if (isElementPresent(XZwischenzahnBuyNow)) {
						actionClick(XZwischenzahnBuyNow);
						
					} else {
						throw new Exception("XZwischenzahnBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
				public void clickonQuiz1() throws Exception {
					waitForPageLoadJava();
					Thread.sleep(1000);
					//scrollDownUsingElement(q1);
					switchToFrameUsingElement(iframe);
					Thread.sleep(1000);
					boolean elementIsDisplayed=elementIsDisplayed(q1);
					Assert.assertTrue(elementIsDisplayed(q1));
					if (isElementPresent(q1)) {
						System.out.println(getElementText(q1));
					} else {
						throw new Exception("q1 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz2() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton1);
					Thread.sleep(1000);
					visibilityOf(q2);
					boolean elementIsDisplayed=elementIsDisplayed(q2);
					Assert.assertTrue(elementIsDisplayed(q2));
					if (isElementPresent(q2)) {
						System.out.println(getElementText(q2));
					} else {
						throw new Exception("q2 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz3() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton2);
					visibilityOf(q3);
					boolean elementIsDisplayed=elementIsDisplayed(q3);
					Assert.assertTrue(elementIsDisplayed(q3));
					if (isElementPresent(q3)) {
						System.out.println(getElementText(q3));
					} else {
						throw new Exception("q3 is not displayed on page");
					}

					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz4() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton3);
					visibilityOf(q4);
					boolean elementIsDisplayed=elementIsDisplayed(q4);
					Assert.assertTrue(elementIsDisplayed(q4));
					if (isElementPresent(q4)) {
						clickElementUsingJavaScript(q4);
						System.out.println(getElementText(q4));
					} else {
						throw new Exception("q4 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz5() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton4);
					visibilityOf(q5);
					boolean elementIsDisplayed=elementIsDisplayed(q5);
					Assert.assertTrue(elementIsDisplayed(q5));
					if (isElementPresent(q5)) {
						clickElementUsingJavaScript(q5);
						System.out.println(getElementText(q5));
					} else {
						throw new Exception("q5 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz6() throws Exception {
					waitForPageLoadJava();	
					
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton5);
					visibilityOf(q6);
					boolean elementIsDisplayed=elementIsDisplayed(q6);
					Assert.assertTrue(elementIsDisplayed(q6));
					if (q6.isEnabled()) {
						clickElementUsingJavaScript(q6);
						System.out.println(getElementText(q6));
					} else {
						throw new Exception("q6 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz7() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton6);
					visibilityOf(q7);
					boolean elementIsDisplayed=elementIsDisplayed(q7);
					Assert.assertTrue(elementIsDisplayed(q7));
					if (questionbutton1.isDisplayed()) {
						clickElementUsingJavaScript(q7);
						System.out.println(getElementText(q7));
					} else {
						throw new Exception("q7 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void clickonQuiz8() throws Exception {
					waitForPageLoadJava();	
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					clickElementUsingJavaScript(questionbutton7);
					visibilityOf(q8);
					boolean elementIsDisplayed=elementIsDisplayed(q8);
					Assert.assertTrue(elementIsDisplayed(q8));
					if (questionbutton1.isDisplayed()) {
						clickElementUsingJavaScript(q8);
						System.out.println(getElementText(q8));
					} else {
						throw new Exception("q8 is not displayed on page");
					}
					
					frameSwitchingToDefaultContent();
					pageLoad();
				}
				public void ClickonGesunde() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Gesunde);
					clickElementUsingJavaScript(Gesunde);
					pageLoad();
				}
				public void ClickonGesunde1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Gesunde1);
					clickElementUsingJavaScript(Gesunde1);
					pageLoad();
				}
				public void ClickonWieBekomme() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wiebekomme);
					clickElementUsingJavaScript(Wiebekomme);
					pageLoad();
				}
				public void ClickonWieBekomme1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wiebekomme1);
					clickElementUsingJavaScript(Wiebekomme1);
					pageLoad();
				}
				public void ClickonZahnpflege() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Zahnpflege);
					clickElementUsingJavaScript(Zahnpflege);
					pageLoad();
				}
				public void ClickonZahnpflege1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Zahnpflege1);
					clickElementUsingJavaScript(Zahnpflege1);
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
	

}
