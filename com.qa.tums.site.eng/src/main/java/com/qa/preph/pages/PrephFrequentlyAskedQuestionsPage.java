package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephFrequentlyAskedQuestionsPage extends BaseClass{
	
	public PrephFrequentlyAskedQuestionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//span[text()='What’s the difference between hemorrhoids and piles?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccTwo;
	
	@FindBy(xpath = "//span[text()='What’s the difference between hemorrhoids and piles?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What’s the difference between hemorrhoids and piles?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='What’s the difference between internal and external hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccThree;
	
	@FindBy(xpath = "//span[text()='What’s the difference between internal and external hemorrhoids?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveThree;
	
	@FindBy(xpath = "//span[text()='What’s the difference between internal and external hemorrhoids?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseThree;
	
	@FindBy(xpath = "//span[text()='How common are hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccFour;
	
	@FindBy(xpath = "//span[text()='How common are hemorrhoids?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveFour;
	
	@FindBy(xpath = "//span[text()='How common are hemorrhoids?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Why do pregnant women and new moms get hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccFive;
	
	@FindBy(xpath = "//span[text()='Why do pregnant women and new moms get hemorrhoids?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Why do pregnant women and new moms get hemorrhoids?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids life threatening?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccSix;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids life threatening?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids life threatening?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseSix;
	
	@FindBy(xpath = "//span[text()='How do I know if I need surgery for my hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccSeven;
	
	@FindBy(xpath = "//span[text()='How do I know if I need surgery for my hemorrhoids?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='How do I know if I need surgery for my hemorrhoids?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseSeven;
	
	@FindBy(xpath = "//span[text()='What do I do about bleeding hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccEight;
	
	@FindBy(xpath = "//span[text()='What do I do about bleeding hemorrhoids?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveEight;
	
	@FindBy(xpath = "//span[text()='What do I do about bleeding hemorrhoids?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseEight;
	
	@FindBy(xpath = "//span[text()='Do hemorrhoids go away? Can hemorrhoids be cured?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccNine;
	
	@FindBy(xpath = "//span[text()='Do hemorrhoids go away? Can hemorrhoids be cured?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveNine;
	
	@FindBy(xpath = "//span[text()='Do hemorrhoids go away? Can hemorrhoids be cured?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseNine;
	
	@FindBy(xpath = "//span[text()='What is a flare-up?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccTen;
	
	@FindBy(xpath = "//span[text()='What is a flare-up?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveTen;
	
	@FindBy(xpath = "//span[text()='What is a flare-up?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseTen;
	
	@FindBy(xpath = "//span[text()='How long does a flare-up last?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccEleven;
	
	@FindBy(xpath = "//span[text()='How long does a flare-up last?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveEleven;
	
	@FindBy(xpath = "//span[text()='How long does a flare-up last?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseEleven;
	
	@FindBy(xpath = "//span[text()='How can I reduce the risk of a flare-up?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccTweleve;
	
	@FindBy(xpath = "//span[text()='How can I reduce the risk of a flare-up?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveTweleve;
	
	@FindBy(xpath = "//span[text()='How can I reduce the risk of a flare-up?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseTweleve;
	
	@FindBy(xpath = "//span[text()='How can I treat my symptoms away from home?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccThirteen;
	
	@FindBy(xpath = "//span[text()='How can I treat my symptoms away from home?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveThirteen;
	
	@FindBy(xpath = "//span[text()='How can I treat my symptoms away from home?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseThirteen;
	
	@FindBy(xpath = "//span[text()='Does stress cause hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccFourteen;
	
	@FindBy(xpath = "//span[text()='Does stress cause hemorrhoids?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveFourteen;
	
	@FindBy(xpath = "//span[text()='Does stress cause hemorrhoids?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseFourteen;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids hereditary?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccFifteen;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids hereditary?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveFifteen;
	
	@FindBy(xpath = "//span[text()='Are hemorrhoids hereditary?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseFifteen;
	
	@FindBy(xpath = "//span[text()='Should I eat certain foods to reduce the risk of flare-ups?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccSixteen;
	
	@FindBy(xpath = "//span[text()='Should I eat certain foods to reduce the risk of flare-ups?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement hemorrhoidsAccActiveSixteen;
	
	@FindBy(xpath = "//span[text()='Should I eat certain foods to reduce the risk of flare-ups?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement hemorrhoidsAccCloseSixteen;
	
	@FindBy(xpath = "//span[text()='Can I exercise when I’m having a flare-up?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccSeventeen;
	
	@FindBy(xpath = "//span[text()='Can I exercise when I’m having a flare-up?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement hemorrhoidsAccActiveSeventeen;
	
	@FindBy(xpath = "//span[text()='Can I exercise when I’m having a flare-up?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement hemorrhoidsAccCloseSeventeen;
	
	@FindBy(xpath = "//span[text()='Are there exercises to help reduce the risk of flare-ups?']//ancestor::header[@class='accordion-head']")
	private static WebElement hemorrhoidsAccEighteen;
	
	@FindBy(xpath = "//span[text()='Are there exercises to help reduce the risk of flare-ups?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement hemorrhoidsAccActiveEighteen;
	
	@FindBy(xpath = "//span[text()='Are there exercises to help reduce the risk of flare-ups?']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement hemorrhoidsAccCloseEighteen;
	
	@FindBy(xpath = "//span[text()='What can I expect from Preparation H products?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwo;
	
	@FindBy(xpath = "//span[text()='What can I expect from Preparation H products?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What can I expect from Preparation H products?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='I’m having trouble opening Preparation H Rapid Relief Totables Wipes — what should I do?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThree;
	
	@FindBy(xpath = "//span[text()='I’m having trouble opening Preparation H Rapid Relief Totables Wipes — what should I do?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThree;
	
	@FindBy(xpath = "//span[text()='I’m having trouble opening Preparation H Rapid Relief Totables Wipes — what should I do?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThree;
	
	@FindBy(xpath = "//span[text()='What is the new Rapid Relief with Lidocaine Spray?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccFour;
	
	@FindBy(xpath = "//span[text()='What is the new Rapid Relief with Lidocaine Spray?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveFour;
	
	@FindBy(xpath = "//span[text()='What is the new Rapid Relief with Lidocaine Spray?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseFour;
	
	@FindBy(xpath = "//span[text()='What products are in the Rapid Relief line?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccFive;
	
	@FindBy(xpath = "//span[text()='What products are in the Rapid Relief line?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveFive;
	
	@FindBy(xpath = "//span[text()='What products are in the Rapid Relief line?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Soothing Relief Spray vs. Rapid Relief with Lidocaine Spray']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccSix;
	
	@FindBy(xpath = "//span[text()='Soothing Relief Spray vs. Rapid Relief with Lidocaine Spray']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Soothing Relief Spray vs. Rapid Relief with Lidocaine Spray']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseSix;
	
	@FindBy(xpath = "//span[text()='How to use Rapid Relief with Lidocaine Spray?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccSeven;
	
	@FindBy(xpath = "//span[text()='How to use Rapid Relief with Lidocaine Spray?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='How to use Rapid Relief with Lidocaine Spray?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseSeven;
	
	@FindBy(xpath = "//span[text()='Why lidocaine?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccEight;
	
	@FindBy(xpath = "//span[text()='Why lidocaine?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveEight;
	
	@FindBy(xpath = "//span[text()='Why lidocaine?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseEight;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Rapid Relief with Lidocaine Spray in a certain way?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccNine;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Rapid Relief with Lidocaine Spray in a certain way?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveNine;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Rapid Relief with Lidocaine Spray in a certain way?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseNine;
	
	@FindBy(xpath = "//span[text()='Is there an option that doesn’t require you to touch your butt?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTen;
	
	@FindBy(xpath = "//span[text()='Is there an option that doesn’t require you to touch your butt?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTen;
	
	@FindBy(xpath = "//span[text()='Is there an option that doesn’t require you to touch your butt?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTen;
	
	@FindBy(xpath = "//span[text()='What’s the best PREPARATION H product for my symptoms?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccEleven;
	
	@FindBy(xpath = "//span[text()='What’s the best PREPARATION H product for my symptoms?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveEleven;
	
	@FindBy(xpath = "//span[text()='What’s the best PREPARATION H product for my symptoms?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseEleven;
	
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H while I’m pregnant or nursing?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTweleve;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H while I’m pregnant or nursing?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTweleve;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H while I’m pregnant or nursing?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTweleve;
	
	@FindBy(xpath = "//span[text()='Which products should I use for internal hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirteen;
	
	@FindBy(xpath = "//span[text()='Which products should I use for internal hemorrhoids?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirteen;
	
	@FindBy(xpath = "//span[text()='Which products should I use for internal hemorrhoids?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirteen;
	
	@FindBy(xpath = "//span[text()='Which products should I use for external hemorrhoids?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccFourteen;
	
	@FindBy(xpath = "//span[text()='Which products should I use for external hemorrhoids?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveFourteen;
	
	@FindBy(xpath = "//span[text()='Which products should I use for external hemorrhoids?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseFourteen;
	
	@FindBy(xpath = "//span[text()='Is PREPARATION H safe for long-term use?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccFifteen;
	
	@FindBy(xpath = "//span[text()='Is PREPARATION H safe for long-term use?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveFifteen;
	
	@FindBy(xpath = "//span[text()='Is PREPARATION H safe for long-term use?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseFifteen;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H after the expiration date?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccSixteen;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H after the expiration date?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveSixteen;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H after the expiration date?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseSixteen;
	
	@FindBy(xpath = "//span[text()='How much PREPARATION H should I use?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccSeventeen;
	
	@FindBy(xpath = "//span[text()='How much PREPARATION H should I use?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveSeventeen;
	
	@FindBy(xpath = "//span[text()='How much PREPARATION H should I use?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseSeventeen;
	
	@FindBy(xpath = "//span[text()='How do I store PREPARATION H?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccEighteen;
	
	@FindBy(xpath = "//span[text()='How do I store PREPARATION H?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveEighteen;
	
	@FindBy(xpath = "//span[text()='How do I store PREPARATION H?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseEighteen;
	
	@FindBy(xpath = "//span[text()='How often can I use PREPARATION H Medicated Wipes?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccNineteen;
	
	@FindBy(xpath = "//span[text()='How often can I use PREPARATION H Medicated Wipes?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveNineteen;
	
	@FindBy(xpath = "//span[text()='How often can I use PREPARATION H Medicated Wipes?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseNineteen;
	
	@FindBy(xpath = "//span[text()='Can I flush PREPARATION H Medicated Wipes down the toilet?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwenty;
	
	@FindBy(xpath = "//span[text()='Can I flush PREPARATION H Medicated Wipes down the toilet?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwenty;
	
	@FindBy(xpath = "//span[text()='Can I flush PREPARATION H Medicated Wipes down the toilet?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwenty;
	
	@FindBy(xpath = "//span[text()='Is it safe to use PREPARATION H if I have an existing medical condition or am taking over-the-counter or prescription medicines?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyOne;
	
	@FindBy(xpath = "//span[text()='Is it safe to use PREPARATION H if I have an existing medical condition or am taking over-the-counter or prescription medicines?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveTwentyOne;
	
	@FindBy(xpath = "//span[text()='Is it safe to use PREPARATION H if I have an existing medical condition or am taking over-the-counter or prescription medicines?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseTwentyOne;
	
	@FindBy(xpath = "//span[text()='How does lidocaine relieve hemorrhoid symptoms?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyTwo;
	
	@FindBy(xpath = "//span[text()='How does lidocaine relieve hemorrhoid symptoms?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwentyTwo;
	
	@FindBy(xpath = "//span[text()='How does lidocaine relieve hemorrhoid symptoms?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwentyTwo;
	
	@FindBy(xpath = "//span[text()='The cap on PREPARATION H Rapid Relief with Lidocaine Cream is difficult to open. Why is it different than other PREPARATION H products?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyThree;
	
	@FindBy(xpath = "//span[text()='The cap on PREPARATION H Rapid Relief with Lidocaine Cream is difficult to open. Why is it different than other PREPARATION H products?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveTwentyThree;
	
	@FindBy(xpath = "//span[text()='The cap on PREPARATION H Rapid Relief with Lidocaine Cream is difficult to open. Why is it different than other PREPARATION H products?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseTwentyThree;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H on my face for wrinkles and bags under the eyes?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyFour;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H on my face for wrinkles and bags under the eyes?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwentyFour;
	
	@FindBy(xpath = "//span[text()='Can I use PREPARATION H on my face for wrinkles and bags under the eyes?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwentyFour;
	
	@FindBy(xpath = "//span[text()='How do I remove PREPARATION H fabric stains?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyFive;
	
	@FindBy(xpath = "//span[text()='How do I remove PREPARATION H fabric stains?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveTwentyFive;
	
	@FindBy(xpath = "//span[text()='How do I remove PREPARATION H fabric stains?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseTwentyFive;
	
	@FindBy(xpath = "//span[text()='How do I use an applicator (pile pipe)?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentySix;
	
	@FindBy(xpath = "//span[text()='How do I use an applicator (pile pipe)?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwentySix;
	
	@FindBy(xpath = "//span[text()='How do I use an applicator (pile pipe)?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwentySix;
	
	@FindBy(xpath = "//span[text()='How do I clean the applicator (pile pipe)?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentySeven;
	
	@FindBy(xpath = "//span[text()='How do I clean the applicator (pile pipe)?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveTwentySeven;
	
	@FindBy(xpath = "//span[text()='How do I clean the applicator (pile pipe)?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseTwentySeven;
	
	@FindBy(xpath = "//span[text()='Which PREPARATION H formulas are in the stand-up boxes? Are they different in any way?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyEight;
	
	@FindBy(xpath = "//span[text()='Which PREPARATION H formulas are in the stand-up boxes? Are they different in any way?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveTwentyEight;
	
	@FindBy(xpath = "//span[text()='Which PREPARATION H formulas are in the stand-up boxes? Are they different in any way?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseTwentyEight;
	
	@FindBy(xpath = "//span[text()='What happened to the Anti-Itch Cream in the red box?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccTwentyNine;
	
	@FindBy(xpath = "//span[text()='What happened to the Anti-Itch Cream in the red box?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveTwentyNine;
	
	@FindBy(xpath = "//span[text()='What happened to the Anti-Itch Cream in the red box?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseTwentyNine;
	
	@FindBy(xpath = "//span[text()='Can I use Preparation H Soothing Relief Cleansing & Cooling Wipes every day?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirty;
	
	@FindBy(xpath = "//span[text()='Can I use Preparation H Soothing Relief Cleansing & Cooling Wipes every day?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveThirty;
	
	@FindBy(xpath = "//span[text()='Can I use Preparation H Soothing Relief Cleansing & Cooling Wipes every day?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseThirty;
	
	@FindBy(xpath = "//span[text()='Can I apply Preparation H Soothing Relief Anti-Itch Cream as needed/How do I Use it?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyOne;
	
	@FindBy(xpath = "//span[text()='Can I apply Preparation H Soothing Relief Anti-Itch Cream as needed/How do I Use it?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirtyOne;
	
	@FindBy(xpath = "//span[text()='Can I apply Preparation H Soothing Relief Anti-Itch Cream as needed/How do I Use it?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirtyOne;
	
	@FindBy(xpath = "//span[text()='Can I flush Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyTwo;
	
	@FindBy(xpath = "//span[text()='Can I flush Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveThirtyTwo;
	
	@FindBy(xpath = "//span[text()='Can I flush Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseThirtyTwo;
	
	@FindBy(xpath = "//span[text()='What are new Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyThree;
	
	@FindBy(xpath = "//span[text()='What are new Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirtyThree;
	
	@FindBy(xpath = "//span[text()='What are new Preparation H Soothing Relief Cleansing & Cooling Wipes?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirtyThree;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyFour;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveThirtyFour;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseThirtyFour;
	
	@FindBy(xpath = "//span[text()='Which Preparation H Wipes are best to use for everyday cleaning?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyFive;
	
	@FindBy(xpath = "//span[text()='Which Preparation H Wipes are best to use for everyday cleaning?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirtyFive;
	
	@FindBy(xpath = "//span[text()='Which Preparation H Wipes are best to use for everyday cleaning?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirtyFive;
	
	@FindBy(xpath = "//span[text()='What does the Hydrocortisone 1% do in Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtySix;
	
	@FindBy(xpath = "//span[text()='What does the Hydrocortisone 1% do in Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveThirtySix;
	
	@FindBy(xpath = "//span[text()='What does the Hydrocortisone 1% do in Preparation H Soothing Relief Anti-Itch Cream?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseThirtySix;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Cooling Spray?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtySeven;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Cooling Spray?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirtySeven;
	
	@FindBy(xpath = "//span[text()='What is new Preparation H Soothing Relief Cooling Spray?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirtySeven;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Preparation H Soothing Relief Cooling Spray a certain way?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyEight;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Preparation H Soothing Relief Cooling Spray a certain way?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement productsAccActiveThirtyEight;
	
	@FindBy(xpath = "//span[text()='Do I need to hold Preparation H Soothing Relief Cooling Spray a certain way?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement productsAccCloseThirtyEight;
	
	@FindBy(xpath = "//span[text()='Is there a Preparation H option that doesn’t require you to touch your butt?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccThirtyNine;
	
	@FindBy(xpath = "//span[text()='Is there a Preparation H option that doesn’t require you to touch your butt?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement productsAccActiveThirtyNine;
	
	@FindBy(xpath = "//span[text()='Is there a Preparation H option that doesn’t require you to touch your butt?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement productsAccCloseThirtyNine;
	
	@FindBy(xpath = "//span[text()='Are there Preparation H products that are not creams or gels?']//ancestor::header[@class='accordion-head']")
	private static WebElement productsAccFourty;
	
	@FindBy(xpath = "//span[text()='Are there Preparation H products that are not creams or gels?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement productsAccActiveFourty;
	
	@FindBy(xpath = "//span[text()='Are there Preparation H products that are not creams or gels?']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement productsAccCloseFourty;
	
	
	
	@FindBy(xpath = "")
	private static WebElement productsAccOne;
	
	@FindBy(xpath = "")
	private static WebElement productsAccActiveOne;
	
	@FindBy(xpath = "")
	private static WebElement productsAccCloseOne;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickHemorrhoidsAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccTwo)) {
			scrollDownUsingElement(hemorrhoidsAccTwo);
			clickElementUsingJavaScript(hemorrhoidsAccTwo);
			visibilityOf(hemorrhoidsAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveTwo));
			clickElementUsingJavaScript(hemorrhoidsAccTwo);
			visibilityOf(hemorrhoidsAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseTwo));
			System.out.println("Hemorrhoids Accordion two verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion two is not presented in the page");
			throw new Exception("Hemorrhoids Accordion two is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccThree)) {
			scrollDownUsingElement(hemorrhoidsAccThree);
			clickElementUsingJavaScript(hemorrhoidsAccThree);
			visibilityOf(hemorrhoidsAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveThree));
			clickElementUsingJavaScript(hemorrhoidsAccThree);
			visibilityOf(hemorrhoidsAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseThree));
			System.out.println("Hemorrhoids Accordion Three verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Three is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Three is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccFour)) {
			scrollDownUsingElement(hemorrhoidsAccFour);
			clickElementUsingJavaScript(hemorrhoidsAccFour);
			visibilityOf(hemorrhoidsAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveFour));
			clickElementUsingJavaScript(hemorrhoidsAccFour);
			visibilityOf(hemorrhoidsAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseFour));
			System.out.println("Hemorrhoids Accordion Four verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Four is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Four is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccFive)) {
			scrollDownUsingElement(hemorrhoidsAccFive);
			clickElementUsingJavaScript(hemorrhoidsAccFive);
			visibilityOf(hemorrhoidsAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveFive));
			clickElementUsingJavaScript(hemorrhoidsAccFive);
			visibilityOf(hemorrhoidsAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseFive));
			System.out.println("Hemorrhoids Accordion Five verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Five is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Five is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccSix)) {
			scrollDownUsingElement(hemorrhoidsAccSix);
			clickElementUsingJavaScript(hemorrhoidsAccSix);
			visibilityOf(hemorrhoidsAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveSix));
			clickElementUsingJavaScript(hemorrhoidsAccSix);
			visibilityOf(hemorrhoidsAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseSix));
			System.out.println("Hemorrhoids Accordion Six verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Six is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Six is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccSeven)) {
			scrollDownUsingElement(hemorrhoidsAccSeven);
			clickElementUsingJavaScript(hemorrhoidsAccSeven);
			visibilityOf(hemorrhoidsAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveSeven));
			clickElementUsingJavaScript(hemorrhoidsAccSeven);
			visibilityOf(hemorrhoidsAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseSeven));
			System.out.println("Hemorrhoids Accordion Seven verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Seven is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Seven is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccEight)) {
			scrollDownUsingElement(hemorrhoidsAccEight);
			clickElementUsingJavaScript(hemorrhoidsAccEight);
			visibilityOf(hemorrhoidsAccActiveEight);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveEight));
			clickElementUsingJavaScript(hemorrhoidsAccEight);
			visibilityOf(hemorrhoidsAccCloseEight);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseEight));
			System.out.println("Hemorrhoids Accordion Eight verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Eight is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Eight is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccNine)) {
			scrollDownUsingElement(hemorrhoidsAccNine);
			clickElementUsingJavaScript(hemorrhoidsAccNine);
			visibilityOf(hemorrhoidsAccActiveNine);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveNine));
			clickElementUsingJavaScript(hemorrhoidsAccNine);
			visibilityOf(hemorrhoidsAccCloseNine);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseNine));
			System.out.println("Hemorrhoids Accordion Nine verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Nine is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Nine is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccTen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccTen)) {
			scrollDownUsingElement(hemorrhoidsAccTen);
			clickElementUsingJavaScript(hemorrhoidsAccTen);
			visibilityOf(hemorrhoidsAccActiveTen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveTen));
			clickElementUsingJavaScript(hemorrhoidsAccTen);
			visibilityOf(hemorrhoidsAccCloseTen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseTen));
			System.out.println("Hemorrhoids Accordion Ten verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Ten is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Ten is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccEleven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccEleven)) {
			scrollDownUsingElement(hemorrhoidsAccEleven);
			clickElementUsingJavaScript(hemorrhoidsAccEleven);
			visibilityOf(hemorrhoidsAccActiveEleven);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveEleven));
			clickElementUsingJavaScript(hemorrhoidsAccEleven);
			visibilityOf(hemorrhoidsAccCloseEleven);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseEleven));
			System.out.println("Hemorrhoids Accordion Eleven verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Eleven is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Eleven is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccTweleve() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccTweleve)) {
			scrollDownUsingElement(hemorrhoidsAccTweleve);
			clickElementUsingJavaScript(hemorrhoidsAccTweleve);
			visibilityOf(hemorrhoidsAccActiveTweleve);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveTweleve));
			clickElementUsingJavaScript(hemorrhoidsAccTweleve);
			visibilityOf(hemorrhoidsAccCloseTweleve);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseTweleve));
			System.out.println("Hemorrhoids Accordion Tweleve verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Tweleve is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Tweleve is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccThirteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccThirteen)) {
			scrollDownUsingElement(hemorrhoidsAccThirteen);
			clickElementUsingJavaScript(hemorrhoidsAccThirteen);
			visibilityOf(hemorrhoidsAccActiveThirteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveThirteen));
			clickElementUsingJavaScript(hemorrhoidsAccThirteen);
			visibilityOf(hemorrhoidsAccCloseThirteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseThirteen));
			System.out.println("Hemorrhoids Accordion Thirteen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Thirteen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Thirteen is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccFourteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccFourteen)) {
			scrollDownUsingElement(hemorrhoidsAccFourteen);
			clickElementUsingJavaScript(hemorrhoidsAccFourteen);
			visibilityOf(hemorrhoidsAccActiveFourteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveFourteen));
			clickElementUsingJavaScript(hemorrhoidsAccFourteen);
			visibilityOf(hemorrhoidsAccCloseFourteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseFourteen));
			System.out.println("Hemorrhoids Accordion Fourteen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Fourteen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Fourteen is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccFifteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccFifteen)) {
			scrollDownUsingElement(hemorrhoidsAccFifteen);
			clickElementUsingJavaScript(hemorrhoidsAccFifteen);
			visibilityOf(hemorrhoidsAccActiveFifteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveFifteen));
			clickElementUsingJavaScript(hemorrhoidsAccFifteen);
			visibilityOf(hemorrhoidsAccCloseFifteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseFifteen));
			System.out.println("Hemorrhoids Accordion Fifteen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Fifteen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Fifteen is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccSixteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccSixteen)) {
			scrollDownUsingElement(hemorrhoidsAccSixteen);
			clickElementUsingJavaScript(hemorrhoidsAccSixteen);
			visibilityOf(hemorrhoidsAccActiveSixteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveSixteen));
			clickElementUsingJavaScript(hemorrhoidsAccSixteen);
			visibilityOf(hemorrhoidsAccCloseSixteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseSixteen));
			System.out.println("Hemorrhoids Accordion Sixteen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Sixteen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Sixteen is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccSeventeen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccSeventeen)) {
			scrollDownUsingElement(hemorrhoidsAccSeventeen);
			clickElementUsingJavaScript(hemorrhoidsAccSeventeen);
			visibilityOf(hemorrhoidsAccActiveSeventeen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveSeventeen));
			clickElementUsingJavaScript(hemorrhoidsAccSeventeen);
			visibilityOf(hemorrhoidsAccCloseSeventeen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseSeventeen));
			System.out.println("Hemorrhoids Accordion Seventeen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Seventeen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Seventeen is not presented in the page");
		}
	}
	
	public void clickHemorrhoidsAccEighteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hemorrhoidsAccEighteen)) {
			scrollDownUsingElement(hemorrhoidsAccEighteen);
			clickElementUsingJavaScript(hemorrhoidsAccEighteen);
			visibilityOf(hemorrhoidsAccActiveEighteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccActiveEighteen));
			clickElementUsingJavaScript(hemorrhoidsAccEighteen);
			visibilityOf(hemorrhoidsAccCloseEighteen);
			Assert.assertTrue(elementIsDisplayed(hemorrhoidsAccCloseEighteen));
			System.out.println("Hemorrhoids Accordion Eighteen verfied Successfully");
		} else {
			System.out.println("Hemorrhoids Accordion Eighteen is not presented in the page");
			throw new Exception("Hemorrhoids Accordion Eighteen is not presented in the page");
		}
	}
	
	
	public void clickProductsAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwo)) {
			scrollDownUsingElement(productsAccTwo);
			clickElementUsingJavaScript(productsAccTwo);
			visibilityOf(productsAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwo));
			clickElementUsingJavaScript(productsAccTwo);
			visibilityOf(productsAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwo));
			System.out.println("Products Accordion Two verfied Successfully");
		} else {
			System.out.println("Products Accordion Two is not presented in the page");
			throw new Exception("Products Accordion Two is not presented in the page");
		}
	}
	
	public void clickProductsAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThree)) {
			scrollDownUsingElement(productsAccThree);
			clickElementUsingJavaScript(productsAccThree);
			visibilityOf(productsAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThree));
			clickElementUsingJavaScript(productsAccThree);
			visibilityOf(productsAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThree));
			System.out.println("Products Accordion Three verfied Successfully");
		} else {
			System.out.println("Products Accordion Three is not presented in the page");
			throw new Exception("Products Accordion Three is not presented in the page");
		}
	}
	
	public void clickProductsAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccFour)) {
			scrollDownUsingElement(productsAccFour);
			clickElementUsingJavaScript(productsAccFour);
			visibilityOf(productsAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveFour));
			clickElementUsingJavaScript(productsAccFour);
			visibilityOf(productsAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseFour));
			System.out.println("Products Accordion Four verfied Successfully");
		} else {
			System.out.println("Products Accordion Four is not presented in the page");
			throw new Exception("Products Accordion Four is not presented in the page");
		}
	}
	
	public void clickProductsAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccFive)) {
			scrollDownUsingElement(productsAccFive);
			clickElementUsingJavaScript(productsAccFive);
			visibilityOf(productsAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveFive));
			clickElementUsingJavaScript(productsAccFive);
			visibilityOf(productsAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseFive));
			System.out.println("Products Accordion Five verfied Successfully");
		} else {
			System.out.println("Products Accordion Five is not presented in the page");
			throw new Exception("Products Accordion Five is not presented in the page");
		}
	}
	
	public void clickProductsAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccSix)) {
			scrollDownUsingElement(productsAccSix);
			clickElementUsingJavaScript(productsAccSix);
			visibilityOf(productsAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveSix));
			clickElementUsingJavaScript(productsAccSix);
			visibilityOf(productsAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseSix));
			System.out.println("Products Accordion Six verfied Successfully");
		} else {
			System.out.println("Products Accordion Six is not presented in the page");
			throw new Exception("Products Accordion Six is not presented in the page");
		}
	}
	
	public void clickProductsAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccSeven)) {
			scrollDownUsingElement(productsAccSeven);
			clickElementUsingJavaScript(productsAccSeven);
			visibilityOf(productsAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveSeven));
			clickElementUsingJavaScript(productsAccSeven);
			visibilityOf(productsAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseSeven));
			System.out.println("Products Accordion Seven verfied Successfully");
		} else {
			System.out.println("Products Accordion Seven is not presented in the page");
			throw new Exception("Products Accordion Seven is not presented in the page");
		}
	}
	
	public void clickProductsAccEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccEight)) {
			scrollDownUsingElement(productsAccEight);
			clickElementUsingJavaScript(productsAccEight);
			visibilityOf(productsAccActiveEight);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveEight));
			clickElementUsingJavaScript(productsAccEight);
			visibilityOf(productsAccCloseEight);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseEight));
			System.out.println("Products Accordion Eight verfied Successfully");
		} else {
			System.out.println("Products Accordion Eight is not presented in the page");
			throw new Exception("Products Accordion Eight is not presented in the page");
		}
	}
	
	public void clickProductsAccNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccNine)) {
			scrollDownUsingElement(productsAccNine);
			clickElementUsingJavaScript(productsAccNine);
			visibilityOf(productsAccActiveNine);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveNine));
			clickElementUsingJavaScript(productsAccNine);
			visibilityOf(productsAccCloseNine);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseNine));
			System.out.println("Products Accordion Nine verfied Successfully");
		} else {
			System.out.println("Products Accordion Nine is not presented in the page");
			throw new Exception("Products Accordion Nine is not presented in the page");
		}
	}
	
	public void clickProductsAccTen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTen)) {
			scrollDownUsingElement(productsAccTen);
			clickElementUsingJavaScript(productsAccTen);
			visibilityOf(productsAccActiveTen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTen));
			clickElementUsingJavaScript(productsAccTen);
			visibilityOf(productsAccCloseTen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTen));
			System.out.println("Products Accordion Ten verfied Successfully");
		} else {
			System.out.println("Products Accordion Ten is not presented in the page");
			throw new Exception("Products Accordion Ten is not presented in the page");
		}
	}
	
	public void clickProductsAccEleven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccEleven)) {
			scrollDownUsingElement(productsAccEleven);
			clickElementUsingJavaScript(productsAccEleven);
			visibilityOf(productsAccActiveEleven);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveEleven));
			clickElementUsingJavaScript(productsAccEleven);
			visibilityOf(productsAccCloseEleven);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseEleven));
			System.out.println("Products Accordion Eleven verfied Successfully");
		} else {
			System.out.println("Products Accordion Eleven is not presented in the page");
			throw new Exception("Products Accordion Eleven is not presented in the page");
		}
	}
	
	public void clickProductsAccTweleve() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTweleve)) {
			scrollDownUsingElement(productsAccTweleve);
			clickElementUsingJavaScript(productsAccTweleve);
			visibilityOf(productsAccActiveTweleve);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTweleve));
			clickElementUsingJavaScript(productsAccTweleve);
			visibilityOf(productsAccCloseTweleve);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTweleve));
			System.out.println("Products Accordion Tweleve verfied Successfully");
		} else {
			System.out.println("Products Accordion Tweleve is not presented in the page");
			throw new Exception("Products Accordion Tweleve is not presented in the page");
		}
	}
	
	public void clickProductsAccThirteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirteen)) {
			scrollDownUsingElement(productsAccThirteen);
			clickElementUsingJavaScript(productsAccThirteen);
			visibilityOf(productsAccActiveThirteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirteen));
			clickElementUsingJavaScript(productsAccThirteen);
			visibilityOf(productsAccCloseThirteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirteen));
			System.out.println("Products Accordion Thirteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Thirteen is not presented in the page");
			throw new Exception("Products Accordion Thirteen is not presented in the page");
		}
	}
	
	public void clickProductsAccFourteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccFourteen)) {
			scrollDownUsingElement(productsAccFourteen);
			clickElementUsingJavaScript(productsAccFourteen);
			visibilityOf(productsAccActiveFourteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveFourteen));
			clickElementUsingJavaScript(productsAccFourteen);
			visibilityOf(productsAccCloseFourteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseFourteen));
			System.out.println("Products Accordion Fourteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Fourteen is not presented in the page");
			throw new Exception("Products Accordion Fourteen is not presented in the page");
		}
	}
	
	public void clickProductsAccFifteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccFifteen)) {
			scrollDownUsingElement(productsAccFifteen);
			clickElementUsingJavaScript(productsAccFifteen);
			visibilityOf(productsAccActiveFifteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveFifteen));
			clickElementUsingJavaScript(productsAccFifteen);
			visibilityOf(productsAccCloseFifteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseFifteen));
			System.out.println("Products Accordion Fifteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Fifteen is not presented in the page");
			throw new Exception("Products Accordion Fifteen is not presented in the page");
		}
	}
	
	public void clickProductsAccSixteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccSixteen)) {
			scrollDownUsingElement(productsAccSixteen);
			clickElementUsingJavaScript(productsAccSixteen);
			visibilityOf(productsAccActiveSixteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveSixteen));
			clickElementUsingJavaScript(productsAccSixteen);
			visibilityOf(productsAccCloseSixteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseSixteen));
			System.out.println("Products Accordion Sixteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Sixteen is not presented in the page");
			throw new Exception("Products Accordion Sixteen is not presented in the page");
		}
	}
	
	public void clickProductsAccSeventeen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccSeventeen)) {
			scrollDownUsingElement(productsAccSeventeen);
			clickElementUsingJavaScript(productsAccSeventeen);
			visibilityOf(productsAccActiveSeventeen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveSeventeen));
			clickElementUsingJavaScript(productsAccSeventeen);
			visibilityOf(productsAccCloseSeventeen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseSeventeen));
			System.out.println("Products Accordion Seventeen verfied Successfully");
		} else {
			System.out.println("Products Accordion Seventeen is not presented in the page");
			throw new Exception("Products Accordion Seventeen is not presented in the page");
		}
	}
	
	public void clickProductsAccEighteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccEighteen)) {
			scrollDownUsingElement(productsAccEighteen);
			clickElementUsingJavaScript(productsAccEighteen);
			visibilityOf(productsAccActiveEighteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveEighteen));
			clickElementUsingJavaScript(productsAccEighteen);
			visibilityOf(productsAccCloseEighteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseEighteen));
			System.out.println("Products Accordion Eighteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Eighteen is not presented in the page");
			throw new Exception("Products Accordion Eighteen is not presented in the page");
		}
	}
	
	public void clickProductsAccNineteen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccNineteen)) {
			scrollDownUsingElement(productsAccNineteen);
			clickElementUsingJavaScript(productsAccNineteen);
			visibilityOf(productsAccActiveNineteen);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveNineteen));
			clickElementUsingJavaScript(productsAccNineteen);
			visibilityOf(productsAccCloseNineteen);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseNineteen));
			System.out.println("Products Accordion Nineteen verfied Successfully");
		} else {
			System.out.println("Products Accordion Nineteen is not presented in the page");
			throw new Exception("Products Accordion Nineteen is not presented in the page");
		}
	}
	
	public void clickProductsAccTwenty() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwenty)) {
			scrollDownUsingElement(productsAccTwenty);
			clickElementUsingJavaScript(productsAccTwenty);
			visibilityOf(productsAccActiveTwenty);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwenty));
			clickElementUsingJavaScript(productsAccTwenty);
			visibilityOf(productsAccCloseTwenty);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwenty));
			System.out.println("Products Accordion Twenty verfied Successfully");
		} else {
			System.out.println("Products Accordion Twenty is not presented in the page");
			throw new Exception("Products Accordion Twenty is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyOne)) {
			scrollDownUsingElement(productsAccTwentyOne);
			clickElementUsingJavaScript(productsAccTwentyOne);
			visibilityOf(productsAccActiveTwentyOne);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyOne));
			clickElementUsingJavaScript(productsAccTwentyOne);
			visibilityOf(productsAccCloseTwentyOne);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyOne));
			System.out.println("Products Accordion TwentyOne verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyOne is not presented in the page");
			throw new Exception("Products Accordion TwentyOne is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyTwo)) {
			scrollDownUsingElement(productsAccTwentyTwo);
			clickElementUsingJavaScript(productsAccTwentyTwo);
			visibilityOf(productsAccActiveTwentyTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyTwo));
			clickElementUsingJavaScript(productsAccTwentyTwo);
			visibilityOf(productsAccCloseTwentyTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyTwo));
			System.out.println("Products Accordion TwentyTwo verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyTwo is not presented in the page");
			throw new Exception("Products Accordion TwentyTwo is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyThree)) {
			scrollDownUsingElement(productsAccTwentyThree);
			clickElementUsingJavaScript(productsAccTwentyThree);
			visibilityOf(productsAccActiveTwentyThree);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyThree));
			clickElementUsingJavaScript(productsAccTwentyThree);
			visibilityOf(productsAccCloseTwentyThree);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyThree));
			System.out.println("Products Accordion TwentyThree verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyThree is not presented in the page");
			throw new Exception("Products Accordion TwentyThree is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyFour)) {
			scrollDownUsingElement(productsAccTwentyFour);
			clickElementUsingJavaScript(productsAccTwentyFour);
			visibilityOf(productsAccActiveTwentyFour);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyFour));
			clickElementUsingJavaScript(productsAccTwentyFour);
			visibilityOf(productsAccCloseTwentyFour);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyFour));
			System.out.println("Products Accordion TwentyFour verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyFour is not presented in the page");
			throw new Exception("Products Accordion TwentyFour is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyFive)) {
			scrollDownUsingElement(productsAccTwentyFive);
			clickElementUsingJavaScript(productsAccTwentyFive);
			visibilityOf(productsAccActiveTwentyFive);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyFive));
			clickElementUsingJavaScript(productsAccTwentyFive);
			visibilityOf(productsAccCloseTwentyFive);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyFive));
			System.out.println("Products Accordion TwentyFive verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyFive is not presented in the page");
			throw new Exception("Products Accordion TwentyFive is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentySix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentySix)) {
			scrollDownUsingElement(productsAccTwentySix);
			clickElementUsingJavaScript(productsAccTwentySix);
			visibilityOf(productsAccActiveTwentySix);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentySix));
			clickElementUsingJavaScript(productsAccTwentySix);
			visibilityOf(productsAccCloseTwentySix);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentySix));
			System.out.println("Products Accordion TwentySix verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentySix is not presented in the page");
			throw new Exception("Products Accordion TwentySix is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentySeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentySeven)) {
			scrollDownUsingElement(productsAccTwentySeven);
			clickElementUsingJavaScript(productsAccTwentySeven);
			visibilityOf(productsAccActiveTwentySeven);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentySeven));
			clickElementUsingJavaScript(productsAccTwentySeven);
			visibilityOf(productsAccCloseTwentySeven);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentySeven));
			System.out.println("Products Accordion TwentySeven verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentySeven is not presented in the page");
			throw new Exception("Products Accordion TwentySeven is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyEight)) {
			scrollDownUsingElement(productsAccTwentyEight);
			clickElementUsingJavaScript(productsAccTwentyEight);
			visibilityOf(productsAccActiveTwentyEight);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyEight));
			clickElementUsingJavaScript(productsAccTwentyEight);
			visibilityOf(productsAccCloseTwentyEight);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyEight));
			System.out.println("Products Accordion TwentyEight verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyEight is not presented in the page");
			throw new Exception("Products Accordion TwentyEight is not presented in the page");
		}
	}
	
	public void clickProductsAccTwentyNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccTwentyNine)) {
			scrollDownUsingElement(productsAccTwentyNine);
			clickElementUsingJavaScript(productsAccTwentyNine);
			visibilityOf(productsAccActiveTwentyNine);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveTwentyNine));
			clickElementUsingJavaScript(productsAccTwentyNine);
			visibilityOf(productsAccCloseTwentyNine);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseTwentyNine));
			System.out.println("Products Accordion TwentyNine verfied Successfully");
		} else {
			System.out.println("Products Accordion TwentyNine is not presented in the page");
			throw new Exception("Products Accordion TwentyNine is not presented in the page");
		}
	}
	
	public void clickProductsAccThirty() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirty)) {
			scrollDownUsingElement(productsAccThirty);
			clickElementUsingJavaScript(productsAccThirty);
			visibilityOf(productsAccActiveThirty);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirty));
			clickElementUsingJavaScript(productsAccThirty);
			visibilityOf(productsAccCloseThirty);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirty));
			System.out.println("Products Accordion Thirty verfied Successfully");
		} else {
			System.out.println("Products Accordion Thirty is not presented in the page");
			throw new Exception("Products Accordion Thirty is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyOne)) {
			scrollDownUsingElement(productsAccThirtyOne);
			clickElementUsingJavaScript(productsAccThirtyOne);
			visibilityOf(productsAccActiveThirtyOne);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyOne));
			clickElementUsingJavaScript(productsAccThirtyOne);
			visibilityOf(productsAccCloseThirtyOne);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyOne));
			System.out.println("Products Accordion ThirtyOne verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyOne is not presented in the page");
			throw new Exception("Products Accordion ThirtyOne is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyTwo)) {
			scrollDownUsingElement(productsAccThirtyTwo);
			clickElementUsingJavaScript(productsAccThirtyTwo);
			visibilityOf(productsAccActiveThirtyTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyTwo));
			clickElementUsingJavaScript(productsAccThirtyTwo);
			visibilityOf(productsAccCloseThirtyTwo);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyTwo));
			System.out.println("Products Accordion ThirtyTwo verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyTwo is not presented in the page");
			throw new Exception("Products Accordion ThirtyTwo is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyThree)) {
			scrollDownUsingElement(productsAccThirtyThree);
			clickElementUsingJavaScript(productsAccThirtyThree);
			visibilityOf(productsAccActiveThirtyThree);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyThree));
			clickElementUsingJavaScript(productsAccThirtyThree);
			visibilityOf(productsAccCloseThirtyThree);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyThree));
			System.out.println("Products Accordion ThirtyThree verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyThree is not presented in the page");
			throw new Exception("Products Accordion ThirtyThree is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyFour)) {
			scrollDownUsingElement(productsAccThirtyFour);
			clickElementUsingJavaScript(productsAccThirtyFour);
			visibilityOf(productsAccActiveThirtyFour);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyFour));
			clickElementUsingJavaScript(productsAccThirtyFour);
			visibilityOf(productsAccCloseThirtyFour);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyFour));
			System.out.println("Products Accordion ThirtyFour verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyFour is not presented in the page");
			throw new Exception("Products Accordion ThirtyFour is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyFive)) {
			scrollDownUsingElement(productsAccThirtyFive);
			clickElementUsingJavaScript(productsAccThirtyFive);
			visibilityOf(productsAccActiveThirtyFive);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyFive));
			clickElementUsingJavaScript(productsAccThirtyFive);
			visibilityOf(productsAccCloseThirtyFive);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyFive));
			System.out.println("Products Accordion ThirtyFive verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyFive is not presented in the page");
			throw new Exception("Products Accordion ThirtyFive is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtySix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtySix)) {
			scrollDownUsingElement(productsAccThirtySix);
			clickElementUsingJavaScript(productsAccThirtySix);
			visibilityOf(productsAccActiveThirtySix);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtySix));
			clickElementUsingJavaScript(productsAccThirtySix);
			visibilityOf(productsAccCloseThirtySix);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtySix));
			System.out.println("Products Accordion ThirtySix verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtySix is not presented in the page");
			throw new Exception("Products Accordion ThirtySix is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtySeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtySeven)) {
			scrollDownUsingElement(productsAccThirtySeven);
			clickElementUsingJavaScript(productsAccThirtySeven);
			visibilityOf(productsAccActiveThirtySeven);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtySeven));
			clickElementUsingJavaScript(productsAccThirtySeven);
			visibilityOf(productsAccCloseThirtySeven);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtySeven));
			System.out.println("Products Accordion ThirtySeven verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtySeven is not presented in the page");
			throw new Exception("Products Accordion ThirtySeven is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyEight)) {
			scrollDownUsingElement(productsAccThirtyEight);
			clickElementUsingJavaScript(productsAccThirtyEight);
			visibilityOf(productsAccActiveThirtyEight);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyEight));
			clickElementUsingJavaScript(productsAccThirtyEight);
			visibilityOf(productsAccCloseThirtyEight);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyEight));
			System.out.println("Products Accordion ThirtyEight verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyEight is not presented in the page");
			throw new Exception("Products Accordion ThirtyEight is not presented in the page");
		}
	}
	
	public void clickProductsAccThirtyNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccThirtyNine)) {
			scrollDownUsingElement(productsAccThirtyNine);
			clickElementUsingJavaScript(productsAccThirtyNine);
			visibilityOf(productsAccActiveThirtyNine);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveThirtyNine));
			clickElementUsingJavaScript(productsAccThirtyNine);
			visibilityOf(productsAccCloseThirtyNine);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseThirtyNine));
			System.out.println("Products Accordion ThirtyNine verfied Successfully");
		} else {
			System.out.println("Products Accordion ThirtyNine is not presented in the page");
			throw new Exception("Products Accordion ThirtyNine is not presented in the page");
		}
	}
	
	public void clickProductsAccFourty() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccFourty)) {
			scrollDownUsingElement(productsAccFourty);
			clickElementUsingJavaScript(productsAccFourty);
			visibilityOf(productsAccActiveFourty);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveFourty));
			clickElementUsingJavaScript(productsAccFourty);
			visibilityOf(productsAccCloseFourty);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseFourty));
			System.out.println("Products Accordion Fourty verfied Successfully");
		} else {
			System.out.println("Products Accordion Fourty is not presented in the page");
			throw new Exception("Products Accordion Fourty is not presented in the page");
		}
	}
	
	public void clickProductsAccOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productsAccOne)) {
			scrollDownUsingElement(productsAccOne);
			clickElementUsingJavaScript(productsAccOne);
			visibilityOf(productsAccActiveOne);
			Assert.assertTrue(elementIsDisplayed(productsAccActiveOne));
			clickElementUsingJavaScript(productsAccOne);
			visibilityOf(productsAccCloseOne);
			Assert.assertTrue(elementIsDisplayed(productsAccCloseOne));
			System.out.println("Products Accordion One verfied Successfully");
		} else {
			System.out.println("Products Accordion One is not presented in the page");
			throw new Exception("Products Accordion One is not presented in the page");
		}
	}
	
	
	
	
	
	
	

}
