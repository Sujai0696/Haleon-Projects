package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSitemap_Pages extends BaseClass{
	
	public SensodyneSitemap_Pages() {
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
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SitemapBreadcrumbs;
	
	@FindBy(xpath = "//a[text()='Understanding Sensitivity']")
	private static WebElement understandingsensitivity;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/symptoms-of-sensitive-teeth/\"])[3]")
	private static WebElement commonsymptonssensitiveteeth;
	
	@FindBy(xpath = "(//a[text()='Causes of Sensitive Teeth'])[2]")
	private static WebElement causesofsensitiveteeth;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement treatingsensitiveteeth;
	
	@FindBy(xpath = "//a[text()='Bleeding Gums and Sensitivity']")
	private static WebElement bleedinggumsensitivity;
	
	@FindBy(xpath = "//a[text()='Teeth Sensitive to Sugar']")
	private static WebElement teethsensitivesugar;
	
	@FindBy(xpath = "//a[text()='Does Mouthwash for Sensitive Teeth Work?']")
	private static WebElement mouthwashsensitiveteeth;
	
	@FindBy(xpath = "//a[text()='Why Do My Teeth Hurt When I Bite Down?']")
	private static WebElement teethhurtdownnbite;
	
	@FindBy(xpath = "//a[text()='About Sensodyne']")
	private static WebElement aboutsensodyne;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[3]")
	private static WebElement sensodyneingredients;
	
	@FindBy(xpath = "//a[text()='Our Products']")
	private static WebElement ourproducts;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Mint']")
	private static WebElement sensodynerapidrelief;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Extra Fresh']")
	private static WebElement sensodynerapidrelieffresh;
	
	@FindBy(xpath = "//a[text()='Repair and Protect Whitening Toothpaste | Sensodyne ']")
	private static WebElement repairprotectwhitening;
	
	@FindBy(xpath = "//a[text()='Sensodyne Repair and Protect Extra Fresh']")
	private static WebElement sensodynerepairprotect;
	
	@FindBy(xpath = "//a[text()='Sensodyne Repair & Protect Toothpaste | Sensodyne ']")
	private static WebElement sensodynerepairprotect_Sensodyne;
	
	@FindBy(xpath = "//a[text()='Sensodyne Complete Protection Extra Fresh']")
	private static WebElement sensodynecompleteprotectionfresh;
	
	@FindBy(xpath = "//a[text()='Sensodyne Complete Protection']")
	private static WebElement sensodynecompleteprotection;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Extra Fresh']")
	private static WebElement sensodynetruewhitefresh;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Mint']")
	private static WebElement sensodynetruewhiteMint;
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening']")
	private static WebElement sensodyneextrawhitening;
	
	@FindBy(xpath = "//a[text()='Sensodyne Deep Clean']")
	private static WebElement sensodynedeepclean;
	
	@FindBy(xpath = "//a[text()='Fresh Mint Fluoride Toothpaste | Sensodyne ']")
	private static WebElement freshmintfluoride;
	
	@FindBy(xpath = "//a[text()='Sensodyne Full Protection']")
	private static WebElement Sensodynefullprotection;
	
	@FindBy(xpath = "//a[text()='Sensodyne Tartar Control']")
	private static WebElement Sensodynetatarcontrol;
	
	@FindBy(xpath = "//a[text()='Sensodyne Fresh Impact']")
	private static WebElement SensodynefreshImpact;
	
	@FindBy(xpath = "//a[text()='Product Results']")
	private static WebElement productresult;
	
	@FindBy(xpath = "(//a[text()='Teeth Whitening'])[2]")
	private static WebElement teethwhitening;
	
	@FindBy(xpath = "(//a[text()='Fast Sensitive Teeth Relief'])[2]")
	private static WebElement fastsensitiveteeth;
	
	@FindBy(xpath = "(//a[text()='Extra Fresh Breath'])[2]")
	private static WebElement extrafreshbreath;
	
	@FindBy(xpath = "//a[text()='Toothpastes That Remove Plaque | Sensodyne ']")
	private static WebElement toothpasteremoveplague;
	
	@FindBy(xpath = "(//a[text()='Sensitive Teeth Repair'])[2]")
	private static WebElement sensitiveteethrepair;
	
	@FindBy(xpath = "(//a[text()='Multi-Benefit'])[2]")
	private static WebElement multibenefit;
	
	@FindBy(xpath = "(//a[text()='Sodium Lauryl Sulfate Free'])[2]")
	private static WebElement sodiumlaurylsulphate;
	
	@FindBy(xpath = "(//a[text()='Enamel Strengthening'])[2]")
	private static WebElement EnamelStrengthening;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/\"])[2]")
	private static WebElement rapidreliefwhiteningtoothpaste;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity and Gum Mint']")
	private static WebElement Sensodynesensitivitygummint;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity and Gum Whitening']")
	private static WebElement SensodynesensitivitygumWhitening;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity and Gum Clean & Fresh']")
	private static WebElement SensodynesensitivityCleanFresh;
	
	@FindBy(xpath = "//a[text()='Sensodyne Nourish Sensitivity Toothpaste Gently Soothing']")
	private static WebElement Sensodynenourishsensitivitytoothpaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-nourish-gently-soothing/write-a-review/\"])[2]")
	private static WebElement Sensodynenourishsensitivitytoothpaste_Review;
	
	@FindBy(xpath = "//a[text()='Sensodyne Nourish Sensitivity Toothpaste Healthy White']")
	private static WebElement SensodynenourishToothpaste_Healthywhite;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-nourish-sensitivity-toothpaste-healthy-white/write-a-review/\"])[2]")
	private static WebElement SensodynenourishToothpaste_Healthywhite_Review;
	
	@FindBy(xpath = "//a[text()='Sensodyne Natural White Toothpaste']")
	private static WebElement SensodyneNaturalwhiteToothpaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-natural-white-toothpaste/write-a-review/\"])[2]")
	private static WebElement SensodyneNaturalwhiteToothpaste_Review;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Nourish'])[2]")
	private static WebElement SensodyneNourish;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyn-nourish-sensitivity-toothpaste-healthy-white/\"])[2]")
	private static WebElement SensodyneNourishsensitivitytoothpasteHealthywhite;
	
