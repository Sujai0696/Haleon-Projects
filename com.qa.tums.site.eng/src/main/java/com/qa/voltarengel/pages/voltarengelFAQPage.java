package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelFAQPage extends BaseClass {
	
	public voltarengelFAQPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath = "//h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigyaform__heading first odd component col-xs-12']")
    private static WebElement gigyaClose;
		
    @FindBy(xpath = "//a[text()='Homepage']")
    private static WebElement homepage_breadcrumbs;		
	
    @FindBy(xpath = "//a[text()='Arthritis & Voltaren FAQs']")
    private static WebElement ArthristvolarenFAQ_breadcrumbs;			
	
    @FindBy(xpath = "//span[text()='How do I know if I have arthritis?']")
    private static WebElement howdoiknowArthrist;
	
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement howdoiknowArthrist_Active;
	
    @FindBy(xpath = "//span[text()='What is Voltaren Arthritis Pain Gel used for?']")
    private static WebElement voltarenArthristused;
	
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarenArthristused_Active;
    
    @FindBy(xpath = "(//div[@class='parametrizedhtml component section video-int first odd col-xs-12 reference-custom-video']//i[@class='icon icon-video-play'])[1]")
    private static WebElement youtube1;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube1_visibility;
    
    
    
    
    
    
    
    @FindBy(xpath = "//span[text()='What is the active ingredient in Voltaren Arthritis Pain Gel?']")
    private static WebElement activeIngredientspaingel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement activeIngredientspaingel_Active;
    
    @FindBy(xpath = "//span[text()='How is over-the-counter Voltaren Arthritis Pain Gel different from prescription Voltaren Gel?']")
    private static WebElement CounterVoltarenArthristpain;
	
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement CounterVoltarenArthristpain_Active;
	
    @FindBy(xpath = "//span[text()='How is Voltaren Arthritis Pain Gel different from other over-the-counter topical pain relievers?']")
    private static WebElement voltarenArthristpaingel_different;
	
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarenArthristpaingel_different_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[2]")
    private static WebElement youtube2;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube2_visibility;
    
    @FindBy(xpath = "//span[text()='What is the difference between topical and oral diclofenac?']")
    private static WebElement differencebetweentropicalandOral;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement differencebetweentropicalandOral_Active;
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from lidocaine products such as Icy Hot, Aspercreme, or Salonpas?']")
    private static WebElement voltarendifferentlicocaine;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarendifferentlicocaine_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[3]")
    private static WebElement youtube3;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube3_visibility;
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from products such as Biofreeze, Icy Hot, Salonpas Pain Relieving Gel-Patch HOT, Aspercreme, and Bengay?']")
    private static WebElement voltarendifferentproducts;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarendifferentproducts_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[4]")
    private static WebElement youtube4;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube4_visibility;
    
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from Aleve?']")
    private static WebElement voltarenfromAleve;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarenfromAleve_Active;
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from Tylenol?']")
    private static WebElement voltarendifferentfromtylenol;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarendifferentfromtylenol_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[5]")
    private static WebElement youtube5;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube5_visibility;
    
    
    
    
    
    
    
    
  
    @FindBy(xpath = "//span[text()='What is Voltaren Emulgel™?']")
    private static WebElement VoltarenEmugel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement VoltarenEmugel_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[6]")
    private static WebElement youtube6;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube6_visibility;
    
    
    
    
    
    
    @FindBy(xpath = "//span[text()='How will Voltaren Arthritis Pain Gel feel on my body?']")
    private static WebElement Voltarenarthristfeelbody;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement Voltarenarthristfeelbody_Active;
    
    @FindBy(xpath = "//span[text()='When does Voltaren Arthritis Pain start working?']")
    private static WebElement Voltarenapainstarts;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement Voltarenapainstarts_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[7]")
    private static WebElement youtube7;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube7_visibility;
    
    
    @FindBy(xpath = "//span[text()='Where can I buy Voltaren Arthritis Pain Gel?']")
    private static WebElement Voltarenapaingel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement Voltarenapaingel_Active;
    
    @FindBy(xpath = "//span[text()='Is there a discount for Voltaren Arthritis Pain Gel?']")
    private static WebElement Voltarenadiscountpaingel;
   
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement Voltarenadiscountpaingel_Active;
    
    
    //Usage//
    
    @FindBy(xpath = "//span[text()='How to open Voltaren Arthritis Pain Gel?']")
    private static WebElement openvoltarenpaingel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement openvoltarenpaingel_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[8]")
    private static WebElement youtube8;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube8_visibility;
    
    
    @FindBy(xpath = "//span[text()='How to use Voltaren Arthritis Pain Gel?']")
    private static WebElement usevoltarenarthristgel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement usevoltarenarthristgel_Active;
    
    @FindBy(xpath = "//span[text()='Can I apply Voltaren Arthritis Pain Gel to the upper and lower body areas at the same time?']")
    private static WebElement voltarenupperlowerbody;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarenupperlowerbody_Active;
    
    @FindBy(xpath = "//span[text()='Why can’t I use Voltaren Arthritis Pain Gel for shoulders, hips, etc.?']")
    private static WebElement voltarenArthristshoulderships;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarenArthristshoulderships_Active;
    
    @FindBy(xpath = "//span[text()='Can Voltaren be used for muscle or back pain?']")
    private static WebElement voltarenmusclepain;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarenmusclepain_Active;
    
    @FindBy(xpath = "//span[text()='Can Voltaren be used for knee pain?']")
    private static WebElement voltarenusekneepain;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarenusekneepain_Active;
    
    @FindBy(xpath = "//span[text()='Can I apply Voltaren Arthritis Pain Gel without measuring it out on the dosing card first?']")
    private static WebElement voltarenwithoutmeasuringcard;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarenwithoutmeasuringcard_Active;
    
    @FindBy(xpath = "//span[text()='How do I measure the correct amount with the dosing card?']")
    private static WebElement correctamountdosingcard;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement correctamountdosingcard_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[9]")
    private static WebElement youtube9;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube9_visibility;
    
    
    @FindBy(xpath = "//span[text()='How often should I use Voltaren Arthritis Pain Gel?']")
    private static WebElement howoftenusevoltarengel;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement howoftenusevoltarengel_Active;
    
    @FindBy(xpath = "//span[text()='How long should I use Voltaren Arthritis Pain Gel?']")
    private static WebElement howlongusedArthristpaingel;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement howlongusedArthristpaingel_Active;
    
    @FindBy(xpath = "//span[text()='How long does Voltaren take to work?']")
    private static WebElement longvoltarentakework;
    
    @FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
    private static WebElement longvoltarentakework_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[10]")
    private static WebElement youtube10;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube10_visiblity;
    
    
    
    
    //Safety//
    
    
    @FindBy(xpath = "//span[text()='What if I miss a dose of Voltaren Arthritis Pain Gel?']")
    private static WebElement missdosevoltarengel;
    
    @FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
    private static WebElement missdosevoltarengel_Active;
    
    @FindBy(xpath = "//span[text()='Can I take any other pain medications during the first 7 days when I use Voltaren Arthritis Pain Gel?']")
    private static WebElement canitakepainmedications;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement canitakepainmedications_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren Arthritis Pain Gel if I’m under 18 years?']")
    private static WebElement votarenuseunder18years;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement votarenuseunder18years_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren and Tylenol together?']")
    private static WebElement voltarentylenoltogether;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarentylenoltogether_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren and Advil together?']")
    private static WebElement voltarentAdviltogether;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarentAdviltogether_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren and Aleve together?']")
    private static WebElement voltarentAlevetogether;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarentAlevetogether_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren if I’m pregnant?']")
    private static WebElement voltarentifpregant;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarentifpregant_Active;
    
    @FindBy(xpath = "//span[text()='Can I use Voltaren if I’m breastfeeding?']")
    private static WebElement voltarentbreastfeeding;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarentbreastfeeding_Active;
    
    @FindBy(xpath = "//span[text()='Can Voltaren be used with other medications?']")
    private static WebElement voltarentusedothermedications;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarentusedothermedications_Active;
    
    @FindBy(xpath = "//span[text()='Do I need to wash my hands after applying Voltaren Arthritis Pain Gel?']")
    private static WebElement doineedvoltarenarthristpaingel;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement doineedvoltarenarthristpaingel_Active;
    
    @FindBy(xpath = "//span[text()='What do I do if I get Voltaren Arthritis Pain Gel in my eyes?']")
    private static WebElement voltarenArthristeyes;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarenArthristeyes_Active;
    
    @FindBy(xpath = "//span[text()='Is Voltaren Arthritis Pain Gel a narcotic drug?']")
    private static WebElement voltarennarcoticdrug;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarennarcoticdrug_Active;
    
    @FindBy(xpath = "//span[text()='Is Voltaren Arthritis Pain Gel opioid-free?']")
    private static WebElement voltarenopioidfree;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarenopioidfree_Active;
    
    @FindBy(xpath = "//span[text()='Is Voltaren Arthritis Pain Gel addictive? Will it cause withdrawal symptoms?']")
    private static WebElement voltarenpaingeladdicitive;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarenpaingeladdicitive_Active;
    
    @FindBy(xpath = "//span[text()='Is Voltaren Arthritis Pain Gel paraben-free?']")
    private static WebElement voltarenparebenfree;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarenparebenfree_Active;
    
    @FindBy(xpath = "//span[text()='Is Voltaren Arthritis Pain Gel dye-free?']")
    private static WebElement voltarenpaingeldyefree;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarenpaingeldyefree_Active;
    
    @FindBy(xpath = "//span[text()='How should I store Voltaren Arthritis Pain Gel?']")
    private static WebElement storearthristpaingel;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement storearthristpaingel_Active;
    
    @FindBy(xpath = "//span[text()='What is the safety profile of Voltaren Arthritis Pain Gel?']")
    private static WebElement safetyprofilepaingel;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement safetyprofilepaingel_Active;
   
    @FindBy(xpath = "//span[text()='What are the side effects of Voltaren Arthritis Pain?']")
    private static WebElement sideeffectsvoltarenpain;
   
    @FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
    private static WebElement sideeffectsvoltarenpain_Active;
    
    @FindBy(xpath = "//div[@class='richText component section padding-15-left-dt padding-20-bottom-dt padding-20-top-dt padding-30-left-dt padding-30-right-dt even last col-xs-12 col-md-6']//a[@href='/what-is-voltaren/']")
    private static WebElement learnmorefeeljoymovement;
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement learnmorefeeljoymovement_Active;
    
    
    
    
    
