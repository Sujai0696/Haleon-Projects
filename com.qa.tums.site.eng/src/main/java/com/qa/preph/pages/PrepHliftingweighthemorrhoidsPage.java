package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHliftingweighthemorrhoidsPage extends BaseClass{
	
	public PrepHliftingweighthemorrhoidsPage() {
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
		
	@FindBy(xpath = "//li[text()=' Could Lifting Weights Give You Hemorrhoids? ']")
	private static WebElement liftingweights_Breadcrumbs;
	
	@FindBy(xpath = "(//a[text()='hemorrhoids'])[1]")
	private static WebElement hemorrhoids1;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoids1_txt;
	
	@FindBy(xpath = "(//a[text()='hemorrhoids'])[2]")
	private static WebElement hemorrhoids2;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement hemorrhoids2_txt;
	
	@FindBy(xpath = "//a[text()='exercise prevents hemorrhoids']")
	private static WebElement exercisepreventshemorrhoids;
	
	@FindBy(xpath = "//h1[text()='How Does Exercise Help Hemorrhoids?']")
	private static WebElement exercisepreventshemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='treat persistently painful hemorrhoids']")
	private static WebElement treatpersistentlypainfulhemorrhoids;
	
	@FindBy(xpath = "//h1[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement treatpersistentlypainfulhemorrhoids_txt;
	
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
				public void clickonLiftingWeightsBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(liftingweights_Breadcrumbs);
					if (isElementPresent(liftingweights_Breadcrumbs)) {
						visibilityOf(liftingweights_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(liftingweights_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(liftingweights_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("liftingweights_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonHemorrhoids1() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(hemorrhoids1);
					if (isElementPresent(hemorrhoids1)) {
						clickElementUsingJavaScript(hemorrhoids1);
						visibilityOf(hemorrhoids1_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoids1_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoids1_txt));
						System.out.println(getElementText(hemorrhoids1_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoids1_txt are not Present on Page");
					}
					
				}	
				public void clickonHemorrhoids2() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(hemorrhoids2);
					if (isElementPresent(hemorrhoids2)) {
						clickElementUsingJavaScript(hemorrhoids2);
						visibilityOf(hemorrhoids2_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoids2_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoids2_txt));
						System.out.println(getElementText(hemorrhoids2_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoids2_txt are not Present on Page");
					}
					
				}	
				public void clickonExercisepreventsHemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(exercisepreventshemorrhoids);
					moveToElement(exercisepreventshemorrhoids);
					if (isElementPresent(exercisepreventshemorrhoids)) {
						clickElementUsingJavaScript(exercisepreventshemorrhoids);
						visibilityOf(exercisepreventshemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(exercisepreventshemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(exercisepreventshemorrhoids_txt));
						System.out.println(getElementText(exercisepreventshemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("exercisepreventshemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonTreatpersententlypainfulhermmohoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treatpersistentlypainfulhemorrhoids);
					moveToElement(treatpersistentlypainfulhemorrhoids);
					if (isElementPresent(treatpersistentlypainfulhemorrhoids)) {
						clickElementUsingJavaScript(treatpersistentlypainfulhemorrhoids);
						visibilityOf(treatpersistentlypainfulhemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(treatpersistentlypainfulhemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(treatpersistentlypainfulhemorrhoids_txt));
						System.out.println(getElementText(treatpersistentlypainfulhemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("treatpersistentlypainfulhemorrhoids_txt are not Present on Page");
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
