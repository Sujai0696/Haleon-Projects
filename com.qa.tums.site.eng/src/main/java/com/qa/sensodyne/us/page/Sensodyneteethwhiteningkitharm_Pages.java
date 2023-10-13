package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class Sensodyneteethwhiteningkitharm_Pages extends BaseClass{
	
	public Sensodyneteethwhiteningkitharm_Pages(){
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
		
	@FindBy(xpath = "//a[text()='potential temporary sensitivities']")
	private static WebElement temporarysensitivity;
		
	@FindBy(xpath = "//a[text()='after using an over-the-counter whitening kit']")
	private static WebElement whiteningkit;
	
	@FindBy(xpath = "//a[text()='either from gum recession or worn-down enamel']")
	private static WebElement gumrecession;
	
	@FindBy(xpath = "//a[text()='Sensodyne Repair and Protect Whitening']")
	private static WebElement Sensodynerepair;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='My Teeth Hurt; What Should I Do?']")
	private static WebElement RelatedArticlie1;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement RelatedArticlie2;
	
	@FindBy(xpath = "//a[text()='What To Do About Tooth Sensitivity']")
	private static WebElement RelatedArticlie3;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement RelatedArticlie4;
	
	
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
	    public void clickOnTemporarySensitivity() throws Exception {
	    	moveToElement(temporarysensitivity);
			clickElementUsingJavaScript(temporarysensitivity);
		}
	    public void clickOnWhiteningkit() throws Exception {
	    	moveToElement(whiteningkit);
			clickElementUsingJavaScript(whiteningkit);
		}
	    public void clickOnGumrecession() throws Exception {
	    	scrollDownUsingElement(whiteningkit);
	    	moveToElement(gumrecession);
			clickElementUsingJavaScript(gumrecession);
		}
	    public void clickOnSensodyneRepair() throws Exception {
	    	scrollDownUsingElement(gumrecession);
	    	moveToElement(Sensodynerepair);
			clickElementUsingJavaScript(Sensodynerepair);
		}
	    public void clickOnRelatedArticle1() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(RelatedArticlie1);
			clickElementUsingJavaScript(RelatedArticlie1);
		}
	    public void clickOnRelatedArticle2() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(RelatedArticlie2);
			clickElementUsingJavaScript(RelatedArticlie2);
		}
	    public void clickOnRelatedArticle3() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(RelatedArticlie3);
			clickElementUsingJavaScript(RelatedArticlie3);
		}
	    public void clickOnRelatedArticle4() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(RelatedArticlie4);
			clickElementUsingJavaScript(RelatedArticlie4);
		}
	
	
	
	
	
	
	
	
	

}