//methods
	
    public void clickCookieBtn() throws Exception {
        waitForPageLoadJava();
        if(isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if(cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
    }
    public void clickGigyaForm() throws Exception {
       waitForPageLoadJava();
        try {
            if (gigyaForm.isDisplayed()) {
                clickElementUsingJavaScript(gigyaForm);
            }
           // visibilityOf(gigyaClose);
            implicitWait();
            actionClick(gigyaClose);
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
           // elementClick(gigyaClose);
           // actionClick(gigyaClose);
        } catch (Exception e) {
       }
        
		}
    public void clickonHomepageBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(homepage_breadcrumbs);
    	clickElementUsingJavaScript(homepage_breadcrumbs);
    	pageLoad();
    }
    public void clickonArthiristvoltarenFAQBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(ArthristvolarenFAQ_breadcrumbs);
    	clickElementUsingJavaScript(ArthristvolarenFAQ_breadcrumbs);
    	pageLoad();
    }
    public void clickonHowdoiknowArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(howdoiknowArthrist);
    	moveToElement(howdoiknowArthrist);
    	clickElementUsingJavaScript(howdoiknowArthrist);
    	boolean elementIsDisplayed=elementIsDisplayed(howdoiknowArthrist_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(howdoiknowArthrist));
    	clickElementUsingJavaScript(howdoiknowArthrist);
    	pageLoad();
    }
    public void clickonVoltarenArthristUsed() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristused);
    	moveToElement(voltarenArthristused);
    	clickElementUsingJavaScript(voltarenArthristused);
    	clickElementUsingJavaScript(youtube1);
    	visibilityOf(youtube1_visibility);
    	actionClick(youtube1_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube1_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(voltarenArthristused));
    	//clickElementUsingJavaScript(voltarenArthristused);
    	pageLoad();
    }
    public void clickonActiveIngredientspaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(activeIngredientspaingel);
    	moveToElement(activeIngredientspaingel);
    	clickElementUsingJavaScript(activeIngredientspaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(activeIngredientspaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(activeIngredientspaingel));
    	clickElementUsingJavaScript(activeIngredientspaingel);
    	pageLoad();
    }
    public void clickonCounterVoltarenArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(CounterVoltarenArthristpain);
    	moveToElement(CounterVoltarenArthristpain);
    	clickElementUsingJavaScript(CounterVoltarenArthristpain);
    	boolean elementIsDisplayed=elementIsDisplayed(CounterVoltarenArthristpain_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(CounterVoltarenArthristpain));
    	clickElementUsingJavaScript(CounterVoltarenArthristpain);
    	pageLoad();
    }
    public void clickonVoltarenArthiristpaingelDifferent() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristpaingel_different);
    	moveToElement(voltarenArthristpaingel_different);
    	clickElementUsingJavaScript(voltarenArthristpaingel_different);
    	clickElementUsingJavaScript(youtube2);
    	visibilityOf(youtube2_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube2_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(voltarenArthristpaingel_different));
    	//clickElementUsingJavaScript(voltarenArthristpaingel_different);
    	pageLoad();
    }
    public void clickonDifferencebetweentropicalOral() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(differencebetweentropicalandOral);
    	moveToElement(differencebetweentropicalandOral);
    	clickElementUsingJavaScript(differencebetweentropicalandOral);
    	boolean elementIsDisplayed=elementIsDisplayed(differencebetweentropicalandOral_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(differencebetweentropicalandOral));
    	clickElementUsingJavaScript(differencebetweentropicalandOral);
    	pageLoad();
    }
    public void clickonvoltarendifferentlidocaine() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferentlicocaine);
    	moveToElement(voltarendifferentlicocaine);
    	clickElementUsingJavaScript(voltarendifferentlicocaine);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferentlicocaine_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarendifferentlicocaine));
    	clickElementUsingJavaScript(voltarendifferentlicocaine);
    	pageLoad();
    }
    public void clickonvoltarenfromAleve() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenfromAleve);
    	moveToElement(voltarenfromAleve);
    	clickElementUsingJavaScript(voltarenfromAleve);
    	visibilityOf(voltarenfromAleve_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenfromAleve_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenfromAleve));
    	clickElementUsingJavaScript(voltarenfromAleve);
    	pageLoad();
    }
    public void clickonvoltarendifferentTylenol() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferentfromtylenol);
    	moveToElement(voltarendifferentfromtylenol);
    	clickElementUsingJavaScript(voltarendifferentfromtylenol);
    	visibilityOf(voltarendifferentfromtylenol_Active);
    	clickElementUsingJavaScript(youtube5);
    	visibilityOf(youtube5_visibility);
    	actionClick(youtube5_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube5_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	
    	pageLoad();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void clickonvoltarenEmulgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(VoltarenEmugel);
    	moveToElement(VoltarenEmugel);
    	clickElementUsingJavaScript(VoltarenEmugel);
    	visibilityOf(VoltarenEmugel_Active);
    	clickElementUsingJavaScript(youtube6);
    	visibilityOf(youtube6_visibility);
    	actionClick(youtube6_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube6_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(VoltarenEmugel));
    	//clickElementUsingJavaScript(VoltarenEmugel);
    	pageLoad();
    }
    public void clickonvoltarenArthristFeelbody() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Voltarenarthristfeelbody);
    	moveToElement(Voltarenarthristfeelbody);
    	clickElementUsingJavaScript(Voltarenarthristfeelbody);
    	boolean elementIsDisplayed=elementIsDisplayed(Voltarenarthristfeelbody_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Voltarenarthristfeelbody));
    	clickElementUsingJavaScript(Voltarenarthristfeelbody);
    	pageLoad();
    }
    public void clickonvoltarenpainstarts() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Voltarenapainstarts);
    	moveToElement(Voltarenapainstarts);
    	clickElementUsingJavaScript(Voltarenapainstarts);
    	visibilityOf(Voltarenapainstarts_Active);
    	clickElementUsingJavaScript(youtube7);
    	visibilityOf(youtube7_visibility);
    	actionClick(youtube7_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube7_visibility);
    	Assert.assertTrue(elementIsDisplayed);
