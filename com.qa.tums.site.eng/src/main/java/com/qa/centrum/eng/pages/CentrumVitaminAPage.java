package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminAPage extends BaseClass{
	
	public CentrumVitaminAPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//strong[text()='Eye Health']//ancestor::div[contains(@class,'box component section bg-color-white rounded')]")
	private static WebElement eyeHealth;
	
	@FindBy(xpath = "//strong[text()='Pregnancy']//ancestor::div[contains(@class,'box component section bg-color-white rounded')]")
	private static WebElement pregnancy;
	
	
	
	
	@FindBy(xpath = "(//a[@href='/learn/articles/nutrients-and-routine/5-vitamins-and-minerals-for-healthy-eyes/'])[2]")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/what-to-eat-to-support-your-immune-health/']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[@href='/learn/articles/health-and-lifestyle-tips/complexion-protection/']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "(//a[@href='/learn/articles/nutrients-and-routine/nutrient-needs-throughout-pregnancy/'])[2]")
	private static WebElement articleFour;
	

	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[1]")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[2]")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[3]")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[4]")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//span[text()='Food & Nutrition']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement foodAndNutritionActive;
	
	@FindBy(xpath = "//span[text()='Featured Products']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement featuredProducts;
	
	@FindBy(xpath = "//span[text()='Featured Products']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement featuredProductsActive;
	

	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[1]")
	private static WebElement productMen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[2]")
	private static WebElement productWomen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[3]")
	private static WebElement productAdults;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[4]")
	private static WebElement productMultiAntioxidants;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//h2[text()='Centrum  MEN 40CT']")
	private static WebElement buyNowTextOne;
	
	@FindBy(xpath = "//h2[text()='Centrum  WOMEN 40CT']")
	private static WebElement buyNowTextTwo;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies Adult']")
	private static WebElement buyNowTextThree;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies MULTI_ANTIOXIDANTS 90CT']")
	private static WebElement buyNowTextFour;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compareFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Vitamins & Minerals']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Vitamin A']")
	private static WebElement breadcrumbFour;
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
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
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
		
		public void clickEyeHealth() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(eyeHealth);
			clickElementUsingJavaScript(eyeHealth);
		}
		
		public void clickPregnancy() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(pregnancy);
			clickElementUsingJavaScript(pregnancy);
			
		}
		
		public void clickArticleOne() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(articleOne);
			clickElementUsingJavaScript(articleOne);
		}
		
		public void clickArticleTwo() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(articleTwo);
			clickElementUsingJavaScript(articleTwo);
		}
		
		public void clickArticleThree() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(articleThree);
			clickElementUsingJavaScript(articleThree);
		}
		
		public void clickArticleFour() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(articleFour);
			clickElementUsingJavaScript(articleFour);
		}
		
		public void clickLearnMoreOne() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(learnMoreOne);
			clickElementUsingJavaScript(learnMoreOne);
		}
		
		public void clickLearnMoreTwo() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(learnMoreTwo);
			clickElementUsingJavaScript(learnMoreTwo);
		}
		
		public void clickLearnMoreThree() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(learnMoreThree);
			clickElementUsingJavaScript(learnMoreThree);
		}
		
		public void clickLearnMoreFour() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(learnMoreFour);
			clickElementUsingJavaScript(learnMoreFour);
		}
		
		public void clickFeaturedProduct() throws Exception{
			waitForPageLoadJava();
			if (isElementPresent(foodAndNutritionActive)) {
				scrollDownUsingElement(featuredProducts);
				clickElementUsingJavaScript(featuredProducts);
				visibilityOf(featuredProductsActive);
				Assert.assertTrue(elementIsDisplayed(featuredProductsActive));
				System.out.println(getElementText(featuredProductsActive));
				System.out.println("Featured products is verified");
			} else {
				System.out.println("Featured products is not verified");
				throw new Exception("Food And Nutrition is not active");

			}
		}
	
	
		public void clickProductMen() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(productMen)) {
				scrollDownUsingElement(productMen);
				clickElementUsingJavaScript(productMen);
			} else {
				System.out.println("Product card one is not verified");
				throw new Exception("Unable to verify the product card one");
			}
		}
		
		public void clickProductWomen() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(productWomen)) {
				scrollDownUsingElement(productWomen);
				clickElementUsingJavaScript(productWomen);
			} else {
				System.out.println("Product card Two is not verified");
				throw new Exception("Unable to verify the product card Two");
			}
		}
		
		public void clickProductAdults() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(productAdults)) {
				scrollDownUsingElement(productAdults);
				clickElementUsingJavaScript(productAdults);
			} else {
				System.out.println("Product card Three is not verified");
				throw new Exception("Unable to verify the product card Three");
			}
		}
		
		public void clickProductMultiAntioxidants() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(productMultiAntioxidants)) {
				scrollDownUsingElement(productMultiAntioxidants);
				clickElementUsingJavaScript(productMultiAntioxidants);
			} else {
				System.out.println("Product card Four is not verified");
				throw new Exception("Unable to verify the product card Four");
			}
		}
		
		public void clickBuyNowOne() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(buyNowOne)) {
				scrollDownUsingElement(buyNowOne);
				clickElementUsingJavaScript(buyNowOne);
				visibilityOf(buyNowTextOne);
				Assert.assertTrue(elementIsDisplayed(buyNowTextOne));
				System.out.println(getElementText(buyNowTextOne));
				System.out.println("Product card BuyNow one is verified");
			} else {
				System.out.println("Product card BuyNow one is not verified");
				throw new Exception("Unable to verify the Product card Buy Now One");
			}
		}
		
		public void clickBuyNowTwo() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(buyNowTwo)) {
				scrollDownUsingElement(buyNowTwo);
				clickElementUsingJavaScript(buyNowTwo);
				visibilityOf(buyNowTextTwo);
				Assert.assertTrue(elementIsDisplayed(buyNowTextTwo));
				System.out.println(getElementText(buyNowTextTwo));
				System.out.println("Product card BuyNow Two is verified");
			} else {
				System.out.println("Product card BuyNow Two is not verified");
				throw new Exception("Unable to verify the Product card Buy Now Two");
			}
		}
		
		public void clickBuyNowThree() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(buyNowThree)) {
				scrollDownUsingElement(buyNowThree);
				clickElementUsingJavaScript(buyNowThree);
				visibilityOf(buyNowTextThree);
				Assert.assertTrue(elementIsDisplayed(buyNowTextThree));
				System.out.println(getElementText(buyNowTextThree));
				System.out.println("Product card BuyNow Three is verified");
			} else {
				System.out.println("Product card BuyNow Three is not verified");
				throw new Exception("Unable to verify the Product card Buy Now Three");
			}
		}
		
		public void clickBuyNowFour() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(buyNowFour)) {
				scrollDownUsingElement(buyNowFour);
				clickElementUsingJavaScript(buyNowFour);
				visibilityOf(buyNowTextFour);
				Assert.assertTrue(elementIsDisplayed(buyNowTextFour));
				System.out.println(getElementText(buyNowTextFour));
				System.out.println("Product card BuyNow Four is verified");
			} else {
				System.out.println("Product card BuyNow Four is not verified");
				throw new Exception("Unable to verify the Product card Buy Now Four");
			}
		}
		
		
		public void clickCompareOne() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(compareOne)) {
				scrollDownUsingElement(compareOne);
				clickElementUsingJavaScript(compareOne);
				System.out.println("Product card compare One is clicked");
			} else {
				System.out.println("Product card compare One is not clicked");
				throw new Exception("Unable to click on Product card compare One");
			}
			
		}
		
		public void clickCompareTwo() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(compareTwo)) {
				scrollDownUsingElement(compareTwo);
				clickElementUsingJavaScript(compareTwo);
				System.out.println("Product card compare Two is clicked");
			} else {
				System.out.println("Product card compare Two is not clicked");
				throw new Exception("Unable to click on Product card compare Two");
			}
		}
		
		public void clickCompareThree() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(compareThree)) {
				scrollDownUsingElement(compareThree);
				clickElementUsingJavaScript(compareThree);
				System.out.println("Product card compare Three is clicked");
			} else {
				System.out.println("Product card compare Three is not clicked");
				throw new Exception("Unable to click on Product card compare Three");
			}
		}
		
		public void clickCompareFour() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(featuredProducts);
			clickElementUsingJavaScript(featuredProducts);
			if (isElementPresent(compareFour)) {
				scrollDownUsingElement(compareFour);
				clickElementUsingJavaScript(compareFour);
				System.out.println("Product card compare Four is clicked");
			} else {
				System.out.println("Product card compare Four is not clicked");
				throw new Exception("Unable to click on Product card compare Four");
			}
		}
		
		public void clickBreadcrumbOne() throws Exception{
			waitForPageLoadJava();
			visibilityOf(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
		}
		
		public void clickBreadcrumbTwo() throws Exception{
			waitForPageLoadJava();
			visibilityOf(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
		}
		
		public void clickBreadcrumbThree() throws Exception{
			waitForPageLoadJava();
			visibilityOf(breadcrumbThree);
			clickElementUsingJavaScript(breadcrumbThree);
		}
		
		public void clickBreadcrumbFour() throws Exception{
			waitForPageLoadJava();
			visibilityOf(breadcrumbFour);
			clickElementUsingJavaScript(breadcrumbFour);
		}
	
	
	
	
	
	
	
	
	
	

}
