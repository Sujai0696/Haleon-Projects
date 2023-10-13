package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodynehealthissueIgnore_Pages extends BaseClass{
	
	public SensodynehealthissueIgnore_Pages(){
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
	
	@FindBy(xpath = "//h2[text()='Health Issues You Shouldn’t Ignore']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='chest pain can be a sign of a heart attack']")
	private static WebElement Chestpainattack;
	
	@FindBy(xpath = "//a[@href=\"https://us.sensodyne.com/products/rapid-relief-mint-toothpaste/\"]")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//a[text()='approximately 13 percent']")
	private static WebElement approximately13percent;
	
	@FindBy(xpath = "//a[text()='pain-relieving medication']")
	private static WebElement painrelievingmedication;
	
	@FindBy(xpath = "//a[text()='according to Mayo Clinic']")
	private static WebElement accordingmayoclinic;
	
	@FindBy(xpath = "//a[text()='sitting hunched over at your desk all day']")
	private static WebElement sittingoverdesk;
	
	@FindBy(xpath = "(//a[@href=\"https://www.mayoclinic.org/diseases-conditions/chronic-fatigue-syndrome/symptoms-causes/syc-20360490\"])[1]")
	private static WebElement chronicfatigue;
	
	@FindBy(xpath = "//a[text()='a hormone imbalance or a viral infection']")
	private static WebElement hormoneimbalance;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[1]//a")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='My Teeth Hurt; What Should I Do?']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[3]//a")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
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
	    public void clickOnchestpainattack() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(Chestpainattack);
			clickElementUsingJavaScript(Chestpainattack);
		}
	    public void clickOnSensodyneRapidRelief() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(SensodyneRapidRelief);
			clickElementUsingJavaScript(SensodyneRapidRelief);
		}
	    public void clickOnapproximately13percent() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(approximately13percent);
			clickElementUsingJavaScript(approximately13percent);
		}
	    public void clickOnpainrelievingmedication() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(painrelievingmedication);
			clickElementUsingJavaScript(painrelievingmedication);
		}
	    public void clickOnAccordingMayoclinic() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(accordingmayoclinic);
			clickElementUsingJavaScript(accordingmayoclinic);
		}
	    public void clickOnsittingoverdesk() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(sittingoverdesk);
			clickElementUsingJavaScript(sittingoverdesk);
		}
	    public void clickOnchronicfatigue() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(chronicfatigue);
			clickElementUsingJavaScript(chronicfatigue);
		}
	    public void clickOnhormoneimbalance() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(hormoneimbalance);
			clickElementUsingJavaScript(hormoneimbalance);
		}
	    public void clickOnRelatedArticle1() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	//moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle1);
		}
	    public void clickOnRelatedArticle2() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	//moveToElement(RelatedArticle2);
			clickElementUsingJavaScript(RelatedArticle2);
		}
	    public void clickOnRelatedArticle3() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	//moveToElement(RelatedArticle3);
			clickElementUsingJavaScript(RelatedArticle3);
		}
	    public void clickOnRelatedArticle4() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	//moveToElement(RelatedArticle4);
			clickElementUsingJavaScript(RelatedArticle4);
		}
	
	
	
	
	
	
	
	
	
	

}