//    	System.out.println(getElementText(Voltarenapainstarts));
//    	clickElementUsingJavaScript(Voltarenapainstarts);
    	pageLoad();
    }
    public void clickonvoltarenpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Voltarenapaingel);
    	moveToElement(Voltarenapaingel);
    	clickElementUsingJavaScript(Voltarenapaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(Voltarenapaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Voltarenapaingel));
    	clickElementUsingJavaScript(Voltarenapaingel);
    	pageLoad();
    }
    public void clickonvoltarenpaingelDiscount() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Voltarenadiscountpaingel);
    	moveToElement(Voltarenadiscountpaingel);
    	clickElementUsingJavaScript(Voltarenadiscountpaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(Voltarenadiscountpaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Voltarenadiscountpaingel));
    	clickElementUsingJavaScript(Voltarenadiscountpaingel);
    	pageLoad();
    }
    public void clickonOpenvoltarenArthristgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(openvoltarenpaingel);
    	moveToElement(openvoltarenpaingel);
    	clickElementUsingJavaScript(openvoltarenpaingel);
    	visibilityOf(openvoltarenpaingel_Active);
    	clickElementUsingJavaScript(youtube8);
    	visibilityOf(youtube8_visibility);
    	actionClick(youtube8_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube8_visibility);
    	Assert.assertTrue(elementIsDisplayed);
