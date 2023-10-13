package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHinsertsuppositoryPage extends BaseClass{
	
	public PrepHinsertsuppositoryPage() {
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
	
	@FindBy(xpath = "//li[text()=' How to Insert a PREPARATION H Suppository ']")
	private static WebElement prepartionHsuppository_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement prepartionHsuppository_txt_Breadcrumbs;
	
	//Video1//
	
	@FindBy(xpath = "//img[@alt='PPREPARATION H Suppository']")
	private static WebElement videobtn;
	
	@FindBy(xpath = "//iframe[@title='YouTube video title']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement videothumbnail;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videodispaly_button;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement videoplayedbutton;
	
	// script//
	
	@FindBy(xpath = "//a[text()='Suppositories']")
	private static WebElement suppostories;
	
	@FindBy(xpath = "//h1[text()='Suppositories']")
	private static WebElement suppostories_txt;
	
	@FindBy(xpath = "//a[text()='Physical Activity']")
	private static WebElement physicalactivity;
	
	@FindBy(xpath = "//h1[text()='How Does Exercise Help Hemorrhoids?']")
	private static WebElement physicalactivity_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply Preparation H Ointment, Gels and Creams']")
	private static WebElement Relatedvideo1;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment, Gels and Creams']")
	private static WebElement Relatedvideo1_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement Relatedvideo2;
	
	@FindBy(xpath = "//h1[text()='Applying Maximum Strength Pain Relief Cream']")
	private static WebElement Relatedvideo2_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment with an Applicator']")
	private static WebElement Relatedvideo3;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment with an Applicator']")
	private static WebElement Relatedvideo3_txt;
	
	
	
	
	
	
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
			public void clickonPrepartionHsuppository_Breadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(prepartionHsuppository_Breadcrumbs);
				if (isElementPresent(prepartionHsuppository_Breadcrumbs)) {
					
					visibilityOf(prepartionHsuppository_txt_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(prepartionHsuppository_txt_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(prepartionHsuppository_txt_Breadcrumbs));
					System.out.println(getElementText(prepartionHsuppository_txt_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("prepartionHsuppository_txt_Breadcrumbs are not Present on Page");
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
					boolean elementIsDisplayed=elementIsDisplayed(videothumbnail);
					Assert.assertTrue(elementIsDisplayed(videothumbnail));
					actionClick(videodispaly_button);
					implicitWait();
					clickElementUsingJavaScript(videoplayedbutton);
					frameSwitchingToDefaultContent();
					System.out.println("PrepartionH insertion is  Played Successfully on   Page");
					
					pageLoad();
				} else {
					throw new Exception("PrepartionH insertion is not Played Successfully on   Page");
				}
				
			}			
			public void clickonSuppostories() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(suppostories);
				moveToElement(suppostories);
				if (isElementPresent(suppostories)) {
					clickElementUsingJavaScript(suppostories);
					visibilityOf(suppostories_txt);
					boolean elementIsDisplayed=elementIsDisplayed(suppostories_txt);
					Assert.assertTrue(elementIsDisplayed(suppostories_txt));
					System.out.println(getElementText(suppostories_txt));
					pageLoad();
				} else {
					throw new Exception("suppostories_txt are not Present on Page");
				}
				
			}			
			public void clickonPhysicalActivity() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(physicalactivity);
				moveToElement(physicalactivity);
				if (isElementPresent(physicalactivity)) {
					clickElementUsingJavaScript(physicalactivity);
					visibilityOf(physicalactivity_txt);
					boolean elementIsDisplayed=elementIsDisplayed(physicalactivity_txt);
					Assert.assertTrue(elementIsDisplayed(physicalactivity_txt));
					System.out.println(getElementText(physicalactivity_txt));
					pageLoad();
				} else {
					throw new Exception("physicalactivity_txt are not Present on Page");
				}
				
			}			
			public void clickonRelatedVideo1() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(Relatedvideo1);
				moveToElement(Relatedvideo1);
				if (isElementPresent(Relatedvideo1)) {
					clickElementUsingJavaScript(Relatedvideo1);
					visibilityOf(Relatedvideo1_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Relatedvideo1_txt);
					Assert.assertTrue(elementIsDisplayed(Relatedvideo1_txt));
					System.out.println(getElementText(Relatedvideo1_txt));
					pageLoad();
				} else {
					throw new Exception("Relatedvideo1_txt are not Present on Page");
				}
				
			}			
			public void clickonRelatedVideo2() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(Relatedvideo2);
				moveToElement(Relatedvideo2);
				if (isElementPresent(Relatedvideo2)) {
					clickElementUsingJavaScript(Relatedvideo2);
					visibilityOf(Relatedvideo2_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Relatedvideo2_txt);
					Assert.assertTrue(elementIsDisplayed(Relatedvideo2_txt));
					System.out.println(getElementText(Relatedvideo2_txt));
					pageLoad();
				} else {
					throw new Exception("Relatedvideo2_txt are not Present on Page");
				}
				
			}			
			public void clickonRelatedVideo3() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(Relatedvideo3);
				moveToElement(Relatedvideo3);
				if (isElementPresent(Relatedvideo3)) {
					clickElementUsingJavaScript(Relatedvideo3);
					visibilityOf(Relatedvideo3_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Relatedvideo3_txt);
					Assert.assertTrue(elementIsDisplayed(Relatedvideo3_txt));
					System.out.println(getElementText(Relatedvideo3_txt));
					pageLoad();
				} else {
					throw new Exception("Relatedvideo3_txt are not Present on Page");
				}
				
			}			
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
	

}
