package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelSitemapPage extends BaseClass{
	
	public voltarengelSitemapPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath = "//h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigyaform__heading first odd component col-xs-12']")
    private static WebElement gigyaClose;
		
    @FindBy(xpath = "//a[text()='Homepage']")
    private static WebElement homepage_breadcrumbs;		
	
    @FindBy(xpath = "//a[text()='Site Map']")
    private static WebElement sitemap_breadcrumbs;				
	
    @FindBy(xpath = "//a[text()='For Professionals']")
    private static WebElement forprofessionals;	
	
    @FindBy(xpath = "//a[text()='Voltaren Gel']")
    private static WebElement voltarengel;	
	
    @FindBy(xpath = "//h1[text()='Powerful Arthritis Pain Relief In a Gel']")
    private static WebElement voltarengel_txt;	
	
    @FindBy(xpath = "//a[text()='About Voltaren']")
    private static WebElement aboutvoltaren;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement aboutvoltaren_txt;
	
    @FindBy(xpath = "//a[text()='Read Reviews']")
    private static WebElement readreviews;
	
    @FindBy(xpath = "//span[text()='Read Voltaren Arthritis Pain Gel Reviews']")
    private static WebElement readreviews_txt;
	
    @FindBy(xpath = "//a[text()='What Makes Voltaren Different']")
    private static WebElement voltarendifferent;
	
    @FindBy(xpath = "//h1[text()='What Makes Voltaren Arthritis Pain Gel Different?']")
    private static WebElement voltarendifferent_txt;
	
    @FindBy(xpath = "//a[text()='Testimonials']")
    private static WebElement testimonials;
	
    @FindBy(xpath = "//span[text()='Customer Testimonials']")
    private static WebElement testimonials_txt;
	
    @FindBy(xpath = "//a[text()='What is arthritis?']")
    private static WebElement whatisarthrist;
	
    @FindBy(xpath = "//h1[text()='What Causes Arthritis?']")
    private static WebElement whatisarthrist_txt;
	
    @FindBy(xpath = "//a[text()='The different types of arthritis']")
    private static WebElement differenttypesarthrist;
	
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement differenttypesarthrist_txt;
	
    @FindBy(xpath = "//a[text()='What are the symptoms of arthritis?']")
    private static WebElement symptomsarthrits;
	
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement symptomsarthrits_txt;
	
    @FindBy(xpath = "//a[text()='What are the causes of arthritis?']")
    private static WebElement causesarthritis;
	
    @FindBy(xpath = "//span[text()='What are the Different Causes of Arthritis?']")
    private static WebElement causesarthritis_txt;
    
    @FindBy(xpath = "//a[text()='Interesting Facts About Osteoarthritis']")
    private static WebElement intrestingfacts;
    
    @FindBy(xpath = "//span[text()='4 Interesting Facts About Osteoarthritis']")
    private static WebElement intrestingfacts_txt;
    
    @FindBy(xpath = "//a[text()='Foot Arthritis Symptoms']")
    private static WebElement footarthritissymptoms;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='Arthritis Symptoms in Feet']")
    private static WebElement footarthritissymptoms_txt;
    
    @FindBy(xpath = "//a[text()='Early Signs of Osteoarthritis']")
    private static WebElement earlysignsOsteoarthritis;
    
    @FindBy(xpath = "//span[text()='Early Signs of Osteoarthritis']")
    private static WebElement earlysignsOsteoarthritis_txt;
    
    @FindBy(xpath = "//a[text()='Ankle Arthritis Symptoms']")
    private static WebElement anklearthritissymptoms;
    
    @FindBy(xpath = "//span[text()='Ankle Arthritis Symptoms']")
    private static WebElement anklearthritissymptoms_txt;
    
    @FindBy(xpath = "//a[text()='Understanding pain']")
    private static WebElement understandingpain;
    
    @FindBy(xpath = "//h1[text()='Understanding What Your Pain Specifically Means']")
    private static WebElement understandingpain_txt;
    
    @FindBy(xpath = "//a[text()='About pain']")
    private static WebElement aboutpain;
    
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement aboutpain_txt;
	
    @FindBy(xpath = "//a[text()='The impact of pain around the world']")
    private static WebElement impactpainworld;
    
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement impactpainworld_txt;
    
    @FindBy(xpath = "//a[text()='Does weather affect arthritis pain?']")
    private static WebElement weatheraffectspain;
    
    @FindBy(xpath = "//span[text()='Does Weather Affect Your Arthritis Pain?']")
    private static WebElement weatheraffectspain_txt;
    
    @FindBy(xpath = "//a[text()='Morning Joint Pain']")
    private static WebElement morningjointpain;
    
    @FindBy(xpath = "//span[text()='Morning Arthritis Pain']")
    private static WebElement morningjointpain_txt;
    
    @FindBy(xpath = "//a[text()='How is Arthritis Diagnosed?']")
    private static WebElement arthristDiagnosed;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='How Is Arthritis Diagnosed?']")
    private static WebElement arthristDiagnosed_txt;
    
    @FindBy(xpath = "//a[text()='Symptoms and treatment of arthritis elbow pain']")
    private static WebElement symptomstreatment;
    
    @FindBy(xpath = "//span[text()='Elbow Arthritis: Symptoms and Treatment of Arthritis Elbow Pain']")
    private static WebElement symptomstreatment_txt;
    
    @FindBy(xpath = "//a[text()='Sore Knee Causes']")
    private static WebElement sorekneecauses;
    
    @FindBy(xpath = "//span[text()='Sore Knees: Causes and Treatments']")
    private static WebElement sorekneecauses_txt;
    
    @FindBy(xpath = "//a[text()='Living with arthritis']")
    private static WebElement livingwitharthritis;
    
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement livingwitharthritis_txt;
    
    @FindBy(xpath = "//a[text()='How to Relieve Joint Pain']")
    private static WebElement relievejointpain;
    
    @FindBy(xpath = "//span[text()='Arthritis Joint Pain Relief: Find the Right Option for You']")
    private static WebElement relievejointpain_txt;
    
    @FindBy(xpath = "//a[text()='Arthritis Diet']")
    private static WebElement Arthritisdiet;
    
    @FindBy(xpath = "//span[text()='Arthritis Diet: Foods to Help Arthritis']")
    private static WebElement Arthritisdiet_txt;
    
    @FindBy(xpath = "//a[text()='Exercises for Lower Back Arthritis']")
    private static WebElement lowerbackarthritis;
    
    @FindBy(xpath = "//span[text()='404 - Page not found']")
    private static WebElement lowerbackarthritis_txt;
    
    @FindBy(xpath = "//a[text()='How to Relieve Wrist Pain']")
    private static WebElement relievewristpain;
    
    @FindBy(xpath = "//span[text()='How to Relieve Arthritis Wrist Pain']")
    private static WebElement relievewristpain_txt;
    
    @FindBy(xpath = "//a[text()='How to manage your arthritis']")
    private static WebElement managearthritis;
    
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement managearthritis_txt;
    
    @FindBy(xpath = "//a[text()='Knee braces for osteoarthritis']")
    private static WebElement kneebraces;
    
    @FindBy(xpath = "//span[text()='Knee Braces for Osteoarthritis']")
    private static WebElement kneebraces_txt;
    
    @FindBy(xpath = "//a[text()='Managing arthritis at home']")
    private static WebElement managingarthritishome;
    
    @FindBy(xpath = "//span[text()='Arthritis Pain Relief at Home']")
    private static WebElement managingarthritishome_txt;
    
    @FindBy(xpath = "//a[text()='Managing arthritis with your family']")
    private static WebElement managingarthritisfamily;
    
    @FindBy(xpath = "//span[text()='How to Manage Arthritis With Your Family']")
    private static WebElement managingarthritisfamily_txt;
	
    @FindBy(xpath = "//a[text()='Living independently with arthritis & how to manage']")
    private static WebElement livingindependentlymanage;
    
    @FindBy(xpath = "//span[text()='Living Alone With Arthritis']")
    private static WebElement livingindependentlymanage_txt;
    
    @FindBy(xpath = "//a[text()='Managing arthritis in social settings']")
    private static WebElement managingsocialsetting;
    
    @FindBy(xpath = "//span[text()='How to Manage Arthritis in Social Settings']")
    private static WebElement managingsocialsetting_txt;
    
    @FindBy(xpath = "//a[text()='Managing arthritis at work']")
    private static WebElement managingarthritiswork;
    
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement managingarthritiswork_txt;
    
    @FindBy(xpath = "//a[text()='How to prevent arthritis']")
    private static WebElement preventarthritis;
    
    @FindBy(xpath = "//span[text()='How to Prevent Arthritis – Arthritis Prevention Tips and Methods']")
    private static WebElement preventarthritis_txt;
    
    @FindBy(xpath = "//a[text()='Joint Pain Medicine']")
    private static WebElement jointpainmedicines;
    
    @FindBy(xpath = "//span[text()='Arthritis Joint Pain Medication: Which Option Is Right for You?']")
    private static WebElement jointpainmedicines_txt;
    
    @FindBy(xpath = "//a[text()='OTC Arthritis Medication']")
    private static WebElement OTCarthritisMedication;
    
    @FindBy(xpath = "//span[text()='Over-the-Counter Arthritis Medication for Pain Relief']")
    private static WebElement OTCarthritisMedication_txt;
    
    @FindBy(xpath = "//a[text()='Tylenol Alternatives for Arthritis Pain']")
    private static WebElement tylenolalternativespain;
    
    @FindBy(xpath = "//span[text()='Alternatives to Tylenol for Arthritis Pain']")
    private static WebElement tylenolalternativespain_txt;
    
    @FindBy(xpath = "//a[text()='How OTC Arthritis Cream Gel Works']")
    private static WebElement howOTCgelworks;
    
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
    private static WebElement howOTCgelworks_txt;
    
    @FindBy(xpath = "//a[text()='Over the Counter Diclofenac Gel']")
    private static WebElement counterdiclofenac;
    
    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
    private static WebElement counterdiclofenac_txt;
    
    @FindBy(xpath = "//a[text()='What Foods to Avoid When You Have Arthritis']")
    private static WebElement whatfoodhavearthritis;
    
    @FindBy(xpath = "//span[text()='5 Foods to Avoid When You Have Arthritis']")
    private static WebElement whatfoodhavearthritis_txt;
    
    @FindBy(xpath = "//ul[@role='list']//a[@href='/living-with-arthritis/is-arthritis-hereditary/']")
    private static WebElement arthritishereditary;
    
    @FindBy(xpath = "//span[text()='Is Arthritis Hereditary?']")
    private static WebElement arthritishereditary_txt;
    
    @FindBy(xpath = "//a[text()='Morning Routine for Arthritis Relief']")
    private static WebElement morningroutinerelief;
    
    @FindBy(xpath = "//span[text()='Morning Routine for Arthritis Relief']")
    private static WebElement morningroutinerelief_txt;
    
    @FindBy(xpath = "//a[text()='How to Manage Pain While Traveling']")
    private static WebElement managepaintravelling;
    
    @FindBy(xpath = "//span[text()='How to Manage Pain While Traveling: 10 Arthritis Management Strategies and Solutions']")
    private static WebElement managepaintravelling_txt;
    
    @FindBy(xpath = "//a[text()='Lidocaine for Arthritis']")
    private static WebElement lidocianearthritis;
    
    @FindBy(xpath = "//h1[@style='text-align: center;']")
    private static WebElement lidocianearthritis_txt;
    
    @FindBy(xpath = "//a[text()='Exercises for arthritis & joint pain relief']")
    private static WebElement exercisejointpainrelief;
    
    @FindBy(xpath = "//h1[text()='Exercises for Arthritis & Joint Pain Relief']")
    private static WebElement exercisejointpainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Wrist exercises for arthritis pain relief']")
    private static WebElement wristexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Wrist Exercises for Arthritis Pain Relief']")
    private static WebElement wristexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Hand exercises for arthritis pain relief']")
    private static WebElement handexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Hand Exercises for Arthritis Pain Relief']")
    private static WebElement handexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Knee exercises for arthritis pain relief']")
    private static WebElement kneeexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Knee Exercises for Arthritis Pain Relief']")
    private static WebElement kneeexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Elbow exercises for arthritis pain relief']")
    private static WebElement elbowexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Elbow Exercises for Arthritis Pain Relief']")
    private static WebElement elbowexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Ankle exercises for arthritis pain relief']")
    private static WebElement ankleexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Ankle Exercises for Arthritis Pain Relief']")
    private static WebElement ankleexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Foot exercises for arthritis pain relief']")
    private static WebElement footexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='Foot Exercises for Arthritis Pain Relief']")
    private static WebElement footexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Ab exercises for arthritis pain relief']")
    private static WebElement Abexercisepainrelief;
    
    @FindBy(xpath = "//span[text()='5 Arthritis-Friendly Ab Workouts You Can Do at Home']")
    private static WebElement Abexercisepainrelief_txt;
    
    @FindBy(xpath = "//a[text()='How to get fit at home without gym equipment']")
    private static WebElement gymequipement;
    
    @FindBy(xpath = "//span[text()='How to Get Fit at Home Without Gym Equipment']")
    private static WebElement gymequipement_txt;
    
    @FindBy(xpath = "//a[text()='Exercises for Arthritis']")
    private static WebElement exercisesarthrist;
    
    @FindBy(xpath = "//span[text()='Exercises for Arthritis']")
    private static WebElement exercisesarthrist_txt;
    
    @FindBy(xpath = "//a[text()='How to relieve knee pain']")
    private static WebElement relievekneepain;
    
    @FindBy(xpath = "//span[text()='How to Relieve Knee Pain']")
    private static WebElement relievekneepain_txt;
    
    @FindBy(xpath = "//a[text()='Standing Stretches to Relieve Arthritis Pain']")
    private static WebElement standingstreches;
    
    @FindBy(xpath = "//span[text()='Knee Stretches to Relieve Osteoarthritis Pain']")
    private static WebElement standingstreches_txt;
    
    @FindBy(xpath = "//a[text()='Why Arthritis Hurts at Night']")
    private static WebElement arthritishurtsnight;
    
    @FindBy(xpath = "//span[text()='Why Arthritis Hurts at Night']")
    private static WebElement arthritishurtsnight_txt;
    
    @FindBy(xpath = "//a[text()='How to relieve arthritis pain']")
    private static WebElement relievearthritispain;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement relievearthritispain_txt;
    
    @FindBy(xpath = "//a[text()='Natural remedies for arthritis pain relief']")
    private static WebElement naturalremediespainrelief;
    
    @FindBy(xpath = "//span[text()='Natural Remedies for Arthritis Pain Relief']")
    private static WebElement naturalremediespainrelief_txt;
    
    @FindBy(xpath = "//a[text()='Stress and arthritis']")
    private static WebElement stressarthritis;
    
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement stressarthritis_txt;
    
    @FindBy(xpath = "//a[text()='The effects of aging on the body']")
    private static WebElement effectagingbody;
    
    @FindBy(xpath = "//span[text()='What are the Effects of Aging on the Body']")
    private static WebElement effectagingbody_txt;
    
    @FindBy(xpath = "//a[text()='Use your head to navigate websites']")
    private static WebElement navigatewebsite;
    
    @FindBy(xpath = "//span[text()='How to Navigate Websites Hands Free']")
    private static WebElement navigatewebsite_txt;
    
    @FindBy(xpath = "//a[text()='The first arthritis-friendly site designed for you']")
    private static WebElement arthritisfriendlysite;
    
    @FindBy(xpath = "//span[text()='The First Arthritis-Friendly Website, Designed for You']")
    private static WebElement arthritisfriendlysite_txt;
    
    @FindBy(xpath = "//a[text()='Yoga for Arthritis: Poses for Physical Comfort']")
    private static WebElement yogaarthritis;
    
    @FindBy(xpath = "//span[text()='Yoga for Arthritis: Poses for Physical Comfort']")
    private static WebElement yogaarthritis_txt;
    
    @FindBy(xpath = "//a[text()='Coupons']")
    private static WebElement coupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement coupons_txt;
    
    @FindBy(xpath = "//a[text()='Faqs']")
    private static WebElement faqs;
    
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement faqs_txt;
    
    @FindBy(xpath = "//a[text()='Fsa hsa eligibility']")
    private static WebElement Fsahsa;
    
    @FindBy(xpath = "//span[text()='Using My FSA or HSA to Purchase Voltaren Products']")
    private static WebElement Fsahsa_txt;
    
    @FindBy(xpath = "//a[text()='Contact us']")
    private static WebElement contactus;
    
    @FindBy(xpath = "//h1[text()='Contact Us']")
    private static WebElement contactus_txt;
    
    @FindBy(xpath = "//a[text()='Supporting Caregivers']")
    private static WebElement supportingcaregivers;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-25-top-dt first odd last component col-xs-9 col-sm-10 col-md-5 col-lg-5']//h1[@id='banner01']")
    private static WebElement supportingcaregivers_txt;
    
    @FindBy(xpath = "//a[text()='What are the Signs of Caregiver Depression?']")
    private static WebElement caregiverdepression;
    
    @FindBy(xpath = "//span[text()='What are the Signs of Caregiver Depression?']")
    private static WebElement caregiverdepressionq_txt;
    
    @FindBy(xpath = "//a[text()='Health and Wellness Tips for Caregivers']")
    private static WebElement healthwellness;
    
    @FindBy(xpath = "//span[text()='Health and Wellness Tips for Caregivers']")
    private static WebElement healthwellness_txt;
    
    @FindBy(xpath = "//a[text()='What is a Caregiver?']")
    private static WebElement whatiscaregiver;
    
    @FindBy(xpath = "//span[text()='What Is a Caregiver?']")
    private static WebElement whatiscaregiver_txt;
    
    @FindBy(xpath = "//a[text()='What Is Caregiver Burden? Symptoms and Signs']")
    private static WebElement caregiverburden;
    
    @FindBy(xpath = "//span[text()='What Is Caregiver Burden?']")
    private static WebElement caregiverburden_txt;
    
    @FindBy(xpath = "//a[text()='What Is Caregiver Fatigue?']")
    private static WebElement caregiverfatigue;
    
    @FindBy(xpath = "//span[text()='What Is Caregiver Fatigue?']")
    private static WebElement caregiverfatigue_txt;
    
    @FindBy(xpath = "//a[text()='What Is Caregiver Burnout and Stress?']")
    private static WebElement caregiverburnoutstress;
    
    @FindBy(xpath = "//span[text()='What Is Caregiver Burnout and Stress?']")
    private static WebElement caregiverburnoutstress_txt;
    
    @FindBy(xpath = "//a[text()='Caregiver Support and Resources']")
    private static WebElement supportresources;
    
    @FindBy(xpath = "//span[text()='Caregiver Support and Resources']")
    private static WebElement supportresources_txt;
    
    @FindBy(xpath = "//a[text()='The Best Caregiver Self-Care Tips']")
    private static WebElement caregiverselfcaretips;
    
    @FindBy(xpath = "//span[text()='The Best Caregiver Self-Care Tips']")
    private static WebElement caregiverselfcaretips_txt;
    
    @FindBy(xpath = "//a[text()='What Is Caregiver Role Strain? Tips & Prevention']")
    private static WebElement tipsandpreventions;
    
    @FindBy(xpath = "//span[text()='What Is Caregiver Role Strain?']")
    private static WebElement tipsandpreventions_txt;
    
    @FindBy(xpath = "//a[text()='Caregiver vs. Caretaker']")
    private static WebElement caregivervscaretaker;
    
    @FindBy(xpath = "//span[text()='Caregiver Vs. Caretaker: What’s the Difference?']")
    private static WebElement caregivervscaretaker_txt;
    
    
    
    
    
    
    
    
    
	
