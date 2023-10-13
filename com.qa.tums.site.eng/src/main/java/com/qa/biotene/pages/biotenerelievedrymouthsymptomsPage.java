package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenerelievedrymouthsymptomsPage extends BaseClass{
	
	public biotenerelievedrymouthsymptomsPage() {
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
	
	@FindBy(xpath = "//a[text()='FINDING RELIEF FROM DRY MOUTH SYMPTOMS']")
	private static WebElement findingreliefsymptoms_Breadcrumbs;
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//a[@href='/living-with-dry-mouth/how-to-freshen-bad-breath/']")
	private static WebElement bad_breath;
	
	@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active']//a[text()='1']")
	private static WebElement Carousel1;
	
	@FindBy(xpath = "(//div[@class='richText component section symptoms-text even last']//child::h3)[1]")
	private static WebElement Carousel_txt1;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//child::li[@class='carousel-nav-next'])[1]")
	private static WebElement Carousel_next1;
	
	@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active']//a[text()='2']")
	private static WebElement Carousel2;
	
	@FindBy(xpath = "(//div[@class='richText component section symptoms-text even last']//child::h3)[2]")
	private static WebElement Carousel_txt2;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//child::li[@class='carousel-nav-next'])[1]")
	private static WebElement Carousel_next2;
	
	@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active']//a[text()='3']")
	private static WebElement Carousel3;
	
	@FindBy(xpath = "//div[@class='richText component section symptoms-text even last']//h3[text()='Use a room humidifier']")
	private static WebElement Carousel_txt3;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//child::li[@class='carousel-nav-next'])[1]")
	private static WebElement Carousel_next3;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//li[@class='carousel-nav-item is-active'])[1]")
	private static WebElement Carousel4;
	
	@FindBy(xpath = "//div[@class='richText component section symptoms-text even last']//h3[text()='Limit salty or dry foods']")
	private static WebElement Carousel_txt4;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//child::li[@class='carousel-nav-next'])[1]")
	private static WebElement Carousel_next4;
	
	@FindBy(xpath = "(//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active'])[1]")
	private static WebElement Carousel5;
	
	@FindBy(xpath = "//h3[text()='Combine Biotène®']")
	private static WebElement Carousel_txt5;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[text()='READ MORE']")
	private static WebElement Readmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three odd last grid_4 omega']//child::a[text()='READ MORE']")
	private static WebElement Readmore1;
	
	@FindBy(xpath = "//h1[text()='A DRY MOUTH NEEDS MORE THAN JUST WATER']")
	private static WebElement Readmore_txt1;
	
	
	
	
	
	
	
	
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
			public void clickonfindingReliefsymptomsBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(findingreliefsymptoms_Breadcrumbs);
				pageLoad();
			}
			public void clickonbad_breath() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(bad_breath);
				pageLoad();
			}
	
			public void clickonCarouseldot_1() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Carousel1);
				clickElementUsingJavaScript(Carousel1);
				visibilityOf(Carousel_txt1);
				boolean elementIsDisplayed=elementIsDisplayed(Carousel_txt1);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Carousel_txt1));
				pageLoad();
			}
			public void clickonCarouseldot_2() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Carousel2);
				implicitWait();
				clickElementUsingJavaScript(Carousel_next1);
				implicitWait();
				clickElementUsingJavaScript(Carousel2);
				visibilityOf(Carousel_txt2);
				boolean elementIsDisplayed=elementIsDisplayed(Carousel_txt2);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Carousel_txt2));
				pageLoad();
			}
			public void clickonCarouseldot_3() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Carousel3);
				implicitWait();
				clickElementUsingJavaScript(Carousel_next2);
				implicitWait();
				clickElementUsingJavaScript(Carousel3);
				visibilityOf(Carousel_txt3);
				boolean elementIsDisplayed=elementIsDisplayed(Carousel_txt3);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Carousel_txt3));
				pageLoad();
			}
			public void clickonCarouseldot_4() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Carousel4);
				implicitWait();
				clickElementUsingJavaScript(Carousel_next3);
				implicitWait();
				clickElementUsingJavaScript(Carousel4);
				visibilityOf(Carousel_txt4);
				boolean elementIsDisplayed=elementIsDisplayed(Carousel_txt4);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Carousel_txt4));
				pageLoad();
			}
			public void clickonCarouseldot_5() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Carousel5);
				
				clickElementUsingJavaScript(Carousel_next4);
				implicitWait();
				clickElementUsingJavaScript(Carousel5);
//				visibilityOf(Carousel_txt5);
//				boolean elementIsDisplayed=elementIsDisplayed(Carousel_txt5);
//				Assert.assertTrue(elementIsDisplayed);
//				System.out.println(getElementText(Carousel_txt5));
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
			public void clickonReadMore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Readmore);
				clickElementUsingJavaScript(Readmore);
				visibilityOf(Readmore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Readmore_txt));
				pageLoad();
			}
			public void clickonReadMore1() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Readmore1);
				clickElementUsingJavaScript(Readmore1);
				visibilityOf(Readmore_txt1);
				boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt1);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Readmore_txt1));
				pageLoad();
			}
	
	
	
	
	
	
	
	
	
	
	

}
