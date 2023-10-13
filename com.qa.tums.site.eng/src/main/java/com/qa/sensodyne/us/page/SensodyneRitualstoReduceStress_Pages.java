package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneRitualstoReduceStress_Pages extends BaseClass{
	
	public SensodyneRitualstoReduceStress_Pages(){
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
	
	@FindBy(xpath = "//a[text()='recommended eight to nine hours on a nightly basis']")
	private static WebElement nightybasis;
	
	@FindBy(xpath = "//a[text()='a whole host of health issues']")
	private static WebElement healthissues;
	
	@FindBy(xpath = "//a[@href=\"https://www.sleepfoundation.org/ask-the-expert/stress-and-insomnia\"]")
	private static WebElement sleepdisruptor;
	
	@FindBy(xpath = "//a[@href=\"https://www.pvdpsych.com/dr-nicole-issa.html\"]")
	private static WebElement nicole;
	
	@FindBy(xpath = "//h2[text()='Simple Nighttime Activities to Reduce Stress']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='has been shown to help reduce anxiety and stress']")
	private static WebElement reduceanxietystress;
	
	@FindBy(xpath = "//a[@href=\"https://www.sensodyne.com/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"]")
	private static WebElement RapidRelief;
	
	@FindBy(xpath = "//a[text()='which has been shown to interfere with sleep']")
	private static WebElement Interfacesleep;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='Things to say to increase positivity']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Ways holiday stress affects your body']")
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
		    public void clickOnNightybasis() throws Exception {
		    	moveToElement(nightybasis);
				clickElementUsingJavaScript(nightybasis);
			}
		    public void clickOnHealthIssues() throws Exception {
		    	scrollDownUsingElement(nightybasis);
		    	moveToElement(healthissues);
				clickElementUsingJavaScript(healthissues);
			}
		    public void clickOnsleepdisruptor() throws Exception {
		    	scrollDownUsingElement(nightybasis);
		    	//moveToElement(sleepdisruptor);
				elementClick(sleepdisruptor);
			}
		    public void clickOnNicole() throws Exception {
		    	scrollDownUsingElement(nightybasis);
		    	//moveToElement(sleepdisruptor);
				clickElementUsingJavaScript(nicole);
			}
		    public void clickOnReduceAnxietyStress() throws Exception {
		    	scrollDownUsingElement(Header1);
				clickElementUsingJavaScript(reduceanxietystress);
			}
		    public void clickOnRapidRelief() throws Exception {
		    	scrollDownUsingElement(Header1);
				clickElementUsingJavaScript(RapidRelief);
			}
		    public void clickOnInterfaceSleep() throws Exception {
		    	scrollDownUsingElement(Header1);
				clickElementUsingJavaScript(Interfacesleep);
			}
		    public void clickOnRelatedArticle1() throws Exception {
		    	scrollDownUsingElement(Header2);
		    	moveToElement(RelatedArticle1);
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
