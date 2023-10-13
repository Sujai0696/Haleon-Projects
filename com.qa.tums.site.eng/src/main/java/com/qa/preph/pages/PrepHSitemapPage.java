package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHSitemapPage extends BaseClass{
	
	public PrepHSitemapPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		

	@FindBy(xpath = "//li[text()=' Sitemap ']")
	private static WebElement sitemapBreadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Sitemap']")
	private static WebElement sitemap_txt_Breadcrumbs;		
	
	@FindBy(xpath = "//div[@class='sitemap component section default-style even last']//a[text()='Homepage (US)']")
	private static WebElement homepage;
	
	@FindBy(xpath = "//a[text()='FAQs']")
	private static WebElement faq;
	
	@FindBy(xpath = "//h2[text()='The Bottom Line']")
	private static WebElement faq_txt;
	
	@FindBy(xpath = "//a[text()='Where To Buy']")
	private static WebElement wheretoobuy;
	
	@FindBy(xpath = "//h1[text()='Where to Buy']")
	private static WebElement wheretoobuy_txt;
	
	@FindBy(xpath = "//div[@class='sitemap component section default-style even last']//a[text()='Contact Us']")
	private static WebElement contactus;
	
	@FindBy(xpath = "//h1[text()='CONTACT US']")
	private static WebElement contactus_txt;
	
	@FindBy(xpath = "//div[@class='sitemap component section default-style even last']//a[text()='Products']")
	private static WebElement products;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement products_txt;
	
	@FindBy(xpath = "//a[text()='Soothing Relief Cooling Spray']")
	private static WebElement coolingsparay;
	
	@FindBy(xpath = "//h1[text()='Soothing Relief Cooling Spray']")
	private static WebElement coolingsparay_txt;
	
	@FindBy(xpath = "//a[text()='Soothing Relief Cleansing & Cooling Wipes']")
	private static WebElement cleansingcoolingwipes;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement cleansingcoolingwipes_txt;
	
	@FindBy(xpath = "//a[text()='Soothing Relief Anti-Itch Cream']")
	private static WebElement antiitchcream;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-2 p-m-b-1 title-center-m title-left-d head-alt first odd component']//h1")
	private static WebElement antiitchcream_txt;
	
	@FindBy(xpath = "//a[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement lidocaine;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement lidocaine_txt;
	
	@FindBy(xpath = "//a[text()='Rapid Relief with Lidocaine Cream']")
	private static WebElement lidocainecreame;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief with Lidocaine Cream']")
	private static WebElement lidocainecreame_txt;
	
	@FindBy(xpath = "//a[text()='Rapid Relief Totables Wipes']")
	private static WebElement totablewipes;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Totables Wipes']")
	private static WebElement totablewipes_txt;
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointment;
	
	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement ointment_txt;
	
	@FindBy(xpath = "//a[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomcreame;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomcreame_txt;
	
	@FindBy(xpath = "//a[text()='Suppositories']")
	private static WebElement suppostories;
	
	@FindBy(xpath = "//h1[text()='Suppositories']")
	private static WebElement suppostories_txt;
	
	@FindBy(xpath = "//a[text()='Cooling Gel']")
	private static WebElement coolinggel;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolinggel_txt;
	
	@FindBy(xpath = "//a[text()=' Totables']")
	private static WebElement totables;
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement totables_txt;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes']")
	private static WebElement medicatedwipes;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatedwipes_txt;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes for Women']")
	private static WebElement medicatedwipeswomen_txt;
	
	@FindBy(xpath = "//a[text()='Articles']")
	private static WebElement articles;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-t-4 text-left-d text-center-m even col-xs-12']//h2")
	private static WebElement articles_txt;
	
	@FindBy(xpath = "//a[text()='How long do hemorrhoids last?']")
	private static WebElement hemorroidlast;
	
	@FindBy(xpath = "//h1[text()='How long do hemorrhoids last?']")
	private static WebElement hemorroidlast_txt;
	
	@FindBy(xpath = "//a[text()='All About Bleeding Hemorrhoids']")
	private static WebElement hemorroidlastbleeding;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Bleeding Hemorrhoids and Rectal Bleeding']")
	private static WebElement hemorroidlastbleeding_txt;
	
	@FindBy(xpath = "//a[text()='How to Tell If You Have Hemorrhoids']")
	private static WebElement tellhemorrhoids;
	
	@FindBy(xpath = "//h1[text()='How to Tell If You Have Hemorrhoids']")
	private static WebElement tellhemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='Treating Flare Ups']")
	private static WebElement treatingflareup;
	
	@FindBy(xpath = "//h1[text()='Treating a Hemorrhoid Flare Up']")
	private static WebElement treatingflareup_txt;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll of Hemorrhoids']")
	private static WebElement emotionaltoll;
	
	@FindBy(xpath = "//h1[text()='Emotional Toll of Hemorrhoids']")
	private static WebElement emotionaltoll_txt;
	
	@FindBy(xpath = "//a[text()='Using the Bathroom']")
	private static WebElement usingbathroom;
	
	@FindBy(xpath = "//h1[text()='Healthy Bathroom Habits']")
	private static WebElement usingbathroom_txt;
	
	@FindBy(xpath = "//a[text()='Just for Moms']")
	private static WebElement justformoms;
	
	@FindBy(xpath = "//h1[text()='Why Pregnant Women Get Hemorrhoids']")
	private static WebElement justformoms_txt;
	
	@FindBy(xpath = "(//a[text()='What are Hemorrhoids?'])[1]")
	private static WebElement whatarehemorroids;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?']")
	private static WebElement whatarehemorroids_txt;
	
	@FindBy(xpath = "//a[text()='Who Gets Hemorrhoids?']")
	private static WebElement whogetshemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Who Gets Hemorrhoids?']")
	private static WebElement whogetshemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='Symptoms']")
	private static WebElement symptoms;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Symptoms']")
	private static WebElement symptoms_txt;
	
	@FindBy(xpath = "//a[text()='What Causes Hemorrhoids and How Can You Treat Them?']")
	private static WebElement whatcauseshemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Causes of Hemorrhoids']")
	private static WebElement whatcauseshemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='Medical Treatment']")
	private static WebElement medicaltreatment;
	
	@FindBy(xpath = "//h1[text()='Medical Treatment of Hemorrhoids']")
	private static WebElement medicaltreatment_txt;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Discussion Guide']")
	private static WebElement hemorrhoiddiscussionguide;
	
	@FindBy(xpath = "//h1[text()='Ready to Get Comfortable and Talk to Your Doctor about Bum Discomfort?']")
	private static WebElement hemorrhoiddiscussionguide_txt;
	
	@FindBy(xpath = "//a[text()='Stress and Constipation']")
	private static WebElement stressconstipation;
	
	@FindBy(xpath = "//h1[text()='The Link Between Stress and Constipation']")
	private static WebElement stressconstipation_txt;
	
	@FindBy(xpath = "//a[text()='Can Stress Cause Hemorrhoids?']")
	private static WebElement canstresscausehemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Can Stress Cause Hemorrhoids?']")
	private static WebElement canstresscausehemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='6 Reasons You Have an Itchy Butt']")
	private static WebElement itchybutt;
	
	@FindBy(xpath = "//h1[text()='6 Reasons You Have an Itchy Butt']")
	private static WebElement itchybutt_txt;
	
	@FindBy(xpath = "//a[text()='6 Unexpected Things to Pack on Your Next Trip']")
	private static WebElement packnexttrip;
	
	@FindBy(xpath = "//h1[text()='6 Unexpected Things to Pack on Your Next Trip']")
	private static WebElement packnexttrip_ttx;
	
	@FindBy(xpath = "//a[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement everthingneedtoknow;
	
	@FindBy(xpath = "//h1[text()='Everything You Need to Know About Hemorrhoids']")
	private static WebElement everthingneedtoknow_txt;
	
	@FindBy(xpath = "//a[text()='7 Surprising Things That Irritate Your Butt']")
	private static WebElement surprisingthingirriatebutt;
	
	@FindBy(xpath = "//h1[text()='7 Surprising Things That Irritate Your Butt']")
	private static WebElement surprisingthingirriatebutt_txt;
	
	@FindBy(xpath = "//a[text()='How to Travel if You Have GI Problems']")
	private static WebElement giproblems;
	
	@FindBy(xpath = "//h1[text()='How to Travel if You Have GI Problems']")
	private static WebElement giproblems_txt;
	
	@FindBy(xpath = "//a[text()='Could Lifting Weights Give You Hemorrhoids?']")
	private static WebElement couldliftingweighthemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Could Lifting Weights Give You Hemorrhoids?']")
	private static WebElement couldliftingweighthemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='6 Tips for Staying Regular on Vacation']")
	private static WebElement stayingregularvaccation;
	
	@FindBy(xpath = "//h1[text()='6 Tips for Staying Regular on Vacation']")
	private static WebElement stayingregularvaccation_txt;
	
	@FindBy(xpath = "//a[text()='5 Gifts to Give Someone Who Is Expecting']")
	private static WebElement giftssomeoneexpecting;
	
	@FindBy(xpath = "//h1[text()='5 Gifts to Give Someone Who Is Expecting']")
	private static WebElement giftssomeoneexpecting_txt;
	
	@FindBy(xpath = "//a[text()='5 Reasons to Simplify Your Washing-Up Routine']")
	private static WebElement washinguproutine;
	
	@FindBy(xpath = "//h1[text()='5 Reasons to Simplify Your Washing-Up Routine']")
	private static WebElement washinguproutine_txt;
	
	@FindBy(xpath = "//a[text()='5 Things That Can Cause Discomfort When Sitting']")
	private static WebElement discomfortwhensitting;
	
	@FindBy(xpath = "//h1[text()='5 Things That Can Cause Discomfort When Sitting']")
	private static WebElement discomfortwhensitting_txt;
	
	@FindBy(xpath = "//a[text()='Flare-Ups']")
	private static WebElement flareups;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Flare-Ups']")
	private static WebElement flareups_txt;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Pain']")
	private static WebElement hemorrhoidpain;
	
	@FindBy(xpath = "//h1[text()='About Hemorrhoid Pain']")
	private static WebElement hemorrhoidpain_txt;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Medicine 101']")
	private static WebElement hemorrhoidmedicine;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoid Medicine 101']")
	private static WebElement hemorrhoidmedicine_txt;
	
	@FindBy(xpath = "//a[text()='Home Remedies for Hemorrhoids']")
	private static WebElement homeremedies;
	
	@FindBy(xpath = "//h1[text()='Common Home Remedies for Hemorrhoids: How to Treat Hemorrhoids Naturally']")
	private static WebElement homeremedies_txt;
	
	@FindBy(xpath = "//a[text()='Signs of Hemorrhoids']")
	private static WebElement signhemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Common Signs of Hemorrhoids']")
	private static WebElement signhemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='Witch Hazel for Hemorrhoids']")
	private static WebElement witchhazelhemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Can You Use Witch Hazel for Hemorrhoids?']")
	private static WebElement witchhazelhemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='All About Postpartum Hemorrhoids']")
	private static WebElement allaboutpostpartum;
	
	@FindBy(xpath = "//h1[text()='All About Postpartum Hemorrhoids']")
	private static WebElement allaboutpostpartum_txt;
	
	@FindBy(xpath = "//a[text()='Can a Hemorrhoid Pop?']")
	private static WebElement canhemorrhoidpop;
	
	@FindBy(xpath = "//h1[text()='Can a Hemorrhoid Pop? Should You Pop a Hemorrhoid?']")
	private static WebElement canhemorrhoidpop_txt;
	
	@FindBy(xpath = "//a[text()='How to Prevent Hemorrhoids with Home Remedies']")
	private static WebElement preventhomeremedies;
	
	@FindBy(xpath = "//h1[text()='How to Prevent Hemorrhoids with Home Remedies']")
	private static WebElement preventhomeremedies_txt;
	
	@FindBy(xpath = "//a[text()='Should You Use Hemorrhoidal Wipes?']")
	private static WebElement hemorrhoidwipes;
	
	@FindBy(xpath = "//h1[text()='Should You Use Hemorrhoidal Wipes?']")
	private static WebElement hemorrhoidwipes_txt;
	
	@FindBy(xpath = "//a[text()='Can a High Fiber Diet Help with Hemorrhoids?']")
	private static WebElement highfiberdiet;
	
	@FindBy(xpath = "//h1[text()='Can a High Fiber Diet Help Hemorrhoids?']")
	private static WebElement highfiberdiet_txt;
	
	@FindBy(xpath = "//a[text()='Relief Finder']")
	private static WebElement relieffinder;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement relieffinder_txt;
	
	@FindBy(xpath = "(//a[text()='Offers'])[2]")
	private static WebElement offers;
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement offers_txt;
	
	@FindBy(xpath = "//a[text()='Newsletter Sign up']")
	private static WebElement newslettersignup;
	
	@FindBy(xpath = "//h1[text()='Keep Your Caboose In the Know']")
	private static WebElement newslettersignup_txt;
	
	@FindBy(xpath = "//a[text()='Videos']")
	private static WebElement videos;
	
	@FindBy(xpath = "//div[@class='richText component section m-m-b-2 m-m-x-2 first odd col-xs-12 col-sm-6 col-lg-5']//h1")
	private static WebElement videos_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment, Gels and Creams']")
	private static WebElement howtoapplyointmentgels;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment, Gels and Creams']")
	private static WebElement howtoapplyointmentgels_txt;
	
	@FindBy(xpath = "//a[text()='How to Insert a PREPARATION H Suppository']")
	private static WebElement howtoinsertprepartionH;
	
	@FindBy(xpath = "//h1[text()='How to Insert a Preparation H Suppository']")
	private static WebElement howtoinsertprepartionH_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Ointment with an Applicator']")
	private static WebElement applicator;
	
	@FindBy(xpath = "//h1[text()='How to Apply Ointment with an Applicator']")
	private static WebElement applicator_txt;
	
	@FindBy(xpath = "//a[text()='How to Apply PREPARATION H Multi-Symptom Pain Relief Cream']")
	private static WebElement multisymptomspaincream;
	
	@FindBy(xpath = "//h1[text()='Applying Maximum Strength Pain Relief Cream']")
	private static WebElement multisymptomspaincream_txt;
	
	@FindBy(xpath = "//a[text()='Pregnancy and Hemorrhoids']")
	private static WebElement pregancyhemorrhoids;
	
	@FindBy(xpath = "//h1[text()='Pregnancy & Hemorrhoids: Postpartum Care with Preparation H']")
	private static WebElement pregancyhemorrhoids_txt;
	
	@FindBy(xpath = "//a[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement howtotreathemorrhoidsymptoms;
	
	@FindBy(xpath = "//h1[text()='How to Treat Hemorrhoid Symptoms']")
	private static WebElement howtotreathemorrhoidsymptoms_txt;
	
	@FindBy(xpath = "(//a[text()='What are Hemorrhoids?'])[2]")
	private static WebElement whatarehemorrhoids1;
	
	@FindBy(xpath = "//h1[text()='What are Hemorrhoids?Video']")
	private static WebElement whatarehemorrhoids1_txt;
	
	@FindBy(xpath = "//a[text()='Hemorrhoids Ruin All the Fun.']")
	private static WebElement hemorrhoidruinall;
	
	@FindBy(xpath = "//h1[text()='Hemorrhoids Ruin All the Fun. Not Anymore.']")
	private static WebElement hemorrhoidruinall_txt;
	
	@FindBy(xpath = "//a[@href='/videos/hemorrhoids-dont-feel-remorse/']")
	private static WebElement dontfeelremorse;
	
	@FindBy(xpath = "//div[@class='richText component section p-d-b-2 p-d-r-5 p-m-b-1 head-alt first odd col-xs-12']//h1")
	private static WebElement dontfeelremorse_txt;
	
	@FindBy(xpath = "(//a[text()='Sitemap'])[1]")
	private static WebElement sitemap1;
	
	
	@FindBy(xpath = "//h1[text()='Sitemap']")
	private static WebElement sitemap1_txt;
	
	@FindBy(xpath = "(//a[text()='FSA & HSA Eligibility'])[1]")
	private static WebElement fsahsa;
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement fsahsa_txt;
	
	
	
	
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
			
			
				public void clickonHomeBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(HomeBreadcrumbs);
					if (isElementPresent(HomeBreadcrumbs)) {
						clickElementUsingJavaScript(HomeBreadcrumbs);
						pageLoad();
					} else {
						throw new Exception("HomeBreadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonSitemapBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(sitemapBreadcrumbs);
					if (isElementPresent(sitemapBreadcrumbs)) {
						visibilityOf(sitemap_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(sitemap_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(sitemap_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("sitemap_txt_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonHomepage() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(homepage);
					if (isElementPresent(homepage)) {
						clickElementUsingJavaScript(homepage);
						pageLoad();
					} else {
						throw new Exception("Homepage are not Present on Page");
					}
					
				}	
				public void clickonFAQ() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(faq);
					if (isElementPresent(faq)) {
						clickElementUsingJavaScript(faq);
						visibilityOf(faq_txt);
						boolean elementIsDisplayed=elementIsDisplayed(faq_txt);
						Assert.assertTrue(elementIsDisplayed(faq_txt));
						System.out.println(getElementText(faq_txt));
						pageLoad();
					} else {
						throw new Exception("faq_txt are not Present on Page");
					}
					
				}	
				public void clickonWheretobuy() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(wheretoobuy);
					if (isElementPresent(wheretoobuy)) {
						clickElementUsingJavaScript(wheretoobuy);
						visibilityOf(wheretoobuy_txt);
						boolean elementIsDisplayed=elementIsDisplayed(wheretoobuy_txt);
						Assert.assertTrue(elementIsDisplayed(wheretoobuy_txt));
						System.out.println(getElementText(wheretoobuy_txt));
						pageLoad();
					} else {
						throw new Exception("wheretoobuy_txt are not Present on Page");
					}
					
				}	
				public void clickonContactUs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(contactus);
					if (isElementPresent(contactus)) {
						clickElementUsingJavaScript(contactus);
						visibilityOf(contactus_txt);
						boolean elementIsDisplayed=elementIsDisplayed(contactus_txt);
						Assert.assertTrue(elementIsDisplayed(contactus_txt));
						System.out.println(getElementText(contactus_txt));
						pageLoad();
					} else {
						throw new Exception("contactus_txt are not Present on Page");
					}
					
				}	
				public void clickonproducts() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(products);
					moveToElement(products);
					if (isElementPresent(products)) {
						clickElementUsingJavaScript(products);
						visibilityOf(products_txt);
						boolean elementIsDisplayed=elementIsDisplayed(products_txt);
						Assert.assertTrue(elementIsDisplayed(products_txt));
						System.out.println(getElementText(products_txt));
						pageLoad();
					} else {
						throw new Exception("products_txt are not Present on Page");
					}
					
				}	
				public void clickonCoolingSpray() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(coolingsparay);
					moveToElement(coolingsparay);
					if (isElementPresent(coolingsparay)) {
						clickElementUsingJavaScript(coolingsparay);
						visibilityOf(coolingsparay_txt);
						boolean elementIsDisplayed=elementIsDisplayed(coolingsparay_txt);
						Assert.assertTrue(elementIsDisplayed(coolingsparay_txt));
						System.out.println(getElementText(coolingsparay_txt));
						pageLoad();
					} else {
						throw new Exception("coolingsparay_txt are not Present on Page");
					}
					
				}	
				public void clickoncleansingcoolingwipes() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(cleansingcoolingwipes);
					moveToElement(cleansingcoolingwipes);
					if (isElementPresent(cleansingcoolingwipes)) {
						clickElementUsingJavaScript(cleansingcoolingwipes);
						visibilityOf(cleansingcoolingwipes_txt);
						boolean elementIsDisplayed=elementIsDisplayed(cleansingcoolingwipes_txt);
						Assert.assertTrue(elementIsDisplayed(cleansingcoolingwipes_txt));
						System.out.println(getElementText(cleansingcoolingwipes_txt));
						pageLoad();
					} else {
						throw new Exception("cleansingcoolingwipes_txt are not Present on Page");
					}
					
				}	
				public void clickonAntiitchingcreame() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(antiitchcream);
					moveToElement(antiitchcream);
					if (isElementPresent(antiitchcream)) {
						clickElementUsingJavaScript(antiitchcream);
						visibilityOf(antiitchcream_txt);
						boolean elementIsDisplayed=elementIsDisplayed(antiitchcream_txt);
						Assert.assertTrue(elementIsDisplayed(antiitchcream_txt));
						System.out.println(getElementText(antiitchcream_txt));
						pageLoad();
					} else {
						throw new Exception("antiitchcream_txt are not Present on Page");
					}
					
				}	
				public void clickonlidocaine() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(lidocaine);
					moveToElement(lidocaine);
					if (isElementPresent(lidocaine)) {
						clickElementUsingJavaScript(lidocaine);
						visibilityOf(lidocaine_txt);
						boolean elementIsDisplayed=elementIsDisplayed(lidocaine_txt);
						Assert.assertTrue(elementIsDisplayed(lidocaine_txt));
						System.out.println(getElementText(lidocaine_txt));
						pageLoad();
					} else {
						throw new Exception("lidocaine_txt are not Present on Page");
					}
					
				}	
				public void clickonlidocainecream() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(lidocainecreame);
					moveToElement(lidocainecreame);
					if (isElementPresent(lidocainecreame)) {
						clickElementUsingJavaScript(lidocainecreame);
						visibilityOf(lidocainecreame_txt);
						boolean elementIsDisplayed=elementIsDisplayed(lidocainecreame_txt);
						Assert.assertTrue(elementIsDisplayed(lidocainecreame_txt));
						System.out.println(getElementText(lidocainecreame_txt));
						pageLoad();
					} else {
						throw new Exception("lidocainecreame_txt are not Present on Page");
					}
					
				}	
				public void clickontotablewipes() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(totablewipes);
					moveToElement(totablewipes);
					if (isElementPresent(totablewipes)) {
						clickElementUsingJavaScript(totablewipes);
						visibilityOf(totablewipes_txt);
						boolean elementIsDisplayed=elementIsDisplayed(totablewipes_txt);
						Assert.assertTrue(elementIsDisplayed(totablewipes_txt));
						System.out.println(getElementText(totablewipes_txt));
						pageLoad();
					} else {
						throw new Exception("totablewipes_txt are not Present on Page");
					}
					
				}	
				public void clickonOintment() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(ointment);
					moveToElement(ointment);
					if (isElementPresent(ointment)) {
						clickElementUsingJavaScript(ointment);
						visibilityOf(ointment_txt);
						boolean elementIsDisplayed=elementIsDisplayed(ointment_txt);
						Assert.assertTrue(elementIsDisplayed(ointment_txt));
						System.out.println(getElementText(ointment_txt));
						pageLoad();
					} else {
						throw new Exception("ointment_txt are not Present on Page");
					}
					
				}	
				public void clickonMultisymptomscreame() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(multisymptomcreame);
					moveToElement(multisymptomcreame);
					if (isElementPresent(multisymptomcreame)) {
						clickElementUsingJavaScript(multisymptomcreame);
						visibilityOf(multisymptomcreame_txt);
						boolean elementIsDisplayed=elementIsDisplayed(multisymptomcreame_txt);
						Assert.assertTrue(elementIsDisplayed(multisymptomcreame_txt));
						System.out.println(getElementText(multisymptomcreame_txt));
						pageLoad();
					} else {
						throw new Exception("multisymptomcreame_txt are not Present on Page");
					}
					
				}	
				public void clickonSuppostories() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(suppostories);
					moveToElement(suppostories);
					if (isElementPresent(suppostories)) {
						clickElementUsingJavaScript(suppostories);
						visibilityOf(suppostories_txt);
						boolean elementIsDisplayed=elementIsDisplayed(suppostories_txt);
						Assert.assertTrue(elementIsDisplayed(suppostories_txt));
						System.out.println(getElementText(suppostories_txt));
						pageLoad();
					} else {
						throw new Exception("suppostories_txt are not Present on Page");
					}
					
				}	
				public void clickonCoolinggel() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(coolinggel);
					moveToElement(coolinggel);
					if (isElementPresent(coolinggel)) {
						clickElementUsingJavaScript(coolinggel);
						visibilityOf(coolinggel_txt);
						boolean elementIsDisplayed=elementIsDisplayed(coolinggel_txt);
						Assert.assertTrue(elementIsDisplayed(coolinggel_txt));
						System.out.println(getElementText(coolinggel_txt));
						pageLoad();
					} else {
						throw new Exception("coolinggel_txt are not Present on Page");
					}
					
				}	
				public void clickontotables() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(totables);
					moveToElement(totables);
					if (isElementPresent(totables)) {
						clickElementUsingJavaScript(totables);
						visibilityOf(totables_txt);
						boolean elementIsDisplayed=elementIsDisplayed(totables_txt);
						Assert.assertTrue(elementIsDisplayed(totables_txt));
						System.out.println(getElementText(totables_txt));
						pageLoad();
					} else {
						throw new Exception("totables_txt are not Present on Page");
					}
					
				}	
				public void clickonMedicatedWipes() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(medicatedwipes);
					moveToElement(medicatedwipes);
					if (isElementPresent(medicatedwipes)) {
						clickElementUsingJavaScript(medicatedwipes);
						visibilityOf(medicatedwipes_txt);
						boolean elementIsDisplayed=elementIsDisplayed(medicatedwipes_txt);
						Assert.assertTrue(elementIsDisplayed(medicatedwipes_txt));
						System.out.println(getElementText(medicatedwipes_txt));
						pageLoad();
					} else {
						throw new Exception("medicatedwipes_txt are not Present on Page");
					}
					
				}	
				public void clickonMedicatedWipeswomen() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(medicatedwipeswomen);
					moveToElement(medicatedwipeswomen);
					if (isElementPresent(medicatedwipeswomen)) {
						clickElementUsingJavaScript(medicatedwipeswomen);
						visibilityOf(medicatedwipeswomen_txt);
						boolean elementIsDisplayed=elementIsDisplayed(medicatedwipeswomen_txt);
						Assert.assertTrue(elementIsDisplayed(medicatedwipeswomen_txt));
						System.out.println(getElementText(medicatedwipeswomen_txt));
						pageLoad();
					} else {
						throw new Exception("medicatedwipeswomen_txt are not Present on Page");
					}
					
				}	
				public void clickonArticles() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(articles);
					moveToElement(articles);
					if (isElementPresent(articles)) {
						clickElementUsingJavaScript(articles);
						visibilityOf(articles_txt);
						boolean elementIsDisplayed=elementIsDisplayed(articles_txt);
						Assert.assertTrue(elementIsDisplayed(articles_txt));
						System.out.println(getElementText(articles_txt));
						pageLoad();
					} else {
						throw new Exception("articles_txt are not Present on Page");
					}
					
				}	
				public void clickonHemorroidlast() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorroidlast);
					moveToElement(hemorroidlast);
					if (isElementPresent(hemorroidlast)) {
						clickElementUsingJavaScript(hemorroidlast);
						visibilityOf(hemorroidlast_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorroidlast_txt);
						Assert.assertTrue(elementIsDisplayed(hemorroidlast_txt));
						System.out.println(getElementText(hemorroidlast_txt));
						pageLoad();
					} else {
						throw new Exception("hemorroidlast_txt are not Present on Page");
					}
					
				}	
				public void clickonHemorroidbleeding() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorroidlastbleeding);
					moveToElement(hemorroidlastbleeding);
					if (isElementPresent(hemorroidlastbleeding)) {
						clickElementUsingJavaScript(hemorroidlastbleeding);
						visibilityOf(hemorroidlastbleeding_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorroidlastbleeding_txt);
						Assert.assertTrue(elementIsDisplayed(hemorroidlastbleeding_txt));
						System.out.println(getElementText(hemorroidlastbleeding_txt));
						pageLoad();
					} else {
						throw new Exception("hemorroidlastbleeding_txt are not Present on Page");
					}
					
				}	
				public void clickontellHemorroid() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(tellhemorrhoids);
					moveToElement(tellhemorrhoids);
					if (isElementPresent(tellhemorrhoids)) {
						clickElementUsingJavaScript(tellhemorrhoids);
						visibilityOf(tellhemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(tellhemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(tellhemorrhoids_txt));
						System.out.println(getElementText(tellhemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("tellhemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickontreatingflareup() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(treatingflareup);
					moveToElement(treatingflareup);
					if (isElementPresent(treatingflareup)) {
						clickElementUsingJavaScript(treatingflareup);
						visibilityOf(treatingflareup_txt);
						boolean elementIsDisplayed=elementIsDisplayed(treatingflareup_txt);
						Assert.assertTrue(elementIsDisplayed(treatingflareup_txt));
						System.out.println(getElementText(treatingflareup_txt));
						pageLoad();
					} else {
						throw new Exception("treatingflareup_txt are not Present on Page");
					}
					
				}	
				public void clickonemotionaltoll() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(emotionaltoll);
					moveToElement(emotionaltoll);
					if (isElementPresent(emotionaltoll)) {
						clickElementUsingJavaScript(emotionaltoll);
						visibilityOf(emotionaltoll_txt);
						boolean elementIsDisplayed=elementIsDisplayed(emotionaltoll_txt);
						Assert.assertTrue(elementIsDisplayed(emotionaltoll_txt));
						System.out.println(getElementText(emotionaltoll_txt));
						pageLoad();
					} else {
						throw new Exception("emotionaltoll_txt are not Present on Page");
					}
					
				}	
				public void clickonusingbathroom() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(usingbathroom);
					moveToElement(usingbathroom);
					if (isElementPresent(usingbathroom)) {
						clickElementUsingJavaScript(usingbathroom);
						visibilityOf(usingbathroom_txt);
						boolean elementIsDisplayed=elementIsDisplayed(usingbathroom_txt);
						Assert.assertTrue(elementIsDisplayed(usingbathroom_txt));
						System.out.println(getElementText(usingbathroom_txt));
						pageLoad();
					} else {
						throw new Exception("usingbathroom_txt are not Present on Page");
					}
					
				}	
				public void clickonjustformoms() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(justformoms);
					moveToElement(justformoms);
					if (isElementPresent(justformoms)) {
						clickElementUsingJavaScript(justformoms);
						visibilityOf(justformoms_txt);
						boolean elementIsDisplayed=elementIsDisplayed(justformoms_txt);
						Assert.assertTrue(elementIsDisplayed(justformoms_txt));
						System.out.println(getElementText(justformoms_txt));
						pageLoad();
					} else {
						throw new Exception("justformoms_txt are not Present on Page");
					}
					
				}	
				public void clickonwhatarehemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(whatarehemorroids);
					moveToElement(whatarehemorroids);
					if (isElementPresent(whatarehemorroids)) {
						clickElementUsingJavaScript(whatarehemorroids);
						visibilityOf(whatarehemorroids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(whatarehemorroids_txt);
						Assert.assertTrue(elementIsDisplayed(whatarehemorroids_txt));
						System.out.println(getElementText(whatarehemorroids_txt));
						pageLoad();
					} else {
						throw new Exception("whatarehemorroids_txt are not Present on Page");
					}
					
				}	
				public void clickonwhogetshemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(whogetshemorrhoids);
					moveToElement(whogetshemorrhoids);
					if (isElementPresent(whogetshemorrhoids)) {
						clickElementUsingJavaScript(whogetshemorrhoids);
						visibilityOf(whogetshemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(whogetshemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(whogetshemorrhoids_txt));
						System.out.println(getElementText(whogetshemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("whogetshemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonSymptoms() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(symptoms);
					moveToElement(symptoms);
					if (isElementPresent(symptoms)) {
						clickElementUsingJavaScript(symptoms);
						visibilityOf(symptoms_txt);
						boolean elementIsDisplayed=elementIsDisplayed(symptoms_txt);
						Assert.assertTrue(elementIsDisplayed(symptoms_txt));
						System.out.println(getElementText(symptoms_txt));
						pageLoad();
					} else {
						throw new Exception("symptoms_txt are not Present on Page");
					}
					
				}	
				public void clickonwhatcauseshemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(whatcauseshemorrhoids);
					moveToElement(whatcauseshemorrhoids);
					if (isElementPresent(whatcauseshemorrhoids)) {
						clickElementUsingJavaScript(whatcauseshemorrhoids);
						visibilityOf(whatcauseshemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(whatcauseshemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(whatcauseshemorrhoids_txt));
						System.out.println(getElementText(whatcauseshemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("whatcauseshemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonMedicalTreatment() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(medicaltreatment);
					moveToElement(medicaltreatment);
					if (isElementPresent(medicaltreatment)) {
						clickElementUsingJavaScript(medicaltreatment);
						visibilityOf(medicaltreatment_txt);
						boolean elementIsDisplayed=elementIsDisplayed(medicaltreatment_txt);
						Assert.assertTrue(elementIsDisplayed(medicaltreatment_txt));
						System.out.println(getElementText(medicaltreatment_txt));
						pageLoad();
					} else {
						throw new Exception("medicaltreatment_txt are not Present on Page");
					}
					
				}	
				public void clickonHemorrhoiddiscussionguide() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoiddiscussionguide);
					moveToElement(hemorrhoiddiscussionguide);
					if (isElementPresent(hemorrhoiddiscussionguide)) {
						clickElementUsingJavaScript(hemorrhoiddiscussionguide);
						visibilityOf(hemorrhoiddiscussionguide_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoiddiscussionguide_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoiddiscussionguide_txt));
						System.out.println(getElementText(hemorrhoiddiscussionguide_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoiddiscussionguide_txt are not Present on Page");
					}
					
				}	
				public void clickonStressConstipation() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(stressconstipation);
					moveToElement(stressconstipation);
					if (isElementPresent(stressconstipation)) {
						clickElementUsingJavaScript(stressconstipation);
						visibilityOf(stressconstipation_txt);
						boolean elementIsDisplayed=elementIsDisplayed(stressconstipation_txt);
						Assert.assertTrue(elementIsDisplayed(stressconstipation_txt));
						System.out.println(getElementText(stressconstipation_txt));
						pageLoad();
					} else {
						throw new Exception("stressconstipation_txt are not Present on Page");
					}
					
				}	
				public void clickoncanStresscausehemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(canstresscausehemorrhoids);
					moveToElement(canstresscausehemorrhoids);
					if (isElementPresent(canstresscausehemorrhoids)) {
						clickElementUsingJavaScript(canstresscausehemorrhoids);
						visibilityOf(canstresscausehemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(canstresscausehemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(canstresscausehemorrhoids_txt));
						System.out.println(getElementText(canstresscausehemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("canstresscausehemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonitchybutt() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(itchybutt);
					moveToElement(itchybutt);
					if (isElementPresent(itchybutt)) {
						clickElementUsingJavaScript(itchybutt);
						visibilityOf(itchybutt_txt);
						boolean elementIsDisplayed=elementIsDisplayed(itchybutt_txt);
						Assert.assertTrue(elementIsDisplayed(itchybutt_txt));
						System.out.println(getElementText(itchybutt_txt));
						pageLoad();
					} else {
						throw new Exception("itchybutt_txt are not Present on Page");
					}
					
				}	
				public void clickonpacknexttrip() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(packnexttrip);
					moveToElement(packnexttrip);
					if (isElementPresent(packnexttrip)) {
						clickElementUsingJavaScript(packnexttrip);
						visibilityOf(packnexttrip_ttx);
						boolean elementIsDisplayed=elementIsDisplayed(packnexttrip_ttx);
						Assert.assertTrue(elementIsDisplayed(packnexttrip_ttx));
						System.out.println(getElementText(packnexttrip_ttx));
						pageLoad();
					} else {
						throw new Exception("packnexttrip_ttx are not Present on Page");
					}
					
				}	
				public void clickoneverythingneedtoknow() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(everthingneedtoknow);
					moveToElement(everthingneedtoknow);
					if (isElementPresent(everthingneedtoknow)) {
						clickElementUsingJavaScript(everthingneedtoknow);
						visibilityOf(everthingneedtoknow_txt);
						boolean elementIsDisplayed=elementIsDisplayed(everthingneedtoknow_txt);
						Assert.assertTrue(elementIsDisplayed(everthingneedtoknow_txt));
						System.out.println(getElementText(everthingneedtoknow_txt));
						pageLoad();
					} else {
						throw new Exception("everthingneedtoknow_txt are not Present on Page");
					}
					
				}	
				public void clickonsurprisingthingirritatebutt() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(surprisingthingirriatebutt);
					moveToElement(surprisingthingirriatebutt);
					if (isElementPresent(surprisingthingirriatebutt)) {
						clickElementUsingJavaScript(surprisingthingirriatebutt);
						visibilityOf(surprisingthingirriatebutt_txt);
						boolean elementIsDisplayed=elementIsDisplayed(surprisingthingirriatebutt_txt);
						Assert.assertTrue(elementIsDisplayed(surprisingthingirriatebutt_txt));
						System.out.println(getElementText(surprisingthingirriatebutt_txt));
						pageLoad();
					} else {
						throw new Exception("surprisingthingirriatebutt_txt are not Present on Page");
					}
					
				}	
				public void clickongiproblems() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(giproblems);
					moveToElement(giproblems);
					if (isElementPresent(giproblems)) {
						clickElementUsingJavaScript(giproblems);
						visibilityOf(giproblems_txt);
						boolean elementIsDisplayed=elementIsDisplayed(giproblems_txt);
						Assert.assertTrue(elementIsDisplayed(giproblems_txt));
						System.out.println(getElementText(giproblems_txt));
						pageLoad();
					} else {
						throw new Exception("giproblems_txt are not Present on Page");
					}
					
				}	
				public void clickoncouldliftingweighthemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(couldliftingweighthemorrhoids);
					moveToElement(couldliftingweighthemorrhoids);
					if (isElementPresent(couldliftingweighthemorrhoids)) {
						clickElementUsingJavaScript(couldliftingweighthemorrhoids);
						visibilityOf(couldliftingweighthemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(couldliftingweighthemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(couldliftingweighthemorrhoids_txt));
						System.out.println(getElementText(couldliftingweighthemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("couldliftingweighthemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonstayingregularvaccation() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(stayingregularvaccation);
					moveToElement(stayingregularvaccation);
					if (isElementPresent(stayingregularvaccation)) {
						clickElementUsingJavaScript(stayingregularvaccation);
						visibilityOf(stayingregularvaccation_txt);
						boolean elementIsDisplayed=elementIsDisplayed(stayingregularvaccation_txt);
						Assert.assertTrue(elementIsDisplayed(stayingregularvaccation_txt));
						System.out.println(getElementText(stayingregularvaccation_txt));
						pageLoad();
					} else {
						throw new Exception("stayingregularvaccation_txt are not Present on Page");
					}
					
				}	
				public void clickongiftssomeoneexpecting() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(giftssomeoneexpecting);
					moveToElement(giftssomeoneexpecting);
					if (isElementPresent(giftssomeoneexpecting)) {
						clickElementUsingJavaScript(giftssomeoneexpecting);
						visibilityOf(giftssomeoneexpecting_txt);
						boolean elementIsDisplayed=elementIsDisplayed(giftssomeoneexpecting_txt);
						Assert.assertTrue(elementIsDisplayed(giftssomeoneexpecting_txt));
						System.out.println(getElementText(giftssomeoneexpecting_txt));
						pageLoad();
					} else {
						throw new Exception("giftssomeoneexpecting_txt are not Present on Page");
					}
					
				}	
				public void clickonwashinguproutine() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(washinguproutine);
					moveToElement(washinguproutine);
					if (isElementPresent(washinguproutine)) {
						clickElementUsingJavaScript(washinguproutine);
						visibilityOf(washinguproutine_txt);
						boolean elementIsDisplayed=elementIsDisplayed(washinguproutine_txt);
						Assert.assertTrue(elementIsDisplayed(washinguproutine_txt));
						System.out.println(getElementText(washinguproutine_txt));
						pageLoad();
					} else {
						throw new Exception("washinguproutine_txt are not Present on Page");
					}
					
				}	
				public void clickondiscomfortwhensitting() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(discomfortwhensitting);
					moveToElement(discomfortwhensitting);
					if (isElementPresent(discomfortwhensitting)) {
						clickElementUsingJavaScript(discomfortwhensitting);
						visibilityOf(discomfortwhensitting_txt);
						boolean elementIsDisplayed=elementIsDisplayed(discomfortwhensitting_txt);
						Assert.assertTrue(elementIsDisplayed(discomfortwhensitting_txt));
						System.out.println(getElementText(discomfortwhensitting_txt));
						pageLoad();
					} else {
						throw new Exception("discomfortwhensitting_txt are not Present on Page");
					}
					
				}	
				public void clickonflareups() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(flareups);
					moveToElement(flareups);
					if (isElementPresent(flareups)) {
						clickElementUsingJavaScript(flareups);
						visibilityOf(flareups_txt);
						boolean elementIsDisplayed=elementIsDisplayed(flareups_txt);
						Assert.assertTrue(elementIsDisplayed(flareups_txt));
						System.out.println(getElementText(flareups_txt));
						pageLoad();
					} else {
						throw new Exception("flareups_txt are not Present on Page");
					}
					
				}	
				public void clickonhemorrhoidspain() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidpain);
					moveToElement(hemorrhoidpain);
					if (isElementPresent(hemorrhoidpain)) {
						clickElementUsingJavaScript(hemorrhoidpain);
						visibilityOf(hemorrhoidpain_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidpain_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidpain_txt));
						System.out.println(getElementText(hemorrhoidpain_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidpain_txt are not Present on Page");
					}
					
				}	
				public void clickonhemorrhoidsmedicine() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidmedicine);
					moveToElement(hemorrhoidmedicine);
					if (isElementPresent(hemorrhoidmedicine)) {
						clickElementUsingJavaScript(hemorrhoidmedicine);
						visibilityOf(hemorrhoidmedicine_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidmedicine_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidmedicine_txt));
						System.out.println(getElementText(hemorrhoidmedicine_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidmedicine_txt are not Present on Page");
					}
					
				}	
				public void clickonhomeremedies() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(homeremedies);
					moveToElement(homeremedies);
					if (isElementPresent(homeremedies)) {
						clickElementUsingJavaScript(homeremedies);
						visibilityOf(homeremedies_txt);
						boolean elementIsDisplayed=elementIsDisplayed(homeremedies_txt);
						Assert.assertTrue(elementIsDisplayed(homeremedies_txt));
						System.out.println(getElementText(homeremedies_txt));
						pageLoad();
					} else {
						throw new Exception("homeremedies_txt are not Present on Page");
					}
					
				}	
				public void clickonsignshemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(signhemorrhoids);
					moveToElement(signhemorrhoids);
					if (isElementPresent(signhemorrhoids)) {
						clickElementUsingJavaScript(signhemorrhoids);
						visibilityOf(signhemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(signhemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(signhemorrhoids_txt));
						System.out.println(getElementText(signhemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("signhemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonwitchhazelhemorrhoids() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(witchhazelhemorrhoids);
					moveToElement(witchhazelhemorrhoids);
					if (isElementPresent(witchhazelhemorrhoids)) {
						clickElementUsingJavaScript(witchhazelhemorrhoids);
						visibilityOf(witchhazelhemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(witchhazelhemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(witchhazelhemorrhoids_txt));
						System.out.println(getElementText(witchhazelhemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("witchhazelhemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonallaboutpostpartum() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(allaboutpostpartum);
					moveToElement(allaboutpostpartum);
					if (isElementPresent(allaboutpostpartum)) {
						clickElementUsingJavaScript(allaboutpostpartum);
						visibilityOf(allaboutpostpartum_txt);
						boolean elementIsDisplayed=elementIsDisplayed(allaboutpostpartum_txt);
						Assert.assertTrue(elementIsDisplayed(allaboutpostpartum_txt));
						System.out.println(getElementText(allaboutpostpartum_txt));
						pageLoad();
					} else {
						throw new Exception("allaboutpostpartum_txt are not Present on Page");
					}
					
				}	
				public void clickoncanhemorrhoidpopup() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(canhemorrhoidpop);
					moveToElement(canhemorrhoidpop);
					if (isElementPresent(canhemorrhoidpop)) {
						clickElementUsingJavaScript(canhemorrhoidpop);
						visibilityOf(canhemorrhoidpop_txt);
						boolean elementIsDisplayed=elementIsDisplayed(canhemorrhoidpop_txt);
						Assert.assertTrue(elementIsDisplayed(canhemorrhoidpop_txt));
						System.out.println(getElementText(canhemorrhoidpop_txt));
						pageLoad();
					} else {
						throw new Exception("canhemorrhoidpop_txt are not Present on Page");
					}
					
				}	
				public void clickonpreventhomeremedies() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(preventhomeremedies);
					moveToElement(preventhomeremedies);
					if (isElementPresent(preventhomeremedies)) {
						clickElementUsingJavaScript(preventhomeremedies);
						visibilityOf(preventhomeremedies_txt);
						boolean elementIsDisplayed=elementIsDisplayed(preventhomeremedies_txt);
						Assert.assertTrue(elementIsDisplayed(preventhomeremedies_txt));
						System.out.println(getElementText(preventhomeremedies_txt));
						pageLoad();
					} else {
						throw new Exception("preventhomeremedies_txt are not Present on Page");
					}
					
				}	
				public void clickonhemorrhoidwipes() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidwipes);
					moveToElement(hemorrhoidwipes);
					if (isElementPresent(hemorrhoidwipes)) {
						clickElementUsingJavaScript(hemorrhoidwipes);
						visibilityOf(hemorrhoidwipes_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidwipes_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidwipes_txt));
						System.out.println(getElementText(hemorrhoidwipes_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidwipes_txt are not Present on Page");
					}
					
				}	
				public void clickonhighfiberdiet() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(highfiberdiet);
					moveToElement(highfiberdiet);
					if (isElementPresent(highfiberdiet)) {
						clickElementUsingJavaScript(highfiberdiet);
						visibilityOf(highfiberdiet_txt);
						boolean elementIsDisplayed=elementIsDisplayed(highfiberdiet_txt);
						Assert.assertTrue(elementIsDisplayed(highfiberdiet_txt));
						System.out.println(getElementText(highfiberdiet_txt));
						pageLoad();
					} else {
						throw new Exception("highfiberdiet_txt are not Present on Page");
					}
					
				}	
				public void clickonRelieffinder() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(relieffinder);
					moveToElement(relieffinder);
					if (isElementPresent(relieffinder)) {
						clickElementUsingJavaScript(relieffinder);
						visibilityOf(relieffinder_txt);
						boolean elementIsDisplayed=elementIsDisplayed(relieffinder_txt);
						Assert.assertTrue(elementIsDisplayed(relieffinder_txt));
						System.out.println(getElementText(relieffinder_txt));
						pageLoad();
					} else {
						throw new Exception("relieffinder_txt are not Present on Page");
					}
					
				}	
				public void clickonoffers() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(offers);
					moveToElement(offers);
					if (isElementPresent(offers)) {
						clickElementUsingJavaScript(offers);
						visibilityOf(offers_txt);
						boolean elementIsDisplayed=elementIsDisplayed(offers_txt);
						Assert.assertTrue(elementIsDisplayed(offers_txt));
						System.out.println(getElementText(offers_txt));
						pageLoad();
					} else {
						throw new Exception("offers_txt are not Present on Page");
					}
					
				}	
				public void clickonnewslettersignup() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(newslettersignup);
					moveToElement(newslettersignup);
					if (isElementPresent(newslettersignup)) {
						clickElementUsingJavaScript(newslettersignup);
						visibilityOf(newslettersignup_txt);
						boolean elementIsDisplayed=elementIsDisplayed(newslettersignup_txt);
						Assert.assertTrue(elementIsDisplayed(newslettersignup_txt));
						System.out.println(getElementText(newslettersignup_txt));
						pageLoad();
					} else {
						throw new Exception("newslettersignup_txt are not Present on Page");
					}
					
				}	
				public void clickonvideos() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(videos);
					moveToElement(videos);
					if (isElementPresent(videos)) {
						clickElementUsingJavaScript(videos);
						visibilityOf(videos_txt);
						boolean elementIsDisplayed=elementIsDisplayed(videos_txt);
						Assert.assertTrue(elementIsDisplayed(videos_txt));
						System.out.println(getElementText(videos_txt));
						pageLoad();
					} else {
						throw new Exception("videos_txt are not Present on Page");
					}
					
				}	
				public void clickonhowtoapplyointmentsgels() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(howtoapplyointmentgels);
					moveToElement(howtoapplyointmentgels);
					if (isElementPresent(howtoapplyointmentgels)) {
						clickElementUsingJavaScript(howtoapplyointmentgels);
						visibilityOf(howtoapplyointmentgels_txt);
						boolean elementIsDisplayed=elementIsDisplayed(howtoapplyointmentgels_txt);
						Assert.assertTrue(elementIsDisplayed(howtoapplyointmentgels_txt));
						System.out.println(getElementText(howtoapplyointmentgels_txt));
						pageLoad();
					} else {
						throw new Exception("howtoapplyointmentgels_txt are not Present on Page");
					}
					
				}	
				public void clickonhowtoinsertprepartionH() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(howtoinsertprepartionH);
					moveToElement(howtoinsertprepartionH);
					if (isElementPresent(howtoinsertprepartionH)) {
						clickElementUsingJavaScript(howtoinsertprepartionH);
						visibilityOf(howtoinsertprepartionH_txt);
						boolean elementIsDisplayed=elementIsDisplayed(howtoinsertprepartionH_txt);
						Assert.assertTrue(elementIsDisplayed(howtoinsertprepartionH_txt));
						System.out.println(getElementText(howtoinsertprepartionH_txt));
						pageLoad();
					} else {
						throw new Exception("howtoinsertprepartionH_txt are not Present on Page");
					}
					
				}	
				public void clickonApplicator() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(applicator);
					moveToElement(applicator);
					if (isElementPresent(applicator)) {
						clickElementUsingJavaScript(applicator);
						visibilityOf(applicator_txt);
						boolean elementIsDisplayed=elementIsDisplayed(applicator_txt);
						Assert.assertTrue(elementIsDisplayed(applicator_txt));
						System.out.println(getElementText(applicator_txt));
						pageLoad();
					} else {
						throw new Exception("applicator_txt are not Present on Page");
					}
					
				}	
				public void clickonmultisymptomscreame() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(multisymptomcreame);
					moveToElement(multisymptomcreame);
					if (isElementPresent(multisymptomcreame)) {
						clickElementUsingJavaScript(multisymptomcreame);
						visibilityOf(multisymptomcreame_txt);
						boolean elementIsDisplayed=elementIsDisplayed(multisymptomcreame_txt);
						Assert.assertTrue(elementIsDisplayed(multisymptomcreame_txt));
						System.out.println(getElementText(multisymptomcreame_txt));
						pageLoad();
					} else {
						throw new Exception("multisymptomcreame_txt are not Present on Page");
					}
					
				}	
				public void clickonPregancyHemorrhoid() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(pregancyhemorrhoids);
					moveToElement(pregancyhemorrhoids);
					if (isElementPresent(pregancyhemorrhoids)) {
						clickElementUsingJavaScript(pregancyhemorrhoids);
						visibilityOf(pregancyhemorrhoids_txt);
						boolean elementIsDisplayed=elementIsDisplayed(pregancyhemorrhoids_txt);
						Assert.assertTrue(elementIsDisplayed(pregancyhemorrhoids_txt));
						System.out.println(getElementText(pregancyhemorrhoids_txt));
						pageLoad();
					} else {
						throw new Exception("pregancyhemorrhoids_txt are not Present on Page");
					}
					
				}	
				public void clickonhowtotreathemorrhoidsymptoms() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(howtotreathemorrhoidsymptoms);
					moveToElement(howtotreathemorrhoidsymptoms);
					if (isElementPresent(howtotreathemorrhoidsymptoms)) {
						clickElementUsingJavaScript(howtotreathemorrhoidsymptoms);
						visibilityOf(howtotreathemorrhoidsymptoms_txt);
						boolean elementIsDisplayed=elementIsDisplayed(howtotreathemorrhoidsymptoms_txt);
						Assert.assertTrue(elementIsDisplayed(howtotreathemorrhoidsymptoms_txt));
						System.out.println(getElementText(howtotreathemorrhoidsymptoms_txt));
						pageLoad();
					} else {
						throw new Exception("howtotreathemorrhoidsymptoms_txt are not Present on Page");
					}
					
				}	
				public void clickonwhatarehemorrhoids1() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(whatarehemorrhoids1);
					moveToElement(whatarehemorrhoids1);
					if (isElementPresent(whatarehemorrhoids1)) {
						clickElementUsingJavaScript(whatarehemorrhoids1);
						visibilityOf(whatarehemorrhoids1_txt);
						boolean elementIsDisplayed=elementIsDisplayed(whatarehemorrhoids1_txt);
						Assert.assertTrue(elementIsDisplayed(whatarehemorrhoids1_txt));
						System.out.println(getElementText(whatarehemorrhoids1_txt));
						pageLoad();
					} else {
						throw new Exception("whatarehemorrhoids1_txt are not Present on Page");
					}
					
				}	
				public void clickonHemorrhoidruinall() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(hemorrhoidruinall);
					moveToElement(hemorrhoidruinall);
					if (isElementPresent(hemorrhoidruinall)) {
						clickElementUsingJavaScript(hemorrhoidruinall);
						visibilityOf(hemorrhoidruinall_txt);
						boolean elementIsDisplayed=elementIsDisplayed(hemorrhoidruinall_txt);
						Assert.assertTrue(elementIsDisplayed(hemorrhoidruinall_txt));
						System.out.println(getElementText(hemorrhoidruinall_txt));
						pageLoad();
					} else {
						throw new Exception("hemorrhoidruinall_txt are not Present on Page");
					}
					
				}	
				public void clickondontfeelremorse() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(dontfeelremorse);
					moveToElement(dontfeelremorse);
					if (isElementPresent(dontfeelremorse)) {
						clickElementUsingJavaScript(dontfeelremorse);
						visibilityOf(dontfeelremorse_txt);
						boolean elementIsDisplayed=elementIsDisplayed(dontfeelremorse_txt);
						Assert.assertTrue(elementIsDisplayed(dontfeelremorse_txt));
						System.out.println(getElementText(dontfeelremorse_txt));
						pageLoad();
					} else {
						throw new Exception("dontfeelremorse_txt are not Present on Page");
					}
					
				}	
				public void clickonsitemap1() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(sitemap1);
					moveToElement(sitemap1);
					if (isElementPresent(sitemap1)) {
						clickElementUsingJavaScript(sitemap1);
//						visibilityOf(sitemap1_txt);
//						boolean elementIsDisplayed=elementIsDisplayed(sitemap1_txt);
//						Assert.assertTrue(elementIsDisplayed(sitemap1_txt));
//						System.out.println(getElementText(sitemap1_txt));
						pageLoad();
					} else {
						throw new Exception("sitemap1_txt are not Present on Page");
					}
					
				}	
				public void clickonfsahsa() throws Exception{
			    	waitForPageLoadJava();
			    	scrollDownUsingElement(fsahsa);
					moveToElement(fsahsa);
					if (isElementPresent(fsahsa)) {
						clickElementUsingJavaScript(fsahsa);
						visibilityOf(fsahsa_txt);
						boolean elementIsDisplayed=elementIsDisplayed(fsahsa_txt);
						Assert.assertTrue(elementIsDisplayed(fsahsa_txt));
						System.out.println(getElementText(fsahsa_txt));
						pageLoad();
					} else {
						throw new Exception("fsahsa_txt are not Present on Page");
					}
					
				}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
