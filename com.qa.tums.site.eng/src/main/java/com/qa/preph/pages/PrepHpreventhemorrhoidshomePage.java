package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHpreventhemorrhoidshomePage extends BaseClass{
	
	public PrepHpreventhemorrhoidshomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		

	@FindBy(xpath = "//a[text()='Articles']")
	private static WebElement ArticlesBreadcrumbs;		
	
	@FindBy(xpath = "//h2[@class='banner-title']")
	private static WebElement Articles_txt_Breadcrumbs;				
	
	@FindBy(xpath = "//li[text()=' How to Prevent Hemorrhoids with Home Remedies ']")
	private static WebElement preventhemorrhoidhomeremedies_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='How to Prevent Hemorrhoids with Home Remedies']")
	private static WebElement preventhemorrhoidhomeremedies_txt_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='hemorrhoid symptoms']")
	private static WebElement hemorrhoidsymptoms;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Symptoms']")
	private static WebElement hemorrhoidsymptoms_txt;
	
	@FindBy(xpath = "//a[text()='Hemorrhoids']")
	private static WebElement hemorrhoid;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoid_txt;
	
	@FindBy(xpath = "//a[text()='caused by']")
	private static WebElement causedby;
	
	@FindBy(xpath = "//h1[text()='Causes of Hemorrhoids']")
	private static WebElement causedby_txt;
	
	@FindBy(xpath = "//a[text()='who are pregnant']")
	private static WebElement whoarepregant;
	
	@FindBy(xpath = "//h1[text()='Why Pregnant Women Get Hemorrhoids']")
	private static WebElement whoarepregant_txt;
	
	@FindBy(xpath = "//a[text()='high in fiber']")
	private static WebElement highinFiber;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement highinFiber_txt;
	
	@FindBy(xpath = "//a[text()='exercise']")
	private static WebElement exercise;
	
	@FindBy(xpath = "//h1[text()='How Does Exercise Help Hemorrhoids?']")
	private static WebElement exercise_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H Rapid Relief with Lidocaine Spray']")
	private static WebElement lidocainespray;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement lidocainespray_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H Soothing Relief Cleansing & Cooling Wipes']")
	private static WebElement cleansingcoolingwipes;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement cleansingcoolingwipes_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H Rapid Relief Totable Wipes']")
	private static WebElement rapidrelieftotablewipes;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Totables Wipes']")
	private static WebElement rapidrelieftotablewipes_txt;
	
	@FindBy(xpath = "//a[text()='hemorrhoid treatment tips']")
	private static WebElement hemorrhoidtreatmenttips;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-t-4 text-left-d text-center-m even col-xs-12']")
	private static WebElement hemorrhoidtreatmenttips_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H website']")
	private static WebElement prepartionHwebsite;
	
	@FindBy(xpath = "//button[@id='emotional-toll-link']")
	private static WebElement ReadMore1;
	
	@FindBy(xpath = "//img[@alt='Man in deep thought']")
	private static WebElement ReadMore1_img;
	
	@FindBy(xpath = "//h1[text()='Emotional Toll of Hemorrhoids']")
	private static WebElement ReadMore1_txt;
	
	@FindBy(xpath = "//button[@id='what-are-hemorrhoids-link']")
	private static WebElement ReadMore2;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement ReadMore2_txt;
	
	@FindBy(xpath = "//img[@alt='Man working on laptop']")
	private static WebElement ReadMore2_img;
	
	@FindBy(xpath = "//img[@alt='Person holding exercise ball']")
	private static WebElement ReadMore3_img;
	
	@FindBy(xpath = "//h1[text()='6 Reasons You Have an Itchy Butt']")
	private static WebElement ReadMore3_txt;
	
	@FindBy(xpath = "//button[@id='itchy-butt-link']")
	private static WebElement ReadMore3;
	
	
	
	
	
	
	
	
	
	
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
		public void clickonArticleBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(ArticlesBreadcrumbs);
			if (isElementPresent(ArticlesBreadcrumbs)) {
				clickElementUsingJavaScript(ArticlesBreadcrumbs);
				visibilityOf(Articles_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(Articles_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(Articles_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("Articles_txt_Breadcrumbs are not Present on Page");
			}
			
		}			
		public void clickonPreventhomerroidhomeremediesBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(preventhemorrhoidhomeremedies_Breadcrumbs);
			if (isElementPresent(preventhemorrhoidhomeremedies_Breadcrumbs)) {
				
				visibilityOf(preventhemorrhoidhomeremedies_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(preventhemorrhoidhomeremedies_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(preventhemorrhoidhomeremedies_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("preventhemorrhoidhomeremedies_txt_Breadcrumbs are not Present on Page");
			}
			
		}			
		public void clickonHemorrhoidssymptoms() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(hemorrhoidsymptoms);
			if (isElementPresent(hemorrhoidsymptoms)) {
				clickElementUsingJavaScript(hemorrhoidsymptoms);
				visibilityOf(hemorrhoidsymptoms_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidsymptoms_txt);
				Assert.assertTrue(elementIsDisplayed(hemorrhoidsymptoms_txt));
				pageLoad();
			} else {
				throw new Exception("hemorrhoidsymptoms_txt are not Present on Page");
			}
			
		}			
		public void clickonHemorrhoid() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(hemorrhoid);
			if (isElementPresent(hemorrhoid)) {
				clickElementUsingJavaScript(hemorrhoid);
				visibilityOf(hemorrhoid_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorrhoid_txt);
				Assert.assertTrue(elementIsDisplayed(hemorrhoid_txt));
				System.out.println(getElementText(hemorrhoid_txt));
				pageLoad();
			} else {
				throw new Exception("hemorrhoid_txt are not Present on Page");
			}
			
		}			
		public void clickonCausedBy() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(causedby);
			if (isElementPresent(causedby)) {
				clickElementUsingJavaScript(causedby);
				visibilityOf(causedby_txt);
				boolean elementIsDisplayed=elementIsDisplayed(causedby_txt);
				Assert.assertTrue(elementIsDisplayed(causedby_txt));
				System.out.println(getElementText(causedby_txt));
				pageLoad();
			} else {
				throw new Exception("causedby_txt are not Present on Page");
			}
			
		}			
		public void clickonwhoarepregant() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(whoarepregant);
			if (isElementPresent(whoarepregant)) {
				clickElementUsingJavaScript(whoarepregant);
				visibilityOf(whoarepregant_txt);
				boolean elementIsDisplayed=elementIsDisplayed(whoarepregant_txt);
				Assert.assertTrue(elementIsDisplayed(whoarepregant_txt));
				System.out.println(getElementText(whoarepregant_txt));
				pageLoad();
			} else {
				throw new Exception("whoarepregant_txt are not Present on Page");
			}
			
		}			
		public void clickonHighInFiber() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(highinFiber);
			if (isElementPresent(highinFiber)) {
				clickElementUsingJavaScript(highinFiber);
				visibilityOf(highinFiber_txt);
				boolean elementIsDisplayed=elementIsDisplayed(highinFiber_txt);
				Assert.assertTrue(elementIsDisplayed(highinFiber_txt));
				System.out.println(getElementText(highinFiber_txt));
				pageLoad();
			} else {
				throw new Exception("highinFiber_txt are not Present on Page");
			}
			
		}			
		public void clickonExercise() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(exercise);
			if (isElementPresent(exercise)) {
				clickElementUsingJavaScript(exercise);
				visibilityOf(exercise_txt);
				boolean elementIsDisplayed=elementIsDisplayed(exercise_txt);
				Assert.assertTrue(elementIsDisplayed(exercise_txt));
				System.out.println(getElementText(exercise_txt));
				pageLoad();
			} else {
				throw new Exception("exercise_txt are not Present on Page");
			}
			
		}			
		public void clickonLidocainesparay() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(lidocainespray);
			if (isElementPresent(lidocainespray)) {
				clickElementUsingJavaScript(lidocainespray);
				visibilityOf(lidocainespray_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lidocainespray_txt);
				Assert.assertTrue(elementIsDisplayed(lidocainespray_txt));
				System.out.println(getElementText(lidocainespray_txt));
				pageLoad();
			} else {
				throw new Exception("lidocainespray_txt are not Present on Page");
			}
			
		}			
		public void clickonCleansingCoolingwipes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(cleansingcoolingwipes);
			if (isElementPresent(cleansingcoolingwipes)) {
				clickElementUsingJavaScript(cleansingcoolingwipes);
				visibilityOf(cleansingcoolingwipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(cleansingcoolingwipes_txt);
				Assert.assertTrue(elementIsDisplayed(cleansingcoolingwipes_txt));
				System.out.println(getElementText(cleansingcoolingwipes_txt));
				pageLoad();
			} else {
				throw new Exception("cleansingcoolingwipes_txt are not Present on Page");
			}
			
		}			
		public void clickonRapidReliefTotables() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(rapidrelieftotablewipes);
			if (isElementPresent(rapidrelieftotablewipes)) {
				clickElementUsingJavaScript(rapidrelieftotablewipes);
				visibilityOf(rapidrelieftotablewipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(rapidrelieftotablewipes_txt);
				Assert.assertTrue(elementIsDisplayed(rapidrelieftotablewipes_txt));
				System.out.println(getElementText(rapidrelieftotablewipes_txt));
				pageLoad();
			} else {
				throw new Exception("rapidrelieftotablewipes_txt are not Present on Page");
			}
			
		}			
		public void clickonHemorrhoidtreatmenttips() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(hemorrhoidtreatmenttips);
			if (isElementPresent(hemorrhoidtreatmenttips)) {
				clickElementUsingJavaScript(hemorrhoidtreatmenttips);
				visibilityOf(hemorrhoidtreatmenttips_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidtreatmenttips_txt);
				Assert.assertTrue(elementIsDisplayed(hemorrhoidtreatmenttips_txt));
				System.out.println(getElementText(hemorrhoidtreatmenttips_txt));
				pageLoad();
			} else {
				throw new Exception("hemorrhoidtreatmenttips_txt are not Present on Page");
			}
			
		}			
		public void clickonPrepartionHwEbsite() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(prepartionHwebsite);
			if (isElementPresent(prepartionHwebsite)) {
				clickElementUsingJavaScript(prepartionHwebsite);
				System.out.println("Verified PrepartionH website is present on Page");
				pageLoad();
			} else {
				throw new Exception("Verified PrepartionH website is not  present on Page");
			}
			
		}			
		public void clickonReadMore1() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(ReadMore1_img);
			moveToElement(ReadMore1_img);
			if (isElementPresent(ReadMore1_img)) {
				clickElementUsingJavaScript(ReadMore1);
				visibilityOf(ReadMore1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ReadMore1_txt);
				Assert.assertTrue(elementIsDisplayed(ReadMore1_txt));
				System.out.println(getElementText(ReadMore1_txt));
				pageLoad();
			} else {
				throw new Exception("Readmore1_txt and Image are not Present on Page");
			}
			
		}	
		public void clickonReadMore2() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(ReadMore2_img);
			moveToElement(ReadMore2_img);
			if (isElementPresent(ReadMore2_img)) {
				clickElementUsingJavaScript(ReadMore2);
				visibilityOf(ReadMore2_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ReadMore2_txt);
				Assert.assertTrue(elementIsDisplayed(ReadMore2_txt));
				System.out.println(getElementText(ReadMore2_txt));
				pageLoad();
			} else {
				throw new Exception("Readmore2_txt and Image are not Present on Page");
			}
			
		}	
		public void clickonReadMore3() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(ReadMore3_img);
			moveToElement(ReadMore3_img);
			if (isElementPresent(ReadMore3_img)) {
				clickElementUsingJavaScript(ReadMore3);
				visibilityOf(ReadMore3_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ReadMore3_txt);
				Assert.assertTrue(elementIsDisplayed(ReadMore3_txt));
				System.out.println(getElementText(ReadMore3_txt));
				pageLoad();
			} else {
				throw new Exception("Readmore3_txt and Image are not Present on Page");
			}
			
		}	

	
	
	
	
	
	
	

}
