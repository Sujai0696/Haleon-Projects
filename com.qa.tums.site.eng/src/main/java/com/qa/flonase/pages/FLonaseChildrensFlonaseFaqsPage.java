package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class FLonaseChildrensFlonaseFaqsPage extends BaseClass{
	
	public FLonaseChildrensFlonaseFaqsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/' and text()='About']")
	private static WebElement bannerImgLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/how-to-use/' and text()='How to use']")
	private static WebElement bannerImgLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/drug-facts/' and text()='Drug facts']")
	private static WebElement bannerImgLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/faqs/' and text()='FAQs']")
	private static WebElement bannerImgLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/reviews/' and text()='Read all reviews']")
	private static WebElement bannerImgLinkFive;
	
	@FindBy(xpath = "Does Children’s FLONASE relieve eye-related allergy symptoms?//ancestor::h2[@class='accordion-title component']")
	private static WebElement accOne;
	
	@FindBy(xpath = "//span[text()='Does Children’s FLONASE relieve eye-related allergy symptoms?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveOne;
	
	@FindBy(xpath = "//span[text()='Does Children’s FLONASE relieve eye-related allergy symptoms?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseOne;
	
	
	@FindBy(xpath = "//span[text()='Does Children’s FLONASE relieve symptoms of indoor as well as outdoor allergies?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accTwo;
	
	@FindBy(xpath = "//span[text()='Does Children’s FLONASE relieve symptoms of indoor as well as outdoor allergies?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveTwo;
	
	@FindBy(xpath = "//span[text()='Does Children’s FLONASE relieve symptoms of indoor as well as outdoor allergies?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseTwo;
	
	
	@FindBy(xpath = "//span[text()='For how long does Children’s FLONASE provide relief from allergy symptoms?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accThree;
	
	@FindBy(xpath = "//span[text()='For how long does Children’s FLONASE provide relief from allergy symptoms?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveThree;
	
	@FindBy(xpath = "//span[text()='For how long does Children’s FLONASE provide relief from allergy symptoms?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseThree;
	
	
	
	@FindBy(xpath = "//span[text()='How quickly does Children’s FLONASE start working?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFour;
	
	@FindBy(xpath = "//span[text()='How quickly does Children’s FLONASE start working?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveFour;
	
	@FindBy(xpath = "//span[text()='How quickly does Children’s FLONASE start working?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseFour;
	
	
	
	@FindBy(xpath = "//span[text()='What allergy symptoms can Children’s FLONASE relieve?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFive;
	
	@FindBy(xpath = "//span[text()='What allergy symptoms can Children’s FLONASE relieve?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveFive;
	
	@FindBy(xpath = "//span[text()='What allergy symptoms can Children’s FLONASE relieve?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseFive;
	
	
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE Allergy Relief and how does it work?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSix;
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE Allergy Relief and how does it work?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveSix;
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE Allergy Relief and how does it work?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseSix;
	
	
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE compare to other nasal sprays?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSeven;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE compare to other nasal sprays?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveSeven;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE compare to other nasal sprays?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseSeven;
	
	
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than antihistamines?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accEight;
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than antihistamines?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveEight;
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than antihistamines?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseEight;
	
	
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than store-brand allergy nasal sprays?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accNine;
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than store-brand allergy nasal sprays?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveNine;
	
	@FindBy(xpath = "//span[text()='How is Children’s FLONASE different than store-brand allergy nasal sprays?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseNine;
	
	
	
	@FindBy(xpath = "//span[text()='Where can I buy Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accTen;
	
	@FindBy(xpath = "//span[text()='Where can I buy Children’s FLONASE?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveTen;
	
	@FindBy(xpath = "//span[text()='Where can I buy Children’s FLONASE?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseTen;
	
	
	
	@FindBy(xpath = "//span[text()='Does my child need to visit the pediatrician before taking Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accEleven;
	
	@FindBy(xpath = "//span[text()='Does my child need to visit the pediatrician before taking Children’s FLONASE?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveEleven;
	
	@FindBy(xpath = "//span[text()='Does my child need to visit the pediatrician before taking Children’s FLONASE?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseEleven;
	
	
	
	@FindBy(xpath = "//span[text()='How do I clean Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accTweleve;
	
	@FindBy(xpath = "//span[text()='How do I clean Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveTweleve;
	
	@FindBy(xpath = "//span[text()='How do I clean Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseTweleve;
	
	
	
	@FindBy(xpath = "//span[text()='How do I open Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accThirteen;
	
	@FindBy(xpath = "//span[text()='How do I open Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveThirteen;
	
	@FindBy(xpath = "//span[text()='How do I open Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseThirteen;
	
	@FindBy(xpath = "//span[text()='How do I use Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFourteen;
	
	@FindBy(xpath = "//span[text()='How do I use Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveFourteen;
	
	@FindBy(xpath = "//span[text()='How do I use Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseFourteen;
	
	
	
	@FindBy(xpath = "//span[text()='How many doses of Children’s FLONASE are needed daily?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFifteen;
	
	@FindBy(xpath = "//span[text()='How many doses of Children’s FLONASE are needed daily?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveFifteen;
	
	@FindBy(xpath = "//span[text()='How many doses of Children’s FLONASE are needed daily?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseFifteen;
	
	
	
	@FindBy(xpath = "//span[text()='How old does my child need to be to use Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSixteen;
	
	@FindBy(xpath = "//span[text()='How old does my child need to be to use Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveSixteen;
	
	@FindBy(xpath = "//span[text()='How old does my child need to be to use Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseSixteen;
	
	@FindBy(xpath = "//span[text()='Should my child stop using other allergy medications if they start using Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSeventeen;
	
	@FindBy(xpath = "//span[text()='Should my child stop using other allergy medications if they start using Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveSeventeen;
	
	@FindBy(xpath = "//span[text()='Should my child stop using other allergy medications if they start using Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseSeventeen;
	
	
	
	@FindBy(xpath = "//span[text()='What are the side effects of Children’s FLONASE?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accEighteen;
	
	@FindBy(xpath = "//span[text()='What are the side effects of Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveEighteen;
	
	@FindBy(xpath = "//span[text()='What are the side effects of Children’s FLONASE?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseEighteen;
	
	
	
	@FindBy(xpath = "//span[text()='What should I do if my child misses a day of Children’s FLONASE treatment?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accNineteen;
	
	@FindBy(xpath = "//span[text()='What should I do if my child misses a day of Children’s FLONASE treatment?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveNineteen;
	
	@FindBy(xpath = "//span[text()='What should I do if my child misses a day of Children’s FLONASE treatment?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseNineteen;
	
	
	
	
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='FLONASE Allergy Relief']")
	private static WebElement reliefProductsOne;
	
	@FindBy(xpath = "//a[@href='/products/sensimist/' and text()='FLONASE SENSIMIST Allergy Relief']")
	private static WebElement reliefProductsTwo;
	
	@FindBy(xpath = "//a[@href='/products/sensimist-family-pack/' and text()='Family FLONASE SENSIMIST Allergy Relief Pack']")
	private static WebElement reliefProductsThree;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/' and text()='Children’s FLONASE Allergy Relief']")
	private static WebElement reliefProductsFour;
	
	@FindBy(xpath = "//a[@href='/products/headache-and-allergy/' and text()='FLONASE Headache & Allergy Relief']")
	private static WebElement reliefProductsFive;

}
