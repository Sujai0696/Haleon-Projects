package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
public class PrepHdiscomfortwhensittingPage extends BaseClass{
	
	public PrepHdiscomfortwhensittingPage() {
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
	
	@FindBy(xpath = "//li[text()=' 5 Things That Can Cause Discomfort When Sitting ']")
	private static WebElement discomfortwhilesitting_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='common causes']")
	private static WebElement commoncause;
	
	@FindBy(xpath = "//h1[text()='Causes of Hemorrhoids']")
	private static WebElement commoncause_txt;
	
	@FindBy(xpath = "//a[text()='find relief']")
	private static WebElement findrelief;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement findrelief_txt;
	
	@FindBy(xpath = "//a[text()='hemorrhoids']")
	private static WebElement hemorrhoids;
	
	@FindBy(xpath = "//div[@class='box component section article-top-box first odd col-xs-12']//h1")
	private static WebElement hemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='treating with a cream like Preparation H']")
	private static WebElement treatingcreamprepH;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement treatingcreamprepH_txt;
	
	@FindBy(xpath = "//a[text()='relieve symptoms']")
	private static WebElement relievesymptoms;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Symptoms']")
	private static WebElement relievesymptoms_txt;
	
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
				public void clickonDiscomfortwhilesittingBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(discomfortwhilesitting_Breadcrumbs);
					if (isElementPresent(discomfortwhilesitting_Breadcrumbs)) {
						visibilityOf(discomfortwhilesitting_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(discomfortwhilesitting_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(discomfortwhilesitting_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("discomfortwhilesitting_Breadcrumbs are not Present on Page");
					}
					
				}		
				public void clickoncommoncause() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(commoncause);
					if (isElementPresent(commoncause)) {
						clickElementUsingJavaScript(commoncause);
						visibilityOf(commoncause_txt);
						boolean elementIsDisplayed=elementIsDisplayed(commoncause_txt);
						Assert.assertTrue(elementIsDisplayed(commoncause_txt));
						System.out.println(getElementText(commoncause_txt));
						pageLoad();
					} else {
						throw new Exception("commoncause_txt are not Present on Page");
					}
					
				}		
				public void clickonFindRelief() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(findrelief);
					if (isElementPresent(findrelief)) {
						clickElementUsingJavaScript(findrelief);
						visibilityOf(findrelief_txt);
						boolean elementIsDisplayed=elementIsDisplayed(findrelief_txt);
						Assert.assertTrue(elementIsDisplayed(findrelief_txt));
						System.out.println(getElementText(findrelief_txt));
						pageLoad();
					} else {
						throw new Exception("findrelief_txt are not Present on Page");
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
				public void clickonTreatingCreamePrepH() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treatingcreamprepH);
					moveToElement(treatingcreamprepH);
					if (isElementPresent(treatingcreamprepH)) {
						clickElementUsingJavaScript(treatingcreamprepH);
						visibilityOf(treatingcreamprepH_txt);
						boolean elementIsDisplayed=elementIsDisplayed(treatingcreamprepH_txt);
						Assert.assertTrue(elementIsDisplayed(treatingcreamprepH_txt));
						System.out.println(getElementText(treatingcreamprepH_txt));
						pageLoad();
					} else {
						throw new Exception("treatingcreamprepH_txt are not Present on Page");
					}
					
				}		
				public void clickonRelieveSymptoms() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relievesymptoms);
					moveToElement(relievesymptoms);
					if (isElementPresent(relievesymptoms)) {
						clickElementUsingJavaScript(relievesymptoms);
						visibilityOf(relievesymptoms_txt);
						boolean elementIsDisplayed=elementIsDisplayed(relievesymptoms_txt);
						Assert.assertTrue(elementIsDisplayed(relievesymptoms_txt));
						System.out.println(getElementText(relievesymptoms_txt));
						pageLoad();
					} else {
						throw new Exception("relievesymptoms_txt are not Present on Page");
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
