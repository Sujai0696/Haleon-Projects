package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHsimplywashingroutinePage extends BaseClass{
	
	public PrepHsimplywashingroutinePage() {
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
	
	@FindBy(xpath = "//li[text()=' 5 Reasons to Simplify Your Washing-Up Routine ']")
	private static WebElement simplywashingroutine_Breadcrumbs;	
	
	@FindBy(xpath = "//a[text()='Preparation H Flushable Wipes.']")
	private static WebElement flushablewipes;	
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement flushablewipes_txt;	
	
	@FindBy(xpath = "//a[text()='relieve irritation due to hemorrhoids']")
	private static WebElement irritationhemorrhoids;	
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement irritationhemorrhoids_txt;
	
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
			public void clickonSimplywashingRoutineBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(simplywashingroutine_Breadcrumbs);
				if (isElementPresent(simplywashingroutine_Breadcrumbs)) {
					visibilityOf(simplywashingroutine_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(simplywashingroutine_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(simplywashingroutine_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("simplywashingroutine_Breadcrumbs are not Present on Page");
				}
				
			}		
			public void clickonFlushablewipes() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(flushablewipes);
				moveToElement(flushablewipes);
				if (isElementPresent(flushablewipes)) {
					clickElementUsingJavaScript(flushablewipes);
					visibilityOf(flushablewipes_txt);
					boolean elementIsDisplayed=elementIsDisplayed(flushablewipes_txt);
					Assert.assertTrue(elementIsDisplayed(flushablewipes_txt));
					System.out.println(getElementText(flushablewipes_txt));
					pageLoad();
				} else {
					throw new Exception("flushablewipes_txt are not Present on Page");
				}
				
			}		
			public void clickonIrritationHemorrhoids() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(irritationhemorrhoids);
				moveToElement(irritationhemorrhoids);
				if (isElementPresent(irritationhemorrhoids)) {
					clickElementUsingJavaScript(irritationhemorrhoids);
					visibilityOf(irritationhemorrhoids_txt);
					boolean elementIsDisplayed=elementIsDisplayed(irritationhemorrhoids_txt);
					Assert.assertTrue(elementIsDisplayed(irritationhemorrhoids_txt));
					System.out.println(getElementText(irritationhemorrhoids_txt));
					pageLoad();
				} else {
					throw new Exception("irritationhemorrhoids_txt are not Present on Page");
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
