package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevahowtouseAbrevacreamPage extends BaseClass{
	
	public AbrevahowtouseAbrevacreamPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[text()='ABREVA PRODUCTS ']")
		private static WebElement abrevaproducts;
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
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
	
		@FindBy(xpath = "//h2[@class='h3']")
		private static WebElement carousel_txt;
		
		@FindBy(xpath = "//span[text()='Next Slide']")
		private static WebElement arrow1;
		
		@FindBy(xpath = "(//h3[text()='Cover completely'])[1]")
		private static WebElement carouse2_txt;
		
		@FindBy(xpath = "//span[text()='Next Slide']")
		private static WebElement arrow2;
		
		@FindBy(xpath = "(//p[text()='Apply Abreva'])[3]")
		private static WebElement carouse3_txt;
		
		@FindBy(xpath = "//span[text()='Next Slide']")
		private static WebElement arrow3;
		
		@FindBy(xpath = "(//h3[text()='Use for 10 days max'])[1]")
		private static WebElement carouse4_txt;
		
	
		
		@FindBy(xpath = "//div[@class='richText component section tips-txt odd']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement abrevacream1;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream1_txt;
	
		@FindBy(xpath = "//a[text()='Dealing with cold sores']")
		private static WebElement dealingcoldsores;
	
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='spreading the infection']")
		private static WebElement spreadinginfection;
		
		@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
		private static WebElement spreadinginfection_txt;
		
		@FindBy(xpath = "//a[text()='Abreva® Cream']")
		private static WebElement abrevacream2;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream2_txt;
		
		@FindBy(xpath = "//a[text()='treat cold sores']")
		private static WebElement treatcoldsores;
		
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement treatcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='treatment of cold sores']")
		private static WebElement treatmentcoldsores;
		
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement treatmentcoldsores_txt;
		
		@FindBy(xpath = "(//a[@href='/cold-sore-products/abreva-cream/'])[6]")
		private static WebElement abrevacream3;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream3_txt;
		
		@FindBy(xpath = "//a[text()='buy Abreva']")
		private static WebElement buyabreva;
		
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement buyabreva_txt;
	
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
				public void clickonHowabrevaworks() throws Exception {	
					waitForPageLoadJava();
					moveToElement(howabrevaworks);
					clickElementUsingJavaScript(howabrevaworks);
					visibilityOf(howabrevaworks_txt);
					boolean elementIsDisplayed=elementIsDisplayed(howabrevaworks_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(howabrevaworks_txt));
					pageLoad();
				}
				public void clickonUseAbrevaCream() throws Exception {	
					waitForPageLoadJava();
					moveToElement(useabrevacream);
					elementToBeClickable(useabrevacream);
					//visibilityOf(useabrevacream_txt);
				
					visibilityOf(useabrevacream_txt);
					boolean elementIsDisplayed=elementIsDisplayed(useabrevacream_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(useabrevacream_txt));
					pageLoad();
				}
				public void clickonAbrevaReview() throws Exception {	
					waitForPageLoadJava();
					moveToElement(abrevareviews);
					clickElementUsingJavaScript(abrevareviews);
					visibilityOf(abrevareviews_txt);
					boolean elementIsDisplayed=elementIsDisplayed(abrevareviews_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(abrevareviews_txt));
					pageLoad();
				}
				public void clickonCarousel1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(carousel_txt);
					visibilityOf(carousel_txt);
					boolean elementIsDisplayed=elementIsDisplayed(carousel_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(carousel_txt));
					
					pageLoad();
				}
				public void clickonCarousel2() throws Exception {	
					waitForPageLoadJava();
					clickElementUsingJavaScript(arrow1);
					scrollDownUsingElement(carouse2_txt);
					visibilityOf(carouse2_txt);
					boolean elementIsDisplayed=elementIsDisplayed(carouse2_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(carouse2_txt));
					
					pageLoad();
				}
				public void clickonCarousel3() throws Exception {	
					waitForPageLoadJava();
					clickElementUsingJavaScript(arrow1);
					Thread.sleep(1000);
					clickElementUsingJavaScript(arrow2);
					Thread.sleep(1000);
					clickElementUsingJavaScript(arrow3);
					scrollDownUsingElement(carouse3_txt);
					visibilityOf(carouse3_txt);
					boolean elementIsDisplayed=elementIsDisplayed(carouse3_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(carouse3_txt));
					
					pageLoad();
				}
				public void clickonCarousel4() throws Exception {	
					waitForPageLoadJava();
					clickElementUsingJavaScript(arrow1);
					Thread.sleep(1000);
					clickElementUsingJavaScript(arrow2);
					Thread.sleep(1000);
					clickElementUsingJavaScript(arrow3);
					scrollDownUsingElement(carouse4_txt);
					visibilityOf(carouse4_txt);
					boolean elementIsDisplayed=elementIsDisplayed(carouse4_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(carouse4_txt));
					
					pageLoad();
				}
				public void clickonAbrevaCreame1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(abrevacream1);
					moveToElement(abrevacream1);
					clickElementUsingJavaScript(abrevacream1);
					visibilityOf(abrevacream1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(abrevacream1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(abrevacream1_txt));
					pageLoad();
				}
				public void clickonDealingcoldsores() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(dealingcoldsores);
					moveToElement(dealingcoldsores);
					clickElementUsingJavaScript(dealingcoldsores);
					visibilityOf(dealingcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(dealingcoldsores_txt));
					pageLoad();
				}
				public void clickonSpreadinginfection() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(spreadinginfection);
					moveToElement(spreadinginfection);
					clickElementUsingJavaScript(spreadinginfection);
					visibilityOf(spreadinginfection_txt);
					boolean elementIsDisplayed=elementIsDisplayed(spreadinginfection_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(spreadinginfection_txt));
					pageLoad();
				}
				public void clickonAbrevacream2() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(abrevacream2);
					moveToElement(abrevacream2);
					clickElementUsingJavaScript(abrevacream2);
					visibilityOf(abrevacream2_txt);
					boolean elementIsDisplayed=elementIsDisplayed(abrevacream2_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(abrevacream2_txt));
					pageLoad();
				}
				public void clickontreatcoldsores() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(treatcoldsores);
					moveToElement(treatcoldsores);
					clickElementUsingJavaScript(treatcoldsores);
					visibilityOf(treatcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(treatcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(treatcoldsores_txt));
					pageLoad();
				}
				public void clickontreatmentcoldsores() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(treatmentcoldsores);
					moveToElement(treatmentcoldsores);
					clickElementUsingJavaScript(treatmentcoldsores);
					visibilityOf(treatmentcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(treatmentcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(treatmentcoldsores_txt));
					pageLoad();
				}
				public void clickonAbrevacream3() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(abrevacream3);
					moveToElement(abrevacream3);
					clickElementUsingJavaScript(abrevacream3);
					visibilityOf(abrevacream3_txt);
					boolean elementIsDisplayed=elementIsDisplayed(abrevacream3_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(abrevacream3_txt));
					pageLoad();
				}
				public void clickonBuyAbreva() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(buyabreva);
					moveToElement(buyabreva);
					clickElementUsingJavaScript(buyabreva);
					visibilityOf(buyabreva_txt);
					boolean elementIsDisplayed=elementIsDisplayed(buyabreva_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(buyabreva_txt));
					pageLoad();
				}
				public void clickongetcoupons() throws Exception {	
					waitForPageLoadJava();
					//moveToElement(getcoupons);
					if (isElementPresent(getcoupons)) {
						clickElementUsingJavaScript(getcoupons);
						
						visibilityOf(getcoupons_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(getcoupons_txt));
						pageLoad();
					} else {
						throw new Exception("Get Coupons is not present on Preprod Url");
					}
					
				}			
				public void clickonBuyNow() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow);
					moveToElement(BuyNow);
					if (isElementPresent(BuyNow)) {
						clickElementUsingJavaScript(BuyNow);
						
						visibilityOf(BuyNow_txt);
						boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(BuyNow_txt));
						clickElementUsingJavaScript(BuyNow_Close);
						pageLoad();
					} else {
						throw new Exception("Buy Now is not present on Page");
					}
					
				}		
				
				
				
				
				
				
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
