package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneEngineeredForSpeed_Pages extends BaseClass{
	
	public SensodyneEngineeredForSpeed_Pages(){
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd \"]")
	private static WebElement SensodyneInnovationBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensodyneEngineeredSpeedBreadCrumbs;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"]")
	private static WebElement SensodyneBuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//a[text()='Get Coupon'])[3]")
	private static WebElement GetCoupons;
	
	@FindBy(xpath = "//h2[text()='The Speed of Tooth Sensitivity']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[1]")
	private static WebElement btnYoutube;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement youtubePlayIcon;
	
	@FindBy(xpath = "//span[text()='How Sensodyne Rapid Relief Works']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[2]")
	private static WebElement btnYoutube1;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement btnYoutubeIcon1;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframeYoutube1;
	
	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement youtubePlayIcon1;
	
	@FindBy(xpath = "//a[text()='unique formulation with stannous fluoride']")
	private static WebElement uniqueFormulation;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header4;
	
	@FindBy(xpath = "//a[text()='How To Deal with Tooth Sensitivity to Cold']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Tips for Tooth Sensitivity to Hot']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='The Science Behind Sensodyne Rapid Relief Toothpaste']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='The Speed of Sensation']")
	private static WebElement RelatedArticle4;

	
	
	
	
	
	
	//Methods//
	
	public void clickCookieBtn() throws Exception {
        elementToBeClickable(cookieBtn);
        try {
            if (cookieBtn.isDisplayed()) {
                elementClick(cookieBtn);
            }
            visibilityOf(cookieClose);
            Assert.assertTrue(elementIsDisplayed(cookieClose));
            elementClick(cookieClose);
        } catch (Exception e) {
        }
    }
    public void clickGigyaForm() throws Exception {
        elementToBeClickable(gigyaForm);
        try {
            if (gigyaForm.isDisplayed()) {
                elementClick(gigyaForm);
            }
            visibilityOf(gigyaClose);
            implicitWait();
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
            elementClick(gigyaClose);
        } catch (Exception e) {
       }
    }
    public void clickOnSensodyneInnovationBreadcrumbs() throws Exception {
    	moveToElement(SensodyneInnovationBreadCrumbs);
		clickElementUsingJavaScript(SensodyneInnovationBreadCrumbs);
	}
    public void clickOnSensodyneEngineeredSpeedBreadcrumbs() throws Exception {
    	moveToElement(SensodyneEngineeredSpeedBreadCrumbs);
		clickElementUsingJavaScript(SensodyneEngineeredSpeedBreadCrumbs);
	}
    public void clickOnSensodyneRapidRelief() throws Exception {
    	moveToElement(SensodyneRapidRelief);
		clickElementUsingJavaScript(SensodyneRapidRelief);
	}
    public void clickOnSensodyneBuyNow() throws Exception {
    	scrollDownUsingElement(SensodyneRapidRelief);
    	moveToElement(SensodyneBuyNow);
		clickElementUsingJavaScript(SensodyneBuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnSensodynGetcoupons() throws Exception {
    	scrollDownUsingElement(SensodyneRapidRelief);
    	moveToElement(GetCoupons);
		clickElementUsingJavaScript(GetCoupons);
	}
    public void clickOnToothSensitivityYoutubeLink() throws Exception{
		scrollDownUsingElement(Header2);
		clickElementUsingJavaScript(btnYoutube);
		visibilityOf(iframeYoutube);
		switchToFrameUsingElement(iframeYoutube);
		//moveToElement(btnYoutubeIcon);
		actionClick(btnYoutubeIcon);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePlayIcon));
		clickElementUsingJavaScript(btnYoutubeIcon);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
    }
    public void clickOnToothSensitivityYoutube1Link() throws Exception{
		scrollDownUsingElement(Header3);
		clickElementUsingJavaScript(btnYoutube1);
		visibilityOf(iframeYoutube1);
		switchToFrameUsingElement(iframeYoutube1);
		//moveToElement(btnYoutubeIcon1);
		actionClick(btnYoutubeIcon1);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePlayIcon1));
		clickElementUsingJavaScript(btnYoutubeIcon1);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
		
		if (youtubePlayIcon1.isDisplayed()) {
			Thread.sleep(5000);
			Assert.assertTrue(elementIsDisplayed(youtubePlayIcon1));
		System.out.println("////////");
			actionClick(btnYoutubeIcon1);
			System.out.println("Video is playing Successfully");
		}
		frameSwitchingToDefaultContent();
    }
    public void clickOnSensodyneUniqueFormulation() throws Exception {
    	moveToElement(uniqueFormulation);
		clickElementUsingJavaScript(uniqueFormulation);
	}
    public void clickOnArticle1() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnArticle2() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnArticle3() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnArticle4() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	

    
    
    
    
    
    
    
    
    
}
