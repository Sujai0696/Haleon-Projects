package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class TumsQuickHeartBurnReliefPages extends BaseClass {
	
	public TumsQuickHeartBurnReliefPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	

	@FindBy(xpath="//li[@class=\"breadcrumb-list-item even \"]")
	private static WebElement heartburn101breadcrumbs;
	
	@FindBy(xpath="//li[@class=\"breadcrumb-list-item odd last is-current \"]//self::li")
	private static WebElement Quickheartbournbreadcrumbs;
	
//	@FindBy(xpath="//img[@title=\"Twitter\"]")
//	private static WebElement twitter;
//	
//	@FindBy(xpath = "//img[@Title='Facebook']")
//	private static WebElement facebook;
//	
//	@FindBy(xpath = "//img[@Title='Email']")
//	private static WebElement gmail;
	
	
	@FindBy(xpath="//a[text()='Heartburn Symptoms']")
	private static WebElement symptons;
	
	@FindBy(xpath="//a[text()='Heartburn Causes']")
	private static WebElement causes;
	
	@FindBy(xpath="//img[@title='Pregnant woman touching her belly and looking down at it smiling']")
	private static WebElement pregnant;
	
	@FindBy(xpath="//div[@class=\"box component section tums-article-card first odd last col-xs-12\"]//a[text()='How Does TUMS Work?']")
	private static WebElement tumswork;
	
	@FindBy(xpath="//div[@class=\"snippetReference component section default-style even last col-xs-12 reference-card-how-to-reduce-heartburn\"]")
	private static WebElement reduceheartburn;
	
	@FindBy(xpath="//a[text()='Stress and Heartburn']")
	private static WebElement stress;
	
	@FindBy(xpath="//a[text()='5 Simple Ways to Relieve Stress']")
	private static WebElement relievestress;
	
	@FindBy(xpath="//a[text()='Antacids And Why They Work']")
	private static WebElement antacids;
	
	@FindBy(xpath="//a[text()='Choosing an Over-the-Counter Heartburn Medication']")
	private static WebElement medication;
	
	@FindBy(xpath="//a[text()='Small Lifestyle Changes That Reduce Heartburn']")
	private static WebElement lifestyle;
	
	@FindBy(xpath="//a[text()='Manage Heartburn With Your Diet']")
	private static WebElement manage;
	
	@FindBy(xpath="//a[text()='How Do Antacids Help Heartburn?']")
	private static WebElement antacidhelp;
	
	@FindBy(xpath="//a[text()='Does Fried Food Make Heartburn Worse?']")
	private static WebElement worse;
	
	@FindBy(xpath="//a[text()='Calcium Carbonate and Heartburn']")
	private static WebElement calcium;
	
	@FindBy(xpath="//a[text()='Does Shapewear Cause Acid Reflux?']")
	private static WebElement shapewear;
	
	@FindBy(xpath="//a[text()='Can Pickle Juice Relieve Acid Reflux?']")
	private static WebElement reflux;
	
	@FindBy(xpath="//a[text()='Why Does Heartburn Happen at Night?']")
	private static WebElement night;
	
	@FindBy(xpath="//a[text()='What Causes Indigestion?']")
	private static WebElement indigestion;
	
	@FindBy(xpath="//a[text()='What Causes Acid Reflux?']")
	private static WebElement acidreflux;
	
	@FindBy(xpath="//a[text()='Spicy Foods You Should Avoid If You Get Heartburn']")
	private static WebElement spicyfood;
	
	@FindBy(xpath="//a[text()='Why Jogging May Trigger Acid Reflux']")
	private static WebElement jogging;
	
	@FindBy(xpath="//a[text()='What Is Achalasia Versus Acid Reflux?']")
	private static WebElement achalasia;
	
	@FindBy(xpath="//a[text()='The Best Beds and Pillows for Acid Reflux']")
	private static WebElement beds;
	
	@FindBy(xpath="//a[text()='Foods That Can Reduce Acid Reflux']")
	private static WebElement reduceacid;

	@FindBy(xpath="//a[text()='How to Spot Signs of Acid Reflux in Children and Babies']")
	private static WebElement spotsign;
	
	@FindBy(xpath="//a[text()='Diets That Can Reduce Acid Reflux?']")
	private static WebElement dietsreduce;
	
	@FindBy(xpath="//a[text()='5 Foods That Cause Acid Reflux']")
	private static WebElement causeacid;
	
	@FindBy(xpath="//a[text()='Bar Food That Won’t Cause Heartburn']")
	private static WebElement barfood;
	
	@FindBy(xpath="//a[text()='Postmeal Tips to Help Avoid Heartburn']")
	private static WebElement postmeal;
	
	@FindBy(xpath="(//a[@href=\"https://www.tums.com/amp/healthy-breakfast-ideas-that-wont-cause-heartburn.html\"])[2]")
	private static WebElement wontcause;
	
	@FindBy(xpath="//a[text()='There’s a Connection Between Your Weight and Heartburn']")
	private static WebElement connectionweight;
	

	@FindBy(xpath="//a[text()='Prepare for a Binge-Watching Marathon, Without Heartburn']")
	private static WebElement binge;
	
	@FindBy(xpath="//a[text()='Is It True That Apple Cider Vinegar Can Help With Heartburn?']")
	private static WebElement vinegar;
	
	@FindBy(xpath="//a[text()='Your Salad Is Hurting Your Stomach']")
	private static WebElement salad;

	@FindBy(xpath="//a[text()='Tips To Get Through a Business Lunch, Stress-Free']")
	private static WebElement businesslunch;
	
	@FindBy(xpath="//a[text()='Tips For a Great First Date (That Don’t Include Heartburn)']")
	private static WebElement firstdate;
	
	@FindBy(xpath="//a[text()='Occasional Heartburn? Stop Doing This 1 Thing Before Bed']")
	private static WebElement occasional;
	
	@FindBy(xpath="//a[text()='5 Foods That May Reduce Heartburn Symptoms']")
	private static WebElement symptonsfood;
	
	@FindBy(xpath="//a[text()='Heartburn Relief – Home Remedies for Heartburn']")
	private static WebElement homeremedies;
	
	@FindBy(xpath="//a[text()='Build Your Own Holiday Travel Kit']")
	private static WebElement holidaykit;
	
	@FindBy(xpath="//a[text()='Pass the Pie! Easy, Healthy Tips For Enjoying Holiday Meals']")
	private static WebElement holidaymeals;
	
	@FindBy(xpath="//a[text()='11 Thoughts We All Have at Office Holiday Parties']")
	private static WebElement thoughtsparties;
	
	@FindBy(xpath="//a[text()='4 Ways to Avoid Heartburn on New Year’s Eve']")
	private static WebElement waystoavoidheartburn;
	
	@FindBy(xpath="(//a[@href=\"https://www.tums.com/amp/prevent-heartburn-at-nye.html\"])[2]")
	private static WebElement newyearparty;
	
	@FindBy(xpath="//a[text()='Heartburn Relief For Football Sunday']")
	private static WebElement footballsunday;
	
	@FindBy(xpath="//a[text()='Avoid These Chocolates on V-Day If You Get Heartburn']")
	private static WebElement choclatesavoid;
	
	@FindBy(xpath="//a[text()='Gut Health Foods: How to Keep Your Gut Happy']")
	private static WebElement healthfoods;
	
	@FindBy(xpath="//a[text()='Indigestion Remedies']")
	private static WebElement indigestion_remedies;
	
	@FindBy(xpath="//a[text()='How to Improve Your Gut Health']")
	private static WebElement improve_health;
	
	@FindBy(xpath="//a[text()='Natural Remedies for Heartburn']")
	private static WebElement natural_remedies;
	
	@FindBy(xpath="//a[text()='Heartburn and Exercise']")
	private static WebElement heartburb_exercise;
	
	@FindBy(xpath="//a[text()='Gas Relief']")
	private static WebElement gas_relief;
	
	@FindBy(xpath="//a[text()='Which TUMS Product is Right for Me?']")
	private static WebElement product_right;
	
	@FindBy(xpath="//a[text()='See products']")
	private static WebElement see_product;
	
	
	
	
	
	
	//methods
	public void clickCookieBtn() throws Exception {
		//visibilityOf(cookieBtn);
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
	public void clickonbreadcrumb() throws Exception
	{
		//scrollDownUsingElement(heartburn);
		moveToElement(heartburn101breadcrumbs);
		elementClick(heartburn101breadcrumbs);
	}	
	public void clickonQuickheartburnreliefbreadcrumbs() throws Exception
	{
		//scrollDownUsingElement(heartburn);
		moveToElement(Quickheartbournbreadcrumbs);
		elementClick(Quickheartbournbreadcrumbs);
	}	
	
//	public void clickontwitter() throws Exception {
//		moveToElement(twitter);
//		elementClick(twitter);
//	}
//	public void clickonfacebook() {
//		elementClick(facebook);
//	}
//	public void clickongmail() {
//		elementClick(gmail);
//	}
	
//	public void clickscrollpages() throws Exception {
//        scrollDownUsingElement(quickheartburn);
//       elementClick(quickheartburn);
//        
//    }
	public void clickonsymptons() throws Exception {
		scrollDownUsingElement(symptons);
		clickElementUsingJavaScript(symptons);
	}
	public void clickoncauses() throws Exception {
		scrollDownUsingElement(causes);
		clickElementUsingJavaScript(causes);
	}
//	public void clickscrollpregantpages() throws Exception {
//        scrollDownUsingElement(quickheartburn);
//       elementClick(quickheartburn);
//        
//    }
	public void clickonpreganant() throws Exception {
		//elementClick(quickheartburn);
	//	moveToElement(pregnant);
		clickElementUsingJavaScript(pregnant);
	}
//	public void clickscrolltumspages() throws Exception {
//        scrollDownUsingElement(quickheartburn);
//       elementClick(quickheartburn);
//        
//    }
	public void clickonhowtumswork() throws Exception {
		moveToElement(tumswork);
		clickElementUsingJavaScript(tumswork);
	}
//	public void clickscrollreducespages() throws Exception {
//        scrollDownUsingElement(quickheartburn);
//       elementClick(quickheartburn);
//        
//    }
	public void clickonreduceburn() throws Exception {
		scrollDownUsingElement(reduceheartburn);
		clickElementUsingJavaScript(reduceheartburn);
	}
	public void clickonstress() throws Exception {
		scrollDownUsingElement(stress);
		//moveToElement(stress);
		clickElementUsingJavaScript(stress);
	}
	public void clickonreliefstress() throws Exception {
		scrollDownUsingElement(relievestress);
		moveToElement(relievestress);
		clickElementUsingJavaScript(relievestress);
	}
	public void clickonantacids() throws Exception {
		scrollDownUsingElement(antacids);
		moveToElement(antacids);
		clickElementUsingJavaScript(antacids);
	}
	public void clickonmedication() throws Exception {
		scrollDownUsingElement(medication);
		moveToElement(medication);
		clickElementUsingJavaScript(medication);
	}
	public void clickonlifestyle() throws Exception {
		scrollDownUsingElement(lifestyle);
		moveToElement(lifestyle);
		clickElementUsingJavaScript(lifestyle);
	}
	public void clickonmanageheartburn() throws Exception {
		scrollDownUsingElement(manage);
		moveToElement(manage);
		clickElementUsingJavaScript(manage);
	}
	public void clickonantacidhelp() throws Exception {
		scrollDownUsingElement(antacidhelp);
		moveToElement(antacidhelp);
		clickElementUsingJavaScript(antacidhelp);
	}
	public void clickonworse() throws Exception {
		scrollDownUsingElement(worse);
		moveToElement(worse);
		clickElementUsingJavaScript(worse);	
	}
	public void clickoncalciumcarbonate() throws Exception {
		scrollDownUsingElement(calcium);
		moveToElement(calcium);
		clickElementUsingJavaScript(calcium);
	}
	public void clickonshapewear() throws Exception {
		scrollDownUsingElement(shapewear);
		moveToElement(shapewear);
		clickElementUsingJavaScript(shapewear);
	}
	public void clickonAcidreflux() throws Exception {
		scrollDownUsingElement(reflux);
		moveToElement(reflux);
		clickElementUsingJavaScript(reflux);
	}
	public void clickonheartburnnight() throws Exception {
		scrollDownUsingElement(night);
		moveToElement(night);
		clickElementUsingJavaScript(night);
	}
	public void clickoncausesindigestion() throws Exception {
		scrollDownUsingElement(indigestion);
		moveToElement(indigestion);
		clickElementUsingJavaScript(indigestion);
	}
	public void clickonknowaboutacidreflux() throws Exception {
		scrollDownUsingElement(acidreflux);
		moveToElement(acidreflux);
		clickElementUsingJavaScript(acidreflux);
	}
	public void clickonspicyfood() throws Exception {
		scrollDownUsingElement(spicyfood);
		moveToElement(spicyfood);
		clickElementUsingJavaScript(spicyfood);
	}
	public void clickonjogging() throws Exception {
		scrollDownUsingElement(jogging);
		moveToElement(jogging);
		clickElementUsingJavaScript(jogging);
	}
	public void clickonachalasia() throws Exception {
		scrollDownUsingElement(achalasia);
		moveToElement(achalasia);
		clickElementUsingJavaScript(achalasia);
	}
	public void clickonbestbedspillows() throws Exception {
		scrollDownUsingElement(beds);
		moveToElement(beds);
		clickElementUsingJavaScript(beds);
	}
	public void clickonfoodreduceacid() throws Exception {
		scrollDownUsingElement(reduceacid);
		moveToElement(reduceacid);
		clickElementUsingJavaScript(reduceacid);
	}
	public void clickonspotsignacidrefluxchildren() throws Exception {
		scrollDownUsingElement(spotsign);
		moveToElement(spotsign);
		clickElementUsingJavaScript(spotsign);
	}
	
	public void clickondietreduce() throws Exception {
		scrollDownUsingElement(dietsreduce);
		moveToElement(dietsreduce);
		clickElementUsingJavaScript(dietsreduce);
	}
	public void clickoncauseacid() throws Exception {
		scrollDownUsingElement(causeacid);
		moveToElement(causeacid);
		clickElementUsingJavaScript(causeacid);
	}
	public void clickonbarfood() throws Exception {
		scrollDownUsingElement(barfood);
		moveToElement(barfood);
		clickElementUsingJavaScript(barfood);
	}
	public void clickonpostmeal() throws Exception {
		scrollDownUsingElement(postmeal);
		moveToElement(postmeal);
		clickElementUsingJavaScript(postmeal);
	}
	public void clickonwontcause() throws Exception {
		//scrollDownUsingElement(wontcause);
		//moveToElement(wontcause);
		clickElementUsingJavaScript(wontcause);
	}
	public void clickonconnectionweight() throws Exception {
		scrollDownUsingElement(connectionweight);
		moveToElement(connectionweight);
		clickElementUsingJavaScript(connectionweight);
	}
	public void clickonbinge() throws Exception {
		scrollDownUsingElement(binge);
		moveToElement(binge);
		clickElementUsingJavaScript(binge);
	}
	public void clickonvinegar() throws Exception {
		scrollDownUsingElement(vinegar);
		moveToElement(vinegar);
		clickElementUsingJavaScript(vinegar);
	}
	public void clickonsalad() throws Exception {
		scrollDownUsingElement(salad);
		//moveToElement(salad);
		clickElementUsingJavaScript(salad);
	}
	public void clickonbusinesslunch() throws Exception {
		scrollDownUsingElement(businesslunch);
		//moveToElement(businesslunch);
		clickElementUsingJavaScript(businesslunch);
	}
	public void clickonfirstdate() throws Exception {
		scrollDownUsingElement(firstdate);
		moveToElement(firstdate);
		clickElementUsingJavaScript(firstdate);
	}
	public void clickonoccasional() throws Exception {
		scrollDownUsingElement(occasional);
		moveToElement(occasional);
		clickElementUsingJavaScript(occasional);
	}
	public void clickonsymptonsfood() throws Exception {
		scrollDownUsingElement(symptonsfood);
		moveToElement(symptonsfood);
		clickElementUsingJavaScript(symptonsfood);
	}
	public void clickonhomeremedies() throws Exception {
		scrollDownUsingElement(homeremedies);
		moveToElement(homeremedies);
		clickElementUsingJavaScript(homeremedies);
	}
	public void clickonholidaykit() throws Exception {
		scrollDownUsingElement(holidaykit);
		moveToElement(holidaykit);
		clickElementUsingJavaScript(holidaykit);
	}
	public void clickonholidaymeal() throws Exception {
		scrollDownUsingElement(holidaymeals);
		moveToElement(holidaymeals);
		clickElementUsingJavaScript(holidaymeals);
	}
	public void clickonthoughtsparty() throws Exception {
		scrollDownUsingElement(thoughtsparties);
		moveToElement(thoughtsparties);
		clickElementUsingJavaScript(thoughtsparties);
	}
	public void clickonwaystoavoidheartburn() throws Exception {
		scrollDownUsingElement(waystoavoidheartburn);
		moveToElement(waystoavoidheartburn);
		clickElementUsingJavaScript(waystoavoidheartburn);
	}
	public void clickonnewyearparty() throws Exception {
		//scrollDownUsingElement(newyearparty);
		moveToElement(newyearparty);
		clickElementUsingJavaScript(newyearparty);
	}
	public void clickonfootballsunday() throws Exception {
		scrollDownUsingElement(footballsunday);
		moveToElement(footballsunday);
		clickElementUsingJavaScript(footballsunday);
	}
	public void clickonchoclatesavoid() throws Exception {
		scrollDownUsingElement(choclatesavoid);
		moveToElement(choclatesavoid);
		clickElementUsingJavaScript(choclatesavoid);
	}
	public void clickonhealthfoods() throws Exception {
		scrollDownUsingElement(healthfoods);
		moveToElement(healthfoods);
		clickElementUsingJavaScript(healthfoods);
	}
	public void clickonindigestionremedies() throws Exception {
		scrollDownUsingElement(indigestion_remedies);
		moveToElement(indigestion_remedies);
		clickElementUsingJavaScript(indigestion_remedies);
	}
	public void clickonimprovehealth() throws Exception {
		scrollDownUsingElement(improve_health);
		moveToElement(improve_health);
		clickElementUsingJavaScript(improve_health);
	}
	public void clickonnaturalremedies() throws Exception {
		scrollDownUsingElement(natural_remedies);
		moveToElement(natural_remedies);
		clickElementUsingJavaScript(natural_remedies);
	}
	public void clickonheartnurnexercise() throws Exception {
		scrollDownUsingElement(heartburb_exercise);
		moveToElement(heartburb_exercise);
		clickElementUsingJavaScript(heartburb_exercise);
	}
	public void clickongasburnrelief() throws Exception {
		scrollDownUsingElement(gas_relief);
		moveToElement(gas_relief);
		clickElementUsingJavaScript(gas_relief);
	}
	public void clickonproductright() throws Exception {
		scrollDownUsingElement(product_right);
		moveToElement(product_right);
		clickElementUsingJavaScript(product_right);
	}
	public void clickonseeproduct() throws Exception {
		scrollDownUsingElement(see_product);
		moveToElement(see_product);
		elementClick(see_product);
	}
}
