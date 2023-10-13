package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateSitemapPage extends BaseClass{
	
	public CaltrateSitemapPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement sitemapbreadcrumbs;	
		
    @FindBy(xpath = "//a[text()='Caltrate Homepage']")
    private static WebElement caltratehomepage;	
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/\"])[3]")
    private static WebElement products;	
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3/\"])[3]")
    private static WebElement caltrate600d3;	
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-soft-chews/\"])[3]")
    private static WebElement caltrate600d3softchews;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/gummy-bites/\"])[3]")
    private static WebElement caltrategummybites;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals/\"])[3]")
    private static WebElement caltrate600d3minerals;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[3]")
    private static WebElement caltrate600d3mineralschewables;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-minis/\"])[3]")
    private static WebElement caltrate600d3mineralsminis;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/why-choose-caltrate/\"])[3]")
    private static WebElement whychoosecaltrate;
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/\"])[4]")
    private static WebElement bonehealthcentral;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/calcium-and-calcium-carbonate/\"])[3]")
    private static WebElement calciumcarbonate;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[3]")
    private static WebElement vitaminD;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosis;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/calcium-supplements/\"])[3]")
    private static WebElement calciumsupplements;
    
    @FindBy(xpath = "//a[@href=\"/health-care-professionals/\"]")
    private static WebElement healthcareprofession;
    
    @FindBy(xpath = "//a[@href=\"/health-care-professionals/is-osteoporosis-medicine-enough/\"]")
    private static WebElement osteoporsismedicine;
    
    @FindBy(xpath = "(//a[@href=\"/frequently-asked-questions/\"])[2]")
    private static WebElement faq;
    
    @FindBy(xpath = "(//a[@href=\"/coupons/\"])[2]")
    private static WebElement coupons;
    
    @FindBy(xpath = "(//a[@href=\"/where-to-buy/\"])[2]")
    private static WebElement wheretobuy;
    
    @FindBy(xpath = "(//a[@href=\"/contact/\"])[1]")
    private static WebElement contactus;
    
    @FindBy(xpath = "(//a[@href=\"/quality/\"])[1]")
    private static WebElement quality;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/\"])[3]")
    private static WebElement bonehealthcalcium;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/calcium-vitamin-d-supporting-your-bone-health/\"]")
    private static WebElement calciumvitaminD;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/trust-calcium-supplements-help-fill-your-nutritional-gap/\"]")
    private static WebElement trustcalciumsupplements;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/calcium-carbonate-vs-calcium-citrate/\"]")
    private static WebElement calciumcarbonatevscitrate;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/osteoporosis-help-reduce-risk/\"]")
    private static WebElement helpreducerisk;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/surgeon-generals-report/\"]")
    private static WebElement surgeongeneralreport;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/vitamin-d-and-your-health/\"])[1]")
    private static WebElement vitaminDwhatyouneedtoknow;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/vitamin-d-deficiency/\"]")
    private static WebElement vitaminDdeficiency;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/benefits-vitamind3/\"]")
    private static WebElement benefitsvitaminD;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/recipes/\"])[3]")
    private static WebElement calciumrichrecipes;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/recipes/summer-strong-shake/\"])[1]")
    private static WebElement summerstrongshake;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/recipes/arugula-salad/\"]")
    private static WebElement argulasalad;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/recipes/kale-chips/\"]")
    private static WebElement kalechips;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/recipes/next-day-turkey-soup/\"]")
    private static WebElement nextdayturkeysoup;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/recipes/salmon-cakes/\"]")
    private static WebElement salmoncakes;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/recipes/cheesy-cauliflower-soup/\"]")
    private static WebElement cheesycauliflowersoup;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/health-tips/\"])[3]")
    private static WebElement bonehealthtips;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/add-cup-milk-your-favorite-soup-boost-calcium/\"]")
    private static WebElement cupmilkfavouritesoup;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/work-your-upper-body-yard-work/\"]")
    private static WebElement workyourupperbody;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/activate-your-muscles-ankle-weights-during-power-walk/\"]")
    private static WebElement activateyourmuscles;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/pumpkin-seeds-can-help-support-bone-health/\"]")
    private static WebElement pumpkinsupportHealth;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/use-milk-and-add-almonds-oatmeal-boost-calcium/\"]")
    private static WebElement usemilkalmond;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/convert-percentage-calcium-milligrams-adding-zero/\"]")
    private static WebElement conversioncalcium;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/make-breakfast-banana-split-get-more-calcium/\"]")
    private static WebElement breakfastbanana;
    
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/health-tips/sesame-seeds-are-good-source-calcium/\"]")
    private static WebElement sesameseedgoodsource;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/tools/\"])[3]")
    private static WebElement Tools;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/tools/caltrate-beyond-bones/\"]")
    private static WebElement caltratebeyondbones;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/tools/calcium-at-every-age/\"]")
    private static WebElement calciumeveryage;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
  //methods
 	
 	public void clickCookieBtn() throws Exception {
         if (isElementPresent(cookieBtn)) {
             elementToBeClickable(cookieBtn);
             try {
                 if (cookieBtn.isDisplayed()) {
                     clickElementUsingJavaScript(cookieBtn);
                 }
               implicitWait();
                actionClick(cookieClose);
                 Assert.assertTrue(elementIsDisplayed(cookieClose));
             } catch (Exception e) {
             }
         }else {
             System.out.println("Dismiss is not presented");
         }
 	}
 	
 	
 	
 	public void clickonHomebreadcrumbs() throws Throwable {
 		waitForPageLoadJava();
 		elementClick(Homebreadcrumbs);
 }
 	public void clickonsitemapbreadcrumbs() throws Throwable {
 		waitForPageLoadJava();
 		elementClick(sitemapbreadcrumbs);
 }	
 	public void clickoncaltratehomepage() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltratehomepage);
 }	
 	public void clickonproducts() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(products);
 }	
 	public void clickoncaltrate600d3() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrate600d3);
 }	
 	public void clickoncaltrate600d3softchews() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrate600d3softchews);
 }	
 	public void clickoncaltrategummybites() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrategummybites);
 }	
 	public void clickoncaltrate600d3Minerals() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrate600d3minerals);
 }	
 	public void clickoncaltrate600d3Mineralschewables() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrate600d3mineralschewables);
 }	
 	public void clickoncaltrate600d3Mineralsminis() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltrate600d3mineralsminis);
 }	
 	public void clickonwhychoosecaltrate() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(whychoosecaltrate);
 }	
 	public void clickonbonehealthcentral() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(bonehealthcentral);
 }	
 	public void clickoncalciumcarbonate() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumcarbonate);
 }	
 	public void clickonVitaminD() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(vitaminD);
 }	
 	public void clickonosteoporosis() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(osteoporosis);
 }	
 	public void clickoncalciumsupplements() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumsupplements);
 }	
 	public void clickonhealthcareprofession() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(healthcareprofession);
 }	
 	public void clickonosteoporsismedicine() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(osteoporsismedicine);
 }	
 	public void clickonfaq() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(faq);
 }	
 	public void clickoncoupons() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(coupons);
 }	
 	public void clickonwheretobuy() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(wheretobuy);
 }	
 	public void clickoncontactus() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(contactus);
 }	
 	public void clickonquality() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(quality);
 }	
 	public void clickonbonehealthcalcium() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(bonehealthcalcium);
 }	
 	public void clickoncalciumvitaminD() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumvitaminD);
 }	
 	public void clickonTrustcalciumsupplements() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumsupplements);
 }	
 	public void clickoncalciumcarbonateCitrate() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumcarbonatevscitrate);
 }	
 	public void clickonHelpreducerisk() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(helpreducerisk);
 }	
 	public void clickonSurgeonReport() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(surgeongeneralreport);
 }	
 	public void clickonVitaminDdeficiency() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(vitaminDdeficiency);
 }	
 	public void clickonBenefitsVitaminD() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(benefitsvitaminD);
 }	
 	public void clickonsummerstrongshake() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(summerstrongshake);
 }	
 	public void clickonArgulasalad() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(argulasalad);
 }	
 	public void clickonnextdayturkeysoup() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(nextdayturkeysoup);
 }	
 	public void clickonkalechips() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(kalechips);
 }	
 	public void clickonSalmoncakes() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(salmoncakes);
 }	
 	public void clickoncheesycauliflowerSoup() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(cheesycauliflowersoup);
 }	
 	public void clickoncupmilksoupFavourite() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(cupmilkfavouritesoup);
 }	
 	public void clickonWorkyourupperbody() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(workyourupperbody);
 }	
 	public void clickonActivateyourMuscles() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(activateyourmuscles);
 }	
 	public void clickonPumpkinseedSupport() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(pumpkinsupportHealth);
 }	
 	public void clickonUseMilkaddAlmond() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(usemilkalmond);
 }	
 	public void clickonConversionCalcium() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(conversioncalcium);
 }	
 	public void clickonBreakfastBanana() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(breakfastbanana);
 }	
 	public void clickonsesameseed() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(sesameseedgoodsource);
 }	
 	public void clickontools() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(Tools);
 }	
 	public void clickonCaltrateBeyondBones() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(caltratebeyondbones);
 }	
 	public void clickonCalciumatEveryAge() throws Throwable {
 		waitForPageLoadJava();
 		clickElementUsingJavaScript(calciumeveryage);
 }	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	

}