//	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity Gum & Enamel']")
//	private static WebElement Sensodynesensitivitygum_Enamel;
	
	@FindBy(xpath = "(//a[text()='Oral Health Tips'])[1]")
	private static WebElement oralhealthtips;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/oral-health-tips/science-of-sensodyne/\"])[3]")
	private static WebElement sensodyneInnovation;
	
	@FindBy(xpath = "(//a[text()='The Science Behind Sensodyne Rapid Relief Toothpaste'])[1]")
	private static WebElement sciencebehindrapidrelief;
	
	@FindBy(xpath = "(//a[text()='Engineered for Speed'])[1]")
	private static WebElement engineeredspeed;
	
	@FindBy(xpath = "(//a[text()='The Speed of Sensation'])[1]")
	private static WebElement speedsensation;
	
	@FindBy(xpath = "(//a[text()='Becoming Fast: Training for Speed'])[1]")
	private static WebElement becomingfastspeed;
	
	@FindBy(xpath = "(//a[text()='Ski Gear: Science, Style, and Speed'])[1]")
	private static WebElement skigear_style;
	
	@FindBy(xpath = "(//a[text()='Whitening Sensitive Teeth'])[1]")
	private static WebElement whiteningsensitiveteeth_1;
	
	@FindBy(xpath = "(//a[text()='What You Should Know About Whitening Your Teeth'])[1]")
	private static WebElement whattoknow_aboutwhitening;
	
	@FindBy(xpath = "(//a[text()='Tips for Whitening Sensitive Teeth'])[1]")
	private static WebElement tipsforwhiteningteeth;
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White Ingredients and How They Work'])[1]")
	private static WebElement sensodynetruewhiteingredients;
	
	@FindBy(xpath = "(//a[text()='Whitening Products and Their Impact on Sensitive Teeth'])[1]")
	private static WebElement whiteningproductsImpact;
	
	@FindBy(xpath = "(//a[text()='How to Help Sensitive Teeth After Whitening'])[1]")
	private static WebElement howtohelpsensitiveteethafterwhitening;
	
	@FindBy(xpath = "(//a[text()='Sensitive Teeth Pain Relief'])[1]")
	private static WebElement sensitiveteethpainrelief;
	
	@FindBy(xpath = "(//a[text()='Recognizing Sensitive Teeth'])[1]")
	private static WebElement recognizingsensitiveteeth;
	
	@FindBy(xpath = "(//a[text()='That Shock of Pain Could Be Tooth Sensitivity'])[1]")
	private static WebElement shockpaintoothsensitivity;
	
	@FindBy(xpath = "(//a[text()='Myth vs Truth: Do Brushing & Flossing Cause Sensitive Teeth?'])[1]")
	private static WebElement mythvstruth;
	
	@FindBy(xpath = "(//a[text()='Is It a Cavity or Sensitive Teeth?'])[1]")
	private static WebElement cavityorsensitiveteeth;
	
	@FindBy(xpath = "(//a[text()='Sensitivity After a Trip to the Dentist'])[1]")
	private static WebElement sensitiveareaaftertrip;
	
	@FindBy(xpath = "(//a[text()='Sensodyne or Pronamel: Which Toothpaste Is for You?'])[1]")
	private static WebElement sensodyneorpronamel;
	
	@FindBy(xpath = "(//a[text()='Managing Sensitive Teeth'])[1]")
	private static WebElement managingsensitiveteeth;
	
	@FindBy(xpath = "(//a[text()='Tips for Tooth Sensitivity to Hot'])[1]")
	private static WebElement tipsfortoothsensitivityhot;
	
	@FindBy(xpath = "(//a[text()='How to Deal with Tooth Sensitivity to Cold'])[1]")
	private static WebElement howtodealwithtoothsensitivitycold;
	
	@FindBy(xpath = "(//a[text()='Crown Tooth Pain'])[1]")
	private static WebElement crowntoothpain;
	
	@FindBy(xpath = "(//a[text()='Understanding Tooth Sensitivity After a Root Canal'])[1]")
	private static WebElement understandingtoothsensitivityrootcanal;
	
	@FindBy(xpath = "(//a[text()='Sensitive Teeth and Gum Health'])[1]")
	private static WebElement sensitiveteethgumhealth;
	
	@FindBy(xpath = "(//a[text()='The Importance of Gum Health'])[1]")
	private static WebElement Importancegumhealth;
	
	@FindBy(xpath = "(//a[text()='How to Treat Gingivitis'])[1]")
	private static WebElement TreatGingivitis;
	
	@FindBy(xpath = "(//a[text()='Two Benefits. One Toothpaste.'])[1]")
	private static WebElement twobenefitsonetoothpaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/oral-health-tips/gum-health/what-is-a-filling/\"])[2]")
	private static WebElement whatisfilling;
	
	@FindBy(xpath = "(//a[text()='Tips for Healthy Teeth and Gums'])[1]")
	private static WebElement tipsforhealthyteethgums;
	
	@FindBy(xpath = "(//a[text()='Tooth Pain Causes '])[1]")
	private static WebElement toothpaincauses;
	
	@FindBy(xpath = "(//a[text()='Should You Floss Before or After Brushing?'])[1]")
	private static WebElement flossbeforeorafter;
	
	@FindBy(xpath = "(//a[text()='What is SLS in Toothpaste'])[1]")
	private static WebElement SlStoothpaste;
	
