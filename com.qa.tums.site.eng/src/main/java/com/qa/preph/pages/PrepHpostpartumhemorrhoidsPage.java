package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHpostpartumhemorrhoidsPage extends BaseClass{
	
	public PrepHpostpartumhemorrhoidsPage() {
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
	
	@FindBy(xpath = "//li[text()=' All About Postpartum Hemorrhoids ']")
	private static WebElement postpatuumhemorrhoids_Breadcrumbs;			
	
	@FindBy(xpath = "//h1[text()='All About Postpartum Hemorrhoids']")
	private static WebElement postpatuumhemorrhoids_txt_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='internal hemorrhoid']")
	private static WebElement internalhemorrhoid;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement internalhemorrhoid_txt;
	
	@FindBy(xpath = "//a[text()='constipation']")
	private static WebElement constipation;
	
	@FindBy(xpath = "//h1[text()='The Link Between Stress and Constipation']")
	private static WebElement constipation_txt;
	
	@FindBy(xpath = "//a[text()='healthy bathroom habits']")
	private static WebElement healthybathroomhabits;
	
	@FindBy(xpath = "//h1[text()='Healthy Bathroom Habits']")
	private static WebElement healthybathroomhabits_txt;
	
	@FindBy(xpath = "//a[text()='treatments']")
	private static WebElement treatments;
	
	@FindBy(xpath = "//h1[text()='Medical Treatment of Hemorrhoids']")
	private static WebElement treatments_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H']")
	private static WebElement prepartionH;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement prepartionH_txt;
	
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
			public void clickonPostpartumHemorroidsBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(postpatuumhemorrhoids_Breadcrumbs);
				if (isElementPresent(postpatuumhemorrhoids_Breadcrumbs)) {
					
					visibilityOf(postpatuumhemorrhoids_txt_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(postpatuumhemorrhoids_txt_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(postpatuumhemorrhoids_txt_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("postpatuumhemorrhoids_txt_Breadcrumbs are not Present on Page");
				}
				
			}			
	
			public void clickonInternalHemorrhoids() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(internalhemorrhoid);
				if (isElementPresent(internalhemorrhoid)) {
					clickElementUsingJavaScript(internalhemorrhoid);
					visibilityOf(internalhemorrhoid_txt);
					boolean elementIsDisplayed=elementIsDisplayed(internalhemorrhoid_txt);
					Assert.assertTrue(elementIsDisplayed(internalhemorrhoid_txt));
					System.out.println(getElementText(internalhemorrhoid_txt));
					pageLoad();
				} else {
					throw new Exception("internalhemorrhoid_txt are not Present on Page");
				}
				
			}			
			public void clickonConstipation() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(constipation);
				if (isElementPresent(constipation)) {
					clickElementUsingJavaScript(constipation);
					visibilityOf(constipation_txt);
					boolean elementIsDisplayed=elementIsDisplayed(constipation_txt);
					Assert.assertTrue(elementIsDisplayed(constipation_txt));
					System.out.println(getElementText(constipation_txt));
					pageLoad();
				} else {
					throw new Exception("constipation_txt are not Present on Page");
				}
				
			}			
			public void clickonHealthybathroom() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(healthybathroomhabits);
				if (isElementPresent(healthybathroomhabits)) {
					clickElementUsingJavaScript(healthybathroomhabits);
					visibilityOf(healthybathroomhabits_txt);
					boolean elementIsDisplayed=elementIsDisplayed(healthybathroomhabits_txt);
					Assert.assertTrue(elementIsDisplayed(healthybathroomhabits_txt));
					System.out.println(getElementText(healthybathroomhabits_txt));
					pageLoad();
				} else {
					throw new Exception("healthybathroomhabits_txt are not Present on Page");
				}
				
			}			
			public void clickonTreatmentHemorrhoids() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(treatments);
				moveToElement(treatments);
				if (isElementPresent(treatments)) {
					clickElementUsingJavaScript(treatments);
					visibilityOf(treatments_txt);
					boolean elementIsDisplayed=elementIsDisplayed(treatments_txt);
					Assert.assertTrue(elementIsDisplayed(treatments_txt));
					System.out.println(getElementText(treatments_txt));
					pageLoad();
				} else {
					throw new Exception("treatments_txt are not Present on Page");
				}
				
			}			
			public void clickonPrepartionH() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(prepartionH);
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
