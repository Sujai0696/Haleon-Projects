package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenelivingwithdrymouthQuizPage extends BaseClass{
	
	public biotenelivingwithdrymouthQuizPage() {
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
	private static WebElement livingdrymouth_Breadcrumbs;			
		
	@FindBy(xpath = "//a[text()='CAREGIVERS']")
	private static WebElement caregivers_Breadcrumbs;		
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//a[text()='Quiz: Does Your Loved One Have Dry Mouth? ']")
	private static WebElement Quizlovedones_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage quiz-question-text first odd component grid_12 alpha omega']//a[text()='YES']")
	private static WebElement Yes1;	
	
	@FindBy(xpath = "//h2[text()='Does your loved one take more than one daily medication?']")
	private static WebElement lovedonedailymedications_txt;	
	
	@FindBy(xpath = "//h2[text()='Are they undergoing cancer treatment?']")
	private static WebElement undergoingcancertreatment_txt;	
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[1]")
	private static WebElement Yes2;
	
	@FindBy(xpath = "//h2[text()='Do they have diabetes?']")
	private static WebElement dotheyhaveDiabetes;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::a[text()='YES'])[1]")
	private static WebElement Yes3;
	
	@FindBy(xpath = "//h2[text()='Do they use inhalers for asthma or COPD?']")
	private static WebElement inhalersorasthma;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[2]")
	private static WebElement Yes4;
	
	@FindBy(xpath = "//h2[text()='Do they smoke or drink alcohol?']")
	private static WebElement dotheysmokealchol;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::a[text()='YES'])[2]")
	private static WebElement Yes5;
	
	@FindBy(xpath = "//h2[text()='Are they frequently thirsty?']")
	private static WebElement aretheyfrequentlythirsty;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[3]")
	private static WebElement Yes6;
	
	@FindBy(xpath = "//h2[text()='Is their tongue or lips visibly dry?']")
	private static WebElement tongueorlipsdry;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::a[text()='YES'])[3]")
	private static WebElement Yes7;
	
	@FindBy(xpath = "//h2[text()='Do they wake up at night to drink water?']")
	private static WebElement dotheywakeupnight;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[4]")
	private static WebElement Yes8;
	
	@FindBy(xpath = "//h2[text()='Do they have halitosis, or bad breath?']")
	private static WebElement halitosis;
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::a[text()='YES'])[4]")
	private static WebElement Yes9;
	
	@FindBy(xpath = "//h2[text()='Do they have difficulty eating dry foods?']")
	private static WebElement difficultydryfoods;
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text even last grid_12 alpha omega']//child::a[text()='YES']")
	private static WebElement Yes10;
	
	@FindBy(xpath = "//h3[text()='Thank you for taking our Dry Mouth quiz for caregivers. Your family member may be at risk for Dry Mouth.']")
	private static WebElement thankyou;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod footer-one first odd grid_4 alpha']//child::a[text()='READ MORE']")
	private static WebElement Relievedrymouth;
	
	@FindBy(xpath = "//h1[text()='Relieve Symptoms from Dry Mouth at Night']")
	private static WebElement Relievedrymouth_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod footer-two even grid_4']//child::a[@href='/what-is-dry-mouth/dry-mouth-symptoms/']")
	private static WebElement learnaboutsymptoms;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement learnaboutsymptoms_txt;
	
	@FindBy(xpath = "//div[@class='richText component section three footer-pod footer-three odd last grid_4 omega']//child::a[@href='/living-with-dry-mouth/how-to-freshen-bad-breath/']")
	private static WebElement freshenbadbreathe;
	
	@FindBy(xpath = "//h1[text()='FRESHEN BAD BREATH CAUSED BY DRY MOUTH']")
	private static WebElement freshenbadbreathe_txt;
	
	
	
	
	
	
	
	
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
			public void clickonlivingdrymouthBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(livingdrymouth_Breadcrumbs);
				pageLoad();
			}
			public void clickonCaregiversBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(caregivers_Breadcrumbs);
				pageLoad();
			}
			public void clickonQuizlovedonesBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(Quizlovedones_Breadcrumbs);
				pageLoad();
			}
			public void clickonLovedonedailymedications() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(lovedonedailymedications_txt);
				visibilityOf(lovedonedailymedications_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lovedonedailymedications_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(lovedonedailymedications_txt));
				//clickElementUsingJavaScript(Yes1);
				pageLoad();
			}
			public void clickonUndergoingcancertreatment() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				scrollDownUsingElement(undergoingcancertreatment_txt);
				visibilityOf(undergoingcancertreatment_txt);
				boolean elementIsDisplayed=elementIsDisplayed(undergoingcancertreatment_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(undergoingcancertreatment_txt));
				//clickElementUsingJavaScript(Yes2);
				pageLoad();
			}
			public void clickonDohaveDiabetes() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				scrollDownUsingElement(dotheyhaveDiabetes);
				visibilityOf(dotheyhaveDiabetes);
				boolean elementIsDisplayed=elementIsDisplayed(dotheyhaveDiabetes);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dotheyhaveDiabetes));
				//clickElementUsingJavaScript(Yes3);
				pageLoad();
			}
			public void clickonInhalersorAsthma() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				scrollDownUsingElement(inhalersorasthma);
				visibilityOf(inhalersorasthma);
				boolean elementIsDisplayed=elementIsDisplayed(inhalersorasthma);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(inhalersorasthma));
				//clickElementUsingJavaScript(Yes4);
				pageLoad();
			}
	
			public void clickonDotheysmokeAlchol() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				scrollDownUsingElement(dotheysmokealchol);
				visibilityOf(dotheysmokealchol);
				boolean elementIsDisplayed=elementIsDisplayed(dotheysmokealchol);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dotheysmokealchol));
				pageLoad();
			}
			public void clickonAreTheyFrequentlyThirsty() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				scrollDownUsingElement(aretheyfrequentlythirsty);
				visibilityOf(aretheyfrequentlythirsty);
				boolean elementIsDisplayed=elementIsDisplayed(aretheyfrequentlythirsty);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(aretheyfrequentlythirsty));
				pageLoad();
			}
			public void clickonTongueorlipsdry() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				clickElementUsingJavaScript(Yes6);
				scrollDownUsingElement(tongueorlipsdry);
				visibilityOf(tongueorlipsdry);
				boolean elementIsDisplayed=elementIsDisplayed(tongueorlipsdry);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(tongueorlipsdry));
				pageLoad();
			}
			public void clickonDotheywakeupnight() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				clickElementUsingJavaScript(Yes6);
				clickElementUsingJavaScript(Yes7);
				scrollDownUsingElement(dotheywakeupnight);
				visibilityOf(dotheywakeupnight);
				boolean elementIsDisplayed=elementIsDisplayed(dotheywakeupnight);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dotheywakeupnight));
				pageLoad();
			}
			public void clickonHalitosis() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				clickElementUsingJavaScript(Yes6);
				clickElementUsingJavaScript(Yes7);
				clickElementUsingJavaScript(Yes8);
				scrollDownUsingElement(halitosis);
				visibilityOf(halitosis);
				boolean elementIsDisplayed=elementIsDisplayed(halitosis);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(halitosis));
				pageLoad();
			}
			public void clickonDifficultydryfoods() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				clickElementUsingJavaScript(Yes6);
				clickElementUsingJavaScript(Yes7);
				clickElementUsingJavaScript(Yes8);
				clickElementUsingJavaScript(Yes9);
				scrollDownUsingElement(difficultydryfoods);
				visibilityOf(difficultydryfoods);
				boolean elementIsDisplayed=elementIsDisplayed(difficultydryfoods);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(difficultydryfoods));
				pageLoad();
			}
			public void clickonThankYou() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Yes1);
				clickElementUsingJavaScript(Yes1);
				clickElementUsingJavaScript(Yes2);
				clickElementUsingJavaScript(Yes3);
				clickElementUsingJavaScript(Yes4);
				clickElementUsingJavaScript(Yes5);
				clickElementUsingJavaScript(Yes6);
				clickElementUsingJavaScript(Yes7);
				clickElementUsingJavaScript(Yes8);
				clickElementUsingJavaScript(Yes9);
				clickElementUsingJavaScript(Yes10);
				scrollDownUsingElement(thankyou);
				visibilityOf(thankyou);
				boolean elementIsDisplayed=elementIsDisplayed(thankyou);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(thankyou));
				pageLoad();
			}
			public void clickonRelieveSymptomsdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Relievedrymouth);
				clickElementUsingJavaScript(Relievedrymouth);
				visibilityOf(Relievedrymouth_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Relievedrymouth_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Relievedrymouth_txt));
				pageLoad();
			}
			public void clickonLearnaboutSymptoms() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(learnaboutsymptoms);
				clickElementUsingJavaScript(learnaboutsymptoms);
				visibilityOf(learnaboutsymptoms_txt);
				boolean elementIsDisplayed=elementIsDisplayed(learnaboutsymptoms_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(learnaboutsymptoms_txt));
				pageLoad();
			}
			public void clickonFreshenbadBreathe() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(freshenbadbreathe);
				clickElementUsingJavaScript(freshenbadbreathe);
				visibilityOf(freshenbadbreathe_txt);
				boolean elementIsDisplayed=elementIsDisplayed(freshenbadbreathe_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(freshenbadbreathe_txt));
				pageLoad();
			}
	
	
	
	
	
	
	
	

}
