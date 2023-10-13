package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSensitiveGumIngredients_Pages extends BaseClass{
	
	public SensodyneSensitiveGumIngredients_Pages(){
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
    
	@FindBy(xpath = "(//a[@title=\"Oral Health Tips\"])[1]")
	private static WebElement OralHealthTips;

	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd \"]")
	private static WebElement SensitiveTeethGumHealth_BreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensitiveTeethGumHealthMain_BreadCrumbs;
	
	@FindBy(xpath = "//h1[text()='Active Ingredients in Sensodyne Sensitivity & Gum']")
	private static WebElement Header1;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum'])[1]")
	private static WebElement SensodyneSensitivityGum;
	
	@FindBy(xpath = "//div[@class=\"title-content\"]")
	private static WebElement btnYoutube;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]")
	private static WebElement youtubePauseIcon;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum'])[2]")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Bleeding Gums and Sensitivity']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Symptoms of Sensitive Teeth']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "(//a[text()='Oral Health Tips'])[2]")
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
    public void clickOnSensitiveTeethGumHealthBreadcrumbs() throws Exception {
    	moveToElement(SensitiveTeethGumHealth_BreadCrumbs);
		clickElementUsingJavaScript(SensitiveTeethGumHealth_BreadCrumbs);
	}
    public void clickOnSensitiveTeethGumHealthMainBreadcrumbs() throws Exception {
    	moveToElement(SensitiveTeethGumHealthMain_BreadCrumbs);
		clickElementUsingJavaScript(SensitiveTeethGumHealthMain_BreadCrumbs);
	}
    public void clickOnSensodyneSensitivityGum() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(SensodyneSensitivityGum);
		clickElementUsingJavaScript(SensodyneSensitivityGum);
	}
    public void clickToothSensitivityGumYoutubeLink() throws Exception{
		scrollDownUsingElement(btnYoutube);
		clickElementUsingJavaScript(btnYoutube);
		visibilityOf(iframeYoutube);
		switchToFrameUsingElement(iframeYoutube);
		moveToElement(btnYoutubeIcon);
		actionClick(btnYoutubeIcon);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
		clickElementUsingJavaScript(btnYoutubeIcon);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
		
//		if (youtubePauseIcon.isDisplayed()) {
//			Thread.sleep(5000);
//			Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
//			System.out.println("////////");
//			actionClick(btnYoutubeIcon);
//			System.out.println("Video is playing Successfully");
//		}
//		frameSwitchingToDefaultContent();
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
