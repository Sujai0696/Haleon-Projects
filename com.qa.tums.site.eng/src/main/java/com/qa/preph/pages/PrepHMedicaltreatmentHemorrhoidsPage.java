package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHMedicaltreatmentHemorrhoidsPage extends BaseClass{
	
	public PrepHMedicaltreatmentHemorrhoidsPage() {
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
	
	@FindBy(xpath = "//li[text()=' Medical Treatment ']")
	private static WebElement medicaltreatment_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='Medical Treatment of Hemorrhoids']")
	private static WebElement medicaltreatment_txt_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='Hemorrhoids are chronic']")
	private static WebElement hemorrhoidchronic;
	
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement hemorrhoidchronic_txt;
	
	@FindBy(xpath = "//a[text()='treatment options']")
	private static WebElement treatmentoptions;
	
	@FindBy(xpath = "//h1[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement treatmentoptions_txt;
	
	@FindBy(xpath = "//a[text()='lifestyle changes']")
	private static WebElement lifestylechanges;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-t-4 text-left-d text-center-m even col-xs-12']//h2")
	private static WebElement lifestylechanges_txt;
	
	@FindBy(xpath = "//a[text()='products like PREPARATION H']")
	private static WebElement productspreph;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement productsprephr_txt;
	
	@FindBy(xpath = "//a[text()='hemorrhoid flare-ups']")
	private static WebElement hemorrhoidflareups;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Flare-Ups']")
	private static WebElement hemorrhoidflareups_txt;
	
	@FindBy(xpath = "//a[text()='Personal Relief Finder']")
	private static WebElement personalrelieffinder;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement personalrelieffinder_txt;
	
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
				public void clickonMedicalTreatmentBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(medicaltreatment_Breadcrumbs);
					if (isElementPresent(medicaltreatment_Breadcrumbs)) {
						
						visibilityOf(medicaltreatment_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(medicaltreatment_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(medicaltreatment_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("medicaltreatment_Breadcrumbs are not Present on Page");
					}
					
				}			
				public void clickonHemorrhoidchronic() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(hemorrhoidchronic);
					if (isElementPresent(hemorrhoidchronic)) {
						clickElementUsingJavaScript(hemorrhoidchronic);
						visibilityOf(hemorrhoidchronic_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidchronic_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidchronic_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidchronic_txt are not Present on Page");
					}
					
				}			
				public void clickontreatmentoptions() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treatmentoptions);
					moveToElement(treatmentoptions);
					if (isElementPresent(treatmentoptions)) {
						clickElementUsingJavaScript(treatmentoptions);
						visibilityOf(treatmentoptions_txt);
						boolean elementIsDisplayed=elementIsDisplayed(treatmentoptions_txt);
						Assert.assertTrue(elementIsDisplayed(treatmentoptions_txt));
						System.out.println(getElementText(treatmentoptions_txt));
						pageLoad();
					} else {
						throw new Exception("treatmentoptions_txt are not Present on Page");
					}
					
				}			
				public void clickonlifestylechanges() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(lifestylechanges);
					moveToElement(lifestylechanges);
					if (isElementPresent(lifestylechanges)) {
						clickElementUsingJavaScript(lifestylechanges);
						visibilityOf(lifestylechanges_txt);
						boolean elementIsDisplayed=elementIsDisplayed(lifestylechanges_txt);
						Assert.assertTrue(elementIsDisplayed(lifestylechanges_txt));
						System.out.println(getElementText(lifestylechanges_txt));
						pageLoad();
					} else {
						throw new Exception("lifestylechanges_txt are not Present on Page");
					}
					
				}			
				public void clickonProductsPrepH() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(productspreph);
					moveToElement(productspreph);
					if (isElementPresent(productspreph)) {
						clickElementUsingJavaScript(productspreph);
						visibilityOf(productsprephr_txt);
						boolean elementIsDisplayed=elementIsDisplayed(productsprephr_txt);
						Assert.assertTrue(elementIsDisplayed(productsprephr_txt));
						System.out.println(getElementText(productsprephr_txt));
						pageLoad();
					} else {
						throw new Exception("productsprephr_txt are not Present on Page");
					}
					
				}			
				public void clickonHemorrhoidflareups() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidflareups);
					moveToElement(hemorrhoidflareups);
					if (isElementPresent(hemorrhoidflareups)) {
						clickElementUsingJavaScript(hemorrhoidflareups);
						visibilityOf(hemorrhoidflareups_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidflareups_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidflareups_txt));
						System.out.println(getElementText(hemorrhoidflareups_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidflareups_txt are not Present on Page");
					}
					
				}			
				public void clickonPersonalReliefFinder() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(personalrelieffinder);
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
