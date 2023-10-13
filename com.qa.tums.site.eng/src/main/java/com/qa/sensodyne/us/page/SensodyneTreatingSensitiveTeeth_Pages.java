package com.qa.sensodyne.us.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneTreatingSensitiveTeeth_Pages extends BaseClass{
	
	public SensodyneTreatingSensitiveTeeth_Pages(){
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
    
	@FindBy(xpath = "(//a[@title='Understanding Sensitivity'])[1]")
	private static WebElement UnderstandingSensitivity;
		
	@FindBy(xpath = "(//a[@title=\"Treating Sensitive Teeth\"])[1]")
	private static WebElement TreatingSensitiveTeeth;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd first \"])[1]")
	private static WebElement HomeIcon_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item even \"])[1]")
	private static WebElement UnderstandingSenstivity_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd last is-current \"])[2]")
	private static WebElement TreatingSensitiveTeeth_Bread;
	
	@FindBy(xpath = "//a[@href=\"#footnote-1\"]")
	private static WebElement footnote1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/oral-health-tips/managing-sensitive-teeth/\"])[3]")
	private static WebElement ManageDiscomfort;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement Sensodyne;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[3]")
	private static WebElement SensodyneToothPaste;
	
	@FindBy(xpath = "//a[@href=\"#footnote-2\"]")
	private static WebElement FootNote2;
	
	@FindBy(xpath = "//a[@href=\"#footnote-3\"]")
	private static WebElement FootNote3;
	
	@FindBy(xpath = "//a[@href=\"#footnote-4\"]")
	private static WebElement FootNote4;
	
	@FindBy(xpath = "//a[@href=\"#footnote-5\"]")
	private static WebElement FootNote5;
	
	@FindBy(xpath = "//a[@href=\"#footnote-7\"]")
	private static WebElement FootNote7;
	
	@FindBy(xpath = "//a[@href=\"#footnote-8\"]")
	private static WebElement FootNote8;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
	private static WebElement SensodyneRepairDeepWhitening;
	
	@FindBy(xpath = "//img[@title=\"Sensodyne Repair & Protect Deep Repair Whitening Toothpaste\"]")
	private static WebElement SensodyneRepairDeepWhitening_img;
	
	
	@FindBy(xpath = "(//div[@class=\"parametrizedhtml component section default-style first odd col-xs-12 reference-buy-now-button\"])[1]")
	private static WebElement SensodyneRepairDeepWhitening_BuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement SensodyneRepairDeepWhitening_BuyNowClose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[4]")
	private static WebElement SensodyneRepairDeepWhitening_LearnMore;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/\"])[2]")
	private static WebElement SensodyneRapidreliefWhiteningPaste;
	
	@FindBy(xpath = "//img[@title=\"Sensodyne Rapid Relief Whitening Toothpaste\"]")
	private static WebElement SensodyneRapidreliefWhiteningPaste_img;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/\"])[4]")
	private static WebElement SensodyneRapidreliefWhiteningPaste_LearnMore;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[2]")
	private static WebElement SensodyneSensitivitygumwhitening;
	
	@FindBy(xpath = "//img[@title=\"Sensodyne Sensitivity & Gum Whitening Toothpaste\"]")
	private static WebElement SensodyneSensitivitygumwhitening_Img;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[4]")
	private static WebElement SensodyneSensitivitygumwhitening_LearnMore;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
	private static WebElement SensodyneExtraWhiteningToothpaste;
	
	@FindBy(xpath = "//img[@title=\"Sensodyne Extra Whitening Toothpaste\"]")
	private static WebElement SensodyneExtraWhiteningToothpaste_Image;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[4]")
	private static WebElement SensodyneExtraWhiteningToothpaste_LearnMore;
	
	@FindBy(xpath = "//strong[text()='How Sensodyne Works']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//div[@class=\"iframe-container\"]")
	private static WebElement YouTubeFrame;
	
	@FindBy(xpath = "//button[@class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]")
	private static WebElement YouTubeButton;
	
	@FindBy(xpath = "(//div[@class='title-content'])")
	private static WebElement btnYoutube;
	
	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@aria-label=\"Pause keyboard shortcut k\"]")
	private static WebElement youtubePauseIcon;
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Methods//
	
	public void clickCookieBtn() throws Exception {
        //elementToBeClickable(cookieBtn);
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
        //elementToBeClickable(gigyaForm);
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
    public void clickOnTreatingSensitiveTeeth() throws Exception {
    	moveToElement(UnderstandingSensitivity);
		clickElementUsingJavaScript(TreatingSensitiveTeeth);
	}
    public void clickOnHomeIcon_bread() throws Exception {
    	clickElementUsingJavaScript(HomeIcon_Bread);
	}
    public void clickOnUnderstandingSensitivity_bread() throws Exception {
    	clickElementUsingJavaScript(UnderstandingSenstivity_Bread);
	}
    public void clickOnTreatingSensitiveTeeth_bread() throws Exception {
    	clickElementUsingJavaScript(TreatingSensitiveTeeth_Bread);
	}
    public void clickOnFootnote1() throws Exception {
    	clickElementUsingJavaScript(footnote1);
	}
    public void clickonManageDiscomfort() throws Exception {
    	clickElementUsingJavaScript(ManageDiscomfort);
	}
    public void clickonSensodyne() throws Exception {
    	clickElementUsingJavaScript(Sensodyne);
	}
    public void clickonSensodyneToothpaste() throws Exception {
    	clickElementUsingJavaScript(SensodyneToothPaste);
	}
    public void clickonFootNote2() throws Exception {
    	clickElementUsingJavaScript(FootNote2);
	}
    public void clickonFootNote3() throws Exception {
    	clickElementUsingJavaScript(FootNote3);
	}
    public void clickonFootNote4() throws Exception {
    	clickElementUsingJavaScript(FootNote4);
	}
    public void clickonFootNote5() throws Exception {
    	clickElementUsingJavaScript(FootNote5);
	}
    public void clickonFootNote7() throws Exception {
    	clickElementUsingJavaScript(FootNote7);
	}
    public void clickonFootNote8() throws Exception {
    	clickElementUsingJavaScript(FootNote8);
	}
    public void clickonSensodyneRepairWhitening() throws Exception {
    	scrollDownUsingElement(SensodyneRepairDeepWhitening);
    	clickElementUsingJavaScript(SensodyneRepairDeepWhitening);
	}
    public void clickonSensodyneRepairWhitening_Img() throws Exception {
    	scrollDownUsingElement(SensodyneRepairDeepWhitening_img);
    	clickElementUsingJavaScript(SensodyneRepairDeepWhitening_img);
	}
    public void clickonSensodyneRepairWhitening_BuyNow() throws Exception {
    	//scrollDownUsingElement(SensodyneRepairDeepWhitening_BuyNow);
    	elementClick(SensodyneRepairDeepWhitening_BuyNow);
    	//implicitWait(5);
    	visibilityOf(SensodyneRepairDeepWhitening_BuyNowClose);
    	boolean elementIsDisplayed=elementIsDisplayed(SensodyneRepairDeepWhitening_BuyNowClose);
    	Assert.assertTrue(elementIsDisplayed);
    	elementClick(SensodyneRepairDeepWhitening_BuyNowClose);
	}
    public void clickonSensodyneRepairWhitening_LearnMore() throws Exception {
    	scrollDownUsingElement(SensodyneRepairDeepWhitening_LearnMore);
    	clickElementUsingJavaScript(SensodyneRepairDeepWhitening_LearnMore);
	}
    public void clickonSensodyneRapidreliefWhitening() throws Exception {
    	scrollDownUsingElement(SensodyneRapidreliefWhiteningPaste);
    	clickElementUsingJavaScript(SensodyneRapidreliefWhiteningPaste);
	}
    public void clickonSensodyneRapidreliefWhitening_Img() throws Exception {
    	scrollDownUsingElement(SensodyneRapidreliefWhiteningPaste);
    	visibilityOf(SensodyneRapidreliefWhiteningPaste_img);
    	clickElementUsingJavaScript(SensodyneRapidreliefWhiteningPaste_img);
	}
    public void clickonSensodyneRapidreliefWhitening_LearnMore() throws Exception {
    	scrollDownUsingElement(SensodyneRapidreliefWhiteningPaste_LearnMore);
    	clickElementUsingJavaScript(SensodyneRapidreliefWhiteningPaste_LearnMore);
	}
    public void clickonSensodyneSensitivityGumWhitening() throws Exception {
    	scrollDownUsingElement(SensodyneSensitivitygumwhitening);
    	clickElementUsingJavaScript(SensodyneSensitivitygumwhitening);
	}
    public void clickonSensodyneSensitivityGumWhitening_Img() throws Exception {
    	scrollDownUsingElement(SensodyneSensitivitygumwhitening_Img);
    	clickElementUsingJavaScript(SensodyneSensitivitygumwhitening_Img);
	}
    public void clickonSensodyneSensitivityGumWhitening_LearnMore() throws Exception {
    	scrollDownUsingElement(SensodyneSensitivitygumwhitening_LearnMore);
    	clickElementUsingJavaScript(SensodyneSensitivitygumwhitening_LearnMore);
	}
    public void clickonSensodyneExtraWhiteningToothPaste() throws Exception {
    	scrollDownUsingElement(SensodyneExtraWhiteningToothpaste);
    	clickElementUsingJavaScript(SensodyneExtraWhiteningToothpaste);
	}
    public void clickonSensodyneExtraWhiteningToothPaste_Image() throws Exception {
    	scrollDownUsingElement(SensodyneExtraWhiteningToothpaste_Image);
    	clickElementUsingJavaScript(SensodyneExtraWhiteningToothpaste_Image);
	}
    public void clickonSensodyneExtraWhiteningToothPaste_LearnMore() throws Exception {
    	scrollDownUsingElement(SensodyneExtraWhiteningToothpaste_LearnMore);
    	clickElementUsingJavaScript(SensodyneExtraWhiteningToothpaste_LearnMore);
	}
    public void clickonSensodyneYouTubeVideo() throws Exception {
    	scrollDownUsingElement(btnYoutube);
    	clickElementUsingJavaScript(btnYoutube);
		visibilityOf(iframeYoutube);
		switchToFrameUsingElement(iframeYoutube);
		//moveToElement(btnYoutubeIcon);
		clickElementUsingJavaScript(btnYoutubeIcon);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
		clickElementUsingJavaScript(btnYoutubeIcon);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
    
	}
    public void clickon_YouTubeVideolink() throws Exception {
    	scrollDownUsingElement(btnYoutube);
    	
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
}
