package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class drbestMundgeruchPage extends BaseClass{
	
	public drbestMundgeruchPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//div[@class='swiper-button-next']")
		private static WebElement Next;
	
		@FindBy(xpath = "//span[@class='swiper-pagination-current']//self::span")
		private static WebElement option1;
	
		@FindBy(xpath = "(//h2[text()='Tipp 1: Viel trinken'])[1]")
		private static WebElement optiontext;
	
		@FindBy(xpath = "//a[text()='Mundspülung']")
		private static WebElement Mundspulung;
	
		@FindBy(xpath = "//h2[text()='Tipp 2: Zwischendurch spülen']")
		private static WebElement optiontext1;
	
		@FindBy(xpath = "(//h2[text()='Tipp 3: Basisch ernähren'])[2]")
		private static WebElement optiontext2;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//img")
		private static WebElement Atemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement AtemfrischProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement AtemfrischBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement VibrationAtemfrisch;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement VibrationAtemfrischProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement VibrationAtemfrischBuyNow;
		
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
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-4 reference-Parodontitis']//img")
		private static WebElement Parodontitis;
		
		@FindBy(xpath = "(//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-4 reference-Parodontitis']//child::a[@href='/zahnpflege/parodontitis/'])[2]")
		private static WebElement Parodontitis1;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-4 reference-Ernahrung-und-Zahne']//img")
		private static WebElement Gesunde;
		
		@FindBy(xpath = "(//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-4 reference-Ernahrung-und-Zahne']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/'])[2]")
		private static WebElement Gesunde1;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-4 reference-Zahnpflege-Hilfsmittel']//img")
		private static WebElement ZurGesunde;
		
		@FindBy(xpath = "(//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd col-xs-6 col-sm-4 col-lg-4 reference-Zahnpflege-Hilfsmittel']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/'])[2]")
		private static WebElement ZurGesunde1;
		
	
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
				public void ClickonOption1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(option1);
					clickElementUsingJavaScript(option1);
					if (isElementPresent(optiontext)) {
						System.out.println(getElementText(optiontext));
					} else {
						throw new Exception("Verify text is not display on page");
					}
					pageLoad();
				}
	
				public void ClickonOption2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(optiontext1);
					//visibilityOf(optiontext1);
					if (isElementPresent(Mundspulung)) {
						System.out.println(getElementText(optiontext1));
						
						clickElementUsingJavaScript(Mundspulung);
					} else {
						throw new Exception("Verify  Mundspulung is not display on page");
					}
					pageLoad();
				}
				public void ClickonOption3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(optiontext2);
					//visibilityOf(optiontext1);
					if (isElementPresent(optiontext2)) {
						System.out.println(getElementText(optiontext2));
						
					} else {
						throw new Exception("Verify  Basisch is not display on page");
					}
					pageLoad();
				}
				public void ClickonAtemfrisch() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Atemfrisch);
					clickElementUsingJavaScript(Atemfrisch);
					pageLoad();
				}
				public void ClickonAtemfrischproduct() throws Exception {
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
						System.out.println("AtemfrischBuyNow is Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonVibrationAtemfrisch() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationAtemfrisch);
					clickElementUsingJavaScript(VibrationAtemfrisch);
					pageLoad();
				}
				public void ClickonVibrationAtemfrischproduct() throws Exception {
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
						System.out.println("VibrationAtemfrischBuyNow is Displayed on Page");
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
				
				public void ClickonParodontitis() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Parodontitis);
					clickElementUsingJavaScript(Parodontitis);
					pageLoad();
				}
				public void ClickonParodontitis1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Parodontitis1);
					clickElementUsingJavaScript(Parodontitis1);
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
				public void ClickonZurGesunde() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(ZurGesunde);
					clickElementUsingJavaScript(ZurGesunde);
					pageLoad();
				}
				public void ClickonZurGesunde1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(ZurGesunde1);
					clickElementUsingJavaScript(ZurGesunde1);
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
