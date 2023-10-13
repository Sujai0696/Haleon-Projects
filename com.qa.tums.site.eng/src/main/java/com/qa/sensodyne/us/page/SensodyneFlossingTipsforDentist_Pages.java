package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneFlossingTipsforDentist_Pages extends BaseClass{
	
	public SensodyneFlossingTipsforDentist_Pages(){
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
	
	@FindBy(xpath = "//a[text()='many people experience tooth sensitivity']")
	private static WebElement ExperienceToothsensitivity;
	
	@FindBy(xpath = "(//a[@href=\"https://us.sensodyne.com/\"])[1]")
	private static WebElement Sensodynerapidrelief;
	
	@FindBy(xpath = "//a[text()='which can cause tooth pain']")
	private static WebElement causetoothpain;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement Sensodyne;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Do I Need To Floss?']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Health Issues to Address Right Away']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
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
		    public void clickOnToothsensitivityExperience() throws Exception {
		    	scrollDownUsingElement(Articlelist);
		    	moveToElement(ExperienceToothsensitivity);
				clickElementUsingJavaScript(ExperienceToothsensitivity);
			}
		    public void clickOnSensodyneRapidRelief() throws Exception {
		    	scrollDownUsingElement(Articlelist);
		    	moveToElement(Sensodynerapidrelief);
				clickElementUsingJavaScript(Sensodynerapidrelief);
			}
		    public void clickOncausetoothpain() throws Exception {
		    	scrollDownUsingElement(Articlelist);
		    	moveToElement(causetoothpain);
				clickElementUsingJavaScript(causetoothpain);
			}
	
		    public void clickOnSensodyne() throws Exception {
		    	scrollDownUsingElement(causetoothpain);
		    	moveToElement(Sensodyne);
				clickElementUsingJavaScript(Sensodyne);
			}
		    public void clickOnRelatedArticle1() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(RelatedArticle1);
				clickElementUsingJavaScript(RelatedArticle1);
			}
		    public void clickOnRelatedArticle2() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(RelatedArticle2);
				clickElementUsingJavaScript(RelatedArticle2);
			}
		    public void clickOnRelatedArticle3() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(RelatedArticle3);
				clickElementUsingJavaScript(RelatedArticle3);
			}
		    public void clickOnRelatedArticle4() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(RelatedArticle4);
				clickElementUsingJavaScript(RelatedArticle4);
			}
	
	
	
	
	
	
	
	
	
	

}
