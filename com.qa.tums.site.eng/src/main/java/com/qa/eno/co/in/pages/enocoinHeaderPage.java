package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinHeaderPage extends BaseClass{
	
	public enocoinHeaderPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='odd first navigation-item navigation-level1 page-all-about-acidity']//a")
		private static WebElement AllAboutAcidity;
	
	//AllAboutAcidity//
		
		@FindBy(xpath = "(//li[@class='odd first navigation-item navigation-level1 page-acidity-reflux-or-gerd']//child::a[text()='Is it Acidity, Reflux or GERD '])[1]")
		private static WebElement IsItAcidityReflux;
	
		@FindBy(xpath = "(//li[@class='even navigation-item navigation-level1 page-is-it-acidity-or-indigestion']//child::a[text()='Is It Acidity or Indigestion '])[1]")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "(//li[@class='odd last navigation-item navigation-level1 page-why-does-your-stomach-hurt']//child::a[text()='Why Does Your Stomach Hurt? '])[1]")
		private static WebElement WhyStomachHurt;
	
		@FindBy(xpath = "(//ul[@class='navigation-root navigation-branch navigation-level1']//child::a[text()='Understanding Acidity '])[1]")
		private static WebElement understandingActivity;
	
		@FindBy(xpath = "(//li[@class='even navigation-item navigation-level1 page-initial-symptoms-of-acidity']//child::a[text()='Initial Symptoms of Acidity '])[1]")
		private static WebElement InitialSymptoms;
	
		@FindBy(xpath = "(//li[@class='odd navigation-item navigation-level1 page-living-life-acidity-free']//child::a[text()='Living Life Acidity Free '])[1]")
		private static WebElement livinglifeAcidityFree;
	
		@FindBy(xpath = "(//li[@class='even last navigation-item navigation-level1 page-home-remedies-for-acidity']//child::a[text()='Home Remedies for Acidity '])[1]")
		private static WebElement homeRemedies;
	
		//Heartburn//
		
		@FindBy(xpath = "(//li[@class='odd first navigation-item navigation-level1 page-understanding-heartburn']//child::a[text()='Understanding Heartburn '])[1]")
		private static WebElement understandingHeartburn;
	
		@FindBy(xpath = "(//li[@class='even navigation-item navigation-level1 page-initial-symptoms-of-heartburn']//child::a[text()='Initial Symptoms of Heartburn '])[1]")
		private static WebElement InitialSymptomsHeartburn;
	
		@FindBy(xpath = "(//li[@class='odd last navigation-item navigation-level1 page-home-remedies-for-heartburn']//child::a[text()='Home Remedies for Heartburn '])[1]")
		private static WebElement HomeRemediesHeartburn;
	
		@FindBy(xpath = "(//li[@class='odd first last navigation-item navigation-level1 page-gas-relief']//child::a[text()='Gas Relief '])[1]")
		private static WebElement gasrelief;
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='even navigation-item navigation-level1 page-products']//a")
		private static WebElement EnoProducts;
		
		@FindBy(xpath = "(//li[@class='odd first navigation-item navigation-level2 page-eno-fruit-salt-sachet']//child::a[text()='ENO Fruit Salt (Sachet) '])[1]")
		private static WebElement EnoFruitSalt;
		
		@FindBy(xpath = "(//li[@class='even last navigation-item navigation-level2 page-eno-fruit-salt-bottle']//child::a[text()='ENO Fruit Salt (Bottle) '])[1]")
		private static WebElement EnoFruitSaltBottle;
		
		//Discover Eno//
		
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='odd navigation-item navigation-level1 page-discover-eno']")
		private static WebElement DiscoverEno;
		
		@FindBy(xpath = "//li[@class='odd first navigation-item navigation-level1 page-latest-campaigns']//child::a[text()='Current Campaigns ']")
		private static WebElement CurrentCampaigns;
		
		@FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-what-is-eno']//child::a[text()='What is ENO ']")
		private static WebElement whatisEno;
		
		@FindBy(xpath = "//li[@class='odd last navigation-item navigation-level1 page-the-eno-journey']//child::a[text()='The ENO Journey ']")
		private static WebElement Enojourney;
		
		//Connect with Eno//
		
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='even last navigation-item navigation-level1 page-connect-with-eno']//a")
		private static WebElement connectwithEno;
		
		@FindBy(xpath = "(//a[@title='FAQs'])[1]")
		private static WebElement FAQ;
		
		//SearchIcon//
		
		
				@FindBy(xpath = "//div[@class='richText component section search-icon even grid_1']//p")
				private static WebElement Search;
				
				@FindBy(xpath = "//div[@class='richText component section search-icon even grid_1 active']")
				private static WebElement SearchActive;
				
				@FindBy(xpath = "//div[@class='box component section search-block odd is-open']//child::input[@type='text']")
				private static WebElement SearchInput;
				
				@FindBy(xpath = "//div[@class='searchBox component section default-style first odd last']//button[@type='submit']")
				private static WebElement submit;
				
				@FindBy(xpath = "//div[@class='searchResults-number']")
				private static WebElement SearchResult;
				
		
		//logo//
		
		@FindBy(xpath = "//div[@class='image component section navigation-desktop__logo navigation-desktop__logo--brand first odd']")
		private static WebElement EnoLogo;
		
		
		
		
		
	

		//Methods//
					
						public void clickonAllaboutAcidity() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(AllAboutAcidity);
						pageLoad();
						}
						public void clickonIsItAcidityorReflux() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(IsItAcidityReflux);
							pageLoad();
							}
						public void clickonAcidityorIndigestion() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(AcidityorIndigestion);
							pageLoad();
							}
						public void clickonWhyStomachHeart() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(WhyStomachHurt);
							pageLoad();
							}
						public void clickonUnderstandingActivity() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(understandingActivity);
							pageLoad();
							}
						public void clickonInitialSymptoms() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(InitialSymptoms);
							pageLoad();
							}
						public void clickonLivingAcidityFree() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(livinglifeAcidityFree);
							pageLoad();
							}
						public void clickonHomeRemedies() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(homeRemedies);
							pageLoad();
							}
						public void clickonUnderstandingHeartBurn() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(understandingHeartburn);
							pageLoad();
							}
						public void clickonInitialSymptomsHeartBurn() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(InitialSymptomsHeartburn);
							pageLoad();
							}
						public void clickonHomeRemediessHeartBurn() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(HomeRemediesHeartburn);
							pageLoad();
							}
						public void clickonGasRelief() throws Exception {
							waitForPageLoadJava();
							moveToElement(AllAboutAcidity);
							clickElementUsingJavaScript(gasrelief);
							pageLoad();
							}
						public void clickonEnoProducts() throws Exception {
							waitForPageLoadJava();
							moveToElement(EnoProducts);
							clickElementUsingJavaScript(EnoProducts);
							pageLoad();
							}
						public void clickonEnoFruitSalt() throws Exception {
							waitForPageLoadJava();
							moveToElement(EnoProducts);
							clickElementUsingJavaScript(EnoFruitSalt);
							pageLoad();
							}
						public void clickonEnoFruitSaltBottle() throws Exception {
							waitForPageLoadJava();
							moveToElement(EnoProducts);
							clickElementUsingJavaScript(EnoFruitSaltBottle);
							pageLoad();
							}
						public void clickonDiscoverEno() throws Exception {
							waitForPageLoadJava();
							moveToElement(DiscoverEno);
							clickElementUsingJavaScript(DiscoverEno);
							pageLoad();
							}
						public void clickonCurrentCampaigns() throws Exception {
							waitForPageLoadJava();
							moveToElement(DiscoverEno);
							clickElementUsingJavaScript(CurrentCampaigns);
							pageLoad();
							}
						public void clickonWhatIsEno() throws Exception {
							waitForPageLoadJava();
							moveToElement(DiscoverEno);
							clickElementUsingJavaScript(whatisEno);
							pageLoad();
							}
						public void clickonEnoJourney() throws Exception {
							waitForPageLoadJava();
							moveToElement(DiscoverEno);
							clickElementUsingJavaScript(Enojourney);
							pageLoad();
							}
						public void clickonConnectWithEno() throws Exception {
							waitForPageLoadJava();
							moveToElement(connectwithEno);
							clickElementUsingJavaScript(connectwithEno);
							pageLoad();
							}
						public void clickonFAQ()throws Exception {
							waitForPageLoadJava();
							moveToElement(connectwithEno);
							clickElementUsingJavaScript(FAQ);
							pageLoad();
							}
						public void clickonSearchIcon()throws Exception {
							waitForPageLoadJava();
							clickElementUsingJavaScript(Search);
							Thread.sleep(1000);
							clickElementUsingJavaScript(SearchInput);
							SearchInput.sendKeys("Eno");
							clickElementUsingJavaScript(submit);
							boolean elementIsDisplayed=elementIsDisplayed(SearchResult);														
							Assert.assertTrue(elementIsDisplayed);
							System.out.println(getElementText(SearchResult));
							pageLoad();
							
							}
						public void clickonEnoLogo()throws Exception {
							waitForPageLoadJava();
							clickElementUsingJavaScript(EnoLogo);
							pageLoad();
							}
						
						
						
					
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

}
