package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenefoodtohelpdrymouthPage extends BaseClass{
	
	public biotenefoodtohelpdrymouthPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='IMPACT ON ORAL HEALTH']")
	private static WebElement Impactoralhealth_Breadcrumbs;				
		
	@FindBy(xpath = "//a[text()='Foods That Can Help Dry Mouth']")
	private static WebElement foodthatcanhelpdrymouth_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//child::a[@href='/what-is-dry-mouth/recognizing-dry-mouth/']")
	private static WebElement drymouth;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text odd grid_12 alpha']//child::a[@href='/dry-mouth-health-impacts/dry-mouth-saliva/']")
	private static WebElement salvia;	
	
	@FindBy(xpath = "//h1[text()='What Is Saliva and Why Is It Important for Dry Mouth?']")
	private static WebElement salvia_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text odd grid_12 alpha']//child::a[@href='/living-with-dry-mouth/drinking-water-for-dry-mouth/']")
	private static WebElement drinkingwater;	
	
	@FindBy(xpath = "//h1[text()='A DRY MOUTH NEEDS MORE THAN JUST WATER']")
	private static WebElement drinkingwater_txt;	
	
	@FindBy(xpath = "//a[text()='Biotène Dry Mouth Oral Rinse']")
	private static WebElement biotenedrymouthOralRinse;
	
	@FindBy(xpath = "//div[@class='richText component section mouthwash-banner-text product-title-text first odd omega']")
	private static WebElement oralrinsemouthwash;
	
	@FindBy(xpath = "//a[text()='Biotène Dry Mouth Gentle Oral Rinse']")
	private static WebElement gentleoralrinse;
	
	@FindBy(xpath = "//h1[text()='Biotène Dry Mouth Gentle Oral Rinse']")
	private static WebElement gentleoralrinse_txt;
	
	@FindBy(xpath = "//a[text()='Biotène Dry Mouth Lozenge']")
	private static WebElement drymouth_Lozenge;
	
	@FindBy(xpath = "//h1[text()='Biotène Dry Mouth Lozenges']")
	private static WebElement drymouth_Lozenge_txt;
	
	@FindBy(xpath = "//a[text()='Biotène Moisturizing Oral Spray']")
	private static WebElement BiotenemoisturizingSpray;
	
	@FindBy(xpath = "//h1[text()='Biotène Moisturizing Spray']")
	private static WebElement BiotenemoisturizingSpray_txt;
	
	@FindBy(xpath = "//a[text()='best picnic foods to eat with dry mouth']")
	private static WebElement bestpicincfood;
	
	@FindBy(xpath = "//h1[text()='Picnic Foods to Help Relieve Dry Mouth']")
	private static WebElement bestpicincfood_txt;
	
	@FindBy(xpath = "//a[text()='living with dry mouth']")
	private static WebElement livingwithdrymouth;
	
	@FindBy(xpath = "//strong[text()=' Living Well with Dry Mouth Management ']")
	private static WebElement livingwithdrymouth_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[@href='/what-is-dry-mouth/dry-mouth-causes-medications/']")
	private static WebElement Meditationdrymouth;
	
	@FindBy(xpath = "//h1[text()='Medications that Cause Dry Mouth']")
	private static WebElement Meditationdrymouth_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod even grid_4']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='SHOP NOW']")
	private static WebElement shopnow;
	
	@FindBy(xpath = "//div[@class='richText component section banner_text_buynow wdm-banner-img first odd last grid_12 alpha omega']")
	private static WebElement shopnow_txt;
	
	
	
	//Methods//
	
			public void clickonCookieBtn() throws Exception {
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
			public void clickonEmailBtn() throws Exception {	
			waitForPageLoadJava();
			if(isElementPresent(email_text)) {
				elementToBeClickable(email_text);
				try {
					if(email_text.isDisplayed()) {
						clickElementUsingJavaScript(email_text);
					}
					implicitWait();
					visibilityOf(emailpopup_Close);
					Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
				}
				catch (Exception e) {
					
				}
			}else {
				System.out.println("Email Pop-Up is not presented");
				throw new Exception("Unable to click on Email Pop-up");
			}
			}
			
			public void clickonHomeBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(Home_Breadcrumbs);
				pageLoad();
			}
			public void clickonImpactOralHealthBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(Impactoralhealth_Breadcrumbs);
				pageLoad();
			}
			public void clickonFoodthatcanhelpdrymouthBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(foodthatcanhelpdrymouth_Breadcrumbs);
				pageLoad();
			}
			public void clickondrymouth() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(drymouth);
				pageLoad();
			}
			public void clickonSalvia() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(salvia);
				clickElementUsingJavaScript(salvia);
				visibilityOf(salvia_txt);
				boolean elementIsDisplayed=elementIsDisplayed(salvia_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(salvia_txt));
				pageLoad();
			}
			public void clickondrinkingwater() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drinkingwater);
				clickElementUsingJavaScript(drinkingwater);
				visibilityOf(drinkingwater_txt);
				boolean elementIsDisplayed=elementIsDisplayed(drinkingwater_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(drinkingwater_txt));
				pageLoad();
			}
			public void clickonOralRinsemouthwash() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(biotenedrymouthOralRinse);
				clickElementUsingJavaScript(biotenedrymouthOralRinse);
				visibilityOf(oralrinsemouthwash);
				boolean elementIsDisplayed=elementIsDisplayed(oralrinsemouthwash);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(oralrinsemouthwash));
				pageLoad();
			}
			public void clickonGentleOralRinse() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(gentleoralrinse);
				clickElementUsingJavaScript(gentleoralrinse);
				visibilityOf(gentleoralrinse_txt);
				boolean elementIsDisplayed=elementIsDisplayed(gentleoralrinse_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(gentleoralrinse_txt));
				pageLoad();
			}
			public void clickondrymouthLozenge() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouth_Lozenge);
				clickElementUsingJavaScript(drymouth_Lozenge);
				visibilityOf(drymouth_Lozenge_txt);
				boolean elementIsDisplayed=elementIsDisplayed(drymouth_Lozenge_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(drymouth_Lozenge_txt));
				pageLoad();
			}
			public void clickonBiotenemoisturizungSpray() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(BiotenemoisturizingSpray);
				clickElementUsingJavaScript(BiotenemoisturizingSpray);
				visibilityOf(BiotenemoisturizingSpray_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BiotenemoisturizingSpray_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(BiotenemoisturizingSpray_txt));
				pageLoad();
			}
			public void clickonbestpicnicfood() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(bestpicincfood);
				clickElementUsingJavaScript(bestpicincfood);
				visibilityOf(bestpicincfood_txt);
				boolean elementIsDisplayed=elementIsDisplayed(bestpicincfood_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(bestpicincfood_txt));
				pageLoad();
			}
			public void clickonlivingwithdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(livingwithdrymouth);
				clickElementUsingJavaScript(livingwithdrymouth);
				visibilityOf(livingwithdrymouth_txt);
				boolean elementIsDisplayed=elementIsDisplayed(livingwithdrymouth_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(livingwithdrymouth_txt));
				pageLoad();
			}
			public void clickonMeditationdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Meditationdrymouth);
				clickElementUsingJavaScript(Meditationdrymouth);
				visibilityOf(Meditationdrymouth_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Meditationdrymouth_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Meditationdrymouth_txt));
				pageLoad();
			}
			public void clickonTakeQuiz() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(takequiz);
				clickElementUsingJavaScript(takequiz);
				visibilityOf(takequiz_txt);
				boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(takequiz_txt));
				pageLoad();
			}
			public void clickonShopnow() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(shopnow);
				clickElementUsingJavaScript(shopnow);
				visibilityOf(shopnow_txt);
				boolean elementIsDisplayed=elementIsDisplayed(shopnow_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(shopnow_txt));
				pageLoad();
			}
	
	
	
	
	
	
	
	
	
	

}
