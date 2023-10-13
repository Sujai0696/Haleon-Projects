package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelLivingWithArthritisPage extends BaseClass{
	
	public VoltarengelLivingWithArthritisPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "//h2[@class='footer__gigya-heading ']//self::h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
    @FindBy(xpath = "//a[normalize-space()='Homepage']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[@href='/living-with-arthritis/']//self::a[text()='Living with Arthritis']")
    private static WebElement breadcrumbTwo;
    
    @FindBy(xpath = "(//div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6'])[1]")
    private static WebElement readMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//ancestor::strong[text()='READ MORE']")
    private static WebElement wholeCardReadMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/natural-remedies/']//ancestor::strong[text()='READ MORE']")
    private static WebElement wholeCardReadMoreTwo;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/stress/']//ancestor::strong[text()='READ MORE']")
    private static WebElement wholeCardReadMoreThree;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/first-arthritis-friendly-site/']//ancestor::strong[text()='READ MORE']")
    private static WebElement wholeCardReadMoreFour;
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/']//self::a[text()='LEARN MORE']")
    private static WebElement learnMore;
    
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/use-your-head-to-navigate-websites/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreNavigateWebsites;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/effects-of-aging-on-the-body/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreAgingOnTheBody;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreArthritisAndJointRelief;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreManageYourArthritis;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-wrist-pain/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreRelieveWristPain;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-joint-pain/']//ancestor::a[text()='READ MORE']")
    private static WebElement readMoreRelieveJointpain;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/is-arthritis-hereditary/']//ancestor::strong[text()='READ MORE']")
    private static WebElement readMoreArthritisHereditary;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/morning-routine-arthritis-relief/']//ancestor::a[text()='READ MORE']")
    private static WebElement readMoreRoutineForArthritisRelief;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/arthritis-pain-management-while-traveling/']//ancestor::a[text()='READ MORE']")
    private static WebElement readMorePainWhileTravelling;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/arthritis-diet/']//ancestor::a[text()='READ MORE']")
    private static WebElement readMoreFoodsToHelpArthritis;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/yoga-for-arthritis/']//ancestor::a[text()='READ MORE']")
    private static WebElement readMorePosesForPhysicalComfort;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickWholeCardReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreOne)) {
			clickElementUsingJavaScript(wholeCardReadMoreOne);
			pageLoad();
			System.out.println("Whole card Read More One clicked successfully");
		} else {
			System.out.println("Whole card Read More One is not presented in the page");
			throw new Exception("Whole card Read More One is not presented in the page");
		}
	}
	
	public void clickWholeCardReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreTwo)) {
			clickElementUsingJavaScript(wholeCardReadMoreTwo);
			pageLoad();
			System.out.println("Whole card Read More Two clicked successfully");
		} else {
			System.out.println("Whole card Read More Two is not presented in the page");
			throw new Exception("Whole card Read More Two is not presented in the page");
		}
	}
	
	public void clickWholeCardReadMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreThree)) {
			clickElementUsingJavaScript(wholeCardReadMoreThree);
			pageLoad();
			System.out.println("Whole card Read More Three clicked successfully");
		} else {
			System.out.println("Whole card Read More Three is not presented in the page");
			throw new Exception("Whole card Read More Three is not presented in the page");
		}
	}
	
	public void clickWholeCardReadMoreFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreFour)) {
			clickElementUsingJavaScript(wholeCardReadMoreFour);
			pageLoad();
			System.out.println("Whole card Read More Four clicked successfully");
		} else {
			System.out.println("Whole card Read More Four is not presented in the page");
			throw new Exception("Whole card Read More Four is not presented in the page");
		}
	}
	
	public void clickLearnMore() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMore)) {
			clickElementUsingJavaScript(learnMore);
			pageLoad();
			System.out.println("Learn More clicked successfully");
		} else {
			System.out.println("Learn More is not presented in the page");
			throw new Exception("Learn More is not presented in the page");
		}
	}
	
	public void clickReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(readMoreOne)) {
			scrollDownUsingElement(readMoreOne);
//			elementClick(learnMore);
			moveToElement(readMoreOne);
			actionClick(readMoreOne);
			pageLoad();
			System.out.println("Read More One Clicked Successfully");
		} else {
			System.out.println("Read More One is not presented in the page");
			throw new Exception("Read More One is not presented in the page");
		}
		
	}

}
