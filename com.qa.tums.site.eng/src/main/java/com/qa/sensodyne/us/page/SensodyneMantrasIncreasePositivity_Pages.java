package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneMantrasIncreasePositivity_Pages extends BaseClass{
	
	public SensodyneMantrasIncreasePositivity_Pages(){
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
    
	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement Articlelist;	
	
	@FindBy(xpath = "(//a[@href=\"https://www.mayoclinic.org/healthy-lifestyle/stress-management/in-depth/positive-thinking/art-20043950\"])[1]")
	private static WebElement reducestress;	
	
	@FindBy(xpath = "//a[text()='You can actually learn to practice optimism, and one easy way to start is with positive self-talk']")
	private static WebElement practiseoptism;	
	
	@FindBy(xpath = "//a[text()='the lens of how you see the world changes']")
	private static WebElement worldchanges;	
	
	@FindBy(xpath = "//h3[text()='Go freestyle.']")
	private static WebElement Header2;	
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement rapidrelief;	
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;	
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[1]//a")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[2]//a")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[3]//a")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[4]//a")
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
    public void clickOnArticleList() throws Exception {
    	moveToElement(Articlelist);
		clickElementUsingJavaScript(Articlelist);
	}
    public void clickOnReduceStress() throws Exception {
    	//moveToElement(reducestress);
		clickElementUsingJavaScript(reducestress);
	}
    public void clickOnpractiseoptism() throws Exception {
    	//moveToElement(practiseoptism);
		clickElementUsingJavaScript(practiseoptism);
	}
    public void clickOnWorldchanges() throws Exception {
    	moveToElement(worldchanges);
		elementClick(worldchanges);
	}
    public void clickOnRapidRelief() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(rapidrelief);
		clickElementUsingJavaScript(rapidrelief);
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	
	
	
	

}
