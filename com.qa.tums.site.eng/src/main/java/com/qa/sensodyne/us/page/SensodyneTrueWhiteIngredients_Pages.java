package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneTrueWhiteIngredients_Pages extends BaseClass{
	
	public SensodyneTrueWhiteIngredients_Pages(){
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
	private static WebElement TruewhiteIngredientsBreadCrumbs;		
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[1]")
	private static WebElement SensodyneTrueWhite1;		
	
	@FindBy(xpath = "//h2[text()='Does Whitening Toothpaste Work?']")
	private static WebElement Header1;		
	
	@FindBy(xpath = "//a[text()='abrasive ingredients']")
	private static WebElement AbrasiveIngredients;	
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[2]")
	private static WebElement SensodyneTrueWhite2;	
	
	@FindBy(xpath = "//h3[text()='Potassium nitrate']")
	private static WebElement Header2;	
	
	@FindBy(xpath = "//a[text()='burst of cold air']")
	private static WebElement burstcoldair;	
	
	@FindBy(xpath = "//a[text()='hot coffee']")
	private static WebElement hotcoffee;	
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpastes']")
	private static WebElement Sensodynetoothpastes;	
	
	@FindBy(xpath = "//a[@href=\"https://www.sensodyne.com/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"]")
	private static WebElement Sensodynetruewhite3;	
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;	
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Extra Fresh']")
	private static WebElement RelatedArticle1;	
	
	@FindBy(xpath = "//a[text()='Whitening Products and Their Impact on Sensitive Teeth']")
	private static WebElement RelatedArticle2;	
	
	@FindBy(xpath = "//a[text()='6 Tips for Whitening Sensitive Teeth']")
	private static WebElement RelatedArticle3;	
	
	@FindBy(xpath = "//a[text()='Whitening Home Remedies: How They May Affect Sensitive Teeth']")
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
		    public void clickOnSensodyneTruewhiteIngredientsBreadcrumbs() throws Exception {
		    	moveToElement(TruewhiteIngredientsBreadCrumbs);
				clickElementUsingJavaScript(TruewhiteIngredientsBreadCrumbs);
			}
		    public void clickOnSensodyneTrueWhite1() throws Exception {
		    	moveToElement(SensodyneTrueWhite1);
				clickElementUsingJavaScript(SensodyneTrueWhite1);
			}
		    public void clickOnAbrasiveIngredients() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(AbrasiveIngredients);
				clickElementUsingJavaScript(AbrasiveIngredients);
			}
		    public void clickOnSensodyneTrueWhite2() throws Exception {
		    	scrollDownUsingElement(AbrasiveIngredients);
		    	moveToElement(SensodyneTrueWhite2);
				clickElementUsingJavaScript(SensodyneTrueWhite2);
			}
		    public void clickOnBurstofColdAir() throws Exception {
		    	scrollDownUsingElement(Header2);
		    	moveToElement(burstcoldair);
				clickElementUsingJavaScript(burstcoldair);
			}
		    public void clickOnHotCoffee() throws Exception {
		    	scrollDownUsingElement(Header2);
		    	moveToElement(hotcoffee);
				clickElementUsingJavaScript(hotcoffee);
			}
		    public void clickOnSensodyneToothpastes() throws Exception {
		    	scrollDownUsingElement(hotcoffee);
		    	moveToElement(Sensodynetoothpastes);
				clickElementUsingJavaScript(Sensodynetoothpastes);
			}
		    public void clickOnSensodyneTruewhite3() throws Exception {
		    	scrollDownUsingElement(Sensodynetoothpastes);
		    	moveToElement(Sensodynetruewhite3);
				clickElementUsingJavaScript(Sensodynetruewhite3);
			}
		    public void clickOnRelatedArticle1() throws Exception {
		    	scrollDownUsingElement(Header3);
		    	//moveToElement(RelatedArticle1);
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
