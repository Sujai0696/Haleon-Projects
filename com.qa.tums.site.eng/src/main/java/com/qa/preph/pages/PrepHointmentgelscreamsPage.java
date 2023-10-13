package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHointmentgelscreamsPage extends BaseClass{
	
	public PrepHointmentgelscreamsPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//a")
	private static WebElement Video_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section m-m-b-2 m-m-x-2 first odd col-xs-12 col-sm-6 col-lg-5']//h1")
	private static WebElement Video_txt_Breadcrumbs;
		
	@FindBy(xpath = "//li[text()=' How to Apply PREPARATION H Ointment, Gels and Creams ']")
	private static WebElement ointmentgelscreame_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment, Gels and Creams']")
	private static WebElement ointmentgelscreame_txt_Breadcrumbs;
	
	@FindBy(xpath = "//img[@alt='Ointment, Gels and Creams']")
	private static WebElement videobtn;
	
	@FindBy(xpath = "//iframe[@title='YouTube video title']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement videothumbnail;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videodispaly_button;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement videoplayedbutton;
	
	@FindBy(xpath = "//a[@href='/articles/treating-flare-ups-away-from-home/']")
	private static WebElement treatflareupshome;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-r-5 p-m-b-1 alt article-top-content head-alt first odd col-xs-12']//h1[text()='Treating Flare-Ups Away From Home']")
	private static WebElement treatflareupshome_txt;
	
	@FindBy(xpath = "//a[text()='How to Insert a PREPARATION H Suppository']")
	private static WebElement relatedvideo1;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement relatedvideo1_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement relatedvideo2;
	
	@FindBy(xpath = "//h1[text()='Applying Maximum Strength Pain Relief Cream']")
	private static WebElement relatedvideo2_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment with an Applicator']")
	private static WebElement relatedvideo3;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment with an Applicator']")
	private static WebElement relatedvideo3_txt;
	
	
	
	
	
	
	
	
	
	
	
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
			
			
				public void clickonHomeBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(HomeBreadcrumbs);
					if (isElementPresent(HomeBreadcrumbs)) {
						clickElementUsingJavaScript(HomeBreadcrumbs);
						pageLoad();
					} else {
						throw new Exception("HomeBreadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonVideo_Breadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(Video_Breadcrumbs);
					if (isElementPresent(Video_Breadcrumbs)) {
						clickElementUsingJavaScript(Video_Breadcrumbs);
						visibilityOf(Video_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(Video_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(Video_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("Video_txt_Breadcrumbs are not Present on Page");
					}
					
				}			
				public void clickonOintmentgelscream_Breadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(ointmentgelscreame_Breadcrumbs);
					if (isElementPresent(ointmentgelscreame_Breadcrumbs)) {
						clickElementUsingJavaScript(ointmentgelscreame_Breadcrumbs);
						visibilityOf(ointmentgelscreame_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(ointmentgelscreame_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(ointmentgelscreame_txt_Breadcrumbs));
						System.out.println(getElementText(ointmentgelscreame_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("ointmentgelscreame_txt_Breadcrumbs are not Present on Page");
					}
					
				}			
				public void clickonVideoDisplayInsertPrepartionH() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(videobtn);
					if (isElementPresent(videobtn)) {
						clickElementUsingJavaScript(videobtn);
						moveToElement(iframe);
						switchToFrameUsingElement(iframe);
						visibilityOf(videothumbnail);
						actionClick(videothumbnail);
						boolean elementIsDisplayed=elementIsDisplayed(videodispaly_button);
						Assert.assertTrue(elementIsDisplayed(videodispaly_button));
						//actionClick(videodispaly_button);
						implicitWait();
						//clickElementUsingJavaScript(videoplayedbutton);
						frameSwitchingToDefaultContent();
						System.out.println("PrepartionH insertion is  Played Successfully on   Page");
						
						pageLoad();
					} else {
						throw new Exception("PrepartionH insertion is not Played Successfully on   Page");
					}
					
				}			
				public void clickontreatflareupsawayhome() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treatflareupshome);
					moveToElement(treatflareupshome);
					if (isElementPresent(treatflareupshome)) {
						clickElementUsingJavaScript(treatflareupshome);
						visibilityOf(treatflareupshome_txt);
						boolean elementIsDisplayed=elementIsDisplayed(treatflareupshome_txt);
						Assert.assertTrue(elementIsDisplayed(treatflareupshome_txt));
						pageLoad();
					} else {
						throw new Exception("treatflareupshome_txt are not Present on Page");
					}
					
				}			
				public void clickonRelatedVideos1() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideo1);
					moveToElement(relatedvideo1);
					if (isElementPresent(relatedvideo1)) {
						clickElementUsingJavaScript(relatedvideo1);
						visibilityOf(relatedvideo1_txt);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideo1_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideo1_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvideo1_txt are not Present on Page");
					}
					
				}			
				public void clickonRelatedVideos2() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideo2);
					moveToElement(relatedvideo2);
					if (isElementPresent(relatedvideo2)) {
						clickElementUsingJavaScript(relatedvideo2);
						visibilityOf(relatedvideo2_txt);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideo2_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideo2_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvide2_txt are not Present on Page");
					}
					
				}			
				public void clickonRelatedVideos3() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideo3);
					moveToElement(relatedvideo3);
					if (isElementPresent(relatedvideo3)) {
						clickElementUsingJavaScript(relatedvideo3);
						visibilityOf(relatedvideo3_txt);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideo3_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideo3_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvide3_txt are not Present on Page");
					}
					
				}			
	
	
	
	
	
	
	
	

}
