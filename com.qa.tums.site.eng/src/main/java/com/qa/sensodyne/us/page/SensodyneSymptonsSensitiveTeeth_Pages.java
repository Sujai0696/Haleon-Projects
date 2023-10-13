package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSymptonsSensitiveTeeth_Pages extends BaseClass{
	
	public SensodyneSymptonsSensitiveTeeth_Pages(){
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
	
	@FindBy(xpath = "(//a[@title='Understanding Sensitivity'])[1]")
	private static WebElement UnderstandingSensitivity;

	@FindBy(xpath = "(//a[text()='Common Symptoms of Sensitive Teeth | Sensodyne '])[1]")
	private static WebElement CommonSymptonsSensitiveTeeth;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd first \"])[1]")
	private static WebElement HomeIcon_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item even \"])[1]")
	private static WebElement UnderstandingSenstivity_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd last is-current \"])[1]")
	private static WebElement CommonSymptonsSenstiveTeeth_Bread;
	
	@FindBy(xpath = "//span[text()='Tips']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Hot']")
	private static WebElement Hot;
	
	@FindBy(xpath = "//a[text()='Cold']")
	private static WebElement Cold;

	@FindBy(xpath = "(//a[text()='Learn More'])[1]")
	private static WebElement LearnMore;
	
	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
	private static WebElement Header2;
	
	@FindBy(xpath = "//button[text()='Take the Quiz']")
	private static WebElement Quiz;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/causes-of-tooth-sensitivity/\"])[4]")
	private static WebElement CausesSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement TreatingSensitiveTeeth;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement HowSensodyneHelp;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement SensodyneProducts;
	
	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Hot']")
	private static WebElement radioButtonOne;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Cold']")
	private static WebElement radioButtonTwo;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Sweet']")
	private static WebElement radioButtonThree;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Sour']")
	private static WebElement radioButtonFour;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Spicy']")
	private static WebElement radioButtonFive;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Other']")
	private static WebElement radioButtonSix;

	@FindBy(xpath = "//input[@class='gigya-input-radio fd-radio gigya-valid']")
	private static WebElement radioActive;

	@FindBy(xpath = "(//input[@class='gigya-input-text'])[2]")
	private static WebElement txtEmailAddress;

	@FindBy(xpath = "(//input[@class='gigya-input-submit'])[2]")
	private static WebElement btnSubmit;

	@FindBy(xpath = "//input[@disabled='true']")
	private static WebElement submitVerification;

	
	
	
	
	
	
	
	
	
	
	
	
//Methods//
	
	public void clickCookieBtn() throws Exception {
        //elementToBeClickable(cookieBtn);
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
        //elementToBeClickable(gigyaForm);
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

	public void clickOnCommonSymptonsSenstiveTeeth() throws Exception {
		moveToElement(UnderstandingSensitivity);
		elementClick(CommonSymptonsSensitiveTeeth);
	}
	public void clickOnHomeIcon_Breadcrumb() throws Exception {
		//moveToElement(CommonSymptonsSensitiveTeeth);
		elementClick(HomeIcon_Bread);
		
	}
	public void clickOnUnderStandingSensitivity_Breadcrumb() throws Exception {
		//moveToElement(CommonSymptonsSensitiveTeeth);
		elementClick(UnderstandingSenstivity_Bread);
		
	}
	public void clickOnCommonSymptonsSensitiveTeeth_Breadcrumb() throws Exception {
		//moveToElement(CommonSymptonsSensitiveTeeth);
		elementClick(CommonSymptonsSenstiveTeeth_Bread);
		
	}
	public void clickOnHot_Link() throws Exception {
		//moveToElement(CommonSymptonsSensitiveTeeth);
	scrollDownUsingElement(Header1);
    clickElementUsingJavaScript(Hot);
		
	}
	public void clickOnCold_Link() throws Exception {
		//moveToElement(CommonSymptonsSensitiveTeeth);
		scrollDownUsingElement(Header1);
	   clickElementUsingJavaScript(Cold);
			
		}
	public void clickOnLearnMore_Link() throws Exception {
		scrollDownUsingElement(Cold);
	   elementClick(LearnMore);
			
		}
	public void clickRadioButtonOne() throws Exception{
		scrollDownUsingElement(radioButtonOne);
		clickElementUsingJavaScript(radioButtonOne);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonTwo() throws Exception{
		scrollDownUsingElement(radioButtonTwo);
		clickElementUsingJavaScript(radioButtonTwo);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonThree() throws Exception{
		scrollDownUsingElement(radioButtonThree);
		clickElementUsingJavaScript(radioButtonThree);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonFour() throws Exception{
		scrollDownUsingElement(radioButtonFour);
		clickElementUsingJavaScript(radioButtonFour);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonFive() throws Exception{
		scrollDownUsingElement(radioButtonFive);
		clickElementUsingJavaScript(radioButtonFive);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonSix() throws Exception{
		scrollDownUsingElement(radioButtonSix);
		clickElementUsingJavaScript(radioButtonSix);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}
	public void clickOnQuiz_Link() throws Exception {
		scrollDownUsingElement(Header2);
	    clickElementUsingJavaScript(Quiz);
			
		}
	public void clickOnCausesSensitiveTeeth_Link() throws Exception {
		scrollDownUsingElement(CausesSensitiveTeeth);
	  clickElementUsingJavaScript(CausesSensitiveTeeth);
			
		}
	public void clickOnTreatingSensitiveTeeth_Link() throws Exception {
		scrollDownUsingElement(TreatingSensitiveTeeth);
	    clickElementUsingJavaScript(TreatingSensitiveTeeth);
			
		}
	public void clickOnHowSensodyneHelp_Link() throws Exception {
		scrollDownUsingElement(HowSensodyneHelp);
	    clickElementUsingJavaScript(HowSensodyneHelp);
			
		}
	public void clickOnSensodyneProducts_Link() throws Exception {
		scrollDownUsingElement(SensodyneProducts);
	  clickElementUsingJavaScript(SensodyneProducts);
			
		}
	
	
	

}
