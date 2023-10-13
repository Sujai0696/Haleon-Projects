package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodynesensitiveTeethpainRelief_Pages extends BaseClass{
	
	public SensodynesensitiveTeethpainRelief_Pages(){
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
	private static WebElement WhiteningSensitiveTeethBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensitiveteethpainreliefBreadCrumbs;		
		
	@FindBy(xpath = "//strong[text()='How to Relieve Sensitive Teeth']")
	private static WebElement Header1;		
		
	@FindBy(xpath = "//a[text()='an appointment with your dentist']")
	private static WebElement appointmentDentist;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement Sensodyne;
	
	@FindBy(xpath = "//strong[text()='Sensitive Teeth Solutions']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='sensitive teeth and gum health']")
	private static WebElement Sensitiveteethgumhealth;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Whitening Products and Their Impact on Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='6 Tips for Whitening Sensitive Teeth']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Foods and Drinks That Cause Acid Erosion']")
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
		    public void clickOnWhiteningSensitiveTeethBreadcrumbs() throws Exception {
		    	moveToElement(WhiteningSensitiveTeethBreadCrumbs);
				clickElementUsingJavaScript(WhiteningSensitiveTeethBreadCrumbs);
			}
		    public void clickOnSensitiveteethpainReliefBreadcrumbs() throws Exception {
		    	moveToElement(SensitiveteethpainreliefBreadCrumbs);
				clickElementUsingJavaScript(SensitiveteethpainreliefBreadCrumbs);
			}
		    public void clickOnAppointmentDentist() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(appointmentDentist);
				clickElementUsingJavaScript(appointmentDentist);
			}
		    public void clickOnSensodyne() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Sensodyne);
				clickElementUsingJavaScript(Sensodyne);
			}
		    public void clickOnSensitiveteethgumhealth() throws Exception {
		    	scrollDownUsingElement(Header2);
		    	moveToElement(Sensitiveteethgumhealth);
				clickElementUsingJavaScript(Sensitiveteethgumhealth);
			}
		    public void clickOnRelatedArticle1() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(RelatedArticle1);
				clickElementUsingJavaScript(RelatedArticle1);
			}
		    public void clickOnRelatedArticle2() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(RelatedArticle2);
				clickElementUsingJavaScript(RelatedArticle2);
			}
		    public void clickOnRelatedArticle3() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(RelatedArticle3);
				clickElementUsingJavaScript(RelatedArticle3);
			}
		    public void clickOnRelatedArticle4() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	moveToElement(RelatedArticle4);
				clickElementUsingJavaScript(RelatedArticle4);
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
