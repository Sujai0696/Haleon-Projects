package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedoihavedrymouthPage extends BaseClass{
	
	public biotenedoihavedrymouthPage() {
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
	
	@FindBy(xpath = "//a[text()='SELF– ASSESSMENT']")
	private static WebElement selfassessment_Breadcrumbs;		
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text first odd grid_12 alpha omega']//child::img[@class='richText-image pull-right']")
	private static WebElement CarouselArrow1;		
	
	@FindBy(xpath = "(//div[@class='box component section quiz-question-box even grid_10 omega']//child::a[text()='YES'])[1]")
	private static WebElement Yes1;	
	
	@FindBy(xpath = "//h2[text()='Do you take two or more medications daily?']")
	private static WebElement Questiontxt1;	
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[1]")
	private static WebElement Yes2;	
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::h2[text()='Does your mouth usually feel dry?']")
	private static WebElement Questiontxt2;	
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::h2[text()='Do you regularly eat or drink to keep your mouth moist?']")
	private static WebElement Questiontxt3;	
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text odd grid_12 alpha omega']//child::a[text()='YES']")
	private static WebElement Yes3;	
	
	@FindBy(xpath = "//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::h2[text()='Do you get thirsty at night and get out of bed to drink fluids?']")
	private static WebElement Questiontxt4;	
	
	@FindBy(xpath = "(//div[@class='richText component section quiz-question-text even grid_12 alpha omega']//child::a[text()='YES'])[2]")
	private static WebElement Yes4;	
	
	@FindBy(xpath = "//div[@class='box component section quiz-question-box even grid_10 omega']//child::h2[text()='Does your mouth usually become drier when you speak?']")
	private static WebElement Questiontxt5;	
	
	@FindBy(xpath = "(//div[@class='box component section quiz-question-box even grid_10 omega']//child::a[text()='YES'])[5]")
	private static WebElement Yes5;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod even grid_4']//child::a[text()='GET COUPONS']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='SHOP NOW']")
	private static WebElement shopnow;
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			public void clickonSelfAssesmentBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(selfassessment_Breadcrumbs);
				pageLoad();
			}
			public void clickonCarousel1() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Questiontxt1);
				//visibilityOf(Questiontxt1);
				boolean elementIsDisplayed=elementIsDisplayed(Questiontxt1);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Questiontxt1));
				clickElementUsingJavaScript(Yes1);
				pageLoad();
			}
			public void clickonCarousel2() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Questiontxt1);
				clickElementUsingJavaScript(Yes1);
				visibilityOf(Questiontxt2);
				boolean elementIsDisplayed=elementIsDisplayed(Questiontxt2);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Questiontxt2));
				clickElementUsingJavaScript(Yes2);
				pageLoad();
			}
			public void clickonCarousel3() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Questiontxt1);
				clickElementUsingJavaScript(Yes1);
				implicitWait();
				clickElementUsingJavaScript(Yes2);
				visibilityOf(Questiontxt3);
				boolean elementIsDisplayed=elementIsDisplayed(Questiontxt3);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Questiontxt3));
				clickElementUsingJavaScript(Yes3);
				pageLoad();
			}
			public void clickonCarousel4() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Questiontxt1);
				clickElementUsingJavaScript(Yes1);
				implicitWait();
				clickElementUsingJavaScript(Yes2);
				implicitWait();
				clickElementUsingJavaScript(Yes3);
				visibilityOf(Questiontxt4);
				boolean elementIsDisplayed=elementIsDisplayed(Questiontxt4);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Questiontxt4));
				clickElementUsingJavaScript(Yes4);
				pageLoad();
			}
			public void clickonCarousel5() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Questiontxt1);
				clickElementUsingJavaScript(Yes1);
				implicitWait();
				clickElementUsingJavaScript(Yes2);
				implicitWait();
				clickElementUsingJavaScript(Yes3);
				implicitWait();
				clickElementUsingJavaScript(Yes4);
				visibilityOf(Questiontxt5);
				boolean elementIsDisplayed=elementIsDisplayed(Questiontxt5);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Questiontxt5));
				clickElementUsingJavaScript(Yes5);
				pageLoad();
			}
			public void clickontakeQuiz() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(takequiz);
				clickElementUsingJavaScript(takequiz);
				pageLoad();
			}
			public void clickongetcoupons() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(getcoupons);
				clickElementUsingJavaScript(getcoupons);
				pageLoad();
			}
			public void clickonShopnow() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(shopnow);
				clickElementUsingJavaScript(shopnow);
				pageLoad();
			}
	
	
	
	
	
	
	
	
	

}
