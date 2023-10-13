package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephStresshemorrhoidsPage extends BaseClass{
	
	public PrephStresshemorrhoidsPage() {
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
	
	@FindBy(xpath = "//li[text()=' Can Stress Cause Hemorrhoids? ']")
	private static WebElement stresscausehemorrhoids_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section article-top-content odd last col-xs-12']//a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement hemorrhoids;	
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='digestion']")
	private static WebElement digestion;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement digestion_txt;
	
	@FindBy(xpath = "//a[text()='constipation']")
	private static WebElement constipation;
	
	@FindBy(xpath = "//h1[text()='The Link Between Stress and Constipation']")
	private static WebElement constipation_txt;
	
	@FindBy(xpath = "//a[text()='can cause hemorrhoid']")
	private static WebElement cancausehemorrhoid;
	
	@FindBy(xpath = "//h1[text()='Causes of Hemorrhoids']")
	private static WebElement cancausehemorrhoid_txt;
	
	@FindBy(xpath = "//a[text()='get your body moving']")
	private static WebElement getyourbodymoving;
	
	@FindBy(xpath = "//h1[text()='How Does Exercise Help Hemorrhoids?']")
	private static WebElement getyourbodymoving_txt;
	
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
				public void clickonStresscausehemmohoidsBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(stresscausehemorrhoids_Breadcrumbs);
					if (isElementPresent(stresscausehemorrhoids_Breadcrumbs)) {
						visibilityOf(stresscausehemorrhoids_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(stresscausehemorrhoids_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(stresscausehemorrhoids_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("stresscausehemorrhoids_Breadcrumbs are not Present on Page");
					}
					
				}		
				public void clickonHemorrhoids() throws Exception{
			    	waitForPageLoadJava();
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
				public void clickonDigestion() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(digestion);
					if (isElementPresent(digestion)) {
						clickElementUsingJavaScript(digestion);
						visibilityOf(digestion_txt);
						boolean elementIsDisplayed=elementIsDisplayed(digestion_txt);
						Assert.assertTrue(elementIsDisplayed(digestion_txt));
						System.out.println(getElementText(digestion_txt));
						pageLoad();
					} else {
						throw new Exception("digestion_txt are not Present on Page");
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
				public void clickonCancauseHemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(cancausehemorrhoid);
					moveToElement(cancausehemorrhoid);
					if (isElementPresent(cancausehemorrhoid)) {
						clickElementUsingJavaScript(cancausehemorrhoid);
						visibilityOf(cancausehemorrhoid_txt);
						boolean elementIsDisplayed=elementIsDisplayed(cancausehemorrhoid_txt);
						Assert.assertTrue(elementIsDisplayed(cancausehemorrhoid_txt));
						System.out.println(getElementText(cancausehemorrhoid_txt));
						pageLoad();
					} else {
						throw new Exception("cancausehemorrhoid_txt are not Present on Page");
					}
					
				}		
				public void clickongetyourbodymoving() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(getyourbodymoving);
					moveToElement(getyourbodymoving);
					if (isElementPresent(getyourbodymoving)) {
						clickElementUsingJavaScript(getyourbodymoving);
						visibilityOf(getyourbodymoving_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getyourbodymoving_txt);
						Assert.assertTrue(elementIsDisplayed(getyourbodymoving_txt));
						System.out.println(getElementText(getyourbodymoving_txt));
						pageLoad();
					} else {
						throw new Exception("getyourbodymoving_txt are not Present on Page");
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
