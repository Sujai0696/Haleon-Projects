package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevahowtostayconfidentcoldsoresPage extends BaseClass{
	
	public AbrevahowtostayconfidentcoldsoresPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section default-style first odd initialized']//a[@href='/managing-lip-health/cold-sore-triggers/']")
	private static WebElement managingliphealth;		
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement managingliphealth_txt;	

	@FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']")
	private static WebElement dealingcoldsore;	


	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsore_txt;	

	@FindBy(xpath = "//a[text()='LIP CARE ']")
	private static WebElement lipcare;	

	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare_txt;

	@FindBy(xpath = "//a[text()='STRESS AND COLD SORES ']")
	private static WebElement stresscoldsore;

	@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
	private static WebElement stresscoldsore_txt;

	@FindBy(xpath = "//a[text()='LIP PROBLEMS ']")
	private static WebElement lipproblem;

	@FindBy(xpath = "//h1[text()='Common Lip Problems']")
	private static WebElement lipproblem_txt;

	@FindBy(xpath = "//a[text()='CAN YOU PUT ALOE VERA ON COLD SORES? ']")
	private static WebElement aloeveracoldsores;

	@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
	private static WebElement aloeveracoldsores_txt;

	@FindBy(xpath = "//a[text()='RECURRING COLD SORES ']")
	private static WebElement recurringcoldsore;

	@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
	private static WebElement recurringcoldsore_txt;
	
	@FindBy(xpath = "//u[text()='Dealing with Cold Sores']")
	private static WebElement dealingwithcoldsores;
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingwithcoldsores_txt;
	
	@FindBy(xpath = "(//strong[text()='1. Wear a chic outfit that gets you compliments'])[1]")
	private static WebElement Banner1_txt;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next1;
	
	@FindBy(xpath = "//div[@class='richText component section spread-carousel-txt first odd last grid_4 omega']//strong")
	private static WebElement Banner2_txt;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next2;
	
	@FindBy(xpath = "(//strong[text()='3. Accessorize with bold jewelry'])[1]")
	private static WebElement Banner3_txt;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next3;
	
	@FindBy(xpath = "(//div[@class='richText component section spread-carousel-txt even last grid_4 omega']//strong)[3]")
	private static WebElement Banner4_txt;
	
	@FindBy(xpath = "//a[text()='as soon as you feel the telling tingle of a cold sore coming on.']")
	private static WebElement tinglecoldsore;
	
	@FindBy(xpath = "//h2[text()='NEARLY 50% OF AMERICAN ADULTS HAVE THE VIRUS THAT CAUSES COLD SORES']")
	private static WebElement tinglecoldsore_txt;
	
	@FindBy(xpath = "//a[text()='GET YOUR ZZZZZZ’S']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//h1[text()='How to Get Better Sleep']")
	private static WebElement RelatedArticle1_txt;
	
	@FindBy(xpath = "//a[text()='TIPS ON HOW TO CONCEAL A COLD SORE']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//h1[text()='How to Cover a Cold Sore with Makeup']")
	private static WebElement RelatedArticle2_txt;
	
	@FindBy(xpath = "//a[text()='LIP CARE VS. LIP HEALTH']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
	private static WebElement RelatedArticle3_txt;
	
	@FindBy(xpath = "//span[text()='TAKE THE QUIZ']")
	private static WebElement quiz;
	
	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement quiz_txt;
	
	@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
	private static WebElement BuyNow;
	
	@FindBy(xpath = "//h2[text()='Oral Care Pump']")
	private static WebElement BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;
	
	
	
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
		public void clickonManagingliphealth() throws Exception {	
			waitForPageLoadJava();
			moveToElement(managingliphealth);
			clickElementUsingJavaScript(managingliphealth);
			visibilityOf(managingliphealth_txt);
			boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managingliphealth_txt));
			pageLoad();
		}	
		public void clickonDealingColdSore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealingcoldsore);
			clickElementUsingJavaScript(dealingcoldsore);
			visibilityOf(dealingcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingcoldsore_txt));
			pageLoad();
		}	
		public void clickonLipCare() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipcare);
			clickElementUsingJavaScript(lipcare);
			visibilityOf(lipcare_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcare_txt));
			pageLoad();
		}	
		public void clickonStressColdsore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(stresscoldsore);
			clickElementUsingJavaScript(stresscoldsore);
			scrollDownUsingElement(stresscoldsore_txt);
			visibilityOf(stresscoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(stresscoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(stresscoldsore_txt));
			pageLoad();
		}	
		public void clickonLipProblem() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipproblem);
			clickElementUsingJavaScript(lipproblem);
			scrollDownUsingElement(lipproblem_txt);
			visibilityOf(lipproblem_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lipproblem_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipproblem_txt));
			pageLoad();
		}	
		public void clickonAloeveracoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aloeveracoldsores);
			clickElementUsingJavaScript(aloeveracoldsores);
			scrollDownUsingElement(aloeveracoldsores_txt);
			visibilityOf(aloeveracoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(aloeveracoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(aloeveracoldsores_txt));
			pageLoad();
		}	
		public void clickonRecurringcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(recurringcoldsore);
			clickElementUsingJavaScript(recurringcoldsore);
			scrollDownUsingElement(recurringcoldsore_txt);
			visibilityOf(recurringcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(recurringcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(recurringcoldsore_txt));
			pageLoad();
		}			
		public void clickonDealingwithcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealingcoldsore);
			clickElementUsingJavaScript(dealingcoldsore);
			scrollDownUsingElement(dealingcoldsore_txt);
			visibilityOf(dealingcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingcoldsore_txt));
			pageLoad();
		}			
		public void clickonBanner1() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Banner1_txt);
			//clickElementUsingJavaScript(next1);
			if (isElementPresent(Banner1_txt)) {
				visibilityOf(Banner1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Banner1_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Banner1_txt));
				pageLoad();
			} else {
				System.out.println("Banner text is not present on Page");
				throw new Exception("Banner text is not present on Page");
			}
			
		}			
		public void clickonBanner2() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Banner1_txt);
			clickElementUsingJavaScript(next1);
			if (isElementPresent(Banner2_txt)) {
				visibilityOf(Banner2_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Banner2_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Banner2_txt));
				pageLoad();
			} else {
				System.out.println("Banner text is not present on Page");
				throw new Exception("Banner text is not present on Page");
			}
			
		}			
		public void clickonBanner3() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Banner1_txt);
			clickElementUsingJavaScript(next1);
			Thread.sleep(1000);
			clickElementUsingJavaScript(next2);
			if (isElementPresent(Banner3_txt)) {
				visibilityOf(Banner3_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Banner3_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Banner3_txt));
				pageLoad();
			} else {
				System.out.println("Banner text is not present on Page");
				throw new Exception("Banner text is not present on Page");
			}
			
		}			
		public void clickonBanner4() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Banner1_txt);
			clickElementUsingJavaScript(next1);
			Thread.sleep(1000);
			clickElementUsingJavaScript(next2);
			Thread.sleep(1000);
			clickElementUsingJavaScript(next3);
			if (isElementPresent(Banner4_txt)) {
				visibilityOf(Banner4_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Banner4_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Banner4_txt));
				pageLoad();
			} else {
				System.out.println("Banner text is not present on Page");
				throw new Exception("Banner text is not present on Page");
			}
			
		}			
		public void clickonTingleColdsore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(tinglecoldsore);
			clickElementUsingJavaScript(tinglecoldsore);
			//scrollDownUsingElement(tinglecoldsore_txt);
			visibilityOf(tinglecoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(tinglecoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(tinglecoldsore_txt));
			pageLoad();
		}	
		public void clickonRelatedArticle1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle1);
			moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle1);
			scrollDownUsingElement(RelatedArticle1_txt);
			visibilityOf(RelatedArticle1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle1_txt));
			pageLoad();
		}	
		public void clickonRelatedArticle2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle2);
			moveToElement(RelatedArticle2);
			clickElementUsingJavaScript(RelatedArticle2);
			scrollDownUsingElement(RelatedArticle2_txt);
			visibilityOf(RelatedArticle2_txt);
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle2_txt));
			pageLoad();
		}	
		public void clickonRelatedArticle3() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(RelatedArticle3);
			moveToElement(RelatedArticle3);
			clickElementUsingJavaScript(RelatedArticle3);
			scrollDownUsingElement(RelatedArticle3_txt);
			visibilityOf(RelatedArticle3_txt);
			boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle3_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(RelatedArticle3_txt));
			pageLoad();
		}	
		public void clickonQuiz() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(quiz);
			moveToElement(quiz);
			clickElementUsingJavaScript(quiz);
			scrollDownUsingElement(quiz_txt);
			visibilityOf(quiz_txt);
			boolean elementIsDisplayed=elementIsDisplayed(quiz_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(quiz_txt));
			pageLoad();
		}	
		public void clickonBuyNow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(BuyNow);
			clickElementUsingJavaScript(BuyNow);
			visibilityOf(BuyNow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(BuyNow_txt));
			clickElementUsingJavaScript(BuyNow_Close);
			pageLoad();
		}
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
