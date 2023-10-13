package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsorestagesPage extends BaseClass{
	
	public AbrevacoldsorestagesPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section default-style first odd initialized']//a[@href='/managing-lip-health/cold-sore-triggers/']")
		private static WebElement managingliphealth;		
	
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement managingliphealth_txt;
	
		@FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']")
		private static WebElement dealingcoldsores;
	
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsores_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/lip-care/']")
		private static WebElement lipcare;
	
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lipcare_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/cold-sores-and-stress/']")
		private static WebElement stresscoldsore;
	
		@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
		private static WebElement stresscoldsore_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/common-lip-problems/']")
		private static WebElement lipproblem;
	
		@FindBy(xpath = "//h1[text()='Common Lip Problems']")
		private static WebElement lipproblem_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/can-you-put-aloe-vera-on-cold-sores/']")
		private static WebElement aloveracoldsore;
	
		@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
		private static WebElement aloveracoldsore_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/why-do-i-keep-getting-cold-sores/']")
		private static WebElement recurringcoldsore;
		
		@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
		private static WebElement recurringcoldsore_txt;
		
		@FindBy(xpath = "//u[text()='Dealing with Cold Sores']")
		private static WebElement backsore;
		
		@FindBy(xpath = "//div[@class='richText component section spread-carousel-txt first odd last grid_4 omega']//a[@href='/managing-lip-health/cold-sore-triggers/']")
		private static WebElement coldsoretriggers;
		
		@FindBy(xpath = "(//span[text()='MANAGING LIP HEALTH'])[1]")
		private static WebElement coldsoretriggers_txt;
		
		@FindBy(xpath = "//div[@class='richText component section spread-carousel-txt first odd last grid_4 omega']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement Abrevacream;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement Abrevacream_txt;
		
		@FindBy(xpath = "(//a[@href='/managing-lip-health/lip-care/'])[2]")
		private static WebElement lipcare1;
		
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lipcare1_txt;
		
		@FindBy(xpath = "//a[text()='WEATHER THE WINTER ']")
		private static WebElement weatherwinter;
		
		@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
		private static WebElement weatherwinter_txt;
		
		@FindBy(xpath = "//a[text()='COLD SORE CONFIDENCE']")
		private static WebElement coldsoreconfidence;
		
		@FindBy(xpath = "//h1[text()='Cold Sores and Confidence']")
		private static WebElement coldsoreconfidence_txt;
		
		@FindBy(xpath = "//a[text()='KNOCK OUT CHAPPED LIPS ']")
		private static WebElement knockoutchappedlip;
		
		@FindBy(xpath = "//h1[text()='Hydrate and Heal Chapped Lips']")
		private static WebElement knockoutchappedlip_txt;
		
		@FindBy(xpath = "//span[text()='GET COUPON']")
		private static WebElement getcoupons;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;
		
		@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement BuyNow1;
		
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement BuyNow1_txt;
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNow1_Close;
		
		
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
				public void clickonManaginglipHealth() throws Exception {	
					waitForPageLoadJava();
					moveToElement(managingliphealth);
					clickElementUsingJavaScript(managingliphealth);
					visibilityOf(managingliphealth_txt);
					boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(managingliphealth_txt));
					pageLoad();
				}
				public void clickonDealingcoldsores() throws Exception {	
					waitForPageLoadJava();
					moveToElement(dealingcoldsores);
					clickElementUsingJavaScript(dealingcoldsores);
					visibilityOf(dealingcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(dealingcoldsores_txt));
					pageLoad();
				}
				public void clickonlipcare() throws Exception {	
					waitForPageLoadJava();
					moveToElement(lipcare);
					clickElementUsingJavaScript(lipcare);
					visibilityOf(lipcare_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipcare_txt));
					pageLoad();
				}
				public void clickonStresscoldsore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(stresscoldsore);
					clickElementUsingJavaScript(stresscoldsore);
					visibilityOf(stresscoldsore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(stresscoldsore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(stresscoldsore_txt));
					pageLoad();
				}
				public void clickonLipProblem() throws Exception {	
					waitForPageLoadJava();
					moveToElement(lipproblem);
					clickElementUsingJavaScript(lipproblem);
					scrollDownUsingElement(lipproblem_txt);
					visibilityOf(lipproblem_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipproblem_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipproblem_txt));
					pageLoad();
				}
				public void clickonAloveracolssore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(aloveracoldsore);
					clickElementUsingJavaScript(aloveracoldsore);
					scrollDownUsingElement(aloveracoldsore_txt);
					visibilityOf(aloveracoldsore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(aloveracoldsore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(aloveracoldsore_txt));
					pageLoad();
				}
				public void clickonRecurringcoldsore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(recurringcoldsore);
					clickElementUsingJavaScript(recurringcoldsore);
					scrollDownUsingElement(recurringcoldsore_txt);
					visibilityOf(recurringcoldsore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(recurringcoldsore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(recurringcoldsore_txt));
					pageLoad();
				}
				public void clickonbacksore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(backsore);
					clickElementUsingJavaScript(backsore);
					pageLoad();
				}
				public void clickonColdsoretriggers() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoretriggers);
					moveToElement(coldsoretriggers);
					clickElementUsingJavaScript(coldsoretriggers);
					visibilityOf(coldsoretriggers_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoretriggers_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoretriggers_txt));
					pageLoad();
				}
				public void clickonAbrevacReam() throws Exception {	
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
				public void clickonLipCare1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lipcare1);
					//moveToElement(lipcare1);
					clickElementUsingJavaScript(lipcare1);
					scrollDownUsingElement(lipcare1_txt);
					visibilityOf(lipcare1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipcare1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipcare1_txt));
					pageLoad();
				}
				public void clickonWeatherWinter() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(weatherwinter);
					moveToElement(weatherwinter);
					clickElementUsingJavaScript(weatherwinter);
					scrollDownUsingElement(weatherwinter_txt);
					visibilityOf(weatherwinter_txt);
					boolean elementIsDisplayed=elementIsDisplayed(weatherwinter_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(weatherwinter_txt));
					pageLoad();
				}
				public void clickonColdSoreConfidence() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoreconfidence);
					moveToElement(coldsoreconfidence);
					clickElementUsingJavaScript(coldsoreconfidence);
					visibilityOf(coldsoreconfidence_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfidence_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoreconfidence_txt));
					pageLoad();
				}
				public void clickonknockoutchappedlips() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(knockoutchappedlip);
					moveToElement(knockoutchappedlip);
					clickElementUsingJavaScript(knockoutchappedlip);
					scrollDownUsingElement(knockoutchappedlip_txt);
					visibilityOf(knockoutchappedlip_txt);
					boolean elementIsDisplayed=elementIsDisplayed(knockoutchappedlip_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(knockoutchappedlip_txt));
					pageLoad();
				}
				public void clickonGetCoupons() throws Exception {	
					waitForPageLoadJava();
				//	scrollDownUsingElement(getcoupons);
					if (isElementPresent(getcoupons)) {
						clickElementUsingJavaScript(getcoupons);
						scrollDownUsingElement(getcoupons_txt);
						visibilityOf(getcoupons_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(getcoupons_txt));
					} else {
						throw new Exception("Get Coupons is not present on Page");
					}
					
					pageLoad();
				}
				public void clickonBuyNow1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow1);
					//moveToElement(BuyNow1);
					clickElementUsingJavaScript(BuyNow1);
					//scrollDownUsingElement(weatherwinter_txt);
					visibilityOf(BuyNow1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNow1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BuyNow1_txt));
					clickElementUsingJavaScript(BuyNow1_Close);
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

}