//    	System.out.println(getElementText(openvoltarenpaingel));
//    	clickElementUsingJavaScript(openvoltarenpaingel);
    	pageLoad();
    }
    public void clickonUseArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(usevoltarenarthristgel);
    	moveToElement(usevoltarenarthristgel);
    	clickElementUsingJavaScript(usevoltarenarthristgel);
    	boolean elementIsDisplayed=elementIsDisplayed(usevoltarenarthristgel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(usevoltarenarthristgel));
    	clickElementUsingJavaScript(usevoltarenarthristgel);
    	pageLoad();
    }
    public void clickonVoltarenupperlowerbody() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenupperlowerbody);
    	moveToElement(voltarenupperlowerbody);
    	clickElementUsingJavaScript(voltarenupperlowerbody);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenupperlowerbody_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenupperlowerbody));
    	clickElementUsingJavaScript(voltarenupperlowerbody);
    	pageLoad();
    }
    public void clickonVoltarenArthristshouldership() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristshoulderships);
    	moveToElement(voltarenArthristshoulderships);
    	clickElementUsingJavaScript(voltarenArthristshoulderships);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenArthristshoulderships_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenArthristshoulderships));
    	clickElementUsingJavaScript(voltarenArthristshoulderships);
    	pageLoad();
    }
    public void clickonVoltarenusemusclepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenmusclepain);
    	moveToElement(voltarenmusclepain);
    	clickElementUsingJavaScript(voltarenmusclepain);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenmusclepain_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenmusclepain));
    	clickElementUsingJavaScript(voltarenmusclepain);
    	pageLoad();
    }
    public void clickonVoltarenusekneepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenusekneepain);
    	moveToElement(voltarenusekneepain);
    	clickElementUsingJavaScript(voltarenusekneepain);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenusekneepain_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenusekneepain));
    	clickElementUsingJavaScript(voltarenusekneepain);
    	pageLoad();
    }
    public void clickonVoltaremeasuringcard() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenwithoutmeasuringcard);
    	moveToElement(voltarenwithoutmeasuringcard);
    	clickElementUsingJavaScript(voltarenwithoutmeasuringcard);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenwithoutmeasuringcard_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenwithoutmeasuringcard));
    	clickElementUsingJavaScript(voltarenwithoutmeasuringcard);
    	pageLoad();
    }
    public void clickonCorrectAmountDosingcard() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(correctamountdosingcard);
    	moveToElement(correctamountdosingcard);
    	clickElementUsingJavaScript(correctamountdosingcard);
    	visibilityOf(correctamountdosingcard_Active);
    	clickElementUsingJavaScript(youtube9);
    	visibilityOf(youtube9_visibility);
    	actionClick(youtube9_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube9_visibility);
    	Assert.assertTrue(elementIsDisplayed);
