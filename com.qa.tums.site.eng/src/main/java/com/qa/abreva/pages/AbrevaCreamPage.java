package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaCreamPage extends BaseClass{
	
	public AbrevaCreamPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
			
		@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement Abrevaproducts;		
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement Abrevaproducts_txt;
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//a[@href='/cold-sore-products/how-abreva-cream-works/']")
		private static WebElement Abrevacreameworks;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement Abrevacreameworks_txt;
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//a[@href='/cold-sore-products/how-to-use-abreva-cream/']")
		private static WebElement UseAbrevaCreame;
	
		@FindBy(xpath = "//h1[text()='HOW TO USE ABREVA CREAM TO TREAT COLD SORES']")
		private static WebElement UseAbrevaCreame_txt;
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/abreva-reviews/']")
		private static WebElement AbrevaReviews;
	
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement AbrevaReviews_txt;
	
		@FindBy(xpath = "//a[text()='Dealing with a cold sore']")
		private static WebElement Dealingcoldsore;
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='MANAGING LIP HEALTH']")
		private static WebElement Dealingcoldsore_txt;
	
		@FindBy(xpath = "//a[text()='what causes cold sores']")
		private static WebElement causescoldsores;
	
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='ABOUT COLD SORES']")
		private static WebElement causescoldsores_txt;
		
		@FindBy(xpath = "//a[text()='how they spread']")
		private static WebElement howtheyspread;
		
		@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
		private static WebElement howtheyspread_txt;
		
		@FindBy(xpath = "//a[text()='the best way to treat them']")
		private static WebElement bestwaytreatthem;
		
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement bestwaytreatthem_txt;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section bbuy-now-btn-id price-spider-product-button first odd grid_4 alpha reference-abreva-price-spider-button image']//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement BuyNow;
		
		@FindBy(xpath = "//h2[text()='Twin Pack Tube']")
		private static WebElement BuyNow_txt;
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNow_Close;
		
		@FindBy(xpath = "//button[text()='Write a review ']")
		private static WebElement writeReview;
		
		@FindBy(xpath = "//span[text()='My Review for Cream']")
		private static WebElement writeReview_txt;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd last alpha']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement Abrevacream;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement Abrevacream_txt;
		
		@FindBy(xpath = "//a[text()='natural remedies for cold sores']")
		private static WebElement naturalRemedies;
		
		@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
		private static WebElement naturalRemedies_txt;
		
		@FindBy(xpath = "//a[text()='difference between a cold sore and a pimple']")
		private static WebElement diffcoldsorepimple;
		
		@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
		private static WebElement diffcoldsorepimple_txt;
		
		@FindBy(xpath = "//a[text()='conceal a cold sore until it heals fully.']")
		private static WebElement concealcoldsore;
		
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement concealcoldsore_txt;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd last alpha']//a[@href='/where-to-buy/']")
		private static WebElement buyAbreva;
		
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement buyAbreva_txt;
		
		@FindBy(xpath = "//div[@class='box component section product-img-box even']//a[@href='/coupon/']")
		private static WebElement AbrevaCoupons;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement AbrevaCoupons_txt;
		
		@FindBy(xpath = "//a[text()='using Abreva Cream']")
		private static WebElement usingAbrevacream;
		
		@FindBy(xpath = "//h1[text()='How to Use Abreva Cold Sore Treatment']")
		private static WebElement usingAbrevacream_txt;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd last alpha']//a[@href='/cold-sore-products/abreva-reviews/']")
		private static WebElement Reviews;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement Reviews_txt;
		
		@FindBy(xpath = "//div[@class='box component section product-img-box even']//a[@href='/contact-us/']")
		private static WebElement ContactUs;
		
		@FindBy(xpath = "//h1[text()='Contact Us']")
		private static WebElement ContactUs_txt;
		
		@FindBy(xpath = "//a[text()='HOW IT WORKS']")
		private static WebElement howitworks;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement howitworks_txt;
		
		@FindBy(xpath = "//a[text()='HOW TO USE IT']")
		private static WebElement howtouseit;
		
		@FindBy(xpath = "//h1[text()='HOW TO USE ABREVA CREAM TO TREAT COLD SORES']")
		private static WebElement howtouseit_txt;
	
		@FindBy(xpath = "//a[text()='REVIEWS']")
		private static WebElement ReviewArticle;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement ReviewArticle_txt;
		
		@FindBy(xpath = "//span[text()='GET COUPON']")
		private static WebElement getcoupons;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style reference-abreva-price-spider-button fixedcomponent6 fixed-component image']//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement BuyNowArticle;
		
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement BuyNowArticle_txt;
		
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNowArticle_Close;
		
		@FindBy(xpath = "//a[@href='#footnote4-ref']")
		private static WebElement Arrow1;
		
		@FindBy(xpath = "//h2[@class='h3-text']")
		private static WebElement Arrow1_txt;
		
		@FindBy(xpath = "//a[@href='#footnote5-ref']")
		private static WebElement Arrow2;
		
		@FindBy(xpath = "//img[@title='Abreva Tube and Pump']")
		private static WebElement Arrow2_img;
		
		
		
		
	
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
			moveToElement(Abrevaproducts);
			clickElementUsingJavaScript(Abrevaproducts);
			visibilityOf(Abrevaproducts_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abrevaproducts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abrevaproducts_txt));
			pageLoad();
		}
		public void clickonAbrevaCreamWorks() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Abrevacreameworks);
			clickElementUsingJavaScript(Abrevacreameworks);
			visibilityOf(Abrevacreameworks_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abrevacreameworks_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abrevacreameworks_txt));
			pageLoad();
		}
		public void clickonUseAbrevaCream() throws Exception {	
			waitForPageLoadJava();
			moveToElement(UseAbrevaCreame);
			clickElementUsingJavaScript(UseAbrevaCreame);
			visibilityOf(UseAbrevaCreame_txt);
			boolean elementIsDisplayed=elementIsDisplayed(UseAbrevaCreame_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(UseAbrevaCreame_txt));
			pageLoad();
		}
		public void clickonAbrevaReviews() throws Exception {	
			waitForPageLoadJava();
			moveToElement(AbrevaReviews);
			clickElementUsingJavaScript(AbrevaReviews);
			visibilityOf(AbrevaReviews_txt);
			boolean elementIsDisplayed=elementIsDisplayed(AbrevaReviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AbrevaReviews_txt));
			pageLoad();
		}
		public void clickonDealingcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Dealingcoldsore);
			clickElementUsingJavaScript(Dealingcoldsore);
			visibilityOf(Dealingcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Dealingcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Dealingcoldsore_txt));
			pageLoad();
		}
		public void clickonCausesColdSores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(causescoldsores);
			clickElementUsingJavaScript(causescoldsores);
			visibilityOf(causescoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(causescoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(causescoldsores_txt));
			pageLoad();
		}
		public void clickonHowtheyspread() throws Exception {	
			waitForPageLoadJava();
			moveToElement(howtheyspread);
			clickElementUsingJavaScript(howtheyspread);
			visibilityOf(howtheyspread_txt);
			boolean elementIsDisplayed=elementIsDisplayed(howtheyspread_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howtheyspread_txt));
			pageLoad();
		}
		public void clickonBestwaytreatthem() throws Exception {	
			waitForPageLoadJava();
			moveToElement(bestwaytreatthem);
			clickElementUsingJavaScript(bestwaytreatthem);
			visibilityOf(bestwaytreatthem_txt);
			boolean elementIsDisplayed=elementIsDisplayed(bestwaytreatthem_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(bestwaytreatthem_txt));
			pageLoad();
		}
		
		public void clickonBuynow() throws Exception {	
			waitForPageLoadJava();
			moveToElement(BuyNow);
			if (isElementPresent(BuyNow)) {
				clickElementUsingJavaScript(BuyNow);
				visibilityOf(BuyNow_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(BuyNow_txt));
				//clickElementUsingJavaScript(BuyNow_Close);
				visibilityOf(BuyNow_Close);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(BuyNow_Close);
				
			} else {
				System.out.println("Buy Now Button is not Presented in the page");
				throw new Exception("Buy Now Button is not Presented in the page");
			}
		}
		public void clickonWriteReview() throws Exception {	
			waitForPageLoadJava();
			//moveToElement(writeReview);
			if (isElementPresent(writeReview)) {
				clickElementUsingJavaScript(writeReview);
				visibilityOf(writeReview_txt);
				boolean elementIsDisplayed=elementIsDisplayed(writeReview_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(writeReview_txt));
				
				
			} else {
				System.out.println("Write Review Button is not Presented in the page");
				throw new Exception("Write Review  Button is not Presented in the page");
			}
		}
		public void clickonAbrevaCreame() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Abrevacream);
			moveToElement(Abrevacream);
			clickElementUsingJavaScript(Abrevacream);
			visibilityOf(Abrevacream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abrevacream_txt));
			pageLoad();
		}
		public void clickonNaturalRemedies() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(naturalRemedies);
			moveToElement(naturalRemedies);
			clickElementUsingJavaScript(naturalRemedies);
			visibilityOf(naturalRemedies_txt);
			boolean elementIsDisplayed=elementIsDisplayed(naturalRemedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(naturalRemedies_txt));
			pageLoad();
		}
		public void clickonDiffColdsorePimple() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(diffcoldsorepimple);
			moveToElement(diffcoldsorepimple);
			clickElementUsingJavaScript(diffcoldsorepimple);
			visibilityOf(diffcoldsorepimple_txt);
			boolean elementIsDisplayed=elementIsDisplayed(diffcoldsorepimple_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(diffcoldsorepimple_txt));
			pageLoad();
		}
		public void clickonConcealColdsore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(concealcoldsore);
			moveToElement(concealcoldsore);
			clickElementUsingJavaScript(concealcoldsore);
			visibilityOf(concealcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(concealcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(concealcoldsore_txt));
			pageLoad();
		}
		public void clickonBuyAbreva() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(buyAbreva);
			moveToElement(buyAbreva);
			clickElementUsingJavaScript(buyAbreva);
			visibilityOf(buyAbreva_txt);
			boolean elementIsDisplayed=elementIsDisplayed(buyAbreva_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(buyAbreva_txt));
			pageLoad();
		}
		public void clickonAbrevaCoupons() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(AbrevaCoupons);
			moveToElement(AbrevaCoupons);
			if (isElementPresent(AbrevaCoupons)) {
				clickElementUsingJavaScript(AbrevaCoupons);
				//visibilityOf(AbrevaCoupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(AbrevaCoupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(AbrevaCoupons_txt));
				
			} else {
				System.out.println("Abreva Coupons  is not Presented in the page");
				throw new Exception("Abreva Coupons   is not Presented in the page");	
			}
			pageLoad();
		}
		public void clickonUsingAbrevaCream() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(usingAbrevacream);
			moveToElement(usingAbrevacream);
			clickElementUsingJavaScript(usingAbrevacream);
			visibilityOf(usingAbrevacream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(usingAbrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(usingAbrevacream_txt));
			pageLoad();
		}
		public void clickonReviews() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Reviews);
			moveToElement(Reviews);
			clickElementUsingJavaScript(Reviews);
			visibilityOf(Reviews_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Reviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Reviews_txt));
			pageLoad();
		}
		public void clickonContactUs() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(ContactUs);
			moveToElement(ContactUs);
			clickElementUsingJavaScript(ContactUs);
			visibilityOf(ContactUs_txt);
			boolean elementIsDisplayed=elementIsDisplayed(ContactUs_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ContactUs_txt));
			pageLoad();
		}
		public void clickonArrow1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Arrow1);
			moveToElement(Arrow1);
			clickElementUsingJavaScript(Arrow1);
			visibilityOf(Arrow1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Arrow1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Arrow1_txt));
			pageLoad();
		}
		public void clickonArrow2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Arrow2);
			moveToElement(Arrow2);
			clickElementUsingJavaScript(Arrow2);
			visibilityOf(Arrow2_img);
			boolean elementIsDisplayed=elementIsDisplayed(Arrow2_img);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Arrow2_img));
			pageLoad();
		}
		
		public void clickonHowitWorks() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(howitworks);
			moveToElement(howitworks);
			clickElementUsingJavaScript(howitworks);
			visibilityOf(howitworks_txt);
			boolean elementIsDisplayed=elementIsDisplayed(howitworks_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howitworks_txt));
			pageLoad();
		}
		public void clickonHowtouseit() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(howtouseit);
			moveToElement(howtouseit);
			clickElementUsingJavaScript(howtouseit);
			visibilityOf(howtouseit_txt);
			boolean elementIsDisplayed=elementIsDisplayed(howtouseit_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howtouseit_txt));
			pageLoad();
		}
		public void clickonReviewArticle() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(ReviewArticle);
			moveToElement(ReviewArticle);
			clickElementUsingJavaScript(ReviewArticle);
			visibilityOf(ReviewArticle_txt);
			boolean elementIsDisplayed=elementIsDisplayed(ReviewArticle_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ReviewArticle_txt));
			pageLoad();
		}
		public void clickonGetCoupons() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(getcoupons);
			//moveToElement(getcoupons);
			if (isElementPresent(getcoupons)) {
				clickElementUsingJavaScript(getcoupons);
				visibilityOf(getcoupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(getcoupons_txt));
				
			} else {
				System.out.println("Get Coupons  is not Presented in the page");
				throw new Exception("Get Coupons   is not Presented in the page");		
			}
			pageLoad();
		}
		public void clickonBuynowArticle() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(BuyNowArticle);
			moveToElement(BuyNowArticle);
			if (isElementPresent(BuyNowArticle)) {
				clickElementUsingJavaScript(BuyNowArticle);
				visibilityOf(BuyNowArticle_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNowArticle_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(BuyNowArticle_txt));
				//clickElementUsingJavaScript(BuyNow_Close);
				visibilityOf(BuyNowArticle_Close);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(BuyNowArticle_Close);
				
			} else {
				System.out.println("Buy Now Button is not Presented in the page");
				throw new Exception("Buy Now Button is not Presented in the page");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	

}
