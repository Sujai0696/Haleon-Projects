package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestHomepagePage extends BaseClass{
	
	public drbestHomepagePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//span[@class='dcarousel-dot dcarousel-active']")
		private static WebElement carouselActiveOne;	
	
		@FindBy(xpath = "//span[@data-index='1']")
		private static WebElement carouselOne;	
	
		@FindBy(xpath = "//img[@src='../../../../content/dam/cf-consumer-healthcare/drbest/master/homepage/green-sensitive/Green-Sensitive-Doctor.png']//parent::div")
		private static WebElement carouselproductone;	
	
		@FindBy(xpath = "//span[@class='dcarousel-dot dcarousel-active']")
		private static WebElement carouselActivetwo;	
	
		@FindBy(xpath = "//div[@class='dcarousel-slide dcarousel-slide-first-new']")
		private static WebElement carouselproducttwo;
	
		@FindBy(xpath = "//span[@data-index='2']")
		private static WebElement carouseltwo;
	
		@FindBy(xpath = "//span[@class='dcarousel-dot dcarousel-active']")
		private static WebElement carouselActivethree;
	
		@FindBy(xpath = "//img[@src='../../../../content/dam/cf-consumer-healthcare/drbest/master/homepage/sustainability-banner/footer-dt.png']")
		private static WebElement carouselproductthree;
	
		@FindBy(xpath = "//span[@class='dcarousel-dot']//self::span[@data-index='3']")
		private static WebElement carouselthree;
	
		@FindBy(xpath = "//span[@class='dcarousel-dot dcarousel-active']")
		private static WebElement carouselActivefour;
	
		@FindBy(xpath = "//span[@class='dcarousel-dot dcarousel-active']")
		private static WebElement carouselfour;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section element-margin-90 even col-xs-12 col-md-12 reference-video1']")
		private static WebElement carouselproductfour;
		
		
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
		
		@FindBy(xpath = "//div[@class='image component section image-margin-25 image-right-text zglazyload first odd col-xs-12 col-md-6']//child::a[text()='Zur Beratung']")
		private static WebElement zurBeratung;
		
		@FindBy(xpath = "(//div[@class='image component section image-left-text zglazyload even last col-xs-12 col-md-6']//child::a[@href='/drbest-forschung/'])[2]")
		private static WebElement drbestzur;
		
		
		
		@FindBy(xpath = "//div[@class='box component section default-style first odd last col-xs-12']")
		private static WebElement Youtubeplay;
		
		@FindBy(xpath = "//iframe[@width='1145']")
		private static WebElement iframeyoutube;
		
		@FindBy(xpath = "(//div[@class='ytp-cued-thumbnail-overlay']//child::div[@class='ytp-cued-thumbnail-overlay-image'])[1]")
		private static WebElement thumbnailIcon;
		
		@FindBy(xpath = "(//button[@title='Play (k)'])[1]")
		private static WebElement playbutton;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
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
			
		public void clickonCarouselOneProductcard() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselActiveOne)) {
				
				clickElementUsingJavaScript(carouselOne);
				visibilityOf(carouselActiveOne);
				boolean elementIsDisplayed=elementIsDisplayed(carouselActiveOne);
				Assert.assertTrue(elementIsDisplayed);
				//visibilityOf(carouselproductone);
				//clickElementUsingJavaScript(carouselproductone);
			} else {
				throw new Exception("Carousel one is not active on page");
			}
			
			pageLoad();
		}
		public void clickonCarouselTwoProductcard() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselActivetwo)) {
				
				clickElementUsingJavaScript(carouseltwo);
				visibilityOf(carouselActivetwo);
				boolean elementIsDisplayed=elementIsDisplayed(carouselActivetwo);
				Assert.assertTrue(elementIsDisplayed);
				visibilityOf(carouselproducttwo);
				clickElementUsingJavaScript(carouselproducttwo);
			} else {
				throw new Exception("Carousel  two is not active on page");
			}
			
			pageLoad();
		}
		public void clickonCarouselThreeProductcard() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselActivethree)) {
				//scrollDownUsingElement(carouselthree);
				clickElementUsingJavaScript(carouselthree);
				visibilityOf(carouselActivethree);
				boolean elementIsDisplayed=elementIsDisplayed(carouselActivethree);
				Assert.assertTrue(elementIsDisplayed);
				visibilityOf(carouselproductthree);
				clickElementUsingJavaScript(carouselproductthree);
			} else {
				throw new Exception("Carousel  three is not active on page");
			}
			
			pageLoad();
		}
		public void clickonCarouselFourProductcard() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselActivefour)) {
				//scrollDownUsingElement(carouselthree);
				clickElementUsingJavaScript(carouselfour);
				visibilityOf(carouselActivefour);
				boolean elementIsDisplayed=elementIsDisplayed(carouselActivefour);
				Assert.assertTrue(elementIsDisplayed);
				visibilityOf(carouselproductfour);
				clickElementUsingJavaScript(carouselproductfour);
			} else {
				throw new Exception("Carousel  four is not active on page");
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		