//    	System.out.println(getElementText(correctamountdosingcard));
//    	clickElementUsingJavaScript(correctamountdosingcard);
    	pageLoad();
    }
    public void clickonHowoftenusevoltarengel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(howoftenusevoltarengel);
    	moveToElement(howoftenusevoltarengel);
    	clickElementUsingJavaScript(howoftenusevoltarengel);
    	boolean elementIsDisplayed=elementIsDisplayed(howoftenusevoltarengel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(howoftenusevoltarengel));
    	clickElementUsingJavaScript(howoftenusevoltarengel);
    	pageLoad();
    }
    public void clickonHowlonguseArthristgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(howlongusedArthristpaingel);
    	moveToElement(howlongusedArthristpaingel);
    	clickElementUsingJavaScript(howlongusedArthristpaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(howlongusedArthristpaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(howlongusedArthristpaingel));
    	clickElementUsingJavaScript(howlongusedArthristpaingel);
    	pageLoad();
    }
    public void clickonHowlongvoltarentowork() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(longvoltarentakework);
    	moveToElement(longvoltarentakework);
    	clickElementUsingJavaScript(longvoltarentakework);
    	visibilityOf(longvoltarentakework_Active);
    	clickElementUsingJavaScript(youtube10);
    	visibilityOf(youtube10_visiblity);
    	actionClick(youtube10_visiblity);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube10_visiblity);
    	Assert.assertTrue(elementIsDisplayed);