//methods
	
    public void clickCookieBtn() throws Exception {
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
    public void clickGigyaForm() throws Exception {
       waitForPageLoadJava();
        try {
            if (gigyaForm.isDisplayed()) {
                clickElementUsingJavaScript(gigyaForm);
            }
           // visibilityOf(gigyaClose);
            implicitWait();
            actionClick(gigyaClose);
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
           // elementClick(gigyaClose);
           // actionClick(gigyaClose);
        } catch (Exception e) {
       }
        
		}
    public void clickonHomepageBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(homepage_breadcrumbs);
    	clickElementUsingJavaScript(homepage_breadcrumbs);
    	pageLoad();
    }
    public void clickonSitemapBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(sitemap_breadcrumbs);
    	clickElementUsingJavaScript(sitemap_breadcrumbs);
    	pageLoad();
    }
    public void clickonforprofessionals() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(forprofessionals);
    	clickElementUsingJavaScript(forprofessionals);
    	pageLoad();
    }
    public void clickonvoltarengel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarengel);
    	moveToElement(voltarengel);
    	clickElementUsingJavaScript(voltarengel);
    	visibilityOf(voltarengel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarengel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarengel_txt));
    	pageLoad();
    }
    public void clickonAboutVoltaren() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(aboutvoltaren);
    	moveToElement(aboutvoltaren);
    	clickElementUsingJavaScript(aboutvoltaren);
    	visibilityOf(aboutvoltaren_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(aboutvoltaren_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(aboutvoltaren_txt));
    	pageLoad();
    }
    public void clickonReadReviews() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(readreviews);
    	moveToElement(readreviews);
    	clickElementUsingJavaScript(readreviews);
    	visibilityOf(readreviews_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(readreviews_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(readreviews_txt));
    	pageLoad();
    }
    public void clickonVoltarenDifferent() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferent);
    	moveToElement(voltarendifferent);
    	clickElementUsingJavaScript(voltarendifferent);
    	visibilityOf(voltarendifferent_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferent_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarendifferent_txt));
    	pageLoad();
    }
    public void clickonTestimonals() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(testimonials);
    	moveToElement(testimonials);
    	clickElementUsingJavaScript(testimonials);
    	visibilityOf(testimonials_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(testimonials_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(testimonials_txt));
    	pageLoad();
    }
    public void clickonWhatisArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(whatisarthrist);
    	moveToElement(whatisarthrist);
    	clickElementUsingJavaScript(whatisarthrist);
    	visibilityOf(whatisarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(whatisarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(whatisarthrist_txt));
    	pageLoad();
    }
    public void clickondifferenttypesArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(differenttypesarthrist);
    	moveToElement(differenttypesarthrist);
    	clickElementUsingJavaScript(differenttypesarthrist);
    	visibilityOf(differenttypesarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(differenttypesarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(differenttypesarthrist_txt));
    	pageLoad();
    }
    public void clickonSymptomsArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptomsarthrits);
    	moveToElement(symptomsarthrits);
    	clickElementUsingJavaScript(symptomsarthrits);
    	visibilityOf(symptomsarthrits_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(symptomsarthrits_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(symptomsarthrits_txt));
    	pageLoad();
    }
    public void clickonCausesArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(causesarthritis);
    	moveToElement(causesarthritis);
    	clickElementUsingJavaScript(causesarthritis);
    	visibilityOf(causesarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(causesarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(causesarthritis_txt));
    	pageLoad();
    }
    public void clickonIntrestingfacts() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(intrestingfacts);
    	moveToElement(intrestingfacts);
    	clickElementUsingJavaScript(intrestingfacts);
    	visibilityOf(intrestingfacts_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(intrestingfacts_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(intrestingfacts_txt));
    	pageLoad();
    }
    public void clickonfootarthritissymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(footarthritissymptoms);
    	moveToElement(footarthritissymptoms);
    	clickElementUsingJavaScript(footarthritissymptoms);
    	visibilityOf(footarthritissymptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(footarthritissymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(footarthritissymptoms_txt));
    	pageLoad();
    }
    public void clickonEarlysignOsteoarthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(earlysignsOsteoarthritis);
    	moveToElement(earlysignsOsteoarthritis);
    	clickElementUsingJavaScript(earlysignsOsteoarthritis);
    	visibilityOf(earlysignsOsteoarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(earlysignsOsteoarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(earlysignsOsteoarthritis_txt));
    	pageLoad();
    }
    
    public void clickonAnklearthritissymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(anklearthritissymptoms);
    	moveToElement(anklearthritissymptoms);
    	clickElementUsingJavaScript(anklearthritissymptoms);
    	visibilityOf(anklearthritissymptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(anklearthritissymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(anklearthritissymptoms_txt));
    	pageLoad();
    }
    public void clickonUnderstandingpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(understandingpain);
    	moveToElement(understandingpain);
    	clickElementUsingJavaScript(understandingpain);
    	visibilityOf(understandingpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(understandingpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(understandingpain_txt));
    	pageLoad();
    }
    public void clickonAboutpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(aboutpain);
    	moveToElement(aboutpain);
    	clickElementUsingJavaScript(aboutpain);
    	visibilityOf(aboutpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(aboutpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(aboutpain_txt));
    	pageLoad();
    }
    public void clickonImpactpainworld() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(impactpainworld);
    	moveToElement(impactpainworld);
    	clickElementUsingJavaScript(impactpainworld);
    	visibilityOf(impactpainworld_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(impactpainworld_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(impactpainworld_txt));
    	pageLoad();
    }
    
    public void clickonweatheraffectspain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(weatheraffectspain);
    	moveToElement(weatheraffectspain);
    	clickElementUsingJavaScript(weatheraffectspain);
    	visibilityOf(weatheraffectspain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(weatheraffectspain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(weatheraffectspain_txt));
    	pageLoad();
    }
    public void clickonMorningjointpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(morningjointpain);
    	moveToElement(morningjointpain);
    	clickElementUsingJavaScript(morningjointpain);
    	visibilityOf(morningjointpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(morningjointpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(morningjointpain_txt));
    	pageLoad();
    }
    public void clickonArthritisDiagnosed() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristDiagnosed);
    	moveToElement(arthristDiagnosed);
    	clickElementUsingJavaScript(arthristDiagnosed);
    	visibilityOf(arthristDiagnosed_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristDiagnosed_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristDiagnosed_txt));
    	pageLoad();
    }
    public void clickonSymptomstreatment() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptomstreatment);
    	moveToElement(symptomstreatment);
    	clickElementUsingJavaScript(symptomstreatment);
    	visibilityOf(symptomstreatment_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(symptomstreatment_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(symptomstreatment_txt));
    	pageLoad();
    }
    public void clickonSorekneecauses() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(sorekneecauses);
    	moveToElement(sorekneecauses);
    	clickElementUsingJavaScript(sorekneecauses);
    	visibilityOf(sorekneecauses_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(sorekneecauses_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(sorekneecauses_txt));
    	pageLoad();
    }
    public void clickonlivingwitharthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwitharthritis);
    	moveToElement(livingwitharthritis);
    	clickElementUsingJavaScript(livingwitharthritis);
    	visibilityOf(livingwitharthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwitharthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwitharthritis_txt));
    	pageLoad();
    }
    public void clickonRelievejointpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relievejointpain);
    	moveToElement(relievejointpain);
    	clickElementUsingJavaScript(relievejointpain);
    	visibilityOf(relievejointpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relievejointpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relievejointpain_txt));
    	pageLoad();
    }
    public void clickonArthritisDiet() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Arthritisdiet);
    	moveToElement(Arthritisdiet);
    	clickElementUsingJavaScript(Arthritisdiet);
    	visibilityOf(Arthritisdiet_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Arthritisdiet_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Arthritisdiet_txt));
    	pageLoad();
    }
    public void clickonlowerbackarthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(lowerbackarthritis);
    	moveToElement(lowerbackarthritis);
    	clickElementUsingJavaScript(lowerbackarthritis);
    	visibilityOf(lowerbackarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(lowerbackarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(lowerbackarthritis_txt));
    	pageLoad();
    }
    public void clickonRelievewristArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relievewristpain);
    	moveToElement(relievewristpain);
    	clickElementUsingJavaScript(relievewristpain);
    	visibilityOf(relievewristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relievewristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relievewristpain_txt));
    	pageLoad();
    }
    public void clickonManagingArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managearthritis);
    	moveToElement(managearthritis);
    	clickElementUsingJavaScript(managearthritis);
    	visibilityOf(managearthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managearthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managearthritis_txt));
    	pageLoad();
    }
    public void clickonKneebraces() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(kneebraces);
    	moveToElement(kneebraces);
    	clickElementUsingJavaScript(kneebraces);
    	visibilityOf(kneebraces_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(kneebraces_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(kneebraces_txt));
    	pageLoad();
    }
    public void clickonManagingArthritishome() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managingarthritishome);
    	moveToElement(managingarthritishome);
    	clickElementUsingJavaScript(managingarthritishome);
    	visibilityOf(managingarthritishome_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managingarthritishome_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managingarthritishome_txt));
    	pageLoad();
    }
    public void clickonManagingArthritisfamily() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managingarthritisfamily);
    	moveToElement(managingarthritisfamily);
    	clickElementUsingJavaScript(managingarthritisfamily);
    	visibilityOf(managingarthritisfamily_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managingarthritisfamily_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managingarthritisfamily_txt));
    	pageLoad();
    }
    public void clickonlivingIndependentlymanage() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingindependentlymanage);
    	moveToElement(livingindependentlymanage);
    	clickElementUsingJavaScript(livingindependentlymanage);
    	visibilityOf(livingindependentlymanage_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingindependentlymanage_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingindependentlymanage_txt));
    	pageLoad();
    }
    public void clickonManagingsocialsetting() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managingsocialsetting);
    	moveToElement(managingsocialsetting);
    	clickElementUsingJavaScript(managingsocialsetting);
    	visibilityOf(managingsocialsetting_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managingsocialsetting_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managingsocialsetting_txt));
    	pageLoad();
    }
    public void clickonManagingarthritiswork() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managingarthritiswork);
    	moveToElement(managingarthritiswork);
    	clickElementUsingJavaScript(managingarthritiswork);
    	visibilityOf(managingarthritiswork_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managingarthritiswork_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managingarthritiswork_txt));
    	pageLoad();
    }
    public void clickonPreventArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(preventarthritis);
    	moveToElement(preventarthritis);
    	clickElementUsingJavaScript(preventarthritis);
    	visibilityOf(preventarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(preventarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(preventarthritis_txt));
    	pageLoad();
    }
    public void clickonjointpainmedicines() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(jointpainmedicines);
    	moveToElement(jointpainmedicines);
    	clickElementUsingJavaScript(jointpainmedicines);
    	visibilityOf(jointpainmedicines_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(jointpainmedicines_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(jointpainmedicines_txt));
    	pageLoad();
    }
    public void clickonOTCArthristmedication() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(OTCarthritisMedication);
    	moveToElement(OTCarthritisMedication);
    	clickElementUsingJavaScript(OTCarthritisMedication);
    	visibilityOf(OTCarthritisMedication_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(OTCarthritisMedication_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(OTCarthritisMedication_txt));
    	pageLoad();
    }
    public void clickonTylenolalternativepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(tylenolalternativespain);
    	moveToElement(tylenolalternativespain);
    	clickElementUsingJavaScript(tylenolalternativespain);
    	visibilityOf(tylenolalternativespain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(tylenolalternativespain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(tylenolalternativespain_txt));
    	pageLoad();
    }
    public void clickonHowotcgelworks() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(howOTCgelworks);
    	moveToElement(howOTCgelworks);
    	clickElementUsingJavaScript(howOTCgelworks);
    	visibilityOf(howOTCgelworks_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(howOTCgelworks_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(howOTCgelworks_txt));
    	pageLoad();
    }
    public void clickoncounterDiclofenacgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(counterdiclofenac);
    	moveToElement(counterdiclofenac);
    	clickElementUsingJavaScript(counterdiclofenac);
    	visibilityOf(counterdiclofenac_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(counterdiclofenac_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(counterdiclofenac_txt));
    	pageLoad();
    }
    public void clickonwhatfoodhavearthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(whatfoodhavearthritis);
    	moveToElement(whatfoodhavearthritis);
    	clickElementUsingJavaScript(whatfoodhavearthritis);
    	visibilityOf(whatfoodhavearthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(whatfoodhavearthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(whatfoodhavearthritis_txt));
    	pageLoad();
    }
    public void clickonArthritisHereditary() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthritishereditary);
    	moveToElement(arthritishereditary);
    	clickElementUsingJavaScript(arthritishereditary);
    	visibilityOf(arthritishereditary_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthritishereditary_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthritishereditary_txt));
    	pageLoad();
    }
    public void clickonMorningRoutineRelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(morningroutinerelief);
    	moveToElement(morningroutinerelief);
    	clickElementUsingJavaScript(morningroutinerelief);
    	visibilityOf(morningroutinerelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(morningroutinerelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(morningroutinerelief_txt));
    	pageLoad();
    }
    public void clickonManagepaintravelling() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managepaintravelling);
    	moveToElement(managepaintravelling);
    	clickElementUsingJavaScript(managepaintravelling);
    	visibilityOf(managepaintravelling_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managepaintravelling_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managepaintravelling_txt));
    	pageLoad();
    }
    public void clickonlidocainearthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(lidocianearthritis);
    	moveToElement(lidocianearthritis);
    	clickElementUsingJavaScript(lidocianearthritis);
    	visibilityOf(lidocianearthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(lidocianearthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(lidocianearthritis_txt));
    	pageLoad();
    }
    public void clickonExercisejointpainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(exercisejointpainrelief);
    	moveToElement(exercisejointpainrelief);
    	clickElementUsingJavaScript(exercisejointpainrelief);
    	visibilityOf(exercisejointpainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exercisejointpainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(exercisejointpainrelief_txt));
    	pageLoad();
    }
    public void clickonwristexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(wristexercisepainrelief);
    	moveToElement(wristexercisepainrelief);
    	clickElementUsingJavaScript(wristexercisepainrelief);
    	visibilityOf(wristexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(wristexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(wristexercisepainrelief_txt));
    	pageLoad();
    }
    
    public void clickonhandexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(handexercisepainrelief);
    	moveToElement(handexercisepainrelief);
    	clickElementUsingJavaScript(handexercisepainrelief);
    	visibilityOf(handexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(handexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(handexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickonkneeexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(kneeexercisepainrelief);
    	moveToElement(kneeexercisepainrelief);
    	clickElementUsingJavaScript(kneeexercisepainrelief);
    	visibilityOf(kneeexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(kneeexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(kneeexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickonelbowexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(elbowexercisepainrelief);
    	moveToElement(elbowexercisepainrelief);
    	clickElementUsingJavaScript(elbowexercisepainrelief);
    	visibilityOf(elbowexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(elbowexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(elbowexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickonankleexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ankleexercisepainrelief);
    	moveToElement(ankleexercisepainrelief);
    	clickElementUsingJavaScript(ankleexercisepainrelief);
    	visibilityOf(ankleexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ankleexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ankleexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickonfootexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(footexercisepainrelief);
    	moveToElement(footexercisepainrelief);
    	clickElementUsingJavaScript(footexercisepainrelief);
    	visibilityOf(footexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(footexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(footexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickonAbexercisepainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Abexercisepainrelief);
    	moveToElement(Abexercisepainrelief);
    	clickElementUsingJavaScript(Abexercisepainrelief);
    	visibilityOf(Abexercisepainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Abexercisepainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Abexercisepainrelief_txt));
    	pageLoad();
    }
    public void clickongymequipment() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(gymequipement);
    	moveToElement(gymequipement);
    	clickElementUsingJavaScript(gymequipement);
    	visibilityOf(gymequipement_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(gymequipement_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(gymequipement_txt));
    	pageLoad();
    }
    public void clickonexercisearthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(exercisesarthrist);
    	moveToElement(exercisesarthrist);
    	clickElementUsingJavaScript(exercisesarthrist);
    	visibilityOf(exercisesarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exercisesarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(exercisesarthrist_txt));
    	pageLoad();
    }
    public void clickonRelievekneepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relievekneepain);
    	moveToElement(relievekneepain);
    	clickElementUsingJavaScript(relievekneepain);
    	visibilityOf(relievekneepain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relievekneepain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relievekneepain_txt));
    	pageLoad();
    }
    public void clickonStandingstreches() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(standingstreches);
    	moveToElement(standingstreches);
    	clickElementUsingJavaScript(standingstreches);
    	visibilityOf(standingstreches_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(standingstreches_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(standingstreches_txt));
    	pageLoad();
    }
    public void clickonArthritisnight() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthritishurtsnight);
    	moveToElement(arthritishurtsnight);
    	clickElementUsingJavaScript(arthritishurtsnight);
    	visibilityOf(arthritishurtsnight_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthritishurtsnight_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthritishurtsnight_txt));
    	pageLoad();
    }
    public void clickonRelieveArthritispain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relievearthritispain);
    	moveToElement(relievearthritispain);
    	clickElementUsingJavaScript(relievearthritispain);
    	visibilityOf(relievearthritispain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relievearthritispain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relievearthritispain_txt));
    	pageLoad();
    }
    public void clickonNaturalremediespainRelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(naturalremediespainrelief);
    	moveToElement(naturalremediespainrelief);
    	clickElementUsingJavaScript(naturalremediespainrelief);
    	visibilityOf(naturalremediespainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(naturalremediespainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(naturalremediespainrelief_txt));
    	pageLoad();
    }
    public void clickonstressarthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(stressarthritis);
    	moveToElement(stressarthritis);
    	clickElementUsingJavaScript(stressarthritis);
    	visibilityOf(stressarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(stressarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(stressarthritis_txt));
    	pageLoad();
    }
    public void clickoneffectsagingbody() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(effectagingbody);
    	moveToElement(effectagingbody);
    	clickElementUsingJavaScript(effectagingbody);
    	visibilityOf(effectagingbody_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(effectagingbody_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(effectagingbody_txt));
    	pageLoad();
    }
    public void clickonNavigatewebsite() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(navigatewebsite);
    	moveToElement(navigatewebsite);
    	clickElementUsingJavaScript(navigatewebsite);
    	visibilityOf(navigatewebsite_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(navigatewebsite_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(navigatewebsite_txt));
    	pageLoad();
    }
    public void clickonArthritisfriendlysite() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthritisfriendlysite);
    	moveToElement(arthritisfriendlysite);
    	clickElementUsingJavaScript(arthritisfriendlysite);
    	visibilityOf(arthritisfriendlysite_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthritisfriendlysite_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthritisfriendlysite_txt));
    	pageLoad();
    }
    public void clickonYogaArthritis() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(yogaarthritis);
    	moveToElement(yogaarthritis);
    	clickElementUsingJavaScript(yogaarthritis);
    	visibilityOf(yogaarthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(yogaarthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(yogaarthritis_txt));
    	pageLoad();
    }
    public void clickonCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(coupons);
    	moveToElement(coupons);
    	clickElementUsingJavaScript(coupons);
    	visibilityOf(coupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(coupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(coupons_txt));
    	pageLoad();
    }
    public void clickonFaqs() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(faqs);
    	moveToElement(faqs);
    	clickElementUsingJavaScript(faqs);
    	visibilityOf(faqs_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(faqs_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(faqs_txt));
    	pageLoad();
    }
    public void clickonFsahsa() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Fsahsa);
    	moveToElement(Fsahsa);
    	clickElementUsingJavaScript(Fsahsa);
    	visibilityOf(Fsahsa_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Fsahsa_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Fsahsa_txt));
    	pageLoad();
    }
    public void clickonContactus() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(contactus);
    	moveToElement(contactus);
    	clickElementUsingJavaScript(contactus);
    	visibilityOf(contactus_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(contactus_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(contactus_txt));
    	pageLoad();
    }
    public void clickonSupportingcaregivers() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(supportingcaregivers);
    	moveToElement(supportingcaregivers);
    	clickElementUsingJavaScript(supportingcaregivers);
    	visibilityOf(supportingcaregivers_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(supportingcaregivers_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(supportingcaregivers_txt));
    	pageLoad();
    }
    public void clickonCaregiverdepression() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregiverdepression);
    	moveToElement(caregiverdepression);
    	clickElementUsingJavaScript(caregiverdepression);
    	visibilityOf(caregiverdepressionq_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregiverdepressionq_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregiverdepressionq_txt));
    	pageLoad();
    }
    public void clickonHealthWellness() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(healthwellness);
    	moveToElement(healthwellness);
    	clickElementUsingJavaScript(healthwellness);
    	visibilityOf(healthwellness_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(healthwellness_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(healthwellness_txt));
    	pageLoad();
    }
    public void clickonwhatiscaregiver() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(whatiscaregiver);
    	moveToElement(whatiscaregiver);
    	clickElementUsingJavaScript(whatiscaregiver);
    	visibilityOf(whatiscaregiver_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(whatiscaregiver_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(whatiscaregiver_txt));
    	pageLoad();
    }
    public void clickonCaregivenburden() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregiverburden);
    	moveToElement(caregiverburden);
    	clickElementUsingJavaScript(caregiverburden);
    	visibilityOf(caregiverburden_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregiverburden_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregiverburden_txt));
    	pageLoad();
    }
    public void clickonCaregivenfatigue() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregiverfatigue);
    	moveToElement(caregiverfatigue);
    	clickElementUsingJavaScript(caregiverfatigue);
    	visibilityOf(caregiverfatigue_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregiverfatigue_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregiverfatigue_txt));
    	pageLoad();
    }
    public void clickonCaregivenburnoutstress() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregiverburnoutstress);
    	moveToElement(caregiverburnoutstress);
    	clickElementUsingJavaScript(caregiverburnoutstress);
    	visibilityOf(caregiverburnoutstress_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregiverburnoutstress_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregiverburnoutstress_txt));
    	pageLoad();
    }
    public void clickonSupportResources() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(supportresources);
    	moveToElement(supportresources);
    	clickElementUsingJavaScript(supportresources);
    	visibilityOf(supportresources_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(supportresources_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(supportresources_txt));
    	pageLoad();
    }
    public void clickonCaregiverselfcaretips() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregiverselfcaretips);
    	moveToElement(caregiverselfcaretips);
    	clickElementUsingJavaScript(caregiverselfcaretips);
    	visibilityOf(caregiverselfcaretips_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregiverselfcaretips_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregiverselfcaretips_txt));
    	pageLoad();
    }
    public void clickontipsprevention() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(tipsandpreventions);
    	moveToElement(tipsandpreventions);
    	clickElementUsingJavaScript(tipsandpreventions);
    	visibilityOf(tipsandpreventions_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(tipsandpreventions_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(tipsandpreventions_txt));
    	pageLoad();
    }
    public void clickoncaregivervscaretaker() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(caregivervscaretaker);
    	moveToElement(caregivervscaretaker);
    	clickElementUsingJavaScript(caregivervscaretaker);
    	visibilityOf(caregivervscaretaker_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregivervscaretaker_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregivervscaretaker_txt));
    	pageLoad();
    }
    
    
    
    
    
    
    
    

}
