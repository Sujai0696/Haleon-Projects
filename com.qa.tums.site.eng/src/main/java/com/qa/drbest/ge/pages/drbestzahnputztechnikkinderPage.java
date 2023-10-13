package com.qa.drbest.ge.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestzahnputztechnikkinderPage extends BaseClass{
	
	public drbestzahnputztechnikkinderPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;	
	
		@FindBy(xpath = "//a[text()='Entwicklungsstufe des Kindes']")
		private static WebElement Kindes;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//img")
		private static WebElement ErsteZahne;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//child::a[text()='Mehr erfahren']")
		private static WebElement ErsteZahneProduct;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement ErsteZahneBuyNow;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//img")
		private static WebElement Milchzahn;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement MilchzahnProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MilchzahnBuyNow;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/kinderzahnentwicklung/']")
		private static WebElement Article1;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/kinderzahnentwicklung/']")
		private static WebElement Link1;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnpflege-bei-festen-zahnspangen/']")
		private static WebElement Article2;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnpflege-bei-festen-zahnspangen/']")
		private static WebElement Link2;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Article3;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Link3;
		
		
		

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
					public void clickonKindes() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Kindes);
						pageLoad();
					}
					public void clickonErsteZahne() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(ErsteZahne);
						pageLoad();
					}
					public void clickonErsteZahneProduct() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(ErsteZahneProduct);
						pageLoad();
					}
					public void clickonErsteZahneBuYNow() throws Exception {
						waitForPageLoadJava();
						moveToElement(ErsteZahneBuyNow);
						if (isElementPresent(ErsteZahneBuyNow)) {
							actionClick(ErsteZahneBuyNow);
							
						} else {
							throw new Exception("ErsteZahneBuyNow is not present on Page");
						}
						pageLoad();
					}
					public void clickonBuYNow() throws Exception {
						waitForPageLoadJava();
						WebElement ele=driver.findElement(By.xpath("//div[@class='snippetReference component section learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_erste_zahne']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']"));
						Actions act=new Actions(driver);
						act.moveToElement(ele).build().perform();
						
						List <WebElement>links=driver.findElements(By.xpath("//button[@class='buynow__button has-icon']//a"));
						int total_counts=links.size();
						for(int i=0;i<total_counts;i++) {
							WebElement element=links.get(i);
							String text=element.getAttribute("title");
							System.out.println("Links name is:" + text);
						}
					}
					public void clickonMilchzahn() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Milchzahn);
						pageLoad();
					}
					public void clickonMilchzahnProduct() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(MilchzahnProduct);
						pageLoad();
					}	
					public void clickonMilchzahnBuYNow() throws Exception {
						waitForPageLoadJava();
						moveToElement(MilchzahnBuyNow);
						scrollDownUsingElement(MilchzahnBuyNow);
						if (isElementPresent(MilchzahnBuyNow)) {
							actionClick(MilchzahnBuyNow);
							List <WebElement>links=driver.findElements(By.xpath("//section[@class='buynow__dropdown']//a"));
							int total_counts=links.size();
							for(int i=0;i<total_counts;i++) {
								WebElement element=links.get(i);
								String text=element.getAttribute("title");
								System.out.println("Links name is:" + text);
							}
							
						} else {
							throw new Exception("MilchzahnBuyNow is not present on Page");
						}
						pageLoad();
					}
					public void clickonArticle1() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Article1);
						pageLoad();
					}	
					public void clickonLink1() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Link1);
						pageLoad();
					}	
					public void clickonArticle2() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Article2);
						pageLoad();
					}	
					public void clickonLink2() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Link2);
						pageLoad();
					}	
					public void clickonArticle3() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Article3);
						pageLoad();
					}	
					public void clickonlink3() throws Exception {
						waitForPageLoadJava();
						clickElementUsingJavaScript(Link3);
						pageLoad();
					}	
					
					
					
					
					
					
					
					
					
					
					

}
