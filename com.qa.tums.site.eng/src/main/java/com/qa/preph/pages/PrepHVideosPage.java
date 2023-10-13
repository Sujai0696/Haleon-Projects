package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHVideosPage extends BaseClass{
	
	public PrepHVideosPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;	
	
	@FindBy(xpath = "//img[@title='How to Insert a Preparation H Suppository']")
	private static WebElement InsertPrephVideo;	
	
	@FindBy(xpath = "//a[@data='How to Insert a Preparation H Suppository']")
	private static WebElement InsertPrephVideo_button;	
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement InsertPrephVideo_display;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement InsertPrephVideo_videoscreen;
	
	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframe;
	
	//2nd video..
	
	@FindBy(xpath = "//img[@title='How to Apply Preparation H Ointment, Gels and Creams']")
	private static WebElement ointmentVideo;
	
	@FindBy(xpath = "//a[@data='How to Apply Preparation H Ointment, Gels and Creams']")
	private static WebElement ointmentVideo_button;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement ointmentVideo_videoscreen;
	
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement ointmentVideo_display;
	
	@FindBy(xpath = "//img[@title='How to Apply Preparation H Multi-Symptom Pain Relief Cream']")
	private static WebElement multisymptomscreame;
	
	@FindBy(xpath = "//a[@data='How to Apply Preparation H Multi-Symptom Pain Relief Cream']")
	private static WebElement multisymptomscreame_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement multisymptomscreame_display;
	
	
	@FindBy(xpath = "//img[@title='How to Apply Preparation H Ointment with an Applicator']")
	private static WebElement applicator;
	
	@FindBy(xpath = "//a[@data='How to Apply Preparation H Ointment with an Applicator']")
	private static WebElement applicator_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement applicator_display;
	
	@FindBy(xpath = "//img[@title='Hemorrhoids Ruin All the Fun.']")
	private static WebElement hemorrhoidsruin;
	
	@FindBy(xpath = "//a[@data='Hemorrhoids Ruin All the Fun.']")
	private static WebElement hemorrhoidsruin_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement hemorrhoidsruin_display;
	
	@FindBy(xpath = "(//div[@class='box component section related-article first odd last col-xs-12']//img)[6]")
	private static WebElement dontfeelremorse;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement dontfeelremorse_display;
	
	@FindBy(xpath = "(//a[@class='icon-video-play'])[6]")
	private static WebElement dontfeelremorse_button;
	
	@FindBy(xpath = "//img[@title='What Are Hemorrhoids?']")
	private static WebElement whatarehemorrhoids;
	
	@FindBy(xpath = "//a[@data='What Are Hemorrhoids?']")
	private static WebElement whatarehemorrhoids_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement whatarehemorrhoids_display;
	
	@FindBy(xpath = "//img[@title='How to Treat Hemorrhoid Symptoms']")
	private static WebElement treathemorrhoidsymptoms;
	
	@FindBy(xpath = "//a[@data='How to Treat Hemorrhoid Symptoms']")
	private static WebElement treathemorrhoidsymptoms_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement treathemorrhoidsymptoms_display;
	
	@FindBy(xpath = "//img[@title='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement postartumcare;
	
	@FindBy(xpath = "//a[@data='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement postartumcare_button;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement postartumcare_display;
	
	
	
	
	
	
	
	
	
	
	
	
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
			public void clickonInsertPrepHvideos() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(InsertPrephVideo);
				moveToElement(InsertPrephVideo);
				if (isElementPresent(InsertPrephVideo)) {
					clickElementUsingJavaScript(InsertPrephVideo);
					//switchToFrameUsingElement(iframe);
					moveToElement(InsertPrephVideo_button);
					actionClick(InsertPrephVideo_button);
					visibilityOf(InsertPrephVideo_display);
					boolean elementIsDisplayed=elementIsDisplayed(InsertPrephVideo_display);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println("YouTube for InsertPrepH is displayed successfully on Page");
					
				}	//frameSwitchingToDefaultContent();
					
				
			}	
				public void clickonOintmentgelsvideos() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(ointmentVideo);
					moveToElement(ointmentVideo);
					if (isElementPresent(ointmentVideo)) {
						clickElementUsingJavaScript(ointmentVideo);
						//switchToFrameUsingElement(iframe);
						moveToElement(ointmentVideo_button);
						actionClick(ointmentVideo_button);
						visibilityOf(ointmentVideo_display);
						boolean elementIsDisplayed=elementIsDisplayed(ointmentVideo_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for Ointment,gels and cream is displayed successfully on Page");
					}
						else {
							System.out.println("YouTube for Ointment,gels and cream is  not displayed  on Page");
						}
					}
				public void clickonMultisymptomscreame() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(multisymptomscreame);
					moveToElement(multisymptomscreame);
					if (isElementPresent(multisymptomscreame)) {
						clickElementUsingJavaScript(multisymptomscreame);
						//switchToFrameUsingElement(iframe);
						moveToElement(multisymptomscreame_button);
						actionClick(multisymptomscreame_button);
						visibilityOf(multisymptomscreame_display);
						boolean elementIsDisplayed=elementIsDisplayed(multisymptomscreame_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for multisymptomscreame_displayis displayed successfully on Page");
					}
						else {
							System.out.println("YouTube for multisymptomscreame_display is  not displayed  on Page");
						}
					}
				public void clickonApplicator() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(applicator);
					moveToElement(applicator);
					if (isElementPresent(applicator)) {
						clickElementUsingJavaScript(applicator);
						//switchToFrameUsingElement(iframe);
						moveToElement(applicator_button);
						actionClick(applicator_button);
						visibilityOf(applicator_display);
						boolean elementIsDisplayed=elementIsDisplayed(applicator_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for applicator_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for applicator_display is  not displayed  on Page");
						}
					}
				public void clickonHemorrhoidsruin() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidsruin);
					moveToElement(hemorrhoidsruin);
					if (isElementPresent(hemorrhoidsruin)) {
						clickElementUsingJavaScript(hemorrhoidsruin);
						//switchToFrameUsingElement(iframe);
						moveToElement(hemorrhoidsruin_button);
						actionClick(hemorrhoidsruin_button);
						visibilityOf(hemorrhoidsruin_display);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidsruin_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for hemorrhoidsruin_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for hemorrhoidsruin_display is  not displayed  on Page");
						}
					}
				public void clickonDontfeelremorse() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(dontfeelremorse);
					moveToElement(dontfeelremorse);
					if (isElementPresent(dontfeelremorse)) {
						clickElementUsingJavaScript(dontfeelremorse);
						//switchToFrameUsingElement(iframe);
						moveToElement(dontfeelremorse_button);
						actionClick(dontfeelremorse_button);
						visibilityOf(dontfeelremorse_display);
						boolean elementIsDisplayed=elementIsDisplayed(dontfeelremorse_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for dontfeelremorse_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for dontfeelremorse_display is  not displayed  on Page");
						}
					}
				public void clickonwhatarehemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(whatarehemorrhoids);
					moveToElement(whatarehemorrhoids);
					if (isElementPresent(whatarehemorrhoids)) {
						clickElementUsingJavaScript(whatarehemorrhoids);
						//switchToFrameUsingElement(iframe);
						moveToElement(whatarehemorrhoids_button);
						actionClick(whatarehemorrhoids_button);
						visibilityOf(whatarehemorrhoids_display);
						boolean elementIsDisplayed=elementIsDisplayed(whatarehemorrhoids_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for whatarehemorrhoids_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for whatarehemorrhoids_display is  not displayed  on Page");
						}
					}
				public void clickontreathemorrhoidssymptoms() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treathemorrhoidsymptoms);
					moveToElement(treathemorrhoidsymptoms);
					if (isElementPresent(treathemorrhoidsymptoms)) {
						clickElementUsingJavaScript(treathemorrhoidsymptoms);
						//switchToFrameUsingElement(iframe);
						moveToElement(treathemorrhoidsymptoms_button);
						actionClick(treathemorrhoidsymptoms_button);
						visibilityOf(treathemorrhoidsymptoms_display);
						boolean elementIsDisplayed=elementIsDisplayed(treathemorrhoidsymptoms_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for treathemorrhoidsymptoms_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for treathemorrhoidsymptoms_display is  not displayed  on Page");
						}
					}
				public void clickonPostpartumcare() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(postartumcare);
					moveToElement(postartumcare);
					if (isElementPresent(postartumcare)) {
						clickElementUsingJavaScript(postartumcare);
						//switchToFrameUsingElement(iframe);
						moveToElement(postartumcare_button);
						actionClick(postartumcare_button);
						visibilityOf(postartumcare_display);
						boolean elementIsDisplayed=elementIsDisplayed(postartumcare_display);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println("YouTube for postartumcare_display  successfully on Page");
					}
						else {
							System.out.println("YouTube for postartumcare_display is  not displayed  on Page");
						}
					}
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


}
