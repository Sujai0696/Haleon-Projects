package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephIrraitateyourbuttPage extends BaseClass{
	
	public PrephIrraitateyourbuttPage() {
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
		
	@FindBy(xpath = "//li[text()=' 7 Surprising Things That Irritate Your Butt ']")
	private static WebElement irritateyourbutt_Breadcrumbs;
	
	@FindBy(xpath = "//a[@href='/content/cf-consumer-healthcare/bp-preparationh-v3/en_US/home/learn-more/what-are-hemorrhoids.html aria-label=']")
	private static WebElement hamorrhoids;
	
	@FindBy(xpath = "//a[text()='incorporating more fiber into your diet']")
	private static WebElement incorpartingmorefibrediet;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement incorpartingmorefibrediet_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H']")
	private static WebElement prepartionH;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement prepartionH_txt;
	
	@FindBy(xpath = "//a[text()='(Learn more about hemorrhoids here.)']")
	private static WebElement learnabouthemorrhoids;
	
	@FindBy(xpath = "//a[text()='Access to www.preparationh.com']")
	private static WebElement learnabouthemorrhoids_txt;
	
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
				public void clickonIrritateyourbutt() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(irritateyourbutt_Breadcrumbs);
					if (isElementPresent(irritateyourbutt_Breadcrumbs)) {
						visibilityOf(irritateyourbutt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(irritateyourbutt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(irritateyourbutt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("irritateyourbutt_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonHemorrhoids() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(hamorrhoids);
					if (isElementPresent(hamorrhoids)) {
						clickElementUsingJavaScript(hamorrhoids);
						pageLoad();
					} else {
						throw new Exception("hamorrhoids are not Present on Page");
					}
					
				}	
				public void clickonIncorpartingmorefiber() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(incorpartingmorefibrediet);
					if (isElementPresent(incorpartingmorefibrediet)) {
						clickElementUsingJavaScript(incorpartingmorefibrediet);
						visibilityOf(incorpartingmorefibrediet_txt);
						boolean elementIsDisplayed=elementIsDisplayed(incorpartingmorefibrediet_txt);
						Assert.assertTrue(elementIsDisplayed(incorpartingmorefibrediet_txt));
						pageLoad();
					} else {
						throw new Exception("irritateyourbutt_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonPrepartionH() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(prepartionH);
					if (isElementPresent(prepartionH)) {
						clickElementUsingJavaScript(prepartionH);
						visibilityOf(prepartionH_txt);
						boolean elementIsDisplayed=elementIsDisplayed(prepartionH_txt);
						Assert.assertTrue(elementIsDisplayed(prepartionH_txt));
						System.out.println(getElementText(prepartionH_txt));
						pageLoad();
					} else {
						throw new Exception("prepartionH_txt are not Present on Page");
					}
					
				}	
				public void clickonLearnaboutHemorrhoids() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(learnabouthemorrhoids);
					if (isElementPresent(learnabouthemorrhoids)) {
						clickElementUsingJavaScript(learnabouthemorrhoids);
						visibilityOf(learnabouthemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(learnabouthemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(learnabouthemorrhoids_txt));
						clickElementUsingJavaScript(learnabouthemorrhoids_txt);
						pageLoad();
					} else {
						throw new Exception("learnabouthemorrhoids_txt are not Present on Page");
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
