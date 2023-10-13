package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestzahnpflegePage extends BaseClass{
	
	public drbestzahnpflegePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
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
		
		
		
		@FindBy(xpath = "//img[@alt='Dr.BEST Vibration Polimed']")
		private static WebElement ImageDisplay;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 first odd col-xs-12']//child::a[@href='/zahnpflege/zahnputztechnik-erwachsene/']")
		private static WebElement Diegang;
		
		@FindBy(xpath = "//a[text()='Zähne richtig putzen']")
		private static WebElement Diegang1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 first odd col-xs-12']//child::a[@href='/zahnpflege/zahnpflege-hilfsmittel/']")
		private static WebElement Hilfsmittel;
		
		@FindBy(xpath = "//a[text()='Zahnpflege-Hilfsmittel entdecken']")
		private static WebElement Hilfsmittel1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 first odd col-xs-12']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Parodontis;
		
		@FindBy(xpath = "//a[text()='Parodontitis vorbeugen']")
		private static WebElement Parodontis1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 first odd col-xs-12']//child::a[@href='/zahnpflege/empfindliche-zaehne/']")
		private static WebElement Zahne;
		
		@FindBy(xpath = "//a[text()='Empfindliche Zähne richtig pflegen']")
		private static WebElement Zahne1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement Kindern;
		
		@FindBy(xpath = "//a[text()='Kinderzähne richtig putzen']")
		private static WebElement Kindern1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/zahnpflege-bei-festen-zahnspangen/']")
		private static WebElement festsitzenden;
		
		@FindBy(xpath = "//a[text()='Richtig zähneputzen mit Zahnspange']")
		private static WebElement festsitzenden1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/zahnpflege-bei-zahnersatz/']")
		private static WebElement Stichwort;
		
		@FindBy(xpath = "//a[text()='Zähne pflegen mit Zahnersatz']")
		private static WebElement Stichwort1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/kinderzahnentwicklung/']")
		private static WebElement gebissentwicklung;
		
		@FindBy(xpath = "//a[text()='Kinderzähne richtig pflegen']")
		private static WebElement gebissentwicklung1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement kaimethode;
		
		@FindBy(xpath = "//a[text()='Natürliches Zahnweiß schützen']")
		private static WebElement kaimethode1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/mundgeruch/']")
		private static WebElement mundgeruch;
		
		@FindBy(xpath = "(//a[@href='/zahnpflege/mundgeruch/'])[5]")
		private static WebElement mundgeruch1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/ernaehrung-und-zaehne/']")
		private static WebElement Ernahrung;
		
		@FindBy(xpath = "//a[text()='Zahngesund ernähren']")
		private static WebElement Ernahrung1;
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd col-xs-12']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Karies;
		
		@FindBy(xpath = "//a[text()='Vor Karies schützen']")
		private static WebElement Karies1;
		
		
		
		
		
		
		
		
		
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
		
					public void clickonDiegang() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Diegang);
						clickElementUsingJavaScript(Diegang);
						pageLoad();
					}
	
					public void clickonDiegang1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Diegang1);
						clickElementUsingJavaScript(Diegang1);
						pageLoad();
					}
					public void clickonHilfsmittel() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Hilfsmittel);
						clickElementUsingJavaScript(Hilfsmittel);
						pageLoad();
					}
					public void clickonHilfsmittel1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Hilfsmittel1);
						clickElementUsingJavaScript(Hilfsmittel1);
						pageLoad();
					}
					public void clickonParodontis() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Parodontis);
						clickElementUsingJavaScript(Parodontis);
						pageLoad();
					}
					public void clickonParodontis1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Parodontis1);
						clickElementUsingJavaScript(Parodontis1);
						pageLoad();
					}
					public void clickonZahne() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Zahne);
						clickElementUsingJavaScript(Zahne);
						pageLoad();
					}
					public void clickonZahne1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Zahne1);
						clickElementUsingJavaScript(Zahne1);
						pageLoad();
					}
					public void clickonKindern() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Kindern);
						clickElementUsingJavaScript(Kindern);
						pageLoad();
					}
					public void clickonKindern1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Kindern1);
						clickElementUsingJavaScript(Kindern1);
						pageLoad();
					}
					public void clickonfestsitzenden() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(festsitzenden);
						clickElementUsingJavaScript(festsitzenden);
						pageLoad();
					}
					public void clickonfestsitzenden1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(festsitzenden1);
						clickElementUsingJavaScript(festsitzenden1);
						pageLoad();
					}
					public void clickonStichwort() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Stichwort);
						clickElementUsingJavaScript(Stichwort);
						pageLoad();
					}
					public void clickonStichwort1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Stichwort1);
						clickElementUsingJavaScript(Stichwort1);
						pageLoad();
					}
					public void clickongebissentwicklung() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(gebissentwicklung);
						clickElementUsingJavaScript(gebissentwicklung);
						pageLoad();
					}
					public void clickongebissentwicklung1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(gebissentwicklung1);
						clickElementUsingJavaScript(gebissentwicklung1);
						pageLoad();
					}
					public void clickonkaimethode() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(kaimethode);
						clickElementUsingJavaScript(kaimethode);
						pageLoad();
					}
					public void clickonkaimethode1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(kaimethode1);
						clickElementUsingJavaScript(kaimethode1);
						pageLoad();
					}
					public void clickonMundgeruch() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(mundgeruch);
						clickElementUsingJavaScript(mundgeruch);
						pageLoad();
					}
					public void clickonMundgeruch1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(mundgeruch1);
						clickElementUsingJavaScript(mundgeruch1);
						pageLoad();
					}
					public void clickonErnahrung() throws Exception {
						waitForPageLoadJava();
						//scrollDownUsingElement(Ernahrung);
						clickElementUsingJavaScript(Ernahrung);
						pageLoad();
					}
					public void clickonErnahrung1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Ernahrung1);
						clickElementUsingJavaScript(Ernahrung1);
						pageLoad();
					}
					public void clickonKaires() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Karies);
						clickElementUsingJavaScript(Karies);
						pageLoad();
					}
					public void clickonKaires1() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Karies1);
						clickElementUsingJavaScript(Karies1);
						pageLoad();
					}
					
					
					
					
					
					
					
					
					
					
					
					
					

}
