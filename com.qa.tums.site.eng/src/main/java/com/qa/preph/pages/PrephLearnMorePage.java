package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephLearnMorePage extends BaseClass{
	
	public PrephLearnMorePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='All About Bleeding Hemorrhoids']//self::a[@href='/learn-more/about-bleeding-hemorrhoids/']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='How to Tell If You Have Hemorrhoids']//self::a[@href='/learn-more/how-to-tell-if-you-have-hemorrhoids/']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='How Long do Hemorrhoids Last?']//self::a[@href='/learn-more/how-long-do-hemorrhoids-last/']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='The Hemorrhoid Diet']//self::a[@href='/learn-more/hemorrhoid-diet/']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//a[text()='Physical Activity']//self::a[@href='/learn-more/physical-activity/']")
	private static WebElement articleFive;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll']//self::a[@href='/learn-more/emotional-toll-of-hemorrhoids/']")
	private static WebElement articleSix;
	
	@FindBy(xpath = "//a[text()='Using the Bathroom']//self::a[@href='/learn-more/using-the-bathroom/']")
	private static WebElement articleSeven;
	
	@FindBy(xpath = "//a[text()='Just for Moms']//self::a[@href='/learn-more/just-for-moms/']")
	private static WebElement articleEight;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']//self::a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement articleNine;
	
	@FindBy(xpath = "//a[text()='Who Gets Hemorrhoids?']//self::a[@href='/learn-more/who-gets-hemorrhoids/']")
	private static WebElement articleTen;
	
	@FindBy(xpath = "//a[text()='Symptoms']//self::a[@href='/learn-more/hemorrhoid-symptoms/']")
	private static WebElement articleEleven;
	
	@FindBy(xpath = "//a[text()='What Causes Hemorrhoids?']//self::a[@href='/learn-more/causes-of-hemorrhoids/']")
	private static WebElement articleTweleve;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Discussion Guide']//self::a[@href='/learn-more/hemorrhoid-discussion-guide/']")
	private static WebElement articleThirteen;
	
	@FindBy(xpath = "//a[text()='Everything You Need to Know About Hemorrhoids']//self::a[@href='/learn-more/everything-you-need-know-about-hemorrhoids/']")
	private static WebElement articleFourteen;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Flare-Ups']//self::a[@href='/learn-more/hemorrhoid-flare-ups/']")
	private static WebElement articleFifteen;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Pain']//self::a[@href='/learn-more/hemorrhoid-pain/']")
	private static WebElement articleSixteen;
	
	@FindBy(xpath = "//a[text()='Hemorrhoid Medicine 101']//self::a[@href='/learn-more/hemorrhoid-medicine-101/']")
	private static WebElement articleSeventeen;
	
	@FindBy(xpath = "//a[text()='Signs of Hemorrhoids']//self::a[@href='/learn-more/signs-of-hemorrhoids/']")
	private static WebElement articleEighteen;
	
	@FindBy(xpath = "//a[text()='Treating Flare-Ups']//self::a[@href='/learn-more/treating-flare-ups/']")
	private static WebElement articleNineteen;
	
	@FindBy(xpath = "//a[text()='Medical Treatment']//self::a[@href='/learn-more/medical-treatment-of-hemorrhoids/']")
	private static WebElement articleTwenty;
	
	@FindBy(xpath = "//a[text()='Home Remedies for Hemorrhoids']//self::a[@href='/learn-more/home-remedies-for-hemorrhoids/']")
	private static WebElement articleTwentyOne;
	
	@FindBy(xpath = "//a[text()='Can You Use Witch Hazel for Hemorrhoids?']//self::a[@href='/learn-more/witch-hazel-for-hemorrhoids/']")
	private static WebElement articleTwentyTwo;
	
	@FindBy(xpath = "//a[text()='The Link Between Stress and Constipation']//self::a[@href='/learn-more/stress-and-constipation/']")
	private static WebElement articleTwentyThree;
	
	@FindBy(xpath = "//a[text()='Can Stress Cause Hemorrhoids?']//self::a[@href='/learn-more/stress-and-hemorrhoids/']")
	private static WebElement articleTwentyFour;
	
	@FindBy(xpath = "//a[text()='6 Reasons You Have an Itchy Butt']//self::a[@href='/learn-more/6-reasons-you-have-itchy-butt/']")
	private static WebElement articleTwentyFive;
	
	@FindBy(xpath = "//a[text()='7 Surprising Things That Irritate Your Butt']//self::a[@href='/learn-more/7-surprising-things-that-irritate-your-butt/']")
	private static WebElement articleTwentySix;
	
	@FindBy(xpath = "//a[text()='Could Lifting Weights Give You Hemorrhoids?']//self::a[@href='/learn-more/could-lifting-weights-give-you-hemorrhoids/']")
	private static WebElement articleTwentySeven;
	
	@FindBy(xpath = "//a[text()='5 Gifts to Give Someone Who Is Expecting']//self::a[@href='/learn-more/5-gifts-give-someone-who-expecting/']")
	private static WebElement articleTwentyEight;
	
	@FindBy(xpath = "//a[text()='5 Reasons to Simplify Your Washing-Up Routine']//self::a[@href='/learn-more/5-reasons-simplify-your-washing-routine/']")
	private static WebElement articleTwentyNine;
	
	@FindBy(xpath = "//a[text()='5 Things That Can Cause Discomfort When Sitting']//self::a[@href='/learn-more/5-things-can-cause-discomfort-when-sitting/']")
	private static WebElement articleThirty;
	
	@FindBy(xpath = "//a[text()='Treating Flare-Ups Away from Home']//self::a[@href='/learn-more/treating-flare-ups-away-from-home/']")
	private static WebElement articleThirtyOne;
	
	@FindBy(xpath = "//a[text()='6 Unexpected Things to Pack on Your Next Trip']//self::a[@href='/learn-more/6-unexpected-things-pack-your-next-trip/']")
	private static WebElement articleThirtyTwo;
	
	@FindBy(xpath = "//a[text()='How to Travel if You Have GI Problems']//self::a[@href='/learn-more/how-travel-if-you-have-gi-problems/']")
	private static WebElement articleThirtyThree;
	
	@FindBy(xpath = "//a[text()='6 Tips for Staying Regular on Vacation']//self::a[@href='/learn-more/6-tips-staying-regular-vacation/']")
	private static WebElement articleThirtyFour;
	
	@FindBy(xpath = "//a[text()='All About Postpartum Hemorrhoids']//self::a[@href='/learn-more/postpartum-hemorrhoids/']")
	private static WebElement articleThirtyFive;
	
	@FindBy(xpath = "//a[text()='Can a Hemorrhoid Pop?']//self::a[@href='/learn-more/can-hemorrhoid-pop/']")
	private static WebElement articleThirtySix;
	
	@FindBy(xpath = "//a[text()='How to Prevent Hemorrhoids with Home Remedies']//self::a[@href='/learn-more/how-to-prevent-hemorrhoids-at-home/']")
	private static WebElement articleThirtySeven;
	
	@FindBy(xpath = "//a[text()='Should You Use Hemorrhoidal Wipes?']//self::a[@href='/learn-more/use-hemorrhoidal-wipes/']")
	private static WebElement articleThirtyEight;
	
	
	
	
	
	@FindBy(xpath = "//a[text()='All About Bleeding Hemorrhoids']//following::button[@id='allaboutbleeding-link']")
	private static WebElement articleReadMoreOne;

	@FindBy(xpath = "//a[text()='How to Tell If You Have Hemorrhoids']//self::a[@href='/learn-more/how-to-tell-if-you-have-hemorrhoids/']//following::button[@id='how-to-tell-if-you-have-hemorrhoids-link']")
	private static WebElement articleReadMoreTwo;
	
	@FindBy(xpath = "//a[text()='How Long do Hemorrhoids Last?']//self::a[@href='/learn-more/how-long-do-hemorrhoids-last/']//following::button[@id='how-long-do-hemorrhoids-last-link']")
	private static WebElement articleReadMoreThree;
	
	@FindBy(xpath = "//a[text()='The Hemorrhoid Diet']//self::a[@href='/learn-more/hemorrhoid-diet/']//following::button[@id='hemorrhoid-diet-link']")
	private static WebElement articleReadMoreFour;
	
	@FindBy(xpath = "//a[text()='Physical Activity']//self::a[@href='/learn-more/physical-activity/']//following::button[@id='physical-activity-link']")
	private static WebElement articleReadMoreFive;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll']//self::a[@href='/learn-more/emotional-toll-of-hemorrhoids/']//following::button[@id='emotional-toll-link']")
	private static WebElement articleReadMoreSix;
	
	@FindBy(xpath = "//a[text()='Using the Bathroom']//self::a[@href='/learn-more/using-the-bathroom/']//following::button[@id='using-the-bathroom-link']")
	private static WebElement articleReadMoreSeven;
	
	@FindBy(xpath = "//a[text()='Just for Moms']//self::a[@href='/learn-more/just-for-moms/']//following::button[@id='just-for-moms-link']")
	private static WebElement articleReadMoreEight;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']//self::a[@href='/learn-more/what-are-hemorrhoids/']//following::button[@id='what-are-hemorrhoids-link']")
	private static WebElement articleReadMoreNine;
	
	@FindBy(xpath = "//button[@id='who-gets-hemorrhoids-link']")
	private static WebElement articleReadMoreTen;
	
	@FindBy(xpath = "//a[text()='Symptoms']//self::a[@href='/learn-more/hemorrhoid-symptoms/']//following::button[@id='hemorrhoid-symptoms-link']")
	private static WebElement articleReadMoreEleven;
	
	@FindBy(xpath = "//button[@id='causes-of-hemorrhoids-link']")
	private static WebElement articleReadMoreTweleve;
	
	@FindBy(xpath = "//button[@id='hemorrhoid-discussion-guide-link']")
	private static WebElement articleReadMoreThirteen;
	
	@FindBy(xpath = "//button[@id='everything-you-need-know-about-hemorrhoids-link']")
	private static WebElement articleReadMoreFourteen;
	
	@FindBy(xpath = "//button[@id='hemorrhoid-flare-ups-link']")
	private static WebElement articleReadMoreFifteen;
	
	@FindBy(xpath = "//button[@id='hemorrhoid-pain-link']")
	private static WebElement articleReadMoreSixteen;
	
	@FindBy(xpath = "//button[@id='hemorrhoid-medicine-101-link']")
	private static WebElement articleReadMoreSeventeen;
	
	@FindBy(xpath = "//button[@id='signs-of-hemorrhoids-link']")
	private static WebElement articleReadMoreEighteen;
	
	@FindBy(xpath = "//button[@id='treating-flare-ups-link']")
	private static WebElement articleReadMoreNineteen;
	
	@FindBy(xpath = "//button[@id='medical-treatment-of-hemorrhoids-link']")
	private static WebElement articleReadMoreTwenty;
	
	@FindBy(xpath = "//button[@id='home-remedies-for-hemorrhoids-link']")
	private static WebElement articleReadMoreTwentyOne;
	
	@FindBy(xpath = "//button[@id='witch-hazel-for-hemorrhoids-link']")
	private static WebElement articleReadMoreTwentyTwo;
	
	@FindBy(xpath = "//button[@id='stress-and-constipation-link']")
	private static WebElement articleReadMoreTwentyThree;
	
	@FindBy(xpath = "//button[@id='stress-and-hemorrhoids-link']")
	private static WebElement articleReadMoreTwentyFour;
	
	@FindBy(xpath = "//button[@id='itchy-butt-link']")
	private static WebElement articleReadMoreTwentyFive;
	
	@FindBy(xpath = "//button[@id='surprising-things-that-irritate-your-butt-link']")
	private static WebElement articleReadMoreTwentySix;
	
	@FindBy(xpath = "//button[@id='could-lifting-weights-give-you-hemorrhoids-link']")
	private static WebElement articleReadMoreTwentySeven;
	
	@FindBy(xpath = "//button[@id='gifts-give-someone-who-expecting-link']")
	private static WebElement articleReadMoreTwentyEight;
	
	@FindBy(xpath = "//button[@id='reasons-simplify-your-washing-routine-link']")
	private static WebElement articleReadMoreTwentyNine;
	
	@FindBy(xpath = "//button[@id='things-can-cause-discomfort-when-sitting-link']")
	private static WebElement articleReadMoreThirty;
	
	@FindBy(xpath = "//button[@id='treating-flare-ups-away-from-home-link']")
	private static WebElement articleReadMoreThirtyOne;
	
	@FindBy(xpath = "//button[@id='unexpected-things-pack-your-next-trip-link']")
	private static WebElement articleReadMoreThirtyTwo;
	
	@FindBy(xpath = "//button[@id='how-travel-if-you-have-gi-problems-link']")
	private static WebElement articleReadMoreThirtyThree;
	
	@FindBy(xpath = "//button[@id='tips-staying-regular-vacation-link']")
	private static WebElement articleReadMoreThirtyFour;
	
	@FindBy(xpath = "//button[@id='postpartum-hemorrhoids-link']")
	private static WebElement articleReadMoreThirtyFive;
	
	@FindBy(xpath = "//button[@id='can-hemorrhoid-pop-link']")
	private static WebElement articleReadMoreThirtySix;
	
	@FindBy(xpath = "//button[@id='how-to-prevent-hemorrhoids-at-home-link']")
	private static WebElement articleReadMoreThirtySeven;
	
	@FindBy(xpath = "//button[@id='use-hemorrhoidal-wipes-link']")
	private static WebElement articleReadMoreThirtyEight;
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	public void clickArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleOne)) {
			scrollDownUsingElement(articleOne);
			clickElementUsingJavaScript(articleOne);
			pageLoad();
			System.out.println("Article One is clicked successfully");
		} else {
			System.out.println("Article One is not presented in the page");
			throw new Exception("Article One is not presented in the page");
		}
	}
	
	public void clickArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwo)) {
			scrollDownUsingElement(articleTwo);
			clickElementUsingJavaScript(articleTwo);
			pageLoad();
			System.out.println("Article Two is clicked successfully");
		} else {
			System.out.println("Article Two is not presented in the page");
			throw new Exception("Article Two is not presented in the page");
		}
	}
	
	public void clickArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThree)) {
			scrollDownUsingElement(articleThree);
			clickElementUsingJavaScript(articleThree);
			pageLoad();
			System.out.println("Article Three is clicked successfully");
		} else {
			System.out.println("Article Three is not presented in the page");
			throw new Exception("Article Three is not presented in the page");
		}
	}
	
	public void clickArticleFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleFour)) {
			scrollDownUsingElement(articleFour);
			clickElementUsingJavaScript(articleFour);
			pageLoad();
			System.out.println("Article Four is clicked successfully");
		} else {
			System.out.println("Article Four is not presented in the page");
			throw new Exception("Article Four is not presented in the page");
		}
	}
	
	public void clickArticleFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleFive)) {
			scrollDownUsingElement(articleFive);
			clickElementUsingJavaScript(articleFive);
			pageLoad();
			System.out.println("Article Five is clicked successfully");
		} else {
			System.out.println("Article Five is not presented in the page");
			throw new Exception("Article Five is not presented in the page");
		}
	}
	
	public void clickArticleSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleSix)) {
			scrollDownUsingElement(articleSix);
			clickElementUsingJavaScript(articleSix);
			pageLoad();
			System.out.println("Article Six is clicked successfully");
		} else {
			System.out.println("Article Six is not presented in the page");
			throw new Exception("Article Six is not presented in the page");
		}
	}
	
	public void clickArticleSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleSeven)) {
			scrollDownUsingElement(articleSeven);
			clickElementUsingJavaScript(articleSeven);
			pageLoad();
			System.out.println("Article Seven is clicked successfully");
		} else {
			System.out.println("Article Seven is not presented in the page");
			throw new Exception("Article Seven is not presented in the page");
		}
	}
	
	public void clickArticleEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleEight)) {
			scrollDownUsingElement(articleEight);
			clickElementUsingJavaScript(articleEight);
			pageLoad();
			System.out.println("Article Eight is clicked successfully");
		} else {
			System.out.println("Article Eight is not presented in the page");
			throw new Exception("Article Eight is not presented in the page");
		}
	}
	
	public void clickArticleNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleNine)) {
			scrollDownUsingElement(articleNine);
			clickElementUsingJavaScript(articleNine);
			pageLoad();
			System.out.println("Article Nine is clicked successfully");
		} else {
			System.out.println("Article Nine is not presented in the page");
			throw new Exception("Article Nine is not presented in the page");
		}
	}
	
	public void clickArticleTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTen)) {
			scrollDownUsingElement(articleTen);
			clickElementUsingJavaScript(articleTen);
			pageLoad();
			System.out.println("Article Ten is clicked successfully");
		} else {
			System.out.println("Article Ten is not presented in the page");
			throw new Exception("Article Ten is not presented in the page");
		}
	}
	
	public void clickArticleEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleEleven)) {
			scrollDownUsingElement(articleEleven);
			clickElementUsingJavaScript(articleEleven);
			pageLoad();
			System.out.println("Article Eleven is clicked successfully");
		} else {
			System.out.println("Article Eleven is not presented in the page");
			throw new Exception("Article Eleven is not presented in the page");
		}
	}
	
	public void clickArticleTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTweleve)) {
			scrollDownUsingElement(articleTweleve);
			clickElementUsingJavaScript(articleTweleve);
			pageLoad();
			System.out.println("Article Tweleve is clicked successfully");
		} else {
			System.out.println("Article Tweleve is not presented in the page");
			throw new Exception("Article Tweleve is not presented in the page");
		}
	}
	
	public void clickArticleThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirteen)) {
			scrollDownUsingElement(articleThirteen);
			clickElementUsingJavaScript(articleThirteen);
			pageLoad();
			System.out.println("Article Thirteen is clicked successfully");
		} else {
			System.out.println("Article Thirteen is not presented in the page");
			throw new Exception("Article Thirteen is not presented in the page");
		}
	}
	
	public void clickArticleFourteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleFourteen)) {
			scrollDownUsingElement(articleFourteen);
			clickElementUsingJavaScript(articleFourteen);
			pageLoad();
			System.out.println("Article Fourteen is clicked successfully");
		} else {
			System.out.println("Article Fourteen is not presented in the page");
			throw new Exception("Article Fourteen is not presented in the page");
		}
	}
	
	public void clickArticleFifteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleFifteen)) {
			scrollDownUsingElement(articleFifteen);
			clickElementUsingJavaScript(articleFifteen);
			pageLoad();
			System.out.println("Article Fifteen is clicked successfully");
		} else {
			System.out.println("Article Fifteen is not presented in the page");
			throw new Exception("Article Fifteen is not presented in the page");
		}
	}
	
	public void clickArticleSixteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleSixteen)) {
			scrollDownUsingElement(articleSixteen);
			clickElementUsingJavaScript(articleSixteen);
			pageLoad();
			System.out.println("Article Sixteen is clicked successfully");
		} else {
			System.out.println("Article Sixteen is not presented in the page");
			throw new Exception("Article Sixteen is not presented in the page");
		}
	}
	
	public void clickArticleSeventeen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleSeventeen)) {
			scrollDownUsingElement(articleSeventeen);
			clickElementUsingJavaScript(articleSeventeen);
			pageLoad();
			System.out.println("Article Seventeen is clicked successfully");
		} else {
			System.out.println("Article  Seventeenis not presented in the page");
			throw new Exception("Article Seventeen is not presented in the page");
		}
	}
	
	public void clickArticleEighteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleEighteen)) {
			scrollDownUsingElement(articleEighteen);
			clickElementUsingJavaScript(articleEighteen);
			pageLoad();
			System.out.println("Article Eighteen is clicked successfully");
		} else {
			System.out.println("Article Eighteen is not presented in the page");
			throw new Exception("Article Eighteen is not presented in the page");
		}
	}
	
	public void clickArticleNineteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleNineteen)) {
			scrollDownUsingElement(articleNineteen);
			clickElementUsingJavaScript(articleNineteen);
			pageLoad();
			System.out.println("Article Nineteen is clicked successfully");
		} else {
			System.out.println("Article Nineteen is not presented in the page");
			throw new Exception("Article Nineteen is not presented in the page");
		}
	}
	
	public void clickArticleTwenty() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwenty)) {
			scrollDownUsingElement(articleTwenty);
			clickElementUsingJavaScript(articleTwenty);
			pageLoad();
			System.out.println("Article Twenty is clicked successfully");
		} else {
			System.out.println("Article Twenty is not presented in the page");
			throw new Exception("Article Twenty is not presented in the page");
		}
	}
	
	public void clickArticleTwentyOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyOne)) {
			scrollDownUsingElement(articleTwentyOne);
			clickElementUsingJavaScript(articleTwentyOne);
			pageLoad();
			System.out.println("Article Twenty One is clicked successfully");
		} else {
			System.out.println("Article Twenty One is not presented in the page");
			throw new Exception("Article Twenty One is not presented in the page");
		}
	}
	
	public void clickArticleTwentyTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyTwo)) {
			scrollDownUsingElement(articleTwentyTwo);
			clickElementUsingJavaScript(articleTwentyTwo);
			pageLoad();
			System.out.println("Article Twenty Two is clicked successfully");
		} else {
			System.out.println("Article Twenty Two is not presented in the page");
			throw new Exception("Article Twenty Two is not presented in the page");
		}
	}
	
	public void clickArticleTwentyThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyThree)) {
			scrollDownUsingElement(articleTwentyThree);
			clickElementUsingJavaScript(articleTwentyThree);
			pageLoad();
			System.out.println("Article Twenty Three is clicked successfully");
		} else {
			System.out.println("Article Twenty Three is not presented in the page");
			throw new Exception("Article Twenty Three is not presented in the page");
		}
	}
	
	public void clickArticleTwentyFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyFour)) {
			scrollDownUsingElement(articleTwentyFour);
			clickElementUsingJavaScript(articleTwentyFour);
			pageLoad();
			System.out.println("Article Twenty Four is clicked successfully");
		} else {
			System.out.println("Article Twenty Four is not presented in the page");
			throw new Exception("Article Twenty Four is not presented in the page");
		}
	}
	
	public void clickArticleTwentyFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyFive)) {
			scrollDownUsingElement(articleTwentyFive);
			clickElementUsingJavaScript(articleTwentyFive);
			pageLoad();
			System.out.println("Article Twenty Five is clicked successfully");
		} else {
			System.out.println("Article Twenty Five is not presented in the page");
			throw new Exception("Article Twenty Five is not presented in the page");
		}
	}
	
	public void clickArticleTwentySix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentySix)) {
			scrollDownUsingElement(articleTwentySix);
			clickElementUsingJavaScript(articleTwentySix);
			pageLoad();
			System.out.println("Article Twenty Six is clicked successfully");
		} else {
			System.out.println("Article Twenty Six is not presented in the page");
			throw new Exception("Article Twenty Six is not presented in the page");
		}
	}
	
	public void clickArticleTwentySeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentySeven)) {
			scrollDownUsingElement(articleTwentySeven);
			clickElementUsingJavaScript(articleTwentySeven);
			pageLoad();
			System.out.println("Article Twenty Seven is clicked successfully");
		} else {
			System.out.println("Article Twenty Seven is not presented in the page");
			throw new Exception("Article Twenty Seven is not presented in the page");
		}
	}
	
	public void clickArticleTwentyEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyEight)) {
			scrollDownUsingElement(articleTwentyEight);
			clickElementUsingJavaScript(articleTwentyEight);
			pageLoad();
			System.out.println("Article Twenty Eight is clicked successfully");
		} else {
			System.out.println("Article Twenty Eight is not presented in the page");
			throw new Exception("Article Twenty Eight is not presented in the page");
		}
	}
	
	public void clickArticleTwentyNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwentyNine)) {
			scrollDownUsingElement(articleTwentyNine);
			clickElementUsingJavaScript(articleTwentyNine);
			pageLoad();
			System.out.println("Article Twenty Nine is clicked successfully");
		} else {
			System.out.println("Article Twenty Nine is not presented in the page");
			throw new Exception("Article Twenty Nine is not presented in the page");
		}
	}
	
	public void clickArticleThirty() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirty)) {
			scrollDownUsingElement(articleThirty);
			clickElementUsingJavaScript(articleThirty);
			pageLoad();
			System.out.println("Article Thirty is clicked successfully");
		} else {
			System.out.println("Article Thirty is not presented in the page");
			throw new Exception("Article Thirty is not presented in the page");
		}
	}
	
	public void clickArticleThirtyOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyOne)) {
			scrollDownUsingElement(articleThirtyOne);
			clickElementUsingJavaScript(articleThirtyOne);
			pageLoad();
			System.out.println("Article Thirty One is clicked successfully");
		} else {
			System.out.println("Article Thirty One is not presented in the page");
			throw new Exception("Article Thirty One is not presented in the page");
		}
	}
	
	public void clickArticleThirtyTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyTwo)) {
			scrollDownUsingElement(articleThirtyTwo);
			clickElementUsingJavaScript(articleThirtyTwo);
			pageLoad();
			System.out.println("Article Thirty Two is clicked successfully");
		} else {
			System.out.println("Article Thirty Two is not presented in the page");
			throw new Exception("Article Thirty Two is not presented in the page");
		}
	}
	
	public void clickArticleThirtyThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyThree)) {
			scrollDownUsingElement(articleThirtyThree);
			clickElementUsingJavaScript(articleThirtyThree);
			pageLoad();
			System.out.println("Article Thirty Three is clicked successfully");
		} else {
			System.out.println("Article Thirty Three is not presented in the page");
			throw new Exception("Article Thirty Three is not presented in the page");
		}
	}
	
	public void clickArticleThirtyFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyFour)) {
			scrollDownUsingElement(articleThirtyFour);
			clickElementUsingJavaScript(articleThirtyFour);
			pageLoad();
			System.out.println("Article ThirtyFour is clicked successfully");
		} else {
			System.out.println("Article ThirtyFour is not presented in the page");
			throw new Exception("Article ThirtyFour is not presented in the page");
		}
	}
	
	public void clickArticleThirtyFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyFive)) {
			scrollDownUsingElement(articleThirtyFive);
			clickElementUsingJavaScript(articleThirtyFive);
			pageLoad();
			System.out.println("Article Thirty Five is clicked successfully");
		} else {
			System.out.println("Article Thirty Five is not presented in the page");
			throw new Exception("Article Thirty Five is not presented in the page");
		}
	}
	
	public void clickArticleThirtySix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtySix)) {
			scrollDownUsingElement(articleThirtySix);
			clickElementUsingJavaScript(articleThirtySix);
			pageLoad();
			System.out.println("Article Thirty Six is clicked successfully");
		} else {
			System.out.println("Article Thirty Six is not presented in the page");
			throw new Exception("Article Thirty Six is not presented in the page");
		}
	}
	
	public void clickArticleThirtySeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtySeven)) {
			scrollDownUsingElement(articleThirtySeven);
			clickElementUsingJavaScript(articleThirtySeven);
			pageLoad();
			System.out.println("Article Thirty Seven is clicked successfully");
		} else {
			System.out.println("Article Thirty Seven is not presented in the page");
			throw new Exception("Article Thirty Seven is not presented in the page");
		}
	}
	
	public void clickArticleThirtyEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThirtyEight)) {
			scrollDownUsingElement(articleThirtyEight);
			clickElementUsingJavaScript(articleThirtyEight);
			pageLoad();
			System.out.println("Article Thirty Eight is clicked successfully");
		} else {
			System.out.println("Article Thirty Eight is not presented in the page");
			throw new Exception("Article Thirty Eight is not presented in the page");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void clickArticleReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreOne)) {
			scrollDownUsingElement(articleReadMoreOne);
			clickElementUsingJavaScript(articleReadMoreOne);
			pageLoad();
			System.out.println("Article Read More One is clicked successfully");
		} else {
			System.out.println("Article Read More One is not presented in the page");
			throw new Exception("Article Read More One is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwo)) {
			scrollDownUsingElement(articleReadMoreTwo);
			clickElementUsingJavaScript(articleReadMoreTwo);
			pageLoad();
			System.out.println("Article Read More Two is clicked successfully");
		} else {
			System.out.println("Article Read More Two is not presented in the page");
			throw new Exception("Article Read More Two is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThree)) {
			scrollDownUsingElement(articleReadMoreThree);
			clickElementUsingJavaScript(articleReadMoreThree);
			pageLoad();
			System.out.println("Article Read More Three is clicked successfully");
		} else {
			System.out.println("Article Read More Three is not presented in the page");
			throw new Exception("Article Read More Three is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreFour)) {
			scrollDownUsingElement(articleReadMoreFour);
			clickElementUsingJavaScript(articleReadMoreFour);
			pageLoad();
			System.out.println("Article Read More Four is clicked successfully");
		} else {
			System.out.println("Article Read More Four is not presented in the page");
			throw new Exception("Article Read More Four is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreFive)) {
			scrollDownUsingElement(articleReadMoreFive);
			clickElementUsingJavaScript(articleReadMoreFive);
			pageLoad();
			System.out.println("Article Read More Five is clicked successfully");
		} else {
			System.out.println("Article Read More Five is not presented in the page");
			throw new Exception("Article Read More Five is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreSix)) {
			scrollDownUsingElement(articleReadMoreSix);
			clickElementUsingJavaScript(articleReadMoreSix);
			pageLoad();
			System.out.println("Article Read More Six is clicked successfully");
		} else {
			System.out.println("Article Read More Six is not presented in the page");
			throw new Exception("Article Read More Six is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreSeven)) {
			scrollDownUsingElement(articleReadMoreSeven);
			clickElementUsingJavaScript(articleReadMoreSeven);
			pageLoad();
			System.out.println("Article Read More Seven is clicked successfully");
		} else {
			System.out.println("Article Read More Seven is not presented in the page");
			throw new Exception("Article Read More Seven is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreEight)) {
			scrollDownUsingElement(articleReadMoreEight);
			clickElementUsingJavaScript(articleReadMoreEight);
			pageLoad();
			System.out.println("Article Read More Eight is clicked successfully");
		} else {
			System.out.println("Article Read More Eight is not presented in the page");
			throw new Exception("Article Read More Eight is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreNine)) {
			scrollDownUsingElement(articleReadMoreNine);
			clickElementUsingJavaScript(articleReadMoreNine);
			pageLoad();
			System.out.println("Article Read More Nine is clicked successfully");
		} else {
			System.out.println("Article Read More Nine is not presented in the page");
			throw new Exception("Article Read More Nine is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTen)) {
			scrollDownUsingElement(articleReadMoreTen);
			clickElementUsingJavaScript(articleReadMoreTen);
			pageLoad();
			System.out.println("Article Read More Ten is clicked successfully");
		} else {
			System.out.println("Article Read More Ten is not presented in the page");
			throw new Exception("Article Read More Ten is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreEleven)) {
			scrollDownUsingElement(articleReadMoreEleven);
			clickElementUsingJavaScript(articleReadMoreEleven);
			pageLoad();
			System.out.println("Article Read More Eleven is clicked successfully");
		} else {
			System.out.println("Article Read More Eleven is not presented in the page");
			throw new Exception("Article Read More Eleven is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTweleve)) {
			scrollDownUsingElement(articleReadMoreTweleve);
			clickElementUsingJavaScript(articleReadMoreTweleve);
			pageLoad();
			System.out.println("Article Read More Tweleve is clicked successfully");
		} else {
			System.out.println("Article Read More Tweleve is not presented in the page");
			throw new Exception("Article Read More Tweleve is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirteen)) {
			scrollDownUsingElement(articleReadMoreThirteen);
			clickElementUsingJavaScript(articleReadMoreThirteen);
			pageLoad();
			System.out.println("Article Read More Thirteen is clicked successfully");
		} else {
			System.out.println("Article Read More Thirteen is not presented in the page");
			throw new Exception("Article Read More Thirteen is not presented in the page");
		}
	}
	
	
	public void clickArticleReadMoreFourteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreFourteen)) {
			scrollDownUsingElement(articleReadMoreFourteen);
			clickElementUsingJavaScript(articleReadMoreFourteen);
			pageLoad();
			System.out.println("Article Read More Fourteen is clicked successfully");
		} else {
			System.out.println("Article Read More Fourteen is not presented in the page");
			throw new Exception("Article Read More Fourteen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreFifteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreFifteen)) {
			scrollDownUsingElement(articleReadMoreFifteen);
			clickElementUsingJavaScript(articleReadMoreFifteen);
			pageLoad();
			System.out.println("Article Read More Fifteen is clicked successfully");
		} else {
			System.out.println("Article Read More Fifteen is not presented in the page");
			throw new Exception("Article Read More Fifteen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreSixteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreSixteen)) {
			scrollDownUsingElement(articleReadMoreSixteen);
			clickElementUsingJavaScript(articleReadMoreSixteen);
			pageLoad();
			System.out.println("Article Read More Sixteen is clicked successfully");
		} else {
			System.out.println("Article Read More Sixteen is not presented in the page");
			throw new Exception("Article Read More Sixteen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreSeventeen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreSeventeen)) {
			scrollDownUsingElement(articleReadMoreSeventeen);
			clickElementUsingJavaScript(articleReadMoreSeventeen);
			pageLoad();
			System.out.println("Article Read More Seventeen is clicked successfully");
		} else {
			System.out.println("Article Read More Seventeen is not presented in the page");
			throw new Exception("Article Read More Seventeen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreEighteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreEighteen)) {
			scrollDownUsingElement(articleReadMoreEighteen);
			clickElementUsingJavaScript(articleReadMoreEighteen);
			pageLoad();
			System.out.println("Article Read More Eighteen is clicked successfully");
		} else {
			System.out.println("Article Read More Eighteen is not presented in the page");
			throw new Exception("Article Read More Eighteen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreNineteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreNineteen)) {
			scrollDownUsingElement(articleReadMoreNineteen);
			clickElementUsingJavaScript(articleReadMoreNineteen);
			pageLoad();
			System.out.println("Article Read More Nineteen is clicked successfully");
		} else {
			System.out.println("Article Read More Nineteen is not presented in the page");
			throw new Exception("Article Read More Nineteen is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwenty() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwenty)) {
			scrollDownUsingElement(articleReadMoreTwenty);
			clickElementUsingJavaScript(articleReadMoreTwenty);
			pageLoad();
			System.out.println("Article Read More Twenty is clicked successfully");
		} else {
			System.out.println("Article Read More Twenty is not presented in the page");
			throw new Exception("Article Read More Twenty is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyOne)) {
			scrollDownUsingElement(articleReadMoreTwentyOne);
			clickElementUsingJavaScript(articleReadMoreTwentyOne);
			pageLoad();
			System.out.println("Article Read More TwentyOne is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyOne is not presented in the page");
			throw new Exception("Article Read More TwentyOne is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyTwo)) {
			scrollDownUsingElement(articleReadMoreTwentyTwo);
			clickElementUsingJavaScript(articleReadMoreTwentyTwo);
			pageLoad();
			System.out.println("Article Read More TwentyTwo is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyTwo is not presented in the page");
			throw new Exception("Article Read More TwentyTwo is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyThree)) {
			scrollDownUsingElement(articleReadMoreTwentyThree);
			clickElementUsingJavaScript(articleReadMoreTwentyThree);
			pageLoad();
			System.out.println("Article Read More TwentyThree is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyThree is not presented in the page");
			throw new Exception("Article Read More TwentyThree is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyFour)) {
			scrollDownUsingElement(articleReadMoreTwentyFour);
			clickElementUsingJavaScript(articleReadMoreTwentyFour);
			pageLoad();
			System.out.println("Article Read More TwentyFour is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyFour is not presented in the page");
			throw new Exception("Article Read More TwentyFour is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyFive)) {
			scrollDownUsingElement(articleReadMoreTwentyFive);
			clickElementUsingJavaScript(articleReadMoreTwentyFive);
			pageLoad();
			System.out.println("Article Read More TwentyFive is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyFive is not presented in the page");
			throw new Exception("Article Read More TwentyFive is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentySix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentySix)) {
			scrollDownUsingElement(articleReadMoreTwentySix);
			clickElementUsingJavaScript(articleReadMoreTwentySix);
			pageLoad();
			System.out.println("Article Read More TwentySix is clicked successfully");
		} else {
			System.out.println("Article Read More TwentySix is not presented in the page");
			throw new Exception("Article Read More TwentySix is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentySeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentySeven)) {
			scrollDownUsingElement(articleReadMoreTwentySeven);
			clickElementUsingJavaScript(articleReadMoreTwentySeven);
			pageLoad();
			System.out.println("Article Read More TwentySeven is clicked successfully");
		} else {
			System.out.println("Article Read More TwentySeven is not presented in the page");
			throw new Exception("Article Read More TwentySeven is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyEight)) {
			scrollDownUsingElement(articleReadMoreTwentyEight);
			clickElementUsingJavaScript(articleReadMoreTwentyEight);
			pageLoad();
			System.out.println("Article Read More TwentyEight is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyEight is not presented in the page");
			throw new Exception("Article Read More TwentyEight is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreTwentyNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreTwentyNine)) {
			scrollDownUsingElement(articleReadMoreTwentyNine);
			clickElementUsingJavaScript(articleReadMoreTwentyNine);
			pageLoad();
			System.out.println("Article Read More TwentyNine is clicked successfully");
		} else {
			System.out.println("Article Read More TwentyNine is not presented in the page");
			throw new Exception("Article Read More TwentyNine is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirty() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirty)) {
			scrollDownUsingElement(articleReadMoreThirty);
			clickElementUsingJavaScript(articleReadMoreThirty);
			pageLoad();
			System.out.println("Article Read More Thirty is clicked successfully");
		} else {
			System.out.println("Article Read More Thirty is not presented in the page");
			throw new Exception("Article Read More Thirty is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyOne)) {
			scrollDownUsingElement(articleReadMoreThirtyOne);
			clickElementUsingJavaScript(articleReadMoreThirtyOne);
			pageLoad();
			System.out.println("Article Read More ThirtyOne is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyOne is not presented in the page");
			throw new Exception("Article Read More ThirtyOne is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyTwo)) {
			scrollDownUsingElement(articleReadMoreThirtyTwo);
			clickElementUsingJavaScript(articleReadMoreThirtyTwo);
			pageLoad();
			System.out.println("Article Read More ThirtyTwo is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyTwo is not presented in the page");
			throw new Exception("Article Read More ThirtyTwo is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyThree)) {
			scrollDownUsingElement(articleReadMoreThirtyThree);
			clickElementUsingJavaScript(articleReadMoreThirtyThree);
			pageLoad();
			System.out.println("Article Read More ThirtyThree is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyThree is not presented in the page");
			throw new Exception("Article Read More ThirtyThree is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyFour)) {
			scrollDownUsingElement(articleReadMoreThirtyFour);
			clickElementUsingJavaScript(articleReadMoreThirtyFour);
			pageLoad();
			System.out.println("Article Read More ThirtyFour is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyFour is not presented in the page");
			throw new Exception("Article Read More ThirtyFour is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyFive)) {
			scrollDownUsingElement(articleReadMoreThirtyFive);
			clickElementUsingJavaScript(articleReadMoreThirtyFive);
			pageLoad();
			System.out.println("Article Read More ThirtyFive is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyFive is not presented in the page");
			throw new Exception("Article Read More ThirtyFive is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtySix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtySix)) {
			scrollDownUsingElement(articleReadMoreThirtySix);
			clickElementUsingJavaScript(articleReadMoreThirtySix);
			pageLoad();
			System.out.println("Article Read More ThirtySix is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtySix is not presented in the page");
			throw new Exception("Article Read More ThirtySix is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtySeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtySeven)) {
			scrollDownUsingElement(articleReadMoreThirtySeven);
			clickElementUsingJavaScript(articleReadMoreThirtySeven);
			pageLoad();
			System.out.println("Article Read More ThirtySeven is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtySeven is not presented in the page");
			throw new Exception("Article Read More ThirtySeven is not presented in the page");
		}
	}
	
	public void clickArticleReadMoreThirtyEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleReadMoreThirtyEight)) {
			scrollDownUsingElement(articleReadMoreThirtyEight);
			clickElementUsingJavaScript(articleReadMoreThirtyEight);
			pageLoad();
			System.out.println("Article Read More ThirtyEight is clicked successfully");
		} else {
			System.out.println("Article Read More ThirtyEight is not presented in the page");
			throw new Exception("Article Read More ThirtyEight is not presented in the page");
		}
	}
	
	
	
	

}