//	@FindBy(xpath = "(//a[text()='How to Remove Tartar from Teeth'])[1]")
//	private static WebElement removetarterteeth;
	
	@FindBy(xpath = "(//a[text()='Explore Our Frequently Asked Questions Page | Sensodyne '])")
	private static WebElement FAQ;
	
	@FindBy(xpath = "(//a[text()='Contact Our Customer Support Team | Sensodyne '])")
	private static WebElement contactcustomersupportteam;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/accessibility/\"])[3]")
	private static WebElement accessibility;
	
	@FindBy(xpath = "//a[text()='Site Map For Sensodyne Webpage | Sensodyne ']")
	private static WebElement sitemapsensodynewebpage;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/where-to-buy/\"])[4]")
	private static WebElement wheretobuy;
	
	@FindBy(xpath = "(//a[text()='Coupons'])[1]")
	private static WebElement coupons;
	
//	@FindBy(xpath = "(//a[text()='Thankyou'])[1]")
//	private static WebElement thankyou;
	
	@FindBy(xpath = "(//a[text()='COVID-19'])[1]")
	private static WebElement covid19;
	
	@FindBy(xpath = "(//a[text()='unsubscribe'])[1]")
	private static WebElement unsubscribe;
	
	
	
	
	
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
	    public void clickOnSitemapBreadCrumbs() throws Exception {
	    	moveToElement(SitemapBreadcrumbs);
			clickElementUsingJavaScript(SitemapBreadcrumbs);
		}
	    public void clickOnUnderstandingsensitivity() throws Exception {
	    	moveToElement(understandingsensitivity);
			clickElementUsingJavaScript(understandingsensitivity);
		}
	    public void clickOncommonsymptonssensitiveteeth() throws Exception {
	    	//moveToElement(commonsymptonssensitiveteeth);
			clickElementUsingJavaScript(commonsymptonssensitiveteeth);
		}
	    public void clickOncausesofsensitiveteeth() throws Exception {
	    	moveToElement(causesofsensitiveteeth);
			clickElementUsingJavaScript(causesofsensitiveteeth);
		}
	    public void clickOnTreatingsensitiveteeth() throws Exception {
	    	moveToElement(treatingsensitiveteeth);
			clickElementUsingJavaScript(treatingsensitiveteeth);
		}
	    public void clickOnBleedinggumsensitivity() throws Exception {
	    	moveToElement(bleedinggumsensitivity);
			clickElementUsingJavaScript(bleedinggumsensitivity);
		}
	    public void clickOnTeethsensitivesugar() throws Exception {
	    	moveToElement(teethsensitivesugar);
			clickElementUsingJavaScript(teethsensitivesugar);
		}
	    public void clickOnmouthwashsensitiveteeth() throws Exception {
	    	moveToElement(mouthwashsensitiveteeth);
			clickElementUsingJavaScript(mouthwashsensitiveteeth);
		}
	    public void clickOnteethhurtwhenbite() throws Exception {
	    	moveToElement(teethhurtdownnbite);
			clickElementUsingJavaScript(teethhurtdownnbite);
		}
	    public void clickOnaboutsensodyne() throws Exception {
	    	moveToElement(aboutsensodyne);
			clickElementUsingJavaScript(aboutsensodyne);
		}
	    public void clickOnsensodyneingredients() throws Exception {
	    	//moveToElement(sensodyneingredients);
			clickElementUsingJavaScript(sensodyneingredients);
		}
	    public void clickOnourproducts() throws Exception {
	    	moveToElement(ourproducts);
			clickElementUsingJavaScript(ourproducts);
		}
	    public void clickOnsensodynerapidrelief() throws Exception {
	    	moveToElement(sensodynerapidrelief);
			clickElementUsingJavaScript(sensodynerapidrelief);
		}
	    public void clickOnsensodynerapidreliefFresh() throws Exception {
	    	moveToElement(sensodynerapidrelieffresh);
			clickElementUsingJavaScript(sensodynerapidrelieffresh);
		}
	    public void clickOnrepairprotectwhitening() throws Exception {
	    	moveToElement(repairprotectwhitening);
			clickElementUsingJavaScript(repairprotectwhitening);
		}
	    public void clickOnSensodynerepairprotect() throws Exception {
	    	moveToElement(sensodynerepairprotect);
			clickElementUsingJavaScript(sensodynerepairprotect);
		}
	    public void clickOnSensodynerepairprotect_Sensodyne() throws Exception {
	    	moveToElement(sensodynerepairprotect_Sensodyne);
			clickElementUsingJavaScript(sensodynerepairprotect_Sensodyne);
		}
	    public void clickOnSensodynecompleteprotectionfresh() throws Exception {
	    	moveToElement(sensodynecompleteprotectionfresh);
			clickElementUsingJavaScript(sensodynecompleteprotectionfresh);
		}
	    public void clickOnSensodynecompleteprotection() throws Exception {
	    	moveToElement(sensodynecompleteprotection);
			clickElementUsingJavaScript(sensodynecompleteprotection);
		}
	    public void clickOnSensodynetruewhitefresh() throws Exception {
	    	moveToElement(sensodynetruewhitefresh);
			clickElementUsingJavaScript(sensodynetruewhitefresh);
		}
	    public void clickOnSensodynetruewhiteMint() throws Exception {
	    	moveToElement(sensodynetruewhiteMint);
			clickElementUsingJavaScript(sensodynetruewhiteMint);
		}
	    public void clickOnSensodyneextrawhitening() throws Exception {
	    	moveToElement(sensodyneextrawhitening);
			clickElementUsingJavaScript(sensodyneextrawhitening);
		}
	    public void clickOnSensodynedeepclean() throws Exception {
	    	moveToElement(sensodynedeepclean);
			clickElementUsingJavaScript(sensodynedeepclean);
		}
	    public void clickOnfreshmintfluoride() throws Exception {
	    	moveToElement(freshmintfluoride);
			clickElementUsingJavaScript(freshmintfluoride);
		}
	    public void clickOnsensodynefullprotection() throws Exception {
	    	moveToElement(Sensodynefullprotection);
			clickElementUsingJavaScript(Sensodynefullprotection);
		}
	    public void clickOnsensodynetartarcontrol() throws Exception {
	    	moveToElement(Sensodynetatarcontrol);
			clickElementUsingJavaScript(Sensodynetatarcontrol);
		}
	    public void clickOnsensodynefreshImpact() throws Exception {
	    	moveToElement(SensodynefreshImpact);
			clickElementUsingJavaScript(SensodynefreshImpact);
		}
	    public void clickOnproductresult() throws Exception {
	    	moveToElement(productresult);
			clickElementUsingJavaScript(productresult);
		}
	    public void clickOnteethwhitening() throws Exception {
	    	moveToElement(teethwhitening);
			clickElementUsingJavaScript(teethwhitening);
		}
	    public void clickOnfastsensitiveteeth() throws Exception {
	    	moveToElement(fastsensitiveteeth);
			clickElementUsingJavaScript(fastsensitiveteeth);
		}
	    public void clickOnextrafreshbreath() throws Exception {
	    	moveToElement(extrafreshbreath);
			clickElementUsingJavaScript(extrafreshbreath);
		}
	    public void clickOntoothpasteremoveplague() throws Exception {
	    	moveToElement(toothpasteremoveplague);
			clickElementUsingJavaScript(toothpasteremoveplague);
		}
	    public void clickOnsensitiveteethrepair() throws Exception {
	    	moveToElement(sensitiveteethrepair);
			clickElementUsingJavaScript(sensitiveteethrepair);
		}
	    public void clickOnmultibenefit() throws Exception {
	    	moveToElement(multibenefit);
			clickElementUsingJavaScript(multibenefit);
		}
	    public void clickOnsodiumlaurylsilphatefree() throws Exception {
	    	moveToElement(sodiumlaurylsulphate);
			clickElementUsingJavaScript(sodiumlaurylsulphate);
		}
	    public void clickOnEnamelstraightening() throws Exception {
	    	moveToElement(EnamelStrengthening);
			clickElementUsingJavaScript(EnamelStrengthening);
		}
	    public void clickOnrapidreliefwhitening_toothpaste() throws Exception {
	    	//moveToElement(rapidreliefwhiteningtoothpaste);
			clickElementUsingJavaScript(rapidreliefwhiteningtoothpaste);
		}
	    public void clickOnSensodynesensitivitygumMint() throws Exception {
	    	moveToElement(Sensodynesensitivitygummint);
			clickElementUsingJavaScript(Sensodynesensitivitygummint);
		}
	    public void clickOnSensodynesensitivitygumWhitening() throws Exception {
	    	moveToElement(SensodynesensitivitygumWhitening);
			clickElementUsingJavaScript(SensodynesensitivitygumWhitening);
		}
	    public void clickOnSensodynesensitivityCleanFresh() throws Exception {
	    	moveToElement(SensodynesensitivityCleanFresh);
			clickElementUsingJavaScript(SensodynesensitivityCleanFresh);
		}
	    public void clickOnSensodyneNourishsensitivitytoothpaste() throws Exception {
	    	moveToElement(Sensodynenourishsensitivitytoothpaste);
			clickElementUsingJavaScript(Sensodynenourishsensitivitytoothpaste);
		}
	    public void clickOnSensodyneNourishsensitivitytoothpaste_Review() throws Exception {
	    	moveToElement(Sensodynenourishsensitivitytoothpaste_Review);
			clickElementUsingJavaScript(Sensodynenourishsensitivitytoothpaste_Review);
		}
	    public void clickOnSensodyneNourishToothpasteHealthywhite() throws Exception {
	    	moveToElement(SensodynenourishToothpaste_Healthywhite);
			clickElementUsingJavaScript(SensodynenourishToothpaste_Healthywhite);
		}
	    public void clickOnSensodyneNourishToothpasteHealthywhite_Review() throws Exception {
	    	moveToElement(SensodynenourishToothpaste_Healthywhite_Review);
			clickElementUsingJavaScript(SensodynenourishToothpaste_Healthywhite_Review);
		}
	    public void clickOnSensodyneNaturalwhiteToothpaste() throws Exception {
	    	moveToElement(SensodyneNaturalwhiteToothpaste);
			clickElementUsingJavaScript(SensodyneNaturalwhiteToothpaste);
		}
	    public void clickOnSensodyneNaturalwhiteToothpaste_Review() throws Exception {
	    	moveToElement(SensodyneNaturalwhiteToothpaste_Review);
			clickElementUsingJavaScript(SensodyneNaturalwhiteToothpaste_Review);
		}
	    public void clickOnSensodyneNourish() throws Exception {
	    	moveToElement(SensodyneNourish);
			clickElementUsingJavaScript(SensodyneNourish);
		}
	    public void clickOnSensodyneNourishsensitivitytoothpastesHealthywhite() throws Exception {
	    	moveToElement(SensodyneNourishsensitivitytoothpasteHealthywhite);
			clickElementUsingJavaScript(SensodyneNourishsensitivitytoothpasteHealthywhite);
		}
