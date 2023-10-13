package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsoretreatmentPage extends BaseClass{
	
	public AbrevacoldsoretreatmentPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[text()='ABOUT COLD SORES ']")
		private static WebElement aboutcoldsores;
	
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement aboutcoldsores_txt;
	
		@FindBy(xpath = "//a[text()='HOW COLD SORES SPREAD ']")
		private static WebElement coldsoresspread;
	
		@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
		private static WebElement coldsoresspread_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE TRIGGERS ']")
		private static WebElement coldsorestriggers;
	
		@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
		private static WebElement coldsorestriggers_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']")
		private static WebElement coldsorestreatment;
	
		@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt first odd']//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement coldsorestreatment_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE MYTHS ']")
		private static WebElement coldsorestmyths;
	
		@FindBy(xpath = "//h1[text()='Cold Sore Facts and Myths']")
		private static WebElement coldsorestmyths_txt;
	
		@FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']")
		private static WebElement takecarelips;
		
		@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
		private static WebElement takecarelips_txt;
		
		@FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']")
		private static WebElement coldsorepimple;
		
		@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
		private static WebElement coldsorepimple_txt;
		
		@FindBy(xpath = "//a[text()='TYPES OF COLD SORE MEDICINE ']")
		private static WebElement typescoldsoremedicine;
		
		@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
		private static WebElement typescoldsoremedicine_txt;
		
		@FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']")
		private static WebElement coldsoreteens;
		
		@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
		private static WebElement coldsoreteens_txt;
		
		@FindBy(xpath = "(//div[@class='richText component section abreva-text treatment-txt first odd']//a[@href='/cold-sore-products/abreva-cream/'])[1]")
		private static WebElement AbrevaCream;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement AbrevaCream_txt;
		
		@FindBy(xpath = "//a[text()='Manage your cold sore']")
		private static WebElement managecoldspore;
		
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement managecoldspore_txt;
		
		@FindBy(xpath = "//a[text()='Avoid spreading the virus as much as possible']")
		private static WebElement avoidspreadingvirus;
		
		@FindBy(xpath = "//h1[text()='Are Cold Sores Contagious?']")
		private static WebElement avoidspreadingvirus_txt;
		
		@FindBy(xpath = "//a[text()='Limit activities and stressors that could trigger another outbreak']")
		private static WebElement limitactivities;
		
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement limitactivities_txt;
		
		@FindBy(xpath = "(//div[@class='richText component section abreva-text treatment-txt first odd']//a[@href='/cold-sore-products/abreva-cream/'])[2]")
		private static WebElement applyabreva;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement applyabreva_txt;
		
		@FindBy(xpath = "//a[@href='#footnote28-ref']")
		private static WebElement Arrow1;
		
		@FindBy(xpath = "//h2[text()='How Soon Will I See Results?']")
		private static WebElement Arrow1_txt;
	
		@FindBy(xpath = "//a[@href='#footnote29-ref']")
		private static WebElement Arrow2;
		
		@FindBy(xpath = "//a[text()='blister']")
		private static WebElement blister;
		
		@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
		private static WebElement blister_txt;
		
		@FindBy(xpath = "(//div[@class='richText component section abreva-text treatment-txt first odd']//a[@href='/cold-sore-products/abreva-cream/'])[3]")
		private static WebElement Abrevacream1;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement Abrevacream1_txt;
		
		@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt odd alpha']//a[@href='/where-to-buy/']")
		private static WebElement wheretobuy;
		
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement wheretobuy_txt;
		
		@FindBy(xpath = "(//a[@href='/faq/abreva-basics/'])[3]")
		private static WebElement usingabreva;
		
		@FindBy(xpath = "//h1[text()='How to Use Abreva Cold Sore Treatment']")
		private static WebElement usingabreva_txt;
		
		@FindBy(xpath = "//a[text()='lip care tips']")
		private static WebElement lipcaretips;
		
		@FindBy(xpath = "//div[@class='imageCompatibleMarkup image section banner-img managing-banner-img first odd component']//span[text()='MANAGING LIP HEALTH']")
		private static WebElement lipcaretips_txt;
		
		@FindBy(xpath = "//a[text()='reviews']")
		private static WebElement reviews;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement reviews_txt;
		
		@FindBy(xpath = "//a[text()='contact us']")
		private static WebElement contactus;
		
		@FindBy(xpath = "//h1[text()='Contact Us']")
		private static WebElement contactus_txt;
		
		@FindBy(xpath = "//span[text()='WRITE A REVIEW']")
		private static WebElement writeReview;
		
		@FindBy(xpath = "//h1[text()='WRITE A REVIEW']")
		private static WebElement writeReview_txt;
		
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
				public void clickonAboutcoldsores() throws Exception {	
					waitForPageLoadJava();
					moveToElement(aboutcoldsores);
					clickElementUsingJavaScript(aboutcoldsores);
					visibilityOf(aboutcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(aboutcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(aboutcoldsores_txt));
					pageLoad();
				}
				public void clickonColdsoresspread() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsoresspread);
					clickElementUsingJavaScript(coldsoresspread);
					visibilityOf(coldsoresspread_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoresspread_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoresspread_txt));
					pageLoad();
				}
				public void clickonColdsorestriggers() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsorestriggers);
					clickElementUsingJavaScript(coldsorestriggers);
					visibilityOf(coldsorestriggers_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsorestriggers_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsorestriggers_txt));
					pageLoad();
				}
				public void clickonColdsorestreatment() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsorestreatment);
					elementToBeClickable(coldsorestreatment);
					visibilityOf(coldsorestreatment_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsorestreatment_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsorestreatment_txt));
					pageLoad();
				}
				public void clickonColdsoresmyths() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsorestmyths);
					clickElementUsingJavaScript(coldsorestmyths);
					visibilityOf(coldsorestmyths_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsorestmyths_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsorestmyths_txt));
					pageLoad();
				}
				public void clickontakecarelips() throws Exception {	
					waitForPageLoadJava();
					moveToElement(takecarelips);
					clickElementUsingJavaScript(takecarelips);
					scrollDownUsingElement(takecarelips_txt);
					visibilityOf(takecarelips_txt);
					boolean elementIsDisplayed=elementIsDisplayed(takecarelips_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(takecarelips_txt));
					pageLoad();
				}
				public void clickoncoldsorevspimple() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsorepimple);
					clickElementUsingJavaScript(coldsorepimple);
					scrollDownUsingElement(coldsorepimple_txt);
					visibilityOf(coldsorepimple_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsorepimple_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsorepimple_txt));
					pageLoad();
				}
				public void clickontypesofcoldsoresmedicine() throws Exception {	
					waitForPageLoadJava();
					moveToElement(typescoldsoremedicine);
					clickElementUsingJavaScript(typescoldsoremedicine);
					scrollDownUsingElement(typescoldsoremedicine_txt);
					visibilityOf(typescoldsoremedicine_txt);
					boolean elementIsDisplayed=elementIsDisplayed(typescoldsoremedicine_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(typescoldsoremedicine_txt));
					pageLoad();
				}
				public void clickonColdsoresteens() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsoreteens);
					clickElementUsingJavaScript(coldsoreteens);
					scrollDownUsingElement(coldsoreteens_txt);
					visibilityOf(coldsoreteens_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoreteens_txt));
					pageLoad();
				}
				public void clickonAbrevaCream() throws Exception {	
					waitForPageLoadJava();
					moveToElement(AbrevaCream);
					clickElementUsingJavaScript(AbrevaCream);
					scrollDownUsingElement(AbrevaCream_txt);
					visibilityOf(AbrevaCream_txt);
					boolean elementIsDisplayed=elementIsDisplayed(AbrevaCream_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(AbrevaCream_txt));
					pageLoad();
				}
				public void clickonManagecoldsore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(managecoldspore);
					clickElementUsingJavaScript(managecoldspore);
					scrollDownUsingElement(managecoldspore_txt);
					visibilityOf(managecoldspore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(managecoldspore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(managecoldspore_txt));
					pageLoad();
				}
				public void clickonAvoidspreadingvirus() throws Exception {	
					waitForPageLoadJava();
					moveToElement(avoidspreadingvirus);
					clickElementUsingJavaScript(avoidspreadingvirus);
					scrollDownUsingElement(avoidspreadingvirus_txt);
					visibilityOf(avoidspreadingvirus_txt);
					boolean elementIsDisplayed=elementIsDisplayed(avoidspreadingvirus_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(avoidspreadingvirus_txt));
					pageLoad();
				}
				public void clickonlimitActivites() throws Exception {	
					waitForPageLoadJava();
					moveToElement(limitactivities);
					clickElementUsingJavaScript(limitactivities);
					scrollDownUsingElement(limitactivities_txt);
					visibilityOf(limitactivities_txt);
					boolean elementIsDisplayed=elementIsDisplayed(limitactivities_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(limitactivities_txt));
					pageLoad();
				}
				public void clickonApplyAbreva() throws Exception {	
					waitForPageLoadJava();
					moveToElement(applyabreva);
					clickElementUsingJavaScript(applyabreva);
					scrollDownUsingElement(applyabreva_txt);
					visibilityOf(applyabreva_txt);
					boolean elementIsDisplayed=elementIsDisplayed(applyabreva_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(applyabreva_txt));
					pageLoad();
				}
				public void clickonArrow1() throws Exception {	
					waitForPageLoadJava();
					moveToElement(Arrow1);
					clickElementUsingJavaScript(Arrow1);
					scrollDownUsingElement(Arrow1_txt);
					visibilityOf(Arrow1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Arrow1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Arrow1_txt));
					pageLoad();
				}
				public void clickonArrow2() throws Exception {	
					waitForPageLoadJava();
					moveToElement(Arrow2);
					clickElementUsingJavaScript(Arrow2);
					scrollDownUsingElement(Arrow1_txt);
					visibilityOf(Arrow1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Arrow1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Arrow1_txt));
					pageLoad();
				}
				public void clickonBlister() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(blister);
					moveToElement(blister);
					clickElementUsingJavaScript(blister);				
					visibilityOf(blister_txt);
					boolean elementIsDisplayed=elementIsDisplayed(blister_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(blister_txt));
					pageLoad();
				}
				public void clickonAbrevaCream1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Abrevacream1);
					moveToElement(Abrevacream1);
					clickElementUsingJavaScript(Abrevacream1);				
					visibilityOf(Abrevacream1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Abrevacream1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Abrevacream1_txt));
					pageLoad();
				}
				public void clickonWheretobuy() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(wheretobuy);
					moveToElement(wheretobuy);
					clickElementUsingJavaScript(wheretobuy);				
					visibilityOf(wheretobuy_txt);
					boolean elementIsDisplayed=elementIsDisplayed(wheretobuy_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(wheretobuy_txt));
					pageLoad();
				}
				public void clickonUsingAbreva() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(usingabreva);
					moveToElement(usingabreva);
					clickElementUsingJavaScript(usingabreva);				
					visibilityOf(usingabreva_txt);
					boolean elementIsDisplayed=elementIsDisplayed(usingabreva_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(usingabreva_txt));
					pageLoad();
				}
				public void clickonLipcaretips() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lipcaretips);
					moveToElement(lipcaretips);
					clickElementUsingJavaScript(lipcaretips);				
					visibilityOf(lipcaretips_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipcaretips_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipcaretips_txt));
					pageLoad();
				}
				
				public void clickonReviews() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(reviews);
					moveToElement(reviews);
					clickElementUsingJavaScript(reviews);				
					visibilityOf(reviews_txt);
					boolean elementIsDisplayed=elementIsDisplayed(reviews_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(reviews_txt));
					pageLoad();
				}
				public void clickonContactus() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(contactus);
					moveToElement(contactus);
					clickElementUsingJavaScript(contactus);				
					visibilityOf(contactus_txt);
					boolean elementIsDisplayed=elementIsDisplayed(contactus_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(contactus_txt));
					pageLoad();
				}
				public void clickonWriteReview() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(writeReview);
					moveToElement(writeReview);
					clickElementUsingJavaScript(writeReview);				
					visibilityOf(writeReview_txt);
					boolean elementIsDisplayed=elementIsDisplayed(writeReview_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(writeReview_txt));
					pageLoad();
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
				
				
				
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
