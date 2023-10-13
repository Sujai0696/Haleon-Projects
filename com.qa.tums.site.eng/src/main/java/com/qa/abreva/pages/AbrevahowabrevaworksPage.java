package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevahowabrevaworksPage extends BaseClass{
	
	public AbrevahowabrevaworksPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[text()='ABREVA PRODUCTS ']")
		private static WebElement abrevaproducts;	
	
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement abrevaproducts_txt;
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/how-abreva-cream-works/']")
		private static WebElement howabrevaworks;
	
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement howabrevaworks_txt;
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/how-to-use-abreva-cream/']")
		private static WebElement useabrevacream;
	
		@FindBy(xpath = "//h1[text()='HOW TO USE ABREVA CREAM TO TREAT COLD SORES']")
		private static WebElement useabrevacream_txt;
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/abreva-reviews/']")
		private static WebElement abrevareviews;
	
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement abrevareviews_txt;
	
		@FindBy(xpath = "//div[@class='richText component section abreva-text abreva-works-txt first odd']//a[@href='/cold-sore-first-signs/']")
		private static WebElement sorecomingon;
	
		@FindBy(xpath = "//h1[@class='letter-spacing-0 word-spacing-0 line-height-1-2']")
		private static WebElement sorecomingon_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/5-ways-to-get-rid-of-a-cold-sore/']")
		private static WebElement getridcoldsore;
	
		@FindBy(xpath = "//h1[text()='How to Get Rid of a Cold Sore Fast']")
		private static WebElement getridcoldsore_txt;
	
		@FindBy(xpath = "//div[@style='height: 368px; display: none;']")
		private static WebElement youtube_display;
	
		@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
		private static WebElement youtube_thumbnailplay;
	
		@FindBy(xpath = "(//div[@class='box component section main-box odd last']//img)[1]")
		private static WebElement youtubebtn;
		
		@FindBy(xpath = "//iframe[@id='videoFrame']")
		private static WebElement iframe;
		
		@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
		private static WebElement youtubeplay;
		
		@FindBy(xpath = "//a[@href='#footnote8-ref']")
		private static WebElement arrow1;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement arrow1_txt;
		
		@FindBy(xpath = "//a[@href='#footnote9-ref']")
		private static WebElement arrow2;
		
		@FindBy(xpath = "//h2[text()='ACT ON IT WITH ABREVA']")
		private static WebElement arrow2_txt;
		
		@FindBy(xpath = "//span[text()='GET COUPON']")
		private static WebElement getcoupons;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;
		
		@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement BuyNow;
		
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement BuyNow_txt;
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNow_Close;
		
		
		
		
		
		
		
	
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
		public void clickonAbrevaproducts() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevaproducts);
			clickElementUsingJavaScript(abrevaproducts);
			visibilityOf(abrevaproducts_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevaproducts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevaproducts_txt));
			pageLoad();
		}
		public void clickonHowAbrevaWorks() throws Exception {	
			waitForPageLoadJava();
			moveToElement(howabrevaworks);
			elementToBeClickable(howabrevaworks);
			visibilityOf(howabrevaworks_txt);
			boolean elementIsDisplayed=elementIsDisplayed(howabrevaworks_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howabrevaworks_txt));
			pageLoad();
		}
		public void clickonUseAbrevaCream() throws Exception {	
			waitForPageLoadJava();
			moveToElement(useabrevacream);
			clickElementUsingJavaScript(useabrevacream);
			visibilityOf(useabrevacream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(useabrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(useabrevacream_txt));
			pageLoad();
		}
		public void clickonReviews() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevareviews);
			clickElementUsingJavaScript(abrevareviews);
			visibilityOf(abrevareviews_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevareviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevareviews_txt));
			pageLoad();
		}
		public void clickonSoreComingon() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(sorecomingon);
			clickElementUsingJavaScript(sorecomingon);
			visibilityOf(sorecomingon_txt);
			boolean elementIsDisplayed=elementIsDisplayed(sorecomingon_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(sorecomingon_txt));
			pageLoad();
		}
		public void clickongetridcoldsore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(getridcoldsore);
			clickElementUsingJavaScript(getridcoldsore);
			visibilityOf(getridcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(getridcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getridcoldsore_txt));
			pageLoad();
		}
		public void clickonYouTube() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(youtubebtn);
			actionClick(youtubebtn);
			visibilityOf(iframe);
			switchToFrameUsingElement(iframe);
			elementToBeClickable(youtube_thumbnailplay);
			//actionClick(youtube_thumbnailplay);
			//moveToElement(youtube_thumbnailplay);
			boolean elementIsDisplayed=elementIsDisplayed(youtube_thumbnailplay);
			Assert.assertTrue(elementIsDisplayed);
			
			actionClick(youtubeplay);
			frameSwitchingToDefaultContent();
			pageLoad();
		}
		public void clickonArrow1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(arrow1);
			clickElementUsingJavaScript(arrow1);
			scrollupUsingElement(arrow1_txt);
			visibilityOf(arrow1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(arrow1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(arrow1_txt));
			pageLoad();
		}
		public void clickonArrow2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(arrow2);
			clickElementUsingJavaScript(arrow2);
			scrollupUsingElement(arrow2_txt);
			visibilityOf(arrow2_txt);
			boolean elementIsDisplayed=elementIsDisplayed(arrow2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(arrow2_txt));
			pageLoad();
		}
		public void clickonGetCoupons() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(getcoupons);
			if (isElementPresent(getcoupons)) {
				clickElementUsingJavaScript(getcoupons);
				
				visibilityOf(getcoupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(getcoupons_txt));
			} else {
				throw new Exception("Get Coupons is not present on Page");
			}
			
			pageLoad();
		}
		public void clickonBuyNow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(BuyNow);
			clickElementUsingJavaScript(BuyNow);
			visibilityOf(BuyNow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(BuyNow_txt));
			clickElementUsingJavaScript(BuyNow_Close);
			pageLoad();
		}
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
