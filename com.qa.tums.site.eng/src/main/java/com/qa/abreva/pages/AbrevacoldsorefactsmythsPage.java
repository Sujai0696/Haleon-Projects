package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsorefactsmythsPage extends BaseClass{
	
	public AbrevacoldsorefactsmythsPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//child::a[text()='ABOUT COLD SORES ']")
	private static WebElement aboutcoldsores;

	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement aboutcoldsores_txt;

	@FindBy(xpath = "//a[text()='HOW COLD SORES SPREAD ']")
	private static WebElement coldsoresspread;

	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement coldsoresspread_txt;

	@FindBy(xpath = "//a[text()='COLD SORE TRIGGERS ']")
	private static WebElement coldsorestriggers;

	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement coldsorestriggers_txt;

	@FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']")
	private static WebElement coldsorestreatment;

	@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt first odd']//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement coldsorestreatment_txt;

	@FindBy(xpath = "//a[@href='/about-cold-sores/cold-sore-facts-and-myths/']")
	private static WebElement coldsorestmyths;

	@FindBy(xpath = "//div[@class='richText component section abreva-text first odd']//h1")
	private static WebElement coldsorestmyths_txt;

	@FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']")
	private static WebElement takecarelips;
	
	@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
	private static WebElement takecarelips_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']")
	private static WebElement coldsorepimple;
	
	@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
	private static WebElement coldsorepimple_txt;
	
	@FindBy(xpath = "//a[text()='TYPES OF COLD SORE MEDICINE ']")
	private static WebElement typescoldsoremedicine;
	
	@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
	private static WebElement typescoldsoremedicine_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']")
	private static WebElement coldsoreteens;
	
	@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
	private static WebElement coldsoreteens_txt;	
	
	@FindBy(xpath = "//a[text()='fighting a cold sore']")
	private static WebElement fightingcoldsore;	
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement fightingcoldsore_txt;	
	
	@FindBy(xpath = "//a[text()='home remedies']")
	private static WebElement homeremedies;	
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement homeremedies_txt;	
	
	@FindBy(xpath = "//a[text()='cold sores']")
	private static WebElement coldsores;	
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement coldsores_txt;
	
	@FindBy(xpath = "//span[text()='Most nonprescription treatments work the same way.']")
	private static WebElement myth1;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth1_Active;
	
	@FindBy(xpath = "//span[text()='Cold sores are only contagious when you can see a blister.']")
	private static WebElement myth2;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth2_active;
	
	@FindBy(xpath = "//span[text()='The cold sore virus (HSV-1) cannot spread beyond the lip area.']")
	private static WebElement myth3;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth3_active;
	
	@FindBy(xpath = "//span[text()='Everyone who contracts the cold sore virus will experience an outbreak.']")
	private static WebElement myth4;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth4_active;
	
	@FindBy(xpath = "//span[text()='There is no way to shorten the healing time of a cold sore.']")
	private static WebElement myth5;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth5_active;
	
	@FindBy(xpath = "//span[text()='Ingredients like camphor, menthol, and phenol can heal a cold sore.']")
	private static WebElement myth6;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth6_active;
	
	@FindBy(xpath = "//span[text()='All nonprescription products are FDA approved to shorten the healing time of a cold sore.']")
	private static WebElement myth7;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth7_active;
	
	@FindBy(xpath = "//span[text()='Ice helps cold sores heal faster.']")
	private static WebElement myth8;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth8_active;
	
	@FindBy(xpath = "//span[text()='Distilled vinegar helps minimize cold sore outbreaks.']")
	private static WebElement myth9;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth9_active;
	
	@FindBy(xpath = "//span[text()='Alcohol or witch hazel can heal your cold sores.']")
	private static WebElement myth10;
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth10_active;
	
	@FindBy(xpath = "//span[text()='Tea bags heal cold sores.']")
	private static WebElement myth11;
	
	
	@FindBy(xpath = "//h3[@class='accordion-title component accordion-head active']")
	private static WebElement myth11_active;
	
	@FindBy(xpath = "//span[text()='WRITE A REVIEW']")
	private static WebElement writereview;
	
	@FindBy(xpath = "//h1[text()='WRITE A REVIEW']")
	private static WebElement writereview_txt;
	
	@FindBy(xpath = "//span[text()='BUY NOW']")
	private static WebElement buynow;
	
	@FindBy(xpath = "//h2[text()='Oral Care Pump']")
	private static WebElement buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buynow_Close;
	
	
	
	
	
	
	
	
	
	
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
		public void clickonAboutcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aboutcoldsores);
			if (isElementPresent(aboutcoldsores)) {
				clickElementUsingJavaScript(aboutcoldsores);
				visibilityOf(aboutcoldsores_txt);
				boolean elementIsDisplayed=elementIsDisplayed(aboutcoldsores_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(aboutcoldsores_txt));
				
			} else {
				throw new Exception("About core sores is not Present on page");
			}
			
		}
		public void clickonColdsoresspread() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoresspread);
			clickElementUsingJavaScript(coldsoresspread);
			visibilityOf(coldsoresspread_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoresspread_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoresspread_txt));
			pageLoad();
		}
		public void clickonColdsorestriggers() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestriggers);
			clickElementUsingJavaScript(coldsorestriggers);
			visibilityOf(coldsorestriggers_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestriggers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestriggers_txt));
			pageLoad();
		}
		public void clickonColdsorestreatment() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestreatment);
			clickElementUsingJavaScript(coldsorestreatment);
			visibilityOf(coldsorestreatment_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestreatment_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestreatment_txt));
			pageLoad();
		}
		public void clickonColdsoresmyths() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestmyths);
			elementToBeClickable(coldsorestmyths);
			//actionClick(coldsorestmyths);
			visibilityOf(coldsorestmyths_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestmyths_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestmyths_txt));
			pageLoad();
		}
		public void clickontakecarelips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(takecarelips);
			clickElementUsingJavaScript(takecarelips);
			scrollDownUsingElement(takecarelips_txt);
			visibilityOf(takecarelips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takecarelips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takecarelips_txt));
			pageLoad();
		}
		public void clickoncoldsorevspimple() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorepimple);
			clickElementUsingJavaScript(coldsorepimple);
			scrollDownUsingElement(coldsorepimple_txt);
			visibilityOf(coldsorepimple_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorepimple_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorepimple_txt));
			pageLoad();
		}
		public void clickontypesofcoldsoresmedicine() throws Exception {	
			waitForPageLoadJava();
			moveToElement(typescoldsoremedicine);
			clickElementUsingJavaScript(typescoldsoremedicine);
			scrollDownUsingElement(typescoldsoremedicine_txt);
			visibilityOf(typescoldsoremedicine_txt);
			boolean elementIsDisplayed=elementIsDisplayed(typescoldsoremedicine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(typescoldsoremedicine_txt));
			pageLoad();
		}
		public void clickonColdsoresteens() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreteens);
			clickElementUsingJavaScript(coldsoreteens);
			scrollDownUsingElement(coldsoreteens_txt);
			visibilityOf(coldsoreteens_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreteens_txt));
			pageLoad();
		}	
		public void clickonfightingcoldsore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(fightingcoldsore);
			clickElementUsingJavaScript(fightingcoldsore);
			visibilityOf(fightingcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(fightingcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fightingcoldsore_txt));
			pageLoad();
		}	
		public void clickonHomeRemedies() throws Exception {	
			waitForPageLoadJava();
			moveToElement(homeremedies);
			clickElementUsingJavaScript(homeremedies);
			visibilityOf(homeremedies_txt);
			boolean elementIsDisplayed=elementIsDisplayed(homeremedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(homeremedies_txt));
			pageLoad();
		}	
		public void clickonColdsore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsores);
			clickElementUsingJavaScript(coldsores);
			visibilityOf(coldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsores_txt));
			pageLoad();
		}	
		public void clickonMyth1() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth1);
			clickElementUsingJavaScript(myth1);
			visibilityOf(myth1_Active);
			boolean elementIsDisplayed=elementIsDisplayed(myth1_Active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth1));
			clickElementUsingJavaScript(myth1);
			pageLoad();
		}	
		public void clickonMyth2() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth2);
			clickElementUsingJavaScript(myth2);
			visibilityOf(myth2_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth2_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth2));
			clickElementUsingJavaScript(myth2);
			pageLoad();
		}	
		public void clickonMyth3() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth3);
			clickElementUsingJavaScript(myth3);
			visibilityOf(myth3_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth3_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth3));
			clickElementUsingJavaScript(myth3);
			pageLoad();
		}	
		public void clickonMyth4() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth4);
			clickElementUsingJavaScript(myth4);
			visibilityOf(myth4_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth4_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth4));
			clickElementUsingJavaScript(myth4);
			pageLoad();
		}	
		public void clickonMyth5() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth5);
			clickElementUsingJavaScript(myth5);
			visibilityOf(myth5_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth5_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth5));
			clickElementUsingJavaScript(myth5);
			pageLoad();
		}	
		public void clickonMyth6() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth6);
			clickElementUsingJavaScript(myth6);
			visibilityOf(myth6_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth6_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth6));
			clickElementUsingJavaScript(myth6);
			pageLoad();
		}	
		public void clickonMyth7() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth7);
			clickElementUsingJavaScript(myth7);
			visibilityOf(myth7_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth7_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth7));
			clickElementUsingJavaScript(myth7);
			pageLoad();
		}	
		public void clickonMyth8() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth8);
			clickElementUsingJavaScript(myth8);
			visibilityOf(myth8_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth8_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth8));
			clickElementUsingJavaScript(myth8);
			pageLoad();
		}	
		public void clickonMyth9() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth9);
			clickElementUsingJavaScript(myth9);
			visibilityOf(myth9_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth9_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth9));
			clickElementUsingJavaScript(myth9);
			pageLoad();
		}	
		public void clickonMyth10() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth10);
			clickElementUsingJavaScript(myth10);
			visibilityOf(myth10_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth10_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth10));
			clickElementUsingJavaScript(myth10);
			pageLoad();
		}	
		public void clickonMyth11() throws Exception {	
			waitForPageLoadJava();
			moveToElement(myth11);
			clickElementUsingJavaScript(myth11);
			visibilityOf(myth11_active);
			boolean elementIsDisplayed=elementIsDisplayed(myth11_active);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(myth11));
			clickElementUsingJavaScript(myth11);
			pageLoad();
		}	
		public void clickonWriteReview() throws Exception {	
			waitForPageLoadJava();
			moveToElement(writereview);
			clickElementUsingJavaScript(writereview);
			visibilityOf(writereview_txt);
			boolean elementIsDisplayed=elementIsDisplayed(writereview_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(writereview_txt));
			pageLoad();
		}	
		public void clickonBuyNow() throws Exception {	
			waitForPageLoadJava();
			moveToElement(buynow);
			clickElementUsingJavaScript(buynow);
			visibilityOf(buynow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(buynow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(buynow_txt));
			clickElementUsingJavaScript(buynow_Close);
			pageLoad();
		}	
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