//    	System.out.println(getElementText(longvoltarentakework));
//    	clickElementUsingJavaScript(longvoltarentakework);
    	pageLoad();
    }
    public void clickonMissdoseVolatrengel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(missdosevoltarengel);
    	moveToElement(missdosevoltarengel);
    	clickElementUsingJavaScript(missdosevoltarengel);
    	boolean elementIsDisplayed=elementIsDisplayed(missdosevoltarengel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(missdosevoltarengel));
    	clickElementUsingJavaScript(missdosevoltarengel);
    	pageLoad();
    }
    public void clickoncanitakepainmedications() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(canitakepainmedications);
    	moveToElement(canitakepainmedications);
    	clickElementUsingJavaScript(canitakepainmedications);
    	boolean elementIsDisplayed=elementIsDisplayed(canitakepainmedications_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(canitakepainmedications));
    	clickElementUsingJavaScript(canitakepainmedications);
    	pageLoad();
    }
    public void clickonVoltarenArthistunder18years() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(votarenuseunder18years);
    	moveToElement(votarenuseunder18years);
    	clickElementUsingJavaScript(votarenuseunder18years);
    	boolean elementIsDisplayed=elementIsDisplayed(votarenuseunder18years_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(votarenuseunder18years));
    	clickElementUsingJavaScript(votarenuseunder18years);
    	pageLoad();
    }
    public void clickonVoltarentylenoltogether() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentylenoltogether);
    	moveToElement(voltarentylenoltogether);
    	clickElementUsingJavaScript(voltarentylenoltogether);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentylenoltogether_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentylenoltogether));
    	clickElementUsingJavaScript(voltarentylenoltogether);
    	pageLoad();
    }
    public void clickonVoltarenAdviltogether() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentAdviltogether);
    	moveToElement(voltarentAdviltogether);
    	clickElementUsingJavaScript(voltarentAdviltogether);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentAdviltogether_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentAdviltogether));
    	clickElementUsingJavaScript(voltarentAdviltogether);
    	pageLoad();
    }
    public void clickonVoltarenAlevtogether() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentAlevetogether);
    	moveToElement(voltarentAlevetogether);
    	clickElementUsingJavaScript(voltarentAlevetogether);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentAlevetogether_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentAlevetogether));
    	clickElementUsingJavaScript(voltarentAlevetogether);
    	pageLoad();
    }
    public void clickonVoltarenifPregant() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentifpregant);
    	moveToElement(voltarentifpregant);
    	clickElementUsingJavaScript(voltarentifpregant);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentifpregant_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentifpregant));
    	clickElementUsingJavaScript(voltarentifpregant);
    	pageLoad();
    }
    public void clickonVoltarenbreastfeeding() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentbreastfeeding);
    	moveToElement(voltarentbreastfeeding);
    	clickElementUsingJavaScript(voltarentbreastfeeding);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentbreastfeeding_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentbreastfeeding));
    	clickElementUsingJavaScript(voltarentbreastfeeding);
    	pageLoad();
    }
    public void clickonVoltarenusedothermedications() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarentusedothermedications);
    	moveToElement(voltarentusedothermedications);
    	clickElementUsingJavaScript(voltarentusedothermedications);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarentusedothermedications_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarentusedothermedications));
    	clickElementUsingJavaScript(voltarentusedothermedications);
    	pageLoad();
    }
    public void clickondoineedwashhandsVoltarenArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(doineedvoltarenarthristpaingel);
    	moveToElement(doineedvoltarenarthristpaingel);
    	clickElementUsingJavaScript(doineedvoltarenarthristpaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(doineedvoltarenarthristpaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(doineedvoltarenarthristpaingel));
    	clickElementUsingJavaScript(doineedvoltarenarthristpaingel);
    	pageLoad();
    }
    public void clickonVoltarenArthristpaingeleyes() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristeyes);
    	moveToElement(voltarenArthristeyes);
    	clickElementUsingJavaScript(voltarenArthristeyes);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenArthristeyes_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenArthristeyes));
    	clickElementUsingJavaScript(voltarenArthristeyes);
    	pageLoad();
    }
    public void clickonVoltarenNarcoticdrugs() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarennarcoticdrug);
    	moveToElement(voltarennarcoticdrug);
    	clickElementUsingJavaScript(voltarennarcoticdrug);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarennarcoticdrug_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarennarcoticdrug));
    	clickElementUsingJavaScript(voltarennarcoticdrug);
    	pageLoad();
    }
	
    public void clickonVoltarenpaingelAddicitive() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenpaingeladdicitive);
    	moveToElement(voltarenpaingeladdicitive);
    	clickElementUsingJavaScript(voltarenpaingeladdicitive);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenpaingeladdicitive_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenpaingeladdicitive));
    	clickElementUsingJavaScript(voltarenpaingeladdicitive);
    	pageLoad();
    }
    public void clickonVoltarenparabenfree() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenparebenfree);
    	moveToElement(voltarenparebenfree);
    	clickElementUsingJavaScript(voltarenparebenfree);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenparebenfree_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenpaingeladdicitive));
    	clickElementUsingJavaScript(voltarenpaingeladdicitive);
    	pageLoad();
    }
    public void clickonVoltarenpaingeldyefree() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenpaingeldyefree);
    	moveToElement(voltarenpaingeldyefree);
    	clickElementUsingJavaScript(voltarenpaingeldyefree);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenpaingeldyefree_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenpaingeldyefree));
    	clickElementUsingJavaScript(voltarenpaingeldyefree);
    	pageLoad();
    }
    public void clickonVoltarenstoreArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(storearthristpaingel);
    	moveToElement(storearthristpaingel);
    	clickElementUsingJavaScript(storearthristpaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(storearthristpaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(storearthristpaingel));
    	clickElementUsingJavaScript(storearthristpaingel);
    	pageLoad();
    }
    public void clickonSafetyprofilepaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(safetyprofilepaingel);
    	moveToElement(safetyprofilepaingel);
    	clickElementUsingJavaScript(safetyprofilepaingel);
    	boolean elementIsDisplayed=elementIsDisplayed(safetyprofilepaingel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(safetyprofilepaingel));
    	clickElementUsingJavaScript(safetyprofilepaingel);
    	pageLoad();
    }
    public void clickonSideeffectsvoltarenpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(sideeffectsvoltarenpain);
    	moveToElement(sideeffectsvoltarenpain);
    	clickElementUsingJavaScript(sideeffectsvoltarenpain);
    	boolean elementIsDisplayed=elementIsDisplayed(sideeffectsvoltarenpain_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(sideeffectsvoltarenpain));
    	clickElementUsingJavaScript(sideeffectsvoltarenpain);
    	pageLoad();
    }
    public void clickonlearnmoreVoltarenpaingelfeelmovement() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(learnmorefeeljoymovement);
    	moveToElement(learnmorefeeljoymovement);
    	clickElementUsingJavaScript(learnmorefeeljoymovement);
    	boolean elementIsDisplayed=elementIsDisplayed(learnmorefeeljoymovement_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(learnmorefeeljoymovement_Active));
    	//clickElementUsingJavaScript(learnmorefeeljoymovement);
    	pageLoad();
    }
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

}
