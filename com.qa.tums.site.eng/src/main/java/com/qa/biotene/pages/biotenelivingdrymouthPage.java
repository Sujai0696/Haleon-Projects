package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenelivingdrymouthPage extends BaseClass{
	
	public biotenelivingdrymouthPage() {
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
	
	@FindBy(xpath = "//a[text()='LIVING WITH DRY MOUTH']")
	private static WebElement livingwithdrymouth_breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box first odd grid_6 alpha omega']//child::span[text()='LEARN MORE']")
	private static WebElement managingdrymouth_learnmore;	
	
	@FindBy(xpath = "//h1[text()='Is Dry Mouth Keeping You Awake?']")
	private static WebElement managingdrymouth_learnmoretxt;	
	
	@FindBy(xpath = "(//div[@class='box component section live-beyond-article-box even grid_6']//child::span[text()='LEARN MORE'])[1]")
	private static WebElement caringsomeone_learnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth: A Resource for Caregivers']")
	private static WebElement caringsomeone_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd grid_6 alpha omega']//child::a[@href='/living-with-dry-mouth/multi-medications/']")
	private static WebElement Medications_learnmore;
	
	@FindBy(xpath = "//h1[text()='The Link Between Dry Mouth and Medications']")
	private static WebElement Medications_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6']//child::a[@href='/living-with-dry-mouth/diabetes/']")
	private static WebElement Diabetescausedrymouth_learnmore;
	
	@FindBy(xpath = "//h1[text()='Managing Diabetes and Dry Mouth: A Guide']")
	private static WebElement Diabetescausedrymouth_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd grid_6 alpha omega']//child::a[@href='/living-with-dry-mouth/asthma/']")
	private static WebElement Asthmainhaler_learnmore;
	
	@FindBy(xpath = "//strong[text()=' Asthma, Allergies and Dry Mouth ']")
	private static WebElement Asthmainhaler_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6']//child::a[@href='/living-with-dry-mouth/cancer/']")
	private static WebElement CancerTreatment_drymouthLearnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth and Cancer Treatments']")
	private static WebElement CancerTreatment_drymouthLearnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd grid_6 alpha omega']//child::a[@href='/living-with-dry-mouth/dry-mouth-tips/']")
	private static WebElement drymouthtips_learnmore;
	
	@FindBy(xpath = "//span[text()='TIPS FOR LIVING WITH']")
	private static WebElement drymouthtips_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6']//child::a[@href='/living-with-dry-mouth/how-to-use-mouthwash/']")
	private static WebElement howtousemouthwash_learnmore;
	
	@FindBy(xpath = "//h1[text()='How and When to Use Mouthwash']")
	private static WebElement howtousemouthwash_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd last grid_6 alpha omega']//child::a[@href='/living-with-dry-mouth/dry-mouth-and-throat/']")
	private static WebElement DrymouthThroatRelated_learnmore;
	
	@FindBy(xpath = "//h1[text()='Why Your Dry Mouth and Throat Might Be Related']")
	private static WebElement DrymouthThroatRelated_learnmoretxt;
	

	
	
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
		public void clickonLivingwithdrymouthBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(livingwithdrymouth_breadcrumbs);
			pageLoad();
		}
		public void clickonManagingdrymouth_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(managingdrymouth_learnmore);
			clickElementUsingJavaScript(managingdrymouth_learnmore);
			visibilityOf(managingdrymouth_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(managingdrymouth_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managingdrymouth_learnmoretxt));
			pageLoad();
		}
		public void clickonCaringforsomeone_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(caringsomeone_learnmore);
			clickElementUsingJavaScript(caringsomeone_learnmore);
			visibilityOf(caringsomeone_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(caringsomeone_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(caringsomeone_learnmoretxt));
			pageLoad();
		}
		public void clickonDiabetescauseDrymouth_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Diabetescausedrymouth_learnmore);
			clickElementUsingJavaScript(Diabetescausedrymouth_learnmore);
			visibilityOf(Diabetescausedrymouth_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(Diabetescausedrymouth_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Diabetescausedrymouth_learnmoretxt));
			pageLoad();
		}
		public void clickonAsthmaAllergiesdrymouth_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Asthmainhaler_learnmore);
			clickElementUsingJavaScript(Asthmainhaler_learnmore);
			visibilityOf(Asthmainhaler_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(Asthmainhaler_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Asthmainhaler_learnmoretxt));
			pageLoad();
		}
	
		public void clickonCancertreatmentdrymouth_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(CancerTreatment_drymouthLearnmore);
			clickElementUsingJavaScript(CancerTreatment_drymouthLearnmore);
			visibilityOf(CancerTreatment_drymouthLearnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(CancerTreatment_drymouthLearnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(CancerTreatment_drymouthLearnmoretxt));
			pageLoad();
		}
		public void clickondrymouthTips_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthtips_learnmore);
			clickElementUsingJavaScript(drymouthtips_learnmore);
			visibilityOf(drymouthtips_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthtips_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthtips_learnmoretxt));
			pageLoad();
		}
		public void clickonHowtousemouthwash_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(howtousemouthwash_learnmore);
			clickElementUsingJavaScript(howtousemouthwash_learnmore);
			visibilityOf(howtousemouthwash_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(howtousemouthwash_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howtousemouthwash_learnmoretxt));
			pageLoad();
		}
		public void clickonDrymouthThroatRelated_learnmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(DrymouthThroatRelated_learnmore);
			clickElementUsingJavaScript(DrymouthThroatRelated_learnmore);
			visibilityOf(DrymouthThroatRelated_learnmoretxt);
			boolean elementIsDisplayed=elementIsDisplayed(DrymouthThroatRelated_learnmoretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(DrymouthThroatRelated_learnmoretxt));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	

}