//	    public void clickOnSensodynesensitivitygum_Enamel() throws Exception {
//	    	//moveToElement(Sensodynesensitivitygum_Enamel);
//			clickElementUsingJavaScript(Sensodynesensitivitygum_Enamel);
//		}
	    public void clickOnOralhealthTips() throws Exception {
	    	moveToElement(oralhealthtips);
			clickElementUsingJavaScript(oralhealthtips);
		}
	    public void clickOnSensodyneInnovation() throws Exception {
	    	//moveToElement(sensodyneInnovation);
			clickElementUsingJavaScript(sensodyneInnovation);
		}
	    public void clickOnSciencebehindrapidrelief() throws Exception {
	    	moveToElement(sciencebehindrapidrelief);
			clickElementUsingJavaScript(sciencebehindrapidrelief);
		}
	    public void clickOnEngineeredspeed() throws Exception {
	    	moveToElement(engineeredspeed);
			clickElementUsingJavaScript(engineeredspeed);
		}
	    public void clickOnspeedsenation() throws Exception {
	    	moveToElement(speedsensation);
			clickElementUsingJavaScript(speedsensation);
		}
	    public void clickOnbecomingfastspeed() throws Exception {
	    	moveToElement(becomingfastspeed);
			clickElementUsingJavaScript(becomingfastspeed);
		}
	    public void clickOnskigearstyle() throws Exception {
	    	moveToElement(skigear_style);
			clickElementUsingJavaScript(skigear_style);
		}
	    
	    public void clickOnwhiteningsensitiveteeth_1() throws Exception {
	    	//moveToElement(whiteningsensitiveteeth_1);
			clickElementUsingJavaScript(whiteningsensitiveteeth_1);
		}
	    public void clickOnwhattoknowaboutwhitening() throws Exception {
	    	moveToElement(whattoknow_aboutwhitening);
			clickElementUsingJavaScript(whattoknow_aboutwhitening);
		}
	    public void clickOntipsforwhiteningsensitiveteeth() throws Exception {
	    	moveToElement(tipsforwhiteningteeth);
			clickElementUsingJavaScript(tipsforwhiteningteeth);
		}
	    public void clickOnsensodynetruewhiteingredients() throws Exception {
	    	moveToElement(sensodynetruewhiteingredients);
			clickElementUsingJavaScript(sensodynetruewhiteingredients);
		}
	    public void clickOnwhiteningproductsImpact() throws Exception {
	    	moveToElement(whiteningproductsImpact);
			clickElementUsingJavaScript(whiteningproductsImpact);
		}
	    public void clickOnhowtohelpsensitiveteethafterwhitening() throws Exception {
	    	moveToElement(howtohelpsensitiveteethafterwhitening);
			clickElementUsingJavaScript(howtohelpsensitiveteethafterwhitening);
		}
	    public void clickOnsensitiveteethpainrelief() throws Exception {
	    	moveToElement(sensitiveteethpainrelief);
			clickElementUsingJavaScript(sensitiveteethpainrelief);
		}
	    public void clickOnrecognizingsensitiveteeth() throws Exception {
	    	moveToElement(recognizingsensitiveteeth);
			clickElementUsingJavaScript(recognizingsensitiveteeth);
		}
	    public void clickOnshockpaintoothsensitivity() throws Exception {
	    	moveToElement(shockpaintoothsensitivity);
			clickElementUsingJavaScript(shockpaintoothsensitivity);
		}
	    public void clickOnmythvstruth() throws Exception {
	    	moveToElement(mythvstruth);
			clickElementUsingJavaScript(mythvstruth);
		}
	    public void clickOncavityorsensitiveteeths() throws Exception {
	    	moveToElement(cavityorsensitiveteeth);
			clickElementUsingJavaScript(cavityorsensitiveteeth);
		}
	    public void clickOnsensitiveareaaftertrip() throws Exception {
	    	moveToElement(sensitiveareaaftertrip);
			clickElementUsingJavaScript(sensitiveareaaftertrip);
		}
	    public void clickOnsensodyneorpronamelh() throws Exception {
	    	moveToElement(sensodyneorpronamel);
			clickElementUsingJavaScript(sensodyneorpronamel);
		}
	    public void clickOnmanagingsensitiveteeth() throws Exception {
	    	moveToElement(managingsensitiveteeth);
			clickElementUsingJavaScript(managingsensitiveteeth);
		}
	    public void clickOntipsfortoothsensitivityhot() throws Exception {
	    	moveToElement(tipsfortoothsensitivityhot);
			clickElementUsingJavaScript(tipsfortoothsensitivityhot);
		}
	    public void clickOnhowtodealtoothsensitivitycold() throws Exception {
	    	moveToElement(howtodealwithtoothsensitivitycold);
			clickElementUsingJavaScript(howtodealwithtoothsensitivitycold);
		}
	    public void clickOncrowntoothpain() throws Exception {
	    	moveToElement(crowntoothpain);
			clickElementUsingJavaScript(crowntoothpain);
		}
	    public void clickOnunderstandingtoothsensitivityrootcanal() throws Exception {
	    	moveToElement(understandingtoothsensitivityrootcanal);
			clickElementUsingJavaScript(understandingtoothsensitivityrootcanal);
		}
	    public void clickOnsensitiveteethgumhealth() throws Exception {
	    	moveToElement(sensitiveteethgumhealth);
			clickElementUsingJavaScript(sensitiveteethgumhealth);
		}
	    public void clickOnImportancegumhealth() throws Exception {
	    	moveToElement(Importancegumhealth);
			clickElementUsingJavaScript(Importancegumhealth);
		}
	    public void clickOnTreatGingivits() throws Exception {
	    	moveToElement(TreatGingivitis);
			clickElementUsingJavaScript(TreatGingivitis);
		}
	    public void clickOntwobenefitsonetoothpaste() throws Exception {
	    	moveToElement(twobenefitsonetoothpaste);
			clickElementUsingJavaScript(twobenefitsonetoothpaste);
		}
	    public void clickOnwhatisfeeling() throws Exception {
	    	//moveToElement(whatisfilling);
			clickElementUsingJavaScript(whatisfilling);
		}
	    public void clickOnTipsforhealthyteethgums() throws Exception {
	    	moveToElement(tipsforhealthyteethgums);
			clickElementUsingJavaScript(tipsforhealthyteethgums);
		}
	    public void clickOntoothpaincauses() throws Exception {
	    	//moveToElement(toothpaincauses);
			clickElementUsingJavaScript(toothpaincauses);
		}
	    public void clickOnflossbeforeorafter() throws Exception {
	    	moveToElement(flossbeforeorafter);
			clickElementUsingJavaScript(flossbeforeorafter);
		}
	    public void clickOnSLSToothpaste() throws Exception {
	    	moveToElement(SlStoothpaste);
			clickElementUsingJavaScript(SlStoothpaste);
		}
