package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateyourbonesbeyondPage extends BaseClass{

	public CaltrateyourbonesbeyondPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement bonehealthcentralbreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[3]")
    private static WebElement Interactivetoolbreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[4]")
    private static WebElement caltrateyourbonesbeyondbreadcrumbs;
	
    @FindBy(xpath = "//span[text()='1. HORMONES']")
    private static WebElement hormones;
	
    @FindBy(xpath = "//li[@class=\"accordion-slide first odd\"]")
    private static WebElement hormonesopen;
	
    @FindBy(xpath = "//span[text()='2. TEETH']")
    private static WebElement teeth;
	
    @FindBy(xpath = "(//li[@class=\"accordion-slide even\"])[1]")
    private static WebElement teethopen;
	
    @FindBy(xpath = "//span[text()='3. MUSCLES']")
    private static WebElement muscles;
	
    @FindBy(xpath = "(//li[@class=\"accordion-slide odd\"])[1]")
    private static WebElement musclesopen;
	
    @FindBy(xpath = "//span[text()='4. NERVES']")
    private static WebElement nerves;
	
    @FindBy(xpath = "(//li[@class=\"accordion-slide even\"])[2]")
    private static WebElement nervesopen;
    
    @FindBy(xpath = "//span[text()='5. ENZYMES']")
    private static WebElement enzymes;
    
    @FindBy(xpath = "//ul[@class=\"accordion-container\"]//li[5]")
    private static WebElement enzymesopen;
    
    @FindBy(xpath = "//span[text()='6. EARLY LIFE BONE BUILDING']")
    private static WebElement earlylifebone;
    
    @FindBy(xpath = "//ul[@class=\"accordion-container\"]//li[6]")
    private static WebElement earlylifeboneopen;
    
    @FindBy(xpath = "//span[text()='7. MAINTAINING BONE STRENGTH']")
    private static WebElement maintaingbonestrength;
    
    @FindBy(xpath = "//ul[@class=\"accordion-container\"]//li[7]")
    private static WebElement maintaingbonestrengthopen;
    
    @FindBy(xpath = "//span[text()='8. BLOOD CLOTTING']")
    private static WebElement bloodclotting;
    
    @FindBy(xpath = "//ul[@class=\"accordion-container\"]//li[8]")
    private static WebElement bloodclottingopen;
    
    @FindBy(xpath = "//div[@class=\"image component section switchable-image first odd col-xs-12\"]")
    private static WebElement calciumcarbonate_img;
    
    @FindBy(xpath = "//span[text()='Calcium Carbonate vs Calcium Citrate']")
    private static WebElement calciumcarbonate;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/calcium-carbonate-vs-calcium-citrate/\"]")
    private static WebElement findout;
    
    @FindBy(xpath = "//h3[text()='PRODUCT']")
    private static WebElement heading;
    
    @FindBy(xpath = "//div[@class=\"box component section bg-color-white p-d-2 p-m-2 box-shadow-df first odd last col-xs-12\"]//child::img")
    private static WebElement caltratesoftchewproduct;
    
    //BoneHealth Central//
    
    @FindBy(xpath = "//a[text()='All Articles']")
    private static WebElement allarticles;
    
    @FindBy(xpath = "//a[text()='All Recipes']")
    private static WebElement allrecipes;
    
    @FindBy(xpath = "//a[text()='All Health Tips']")
    private static WebElement allhealthtips;
    
    @FindBy(xpath = "//a[text()='All Interactive Tools']")
    private static WebElement allinterativetools;
    
    //View by Topic//
    
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/calcium-and-calcium-carbonate/\"])[3]")
    private static WebElement calciumcarbonateView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[3]")
    private static WebElement vitaminDView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosisView;
    
    @FindBy(xpath = "(//a[text()='Calcium Supplements'])[2]")
    private static WebElement calciumsupplementsView;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
    //methods
   	
   	public void clickCookieBtn() throws Exception {
           if (isElementPresent(cookieBtn)) {
               elementToBeClickable(cookieBtn);
               try {
                   if (cookieBtn.isDisplayed()) {
                       clickElementUsingJavaScript(cookieBtn);
                   }
                 implicitWait();
                  actionClick(cookieClose);
                   Assert.assertTrue(elementIsDisplayed(cookieClose));
               } catch (Exception e) {
               }
           }else {
               System.out.println("Dismiss is not presented");
           }
   	}
   	
   	
   	
   	public void clickonHomebreadcrumbs() throws Throwable {
   		waitForPageLoadJava();
   		elementClick(Homebreadcrumbs);
   }
   	public void clickonbonehealthcentralbreadcrumbs() throws Throwable {
   		waitForPageLoadJava();
   		elementClick(bonehealthcentralbreadcrumbs);
   }	
   	public void clickonInteractiveToolbreadcrumbs() throws Throwable {
   		waitForPageLoadJava();
   		elementClick(Interactivetoolbreadcrumbs);
   }	
	public void clickonCaltrateyourbonesbeyondbreadcrumbs() throws Throwable {
   		waitForPageLoadJava();
   		elementClick(caltrateyourbonesbeyondbreadcrumbs);
   }	
	public void clickonHormones() throws Throwable {
		scrollDownUsingElement(hormones);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(hormones);
   		visibilityOf(hormonesopen);
   		boolean elementIsDisplayed=elementIsDisplayed(hormonesopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonTeeth() throws Throwable {
		scrollDownUsingElement(teeth);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(teeth);
   		//visibilityOf(teethopen);
   		boolean elementIsDisplayed=elementIsDisplayed(teethopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonMuscles() throws Throwable {
		scrollDownUsingElement(muscles);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(muscles);
   		visibilityOf(musclesopen);
   		boolean elementIsDisplayed=elementIsDisplayed(musclesopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonNerves() throws Throwable {
		scrollDownUsingElement(nerves);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(nerves);
   		visibilityOf(nervesopen);
   		implicitWait();
   		boolean elementIsDisplayed=elementIsDisplayed(nervesopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonEnzymes() throws Throwable {
		scrollDownUsingElement(enzymes);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(enzymes);
   		//visibilityOf(nervesopen);
   		boolean elementIsDisplayed=elementIsDisplayed(enzymesopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonearlybonebuliding() throws Throwable {
		scrollDownUsingElement(earlylifebone);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(earlylifebone);
   		visibilityOf(earlylifeboneopen);
   		boolean elementIsDisplayed=elementIsDisplayed(earlylifeboneopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonMaintaingBoneStrength() throws Throwable {
		scrollDownUsingElement(maintaingbonestrength);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(maintaingbonestrength);
   		visibilityOf(maintaingbonestrengthopen);
   		boolean elementIsDisplayed=elementIsDisplayed(maintaingbonestrengthopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonBloodClothing() throws Throwable {
		scrollDownUsingElement(bloodclotting);
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(bloodclotting);
   		visibilityOf(bloodclottingopen);
   		boolean elementIsDisplayed=elementIsDisplayed(bloodclottingopen);
   		Assert.assertTrue(elementIsDisplayed);
   		
   }	
	public void clickonCalciumcarbonateImg() throws Throwable {
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(calciumcarbonate_img);
   }	
	public void clickonCalciumcarbonate() throws Throwable {
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(calciumcarbonate);
   }	
	public void clickonFindout() throws Throwable {
   		waitForPageLoadJava();
   		clickElementUsingJavaScript(findout);
   }	
	public void clickoncaltratesoftchewproduct() throws Throwable {
   		waitForPageLoadJava();
   		scrollDownUsingElement(heading);
   		clickElementUsingJavaScript(caltratesoftchewproduct);
   }	
	public void clickonAllArticles() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allarticles);
  }
	public void clickonAllRecipes() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allrecipes);
  }
	public void clickonAllHealthTips() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allhealthtips);
  }
	public void clickonAllInteractiveTools() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allinterativetools);
  }
	public void clickonCalciumcarbonateView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumcarbonateView);
  }
	public void clickonvitaminDView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(vitaminDView);
  }
	public void clickonOsteoporsisView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(osteoporosisView);
  }
	public void clickoncalciumsupplementsView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumsupplementsView);
  }
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
