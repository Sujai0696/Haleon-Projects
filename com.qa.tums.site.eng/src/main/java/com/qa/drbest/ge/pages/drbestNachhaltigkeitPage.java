package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestNachhaltigkeitPage extends BaseClass{
	
	public drbestNachhaltigkeitPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;			
	
		@FindBy(xpath = "//div[@class='image component section image-with-content first odd col-xs-12 col-md-6']//img")
		private static WebElement Bambus;			
	
		@FindBy(xpath = "//div[@class='image component section image-with-content even last col-xs-12 col-md-6']//img")
		private static WebElement Biokunststoff;		
	
		@FindBy(xpath = "//div[@class='image component section image-with-content first odd col-xs-12 col-md-6 col-lg-6 col-lg-offset-0']//img")
		private static WebElement Verpackung;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_Green_Sensitive']//img")
		private static WebElement greensensitive;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_Green_Sensitive']//child::a[text()='Mehr erfahren']")
		private static WebElement greensensitiveProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_Green_Sensitive']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement greensensitiveBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent_kids']//img")
		private static WebElement BambusKids;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent_kids']//child::a[text()='Mehr erfahren']")
		private static WebElement BambusKidsProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent_kids']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement BambusKidsBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent']//img")
		private static WebElement BambusInterdent;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent']//child::a[text()='Mehr erfahren']")
		private static WebElement BambusInterdentProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_bambus_interdent']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement BambusInterdentBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//img")
		private static WebElement greenclean;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//child::a[text()='Mehr erfahren']")
		private static WebElement greencleanProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet odd col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement greencleanBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//img")
		private static WebElement InterdentalBursten;
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//child::a[text()='Mehr erfahren']")
		private static WebElement InterdentalBurstenProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement InterdentalBurstenBuyNow;
		
		@FindBy(xpath = "//div[@class='title-content']//button")
		private static WebElement youtubebtn;
		
		@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']//child::button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
		private static WebElement visibilityVideo;
		
		
		@FindBy(xpath = "//div[@class='video-content']")
		private static WebElement thumbnailIcon;
		
		@FindBy(xpath = "//iframe[@id='ytplayer']")
		private static WebElement iframe;
	
		@FindBy(xpath = "//div[@id='movie_player']")
		private static WebElement youtubeplay;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
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
		public void ClickonBambus() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Bambus);
			visibilityOf(Bambus);
			clickElementUsingJavaScript(Bambus);
			pageLoad();
		}
		public void ClickonBiokunstoff() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Biokunststoff);
			visibilityOf(Biokunststoff);
			clickElementUsingJavaScript(Biokunststoff);
			pageLoad();
		}
		public void ClickonVerpackung() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Verpackung);
			visibilityOf(Verpackung);
			clickElementUsingJavaScript(Verpackung);
			pageLoad();
		}
		public void ClickonYouTubeButton() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(youtubebtn);
			clickElementUsingJavaScript(youtubebtn);
			Thread.sleep(1000);
			
			switchToFrameUsingElement(iframe);
			//visibilityOf(visibilityVideo);
			Thread.sleep(1000);
			visibilityOf(visibilityVideo);
			boolean elementIsDisplayed=elementIsDisplayed(visibilityVideo);
			Assert.assertTrue(elementIsDisplayed);
			//visibilityOf(youtubeplay);
			clickElementUsingJavaScript(youtubeplay);
			frameSwitchingToDefaultContent();
			pageLoad();
		}
		
		
		
		
		
		
		public void ClickonGreenSensitive() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greensensitive);
			visibilityOf(greensensitive);
			clickElementUsingJavaScript(greensensitive);
			pageLoad();
		}
		public void ClickonGreenSensitiveProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greensensitiveProduct);
			visibilityOf(greensensitiveProduct);
			clickElementUsingJavaScript(greensensitiveProduct);
			pageLoad();
		}
		public void ClickonGreenSensitiveBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greensensitiveBuyNow);
			moveToElement(greensensitiveBuyNow);
			if (isElementPresent(greensensitiveBuyNow)) {
				actionClick(greensensitiveBuyNow);
			} else {
				throw new Exception("greensensitiveBuyNow is not Displayed");
			}
			pageLoad();
		}
		public void ClickonBambusKids() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusKids);
			visibilityOf(BambusKids);
			clickElementUsingJavaScript(BambusKids);
			pageLoad();
		}
		public void ClickonBambusKidsProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusKidsProduct);
			visibilityOf(BambusKidsProduct);
			clickElementUsingJavaScript(BambusKidsProduct);
			pageLoad();
		}
		public void ClickonBambusKidsBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusKidsBuyNow);
			moveToElement(BambusKidsBuyNow);
			if (isElementPresent(BambusKidsBuyNow)) {
				actionClick(BambusKidsBuyNow);
			} else {
				throw new Exception("BambusKidsBuyNow is not Displayed");
			}
			pageLoad();
		}
		public void ClickonBambusInterdent() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusInterdent);
			visibilityOf(BambusInterdent);
			clickElementUsingJavaScript(BambusInterdent);
			pageLoad();
		}
		public void ClickonBambusInterdentProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusInterdentProduct);
			visibilityOf(BambusInterdentProduct);
			clickElementUsingJavaScript(BambusInterdentProduct);
			pageLoad();
		}
		public void ClickonBambusInterdentBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(BambusInterdentBuyNow);
			moveToElement(BambusInterdentBuyNow);
			if (isElementPresent(BambusInterdentBuyNow)) {
				actionClick(BambusInterdentBuyNow);
			} else {
				throw new Exception("BambusInterdentBuyNow is not Displayed");
			}
			pageLoad();
		}
		public void ClickonGreenClean() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greenclean);
			visibilityOf(greenclean);
			clickElementUsingJavaScript(greenclean);
			pageLoad();
		}
		public void ClickonGreenCleanProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greencleanProduct);
			visibilityOf(greencleanProduct);
			clickElementUsingJavaScript(greencleanProduct);
			pageLoad();
		}
		public void ClickonGreenCleanBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(greencleanBuyNow);
			moveToElement(greencleanBuyNow);
			if (isElementPresent(greencleanBuyNow)) {
				actionClick(greencleanBuyNow);
			} else {
				throw new Exception("greencleanBuyNow is not Displayed");
			}
			pageLoad();
		}
		public void ClickonInterdentalBursten() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(InterdentalBursten);
			visibilityOf(InterdentalBursten);
			clickElementUsingJavaScript(InterdentalBursten);
			pageLoad();
		}
		public void ClickonInterdentalBurstenProduct() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(InterdentalBurstenProduct);
			visibilityOf(InterdentalBurstenProduct);
			clickElementUsingJavaScript(InterdentalBurstenProduct);
			pageLoad();
		}
		public void ClickonInterdentalBurstenBuyNow() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(InterdentalBurstenBuyNow);
			moveToElement(InterdentalBurstenBuyNow);
			if (isElementPresent(InterdentalBurstenBuyNow)) {
				actionClick(InterdentalBurstenBuyNow);
			} else {
				throw new Exception("InterdentalBurstenBuyNow is not Displayed");
			}
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		

}
