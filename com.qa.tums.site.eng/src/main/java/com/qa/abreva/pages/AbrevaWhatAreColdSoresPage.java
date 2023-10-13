package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaWhatAreColdSoresPage extends BaseClass{
	
	
	public AbrevaWhatAreColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='HOW COLD SORES SPREAD ']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement bannerLinkHowColdSoresSpread;
    
    @FindBy(xpath = "//a[text()='COLD SORE TRIGGERS ']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']")
    private static WebElement bannerLinkColdSoreTriggers;
    
    @FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']//self::a[@href='/about-cold-sores/cold-sore-treatments/']")
    private static WebElement bannerLinkColdSoreTreatments;
    
    @FindBy(xpath = "//a[text()='COLD SORE MYTHS ']//self::a[@href='/about-cold-sores/cold-sore-facts-and-myths/']")
    private static WebElement bannerLinkColdSoreMyths;
    
    @FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']//self::a[@href='/about-cold-sores/how-to-take-care-dry-lips-in-winter/']")
    private static WebElement bannerLinkHowToTakeCareOfDryLipsInWinter;
    
    @FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']//self::a[@href='/about-cold-sores/cold-sore-vs-pimple/']")
    private static WebElement bannerLinkColdSoresVsPimples;
    
    @FindBy(xpath = "//a[text()='TYPES OF COLD SORE MEDICINE ']//self::a[@href='/about-cold-sores/types-of-cold-sore-medicine/']")
    private static WebElement bannerLinkTypesOfColdSoreMedicine;
    
    @FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']//self::a[@href='/about-cold-sores/kids-cold-sores/']")
    private static WebElement bannerLinkColdSoreInTeens;
    
    @FindBy(xpath = "//a[text()='fever blisters']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/fever-blister-vs-cold-sore/']")
    private static WebElement hyperLinkFeverBlisters;
    
    @FindBy(xpath = "//a[text()='Cold sore triggers']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']")
    private static WebElement hyperLinkColdSoreTriggers;
    
    @FindBy(xpath = "//a[text()='fever']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/fever-blister-vs-cold-sore/']")
    private static WebElement hyperLinkFever;
    
    @FindBy(xpath = "//a[text()='stress']//self::a[@href='/managing-lip-health/cold-sore-triggers/stress/']")
    private static WebElement hyperLinkStress;
    
    @FindBy(xpath = "//a[text()='sunshine']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
    private static WebElement hyperLinkSunshine;
    
    @FindBy(xpath = "//a[text()='A cold sore can start as a tingling']//self::a[@href='/tingle-alert/']")
    private static WebElement hyperLinkAColdSoreCanStartAsATingling;
    
    @FindBy(xpath = "//a[text()='You can also contract the virus by sharing infected items']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkYouCanAlsoContractTheVirusBySharingInfectedItems;
    
    @FindBy(xpath = "//a[text()='someone may be infected without showing symptoms.']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkSomeoneMayBeInfectedWithoutShowingSymptoms;
    
    @FindBy(xpath = "//a[text()='cold sores are extremely contagious']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkColdSoresAreExtremlyContagious;
    
    @FindBy(xpath = "//a[text()='cold sore myths from the facts']//self::a[@href='/about-cold-sores/cold-sore-facts-and-myths/']")
    private static WebElement hyperLinkColdSoreMythsFromTheFacts;
    
    @FindBy(xpath = "//a[text()='pick the best treatment to shorten your recovery time']//self::a[@href='/about-cold-sores/cold-sore-treatments/']")
    private static WebElement hyperLinkPickTheBestTreatment;
    
    @FindBy(xpath = "//a[text()='cold sore medicine']//self::a[@href='/about-cold-sores/types-of-cold-sore-medicine/']")
    private static WebElement hhyperLinkColdSoreMedicine;
    
    @FindBy(xpath = "//p[contains(text(),'ll hear advice on everything from home remedies to')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream']")
    private static WebElement hyperLinkAbrevaCreamOne;
    
    @FindBy(xpath = "//p[contains(text(),'In most cases, cold sores heal by themselves withi')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream']")
    private static WebElement hyperLinkAbrevaCreamTwo;
    
    @FindBy(xpath = "//a[text()='cold sore treatment']//self::a[@href='/about-cold-sores/cold-sore-treatments/']")
    private static WebElement hyperLinkColdSoreTreatment;
    
    @FindBy(xpath = "//p[contains(text(),'While cold sores are an unpleasant and potentially')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream']")
    private static WebElement hyperLinkAbrevaCreamThree;
    
    @FindBy(xpath = "//a[text()='how Abreva']//self::a[@href='/cold-sore-products/how-abreva-cream-works/']")
    private static WebElement hyperLinkHowAbrevaCream;
    
    @FindBy(xpath = "//a[text()='where to buy Abreva']//self::a[@href='/where-to-buy/']")
    private static WebElement hyperLinkWhereToBuyAbrevaCream;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
    
    
    
	
	
}
