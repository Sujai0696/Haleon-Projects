package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaColdSoresAndStressPage extends BaseClass{
	
	public AbrevaColdSoresAndStressPage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='many things that can trigger cold sores']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkManyThingsThatCanTriggerColdSores;
    
    @FindBy(xpath = "//a[text()='cold weather']//self::a[@href='/managing-lip-health/cold-sore-triggers/cold-weather/']")
    private static WebElement hyperLinkColdWeather;
    
    @FindBy(xpath = "//a[text()='cold sore symptoms']//self::a[@href='/faq/understanding-cold-sores/']")
    private static WebElement hyperLinkColdSoreSymptoms;
    
    @FindBy(xpath = "//a[text()='Sleep']//self::a[@href='/managing-lip-health/cold-sore-triggers/sleep/']")
    private static WebElement hyperLinkSleep;
    
    @FindBy(xpath = "//a[text()='exercise']//self::a[@href='/managing-lip-health/cold-sore-triggers/exercise/']")
    private static WebElement hyperLinkExercise;
    
    @FindBy(xpath = "//a[text()='lip health']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkLipHealth;
    
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
    
    public void clickHyperLinkManyThingsThatCanTriggerColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkManyThingsThatCanTriggerColdSores)) {
			scrollDownUsingElement(hyperLinkManyThingsThatCanTriggerColdSores);
			clickElementUsingJavaScript(hyperLinkManyThingsThatCanTriggerColdSores);
			pageLoad();
			System.out.println("HyperLink Many Things That Can Trigger Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Many Things That Can Trigger Cold Sores is not presented in the page");
			throw new Exception("HyperLink Many Things That Can Trigger Cold Sores is not presented in the page");
		}
	}
    
    public void clickHyperLinkColdWeather() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdWeather)) {
			scrollDownUsingElement(hyperLinkColdWeather);
			clickElementUsingJavaScript(hyperLinkColdWeather);
			pageLoad();
			System.out.println("HyperLink Cold Weather clicked successfully");
		} else {
			System.out.println("HyperLink Cold Weather is not presented in the page");
			throw new Exception("HyperLink Cold Weather is not presented in the page");
		}
	}
    
    public void clickHyperLinkColdSoreSymptoms() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSoreSymptoms)) {
			scrollDownUsingElement(hyperLinkColdSoreSymptoms);
			clickElementUsingJavaScript(hyperLinkColdSoreSymptoms);
			pageLoad();
			System.out.println("HyperLink Cold Sore Symptoms clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sore Symptoms is not presented in the page");
			throw new Exception("HyperLink Cold Sore Symptoms is not presented in the page");
		}
	}
    
    public void clickHyperLinkSleep() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSleep)) {
			scrollDownUsingElement(hyperLinkSleep);
			clickElementUsingJavaScript(hyperLinkSleep);
			pageLoad();
			System.out.println("HyperLink Sleep clicked successfully");
		} else {
			System.out.println("HyperLink Sleep is not presented in the page");
			throw new Exception("HyperLink Sleep is not presented in the page");
		}
	}
    
    public void clickHyperLinkExercise() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkExercise)) {
			scrollDownUsingElement(hyperLinkExercise);
			clickElementUsingJavaScript(hyperLinkExercise);
			pageLoad();
			System.out.println("HyperLink Exercise clicked successfully");
		} else {
			System.out.println("HyperLink Exercise is not presented in the page");
			throw new Exception("HyperLink Exercise is not presented in the page");
		}
	}
    
    public void clickHyperLinkLipHealth() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkLipHealth)) {
			scrollDownUsingElement(hyperLinkLipHealth);
			clickElementUsingJavaScript(hyperLinkLipHealth);
			pageLoad();
			System.out.println("HyperLink Lip Health clicked successfully");
		} else {
			System.out.println("HyperLink Lip Health is not presented in the page");
			throw new Exception("HyperLink Lip Health is not presented in the page");
		}
	}
    
    public void clickReadOurLipCareTips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(readOurLipCareTips)) {
			scrollDownUsingElement(readOurLipCareTips);
			clickElementUsingJavaScript(readOurLipCareTips);
			pageLoad();
			System.out.println("Read Our Lip Care Tips clicked successfully");
		} else {
			System.out.println("Read Our Lip Care Tips is not presented in the page");
			throw new Exception("Read Our Lip Care Tips is not presented in the page");
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
