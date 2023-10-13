package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaHomepagePage extends BaseClass{
	
	public AbrevaHomepagePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
			
		@FindBy(xpath = "(//div[@class='richText component section abreva-txt first odd alpha']//a[@href='/cold-sore-products/abreva-cream/'])[1]")
		private static WebElement Abreva_creame1;		
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[@class='managing-img-txt']")
		private static WebElement Abreva_creame1_txt;		
	
		@FindBy(xpath = "(//div[@class='richText component section abreva-txt first odd alpha']//a[@href='/cold-sore-products/abreva-cream/'])[2]")
		private static WebElement Abreva_creame2;		
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[@class='managing-img-txt']")
		private static WebElement Abreva_creame2_txt;	
	
		@FindBy(xpath = "//a[text()='dealing with cold sores ']")
		private static WebElement dealingwithcoldsores;	
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='MANAGING LIP HEALTH']")
		private static WebElement dealingwithcoldsores_txt;	
	
		@FindBy(xpath = "//a[text()='cold sore treatment']")
		private static WebElement coldsoretreatment;	
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='ABOUT COLD SORES']")
		private static WebElement coldsoretreatment_txt;	
	
		@FindBy(xpath = "//div[@class='richText component section abreva-txt even last alpha']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement Abrevacreame;	
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[@class='managing-img-txt']")
		private static WebElement Abrevacreame_txt;	
	
		@FindBy(xpath = "//span[text()='LEARN MORE']")
		private static WebElement learnmore;	
	
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement learnmore_txt;	
	
		@FindBy(xpath = "//li[@class='carousel-nav-item is-active']")
		private static WebElement Carousel1;	
	
		@FindBy(xpath = "//a[text()='VIEW COLD SORE STAGES']")
		private static WebElement Viewcoldsore;	
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='ABOUT COLD SORES']")
		private static WebElement Viewcoldsore_txt;	
		
		@FindBy(xpath = "//li[@class='carousel-nav-item is-active']")
		private static WebElement Carousel2;	
		
		@FindBy(xpath = "//span[text()='WHAT CAN TRIGGER A COLD SORE?']")
		private static WebElement Triggercoldsore;	
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='MANAGING LIP HEALTH']")
		private static WebElement Triggercoldsore_txt;	
		
		@FindBy(xpath = "//div[@class='richText component section get-tough-on-cold-sores_banner-text even alpha']//a[@href='/cold-sore-first-signs/']")
		private static WebElement gettouchcoldsores;	
		
		@FindBy(xpath = "//h1[text()='ABREVA CAN GET RID OF COLD SORES IN 2.5 DAYS* SO YOU CAN GET BACK TO BEING YOU.']")
		private static WebElement gettouchcoldsores_txt;	
		
		@FindBy(xpath = "//a[@href='/cold-sore-products/abreva-reviews/']")
		private static WebElement ReadReviews;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement ReadReviews_txt;
		
		@FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/spreading-cold-sores/']")
		private static WebElement RelatedArticle1;
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//p[@class='h2-subheading']")
		private static WebElement RelatedArticle1_txt;
		
		@FindBy(xpath = "//a[text()='How to treat cold sores']")
		private static WebElement RelatedArticle2;
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='MANAGING LIP HEALTH']")
		private static WebElement RelatedArticle2_txt;
		
		@FindBy(xpath = "//a[text()='Cold sore trigger quiz']")
		private static WebElement RelatedArticle3;
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[@class='managing-img-txt']")
		private static WebElement RelatedArticle3_txt;
		
		@FindBy(xpath = "//a[@href='/coupon/?get_abreva_coupon']")
		private static WebElement getabrevacoupons;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getabrevacoupons_txt;
		
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
		public void clickonAbrevaCreame1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Abreva_creame1);
			moveToElement(Abreva_creame1);
			clickElementUsingJavaScript(Abreva_creame1);
			visibilityOf(Abreva_creame1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abreva_creame1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abreva_creame1_txt));
			pageLoad();
		}
		public void clickonAbrevaCreame2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Abreva_creame2);
			moveToElement(Abreva_creame2);
			clickElementUsingJavaScript(Abreva_creame2);
			visibilityOf(Abreva_creame2_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abreva_creame2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abreva_creame2_txt));
			pageLoad();
		}
		public void clickonDealingwithcoldsores() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(dealingwithcoldsores);
			moveToElement(dealingwithcoldsores);
			clickElementUsingJavaScript(dealingwithcoldsores);
			visibilityOf(dealingwithcoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(dealingwithcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingwithcoldsores_txt));
			pageLoad();
		}
		public void clickonColdsoreTreatment() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(coldsoretreatment);
			moveToElement(coldsoretreatment);
			clickElementUsingJavaScript(coldsoretreatment);
			visibilityOf(coldsoretreatment_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoretreatment_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoretreatment_txt));
			pageLoad();
		}
		public void clickonAbrevacreame3() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Abrevacreame);
			moveToElement(Abrevacreame);
			clickElementUsingJavaScript(Abrevacreame);
			visibilityOf(Abrevacreame_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abrevacreame_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abrevacreame_txt));
			pageLoad();
		}
		public void clickonLearnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(learnmore);
			moveToElement(learnmore);
			clickElementUsingJavaScript(learnmore);
			visibilityOf(learnmore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(learnmore_txt));
			pageLoad();
		}
		public void clickonCarousel1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Carousel1);
			clickElementUsingJavaScript(Carousel1);
			implicitWait();
			//visibilityOf(Viewcoldsore);
			clickElementUsingJavaScript(Viewcoldsore);
			visibilityOf(Viewcoldsore_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(Viewcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Viewcoldsore_txt));
			pageLoad();
		}
		public void clickonCarousel2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Carousel2);
			clickElementUsingJavaScript(Carousel2);
			implicitWait();
			//visibilityOf(Viewcoldsore);
			clickElementUsingJavaScript(Triggercoldsore);
			visibilityOf(Triggercoldsore_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(Triggercoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Triggercoldsore_txt));
			pageLoad();
		}
		public void clickonGetTouchcoldsores() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(gettouchcoldsores);
			clickElementUsingJavaScript(gettouchcoldsores);
			visibilityOf(gettouchcoldsores_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(gettouchcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(gettouchcoldsores_txt));
			pageLoad();
		}
		public void clickonReadReviews() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(ReadReviews);
			clickElementUsingJavaScript(ReadReviews);
			visibilityOf(ReadReviews_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(ReadReviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ReadReviews_txt));
			pageLoad();
		}
		public void clickonRelatedArticle1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle1);
			//moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle1);
			visibilityOf(RelatedArticle1_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle1_txt));
			pageLoad();
		}
		public void clickonRelatedArticle2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle2);
			//moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle2);
			visibilityOf(RelatedArticle2_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle2_txt));
			pageLoad();
		}
		public void clickonRelatedArticle3() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle3);
			//moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle3);
			visibilityOf(RelatedArticle3_txt);		
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle3_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle3_txt));
			pageLoad();
		}
		public void clickonGetAbrevaCoupons() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(getabrevacoupons);
			if (isElementPresent(getabrevacoupons)) {
				clickElementUsingJavaScript(getabrevacoupons);
				visibilityOf(getabrevacoupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(getabrevacoupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				
			} else {
				throw new Exception("GeT Abreva Coupons is not Displayed on Page");
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
			implicitWait();
			clickElementUsingJavaScript(BuyNow_Close);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
