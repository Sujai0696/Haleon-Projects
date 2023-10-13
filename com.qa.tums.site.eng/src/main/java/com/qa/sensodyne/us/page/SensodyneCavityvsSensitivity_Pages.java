package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneCavityvsSensitivity_Pages extends BaseClass{
	
	public SensodyneCavityvsSensitivity_Pages(){
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
	private static WebElement RecognizingsensitiveTeethBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement CavityorSensitivityteethBreadCrumbs;		
	
	@FindBy(xpath = "//span[text()='What Does Tooth Pain Feel Like?']")
	private static WebElement Header1;		
	
	@FindBy(xpath = "//a[text()='Tooth sensitivity']")
	private static WebElement Toothsensitivity;
	
	@FindBy(xpath = "//span[text()='What Causes It?']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='causes of tooth sensitivity']")
	private static WebElement causestoothsensitivity;
	
	@FindBy(xpath = "//strong[text()='How to Treat It']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='desensitizing toothpaste such as Sensodyne']")
	private static WebElement desentizingtoothpaste;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement sensodyne;
	
	@FindBy(xpath = "//a[text()='range of ']")
	private static WebElement range;
	
	@FindBy(xpath = "(//a[@href=\"https://www.sensodyne.com/en-us/products/\"])[3]")
	private static WebElement toothpaste;
	
	@FindBy(xpath = "(//a[@href=\"https://www.sensodyne.com/en-us/about-sensodyne/\"])[2]")
	private static WebElement sensodynehelp;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header4;
	
	@FindBy(xpath = "(//a[text()='Causes of Sensitive Teeth'])[2]")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Myth vs Truth: Do Brushing & Flossing Cause Tooth Sensitivity?']")
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
		    public void clickOnRecognizingsensitiveteethBreadcrumbs() throws Exception {
		    	moveToElement(RecognizingsensitiveTeethBreadCrumbs);
				clickElementUsingJavaScript(RecognizingsensitiveTeethBreadCrumbs);
			}
		    public void clickOnCavityorSensitivityBreadcrumbs() throws Exception {
		    	moveToElement(CavityorSensitivityteethBreadCrumbs);
				clickElementUsingJavaScript(CavityorSensitivityteethBreadCrumbs);
			}
		    public void clickOnToothsensitivity() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Toothsensitivity);
				clickElementUsingJavaScript(Toothsensitivity);
			}
		    public void clickOncausesToothsensitivity() throws Exception {
		    	scrollDownUsingElement(Header2);
		    	moveToElement(causestoothsensitivity);
				clickElementUsingJavaScript(causestoothsensitivity);
			}
		    public void clickOndesenitizingtoothpaste() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(desentizingtoothpaste);
				clickElementUsingJavaScript(desentizingtoothpaste);
			}
		    
		    public void clickOnsensodyne() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(sensodyne);
				clickElementUsingJavaScript(sensodyne);
			}
		    public void clickOnrangeof() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(range);
				clickElementUsingJavaScript(range);
			}
		    public void clickOntoothpaste() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(toothpaste);
				clickElementUsingJavaScript(toothpaste);
			}
		    public void clickOnSensodynehelp() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(sensodynehelp);
				clickElementUsingJavaScript(sensodynehelp);
			}
		    public void clickOnRelatedArticle1() throws Exception {
		    	scrollDownUsingElement(Header4);
		    	moveToElement(RelatedArticle1);
				clickElementUsingJavaScript(RelatedArticle1);
			}
		    public void clickOnRelatedArticle2() throws Exception {
		    	scrollDownUsingElement(Header4);
		    	moveToElement(RelatedArticle2);
				clickElementUsingJavaScript(RelatedArticle2);
			}
		    public void clickOnRelatedArticle3() throws Exception {
		    	scrollDownUsingElement(Header4);
		    	moveToElement(RelatedArticle3);
				clickElementUsingJavaScript(RelatedArticle3);
			}
		    public void clickOnRelatedArticle4() throws Exception {
		    	scrollDownUsingElement(Header4);
		    	moveToElement(RelatedArticle4);
				clickElementUsingJavaScript(RelatedArticle4);
			}
	
	
	
	
	
	
	
	
	
	
	

}
