package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinHeartburnduringPregancyPage extends BaseClass{
	
	public enocoinHeartburnduringPregancyPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/dealing-with-acidity-at-night']")
		private static WebElement dealingwithacidity;	
	
		@FindBy(xpath = "//strong[text()='Dealing with Acidity at Night']")
		private static WebElement dealingwithaciditytxt;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/control-acidity-with-busy-lifestyle']")
		private static WebElement controlAciditylifestyle;
	
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement controlAciditylifestyletxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeAcidityFree;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityFreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatisEno;
	
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisEnotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/understanding-heartburn']")
		private static WebElement understandingheartburn;
	
		@FindBy(xpath = "//h1[text()='Understanding Heartburn']")
		private static WebElement understandingheartburntxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/initial-symptoms-of-heartburn']")
		private static WebElement initialheartburnSymptoms;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement initialheartburnSymptomstxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion even last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::strong[text()='Why does your stomach hurt?']")
		private static WebElement stomachHeart;
		
		@FindBy(xpath = "//strong[text()='Why Does Your Stomach Hurt?']")
		private static WebElement stomachHearttxt;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[text()='Home Remedies for Heartburn']")
		private static WebElement HomeRemediesHeartburn;
		
		
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement HomeRemediesHeartburntxt;
		
		
		//Did you know//
		//Slider Section//
		
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
		
				public void clickonDealingwithAcidityNight() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(dealingwithacidity);
				visibilityOf(dealingwithaciditytxt);
				boolean elementIsDisplayed=elementIsDisplayed(dealingwithaciditytxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dealingwithaciditytxt));
				pageLoad();
				}
				public void clickonControlAcidityLifestyle() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(dealingwithacidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlAciditylifestyle);
					visibilityOf(controlAciditylifestyletxt);
					boolean elementIsDisplayed=elementIsDisplayed(controlAciditylifestyletxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(controlAciditylifestyletxt));
					pageLoad();
					}
				public void clickonLivinglifeAcidityFree() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(dealingwithacidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlAciditylifestyle);
					Thread.sleep(1000);
					clickElementUsingJavaScript(livinglifeAcidityFree);
					visibilityOf(livinglifeAcidityFreetxt);
					boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityFreetxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(livinglifeAcidityFreetxt));
					pageLoad();
					}
				public void clickonWhatIsEno() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(dealingwithacidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlAciditylifestyle);
					Thread.sleep(1000);
					clickElementUsingJavaScript(livinglifeAcidityFree);
					Thread.sleep(1000);
					clickElementUsingJavaScript(whatisEno);
					visibilityOf(whatisEnotxt);
					boolean elementIsDisplayed=elementIsDisplayed(whatisEnotxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whatisEnotxt));
					pageLoad();
					}
				public void clickonUnderstamdingHeartburn() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingheartburn);
					visibilityOf(understandingheartburntxt);
					boolean elementIsDisplayed=elementIsDisplayed(understandingheartburntxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(understandingheartburntxt));
					pageLoad();
					}
				public void clickonInitialHeartburnSymptoms() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingheartburn);
					Thread.sleep(1000);
					clickElementUsingJavaScript(initialheartburnSymptoms);
					visibilityOf(initialheartburnSymptomstxt);
					boolean elementIsDisplayed=elementIsDisplayed(initialheartburnSymptomstxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(initialheartburnSymptomstxt));
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
				public void clickonStomachHurt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(stomachHeart);
					clickElementUsingJavaScript(stomachHeart);
					visibilityOf(stomachHearttxt);
					boolean elementIsDisplayed=elementIsDisplayed(stomachHearttxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(stomachHearttxt));
					pageLoad();
					}
				public void clickonHomeRemediesheartburn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(HomeRemediesHeartburn);
					clickElementUsingJavaScript(HomeRemediesHeartburn);
					visibilityOf(HomeRemediesHeartburntxt);
					boolean elementIsDisplayed=elementIsDisplayed(HomeRemediesHeartburntxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(HomeRemediesHeartburntxt));
					pageLoad();
					}
				
				//slidersection//
				
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
