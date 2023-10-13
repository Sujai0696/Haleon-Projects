package com.qa.sensodyne.us.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneIngredients_Pages extends BaseClass{

	public SensodyneIngredients_Pages(){
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

	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/\"])[1]")
	private static WebElement AboutSensodyne;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[1]")
	private static WebElement SensodyneIngredients;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd last is-current \"])[2]")
	private static WebElement SensodyneIngredients_BreadCrumb;
	
	@FindBy(xpath = "//a[@href=\"#footnote-3\"]")
	private static WebElement Footnote1;
	
	@FindBy(xpath = "//strong[text()='POTASSIUM NITRATE']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[@href=\"#footnote-3\"]")
	private static WebElement Footnote2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[5]")
	private static WebElement DeepCleanToothPaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[2]")
	private static WebElement TrueWhite;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
	private static WebElement EssentialCare;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[5]")
	private static WebElement Rapidrelief;

	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-toothpaste/\"])[4]")
	private static WebElement completeprotection;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[2]")
	private static WebElement RepairProtectToothpaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/\"])[3]")
	private static WebElement SensitivityGum;
	
	@FindBy(xpath = "//strong[text()='SODIUM FLUORIDE']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[3]")
	private static WebElement SensodyneDeepClean;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-full-protection-toothpaste/\"])[2]")
	private static WebElement SensodyneFullProtection;
	
	@FindBy(xpath = "//strong[text()='PENTASODIUM TRIPHOSPHATE']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[4]")
	private static WebElement SensodyneRapidRelief4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[4]")
	private static WebElement SensodyneDeepClean4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-toothpaste/\"])[3]")
	private static WebElement SensodynecompleteProtection3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[3]")
	private static WebElement SensodyneRepairProtect3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[3]")
	private static WebElement SensodyneTrueWhite3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[3]")
	private static WebElement SensodyneExtraWhitening3;
	
	@FindBy(xpath = "//strong[text()='SODIUM LAURYL SULFATE (SLS)AND OTHER SURFACTANTS']")
	private static WebElement Header4;
	
	@FindBy(xpath = "//a[@href=\"#footnote-4\"]")
	private static WebElement Footnote4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[5]")
	private static WebElement DeepcleanToothpaste5;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[5]")
	private static WebElement RapidReliefmintToothpaste5;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-toothpaste/\"])[4]")
	private static WebElement CompleteprotectionToothpaste4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[4]")
	private static WebElement RepairprotectToothpaste4;
	
	@FindBy(xpath = "//strong[text()='XANTHAN GUM']")
	private static WebElement Header5;
	
	@FindBy(xpath = "//a[@href=\"#footnote-5\"]")
	private static WebElement Footnote5;
	
	@FindBy(xpath = "//a[@href=\"#footnote-6\"]")
	private static WebElement Footnote6;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[4]")
	private static WebElement WhiteExtraFresh;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[4]")
	private static WebElement ExtraWhiteningToothpaste4;
	
	@FindBy(xpath = "//a[@href=\"https://pronamel-us.preprod-cf65.ch.adobecqms.net/products/\"]")
	private static WebElement Pronamel;
	
	@FindBy(xpath = "//strong[text()='GLYCEROL AND PEG-8']")
	private static WebElement Header6;
	
	@FindBy(xpath = "//a[@id=\"footnote7-ref\"]")
	private static WebElement FootNote7;
	
	@FindBy(xpath = "//a[@href=\"#footnote-8\"]")
	private static WebElement FootNote8;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[1]")
	private static WebElement btnYouTube;
	
	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@title=\"Play (k)\"]")
	private static WebElement YouTubePlayButton;
	
	@FindBy(xpath = "//strong[text()='How Sensodyne Rapid Relief toothpastes with stannous fluoride work']")
	private static WebElement Header7;
	
	//2nd youtube//
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[2]")
	private static WebElement btnYouTube1;
	
	@FindBy(xpath = "m(//iframe[@id=\"ytplayer\"])[2]")
	private static WebElement iframeYoutube1;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon1;
	
	@FindBy(xpath = "//button[@title=\"Play (k)\"]")
	private static WebElement YouTubePlayButton1;
	
	////////end//////
	
	@FindBy(xpath = "//h2[text()='Related Articles']")
	private static WebElement Header8;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/\"])[4]")
	private static WebElement Article1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/treating-sensitive-teeth/\"])[3]")
	private static WebElement Article2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/symptoms-of-sensitive-teeth/\"])[3]")
	private static WebElement Article3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/oral-health-tips/\"])[4]")
	private static WebElement Article4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/\"])[2]")
	private static WebElement SensodyneHelp;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/\"])[3]")
	private static WebElement SensodyneWork;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
    public void clickOnAboutSensodyneIngredients() throws Exception {
    	moveToElement(AboutSensodyne);
		elementClick(SensodyneIngredients);
	}
    public void clickOnAboutSensodyneIngredientsBreadCrumb() throws Exception {
    	moveToElement(AboutSensodyne);
		elementClick(SensodyneIngredients_BreadCrumb);
	}
    public void clickOnFootNote1() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(AboutSensodyne);
		clickElementUsingJavaScript(Footnote1);
	}
    public void clickOnFootNote2() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(AboutSensodyne);
		clickElementUsingJavaScript(Footnote2);
	}
    public void clickOnDeepCleanToothpaste() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(DeepCleanToothPaste);
		clickElementUsingJavaScript(DeepCleanToothPaste);
	}
    public void clickOnSensodyneTrueWhite() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(TrueWhite);
		clickElementUsingJavaScript(TrueWhite);
	}
    public void clickOnEssentialCare() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(EssentialCare);
		clickElementUsingJavaScript(EssentialCare);
	}
    public void clickOnRapidRelief() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Rapidrelief);
		clickElementUsingJavaScript(Rapidrelief);
	}
    public void clickOncompleteprotection() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(completeprotection);
		clickElementUsingJavaScript(completeprotection);
	}
    public void clickOnRepairProtectToothpaste() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(RepairProtectToothpaste);
		clickElementUsingJavaScript(RepairProtectToothpaste);
	}
    public void clickOnSensitivityGum() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(SensitivityGum);
		clickElementUsingJavaScript(SensitivityGum);
	}
    public void clickOnSensodyneDeepClean() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(SensodyneDeepClean);
		clickElementUsingJavaScript(SensodyneDeepClean);
	}
    public void clickOnSensodyneFullProtection() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(SensodyneFullProtection);
		clickElementUsingJavaScript(SensodyneFullProtection);
	}
    public void clickOnSensodyneRapidRelief4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneRapidRelief4);
		clickElementUsingJavaScript(SensodyneRapidRelief4);
	}
    public void clickOnSensodyneDeepClean4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneDeepClean4);
		clickElementUsingJavaScript(SensodyneDeepClean4);
	}
    public void clickOnSensodyneCompleteProtection3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodynecompleteProtection3);
		clickElementUsingJavaScript(SensodynecompleteProtection3);
	}
    public void clickOnSensodyneRepairProtect3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneRepairProtect3);
		clickElementUsingJavaScript(SensodyneRepairProtect3);
	}
    public void clickOnSensodyneTrueWhite3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneTrueWhite3);
		clickElementUsingJavaScript(SensodyneTrueWhite3);
	}
    public void clickOnSensodyneExtraWhitening3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneExtraWhitening3);
		clickElementUsingJavaScript(SensodyneExtraWhitening3);
	}
    public void clickOnFootnote4() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(Footnote4);
		clickElementUsingJavaScript(Footnote4);
	}
    public void clickOnDeepCleanToothPaste5() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(DeepcleanToothpaste5);
		clickElementUsingJavaScript(DeepcleanToothpaste5);
	}
    public void clickOnRapidReliefToothPaste5() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RapidReliefmintToothpaste5);
		clickElementUsingJavaScript(RapidReliefmintToothpaste5);
	}
    public void clickOnCompleteProtectionToothpaste4() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(CompleteprotectionToothpaste4);
		clickElementUsingJavaScript(CompleteprotectionToothpaste4);
	}
    public void clickOnRepairProtectToothPaste4() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RepairprotectToothpaste4);
		clickElementUsingJavaScript(RepairprotectToothpaste4);
	}
    public void clickOnFootNote5() throws Exception {
    	scrollDownUsingElement(Header5);
    	moveToElement(Footnote5);
		clickElementUsingJavaScript(Footnote5);
	}
    public void clickOnFootNote6() throws Exception {
    	scrollDownUsingElement(Header5);
    	moveToElement(Footnote6);
		clickElementUsingJavaScript(Footnote6);
	}
    public void clickOnWhiteExtraFreash() throws Exception {
    	scrollDownUsingElement(Header5);
    	moveToElement(WhiteExtraFresh);
		clickElementUsingJavaScript(WhiteExtraFresh);
	}
    public void clickOnExtraWhiteningToothPaste4() throws Exception {
    	scrollDownUsingElement(Header5);
    	moveToElement(ExtraWhiteningToothpaste4);
		clickElementUsingJavaScript(ExtraWhiteningToothpaste4);
	}
    public void clickOnPronamel() throws Exception {
    	scrollDownUsingElement(Header5);
    	//moveToElement(Pronamel);
		clickElementUsingJavaScript(Pronamel);
	}
    public void clickOnFootNote7() throws Exception {
    	scrollDownUsingElement(Header6);
    	moveToElement(FootNote7);
		clickElementUsingJavaScript(FootNote7);
	}
    public void clickOnFootNote8() throws Exception {
    	scrollDownUsingElement(Header6);
    	moveToElement(FootNote8);
		clickElementUsingJavaScript(FootNote8);
	}
    public void clickOnYouTubePlayer1() throws Exception {
    	scrollDownUsingElement(btnYouTube);
    	clickElementUsingJavaScript(btnYouTube);
    	visibilityOf(iframeYoutube);
    	switchToFrameUsingElement(iframeYoutube);
    	moveToElement(btnYoutubeIcon);
    	//clickElementUsingJavaScript(btnYoutubeIcon);
    	Thread.sleep(1000);
    	Assert.assertTrue(elementIsDisplayed(YouTubePlayButton));
    	clickElementUsingJavaScript(btnYoutubeIcon);
    	System.out.println("Video is Playing Successfully");
    	frameSwitchingToDefaultContent();
    	
	}
    public void clickOnYouTubePlayer2() throws Exception {
    	scrollDownUsingElement(Header7);
    	clickElementUsingJavaScript(btnYouTube1);
    	visibilityOf(iframeYoutube1);
    	switchToFrameUsingElement(iframeYoutube1);
    	moveToElement(btnYoutubeIcon1);
    	//clickElementUsingJavaScript(btnYoutubeIcon);
    	Thread.sleep(1000);
    	Assert.assertTrue(elementIsDisplayed(YouTubePlayButton1));
    	clickElementUsingJavaScript(btnYoutubeIcon1);
    	System.out.println("Video is Playing Successfully");
    	frameSwitchingToDefaultContent();
    	
	}
    public void clickOnArticle1() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(Article1);
		clickElementUsingJavaScript(Article1);
	}
    public void clickOnArticle2() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(Article2);
		clickElementUsingJavaScript(Article2);
	}
    public void clickOnArticle3() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(Article3);
		clickElementUsingJavaScript(Article3);
	}
    public void clickOnArticle4() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(Article4);
		clickElementUsingJavaScript(Article4);
	}
    public void clickOnSensodyneHelp() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(AboutSensodyne);
		clickElementUsingJavaScript(SensodyneHelp);
	}
    public void clickOnSensodyneWork() throws Exception {
    	//scrollDownUsingElement(Header8);
    	moveToElement(AboutSensodyne);
		clickElementUsingJavaScript(SensodyneWork);
	}
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
