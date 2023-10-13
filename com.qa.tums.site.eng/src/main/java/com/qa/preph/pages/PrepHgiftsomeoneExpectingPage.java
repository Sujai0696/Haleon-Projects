package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHgiftsomeoneExpectingPage extends BaseClass{
	
	public PrepHgiftsomeoneExpectingPage() {
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
	
	@FindBy(xpath = "//li[text()=' 5 Gifts to Give Someone Who Is Expecting ']")
	private static WebElement giftssomeoneexpecting_Breadcrumbs;	
	
	@FindBy(xpath = "//a[text()='postpartum women']")
	private static WebElement postpartumwomen;	
	
	@FindBy(xpath = "//h1[text()='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement postpartumwomen_txt;	
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointment;	
	
	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement ointment_txt;	
	
	@FindBy(xpath = "//a[text()='hemorrhoids']")
	private static WebElement hemorrhoids;	
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoids_txt;	
	
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
		public void clickonGiftsomeoneExpectingBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(giftssomeoneexpecting_Breadcrumbs);
			if (isElementPresent(giftssomeoneexpecting_Breadcrumbs)) {
				visibilityOf(giftssomeoneexpecting_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(giftssomeoneexpecting_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(giftssomeoneexpecting_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("giftssomeoneexpecting_Breadcrumbs are not Present on Page");
			}
			
		}		
		public void clickonPostPartumwomen() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(postpartumwomen);
			if (isElementPresent(postpartumwomen)) {
				clickElementUsingJavaScript(postpartumwomen);
				visibilityOf(postpartumwomen_txt);
				boolean elementIsDisplayed=elementIsDisplayed(postpartumwomen_txt);
				Assert.assertTrue(elementIsDisplayed(postpartumwomen_txt));
				System.out.println(getElementText(postpartumwomen_txt));
				pageLoad();
			} else {
				throw new Exception("postpartumwomen_txt are not Present on Page");
			}
			
		}		
		public void clickonOintment() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(ointment);
			if (isElementPresent(ointment)) {
				clickElementUsingJavaScript(ointment);
				visibilityOf(ointment_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ointment_txt);
				Assert.assertTrue(elementIsDisplayed(ointment_txt));
				System.out.println(getElementText(ointment_txt));
				pageLoad();
			} else {
				throw new Exception("ointment_txt are not Present on Page");
			}
			
		}		
		public void clickonHemorrhoids() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(hemorrhoids);
			moveToElement(hemorrhoids);
			if (isElementPresent(hemorrhoids)) {
				clickElementUsingJavaScript(hemorrhoids);
				visibilityOf(hemorrhoids_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorrhoids_txt);
				Assert.assertTrue(elementIsDisplayed(hemorrhoids_txt));
				System.out.println(getElementText(hemorrhoids_txt));
				pageLoad();
			} else {
				throw new Exception("hemorrhoids_txt are not Present on Page");
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
