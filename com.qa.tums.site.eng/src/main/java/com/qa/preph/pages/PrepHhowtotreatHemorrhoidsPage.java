package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHhowtotreatHemorrhoidsPage extends BaseClass{
	
	public PrepHhowtotreatHemorrhoidsPage() {
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
	
	@FindBy(xpath = "//li[text()=' How to Treat Hemorrhoid Symptoms ']")
	private static WebElement howtotreathemorrhoidt_Breadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement howtotreathemorrhoidt_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//img[@alt='How to Treat Hemorrhoid Symptoms']")
	private static WebElement howtotreathemorrhoidt_video;	
	
	@FindBy(xpath = "//iframe[@title='YouTube video title']")
	private static WebElement iframe;	
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement thumbnailicon;	
	
	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement video;	
	
	@FindBy(xpath = "//a[text()='Relief Finder']")
	private static WebElement relieffinder;	
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement relieffinder_txt;	
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']")
	private static WebElement relatedvideos1;	
	
	@FindBy(xpath = "//img[@title='What are Hemorrhoids?']")
	private static WebElement relatedvideos1_img;	
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?Video']")
	private static WebElement relatedvideos1_txt;	
	
	@FindBy(xpath = "//a[text()='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement relatedvideos2;	
	
	@FindBy(xpath = "//img[@title='Pregnancy and Hemorrhoids']")
	private static WebElement relatedvideos2_img;
	
	@FindBy(xpath = "//h1[text()='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement relatedvideos2_txt;
	
	
	@FindBy(xpath = "//a[text()='How to Insert a PREPARATION H Suppository']")
	private static WebElement relatedvideos3;
	
	@FindBy(xpath = "//img[@title='a close-up of a syringe']")
	private static WebElement relatedvideos3_img;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement relatedvideos3_txt;
	
	
	
	
	
	
	
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
	
		public void clickonhowtotreathemorrhoids_Breadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(howtotreathemorrhoidt_Breadcrumbs);
			if (isElementPresent(howtotreathemorrhoidt_Breadcrumbs)) {
				
				visibilityOf(howtotreathemorrhoidt_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(howtotreathemorrhoidt_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(howtotreathemorrhoidt_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("howtotreathemorrhoidt_txt_Breadcrumbs are not Present on Page");
			}
			
		}			
		public void clickonVideohowtreathemorrhoids() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(howtotreathemorrhoidt_video);
			if (isElementPresent(howtotreathemorrhoidt_video)) {
				clickElementUsingJavaScript(howtotreathemorrhoidt_video);
				moveToElement(iframe);
				switchToFrameUsingElement(iframe);
				visibilityOf(thumbnailicon);
				actionClick(thumbnailicon);
				boolean elementIsDisplayed=elementIsDisplayed(thumbnailicon);
				Assert.assertTrue(elementIsDisplayed(thumbnailicon));
				//clickElementUsingJavaScript(video);
				implicitWait();
				frameSwitchingToDefaultContent();
				System.out.println("howtotreat hemorrhoid is  Played Successfully on   Page");
				
				pageLoad();
			} else {
				throw new Exception("howtotreat hemorrhoid is not Played Successfully on   Page");
			}
			
		}					
		public void clickonReliefinder() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relieffinder);
			moveToElement(relieffinder);
			if (isElementPresent(relieffinder)) {
				clickElementUsingJavaScript(relieffinder);
				visibilityOf(relieffinder_txt);
				boolean elementIsDisplayed=elementIsDisplayed(relieffinder_txt);
				Assert.assertTrue(elementIsDisplayed(relieffinder_txt));
				pageLoad();
			} else {
				throw new Exception("relieffinder_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo1() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideos1);
			moveToElement(relatedvideos1);
			if (isElementPresent(relatedvideos1)) {
				visibilityOf(relatedvideos1_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideos1_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideos1_img));
				clickElementUsingJavaScript(relatedvideos1);
				visibilityOf(relatedvideos1_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos1_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideos1_txt));
				System.out.println(getElementText(relatedvideos1_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo1_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo2() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideos2);
			moveToElement(relatedvideos2);
			if (isElementPresent(relatedvideos2)) {
				visibilityOf(relatedvideos2_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideos2_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideos2_img));
				clickElementUsingJavaScript(relatedvideos2);
				visibilityOf(relatedvideos2_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos2_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideos2_txt));
				System.out.println(getElementText(relatedvideos2_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo1_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo3() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideos3);
			moveToElement(relatedvideos3);
			if (isElementPresent(relatedvideos3)) {
				visibilityOf(relatedvideos3_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideos3_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideos3_img));
				clickElementUsingJavaScript(relatedvideos3);
				visibilityOf(relatedvideos3_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos3_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideos3_txt));
				System.out.println(getElementText(relatedvideos3_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo3_txt are not Present on Page");
			}
			
		}			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	

}
