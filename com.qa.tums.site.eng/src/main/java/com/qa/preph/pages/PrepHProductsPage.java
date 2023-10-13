package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHProductsPage extends BaseClass{
	
	public PrepHProductsPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
//	@FindBy(xpath = "//a[text()='Homepage (US)']")
//	private static WebElement HomeBreadcrumbs;			
//	
	@FindBy(xpath = "(//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[text()='Medicated Wipes'])[1]")
	private static WebElement medicatedwipes;		
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatedwipes_txt;
	
	@FindBy(xpath = "//img[@title='Medicated Wipes']")
	private static WebElement medicatedwipes_img;
	
	@FindBy(xpath = "//button[@id='medicated-wipes-link']")
	private static WebElement medicatedwipes_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style first odd col-xs-12 reference-medicated-wipes']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement medicatedwipes_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Medicated Wipes 2PK 96 ct']")
	private static WebElement medicatedwipes_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement medicatedwipes_buynow_close;
	
	@FindBy(xpath = "//a[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscream;
	
	@FindBy(xpath = "//img[@title='Multi- Symptom Cream']")
	private static WebElement multisymptomscream_img;
	
	@FindBy(xpath = "//button[@id='multi-cream-link']")
	private static WebElement multisymptomscream_learnmore;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscream_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-12 reference-multi-symptom-cream']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement multisymptomscream_Buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H  Multi-Symptom Cream 1.8 oz']")
	private static WebElement multisymptomscream_Buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement multisymptomscream_Buynow_Close;
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointment;
	
	@FindBy(xpath = "//img[@title='Ointment']")
	private static WebElement ointment_img;
	
	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement ointment_txt;
	
	@FindBy(xpath = "//button[@id='oinment-link']")
	private static WebElement ointment_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style odd col-xs-12 reference-ointment']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement ointment_BuyNow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Ointment 2 oz']")
	private static WebElement ointment_BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement ointment_BuyNow_close;
	
	@FindBy(xpath = "//a[text()='Totables']")
	private static WebElement totables;
	
	@FindBy(xpath = "//img[@title='Totables']")
	private static WebElement totables_img;
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement totables_txt;
	
	@FindBy(xpath = "//button[@id='totables-link']")
	private static WebElement totables_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-12 reference-totables']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement totables_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Rapid Relief Totables w. Lidocaine 20 ct']")
	private static WebElement totables_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement totables_buynow_close;
	
	@FindBy(xpath = "//a[text()='Cooling Gel']")
	private static WebElement coolinggel;
	
	@FindBy(xpath = "//img[@title='Cooling Gel']")
	private static WebElement coolinggel_img;
	
	@FindBy(xpath = "//button[@id='cooling-gel-link']")
	private static WebElement coolinggel_learnmore;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolinggel_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style odd col-xs-12 reference-cooling-gel']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement coolinggel_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Cooling Gel 1.8 oz']")
	private static WebElement coolinggel_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement coolinggel_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/preparation-h-medicated-wipes-women/']")
	private static WebElement medicatedwipeswomen;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen_txt;
	
	@FindBy(xpath = "//img[@title='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen_img;
	
	@FindBy(xpath = "//button[@id='medicated-wipes-women-link']")
	private static WebElement medicatedwipeswomen_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-12 reference-medicated-wipes-women']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement medicatedwipeswomen_Buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Medicated Wipes for Women 48CT']")
	private static WebElement medicatedwipeswomen_Buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement medicatedwipeswomen_Buynow_close;
	
	@FindBy(xpath = "//a[text()='Suppositories']")
	private static WebElement suppositories;
	
	@FindBy(xpath = "//img[@title='Suppositories']")
	private static WebElement suppositories_img;
	
	@FindBy(xpath = "//button[@id='suppositories-link']")
	private static WebElement suppositories_learnmore;
	
	@FindBy(xpath = "//h1[text()='Suppositories']")
	private static WebElement suppositories_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style odd last col-xs-12 reference-suppositories']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement suppositories_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Suppositories 48 ct']")
	private static WebElement suppositories_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement suppositories_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/soothing-relief-spray/']")
	private static WebElement soothingreliefcoolingspray;
	
	@FindBy(xpath = "//img[@title='Soothing Relief Cooling Spray']")
	private static WebElement soothingreliefcoolingspray_img;
	
	@FindBy(xpath = "//h1[text()='Soothing Relief Cooling Spray']")
	private static WebElement soothingreliefcoolingspray_txt;
	
	@FindBy(xpath = "//button[@id='soothing-relief-spray-link']")
	private static WebElement soothingreliefcoolingspray_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style first odd col-xs-12 reference-soothing-relief-spray']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement soothingreliefcoolingspray_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Soothing Relief Cleansing & Cooling Wipes 60 ct']")
	private static WebElement soothingreliefcoolingspray_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement soothingreliefcoolingspray_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/soothing-relief-cleansing-cooling-wipes/']")
	private static WebElement soothingcleansingcoolingwipes;
	
	@FindBy(xpath = "//img[@title='Soothing Relief Cleansing & Cooling Wipes']")
	private static WebElement soothingcleansingcoolingwipes_img;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement soothingcleansingcoolingwipes_txt;
	
	@FindBy(xpath = "//button[@id='soothing-relief-wipes-link']")
	private static WebElement soothingcleansingcoolingwipes_learnmore;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-12 reference-soothing-relief-cleansing-cooling-wipes']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement soothingcleansingcoolingwipes_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Soothing Relief Cleansing & Cooling Wipes 180 ct (3x60)']")
	private static WebElement soothingcleansingcoolingwipes_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement soothingcleansingcoolingwipes_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/soothing-relief-anti-itch-cream/']")
	private static WebElement soothingreliefantiitchingcream;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement soothingreliefantiitchingcream_txt;
	
	@FindBy(xpath = "//button[@id='soothing-relief-cream-link']")
	private static WebElement soothingreliefantiitchingcream_learnmore;
	
	@FindBy(xpath = "//img[@alt='Soothing Relief Anti-Itch Cream']")
	private static WebElement soothingreliefantiitchingcream_img;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style odd last col-xs-12 reference-soothing-relief-anti-itch-cream']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement soothingreliefantiitchingcream_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Soothing Relief Anti Itch Cream .9 oz']")
	private static WebElement soothingreliefantiitchingcream_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement soothingreliefantiitchingcream_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/rapid-relief-spray-with-lidocaine/']")
	private static WebElement lidocaine;
	
	@FindBy(xpath = "//button[@id='rapid-relief-spray-link']")
	private static WebElement lidocaine_learnmore;
	
	@FindBy(xpath = "//div[@class='image component section hoverbg rapid-relief first odd col-xs-12']//img[@title='Rapid Relief Spray with Lidocaine']")
	private static WebElement lidocaine_img;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement lidocaine_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style first odd col-xs-12 reference-rapid-relief-with-lidocaine-spray']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement lidocaine_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Soothing Relief Cleansing & Cooling Wipes 180 ct (3x60)']")
	private static WebElement lidocaine_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement lidocaine_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/rapid-relief-wipes/']")
	private static WebElement totableswipes;
	
	@FindBy(xpath = "//img[@title='Rapid Relief Totables Wipes']")
	private static WebElement totableswipes_img;
	
	@FindBy(xpath = "//button[@id='rapid-relief-wipes-link']")
	private static WebElement totableswipes_learnmore;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Totables Wipes']")
	private static WebElement totableswipes_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style even col-xs-12 reference-rapid-relief-totables-wipes']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement totableswipes_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Totables Wipes 10 ct']")
	private static WebElement totableswipes_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement totableswipes_buynow_close;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-2 text-center-d text-center-m related-article-head even col-xs-12']//a[@href='/products/rapid-relief-with-lidocaine-cream/']")
	private static WebElement lidocainecream;
	
	@FindBy(xpath = "//img[@title='Rapid Relief with Lidocaine Cream']")
	private static WebElement lidocainecream_img;
	
	@FindBy(xpath = "//button[@id='rapid-relief-cream-link']")
	private static WebElement lidocainecream_learnmore;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief with Lidocaine Cream']")
	private static WebElement lidocainecream_txt;
	
	@FindBy(xpath = "//div[@class='snippetReference component section default-style odd last col-xs-12 reference-rapid-relief-with-lidocaine-cream']//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement lidocainecream_buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Rapid Relief with Lidocaine Cream 1 oz']")
	private static WebElement lidocainecream_buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement lidocainecream_buynow_close;
	
	@FindBy(xpath = "//a[@id='getrelieflink']")
	private static WebElement getrelief;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement getrelief_txt;
	
	
	
	
	
	
	
	
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
		
		
//			public void clickonHomeBreadcrumbs() throws Exception{
//		    	waitForPageLoadJava();
//				//moveToElement(HomeBreadcrumbs);
//				if (isElementPresent(HomeBreadcrumbs)) {
//					clickElementUsingJavaScript(HomeBreadcrumbs);
//					pageLoad();
//				} else {
//					throw new Exception("HomeBreadcrumbs are not Present on Page");
//				}
//				
//			}	
			public void clickonMedicatedWipes() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(medicatedwipes);
				moveToElement(medicatedwipes);
				if (isElementPresent(medicatedwipes)) {
					visibilityOf(medicatedwipes_img);
					boolean elementIsDisplayed=elementIsDisplayed(medicatedwipes_img);
					Assert.assertTrue(elementIsDisplayed(medicatedwipes_img));
					clickElementUsingJavaScript(medicatedwipes_learnmore);
					visibilityOf(medicatedwipes_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(medicatedwipes_txt);
					Assert.assertTrue(elementIsDisplayed(medicatedwipes_txt));
					System.out.println(getElementText(medicatedwipes_txt));
					pageLoad();
				} else {
					throw new Exception("Medicated Wipes are not Present on Page");
				}
				
			}	
			public void clickonMedicatedwipes_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(medicatedwipes_buynow);
				moveToElement(medicatedwipes_buynow);
				if (isElementPresent(medicatedwipes_buynow)) {
					clickElementUsingJavaScript(medicatedwipes_buynow);
					visibilityOf(medicatedwipes_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(medicatedwipes_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(medicatedwipes_buynow_txt));
					System.out.println(getElementText(medicatedwipes_buynow_txt));
					clickElementUsingJavaScript(medicatedwipes_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Medicated wipes BuyNow are not Present on Page");
				}
				
			}	
			public void clickonMultisymptomscream() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(multisymptomscream);
				moveToElement(multisymptomscream);
				if (isElementPresent(multisymptomscream)) {
					visibilityOf(multisymptomscream_img);
					boolean elementIsDisplayed=elementIsDisplayed(multisymptomscream_img);
					Assert.assertTrue(elementIsDisplayed(multisymptomscream_img));
					clickElementUsingJavaScript(multisymptomscream_learnmore);
					visibilityOf(multisymptomscream_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(multisymptomscream_txt);
					Assert.assertTrue(elementIsDisplayed(multisymptomscream_txt));
					System.out.println(getElementText(multisymptomscream_txt));
					pageLoad();
				} else {
					throw new Exception("multisymptomscream are not Present on Page");
				}
				
			}	
			public void clickonMultisymptomscream_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(multisymptomscream_Buynow);
				moveToElement(multisymptomscream_Buynow);
				if (isElementPresent(multisymptomscream_Buynow)) {
					clickElementUsingJavaScript(multisymptomscream_Buynow);
					visibilityOf(multisymptomscream_Buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(multisymptomscream_Buynow_txt);
					Assert.assertTrue(elementIsDisplayed(multisymptomscream_Buynow_txt));
					System.out.println(getElementText(multisymptomscream_Buynow_txt));
					clickElementUsingJavaScript(multisymptomscream_Buynow_Close);
					pageLoad();
				} else {
					throw new Exception("Multi Symptoms Creame BuyNow are not Present on Page");
				}
				
			}	
			public void clickonOintment() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(ointment);
				moveToElement(ointment);
				if (isElementPresent(ointment)) {
					visibilityOf(ointment_img);
					boolean elementIsDisplayed=elementIsDisplayed(ointment_img);
					Assert.assertTrue(elementIsDisplayed(ointment_img));
					clickElementUsingJavaScript(ointment_learnmore);
					visibilityOf(ointment_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(ointment_txt);
					Assert.assertTrue(elementIsDisplayed(ointment_txt));
					System.out.println(getElementText(ointment_txt));
					pageLoad();
				} else {
					throw new Exception("Ointment are not Present on Page");
				}
				
			}	
			public void clickonOintment_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(ointment_BuyNow);
				moveToElement(ointment_BuyNow);
				if (isElementPresent(ointment_BuyNow)) {
					clickElementUsingJavaScript(ointment_BuyNow);
					visibilityOf(ointment_BuyNow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(ointment_BuyNow_txt);
					Assert.assertTrue(elementIsDisplayed(ointment_BuyNow_txt));
					System.out.println(getElementText(ointment_BuyNow_txt));
					clickElementUsingJavaScript(ointment_BuyNow_close);
					pageLoad();
				} else {
					throw new Exception("Ointment BuyNow are not Present on Page");
				}
				
			}	
			public void clickontotables() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(totables);
				moveToElement(totables);
				if (isElementPresent(totables)) {
					visibilityOf(totables_img);
					boolean elementIsDisplayed=elementIsDisplayed(totables_img);
					Assert.assertTrue(elementIsDisplayed(totables_img));
					clickElementUsingJavaScript(totables_learnmore);
					visibilityOf(totables_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(totables_txt);
					Assert.assertTrue(elementIsDisplayed(totables_txt));
					System.out.println(getElementText(totables_txt));
					pageLoad();
				} else {
					throw new Exception("Totables are not Present on Page");
				}
				
			}	
			public void clickonTotables_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(totables_buynow);
				moveToElement(totables_buynow);
				if (isElementPresent(totables_buynow)) {
					clickElementUsingJavaScript(totables_buynow);
					visibilityOf(totables_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(totables_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(totables_buynow_txt));
					System.out.println(getElementText(totables_buynow_txt));
					clickElementUsingJavaScript(totables_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Totables BuyNow are not Present on Page");
				}
				
			}	
			public void clickonCoolinggel() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(coolinggel);
				moveToElement(coolinggel);
				if (isElementPresent(coolinggel)) {
					visibilityOf(coolinggel_img);
					boolean elementIsDisplayed=elementIsDisplayed(coolinggel_img);
					Assert.assertTrue(elementIsDisplayed(coolinggel_img));
					clickElementUsingJavaScript(coolinggel_learnmore);
					visibilityOf(coolinggel_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(coolinggel_txt);
					Assert.assertTrue(elementIsDisplayed(coolinggel_txt));
					System.out.println(getElementText(coolinggel_txt));
					pageLoad();
				} else {
					throw new Exception("Cooling gel are not Present on Page");
				}
				
			}	
			public void clickonCoolingel_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(coolinggel_buynow);
				moveToElement(coolinggel_buynow);
				if (isElementPresent(totables_buynow)) {
					clickElementUsingJavaScript(totables_buynow);
					visibilityOf(totables_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(totables_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(totables_buynow_txt));
					System.out.println(getElementText(totables_buynow_txt));
					clickElementUsingJavaScript(totables_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Totables BuyNow are not Present on Page");
				}
				
			}	
			public void clickonMedicatedwipeswomen() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(medicatedwipeswomen);
				moveToElement(medicatedwipeswomen);
				if (isElementPresent(medicatedwipeswomen)) {
					visibilityOf(medicatedwipeswomen_img);
					boolean elementIsDisplayed=elementIsDisplayed(medicatedwipeswomen_img);
					Assert.assertTrue(elementIsDisplayed(medicatedwipeswomen_img));
					clickElementUsingJavaScript(medicatedwipeswomen_learnmore);
					visibilityOf(medicatedwipeswomen_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(medicatedwipeswomen_txt);
					Assert.assertTrue(elementIsDisplayed(medicatedwipeswomen_txt));
					System.out.println(getElementText(medicatedwipeswomen_txt));
					pageLoad();
				} else {
					throw new Exception("Medicatedwipeswomen are not Present on Page");
				}
				
			}	
			public void clickonMedicatedwipeswomen_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(medicatedwipes_buynow);
				moveToElement(medicatedwipes_buynow);
				if (isElementPresent(medicatedwipes_buynow)) {
					clickElementUsingJavaScript(medicatedwipes_buynow);
					visibilityOf(medicatedwipes_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(medicatedwipes_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(medicatedwipes_buynow_txt));
					System.out.println(getElementText(medicatedwipes_buynow_txt));
					clickElementUsingJavaScript(medicatedwipes_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Medicated wipes women BuyNow are not Present on Page");
				}
				
			}	
			public void clickonSuppostories() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(suppositories);
				moveToElement(suppositories);
				if (isElementPresent(suppositories)) {
					visibilityOf(suppositories_img);
					boolean elementIsDisplayed=elementIsDisplayed(suppositories_img);
					Assert.assertTrue(elementIsDisplayed(suppositories_img));
					clickElementUsingJavaScript(suppositories_learnmore);
					visibilityOf(suppositories_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(suppositories_txt);
					Assert.assertTrue(elementIsDisplayed(suppositories_txt));
					System.out.println(getElementText(suppositories_txt));
					pageLoad();
				} else {
					throw new Exception("Suppostories are not Present on Page");
				}
				
			}	
			public void clickonSuppostories_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(suppositories_buynow);
				moveToElement(suppositories_buynow);
				if (isElementPresent(suppositories_buynow)) {
					clickElementUsingJavaScript(suppositories_buynow);
					visibilityOf(suppositories_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(suppositories_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(suppositories_buynow_txt));
					System.out.println(getElementText(suppositories_buynow_txt));
					clickElementUsingJavaScript(suppositories_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Suppostories BuyNow are not Present on Page");
				}
				
			}	
			public void clickonsoothingReliefcoolingsparay() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingreliefcoolingspray);
				moveToElement(soothingreliefcoolingspray);
				if (isElementPresent(soothingreliefcoolingspray_img)) {
					visibilityOf(soothingreliefcoolingspray_img);
					boolean elementIsDisplayed=elementIsDisplayed(soothingreliefcoolingspray_img);
					Assert.assertTrue(elementIsDisplayed(soothingreliefcoolingspray_img));
					clickElementUsingJavaScript(soothingreliefcoolingspray_learnmore);
					visibilityOf(soothingreliefcoolingspray_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(soothingreliefcoolingspray_txt);
					Assert.assertTrue(elementIsDisplayed(soothingreliefcoolingspray_txt));
					System.out.println(getElementText(soothingreliefcoolingspray_txt));
					pageLoad();
				} else {
					throw new Exception("soothing relief cooling spray are not Present on Page");
				}
				
			}	
			public void clickonSoothingReliefcoolingspray_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingreliefcoolingspray_buynow);
				moveToElement(soothingreliefcoolingspray_buynow);
				if (isElementPresent(soothingreliefcoolingspray_buynow)) {
					clickElementUsingJavaScript(soothingreliefcoolingspray_buynow);
					visibilityOf(soothingreliefcoolingspray_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(soothingreliefcoolingspray_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(soothingreliefcoolingspray_buynow_txt));
					System.out.println(getElementText(soothingreliefcoolingspray_buynow_txt));
					clickElementUsingJavaScript(soothingreliefcoolingspray_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Soothing Relief cooling spray BuyNow are not Present on Page");
				}
				
			}
			public void clickonSoothingreliefcleansingspray() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingcleansingcoolingwipes);
				moveToElement(soothingcleansingcoolingwipes);
				if (isElementPresent(soothingcleansingcoolingwipes_img)) {
					visibilityOf(soothingcleansingcoolingwipes_img);
					boolean elementIsDisplayed=elementIsDisplayed(soothingcleansingcoolingwipes_img);
					Assert.assertTrue(elementIsDisplayed(soothingcleansingcoolingwipes_img));
					clickElementUsingJavaScript(soothingcleansingcoolingwipes_learnmore);
					visibilityOf(soothingcleansingcoolingwipes_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(soothingcleansingcoolingwipes_txt);
					Assert.assertTrue(elementIsDisplayed(soothingcleansingcoolingwipes_txt));
					System.out.println(getElementText(soothingcleansingcoolingwipes_txt));
					pageLoad();
				} else {
					throw new Exception("soothingcleansingcoolingwipes_ are not Present on Page");
				}
				
			}	
			public void clickonSoothingReliefcleansingspray_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingcleansingcoolingwipes_buynow);
				moveToElement(soothingcleansingcoolingwipes_buynow);
				if (isElementPresent(soothingcleansingcoolingwipes_buynow)) {
					clickElementUsingJavaScript(soothingcleansingcoolingwipes_buynow);
					visibilityOf(soothingcleansingcoolingwipes_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(soothingcleansingcoolingwipes_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(soothingcleansingcoolingwipes_buynow_txt));
					System.out.println(getElementText(soothingcleansingcoolingwipes_buynow_txt));
					clickElementUsingJavaScript(soothingcleansingcoolingwipes_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Soothing Relief cleansing spray BuyNow are not Present on Page");
				}
				
			}
			public void clickonSoothingreliefantiitchingcream() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingreliefantiitchingcream);
				moveToElement(soothingreliefantiitchingcream);
				if (isElementPresent(soothingreliefantiitchingcream_img)) {
					visibilityOf(soothingreliefantiitchingcream_img);
					boolean elementIsDisplayed=elementIsDisplayed(soothingreliefantiitchingcream_img);
					Assert.assertTrue(elementIsDisplayed(soothingreliefantiitchingcream_img));
					clickElementUsingJavaScript(soothingreliefantiitchingcream_learnmore);
					visibilityOf(soothingreliefantiitchingcream_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(soothingreliefantiitchingcream_txt);
					Assert.assertTrue(elementIsDisplayed(soothingreliefantiitchingcream_txt));
					System.out.println(getElementText(soothingreliefantiitchingcream_txt));
					pageLoad();
				} else {
					throw new Exception("soothingreliefantiitchingcream_txt_ are not Present on Page");
				}
				
			}	
			public void clickonSoothingReliefantiitchcream_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(soothingreliefantiitchingcream_buynow);
				moveToElement(soothingreliefantiitchingcream_buynow);
				if (isElementPresent(soothingreliefantiitchingcream_buynow)) {
					clickElementUsingJavaScript(soothingreliefantiitchingcream_buynow);
					visibilityOf(soothingreliefantiitchingcream_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(soothingreliefantiitchingcream_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(soothingreliefantiitchingcream_buynow_txt));
					System.out.println(getElementText(soothingreliefantiitchingcream_buynow_txt));
					clickElementUsingJavaScript(soothingreliefantiitchingcream_buynow_close);
					pageLoad();
				} else {
					throw new Exception("soothingreliefantiitchingcream BuyNow are not Present on Page");
				}
				
			}
			public void clickonLidocaine() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(lidocaine);
				moveToElement(lidocaine);
				if (isElementPresent(lidocaine_img)) {
					visibilityOf(lidocaine_img);
					boolean elementIsDisplayed=elementIsDisplayed(lidocaine_img);
					Assert.assertTrue(elementIsDisplayed(lidocaine_img));
					clickElementUsingJavaScript(lidocaine_learnmore);
					visibilityOf(lidocaine_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(lidocaine_txt);
					Assert.assertTrue(elementIsDisplayed(lidocaine_txt));
					System.out.println(getElementText(lidocaine_txt));
					pageLoad();
				} else {
					throw new Exception("lidocaine_txt are not Present on Page");
				}
				
			}	
			public void clickonlidocaine_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(lidocaine_buynow);
				moveToElement(lidocaine_buynow);
				if (isElementPresent(lidocaine_buynow)) {
					clickElementUsingJavaScript(lidocaine_buynow);
					visibilityOf(lidocaine_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lidocaine_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(lidocaine_buynow_txt));
					System.out.println(getElementText(lidocaine_buynow_txt));
					clickElementUsingJavaScript(lidocaine_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Lidocaine BuyNow are not Present on Page");
				}
				
			}
			public void clickontotableswipes() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(totableswipes);
				moveToElement(totableswipes);
				if (isElementPresent(totableswipes_img)) {
					visibilityOf(totableswipes_img);
					boolean elementIsDisplayed=elementIsDisplayed(totableswipes_img);
					Assert.assertTrue(elementIsDisplayed(totableswipes_img));
					clickElementUsingJavaScript(totableswipes_learnmore);
					visibilityOf(totableswipes_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(totableswipes_txt);
					Assert.assertTrue(elementIsDisplayed(totableswipes_txt));
					System.out.println(getElementText(totableswipes_txt));
					pageLoad();
				} else {
					throw new Exception("totableswipes_txt are not Present on Page");
				}
				
			}	
			public void clickonTotableswipes_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(totableswipes_buynow);
				moveToElement(totableswipes_buynow);
				if (isElementPresent(totableswipes_buynow)) {
					clickElementUsingJavaScript(totableswipes_buynow);
					visibilityOf(totableswipes_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(totableswipes_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(totableswipes_buynow_txt));
					System.out.println(getElementText(totableswipes_buynow_txt));
					clickElementUsingJavaScript(totableswipes_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Totable wipes BuyNow are not Present on Page");
				}
				
			}
			public void clickonlidocainecream() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(lidocainecream);
				moveToElement(lidocainecream);
				if (isElementPresent(lidocainecream_img)) {
					visibilityOf(lidocainecream_img);
					boolean elementIsDisplayed=elementIsDisplayed(lidocainecream_img);
					Assert.assertTrue(elementIsDisplayed(lidocainecream_img));
					clickElementUsingJavaScript(lidocainecream_learnmore);
					visibilityOf(lidocainecream_txt);
					boolean elementIsDisplayed1=elementIsDisplayed(lidocainecream_txt);
					Assert.assertTrue(elementIsDisplayed(lidocainecream_txt));
					System.out.println(getElementText(lidocainecream_txt));
					pageLoad();
				} else {
					throw new Exception("lidocainecream_txt are not Present on Page");
				}
				
			}	
			public void clickonLidocaineCreame_BuyNow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(lidocainecream_buynow);
				moveToElement(lidocainecream_buynow);
				if (isElementPresent(lidocainecream_buynow)) {
					clickElementUsingJavaScript(lidocainecream_buynow);
					visibilityOf(lidocainecream_buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lidocainecream_buynow_txt);
					Assert.assertTrue(elementIsDisplayed(lidocainecream_buynow_txt));
					System.out.println(getElementText(lidocainecream_buynow_txt));
					clickElementUsingJavaScript(lidocainecream_buynow_close);
					pageLoad();
				} else {
					throw new Exception("Lidocaine Creame BuyNow are not Present on Page");
				}
				
			}
			public void clickongetrelief() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(getrelief);
				moveToElement(getrelief);
				if (isElementPresent(getrelief)) {
					clickElementUsingJavaScript(getrelief);
					visibilityOf(getrelief_txt);
					boolean elementIsDisplayed=elementIsDisplayed(getrelief_txt);
					Assert.assertTrue(elementIsDisplayed(getrelief_txt));
					System.out.println(getElementText(getrelief_txt));
					
					pageLoad();
				} else {
					throw new Exception("GetRelief are not Present on Page");
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	

}
