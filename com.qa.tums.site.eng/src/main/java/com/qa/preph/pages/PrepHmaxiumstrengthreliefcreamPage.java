package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHmaxiumstrengthreliefcreamPage extends BaseClass{
	
	public PrepHmaxiumstrengthreliefcreamPage() {
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
	
	@FindBy(xpath = "//li[text()=' How to Apply PREPARATION H Multi-Symptom Pain Relief Cream ']")
	private static WebElement painreliefcream_Breadcrumbs;	
	
	@FindBy(xpath = "//h1[text()='Applying Maximum Strength Pain Relief Cream']")
	private static WebElement painreliefcream_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//img[@alt='PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement videobtn;	
	
	@FindBy(xpath = "//iframe[@title='YouTube video title']")
	private static WebElement iframe;	
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement videothumbnail;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement videoplayedbutton;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videodispaly_button;
	
	@FindBy(xpath = "//a[text()='Multi-Symptom Pain Relief Cream']")
	private static WebElement multisymptomsrelief;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomsrelief_txt;
	
	@FindBy(xpath = "//a[text()='hemorrhoid flare-ups']")
	private static WebElement hemorroidsflareups;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Flare-Ups']")
	private static WebElement hemorroidsflareups_txt;
	
	@FindBy(xpath = "//a[text()='How to Insert a PREPARATION H Suppository']")
	private static WebElement relatedvideo1;
	
	@FindBy(xpath = "//img[@alt='a close-up of a syringe']")
	private static WebElement relatedvideo1_img;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement relatedvideo1_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply Preparation H Ointment, Gels and Creams']")
	private static WebElement relatedvideo2;
	
	@FindBy(xpath = "//img[@alt='packaged goods']")
	private static WebElement relatedvideo2_img;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment, Gels and Creams']")
	private static WebElement relatedvideo2_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment with an Applicator']")
	private static WebElement relatedvideo3;
	
	@FindBy(xpath = "//img[@alt='PREPARATION H Ointment with an Applicator']")
	private static WebElement relatedvideo3_img;
	
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
		public void clickonpainreliefcream_Breadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(painreliefcream_Breadcrumbs);
			if (isElementPresent(painreliefcream_Breadcrumbs)) {
				visibilityOf(painreliefcream_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(painreliefcream_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(painreliefcream_txt_Breadcrumbs));
				System.out.println(getElementText(painreliefcream_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("painreliefcream_txt_Breadcrumbs are not Present on Page");
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
		public void clickonMultisymptomsrelief() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(multisymptomsrelief);
			if (isElementPresent(multisymptomsrelief)) {
				clickElementUsingJavaScript(multisymptomsrelief);
				visibilityOf(multisymptomsrelief_txt);
				boolean elementIsDisplayed=elementIsDisplayed(multisymptomsrelief_txt);
				Assert.assertTrue(elementIsDisplayed(multisymptomsrelief_txt));
				System.out.println(getElementText(multisymptomsrelief_txt));
				pageLoad();
			} else {
				throw new Exception("multisymptomsrelief_txt are not Present on Page");
			}
			
		}			
		public void clickonHemorroidsflareup() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(hemorroidsflareups);
			if (isElementPresent(hemorroidsflareups)) {
				clickElementUsingJavaScript(hemorroidsflareups);
				visibilityOf(hemorroidsflareups_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorroidsflareups_txt);
				Assert.assertTrue(elementIsDisplayed(hemorroidsflareups_txt));
				System.out.println(getElementText(hemorroidsflareups_txt));
				pageLoad();
			} else {
				throw new Exception("hemorroidsflareups_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo1() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideo1);
			moveToElement(relatedvideo1);
			if (isElementPresent(relatedvideo1)) {
				visibilityOf(relatedvideo1_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideo1_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideo1_img));
				clickElementUsingJavaScript(relatedvideo1);
				visibilityOf(relatedvideo1_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideo1_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideo1_txt));
				System.out.println(getElementText(relatedvideo1_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo1_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo2() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideo2);
			moveToElement(relatedvideo2);
			if (isElementPresent(relatedvideo2)) {
				visibilityOf(relatedvideo2_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideo2_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideo2_img));
				clickElementUsingJavaScript(relatedvideo2);
				visibilityOf(relatedvideo2_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideo2_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideo2_txt));
				System.out.println(getElementText(relatedvideo2_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo2_txt are not Present on Page");
			}
			
		}			
		public void clickonRelatedVideo3() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(relatedvideo3);
			moveToElement(relatedvideo3);
			if (isElementPresent(relatedvideo3)) {
				visibilityOf(relatedvideo3_img);
				boolean elementIsDisplayed=elementIsDisplayed(relatedvideo3_img);
				Assert.assertTrue(elementIsDisplayed(relatedvideo3_img));
				clickElementUsingJavaScript(relatedvideo3);
				visibilityOf(relatedvideo3_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(relatedvideo3_txt);
				Assert.assertTrue(elementIsDisplayed(relatedvideo3_txt));
				System.out.println(getElementText(relatedvideo3_txt));
				pageLoad();
			} else {
				throw new Exception("relatedvideo3_txt are not Present on Page");
			}
			
		}			
	
	
	
	
	
	
	
	
	
	
	
	

}
