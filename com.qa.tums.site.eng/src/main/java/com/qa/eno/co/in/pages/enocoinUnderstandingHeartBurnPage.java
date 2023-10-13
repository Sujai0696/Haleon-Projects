package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinUnderstandingHeartBurnPage extends BaseClass{
	
	public enocoinUnderstandingHeartBurnPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/home-remedies-for-heartburn']")
		private static WebElement homeremedies;
				
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement homeremediestxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/initial-symptoms-of-heartburn']")
		private static WebElement initialsymptoms;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement initialsymptomstxt;
	

		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/initial-symptoms-of-heartburn']")
		private static WebElement initialSymptomsHeartBurn;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement initialSymptomsHeartBurntxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/understanding-heartburn']")
		private static WebElement UnderstandingHeartBurn;
	
		@FindBy(xpath = "//h1[text()='Understanding Heartburn']")
		private static WebElement UnderstandingHeartBurntxt;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement whatiseno;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even last col-xs-12']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free/']")
		private static WebElement youreverydaylife;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement youreverydaylifetxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/all-about-acidity/heartburn-during-pregnancy/'])[1]")
		private static WebElement HeartburnPregancy;
	
		@FindBy(xpath = "//h1[text()='Heartburn']")
		private static WebElement HeartburnPregancytxt;
	
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd/'])[1]")
		private static WebElement AcidityorRefluxorgerd;
		
		//next slider//
		
		@FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']")
		 private static WebElement mouseHoverImg;
		
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='«']")
		 private static WebElement previousArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='»']")
		 private static WebElement nextArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix odd first is-active']")
		 private static WebElement peopleActive;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix even last is-active']")
		private static WebElement heartburnActive;
			
		
		
		
		
		
		
		//Methods//
		
				public void clickonHomeRemedies() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(homeremedies);
				visibilityOf(homeremediestxt);
				boolean elementIsDisplayed=elementIsDisplayed(homeremediestxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(homeremediestxt));
				pageLoad();
				}
				public void clickonInitialSymptoms() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(homeremedies);
					Thread.sleep(1000);
					clickElementUsingJavaScript(initialsymptoms);
					visibilityOf(initialsymptomstxt);
					boolean elementIsDisplayed=elementIsDisplayed(initialsymptomstxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(initialsymptomstxt));
					pageLoad();
					}
				public void clickonInitialsymptomsHeartBurn() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(initialSymptomsHeartBurn);
					visibilityOf(initialSymptomsHeartBurntxt);
					boolean elementIsDisplayed=elementIsDisplayed(initialSymptomsHeartBurntxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(initialSymptomsHeartBurntxt));
					pageLoad();
					}
				public void clickonUnderstandingHeartBurn() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(initialSymptomsHeartBurn);
					Thread.sleep(1000);
					clickElementUsingJavaScript(UnderstandingHeartBurn);
					visibilityOf(UnderstandingHeartBurntxt);
					boolean elementIsDisplayed=elementIsDisplayed(UnderstandingHeartBurntxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(UnderstandingHeartBurntxt));
					pageLoad();
					}
				public void clickonWhatisEno() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(whatiseno);
					pageLoad();
				}
				public void clickonyoureverydaylife_here() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(youreverydaylife);
					visibilityOf(youreverydaylifetxt);
					boolean elementIsDisplayed=elementIsDisplayed(youreverydaylifetxt);
					Assert.assertTrue(elementIsDisplayed);	
					System.out.println(getElementText(youreverydaylifetxt));
					pageLoad();
				}
				public void clickonReferences() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(References);
					clickElementUsingJavaScript(References);
					visibilityOf(ReferencesOpen);
					boolean elementIsDisplayed=elementIsDisplayed(ReferencesOpen);
					Assert.assertTrue(elementIsDisplayed);
					Thread.sleep(1000);
					clickElementUsingJavaScript(References);
					pageLoad();
				}
				public void clickonHeartBurnDuringPregancy() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(HeartburnPregancy);
					clickElementUsingJavaScript(HeartburnPregancy);
					visibilityOf(HeartburnPregancytxt);
					boolean elementIsDisplayed=elementIsDisplayed(HeartburnPregancytxt);
					Assert.assertTrue(elementIsDisplayed);
					Thread.sleep(1000);
					System.out.println(getElementText(HeartburnPregancytxt));
					pageLoad();
				}
				public void clickonAcidityorRefluxorgerd() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(AcidityorRefluxorgerd);
					clickElementUsingJavaScript(AcidityorRefluxorgerd);
					pageLoad();
				}
				//next slider//
				public void clickonDidYouKnowSection()throws Exception {
					 waitForPageLoadJava();
					 scrollDownUsingElement(mouseHoverImg);
					 clickElementUsingJavaScript(previousArrow);
					 refreshWebPage();
					 scrollDownUsingElement(mouseHoverImg);
					 clickElementUsingJavaScript(previousArrow);
					 moveToElement(mouseHoverImg);
					 doubleClickElement(mouseHoverImg);
					 System.out.println("double clicked successfully on the previous carousel Image Element");
					 visibilityOf(heartburnActive);
					 Assert.assertTrue(elementIsDisplayed(heartburnActive));
					 clickElementUsingJavaScript(nextArrow);
					 moveToElement(mouseHoverImg);
					 doubleClickElement(mouseHoverImg);
					 visibilityOf(peopleActive);
					 Assert.assertTrue(elementIsDisplayed(peopleActive));
					 System.out.println("double clicked successfully on the next carousel Image Element");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
