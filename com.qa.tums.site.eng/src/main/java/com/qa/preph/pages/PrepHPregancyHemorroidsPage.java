package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHPregancyHemorroidsPage extends BaseClass{
	
	public PrepHPregancyHemorroidsPage() {
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
			
	@FindBy(xpath = "//li[text()=' Pregnancy and Hemorrhoids ']")
	private static WebElement pregancyhemorrhoids_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement pregancyhemorrhoids_txt_Breadcrumbs;
	
	@FindBy(xpath = "//img[@alt='Pregnancy and Hemorrhoids']")
	private static WebElement videobtn;
	
	@FindBy(xpath = "//iframe[@title='YouTube video title']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement videothumbnail;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	private static WebElement videodisplay;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement videoplayed;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply Preparation H Ointment, Gels and Creams']")
	private static WebElement relatedvideos1;
	
	@FindBy(xpath = "//img[@title='packaged goods']")
	private static WebElement relatedvideos1_img;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment, Gels and Creams']")
	private static WebElement relatedvideos1_txt;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']")
	private static WebElement relatedvideos2;
	
	@FindBy(xpath = "//img[@title='What are Hemorrhoids?']")
	private static WebElement relatedvideos2_img;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?Video']")
	private static WebElement relatedvideos2_txt;
	
	@FindBy(xpath = "//a[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement relatedvideos3;
	
	@FindBy(xpath = "//img[@title='How to Treat Hemorrhoid Symptoms']")
	private static WebElement relatedvideos3_img;
	
	@FindBy(xpath = "//h1[text()='How to Treat Hemorrhoid Symptoms']")
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
		public void clickonPregancyHemorrhoids_Breadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(pregancyhemorrhoids_Breadcrumbs);
			if (isElementPresent(pregancyhemorrhoids_Breadcrumbs)) {
				visibilityOf(pregancyhemorrhoids_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(pregancyhemorrhoids_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(pregancyhemorrhoids_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("pregancyhemorrhoids_txt_Breadcrumbs are not Present on Page");
			}
			
		}			
		public void clickonVideoPregancyHemorrhoids() throws Exception{
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
				//clickElementUsingJavaScript(videoplayed);
				implicitWait();
				//clickElementUsingJavaScript(video);
				frameSwitchingToDefaultContent();
				System.out.println("PrepartionH insertion is  Played Successfully on   Page");
				
				pageLoad();
			} else {
				throw new Exception("PrepartionH insertion is not Played Successfully on   Page");
			}
			
		}					
		public void clickonMedicatedWipeswomen() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(medicatedwipeswomen);
			moveToElement(medicatedwipeswomen);
			if (isElementPresent(medicatedwipeswomen)) {
				clickElementUsingJavaScript(medicatedwipeswomen);
				visibilityOf(medicatedwipeswomen_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatedwipeswomen_txt);
				Assert.assertTrue(elementIsDisplayed(medicatedwipeswomen_txt));
				pageLoad();
			} else {
				throw new Exception("medicatedwipeswomen_txt are not Present on Page");
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
				throw new Exception("relatedvideo2_txt are not Present on Page");
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
