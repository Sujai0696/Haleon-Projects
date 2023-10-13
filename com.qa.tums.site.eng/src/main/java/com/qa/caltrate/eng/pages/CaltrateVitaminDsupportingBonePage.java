package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateVitaminDsupportingBonePage extends BaseClass {
	
	public CaltrateVitaminDsupportingBonePage() {
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
    private static WebElement Articlebreadcrumbs;		
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[4]")
    private static WebElement calciumVitaminDbreadcrumbs;
	
    @FindBy(xpath = "//div[@class=\"richText component section default-style first odd last col-xs-12\"]//child::a[1]")
    private static WebElement CalciumcarbonateTag;
	
    @FindBy(xpath = "//div[@class=\"richText component section default-style first odd last col-xs-12\"]//child::a[2]")
    private static WebElement VitaminDTag;
	
    @FindBy(xpath = "//div[@class=\"richText component section default-style first odd last col-xs-12\"]//child::a[3]")
    private static WebElement OsteoporsosisTag;
	
    @FindBy(xpath = "//div[@class=\"richText component section default-style first odd last col-xs-12\"]//child::a[4]")
    private static WebElement ArticlesTag;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/vitamin-d-and-your-health/\"])[1]")
    private static WebElement vitaminD;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/surgeon-generals-report/\"]")
    private static WebElement SurgeonReport;
    
    @FindBy(xpath = "//div[@class=\"image component section switchable-image first odd col-xs-12\"]//img")
    private static WebElement calciumAbsorption;
    
    @FindBy(xpath = "//span[text()='Maximize Your Calcium Absorption.*']")
    private static WebElement MaximizecalciumAbsorption;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/vitamin-d-and-your-health/\"])[2]")
    private static WebElement Learnmore;
    
    @FindBy(xpath = "//div[@class=\"box component section bg-color-white p-d-2 p-m-2 box-shadow-df anchor-box first odd last col-xs-12\"]//img")
    private static WebElement caltrate600d3softchews;
    
    @FindBy(xpath = "//a[text()='All Articles']")
    private static WebElement allarticles;
    
    @FindBy(xpath = "//a[text()='All Recipes']")
    private static WebElement allrecipes;
    
    @FindBy(xpath = "//a[text()='All Health Tips']")
    private static WebElement allhealthtips;
    
    @FindBy(xpath = "//a[text()='All Interactive Tools']")
    private static WebElement allinterativetools;
    
    //View by Topic//
    
    
    @FindBy(xpath = "(//a[text()='Calcium and Calcium Carbonate'])[2]")
    private static WebElement calciumcarbonateView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[4]")
    private static WebElement vitaminDView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosisView;
    
    @FindBy(xpath = "(//a[text()='Calcium Supplements'])[2]")
    private static WebElement calciumsupplementsView;
	
	
    
//methods
  	
  	public void clickCookieBtn() throws Exception {
  		//visibilityOf(cookieBtn);
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
  		elementClick(Homebreadcrumbs);
  }
  	public void clickonBonehealthcentralbreadcrumbs() throws Throwable {
  		elementClick(bonehealthcentralbreadcrumbs);
  }
  	public void clickonArticlebreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(Articlebreadcrumbs);
  }
  	public void clickoncalciumVitaminDboneHealthbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(calciumVitaminDbreadcrumbs);
  }
  	public void clickoncalciumcarbonateTag() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(CalciumcarbonateTag);
  }
  	public void clickonVitaminDTag() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(VitaminDTag);
  }
  	public void clickonOsteoporosisTag() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(OsteoporsosisTag);
  }
  	public void clickonArticlesTag() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(ArticlesTag);
  }
  	public void clickonVitaminD() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(vitaminD);
  }
  	public void clickonSurgeonReport() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(SurgeonReport);
  }
  	public void clickonCalciumAbsorption() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumAbsorption);
  }
  	public void clickonMaximizeCalciumAbsorption() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(MaximizecalciumAbsorption);
  }
  	public void clickonLearnMore() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Learnmore);
  }
  	public void clickonCaltrate600d3softchews() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrate600d3softchews);
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