//	    public void clickOnremovetarterteeth() throws Exception {
//	    	//moveToElement(removetarterteeth);
//			clickElementUsingJavaScript(removetarterteeth);
//		}
	    public void clickOnFAQ() throws Exception {
	    	moveToElement(FAQ);
			clickElementUsingJavaScript(FAQ);
		}
	    public void clickOncontactcustomersupportteam() throws Exception {
	    	moveToElement(contactcustomersupportteam);
			clickElementUsingJavaScript(contactcustomersupportteam);
		}
	    public void clickOnaccessibility() throws Exception {
	    	moveToElement(accessibility);
			clickElementUsingJavaScript(accessibility);
		}
	    public void clickOnSitemapsensodynewebpage() throws Exception {
	    	//moveToElement(sitemapsensodynewebpage);
			clickElementUsingJavaScript(sitemapsensodynewebpage);
		}
	    public void clickOnwheretobuy() throws Exception {
	    	//moveToElement(wheretobuy);
			clickElementUsingJavaScript(wheretobuy);
		}
	    public void clickOncoupons() throws Exception {
	    	moveToElement(coupons);
			clickElementUsingJavaScript(coupons);
		}
//	    public void clickOnthankyou() throws Exception {
//	    	//moveToElement(thankyou);
//			clickElementUsingJavaScript(thankyou);
//		}
	    public void clickOncovid19() throws Exception {
	    	moveToElement(covid19);
			clickElementUsingJavaScript(covid19);
		}
	    public void clickOnunsubscribe() throws Exception {
	    	moveToElement(unsubscribe);
			clickElementUsingJavaScript(unsubscribe);
		}
	    
	    
	    
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}















