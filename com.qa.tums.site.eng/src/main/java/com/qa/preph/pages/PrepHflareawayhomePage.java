package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHflareawayhomePage extends BaseClass{
	
	public PrepHflareawayhomePage() {
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
	
	@FindBy(xpath = "//li[text()=' Treating Flare-Ups Away From Home ']")
	private static WebElement treatingflarehome_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='hemorrhoid flare-up']")
	private static WebElement hemorrhoidsflareup;		
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoidsflareup_txt;	
	
	@FindBy(xpath = "//a[text()='bathrooms']")
	private static WebElement bathrooms;	
	
	@FindBy(xpath = "//h1[text()='Healthy Bathroom Habits']")
	private static WebElement bathrooms_txt;
	
	@FindBy(xpath = "//a[text()='Preparation H Totables']")
	private static WebElement prepartionHtotables;
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement prepartionHtotables_txt;
	
	@FindBy(xpath = "//a[text()='cause constipation']")
	private static WebElement causeconstipation;
	
	@FindBy(xpath = "//h1[text()='The Link Between Stress and Constipation']")
	private static WebElement causeconstipation_txt;
	
	@FindBy(xpath = "(//a[text()='hemorrhoids'])[1]")
	private static WebElement hemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement hemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='avoid constipation']")
	private static WebElement avoidconstipation;
	
	@FindBy(xpath = "//h1[text()='How to Travel if You Have GI Problems']")
	private static WebElement avoidconstipation_txt;
	
	@FindBy(xpath = "//a[text()='balanced, high-fiber diet']")
	private static WebElement balancehighfibrediet;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement balancehighfibrediet_txt;
	
	@FindBy(xpath = "//a[text()='exercises']")
	private static WebElement exercise;
	
	@FindBy(xpath = "//h1[text()='How Does Exercise Help Hemorrhoids?']")
	private static WebElement exercise_txt;
	
	@FindBy(xpath = "//a[text()='dining out']")
	private static WebElement diningout;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Diet']")
	private static WebElement diningout_txt;
	
	@FindBy(xpath = "(//a[text()='hemorrhoids'])[2]")
	private static WebElement hemorrhoids1;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement hemorrhoids1_txt;
	
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
		public void clickonTreatingflarehomeBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(treatingflarehome_Breadcrumbs);
			if (isElementPresent(treatingflarehome_Breadcrumbs)) {
				visibilityOf(treatingflarehome_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(treatingflarehome_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(treatingflarehome_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("treatingflarehome_Breadcrumbs are not Present on Page");
			}
			
		}		
		public void clickonHemorrhoidsflareup() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(hemorrhoidsflareup);
			if (isElementPresent(hemorrhoidsflareup)) {
				clickElementUsingJavaScript(hemorrhoidsflareup);
				visibilityOf(hemorrhoidsflareup_txt);
				boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidsflareup_txt);
				Assert.assertTrue(elementIsDisplayed(hemorrhoidsflareup_txt));
				pageLoad();
			} else {
				throw new Exception("hemorrhoidsflareup_txt are not Present on Page");
			}
			
		}		
		public void clickonBathrooms() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(bathrooms);
			moveToElement(bathrooms);
			if (isElementPresent(bathrooms)) {
				clickElementUsingJavaScript(bathrooms);
				visibilityOf(bathrooms_txt);
				boolean elementIsDisplayed=elementIsDisplayed(bathrooms_txt);
				Assert.assertTrue(elementIsDisplayed(bathrooms_txt));
				System.out.println(getElementText(bathrooms_txt));
				pageLoad();
			} else {
				throw new Exception("bathrooms_txt are not Present on Page");
			}
			
		}		
		public void clickonPrepartionHtotables() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(prepartionHtotables);
			moveToElement(prepartionHtotables);
			if (isElementPresent(prepartionHtotables)) {
				clickElementUsingJavaScript(prepartionHtotables);
				visibilityOf(prepartionHtotables_txt);
				boolean elementIsDisplayed=elementIsDisplayed(prepartionHtotables_txt);
				Assert.assertTrue(elementIsDisplayed(prepartionHtotables_txt));
				System.out.println(getElementText(prepartionHtotables_txt));
				pageLoad();
			} else {
				throw new Exception("prepartionHtotables_txt are not Present on Page");
			}
			
		}		
		public void clickoncauseConstipation() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(causeconstipation);
			moveToElement(causeconstipation);
			if (isElementPresent(causeconstipation)) {
				clickElementUsingJavaScript(causeconstipation);
				visibilityOf(causeconstipation_txt);
				boolean elementIsDisplayed=elementIsDisplayed(causeconstipation_txt);
				Assert.assertTrue(elementIsDisplayed(causeconstipation_txt));
				System.out.println(getElementText(causeconstipation_txt));
				pageLoad();
			} else {
				throw new Exception("causeconstipation_txt are not Present on Page");
			}
			
		}		
		public void clickonHemmorhoids() throws Exception{
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
	
		public void clickonAvoidConstipation() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(avoidconstipation);
			moveToElement(avoidconstipation);
			if (isElementPresent(avoidconstipation)) {
				clickElementUsingJavaScript(avoidconstipation);
				visibilityOf(avoidconstipation_txt);
				boolean elementIsDisplayed=elementIsDisplayed(avoidconstipation_txt);
				Assert.assertTrue(elementIsDisplayed(avoidconstipation_txt));
				System.out.println(getElementText(avoidconstipation_txt));
				pageLoad();
			} else {
				throw new Exception("avoidconstipation_txt are not Present on Page");
			}
			
		}		
		public void clickonBalancehighfibrediet() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(balancehighfibrediet);
			moveToElement(balancehighfibrediet);
			if (isElementPresent(balancehighfibrediet)) {
				clickElementUsingJavaScript(balancehighfibrediet);
				visibilityOf(balancehighfibrediet_txt);
				boolean elementIsDisplayed=elementIsDisplayed(balancehighfibrediet_txt);
				Assert.assertTrue(elementIsDisplayed(balancehighfibrediet_txt));
				System.out.println(getElementText(balancehighfibrediet_txt));
				pageLoad();
			} else {
				throw new Exception("balancehighfibrediet_txt are not Present on Page");
			}
			
		}		
		public void clickonExercise() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(exercise);
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
		public void clickonDiningout() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(diningout);
			moveToElement(diningout);
			if (isElementPresent(diningout)) {
				clickElementUsingJavaScript(diningout);
				visibilityOf(diningout_txt);
				boolean elementIsDisplayed=elementIsDisplayed(diningout_txt);
				Assert.assertTrue(elementIsDisplayed(diningout_txt));
				System.out.println(getElementText(diningout_txt));
				pageLoad();
			} else {
				throw new Exception("diningout_txt are not Present on Page");
			}
			
		}		
		public void clickonHemorrhoids1() throws Exception{
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
