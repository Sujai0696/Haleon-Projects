package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHWitchhazelhemorrhoidsPage extends BaseClass{
	
	public PrepHWitchhazelhemorrhoidsPage() {
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
			
	@FindBy(xpath = "//li[text()=' Witch Hazel for Hemorrhoids ']")
	private static WebElement witchhazelhemorrhoids_Breadcrumbs;
	
	@FindBy(xpath = "//h1[text()='Can You Use Witch Hazel for Hemorrhoids?']")
	private static WebElement witchhazelhemorrhoids_txt_Breadcrumbs;
	
	@FindBy(xpath = "(//div[@class='richText component section default-style even last col-xs-12']//a[text()='Medicated Wipes'])[1]")
	private static WebElement medicatedwipes;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatedwipes_txt;
	
	@FindBy(xpath = "(//a[text()='Cooling Gel'])[1]")
	private static WebElement coolinggel;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolinggel_txt;
	
	@FindBy(xpath = "//a[text()='Soothing Relief Cleansing & Cooling Wipes']")
	private static WebElement soothingreliefwipes;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement soothingreliefwipes_txt;
	
	@FindBy(xpath = "(//a[@href='/products/medicated-portable-wipes/'])[3]")
	private static WebElement medicatepwipes1;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatepwipes1_txt;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes for Women']")
	private static WebElement medicatepwipeswomen;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes for Women']")
	private static WebElement medicatepwipeswomen_txt;
	
	@FindBy(xpath = "(//a[@href='/products/cooling-gel/'])[3]")
	private static WebElement coolinggel1;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolinggel1_txt;
	
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
		public void clickonwitchghazelhemorrhoidsBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(witchhazelhemorrhoids_Breadcrumbs);
			if (isElementPresent(witchhazelhemorrhoids_Breadcrumbs)) {
				
				visibilityOf(witchhazelhemorrhoids_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(witchhazelhemorrhoids_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(witchhazelhemorrhoids_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("witchhazelhemorrhoids_txt_Breadcrumbs are not Present on Page");
			}
			
		}		
		public void clickonMedicatedWipes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(medicatedwipes);
			if (isElementPresent(medicatedwipes)) {
				clickElementUsingJavaScript(medicatedwipes);
				visibilityOf(medicatedwipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatedwipes_txt);
				Assert.assertTrue(elementIsDisplayed(medicatedwipes_txt));
				System.out.println(getElementText(medicatedwipes_txt));
				pageLoad();
			} else {
				throw new Exception("medicatedwipes_txt are not Present on Page");
			}
			
		}		
		public void clickonCoolinggel() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(coolinggel);
			if (isElementPresent(coolinggel)) {
				clickElementUsingJavaScript(coolinggel);
				visibilityOf(coolinggel_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coolinggel_txt);
				Assert.assertTrue(elementIsDisplayed(coolinggel_txt));
				System.out.println(getElementText(coolinggel_txt));
				pageLoad();
			} else {
				throw new Exception("coolinggel_txt are not Present on Page");
			}
			
		}		
		public void clickonsoothingReliefwipes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(soothingreliefwipes);
			if (isElementPresent(soothingreliefwipes)) {
				clickElementUsingJavaScript(soothingreliefwipes);
				visibilityOf(soothingreliefwipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(soothingreliefwipes_txt);
				Assert.assertTrue(elementIsDisplayed(soothingreliefwipes_txt));
				System.out.println(getElementText(soothingreliefwipes_txt));
				pageLoad();
			} else {
				throw new Exception("soothingreliefwipes_txt are not Present on Page");
			}
			
		}		
		public void clickonMedicatedwipes1() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(medicatepwipes1);
			if (isElementPresent(medicatepwipes1)) {
				clickElementUsingJavaScript(medicatepwipes1);
				visibilityOf(medicatepwipes1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatepwipes1_txt);
				Assert.assertTrue(elementIsDisplayed(medicatepwipes1_txt));
				System.out.println(getElementText(medicatepwipes1_txt));
				pageLoad();
			} else {
				throw new Exception("medicatepwipes1_txt are not Present on Page");
			}
			
		}		
		public void clickonMedicatedwipeswomen() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(medicatepwipeswomen);
			if (isElementPresent(medicatepwipeswomen)) {
				clickElementUsingJavaScript(medicatepwipeswomen);
				visibilityOf(medicatepwipeswomen_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatepwipeswomen_txt);
				Assert.assertTrue(elementIsDisplayed(medicatepwipeswomen_txt));
				System.out.println(getElementText(medicatepwipeswomen_txt));
				pageLoad();
			} else {
				throw new Exception("medicatepwipeswomen_txt are not Present on Page");
			}
			
		}		
		public void clickoncoolinggel1() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(coolinggel1);
			moveToElement(coolinggel1);
			if (isElementPresent(coolinggel1)) {
				clickElementUsingJavaScript(coolinggel1);
				visibilityOf(coolinggel1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coolinggel1_txt);
				Assert.assertTrue(elementIsDisplayed(coolinggel1_txt));
				System.out.println(getElementText(coolinggel1_txt));
				pageLoad();
			} else {
				throw new Exception("coolinggel1_txt are not Present on Page");
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
