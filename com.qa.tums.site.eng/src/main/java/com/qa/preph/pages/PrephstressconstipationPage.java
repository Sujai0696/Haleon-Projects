package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephstressconstipationPage extends BaseClass{
	
	public PrephstressconstipationPage() {
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
	
	@FindBy(xpath = "//li[text()=' Stress and Constipation ']")
	private static WebElement StressConstipation_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='healthy, fiber-rich diet']")
	private static WebElement healthyfibrerichdiet;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement healthyfibrerichdiet_txt;
	
	@FindBy(xpath = "(//div[@class='richText component section default-style even last col-xs-12']//child::a[text()='hemorrhoids'])[1]")
	private static WebElement hemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement hemorrhoids_txt;
	
	@FindBy(xpath = "//div[@class='richText component section default-style even last col-xs-12']//a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement hemorrhoids1;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoids1_txt;
	
	
	@FindBy(xpath = "//a[text()='find relief today']")
	private static WebElement findrelieftoday;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement findrelieftoday_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H']")
	private static WebElement prepartionh;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement prepartionh_txt;
	
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
			public void clickonStressConstipationBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(StressConstipation_Breadcrumbs);
				if (isElementPresent(StressConstipation_Breadcrumbs)) {
					visibilityOf(StressConstipation_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(StressConstipation_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(StressConstipation_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("StressConstipation_Breadcrumbs are not Present on Page");
				}
				
			}	
	
			public void clickonHealthyFibrerichDiet() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(healthyfibrerichdiet);
				moveToElement(healthyfibrerichdiet);
				if (isElementPresent(healthyfibrerichdiet)) {
					clickElementUsingJavaScript(healthyfibrerichdiet);
					visibilityOf(healthyfibrerichdiet_txt);
					boolean elementIsDisplayed=elementIsDisplayed(healthyfibrerichdiet_txt);
					Assert.assertTrue(elementIsDisplayed(healthyfibrerichdiet_txt));
					System.out.println(getElementText(healthyfibrerichdiet_txt));
					pageLoad();
				} else {
					throw new Exception("healthyfibrerichdiet_txt are not Present on Page");
				}
				
			}	
			public void clickonhemmorrhoids() throws Exception{
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
			public void clickonhemmorrhoids1() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(hemorrhoids1);
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
			public void clickonFindReliefToday() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(findrelieftoday);
				moveToElement(findrelieftoday);
				if (isElementPresent(findrelieftoday)) {
					clickElementUsingJavaScript(findrelieftoday);
					visibilityOf(findrelieftoday_txt);
					boolean elementIsDisplayed=elementIsDisplayed(findrelieftoday_txt);
					Assert.assertTrue(elementIsDisplayed(findrelieftoday_txt));
					System.out.println(getElementText(findrelieftoday_txt));
					pageLoad();
				} else {
					throw new Exception("findrelieftoday_txt are not Present on Page");
				}
				
			}	
			public void clickonPrepartionH() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(prepartionh);
				moveToElement(prepartionh);
				if (isElementPresent(prepartionh)) {
					clickElementUsingJavaScript(prepartionh);
					visibilityOf(prepartionh_txt);
					boolean elementIsDisplayed=elementIsDisplayed(prepartionh_txt);
					Assert.assertTrue(elementIsDisplayed(prepartionh_txt));
					System.out.println(getElementText(prepartionh_txt));
					pageLoad();
				} else {
					throw new Exception("prepartionh_txt are not Present on Page");
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
