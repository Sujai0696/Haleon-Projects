package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinSitemapPage extends BaseClass {
	
	public enocoinSitemapPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage sitemap-2-column first odd component col-md-11 col-md-offset-1']//child::a[text()='Home']")
		private static WebElement Home;
		
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage sitemap-2-column first odd component col-md-11 col-md-offset-1']//child::a[text()='All About Acidity']")
		private static WebElement AllaboutAcidity;
	
		@FindBy(xpath = "//h1[text()='All About Acidity']")
		private static WebElement AllaboutAciditytxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Understanding Acidity']")
		private static WebElement understandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Initial symptoms of Acidity']")
		private static WebElement InitialSymptomsAcidity;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement InitialSymptomsAciditytxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Is it Acidity or Indigestion']")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Control Acidity With a Busy Lifestyle']")
		private static WebElement ControlAcidityLifestyle;
	
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement ControlAcidityLifestyletxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Home Remedies for Acidity']")
		private static WebElement HomeRemediesAcidity;
	
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement HomeRemediesAciditytxt;
	
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Dealing with Acidity at Night']")
		private static WebElement  dealingAcidityNight;
		
		@FindBy(xpath = "//strong[text()='Dealing with Acidity at Night']")
		private static WebElement  dealingAcidityNighttxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Constant Acidity']")
		private static WebElement  constantAcidity;
		
		@FindBy(xpath = "//h1[text()='Constant Acidity']")
		private static WebElement  constantAciditytxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Living Life Acidity Free']")
		private static WebElement  livinglifeAcidityFree;
		
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement  livinglifeAcidityFreetxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Is it Acidity, Reflux or GERD']")
		private static WebElement  AcidityorRefluxorgerd;
		
		@FindBy(xpath = "//h2[text()='Understanding The Types Of Acidity Problems And Its Remedies']")
		private static WebElement  AcidityorRefluxorgerdtxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='ENO Products']")
		private static WebElement  EnoProducts;
		
		@FindBy(xpath = "//h1[text()='ENO Products']")
		private static WebElement  EnoProductstxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='ENO Fruit Salt (Sachet)']")
		private static WebElement  EnoFruitSalt;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement  EnoFruitSalttxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='ENO Fruit Salt (Bottle)']")
		private static WebElement  EnoFruitSaltBottle;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement  EnoFruitSaltBottletxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Contact Us']")
		private static WebElement  contactus;
		
		@FindBy(xpath = "//h1[text()='Contact Us']")
		private static WebElement  contactustxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='FAQs']")
		private static WebElement  FAQs;
		
		@FindBy(xpath = "//h1[text()='Frequently Asked Questions']")
		private static WebElement  FAQstxt;
		
		@FindBy(xpath = "//a[text()='Privacy Policy']")
		private static WebElement  privacypolicy;
		
		@FindBy(xpath = "//a[text()='Terms of Use']")
		private static WebElement  termsuse;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Heartburn During Pregnancy']")
		private static WebElement  HeartBurnDuringPregancy;
		
		@FindBy(xpath = "//h1[text()='Heartburn']")
		private static WebElement  HeartBurnDuringPregancytxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Acid Reflux in Babies and Children']")
		private static WebElement  AcidRefluxBabies;
		
		@FindBy(xpath = "//h1[text()='Acid Re flux In']")
		private static WebElement  AcidRefluxBabiestxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Diwali, Ramzan and Acidity']")
		private static WebElement  DiwaliRamzan;
		
		@FindBy(xpath = "//strong[text()='Diwali, Ramzan And Acidity']")
		private static WebElement  DiwaliRamzantxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Why Does Your Stomach Hurt?']")
		private static WebElement  whydoesstomachheart;
		
		@FindBy(xpath = "//strong[text()='Why Does Your Stomach Hurt?']")
		private static WebElement  whydoesstomachhearttxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Understanding Digestive Wellness']")
		private static WebElement  UnderstandingDigestiveWellness;
		
		@FindBy(xpath = "//strong[text()='Understanding ']")
		private static WebElement  UnderstandingDigestiveWellnesstxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Foods That Improve Digestion']")
		private static WebElement  foodImproveDigestion;
		
		@FindBy(xpath = "//h1[text()='Foods That Improve Digestion']")
		private static WebElement  foodImproveDigestiontxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Home Remedies For Indigestion']")
		private static WebElement  homeRemediesIndigestion;
		
		@FindBy(xpath = "//strong[text()='Home Remedies for Indigestion']")
		private static WebElement  homeRemediesIndigestiontxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='Gas Relief']")
		private static WebElement  gasRelief;
		
		@FindBy(xpath = "//h1[text()='Gas Relief']")
		private static WebElement  gasRelieftxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override no-banner-padding-top sitemap first odd col-xs-11']//child::a[text()='What is ENO?']")
		private static WebElement  whatisEno;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement  whatisEnotxt;
		
		@FindBy(xpath = "//a[text()='The ENO Journey']")
		private static WebElement  enojourney;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement  enojourneytxt;
		
		@FindBy(xpath = "//a[text()='Current Campaigns']")
		private static WebElement  currentCampaigns;
	
		@FindBy(xpath = "//h2[text()='ENO Senapati']")
		private static WebElement  currentCampaignstxt;
	
		
		
		
	
		//Methods//
		
		public void clickonHome() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Home);
		pageLoad();
		}
		public void clickonAllaboutAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(AllaboutAcidity);
			boolean elementIsDisplayed=elementIsDisplayed(AllaboutAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AllaboutAciditytxt));
			pageLoad();
			}
		public void clickonUnderstandingAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(understandingAcidity);
			boolean elementIsDisplayed=elementIsDisplayed(understandingAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(understandingAciditytxt));
			pageLoad();
			}
		public void clickonInitialSymptomsAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(InitialSymptomsAcidity);
			boolean elementIsDisplayed=elementIsDisplayed(InitialSymptomsAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(InitialSymptomsAciditytxt));
			pageLoad();
			}
		public void clickonAcidityorIndigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(AcidityorIndigestion);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidityorIndigestiontxt));
			pageLoad();
			}
		public void clickonControlAcidityLifestyle() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(ControlAcidityLifestyle);
			boolean elementIsDisplayed=elementIsDisplayed(ControlAcidityLifestyletxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ControlAcidityLifestyletxt));
			pageLoad();
			}
		public void clickonHomeRemediesAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(HomeRemediesAcidity);
			boolean elementIsDisplayed=elementIsDisplayed(HomeRemediesAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HomeRemediesAciditytxt));
			pageLoad();
			}
		public void clickonDealingAcidityNight() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(dealingAcidityNight);
			boolean elementIsDisplayed=elementIsDisplayed(dealingAcidityNighttxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingAcidityNighttxt));
			pageLoad();
			}
		public void clickonConstantAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(constantAcidity);
			boolean elementIsDisplayed=elementIsDisplayed(constantAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(constantAciditytxt));
			pageLoad();
			}
		public void clickonLivinglifeAcidityfree() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(livinglifeAcidityFree);
			boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityFreetxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(livinglifeAcidityFreetxt));
			pageLoad();
			}
		public void clickonAcidityorRefluxorGerd() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(AcidityorRefluxorgerd);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityorRefluxorgerdtxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidityorRefluxorgerdtxt));
			pageLoad();
			}
		public void clickonEnoProducts() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(EnoProducts);
			boolean elementIsDisplayed=elementIsDisplayed(EnoProductstxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(EnoProductstxt));
			pageLoad();
			}
		public void clickonEnoFruitSalt() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(EnoFruitSalt);
			boolean elementIsDisplayed=elementIsDisplayed(EnoFruitSalttxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(EnoFruitSalttxt));
			pageLoad();
			}
		public void clickonEnoFruitSaltBottle() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(EnoFruitSaltBottle);
			boolean elementIsDisplayed=elementIsDisplayed(EnoFruitSaltBottletxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(EnoFruitSaltBottletxt));
			pageLoad();
			}
		public void clickonContactUs() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(contactus);
			boolean elementIsDisplayed=elementIsDisplayed(contactustxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(contactustxt));
			pageLoad();
			}
		public void clickonFAQs() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(FAQs);
			boolean elementIsDisplayed=elementIsDisplayed(FAQstxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(FAQstxt));
			pageLoad();
			}
		public void clickonPrivacyPolicy() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(privacypolicy);
			clickElementUsingJavaScript(privacypolicy);
			pageLoad();
			
		}
		public void clickonTermsUse() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(termsuse);
			clickElementUsingJavaScript(termsuse);
			pageLoad();
			
		}
		public void clickonHeartBurnDuringPregancy() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(HeartBurnDuringPregancy);
			boolean elementIsDisplayed=elementIsDisplayed(HeartBurnDuringPregancytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HeartBurnDuringPregancytxt));
			pageLoad();
			}
		public void clickonAcidRefluxBabies() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(AcidRefluxBabies);
			boolean elementIsDisplayed=elementIsDisplayed(AcidRefluxBabiestxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidRefluxBabiestxt));
			pageLoad();
			}
		public void clickonDiwaliRamazan() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(DiwaliRamzan);
			boolean elementIsDisplayed=elementIsDisplayed(DiwaliRamzantxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(DiwaliRamzantxt));
			pageLoad();
			}
		public void clickonWhydoesStomachHeart() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(whydoesstomachheart);
			boolean elementIsDisplayed=elementIsDisplayed(whydoesstomachhearttxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whydoesstomachhearttxt));
			pageLoad();
			}
		public void clickonUnderstandingDigestiveWellness() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(UnderstandingDigestiveWellness);
			boolean elementIsDisplayed=elementIsDisplayed(UnderstandingDigestiveWellnesstxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(UnderstandingDigestiveWellnesstxt));
			pageLoad();
			}
		public void clickonFoodThatImproveDigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(foodImproveDigestion);
			boolean elementIsDisplayed=elementIsDisplayed(foodImproveDigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(foodImproveDigestiontxt));
			pageLoad();
			}
		public void clickonHomeRemediesIndigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(homeRemediesIndigestion);
			boolean elementIsDisplayed=elementIsDisplayed(homeRemediesIndigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(homeRemediesIndigestiontxt));
			pageLoad();
			}
		public void clickonGasRelief() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(gasRelief);
			boolean elementIsDisplayed=elementIsDisplayed(gasRelieftxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(gasRelieftxt));
			pageLoad();
			}
		public void clickonwhatisEno() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(whatisEno);
			boolean elementIsDisplayed=elementIsDisplayed(whatisEnotxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whatisEnotxt));
			pageLoad();
			}
		public void clickonEnoJourney() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(enojourney);
			boolean elementIsDisplayed=elementIsDisplayed(enojourneytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(enojourneytxt));
			pageLoad();
			}
		public void clickonCurrentCampaigns() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(currentCampaigns);
			boolean elementIsDisplayed=elementIsDisplayed(currentCampaignstxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(currentCampaignstxt));
			pageLoad();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
