package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaWhyDoIKeepGettingColdSoresPage extends BaseClass{

	public AbrevaWhyDoIKeepGettingColdSoresPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//a[text()='avoid spreading the virus']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/spreading-cold-sores/']")
	private static WebElement hyperLinkAvoidSpreadingTheVirus;

	@FindBy(xpath = "//a[text()='the cold sore virus']//self::a[@href='https://www.abreva.com/amp/how-common-herpes-simplex-1.html']")
	private static WebElement hyperLinkTheCOldSoreVirus;

	@FindBy(xpath = "//a[text()='a number of triggers']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']")
	private static WebElement hyperLinkANumberOfTriggers;

	@FindBy(xpath = "//a[text()='Stress']//self::a[@href='/managing-lip-health/cold-sore-triggers/stress/']")
	private static WebElement hyperLinkStress;

	@FindBy(xpath = "//a[text()='avoid oral contact, like kissing']//self::a[@href='https://www.abreva.com/amp/what-causes-cold-sores-from-kissing.html']")
	private static WebElement hyperLinkAvoidOralContactLikeKissing;

	@FindBy(xpath = "//a[text()='cold sore blisters']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/fever-blister-vs-cold-sore/']")
	private static WebElement hyperLinkColdSoreBlisters;

	@FindBy(xpath = "//a[text()='sun and cold sores']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
	private static WebElement hyperLinkSunAndColdSores;

	@FindBy(xpath = "//a[text()='relaxation techniques for managing cold sore symptoms']//self::a[@href='/managing-lip-health/cold-sore-triggers/relaxation-techniques/']")
	private static WebElement hyperLinkRelaxationTechniquesForManaging;

	@FindBy(xpath = "//a[text()='surviving a dentist visit with cold sores']//self::a[@href='/managing-lip-health/cold-sore-triggers/dentist-visit/']")
	private static WebElement hyperLinkSurvivingADentistVisit;

	@FindBy(xpath = "//a[text()='the fascinating connection between cold sores and pregnancy']//self::a[@href='/managing-lip-health/cold-sore-triggers/pregnancy-and-periods/']")
	private static WebElement hyperLinkTheFascinatingConnection;

	@FindBy(xpath = "//span[text()='READ OUR LIP CARE TIPS']//ancestor::a[@href='/managing-lip-health/lip-care/']")
	private static WebElement readOurLipCareTips;

	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style reference-abreva-price-spider-button fixedcomponent6 fixed-component image']//ancestor::span[text()='BUY NOW']")
	private static WebElement buyNow;

	@FindBy(xpath = "//h2[@class='ps-product-name']//self::h2[text()='Oral Care Pump']")
	private static WebElement buyNowText;

	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;

	@FindBy(xpath = "//span[text()='BUY NOW']//ancestor::a[@tabindex='0']//self::a[@aria-hidden='false']")
	private static WebElement buyNowCloseVerify;

	
	
	
	
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
	 
	 public void clickHyperLinkAvoidSpreadingTheVirus() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkAvoidSpreadingTheVirus)) {
				scrollDownUsingElement(hyperLinkAvoidSpreadingTheVirus);
				clickElementUsingJavaScript(hyperLinkAvoidSpreadingTheVirus);
				pageLoad();
				System.out.println("HyperLink Avoid Spreading The Virus clicked successfully");
			} else {
				System.out.println("HyperLink Avoid Spreading The Virus is not presented in the page");
				throw new Exception("HyperLink Avoid Spreading The Virus is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkTheCOldSoreVirus() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkTheCOldSoreVirus)) {
				scrollDownUsingElement(hyperLinkTheCOldSoreVirus);
				clickElementUsingJavaScript(hyperLinkTheCOldSoreVirus);
				pageLoad();
				System.out.println("HyperLink The COld Sore Virus clicked successfully");
			} else {
				System.out.println("HyperLink The COld Sore Virus is not presented in the page");
				throw new Exception("HyperLink The COld Sore Virus is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkANumberOfTriggers() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkANumberOfTriggers)) {
				scrollDownUsingElement(hyperLinkANumberOfTriggers);
				clickElementUsingJavaScript(hyperLinkANumberOfTriggers);
				pageLoad();
				System.out.println("HyperLink A Number Of Triggers clicked successfully");
			} else {
				System.out.println("HyperLink A Number Of Triggers is not presented in the page");
				throw new Exception("HyperLink A Number Of Triggers is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkStress() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkStress)) {
				scrollDownUsingElement(hyperLinkStress);
				clickElementUsingJavaScript(hyperLinkStress);
				pageLoad();
				System.out.println("HyperLink Stress clicked successfully");
			} else {
				System.out.println("HyperLink Stress is not presented in the page");
				throw new Exception("HyperLink Stress is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkAvoidOralContactLikeKissing() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkAvoidOralContactLikeKissing)) {
				scrollDownUsingElement(hyperLinkAvoidOralContactLikeKissing);
				clickElementUsingJavaScript(hyperLinkAvoidOralContactLikeKissing);
				pageLoad();
				System.out.println("HyperLink Avoid Oral Contact Like Kissing clicked successfully");
			} else {
				System.out.println("HyperLink Avoid Oral Contact Like Kissing is not presented in the page");
				throw new Exception("HyperLink Avoid Oral Contact Like Kissing is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkColdSoreBlisters() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkColdSoreBlisters)) {
				scrollDownUsingElement(hyperLinkColdSoreBlisters);
				clickElementUsingJavaScript(hyperLinkColdSoreBlisters);
				pageLoad();
				System.out.println("HyperLink Cold Sore Blisters clicked successfully");
			} else {
				System.out.println("HyperLink Cold Sore Blisters is not presented in the page");
				throw new Exception("HyperLink Cold Sore Blisters is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkSunAndColdSores() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkSunAndColdSores)) {
				scrollDownUsingElement(hyperLinkSunAndColdSores);
				clickElementUsingJavaScript(hyperLinkSunAndColdSores);
				pageLoad();
				System.out.println("HyperLink Sun And Cold Sores clicked successfully");
			} else {
				System.out.println("HyperLink Sun And Cold Sores is not presented in the page");
				throw new Exception("HyperLink Sun And Cold Sores is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkRelaxationTechniquesForManaging() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkRelaxationTechniquesForManaging)) {
				scrollDownUsingElement(hyperLinkRelaxationTechniquesForManaging);
				clickElementUsingJavaScript(hyperLinkRelaxationTechniquesForManaging);
				pageLoad();
				System.out.println("HyperLink Relaxation Techniques For Managing clicked successfully");
			} else {
				System.out.println("HyperLink Relaxation Techniques For Managing is not presented in the page");
				throw new Exception("HyperLink Relaxation Techniques For Managing is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkSurvivingADentistVisit() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkSurvivingADentistVisit)) {
				scrollDownUsingElement(hyperLinkSurvivingADentistVisit);
				clickElementUsingJavaScript(hyperLinkSurvivingADentistVisit);
				pageLoad();
				System.out.println("HyperLink Surviving A Dentist Visit clicked successfully");
			} else {
				System.out.println("HyperLink Surviving A Dentist Visit is not presented in the page");
				throw new Exception("HyperLink Surviving A Dentist Visit is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkTheFascinatingConnection() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(hyperLinkTheFascinatingConnection)) {
				scrollDownUsingElement(hyperLinkTheFascinatingConnection);
				clickElementUsingJavaScript(hyperLinkTheFascinatingConnection);
				pageLoad();
				System.out.println("HyperLink The Fascinating Connection clicked successfully");
			} else {
				System.out.println("HyperLink The Fascinating Connection is not presented in the page");
				throw new Exception("HyperLink The Fascinating Connection is not presented in the page");
			}
		}
	 
	 public void clickHyperLinkReadOurLipCareTips() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(readOurLipCareTips)) {
				scrollDownUsingElement(readOurLipCareTips);
				clickElementUsingJavaScript(readOurLipCareTips);
				pageLoad();
				System.out.println("HyperLink ReadOurLipCareTips clicked successfully");
			} else {
				System.out.println("HyperLink Read Our Lip Care Tips is not presented in the page");
				throw new Exception("HyperLink Read Our Lip Care Tips is not presented in the page");
			}
		}
	 
	 
	 public void clickBuyNow() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(buyNow)) {
	    		scrollDownUsingElement(buyNow);
	    		clickElementUsingJavaScript(buyNow);
	    		visibilityOf(buyNowText);
	    		Assert.assertTrue(elementIsDisplayed(buyNowText));
	    		clickElementUsingJavaScript(buyNowClose);
	    		visibilityOf(buyNowCloseVerify);
	    		Assert.assertTrue(elementIsDisplayed(buyNowCloseVerify));
	    		System.out.println("Buy Now button successfully verified");
			} else {
				System.out.println("Buy Now Button is not Presented in the page");
				throw new Exception("Buy Now Button is not Presented in the page");
			}
		}
	 
	 
	 


}
