package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneProductResult_Pages extends BaseClass {
	
	public SensodyneProductResult_Pages() {
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
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]")
    private static WebElement ourproductsbreadcrumbs;
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
    private static WebElement ProductResultbreadcrumbs;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]")
    private static WebElement ProductResultDisplay;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[1]")
    private static WebElement ProductResultDisplay1;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[2]")
    private static WebElement ProductResultDisplay2;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[3]")
    private static WebElement ProductResultDisplay3;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[4]")
    private static WebElement ProductResultDisplay4;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[5]")
    private static WebElement ProductResultDisplay5;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[6]")
    private static WebElement ProductResultDisplay6;
	
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[7]")
    private static WebElement ProductResultDisplay7;
    
    @FindBy(xpath = "//div[@class=\"filter-buttons\"]//div[8]")
    private static WebElement ProductResultDisplay8;
    
    @FindBy(xpath = "//a[text()='Get Results']")
    private static WebElement getResult;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/\"])[2]")
    private static WebElement Sensitivtygumcleanfresh;
    
   // @FindBy(xpath = "//div[@class=\"image component section zglazyload switchable-image even col-xs-12\"]//img[1]")
   // private static WebElement Sensitivtygumcleanfresh_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
    private static WebElement Sensitivtygumcleanfresh_BuyNow;
    
    @FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
    private static WebElement BuyNowClose;
    
    @FindBy(xpath = "//h2[text()='Sensitivity & Gum, Clean & Fresh 3.4 oz']")
    private static WebElement Sensitivtygumcleanfresh_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[2]")
    private static WebElement Sensitivtygumwhitening;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[1]//img")
    //private static WebElement Sensitivtygumwhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
    private static WebElement Sensitivtygumwhitening_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Sensitivity & Gum, Whitening 3.4 oz']")
    private static WebElement Sensitivtygumwhitening_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/\"])[3]")
    private static WebElement SensitivtygumMint;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[2]")
   // private static WebElement SensitivtygumMint_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
    private static WebElement SensitivtygumMint_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
    private static WebElement SensitivtygumMint_txt;
    
    @FindBy(xpath = "//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"]")
    private static WebElement Sensitivtycaretoothbrush;
    
    //@FindBy(xpath = "(//div[@class=\"image component section zglazyload switchable-image even col-xs-12 col-md-12\"])//img")
   // private static WebElement Sensitivtycaretoothbrush_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
    private static WebElement Sensitivtycaretoothbrush_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
    private static WebElement Sensitivtycaretoothbrush_txt;
    
    //2nd Row//
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/\"])[2]")
    private static WebElement Rapidreliefwhitening;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[3]")
    //private static WebElement Rapidreliefwhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
    private static WebElement Rapidreliefwhitening_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Rapid Relief, Whitening 3.4 oz']")
    private static WebElement Rapidreliefwhitening_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
    private static WebElement RapidreliefMint;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[4]")
   // private static WebElement RapidreliefMint_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
    private static WebElement RapidreliefMint_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Rapid Relief, Mint 3.4 oz']")
    private static WebElement RapidreliefMint_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-extra-fresh-toothpaste/\"])[2]")
    private static WebElement Rapidreliefextrafresh;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[5]")
   // private static WebElement Rapidreliefextrafresh_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[7]")
    private static WebElement Rapidreliefextrafresh_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Rapid Relief, Extra Fresh 3.4 oz']")
    private static WebElement Rapidreliefextrafresh_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
    private static WebElement Repairprotectwhitening;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[6]//img")
    //private static WebElement Repairprotectwhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[8]")
    private static WebElement Repairprotectwhitening_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Repair & Protect, Whitening 3.4 oz']")
    private static WebElement Repairprotectwhitening_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-extra-fresh-toothpaste/\"])[2]")
    private static WebElement Repairprotectextrafresh;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[7]")
   // private static WebElement Repairprotectextrafresh_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[9]")
    private static WebElement Repairprotectextrafresh_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Repair & Protect, Extra Fresh 3.4 oz']")
    private static WebElement Repairprotectextrafresh_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[2]")
    private static WebElement Repairandprotect;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[8]//img")
   // private static WebElement Repairandprotect_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[10]")
    private static WebElement Repairandprotect_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Repair & Protect, 3.4 oz']")
    private static WebElement Repairandprotect_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
    private static WebElement completeprotectionextrafresh;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[9]//img")
   // private static WebElement completeprotectionextrafresh_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[11]")
    private static WebElement completeprotectionextrafresh_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Complete Protection, Extra Fresh 3.4 oz']")
    private static WebElement completeprotectionextrafresh_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-toothpaste/\"])[2]")
    private static WebElement completeprotection;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[10]//img")
    //private static WebElement completeprotection_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[12]")
    private static WebElement completeprotection_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Complete Protection, Original 3.4 oz']")
    private static WebElement completeprotection_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[2]")
    private static WebElement Truewhiteextrafresh;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[11]//img")
   // private static WebElement Truewhiteextrafresh_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[13]")
    private static WebElement Truewhiteextrafresh_BuyNow;
    
    @FindBy(xpath = "//h2[text()='True White, Extra Fresh 3.0 oz']")
    private static WebElement Truewhiteextrafresh_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-mint-toothpaste/\"])[2]")
    private static WebElement TruewhiteMint;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[12]")
   // private static WebElement TruewhiteMint_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[14]")
    private static WebElement TruewhiteMint_BuyNow;
    
    @FindBy(xpath = "//h2[text()='True White, Mint 3.0 oz']")
    private static WebElement TruewhiteMint_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[2]")
    private static WebElement Deepclean;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[13]//img")
    //private static WebElement Deepclean_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[15]")
    private static WebElement Deepclean_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Deep Clean, 4.0 oz']")
    private static WebElement Deepclean_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
    private static WebElement extrawhitening;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[14]")
    //private static WebElement extrawhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[16]")
    private static WebElement extrawhitening_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Extra Whitening, 4.0 oz']")
    private static WebElement extrawhitening_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
    private static WebElement FreshMint;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[15]")
   // private static WebElement FreshMint_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[17]")
    private static WebElement FreshMint_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Fresh Mint, 4.0 oz']")
    private static WebElement FreshMint_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-full-protection-toothpaste/\"])[2]")
    private static WebElement fullprotection;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[16]//img")
    //private static WebElement fullprotection_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[18]")
    private static WebElement fullprotection_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Full Protection + Whitening, 4.0 oz']")
    private static WebElement fullprotection_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-tartar-control-toothpaste/\"])[2]")
    private static WebElement Tartarcontrol;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[17]//img")
    //private static WebElement Tartarcontrol_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[19]")
    private static WebElement Tartarcontrol_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Tartar Control + Whitening 4.0 oz']")
    private static WebElement Tartarcontrol_txt;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-impact-toothpaste/\"])[2]")
    private static WebElement Freshimpact;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[18]//img")
    //private static WebElement Freshimpact_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[20]")
    private static WebElement Freshimpact_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Fresh Impact, 4.0 oz']")
    private static WebElement Freshimpact_txt;
    
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/gentle-whitening-toothpaste/\"]")
    private static WebElement Pronamelgentlewhitening;
    
   // @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/gentle-whitening-toothpaste/\"]")
    //private static WebElement Pronamelgentlewhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[21]")
    private static WebElement Pronamelgentlewhitening_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Gentle Whitening, 4.0 oz']")
    private static WebElement Pronamelgentlewhitening_txt;
    
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/multi-action-toothpaste/\"]")
    private static WebElement Pronamelmultiaction;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[20]//img")
   // private static WebElement Pronamelmultiaction_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[22]")
    private static WebElement Pronamelmultiaction_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Multi-Action 4.0 oz']")
    private static WebElement Pronamelmultiaction_txt;
    
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/fresh-breath-toothpaste/\"]")
    private static WebElement Pronamelfreshbreathe;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[21]//img")
    //private static WebElement Pronamelfreshbreathe_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[23]")
    private static WebElement Pronamelfreshbreathe_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Fresh Breath, 4.0 oz']")
    private static WebElement Pronamelfreshbreathe_txt;
    
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/daily-protection-toothpaste/\"]")
    private static WebElement Pronameldailyprotection;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[22]//img")
   // private static WebElement Pronameldailyprotection_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[24]")
    private static WebElement Pronameldailyprotection_BuyNow;
    
    @FindBy(xpath = "//h2[text()='Daily Protection, 4.0 oz']")
    private static WebElement Pronameldailyprotection_txt;
  
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/strong-bright-mint-whitening-toothpaste/\"]")
    private static WebElement Pronamelmineralboostrefreshing;
    
   // @FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[23]//img")
   // private static WebElement Pronamelmineralboostrefreshing_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[25]")
    private static WebElement Pronamelmineralboostrefreshing_BuyNow;
    
    @FindBy(xpath = "//h2[text()='True White, Mint 3.0 oz']")
    private static WebElement Pronamelmineralboostrefreshing_txt;
    
    @FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/strong-bright-extra-fresh-whitening-toothpaste/\"]")
    private static WebElement Pronamelmineralboostgentlewhitening;
    
    //@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[24]//img")
    //private static WebElement Pronamelmineralboostgentlewhitening_img;
    
    @FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[26]")
    private static WebElement Pronamelmineralboostgentlewhitening_BuyNow;
    
    @FindBy(xpath = "(//h2[text()='True White, Extra Fresh 3.0 oz'])[2]")
    private static WebElement Pronamelmineralboostgentlewhitening_txt;
    
    @FindBy(xpath = "//a[text()='Get your Coupon']")
    private static WebElement getcoupon;
    
    @FindBy(xpath = "//a[text()='Find your Store']")
    private static WebElement findyourstore;
    
    
    
    
    
    
	
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
      
      public void  clickOnOurProductsBreadcrumbs() throws Exception {
      	moveToElement(ourproductsbreadcrumbs);
      	clickElementUsingJavaScript(ourproductsbreadcrumbs);
      }
      public void  clickOnProductsResultBreadcrumbs() throws Exception {
        	moveToElement(ProductResultbreadcrumbs);
        	clickElementUsingJavaScript(ProductResultbreadcrumbs);
        }
      public void  clickOnProductsResultDisplay() throws Exception {
      	moveToElement(ProductResultDisplay);
      	clickElementUsingJavaScript(ProductResultDisplay);
      	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay);
      	Assert.assertTrue(elementIsDisplayed);
      }
      public void  clickOnProductsResultDisplay1() throws Exception {
        	moveToElement(ProductResultDisplay1);
        	clickElementUsingJavaScript(ProductResultDisplay1);
        	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay1);
        	Assert.assertTrue(elementIsDisplayed);
        }
      public void  clickOnProductsResultDisplay2() throws Exception {
      	moveToElement(ProductResultDisplay2);
      	clickElementUsingJavaScript(ProductResultDisplay2);
      	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay2);
      	Assert.assertTrue(elementIsDisplayed);
      }
      public void  clickOnProductsResultDisplay3() throws Exception {
        	moveToElement(ProductResultDisplay3);
        	clickElementUsingJavaScript(ProductResultDisplay3);
        	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay3);
        	Assert.assertTrue(elementIsDisplayed);
        }
      public void  clickOnProductsResultDisplay4() throws Exception {
      	moveToElement(ProductResultDisplay4);
      	clickElementUsingJavaScript(ProductResultDisplay4);
      	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay4);
      	Assert.assertTrue(elementIsDisplayed);
      }
      public void  clickOnProductsResultDisplay5() throws Exception {
        	moveToElement(ProductResultDisplay5);
        	clickElementUsingJavaScript(ProductResultDisplay5);
        	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay5);
        	Assert.assertTrue(elementIsDisplayed);
        }
      public void  clickOnProductsResultDisplay6() throws Exception {
      	moveToElement(ProductResultDisplay6);
      	clickElementUsingJavaScript(ProductResultDisplay6);
      	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay6);
      	Assert.assertTrue(elementIsDisplayed);
      }
      public void  clickOnProductsResultDisplay7() throws Exception {
        	moveToElement(ProductResultDisplay7);
        	clickElementUsingJavaScript(ProductResultDisplay7);
        	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay7);
        	Assert.assertTrue(elementIsDisplayed);
        }
      public void  clickOnProductsResultDisplay8() throws Exception {
      	moveToElement(ProductResultDisplay8);
      	clickElementUsingJavaScript(ProductResultDisplay8);
      	boolean elementIsDisplayed=elementIsDisplayed(ProductResultDisplay8);
      	Assert.assertTrue(elementIsDisplayed);
      }
	   public void clickOnGetResult() throws Exception {
		   moveToElement(getResult);
		   clickElementUsingJavaScript(getResult);
	   }
	   public void clickOnSensitivitygumcleanfresh() throws Exception {
		   //moveToElement(Sensitivtygumcleanfresh);
		   clickElementUsingJavaScript(Sensitivtygumcleanfresh);
	   }

		/*
		 * public void clickOnSensitivitygumcleanfresh_img() throws Exception {
		 * scrollupUsingElement(getResult); boolean
		 * elementIsDisplayed=elementIsDisplayed(Sensitivtygumcleanfresh_img);
		 * Assert.assertTrue(elementIsDisplayed);
		 * 
		 * }
		 */
	   public void  clickOnSensitivityandgumcleanfresh_BuyNow() throws Exception {
	      	moveToElement(Sensitivtygumcleanfresh_BuyNow);
	      	clickElementUsingJavaScript(Sensitivtygumcleanfresh_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Sensitivtygumcleanfresh_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnSensitivitygumwhitening() throws Exception {
		  // moveToElement(Sensitivtygumwhitening);
		   clickElementUsingJavaScript(Sensitivtygumwhitening);
	   }

		/*
		 * public void clickOnSensitivitygumwhitening_img() throws Exception {
		 * scrollupUsingElement(Sensitivtygumwhitening); boolean
		 * elementIsDisplayed=elementIsDisplayed(Sensitivtygumwhitening_img);
		 * Assert.assertTrue(elementIsDisplayed); }
		 */
	   public void  clickOnSensitivitygumwhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(Sensitivtygumwhitening);
	      	clickElementUsingJavaScript(Sensitivtygumwhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Sensitivtygumwhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnSensitivitygumMint() throws Exception {
		   moveToElement(SensitivtygumMint);
		   clickElementUsingJavaScript(SensitivtygumMint);
	   }

		/*
		 * public void clickOnSensitivitygumMint_img() throws Exception {
		 * scrollupUsingElement(SensitivtygumMint);
		 * //moveToElement(SensitivtygumMint_img); boolean
		 * elementIsDisplayed=elementIsDisplayed(SensitivtygumMint_img);
		 * Assert.assertTrue(elementIsDisplayed); }
		 */
	   public void  clickOnSensitivitygumMint_BuyNow() throws Exception {
	      	scrollupUsingElement(SensitivtygumMint);
	      	clickElementUsingJavaScript(SensitivtygumMint_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(SensitivtygumMint_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnSensitivitycaretoothbrush() throws Exception {
		   scrollupUsingElement(Sensitivtycaretoothbrush);
		   moveToElement(Sensitivtycaretoothbrush);
		   clickElementUsingJavaScript(Sensitivtycaretoothbrush);
	   }

		/*
		 * public void clickOnSensitivitycaretoothbrush_img() throws Exception {
		 * scrollupUsingElement(Sensitivtycaretoothbrush);
		 * moveToElement(Sensitivtycaretoothbrush_img); boolean
		 * elementIsDisplayed=elementIsDisplayed(Sensitivtycaretoothbrush_img);
		 * Assert.assertTrue(elementIsDisplayed); }
		 */
	   public void  clickOnSensitivitycaretoothbrush_BuyNow() throws Exception {
	      	scrollupUsingElement(Sensitivtycaretoothbrush);
	      	clickElementUsingJavaScript(Sensitivtycaretoothbrush_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Sensitivtycaretoothbrush_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRapidreliefWhitening() throws Exception {
		   scrollupUsingElement(Sensitivtycaretoothbrush);
		   moveToElement(Rapidreliefwhitening);
		   clickElementUsingJavaScript(Rapidreliefwhitening);
	   }
//	   public void clickOnRapidreliefWhitening_img() throws Exception {
//		   scrollupUsingElement(Sensitivtycaretoothbrush);
//		   boolean elementIsDisplayed=elementIsDisplayed(Rapidreliefwhitening_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRapidReliefwhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(Sensitivtycaretoothbrush);
	      	clickElementUsingJavaScript(Rapidreliefwhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Rapidreliefwhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRapidreliefMint() throws Exception {
		   scrollupUsingElement(RapidreliefMint);
		   moveToElement(RapidreliefMint);
		   clickElementUsingJavaScript(RapidreliefMint);
	   }
//	   public void clickOnRapidreliefMint_img() throws Exception {
//		   scrollupUsingElement(RapidreliefMint_img);
//		   boolean elementIsDisplayed=elementIsDisplayed(RapidreliefMint_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRapidReliefMintBuyNow() throws Exception {
	      	scrollupUsingElement(Sensitivtycaretoothbrush);
	      	clickElementUsingJavaScript(RapidreliefMint_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(RapidreliefMint_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRapidreliefextrafresh() throws Exception {
		   scrollupUsingElement(Sensitivtycaretoothbrush);
		   moveToElement(Rapidreliefextrafresh);
		   clickElementUsingJavaScript(Rapidreliefextrafresh);
	   }
//	   public void clickOnRapidreliefextrafresh_img() throws Exception {
//		   scrollupUsingElement(Rapidreliefextrafresh_img);
//		   boolean elementIsDisplayed=elementIsDisplayed(Rapidreliefextrafresh_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRapidReliefextrafreshBuyNow() throws Exception {
	      	//scrollupUsingElement(Rapidreliefextrafresh_img);
	      	clickElementUsingJavaScript(Rapidreliefextrafresh_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Rapidreliefextrafresh_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRepairprotectwhitening() throws Exception {
		   scrollupUsingElement(Repairprotectwhitening);
		   clickElementUsingJavaScript(Repairprotectwhitening);
	   }
//	   public void clickOnRepairprotectwhitening_img() throws Exception {
//		   scrollupUsingElement(Repairprotectwhitening);
//		   boolean elementIsDisplayed=elementIsDisplayed(Repairprotectwhitening_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRepairprotectwhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(Repairprotectwhitening);
	      	clickElementUsingJavaScript(Repairprotectwhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Repairprotectwhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRepairprotectextrafresh() throws Exception {
		   scrollupUsingElement(Repairprotectextrafresh);
		   clickElementUsingJavaScript(Repairprotectextrafresh);
	   }
//	   public void clickOnRepairprotectextrafresh_img() throws Exception {
//		   scrollupUsingElement(Repairprotectextrafresh);
//		   boolean elementIsDisplayed=elementIsDisplayed(Repairprotectextrafresh_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRepairprotectextrafresh_BuyNow() throws Exception {
	      	scrollupUsingElement(Repairprotectextrafresh);
	      	clickElementUsingJavaScript(Repairprotectextrafresh_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Repairprotectextrafresh_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnRepairandprotect() throws Exception {
		   scrollupUsingElement(Repairandprotect);
		   clickElementUsingJavaScript(Repairandprotect);
	   }
//	   public void clickOnRepairandprotect_img() throws Exception {
//		   scrollupUsingElement(Repairandprotect);
//		   boolean elementIsDisplayed=elementIsDisplayed(Repairandprotect_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnRepairandprotect_BuyNow() throws Exception {
	      	scrollupUsingElement(Repairandprotect);
	      	clickElementUsingJavaScript(Repairandprotect_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Repairandprotect_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnCompleteprotection() throws Exception {
		   scrollupUsingElement(completeprotection);
		   clickElementUsingJavaScript(completeprotection);
	   }
//	   public void clickOnCompleteprotection_img() throws Exception {
//		   scrollupUsingElement(completeprotection);
//		   boolean elementIsDisplayed=elementIsDisplayed(completeprotection_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnCompleteprotection_BuyNow() throws Exception {
	      	scrollupUsingElement(completeprotection);
	      	clickElementUsingJavaScript(completeprotection_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(completeprotection_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnTruewhiteextrafresh() throws Exception {
		   scrollupUsingElement(Truewhiteextrafresh);
		   clickElementUsingJavaScript(Truewhiteextrafresh);
	   }
//	   public void clickOnTruewhiteextrafresh_img() throws Exception {
//		   scrollupUsingElement(Truewhiteextrafresh);
//		   boolean elementIsDisplayed=elementIsDisplayed(Truewhiteextrafresh_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnTruewhiteextrafresh_BuyNow() throws Exception {
	      	scrollupUsingElement(Truewhiteextrafresh);
	      	clickElementUsingJavaScript(Truewhiteextrafresh_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Truewhiteextrafresh_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnTruewhiteMint() throws Exception {
		   scrollupUsingElement(TruewhiteMint);
		   clickElementUsingJavaScript(TruewhiteMint);
	   }
//	   public void clickOnTruewhiteMint_img() throws Exception {
//		   scrollupUsingElement(TruewhiteMint);
//		   boolean elementIsDisplayed=elementIsDisplayed(TruewhiteMint_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnTruewhiteMint_BuyNow() throws Exception {
	      	scrollupUsingElement(TruewhiteMint);
	      	clickElementUsingJavaScript(TruewhiteMint_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(TruewhiteMint_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnDeepclean() throws Exception {
		   scrollupUsingElement(Deepclean);
		   clickElementUsingJavaScript(Deepclean);
	   }
//	   public void clickOnDeepClean_img() throws Exception {
//		   scrollupUsingElement(Deepclean);
//		   boolean elementIsDisplayed=elementIsDisplayed(Deepclean_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnDeepclean_BuyNow() throws Exception {
	      	scrollupUsingElement(Deepclean);
	      	clickElementUsingJavaScript(Deepclean_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Deepclean_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnextrawhitening() throws Exception {
		   scrollupUsingElement(extrawhitening);
		   clickElementUsingJavaScript(extrawhitening);
	   }
//	   public void clickOnextrawhitening_img() throws Exception {
//		   scrollupUsingElement(extrawhitening);
//		   boolean elementIsDisplayed=elementIsDisplayed(extrawhitening_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnextrawhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(extrawhitening);
	      	clickElementUsingJavaScript(extrawhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(extrawhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnFreshMint() throws Exception {
		   scrollupUsingElement(FreshMint);
		   clickElementUsingJavaScript(FreshMint);
	   }
//	   public void clickOnFreshMint_img() throws Exception {
//		   scrollupUsingElement(FreshMint);
//		   boolean elementIsDisplayed=elementIsDisplayed(FreshMint_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnFreshMint_BuyNow() throws Exception {
	      	scrollupUsingElement(FreshMint);
	      	clickElementUsingJavaScript(FreshMint_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(FreshMint_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnfullprotection() throws Exception {
		   scrollupUsingElement(fullprotection);
		   clickElementUsingJavaScript(fullprotection);
	   }
//	   public void clickOnFullprotection_img() throws Exception {
//		   scrollupUsingElement(fullprotection);
//		   boolean elementIsDisplayed=elementIsDisplayed(fullprotection_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnFullprotection_BuyNow() throws Exception {
	      	scrollupUsingElement(fullprotection);
	      	clickElementUsingJavaScript(fullprotection_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(fullprotection_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnTartarcontrol() throws Exception {
		   scrollupUsingElement(Tartarcontrol);
		   clickElementUsingJavaScript(Tartarcontrol);
	   }
//	   public void clickOnTartarcontrol_img() throws Exception {
//		   scrollupUsingElement(Tartarcontrol);
//		   boolean elementIsDisplayed=elementIsDisplayed(Tartarcontrol_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnTartarcontrol_BuyNow() throws Exception {
	      	scrollupUsingElement(Tartarcontrol);
	      	clickElementUsingJavaScript(Tartarcontrol_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Tartarcontrol_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnFreshimpact() throws Exception {
		   scrollupUsingElement(Freshimpact);
		   clickElementUsingJavaScript(Freshimpact);
	   }
//	   public void clickOnFreshimpact_img() throws Exception {
//		   scrollupUsingElement(Freshimpact);
//		   boolean elementIsDisplayed=elementIsDisplayed(Freshimpact_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnFreshimpact_BuyNow() throws Exception {
	      	scrollupUsingElement(Freshimpact);
	      	clickElementUsingJavaScript(Freshimpact_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Freshimpact_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronamelgentlewhitening() throws Exception {
		   scrollupUsingElement(Pronamelgentlewhitening);
		   clickElementUsingJavaScript(Pronamelgentlewhitening);
	   }
//	   public void clickOnPronamelgentlewhitening_img() throws Exception {
//		   scrollupUsingElement(Pronamelgentlewhitening);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronamelgentlewhitening_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronamelgentlewhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronamelgentlewhitening);
	      	clickElementUsingJavaScript(Pronamelgentlewhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronamelgentlewhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronamelmultiaction() throws Exception {
		   scrollupUsingElement(Pronamelmultiaction);
		   clickElementUsingJavaScript(Pronamelmultiaction);
	   }
//	   public void clickOnPronamelmultiaction_img() throws Exception {
//		   scrollupUsingElement(Pronamelmultiaction);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronamelmultiaction_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronamelmultiaction_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronamelmultiaction);
	      	clickElementUsingJavaScript(Pronamelmultiaction_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronamelmultiaction_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronamelfreshbreathe() throws Exception {
		   scrollupUsingElement(Pronamelfreshbreathe);
		   clickElementUsingJavaScript(Pronamelfreshbreathe);
	   }
//	   public void clickOnPronamelfreshbreathe_img() throws Exception {
//		   scrollupUsingElement(Pronamelfreshbreathe);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronamelfreshbreathe_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronamelfreshbreathe_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronamelfreshbreathe);
	      	clickElementUsingJavaScript(Pronamelfreshbreathe_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronamelfreshbreathe_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronameldailyprotection() throws Exception {
		   scrollupUsingElement(Pronameldailyprotection);
		   clickElementUsingJavaScript(Pronameldailyprotection);
	   }
//	   public void clickOnPronameldailyprotection_img() throws Exception {
//		   scrollupUsingElement(Pronameldailyprotection);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronameldailyprotection_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronameldailyprotection_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronameldailyprotection);
	      	clickElementUsingJavaScript(Pronameldailyprotection_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronameldailyprotection_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronamelmineralboostrefreshing() throws Exception {
		   scrollupUsingElement(Pronamelmineralboostrefreshing);
		   clickElementUsingJavaScript(Pronamelmineralboostrefreshing);
	   }
//	   public void clickOnPronamelmineralboostrefreshing_img() throws Exception {
//		   scrollupUsingElement(Pronamelmineralboostrefreshing);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronamelmineralboostrefreshing_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronamelmineralboostrefreshing_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronamelmineralboostrefreshing);
	      	clickElementUsingJavaScript(Pronamelmineralboostrefreshing_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronamelmineralboostrefreshing_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOnPronamelmineralboostgentlewhitening() throws Exception {
		   scrollupUsingElement(Pronamelgentlewhitening);
		   clickElementUsingJavaScript(Pronamelgentlewhitening);
	   }
	  
//	   public void clickOnPronamelmineralboostgentlewhitening_img() throws Exception {
//		   scrollupUsingElement(Pronamelgentlewhitening);
//		   boolean elementIsDisplayed=elementIsDisplayed(Pronamelgentlewhitening_img);
//		   Assert.assertTrue(elementIsDisplayed);
//	   }
	   public void  clickOnPronamelmineralboostgentlewhitening_BuyNow() throws Exception {
	      	scrollupUsingElement(Pronamelgentlewhitening);
	      	clickElementUsingJavaScript(Pronamelgentlewhitening_BuyNow);
	      	visibilityOf(BuyNowClose);
	      	boolean elementIsDisplayed=elementIsDisplayed(Pronamelgentlewhitening_txt);
	      	Assert.assertTrue(elementIsDisplayed);
	      	clickElementUsingJavaScript(BuyNowClose);
	      }
	   public void clickOngetcoupon() throws Exception {
		   scrollupUsingElement(Pronamelgentlewhitening);
		  clickElementUsingJavaScript(getcoupon);
	   }
	   public void clickOnfindyourstore() throws Exception {
		   scrollupUsingElement(Pronamelgentlewhitening);
		  clickElementUsingJavaScript(findyourstore);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
