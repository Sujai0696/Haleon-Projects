package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class PrephHeaderPage extends BaseClass{
	
	public PrephHeaderPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd component']//a[@href='/coupons-and-special-offers/']")
	private static WebElement offers;		
	
	@FindBy(xpath = "//a[@href='/where-to-buy/']")
	private static WebElement wheretobuy;		
	
	@FindBy(xpath = "//h1[text()='Where to Buy']")
	private static WebElement wheretobuy_txt;	
	
	@FindBy(xpath = "//a[@href='/newsletter-signup/']")
	private static WebElement signup;	
	
	@FindBy(xpath = "//h1[text()='Keep Your Caboose In the Know']")
	private static WebElement signup_txt;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section language-selector even col-xs-12 reference-language-selector']//child::a[text()='United States of America']")
	private static WebElement Countryselector;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section language-selector even col-xs-12 reference-language-selector opened']")
	private static WebElement Countryselector_Active;
	
	 @FindBy(xpath = "//div[@class='searchBox component section default-style first odd last col-xs-12']//input[@type=\"text\"]")
	 private static WebElement searched;
		
	 @FindBy(xpath = "//div[@class='searchBox component section default-style first odd last col-xs-12']//button[@type=\"submit\"]")
	 private static WebElement submitted;
		
	  @FindBy(xpath = "(//div[@class='searchResults component section default-style first odd last col-xs-12']//div[@class='searchResults-result'])[1]")
	  private static WebElement visibilityofsearch;
	
	  @FindBy(xpath = "//div[@class='image component section megamenu-bottom-center megamenu-logo first odd col-xs-12 col-md-4']//img")
	  private static WebElement PrephLogo;
	
	  @FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//a[@href='/relief-finder/']")
	  private static WebElement ReliefFinder;
	
	  @FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	  private static WebElement ReliefFinder_txt;
	
	  @FindBy(xpath = "(//div[@class='box component section megamenu-nav-container odd last col-xs-12']//a[@href='/products/'])[1]")
	  private static WebElement products;
	
	  @FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	  private static WebElement products_txt;
	
	  @FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//a[@href='/products/medicated-portable-wipes/']")
	  private static WebElement medicatedwibes;
	  
	  @FindBy(xpath = "//h1[text()='Medicated Wipes']")
	  private static WebElement medicatedwibes_txt;
	  
	  @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-multi-symptom-cream']//a[text()='Multi-Symptom Cream ']")
	  private static WebElement multisymptomcreame;
	  
	  @FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	  private static WebElement multisymptomcreame_txt;
	  
	  @FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-ointment']//a[@href='/products/ointment/']")
	  private static WebElement ointment;
	  
	  @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	  private static WebElement ointment_txt;
	  
	  @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-totables']//a[@href='/products/totables/']")
	  private static WebElement totables;
	  
	  @FindBy(xpath = "//h1[text()='Totables']")
	  private static WebElement totables_txt;
	  
	  @FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-cooling-gel']//a[@href='/products/cooling-gel/']")
	  private static WebElement coolinggel;
	  
	  @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']")
	  private static WebElement coolinggel_txt;
	  
	  @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-preparation-h-medicated-wipes-women']//a[@href='/products/preparation-h-medicated-wipes-women/']")
	  private static WebElement medicatedwipeswomen;
	  
	  @FindBy(xpath = "//h1[text()='Medicated Wipes for Women']")
	  private static WebElement medicatedwipeswomen_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/suppositories/']")
	  private static WebElement suppostitories;
	  
	  @FindBy(xpath = "//h1[text()='Suppositories']")
	  private static WebElement suppostitories_txt;
	  
	  @FindBy(xpath = "//li[@class='odd first navigation-item navigation-level1 page-rapid-relief-spray-with-lidocaine']//a[@href='/products/rapid-relief-spray-with-lidocaine/']")
	  private static WebElement rapidreliefspray;
	  
	  @FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	  private static WebElement rapidreliefspray_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/rapid-relief-wipes/']")
	  private static WebElement rapidreliefwipes;
	  
	  @FindBy(xpath = "//h1[text()='Rapid Relief Totables Wipes']")
	  private static WebElement rapidreliefwipes_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/rapid-relief-with-lidocaine-cream/']")
	  private static WebElement rapidrelieflidocaine;
	  
	  @FindBy(xpath = "//h1[text()='Rapid Relief with Lidocaine Cream']")
	  private static WebElement rapidrelieflidocaine_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/soothing-relief-spray/']")
	  private static WebElement soothingreliefspray;
	  
	  @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']")
	  private static WebElement soothingreliefspray_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/soothing-relief-cleansing-cooling-wipes/']")
	  private static WebElement soothingreliefcoolingwipes;
	  
	  
	  @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	  private static WebElement soothingreliefcoolingwipes_txt;
	  
	  @FindBy(xpath = "//a[@href='/products/soothing-relief-anti-itch-cream/']")
	  private static WebElement soothingreliefantiitchcream;
	  
	  @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	  private static WebElement soothingreliefantiitchcream_txt;
	  
	  @FindBy(xpath = "//li[@class='odd first navigation-item navigation-level1 page-rapid-relief-spray-with-lidocaine']//a[@href='/products/rapid-relief-spray-with-lidocaine/']")
	  private static WebElement reliefspray;
	  
	  @FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	  private static WebElement reliefspray_txt;
	  
	  @FindBy(xpath = "//a[@href='/learn-more/']")
	  private static WebElement learnmore;
	  
	  @FindBy(xpath = "//div[@class='richText component section p-d-t-4 text-left-d text-center-m even col-xs-12']//h2")
	  private static WebElement learnmore_txt;
	  
	  @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-videos']//a")
	  private static WebElement videos;
	  
	  @FindBy(xpath = "//div[@class='richText component section m-m-b-2 m-m-x-2 first odd col-xs-12 col-sm-6 col-lg-5']//h1")
	  private static WebElement videos_txt;
	  
	  @FindBy(xpath = "//a[@href='/frequently-asked-questions/']")
	  private static WebElement faq;
	  
	  @FindBy(xpath = "//h2[text()='The Bottom Line']")
	  private static WebElement faq_txt;
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
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
	
	
		public void clickonOffers() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(offers);
			clickElementUsingJavaScript(offers);
//			visibilityOf(home_txt_breadcrumbs);
//			boolean elementIsDisplayed=elementIsDisplayed(home_txt_breadcrumbs);
//			Assert.assertTrue(elementIsDisplayed);
//			System.out.println(getElementText(home_txt_breadcrumbs));
			pageLoad();
		}	
		public void clickonWheretoBuy() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(wheretobuy);
			if (isElementPresent(wheretobuy)) {
				clickElementUsingJavaScript(wheretobuy);
				visibilityOf(wheretobuy_txt);
				boolean elementIsDisplayed=elementIsDisplayed(wheretobuy_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(wheretobuy_txt));
				
			} else {
				throw new Exception("Where to Buy is not present on Page");
			}
		}
		public void clickonSignup() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(signup);
			if (isElementPresent(signup)) {
				clickElementUsingJavaScript(signup);
				visibilityOf(signup_txt);
				boolean elementIsDisplayed=elementIsDisplayed(signup_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(signup_txt));
				
			} else {
				throw new Exception("Signup is not present on Page");
			}
		}
		public void clickonCountrySelector() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(Countryselector);
			if (isElementPresent(Countryselector)) {
				clickElementUsingJavaScript(Countryselector);
				visibilityOf(Countryselector_Active);
				boolean elementIsDisplayed=elementIsDisplayed(Countryselector_Active);
				Assert.assertTrue(elementIsDisplayed);
				
			} else {
				throw new Exception("Country Selector is not present on Page");
			}
		}
		public void clickonSearchIcon() throws Throwable {
	  		waitForPageLoadJava();
	  		clickElementUsingJavaScript(searched);
	  		searched.sendKeys("Totables");
	  		clickElementUsingJavaScript(submitted);
	  		visibilityOf(visibilityofsearch);
	  		boolean elementIsDisplayed=elementIsDisplayed(visibilityofsearch);
	  		Assert.assertTrue(elementIsDisplayed);
	  		System.out.println(getElementText(visibilityofsearch));
	  		pageLoad();
	  		
	  	}
		public void clickonPrephLogo() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(PrephLogo);
			if (isElementPresent(PrephLogo)) {
				clickElementUsingJavaScript(PrephLogo);
				System.out.println("Verified the Preph Logo on Page");
				
			} else {
				throw new Exception(" Preph Logo is not Present on Page");
			}
		}
		public void clickonReliefFinder() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(ReliefFinder);
			if (isElementPresent(ReliefFinder)) {
				clickElementUsingJavaScript(ReliefFinder);
				visibilityOf(ReliefFinder_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ReliefFinder_txt);
				Assert.assertTrue(elementIsDisplayed);
				
			} else {
				throw new Exception("Relief Finder is not present on Page");
			}
		}
		public void clickonProducts() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(products)) {
				clickElementUsingJavaScript(products);
				visibilityOf(products_txt);
				boolean elementIsDisplayed=elementIsDisplayed(products_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(products_txt));
				
			} else {
				throw new Exception("Products is not present on Page");
			}
		}
		public void clickonMedicatedWibes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(medicatedwibes)) {
				clickElementUsingJavaScript(medicatedwibes);
				visibilityOf(medicatedwibes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatedwibes_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(medicatedwibes_txt));
				
			} else {
				throw new Exception("Medicated Wibes is not present on Page");
			}
		}
		public void clickonMultisymptomscreame() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(multisymptomcreame)) {
				clickElementUsingJavaScript(multisymptomcreame);
				visibilityOf(multisymptomcreame_txt);
				boolean elementIsDisplayed=elementIsDisplayed(multisymptomcreame_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(multisymptomcreame_txt));
				
			} else {
				throw new Exception("Multisymptomcreame is not present on Page");
			}
		}
		public void clickonOintment() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(ointment)) {
				clickElementUsingJavaScript(ointment);
				visibilityOf(ointment_txt);
				boolean elementIsDisplayed=elementIsDisplayed(ointment_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(ointment_txt));
				
			} else {
				throw new Exception("Ointment is not present on Page");
			}
		}
		
		public void clickonTotables() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(totables)) {
				clickElementUsingJavaScript(totables);
				visibilityOf(totables_txt);
				boolean elementIsDisplayed=elementIsDisplayed(totables_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(totables_txt));
				
			} else {
				throw new Exception("Totables is not present on Page");
			}
		}
		public void clickonCoolinggel() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(coolinggel)) {
				clickElementUsingJavaScript(coolinggel);
				visibilityOf(coolinggel_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coolinggel_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coolinggel_txt));
				
			} else {
				throw new Exception("Cooling gel is not present on Page");
			}
		}
		public void clickonMedicatedwipeswomen() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(medicatedwibes)) {
				clickElementUsingJavaScript(medicatedwibes);
				visibilityOf(medicatedwibes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(medicatedwibes_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(medicatedwibes_txt));
				
			} else {
				throw new Exception("Medicated wipes is not present on Page");
			}
		}
		public void clickonSuppostories() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(suppostitories)) {
				clickElementUsingJavaScript(suppostitories);
				visibilityOf(suppostitories_txt);
				boolean elementIsDisplayed=elementIsDisplayed(suppostitories_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(suppostitories_txt));
				
			} else {
				throw new Exception("suppostitories is not present on Page");
			}
		}
		public void clickonRapidReliefSpray() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(rapidreliefspray)) {
				clickElementUsingJavaScript(rapidreliefspray);
				visibilityOf(rapidreliefspray_txt);
				boolean elementIsDisplayed=elementIsDisplayed(rapidreliefspray_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(rapidreliefspray_txt));
				
			} else {
				throw new Exception("Rapid Relief spray is not present on Page");
			}
		}
		public void clickonRapidReliefwipes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(rapidreliefwipes)) {
				clickElementUsingJavaScript(rapidreliefwipes);
				visibilityOf(rapidreliefwipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(rapidreliefwipes_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(rapidreliefwipes_txt));
				
			} else {
				throw new Exception("Rapid Relief wipes is not present on Page");
			}
		}
		public void clickonRapidRelieflidocaine() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(rapidrelieflidocaine)) {
				clickElementUsingJavaScript(rapidrelieflidocaine);
				visibilityOf(rapidrelieflidocaine_txt);
				boolean elementIsDisplayed=elementIsDisplayed(rapidrelieflidocaine_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(rapidrelieflidocaine_txt));
				
			} else {
				throw new Exception("Rapid Relief Lidocaine is not present on Page");
			}
		}
		public void clickonSoothingReliefcoolingspray() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(soothingreliefspray)) {
				clickElementUsingJavaScript(soothingreliefspray);
				visibilityOf(soothingreliefspray_txt);
				boolean elementIsDisplayed=elementIsDisplayed(soothingreliefspray_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(soothingreliefspray_txt));
				
			} else {
				throw new Exception("Soothing Relief spray is not present on Page");
			}
		}
		public void clickonSoothingCleanisingwipes() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(soothingreliefcoolingwipes)) {
				clickElementUsingJavaScript(soothingreliefcoolingwipes);
				visibilityOf(soothingreliefcoolingwipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(soothingreliefcoolingwipes_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(soothingreliefcoolingwipes_txt));
				
			} else {
				throw new Exception("Soothing Relief Cooling wipes is not present on Page");
			}
		}
		public void clickonSoothingReliefAntiitching() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(soothingreliefantiitchcream)) {
				clickElementUsingJavaScript(soothingreliefantiitchcream);
				visibilityOf(soothingreliefantiitchcream_txt);
				boolean elementIsDisplayed=elementIsDisplayed(soothingreliefantiitchcream_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(soothingreliefantiitchcream_txt));
				
			} else {
				throw new Exception("Soothing Relief Anti itching is not present on Page");
			}
		}
		public void clickonReliefSpray() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(products);
			if (isElementPresent(reliefspray)) {
				clickElementUsingJavaScript(reliefspray);
				visibilityOf(reliefspray_txt);
				boolean elementIsDisplayed=elementIsDisplayed(reliefspray_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(reliefspray_txt));
				
			} else {
				throw new Exception("Relief Spray is not present on Page");
			}
		}
		public void clickonArticle() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(learnmore);
			if (isElementPresent(learnmore)) {
				clickElementUsingJavaScript(learnmore);
				visibilityOf(learnmore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(learnmore_txt));
				
			} else {
				throw new Exception("Learn more is not present on Page");
			}
		}
		public void clickonVideos() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(videos);
			if (isElementPresent(videos)) {
				clickElementUsingJavaScript(videos);
				visibilityOf(videos_txt);
				boolean elementIsDisplayed=elementIsDisplayed(videos_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(videos_txt));
				
			} else {
				throw new Exception("Videos is not present on Page");
			}
		}
		public void clickonFaq() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(faq);
			if (isElementPresent(faq)) {
				clickElementUsingJavaScript(faq);
				visibilityOf(faq_txt);
				boolean elementIsDisplayed=elementIsDisplayed(faq_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(faq_txt));
				
			} else {
				throw new Exception("FAQ is not present on Page");
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
}
