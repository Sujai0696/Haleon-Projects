package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneunexpectedwaysStressaffect_Pages extends BaseClass{
	
	public SensodyneunexpectedwaysStressaffect_Pages(){
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
	
	@FindBy(xpath = "//a[text()='Lasting Protection from Tooth Sensitivity | Sensodyne']")
	private static WebElement lastingprojectionBreadcrumbs;
	
	@FindBy(xpath = "//a[text()='Oral Health Tips']")
	private static WebElement oralhealthtipsBreadCrumbs;
	
	@FindBy(xpath = "//h1[text()='3 Unexpected Ways Holiday Stress Affects Your Body']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement Articlelist;
	
	@FindBy(xpath = "//h3[text()='Lethargy']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='is an association']")
	private static WebElement association;
	
	@FindBy(xpath = "//a[text()='because of lack of sleep, due to stress']")
	private static WebElement lackofsleep;
	
	@FindBy(xpath = "//a[text()='don’t help either']")
	private static WebElement donthelp;
	
	@FindBy(xpath = "//a[text()='properly nourishing your body']")
	private static WebElement properlynourshingbody;
	
	@FindBy(xpath = "//a[text()='exercise routine']")
	private static WebElement exerciseroutine;
	
	@FindBy(xpath = "//a[text()='approximately 70 percent']")
	private static WebElement approximately70percent;
	
	@FindBy(xpath = "//a[text()='Dr. Ephraim Winocur suggests']")
	private static WebElement drephraim;
	
	@FindBy(xpath = "//a[@href=\"https://www.sensodyne.com/en-us/products/sensodyne-rapid-relief-extra-fresh-toothpaste/\"]")
	private static WebElement sensodynepainrelief;
	
	@FindBy(xpath = "//a[text()='Stress eating']")
	private static WebElement stresseating;
	
	@FindBy(xpath = "//a[text()='as much as 3,000 calories']")
	private static WebElement asmuchcalories;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[@href=\"/en-us/oral-health-tips/mantras-to-increase-positivity/\"]")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='3 Nighttime Rituals To Reduce Stress']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Unusual Resolutions To Make This Year']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[@href=\"/en-us/oral-health-tips/oral-health-tips-and-tricks/\"]")
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
    public void clickOnLastingprojectionssBreadcrumbs() throws Exception {
    	moveToElement(lastingprojectionBreadcrumbs);
		clickElementUsingJavaScript(lastingprojectionBreadcrumbs);
	}
    public void clickOnOralhealthtipsBreadcrumbs() throws Exception {
    	//moveToElement(unexpectedwaysstressaffectbodyBreadCrumbs);
		elementClick(oralhealthtipsBreadCrumbs);
	}
    public void clickOnArticleList() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Articlelist);
		clickElementUsingJavaScript(Articlelist);
	}
    public void clickOnAssociation() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(association);
		clickElementUsingJavaScript(association);
	}
    public void clickOnlackofsleep() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(lackofsleep);
		clickElementUsingJavaScript(lackofsleep);
	}
    public void clickOndonthelp() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(donthelp);
		clickElementUsingJavaScript(donthelp);
	}
    public void clickOnproperlynourshingbody() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(properlynourshingbody);
		clickElementUsingJavaScript(properlynourshingbody);
	}
    public void clickOnexerciseroutine() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(exerciseroutine);
		clickElementUsingJavaScript(exerciseroutine);
	}
    public void clickOnapproximately70percent() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(approximately70percent);
		clickElementUsingJavaScript(approximately70percent);
	}
    public void clickOndrephraim() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(drephraim);
		clickElementUsingJavaScript(drephraim);
	}
    public void clickOnSensodynepainRelief() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(sensodynepainrelief);
		clickElementUsingJavaScript(sensodynepainrelief);
	}
    public void clickOnStresseating() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(stresseating);
		elementClick(stresseating);
	}
    public void clickOncalories() throws Exception {
    	scrollDownUsingElement(stresseating);
    	moveToElement(asmuchcalories);
		clickElementUsingJavaScript(asmuchcalories);
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
