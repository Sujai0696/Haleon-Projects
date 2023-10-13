package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneFAQ_Pages extends BaseClass {
	
	public SensodyneFAQ_Pages() {
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
	
    @FindBy(xpath = "(//a[@href=\"/en-us/frequently-asked-questions/\"])[4]")
    private static WebElement BreadcrumbsFAQ;
	
    @FindBy(xpath = "(//li[text()='All Topics'])[1]")
    private static WebElement AllTopics;
	
    @FindBy(xpath = "//ul[@class=\"topic-selector active\"]")
    private static WebElement AllTopics_Active;
	
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[1]")
    private static WebElement SensitiveTeethActive;
	
    @FindBy(xpath = "(//li[@class=\"accordion-slide first odd\"])[1]")
    private static WebElement SensitiveTeethActive_open;
	
    @FindBy(xpath = "//a[text()='Sensitive teeth, or dentin hypersensitivity']")
    private static WebElement SensitiveTeethhypersensitivity;
	
    @FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/causes-of-tooth-sensitivity/\"])[4]")
    private static WebElement dentin;
	
    @FindBy(xpath = "//a[text()='Sensodyne toothpaste']")
    private static WebElement sensodynetoothpaste;
	
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[2]")
    private static WebElement causessensitiveteethhurt;
	
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement causessensitiveteethhurt_open;
	
    @FindBy(xpath = "//a[text()='sharp shock, jolt, or even minor twinge of pain']")
    private static WebElement sharpshockjolt;
    
    @FindBy(xpath = "(//a[text()='here'])[1]")
    private static WebElement causes_here;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[2]")
    private static WebElement sensitiveteethcommom;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement sensitiveteethcommom_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[3]")
    private static WebElement overbrushingcause;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement overbrushingcause_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[5]")
    private static WebElement signofproblem;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement signofproblem_open;
    
    @FindBy(xpath = "//a[text()='many different causes of tooth pain']")
    private static WebElement differentcauses;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[5]")
    private static WebElement helpsensitiveteeth;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement helpsensitiveteeth_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne'])[1]")
    private static WebElement sensodyne;
    
    @FindBy(xpath = "//a[text()='specially formulated for tooth sensitivity relief']")
    private static WebElement speciallyfermentedteeth;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[7]")
    private static WebElement dentistrecommendedtoothpaste;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement dentistrecommendedtoothpaste_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne'])[2]")
    private static WebElement dentistrecommendedSensodyne;
    
    @FindBy(xpath = "(//a[text()='here'])[2]")
    private static WebElement dentistrecommended_here;
    
    
    //How Sensodyne works//
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[8]")
    private static WebElement howdoessensodynetoothpasteworks;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement howdoessensodynetoothpasteworks_open;
    
    @FindBy(xpath = "//a[text()='work in 1 of 2 ways']")
    private static WebElement workin12days;
    
    @FindBy(xpath = "//a[text()='see our full range of products']")
    private static WebElement fullrangeroducts;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[9]")
    private static WebElement Howlongsensodyneworks;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Howlongsensodyneworks_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne Rapid Relief'])[1]")
    private static WebElement sensodynerapidrelief;
    
    @FindBy(xpath = "//a[text()='in as little as 3 days, while other Sensodyne toothpastes may take up to 2 weeks']")
    private static WebElement upto2weeks;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[10]")
    private static WebElement oftenusedsensodyne;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement oftenusedsensodyne_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne'])[3]")
    private static WebElement often_sensodyne;
    
    @FindBy(xpath = "(//a[text()='here'])[3]")
    private static WebElement often_sensodyne_here;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[11]")
    private static WebElement withmyteethsensitiveagain;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement withmyteethsensitiveagain_open;
    
    @FindBy(xpath = "(//a[text()='here'])[4]")
    private static WebElement withmyteethsensitiveagain_here;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[12]")
    private static WebElement preventcavities;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement preventcavities_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[12]")
    private static WebElement Toothpasteeveryday;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Toothpasteeveryday_open;
    
    
    //Sensodyne Ingredients//
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[14]")
    private static WebElement activeingredients;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide first odd is-active\"]")
    private static WebElement activeingredients_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[15]")
    private static WebElement toothpastehavefluroide;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement toothpastehavefluroide_open;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[6]")
    private static WebElement toothpastehavefluroide_here;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[16]")
    private static WebElement stannousfluroide;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide odd is-active\"]")
    private static WebElement stannousfluroide_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne Complete Protection'])[2]")
    private static WebElement sensodynecompleteprotection;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[3]")
    private static WebElement sensodynerepairprotecttoothpaste;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[6]")
    private static WebElement sensodynerapidrelieftoothpaste;
    
    @FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum'])[2]")
    private static WebElement sensodynesensitivitygum;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[17]")
    private static WebElement potassiumnitrate;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement potassiumnitrate_open;
    
    @FindBy(xpath = "//a[text()='Sensodyne Essential']")
    private static WebElement sensodyneessential;
    
    @FindBy(xpath = "(//a[text()='Sensodyne True White'])[1]")
    private static WebElement sensodynetruewhite;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[18]")
    private static WebElement sensodyneSLS;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide odd is-active\"]")
    private static WebElement sensodyneSLS_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[19]")
    private static WebElement triclosan;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement triclosan_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[20]")
    private static WebElement glutenfree;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide odd is-active\"]")
    private static WebElement glutenfree_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[21]")
    private static WebElement toothpastekosher;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement toothpastekosher_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[22]")
    private static WebElement toothpasteexpires;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide last odd is-active\"]")
    private static WebElement toothpasteexpires_open;
    
    
    //Sensodyne products//
    
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[22]")
    private static WebElement Sensodynedifferentvarities;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Sensodynedifferentvarities_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[23]")
    private static WebElement Sensodynerapidrelieftoothpastework;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Sensodynerapidrelieftoothpastework_open;
    
    @FindBy(xpath = "(//a[text()='Sensodyne Rapid Relief'])[6]")
    private static WebElement Sensodynerapidrelieftoothpasteproducts;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[23]")
    private static WebElement Sensodynerapidrelieftoothpasterightforme;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Sensodynerapidrelieftoothpasterightforme_open;
    
    @FindBy(xpath = "(//a[text()='Extra Fresh'])[5]")
    private static WebElement extrafresh;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[25]")
    private static WebElement howoftenrapidrelief;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement howoftenrapidrelief_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[25]")
    private static WebElement abrasivetoothpaste;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement abrasivetoothpaste_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[26]")
    private static WebElement travelsizedtube;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement travelsizedtube_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[28]")
    private static WebElement kidssizedtoothpaste;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement kidssizedtoothpaste_open;
    
    
    //Sensodyne whitening//
    
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[33]")
    private static WebElement toothpastewhiten;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide odd is-active\"]")
    private static WebElement toothpastewhiten_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[34]")
    private static WebElement professitionaltoothwhitening;
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement professitionaltoothwhitening_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[35]")
    private static WebElement whyteethsensitiveafterwhitening;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement whyteethsensitiveafterwhitening_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[35]")
    private static WebElement sensodynetruewhiteworks;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement sensodynetruewhiteworks_open;
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[36]")
    private static WebElement sensodynetruewhiteuse;
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement sensodynetruewhiteuse_open;
    
    @FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[9]")
    private static WebElement sensodynetruewhitetwice;
    
    
  //Enamel Erosion//
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[37]")
    private static WebElement enamelerosion; 
    
    @FindBy(xpath = "//li[@class=\"accordion-slide first odd is-active\"]")
    private static WebElement enamelerosion_open; 
    
    @FindBy(xpath = "//a[text()='quick quiz']")
    private static WebElement enamelerosion_quiz; 
    
    @FindBy(xpath = "(//a[text()='Sensodyne'])[4]")
    private static WebElement enamelerosion_sensodyne; 
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[37]")
    private static WebElement causesenamelwear; 
    
    @FindBy(xpath = "//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement causesenamelwear_open; 
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[40]")
    private static WebElement canenamelcausesensitiveteeth; 
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement canenamelcausesensitiveteeth_open; 
    
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[40]")
    private static WebElement sensodyneorpronamel; 
    
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement sensodyneorpronamel_open; 
    
    @FindBy(xpath = "//a[text()='Find Your Toothpaste']")
    private static WebElement findyourtoothpaste; 
    
    @FindBy(xpath = "//a[text()='Get Your Coupon']")
    private static WebElement getyourcoupon; 
    
    
    
    
    
    
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
    
    public void  clickOnBreadcrumbsFAQ() throws Exception {
    	moveToElement(BreadcrumbsFAQ);
    	clickElementUsingJavaScript(BreadcrumbsFAQ);
    }
	public void clickOnAllTopics() throws Exception {
		moveToElement(AllTopics);
		clickElementUsingJavaScript(AllTopics);
		//visibilityOf(AllTopics_Active);
		boolean elementIsDisplayed=elementIsDisplayed(AllTopics_Active);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(AllTopics_Active);
	}
	public void clickOnteethsensitivity() throws Exception {
		scrollupUsingElement(AllTopics);
		clickElementUsingJavaScript(SensitiveTeethActive);
		//visibilityOf(AllTopics_Active);
		boolean elementIsDisplayed=elementIsDisplayed(SensitiveTeethActive_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(SensitiveTeethActive_open);
	}
	public void  clickOnsensitiveteethhypersensitivity() throws Exception {
		scrollDownUsingElement(AllTopics);
    	moveToElement(SensitiveTeethhypersensitivity);
    	clickElementUsingJavaScript(SensitiveTeethhypersensitivity);
    }
	public void  clickOndentin() throws Exception {
		scrollDownUsingElement(AllTopics);
    	moveToElement(dentin);
    	clickElementUsingJavaScript(dentin);
    }
	public void  clickOnSensodynetoothpaste() throws Exception {
		scrollDownUsingElement(AllTopics);
    	moveToElement(sensodynetoothpaste);
    	clickElementUsingJavaScript(sensodynetoothpaste);
    }
	public void clickOncausessensitiveteethhurt() throws Exception {
		scrollupUsingElement(AllTopics);
		clickElementUsingJavaScript(causessensitiveteethhurt);
		boolean elementIsDisplayed=elementIsDisplayed(causessensitiveteethhurt_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(causessensitiveteethhurt_open);
	}
	public void  clickOnsharpshockjolt() throws Exception {
		scrollDownUsingElement(AllTopics);
    	moveToElement(sharpshockjolt);
    	clickElementUsingJavaScript(sharpshockjolt);
    }
	public void  clickOncauses_here() throws Exception {
		scrollDownUsingElement(AllTopics);
    	moveToElement(causes_here);
    	clickElementUsingJavaScript(causes_here);
    }
	public void clickOnsensitiveteethcommont() throws Exception {
		scrollupUsingElement(sensitiveteethcommom);
		clickElementUsingJavaScript(sensitiveteethcommom);
		boolean elementIsDisplayed=elementIsDisplayed(sensitiveteethcommom_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(sensitiveteethcommom_open);
	}
	public void clickOnoverbrushingcausesensitive() throws Exception {
		scrollupUsingElement(sensitiveteethcommom);
		clickElementUsingJavaScript(overbrushingcause);
		boolean elementIsDisplayed=elementIsDisplayed(overbrushingcause_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(overbrushingcause_open);
	}
	public void clickOnsignofproblem() throws Exception {
		scrollupUsingElement(overbrushingcause);
		clickElementUsingJavaScript(signofproblem);
		boolean elementIsDisplayed=elementIsDisplayed(signofproblem_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(signofproblem_open);
	}
	public void  clickOndifferentcauses() throws Exception {
		scrollDownUsingElement(signofproblem);
    	moveToElement(differentcauses);
    	clickElementUsingJavaScript(differentcauses);
    }
	public void clickOnhelpsensitiveteeth() throws Exception {
		scrollupUsingElement(differentcauses);
		clickElementUsingJavaScript(helpsensitiveteeth);
		boolean elementIsDisplayed=elementIsDisplayed(helpsensitiveteeth_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(helpsensitiveteeth_open);
	}
	public void  clickOnSensodyne() throws Exception {
		scrollDownUsingElement(helpsensitiveteeth);
    	moveToElement(sensodyne);
    	clickElementUsingJavaScript(sensodyne);
    }
	public void  clickOnspeciallyfermentedteeth() throws Exception {
		scrollDownUsingElement(helpsensitiveteeth);
    	moveToElement(speciallyfermentedteeth);
    	clickElementUsingJavaScript(speciallyfermentedteeth);
    }
	public void clickOnDentistrecommendedtoothpaste() throws Exception {
		scrollupUsingElement(helpsensitiveteeth);
		clickElementUsingJavaScript(dentistrecommendedtoothpaste);
		boolean elementIsDisplayed=elementIsDisplayed(dentistrecommendedtoothpaste_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(dentistrecommendedtoothpaste_open);
	}
	public void  clickOnDentistrecommended_Sensodyne() throws Exception {
		scrollDownUsingElement(dentistrecommendedtoothpaste);
    	moveToElement(dentistrecommendedSensodyne);
    	clickElementUsingJavaScript(dentistrecommendedSensodyne);
    }
	public void  clickOnDentistrecommended_here() throws Exception {
		scrollDownUsingElement(dentistrecommendedtoothpaste);
    	moveToElement(dentistrecommended_here);
    	clickElementUsingJavaScript(dentistrecommended_here);
    }
	public void clickOnHowsensodynetoothpasteworks() throws Exception {
		scrollupUsingElement(dentistrecommendedSensodyne);
		clickElementUsingJavaScript(howdoessensodynetoothpasteworks);
		boolean elementIsDisplayed=elementIsDisplayed(howdoessensodynetoothpasteworks_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(howdoessensodynetoothpasteworks_open);
	}
	public void  clickOnwork12days() throws Exception {
		scrollDownUsingElement(howdoessensodynetoothpasteworks);
    	moveToElement(workin12days);
    	clickElementUsingJavaScript(workin12days);
    }
	public void  clickOnfullrangeproducts() throws Exception {
		scrollDownUsingElement(howdoessensodynetoothpasteworks);
    	moveToElement(fullrangeroducts);
    	clickElementUsingJavaScript(fullrangeroducts);
    }
	public void clickOnHowlongsensodyneworks() throws Exception {
		//scrollupUsingElement(howdoessensodynetoothpasteworks);
		clickElementUsingJavaScript(Howlongsensodyneworks);
		boolean elementIsDisplayed=elementIsDisplayed(Howlongsensodyneworks_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Howlongsensodyneworks_open);
	}
	public void  clickOnSensodynerapidrelief() throws Exception {
		//scrollDownUsingElement(Howlongsensodyneworks);
    	moveToElement(sensodynerapidrelief);
    	clickElementUsingJavaScript(sensodynerapidrelief);
    }
	public void  clickOnupto2weeks() throws Exception {
		//scrollDownUsingElement(Howlongsensodyneworks);
    	moveToElement(upto2weeks);
    	clickElementUsingJavaScript(upto2weeks);
    }
	public void clickOnoftenusedsensodyne() throws Exception {
		scrollupUsingElement(howdoessensodynetoothpasteworks);
		clickElementUsingJavaScript(oftenusedsensodyne);
		boolean elementIsDisplayed=elementIsDisplayed(oftenusedsensodyne_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(oftenusedsensodyne_open);
	}
	public void  clickOnuptooftensensodyne_here() throws Exception {
		//scrollDownUsingElement(Howlongsensodyneworks);
    	moveToElement(often_sensodyne_here);
    	clickElementUsingJavaScript(often_sensodyne_here);
    }
	public void clickOnwithmysensitiveteeth() throws Exception {
		//scrollupUsingElement(howdoessensodynetoothpasteworks);
		clickElementUsingJavaScript(withmyteethsensitiveagain);
		boolean elementIsDisplayed=elementIsDisplayed(withmyteethsensitiveagain_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(withmyteethsensitiveagain_open);
	}
	public void  clickOnwithmysensitiveteeth_here() throws Exception {
		//scrollDownUsingElement(withmyteethsensitiveagain);
    	moveToElement(withmyteethsensitiveagain_here);
    	clickElementUsingJavaScript(withmyteethsensitiveagain_here);
    }
	public void clickOnpreventcavities() throws Exception {
		//scrollupUsingElement(withmyteethsensitiveagain);
		clickElementUsingJavaScript(preventcavities);
		boolean elementIsDisplayed=elementIsDisplayed(preventcavities_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(preventcavities_open);
	}
	public void clickOnToothpasteeveryday() throws Exception {
		//scrollupUsingElement(preventcavities);
		clickElementUsingJavaScript(Toothpasteeveryday);
		boolean elementIsDisplayed=elementIsDisplayed(Toothpasteeveryday_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Toothpasteeveryday_open);
	}
	public void clickOnactiveingredients() throws Exception {
		//scrollupUsingElement(Toothpasteeveryday);
		clickElementUsingJavaScript(activeingredients);
		//boolean elementIsDisplayed=elementIsDisplayed(activeingredients_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(activeingredients_open);
	}
	public void clickOnsensodynetoothpastefluroide() throws Exception {
		//scrollupUsingElement(activeingredients);
		clickElementUsingJavaScript(toothpastehavefluroide);
		//boolean elementIsDisplayed=elementIsDisplayed(toothpastehavefluroide_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(toothpastehavefluroide_open);
	}
	public void  clickOnsensodynetoothpastefluroide_here() throws Exception {
		//scrollDownUsingElement(activeingredients);
    	moveToElement(toothpastehavefluroide_here);
    	clickElementUsingJavaScript(toothpastehavefluroide_here);
    }
	public void clickOnStannousfluroide() throws Exception {
		//scrollupUsingElement(toothpastehavefluroide);
		clickElementUsingJavaScript(stannousfluroide);
		//boolean elementIsDisplayed=elementIsDisplayed(stannousfluroide_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(stannousfluroide);
	}
	public void  clickOnsensodynerepairprotect() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodynerepairprotecttoothpaste);
    	clickElementUsingJavaScript(sensodynerepairprotecttoothpaste);
    }
	public void  clickOnsensodynecompleteprotection() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodynecompleteprotection);
    	clickElementUsingJavaScript(sensodynecompleteprotection);
    }
	public void  clickOnsensodynerapidrelieftoothpaste() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodynerapidrelieftoothpaste);
    	clickElementUsingJavaScript(sensodynerapidrelieftoothpaste);
    }
	public void  clickOnsensodynesensitivitygum() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodynesensitivitygum);
    	clickElementUsingJavaScript(sensodynesensitivitygum);
    }
	public void clickOnPotassiumNitrate() throws Exception {
		//scrollupUsingElement(stannousfluroide);
		clickElementUsingJavaScript(potassiumnitrate);
		//boolean elementIsDisplayed=elementIsDisplayed(potassiumnitrate_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(potassiumnitrate_open);
	}
	public void  clickOnsensodyneessential() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodyneessential);
    	clickElementUsingJavaScript(sensodyneessential);
    }
	public void  clickOnsensodynetruewhite() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(sensodynetruewhite);
    	clickElementUsingJavaScript(sensodynetruewhite);
    }
	public void clickOnSensodyneSLS() throws Exception {
		//scrollupUsingElement(stannousfluroide);
		clickElementUsingJavaScript(sensodyneSLS);
		//boolean elementIsDisplayed=elementIsDisplayed(sensodyneSLS_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(sensodyneSLS_open);
	}
	public void clickOntriclosan() throws Exception {
		//scrollupUsingElement(sensodyneSLS);
		clickElementUsingJavaScript(triclosan);
		//boolean elementIsDisplayed=elementIsDisplayed(triclosan_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(triclosan_open);
	}
	public void clickOnglutenfree() throws Exception {
		//scrollupUsingElement(triclosan);
		clickElementUsingJavaScript(glutenfree);
		//boolean elementIsDisplayed=elementIsDisplayed(glutenfree_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(glutenfree_open);
	}
	public void clickOntoothpastekosher() throws Exception {
		//scrollupUsingElement(triclosan);
		clickElementUsingJavaScript(toothpastekosher);
		//boolean elementIsDisplayed=elementIsDisplayed(toothpastekosher_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(toothpastekosher_open);
	}
	public void clickOntoothpasteexpires() throws Exception {
		//scrollupUsingElement(triclosan);
		clickElementUsingJavaScript(toothpasteexpires);
		//boolean elementIsDisplayed=elementIsDisplayed(toothpasteexpires_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(toothpasteexpires_open);
	}
	public void clickOnsensodynedifferentvarities() throws Exception {
		//scrollupUsingElement(toothpasteexpires);
		clickElementUsingJavaScript(Sensodynedifferentvarities);
		boolean elementIsDisplayed=elementIsDisplayed(Sensodynedifferentvarities_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Sensodynedifferentvarities_open);
	}
	public void clickOnsensodynerapidrelieftoothpastework() throws Exception {
		//scrollupUsingElement(Sensodynedifferentvarities);
		clickElementUsingJavaScript(Sensodynerapidrelieftoothpastework);
		boolean elementIsDisplayed=elementIsDisplayed(Sensodynerapidrelieftoothpastework_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Sensodynerapidrelieftoothpastework_open);
	}
	public void  clickOnsensodynerapidrelieftoothpasteproducts() throws Exception {
		//scrollDownUsingElement(Sensodynerapidrelieftoothpastework);
    	moveToElement(Sensodynerapidrelieftoothpasteproducts);
    	clickElementUsingJavaScript(Sensodynerapidrelieftoothpasteproducts);
    }
	public void clickOnsensodynerapidrelieftoothpasterightforme() throws Exception {
		//scrollupUsingElement(Sensodynedifferentvarities);
		clickElementUsingJavaScript(Sensodynerapidrelieftoothpasterightforme);
		boolean elementIsDisplayed=elementIsDisplayed(Sensodynerapidrelieftoothpasterightforme_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Sensodynerapidrelieftoothpasterightforme_open);
	}
	public void  clickOnextrafresh() throws Exception {
		//scrollDownUsingElement(stannousfluroide);
    	moveToElement(extrafresh);
    	clickElementUsingJavaScript(extrafresh);
    }
	public void clickOnsensodynerapidrelieftoothpasteoftenoccurs() throws Exception {
		//scrollupUsingElement(howoftenrapidrelief);
		clickElementUsingJavaScript(howoftenrapidrelief);
		boolean elementIsDisplayed=elementIsDisplayed(howoftenrapidrelief_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(howoftenrapidrelief_open);
	}
	public void clickOnabrasivetooyhpaste() throws Exception {
		//scrollupUsingElement(howoftenrapidrelief);
		clickElementUsingJavaScript(abrasivetoothpaste);
		boolean elementIsDisplayed=elementIsDisplayed(abrasivetoothpaste_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(abrasivetoothpaste_open);
	}
	public void clickOntravelsizedtube() throws Exception {
		//scrollupUsingElement(abrasivetoothpaste);
		clickElementUsingJavaScript(travelsizedtube);
		boolean elementIsDisplayed=elementIsDisplayed(travelsizedtube_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(travelsizedtube_open);
	}
	public void clickOnkidssizedtoothpaste() throws Exception {
		//scrollupUsingElement(abrasivetoothpaste);
		clickElementUsingJavaScript(kidssizedtoothpaste);
		boolean elementIsDisplayed=elementIsDisplayed(kidssizedtoothpaste_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(kidssizedtoothpaste_open);
	}
	public void clickOntoothpastewhiten() throws Exception {
		clickElementUsingJavaScript(toothpastewhiten);
		//boolean elementIsDisplayed=elementIsDisplayed(toothpastewhiten_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(toothpastewhiten_open);
	}
	public void clickOnprofessionalwhitetreatment() throws Exception {
		clickElementUsingJavaScript(professitionaltoothwhitening);
		//boolean elementIsDisplayed=elementIsDisplayed(professitionaltoothwhitening_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(professitionaltoothwhitening_open);
	}
	public void clickOnwhyteethsensitiveafterwhitening() throws Exception {
		clickElementUsingJavaScript(whyteethsensitiveafterwhitening);
		boolean elementIsDisplayed=elementIsDisplayed(whyteethsensitiveafterwhitening_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(whyteethsensitiveafterwhitening_open);
	}
	public void clickOnsensodynetruewhiteworks() throws Exception {
		clickElementUsingJavaScript(sensodynetruewhiteworks);
		boolean elementIsDisplayed=elementIsDisplayed(sensodynetruewhiteworks_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(sensodynetruewhiteworks_open);
	}
	public void clickOnsensodynetruewhitetoothpasteuse() throws Exception {
		clickElementUsingJavaScript(sensodynetruewhiteuse);
		boolean elementIsDisplayed=elementIsDisplayed(sensodynetruewhiteuse_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(sensodynetruewhiteuse_open);
	}
	public void  clickOnsensodynetruewhitetwice() throws Exception {
		scrollDownUsingElement(sensodynetruewhiteuse);
    	moveToElement(sensodynetruewhitetwice);
    	clickElementUsingJavaScript(sensodynetruewhitetwice);
    }
	public void clickOnenamelerosion() throws Exception {
		clickElementUsingJavaScript(enamelerosion);
		//boolean elementIsDisplayed=elementIsDisplayed(enamelerosion_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(enamelerosion_open);
	}
	public void  clickOnenamelerosionquiz() throws Exception {
		scrollDownUsingElement(enamelerosion);
    	moveToElement(enamelerosion_quiz);
    	clickElementUsingJavaScript(enamelerosion_quiz);
    }
	public void  clickOnenamelerosion_sensodyne() throws Exception {
		scrollDownUsingElement(enamelerosion);
    	moveToElement(enamelerosion_sensodyne);
    	clickElementUsingJavaScript(enamelerosion_sensodyne);
    }
	public void  clickOncausesenamelwear() throws Exception {
    //	moveToElement(causesenamelwear);
    	clickElementUsingJavaScript(causesenamelwear);
    	//boolean elementIsDisplayed=elementIsDisplayed(causesenamelwear_open);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(causesenamelwear_open);
    }
	public void  clickOncanenamelcausesensitiveteeth() throws Exception {
    	//moveToElement(canenamelcausesensitiveteeth);
    	clickElementUsingJavaScript(canenamelcausesensitiveteeth);
    	boolean elementIsDisplayed=elementIsDisplayed(canenamelcausesensitiveteeth_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(canenamelcausesensitiveteeth_open);
    }
	public void  clickOnsensodyneorpronamel() throws Exception {
    	//moveToElement(sensodyneorpronamel);
    	clickElementUsingJavaScript(sensodyneorpronamel);
    	boolean elementIsDisplayed=elementIsDisplayed(sensodyneorpronamel_open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(sensodyneorpronamel_open);
    }
	public void  clickOnfindyourtoothpaste() throws Exception {
    	//moveToElement(findyourtoothpaste);
    	clickElementUsingJavaScript(findyourtoothpaste);
	}
	public void  clickOngetyourcoupon() throws Exception {
    	//moveToElement(getyourcoupon);
    	clickElementUsingJavaScript(getyourcoupon);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
