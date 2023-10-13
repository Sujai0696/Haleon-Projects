package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaWheretobuyPage extends BaseClass{
	
	public AbrevaWheretobuyPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
			
		@FindBy(xpath = "(//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled'])[1]")
		private static WebElement BuyNow1;		
		
		@FindBy(xpath = "//h2[text()='Oral Care Tube']")
		private static WebElement BuyNow1_txt;	
	
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNow1_Close;	
	
		@FindBy(xpath = "(//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled'])[2]")
		private static WebElement BuyNow2;	
	
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement BuyNow2_txt;	
	
		@FindBy(xpath = "//a[text()='GET COUPON']")
		private static WebElement getcoupons;	
	
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;	
	
		@FindBy(xpath = "//span[text()='READ REVIEWS']")
		private static WebElement ReadReviews;	
	
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement ReadReviews_txt;	
	
	
	
	
	
	
	
	
	
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
				public void clickonBuyNow1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow1);
					moveToElement(BuyNow1);
					clickElementUsingJavaScript(BuyNow1);
					visibilityOf(BuyNow1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNow1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BuyNow1_txt));
					clickElementUsingJavaScript(BuyNow1_Close);
					pageLoad();
				}
				public void clickonBuyNow2() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow2);
					moveToElement(BuyNow2);
					clickElementUsingJavaScript(BuyNow2);
					visibilityOf(BuyNow2_txt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNow2_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BuyNow2_txt));
					refreshWebPage();
					//clickElementUsingJavaScript(BuyNow2_Close);
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
						pageLoad();
					} else {
						throw new Exception("GetCoupons Abreva is not present on Page");

					}
					
				}
				public void clickonReadReviews() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(ReadReviews);
					moveToElement(ReadReviews);
					clickElementUsingJavaScript(ReadReviews);
					visibilityOf(ReadReviews_txt);
					boolean elementIsDisplayed=elementIsDisplayed(ReadReviews_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(ReadReviews_txt));
					refreshWebPage();
					
					pageLoad();
				}
	
	
	
	
	
	
	

}
