package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHhemorroidallfunPage extends BaseClass{
	
	public PrepHhemorroidallfunPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//a")
	private static WebElement Video_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section m-m-b-2 m-m-x-2 first odd col-xs-12 col-sm-6 col-lg-5']//h1")
	private static WebElement Video_txt_Breadcrumbs;			
	
	@FindBy(xpath = "//li[text()=' Hemorrhoids Ruin All the Fun. Not Anymore. ']")
	private static WebElement hemorroidruinall__Breadcrumbs;			
	
	@FindBy(xpath = "//h1[text()='Hemorrhoids Ruin All the Fun. Not Anymore.']")
	private static WebElement hemorroidruinall_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//img[@alt='Rapid Relief Spray with Lidocaine Video']")
	private static WebElement videobtn;	
	
	@FindBy(xpath = "//iframe[@title='Rapid Relief Spray with Lidocaine Video']")
	private static WebElement iframe;	
	
	@FindBy(xpath = "(//div[@class='ytp-cued-thumbnail-overlay-image'])[1]")
	private static WebElement videothumbnail;	
	
	@FindBy(xpath = "//button[@data-title-no-tooltip='Pause']")
	private static WebElement videoplayedbutton;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videodispaly_button;
	
	@FindBy(xpath = "//a[text()='How to Insert a PREPARATION H Suppository']")
	private static WebElement relatedvideos1;
	
	@FindBy(xpath = "//img[@title='a close-up of a syringe']")
	private static WebElement relatedvideos1_img;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement relatedvideos1_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement relatedvideos2;
	
	@FindBy(xpath = "//img[@title='PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement relatedvideos2_img;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-b-2 p-d-r-5 p-m-b-1 head-alt first odd col-xs-12']")
	private static WebElement relatedvideos2_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment with an Applicator']")
	private static WebElement relatedvideos3;
	
	@FindBy(xpath = "//img[@title='PREPARATION H Ointment with an Applicator']")
	private static WebElement relatedvideos3_img;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment with an Applicator']")
	private static WebElement relatedvideos3_txt;
	
	
	
	
	
	
	
	
	
	
	
	
	
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
				public void clickonVideo_Breadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(Video_Breadcrumbs);
					if (isElementPresent(Video_Breadcrumbs)) {
						clickElementUsingJavaScript(Video_Breadcrumbs);
						visibilityOf(Video_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(Video_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(Video_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("Video_txt_Breadcrumbs are not Present on Page");
					}
					
				}			
				public void clickonHemorroidruinallbreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(hemorroidruinall__Breadcrumbs);
					if (isElementPresent(hemorroidruinall__Breadcrumbs)) {
						visibilityOf(hemorroidruinall_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(hemorroidruinall_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(hemorroidruinall_txt_Breadcrumbs));
						System.out.println(getElementText(hemorroidruinall_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("hemorroidruinall_txt_Breadcrumbs are not Present on Page");
					}
					
				}			
				public void clickonVideoHemorroidRuinall() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(videobtn);
					if (isElementPresent(videobtn)) {
						clickElementUsingJavaScript(videobtn);
						moveToElement(iframe);
						switchToFrameUsingElement(iframe);
						visibilityOf(videothumbnail);
						actionClick(videothumbnail);
						boolean elementIsDisplayed=elementIsDisplayed(videothumbnail);
						Assert.assertTrue(elementIsDisplayed(videothumbnail));
						//actionClick(videodispaly_button);
						implicitWait();
						//clickElementUsingJavaScript(videoplayedbutton);
						frameSwitchingToDefaultContent();
						System.out.println("PrepartionH insertion is  Played Successfully on   Page");
						
						pageLoad();
					} else {
						throw new Exception("PrepartionH insertion is not Played Successfully on   Page");
					}
					
				}					
				public void clickonRelatedVideo1() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideos1);
					moveToElement(relatedvideos1);
					if (isElementPresent(relatedvideos1)) {
						visibilityOf(relatedvideos1_img);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideos1_img);
						Assert.assertTrue(elementIsDisplayed(relatedvideos1_img));
						clickElementUsingJavaScript(relatedvideos1);
						visibilityOf(relatedvideos1_txt);
						boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos1_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideos1_txt));
						System.out.println(getElementText(relatedvideos1_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvideo1_txt are not Present on Page");
					}
					
				}			
				public void clickonRelatedVideo2() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideos2);
					moveToElement(relatedvideos2);
					if (isElementPresent(relatedvideos2)) {
						visibilityOf(relatedvideos2_img);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideos2_img);
						Assert.assertTrue(elementIsDisplayed(relatedvideos2_img));
						clickElementUsingJavaScript(relatedvideos2);
						visibilityOf(relatedvideos2_txt);
						boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos2_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideos2_txt));
						System.out.println(getElementText(relatedvideos2_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvideo2_txt are not Present on Page");
					}
					
				}			
				public void clickonRelatedVideo3() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relatedvideos3);
					moveToElement(relatedvideos3);
					if (isElementPresent(relatedvideos3)) {
						visibilityOf(relatedvideos3_img);
						boolean elementIsDisplayed=elementIsDisplayed(relatedvideos3_img);
						Assert.assertTrue(elementIsDisplayed(relatedvideos3_img));
						clickElementUsingJavaScript(relatedvideos3);
						visibilityOf(relatedvideos3_txt);
						boolean elementIsDisplayed1=elementIsDisplayed(relatedvideos3_txt);
						Assert.assertTrue(elementIsDisplayed(relatedvideos3_txt));
						System.out.println(getElementText(relatedvideos3_txt));
						pageLoad();
					} else {
						throw new Exception("relatedvideo3_txt are not Present on Page");
					}
					
				}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
