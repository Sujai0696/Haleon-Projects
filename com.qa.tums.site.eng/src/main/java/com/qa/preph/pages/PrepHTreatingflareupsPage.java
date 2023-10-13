package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHTreatingflareupsPage extends BaseClass{
	
	public PrepHTreatingflareupsPage() {
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
	
	@FindBy(xpath = "//li[text()=' Treating Flare-Ups ']")
	private static WebElement treatingflareups_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='Treating a Hemorrhoid Flare Up']")
	private static WebElement treatingflareups_txt_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='Personal Relief Finder']")
	private static WebElement personalrelieffinder;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement personalrelieffinder_txt;
	
	@FindBy(xpath = "(//a[text()='Preparation H Medicated Wipes'])[1]")
	private static WebElement medicatepwipes1;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatepwipes1_txt;
	
	@FindBy(xpath = "(//a[text()='Preparation H Medicated Wipes'])[2]")
	private static WebElement medicatepwipes2;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatepwipes2_txt;
	
	@FindBy(xpath = "//a[text()='Treating Flare-Ups Away From Home']")
	private static WebElement treatingflareupaway;
	
	@FindBy(xpath = "//h1[text()='Treating Flare-Ups Away From Home']")
	private static WebElement treatingflareupaway_txt;
	
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
		public void clickonTreatingflareups_Breadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(treatingflareups_Breadcrumbs);
			if (isElementPresent(treatingflareups_Breadcrumbs)) {
				clickElementUsingJavaScript(treatingflareups_Breadcrumbs);
				visibilityOf(treatingflareups_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(treatingflareups_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(treatingflareups_txt_Breadcrumbs));
				System.out.println(getElementText(treatingflareups_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("treatingflareups_txt_Breadcrumbs are not Present on Page");
			}
			
		}			
		public void clickonPersonalRelieffinder() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(personalrelieffinder);
			if (isElementPresent(personalrelieffinder)) {
				clickElementUsingJavaScript(personalrelieffinder);
				visibilityOf(personalrelieffinder_txt);
				boolean elementIsDisplayed=elementIsDisplayed(personalrelieffinder_txt);
				Assert.assertTrue(elementIsDisplayed(personalrelieffinder_txt));
				System.out.println(getElementText(personalrelieffinder_txt));
				pageLoad();
			} else {
				throw new Exception("personalrelieffinder_txt are not Present on Page");
			}
			
		}			
		public void clickonMedicatedWipes1() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(medicatepwipes1);
			if (isElementPresent(medicatepwipes1)) {
				clickElementUsingJavaScript(medicatepwipes1);
				visibilityOf(medicatepwipes1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatepwipes1_txt);
				Assert.assertTrue(elementIsDisplayed(medicatepwipes1_txt));
				System.out.println(getElementText(medicatepwipes1_txt));
				pageLoad();
			} else {
				throw new Exception("medicatepwipes1_txt are not Present on Page");
			}
			
		}			
		public void clickonMedicatedWipes2() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(medicatepwipes2);
			if (isElementPresent(medicatepwipes2)) {
				clickElementUsingJavaScript(medicatepwipes2);
				visibilityOf(medicatepwipes2_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatepwipes2_txt);
				Assert.assertTrue(elementIsDisplayed(medicatepwipes2_txt));
				System.out.println(getElementText(medicatepwipes2_txt));
				pageLoad();
			} else {
				throw new Exception("medicatepwipes2_txt are not Present on Page");
			}
			
		}			
		public void clickonTreatingflareupsawayhome() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(treatingflareupaway);
			if (isElementPresent(treatingflareupaway)) {
				clickElementUsingJavaScript(treatingflareupaway);
				visibilityOf(treatingflareupaway_txt);
				boolean elementIsDisplayed=elementIsDisplayed(treatingflareupaway_txt);
				Assert.assertTrue(elementIsDisplayed(treatingflareupaway_txt));
				System.out.println(getElementText(treatingflareupaway_txt));
				pageLoad();
			} else {
				throw new Exception("treatingflareupaway_txt are not Present on Page");
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
