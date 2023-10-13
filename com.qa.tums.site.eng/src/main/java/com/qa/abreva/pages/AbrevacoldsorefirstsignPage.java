package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsorefirstsignPage extends BaseClass{
	
	public AbrevacoldsorefirstsignPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//a[text()='cold sore relief']")
		private static WebElement coldsorerelief;
	
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement coldsorerelief_txt;
	
		@FindBy(xpath = "//a[text()='stressed']")
		private static WebElement stressed;
	
		@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
		private static WebElement stressed_txt;
	
		@FindBy(xpath = "//a[text()='cold sore treatment*']")
		private static WebElement coldsoretreatment;
	
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement coldsoretreatment_txt;
	
		@FindBy(xpath = "//a[text()='get rid of cold sores']")
		private static WebElement ridcoldsore;
	
		@FindBy(xpath = "//h1[text()='How to Get Rid of a Cold Sore Fast']")
		private static WebElement ridcoldsore_txt;
	
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage abreva-blue abreva-text m-text-align-center odd last component grid_6']//a[text()='SIGNS & STAGES']")
		private static WebElement signstages;
	
		@FindBy(xpath = "//h1[text()='Cold Sore Stages']")
		private static WebElement signstages_txt;
	
		@FindBy(xpath = "//a[text()='reduce the occurrence of cold sores']")
		private static WebElement reduceoccurance;
	
		@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
		private static WebElement reduceoccurance_txt;
	
		@FindBy(xpath = "(//a[text()='LEARN ABOUT TRIGGERS'])[1]")
		private static WebElement learntriggers;
	
		@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
		private static WebElement learntriggers_txt;
		
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage abreva-blue abreva-text m-text-align-center odd last component grid_6']//a[text()='SEE ALL ABREVA PRODUCTS']")
		private static WebElement seeallabrevaproducts;
		
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement seeallabrevaproducts_txt;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section abreva-works-video first odd last grid_8 prefix_2 alpha reference-early-sufferes-video image']")
		private static WebElement youtubebtn;
		
		@FindBy(xpath = "//div[@id='movie_player']")
		private static WebElement youtubebtn_visibility;
		
		@FindBy(xpath = "//iframe[@id='videoFrame']")
		private static WebElement iframe;
		
		@FindBy(xpath = "//button[@title='Pause (k)']")
		private static WebElement youtube_play;
		
		@FindBy(xpath = "//u[text()='See transcript']")
		private static WebElement seetranscript;
		
		@FindBy(xpath = "//p[@style='text-align: center; display: none;']")
		private static WebElement seetranscript_Active;
		
		@FindBy(xpath = "//u[text()='Close Transcript']")
		private static WebElement closeTranscript;
		
		@FindBy(xpath = "//a[text()='BUY NOW']")
		private static WebElement buynow;
		
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement buynow_txt;
		
		@FindBy(xpath = "//a[text()='Read all reviews']")
		private static WebElement readallreviews;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement readallreviews_txt;
		
		@FindBy(xpath = "//a[text()='MANAGING LIP HEALTH']")
		private static WebElement managingliphealth;
		
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement managingliphealth_txt;
		
		@FindBy(xpath = "//div[@class='box component section dealing-article-box clickable-box first odd grid_4 alpha']")
		private static WebElement Readmore1;
		
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement Readmore1_txt;
		
		@FindBy(xpath = "//div[@class='box component section dealing-article-box clickable-box even grid_4 omega']")
		private static WebElement Readmore2;
		
		@FindBy(xpath = "//h1[text()='How To Feel Confident with A Cold Sore']")
		private static WebElement Readmore2_txt;
		
		@FindBy(xpath = "//div[@class='box component section dealing-article-box clickable-box odd last grid_4 omega']")
		private static WebElement Readmore3;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement Readmore3_txt;
		
		@FindBy(xpath = "//a[@href='/coupon/']")
		private static WebElement getcoupon;
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupon_txt;
		
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
				public void clickonColdsoreRelief() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsorerelief);
					clickElementUsingJavaScript(coldsorerelief);
					visibilityOf(coldsorerelief_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsorerelief_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsorerelief_txt));
					pageLoad();
				}
				public void clickonStressed() throws Exception {	
					waitForPageLoadJava();
					moveToElement(stressed);
					clickElementUsingJavaScript(stressed);
					visibilityOf(stressed_txt);
					boolean elementIsDisplayed=elementIsDisplayed(stressed_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(stressed_txt));
					pageLoad();
				}
				public void clickoncoldsoretreatment() throws Exception {	
					waitForPageLoadJava();
					moveToElement(coldsoretreatment);
					clickElementUsingJavaScript(coldsoretreatment);
					visibilityOf(coldsoretreatment_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoretreatment_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoretreatment_txt));
					pageLoad();
				}
				public void clickongetridcoldsore() throws Exception {	
					waitForPageLoadJava();
					moveToElement(ridcoldsore);
					clickElementUsingJavaScript(ridcoldsore);
					visibilityOf(ridcoldsore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(ridcoldsore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(ridcoldsore_txt));
					pageLoad();
				}
				public void clickonsignstages() throws Exception {	
					waitForPageLoadJava();
					moveToElement(signstages);
					clickElementUsingJavaScript(signstages);
					visibilityOf(signstages_txt);
					boolean elementIsDisplayed=elementIsDisplayed(signstages_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(signstages_txt));
					pageLoad();
				}
				public void clickonreduceoccurance() throws Exception {	
					waitForPageLoadJava();
					moveToElement(reduceoccurance);
					clickElementUsingJavaScript(reduceoccurance);
					visibilityOf(reduceoccurance_txt);
					boolean elementIsDisplayed=elementIsDisplayed(reduceoccurance_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(reduceoccurance_txt));
					pageLoad();
				}
				public void clickonlearntriggers() throws Exception {	
					waitForPageLoadJava();
					moveToElement(learntriggers);
					clickElementUsingJavaScript(learntriggers);
					visibilityOf(learntriggers_txt);
					boolean elementIsDisplayed=elementIsDisplayed(learntriggers_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(learntriggers_txt));
					pageLoad();
				}
				public void clickonseeallabrevaproducts() throws Exception {	
					waitForPageLoadJava();
					moveToElement(seeallabrevaproducts);
					clickElementUsingJavaScript(seeallabrevaproducts);
					visibilityOf(seeallabrevaproducts_txt);
					boolean elementIsDisplayed=elementIsDisplayed(seeallabrevaproducts_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(seeallabrevaproducts_txt));
					pageLoad();
				}
				public void clickonYouTubeLink() throws Throwable {
					//scrollDownUsingElement(youtubebtn);
					visibilityOf(youtubebtn);
					if(isElementPresent(youtubebtn)) {
						scrollDownUsingElement(youtubebtn);
						clickElementUsingJavaScript(youtubebtn);
						visibilityOf(iframe);
						switchToFrameUsingElement(iframe);
						elementToBeClickable(youtubebtn_visibility);
						moveToElement(youtubebtn_visibility);
						actionClick(youtubebtn_visibility);
						Thread.sleep(1000);
						visibilityOf(youtubebtn_visibility);
						Assert.assertTrue(elementIsDisplayed(youtubebtn_visibility));
						System.out.println("YouTube video is playing successfully");
						//moveToElement(youtube_play);
						//actionClick(youtube_play);
						//visibilityOf(youtube_play);
						//Assert.assertTrue(elementIsDisplayed(youtube_play));
						//System.out.println("YouTube video is paused successfully");
					}
					else {
						System.out.println("Video is  not verified");
						Assert.assertTrue(false);
					}
				}
				public void clickonSeetranscript() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(seetranscript);
					moveToElement(seetranscript);
					clickElementUsingJavaScript(seetranscript);
//					visibilityOf(seetranscript_Active);
//					actionClick(seetranscript_Active);
//					boolean elementIsDisplayed=elementIsDisplayed(seetranscript_Active);
//					Assert.assertTrue(elementIsDisplayed);
//					clickElementUsingJavaScript(closeTranscript);
					pageLoad();
				}
				public void clickonBuyNow() throws Exception {	
					waitForPageLoadJava();
					moveToElement(buynow);
					clickElementUsingJavaScript(buynow);
					visibilityOf(buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(buynow_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(buynow_txt));
					pageLoad();
				}
				public void clickonReadallReviews() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(readallreviews);
					moveToElement(readallreviews);
					clickElementUsingJavaScript(readallreviews);
					visibilityOf(readallreviews_txt);
					boolean elementIsDisplayed=elementIsDisplayed(readallreviews_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(readallreviews_txt));
					pageLoad();
				}
				public void clickonManagingliphealth() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(managingliphealth);
					moveToElement(managingliphealth);
					clickElementUsingJavaScript(managingliphealth);
					visibilityOf(managingliphealth_txt);
					boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(managingliphealth_txt));
					pageLoad();
				}
				public void clickonReadmore1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Readmore1);
					moveToElement(Readmore1);
					clickElementUsingJavaScript(Readmore1);
					visibilityOf(Readmore1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Readmore1_txt));
					pageLoad();
				}
				public void clickonReadmore2() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Readmore2);
					moveToElement(Readmore2);
					clickElementUsingJavaScript(Readmore2);
					visibilityOf(Readmore2_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Readmore2_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Readmore2_txt));
					pageLoad();
				}
				public void clickonReadmore3() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Readmore3);
					moveToElement(Readmore3);
					clickElementUsingJavaScript(Readmore3);
					visibilityOf(Readmore3_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Readmore3_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Readmore3_txt));
					pageLoad();
				}
				public void clickongetcoupons() throws Exception {	
					waitForPageLoadJava();
					//moveToElement(getcoupons);
					if (isElementPresent(getcoupon)) {
						clickElementUsingJavaScript(getcoupon);
						
						visibilityOf(getcoupon_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getcoupon_txt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(getcoupon_txt));
						pageLoad();
					} else {
						throw new Exception("Get Coupons is not present on Preprod Url");
					}
					
				}			
				public void clickonBuyNow1() throws Exception {	
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
