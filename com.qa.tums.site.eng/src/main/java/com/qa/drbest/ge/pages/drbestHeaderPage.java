package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestHeaderPage extends BaseClass{

	public drbestHeaderPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//div[@class='image component section drbest-logo first odd col-xs-2']//child::img")
		private static WebElement drbestlogo;
	
		@FindBy(xpath = "//a[text()='Produkte ']")
		private static WebElement produkte;
	
		//vibration//
		
		@FindBy(xpath = "//a[text()='Vibration multi expert ']")
		private static WebElement vibrationmultiexpert;
	
		@FindBy(xpath = "//a[text()='Vibration Polimed ']")
		private static WebElement vibrationpolimed;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-2']//child::a[text()='Vibration Atemfrisch']")
		private static WebElement vibrationAtemfrisch;
	
	//Kinder//
		
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Erste Zähne']")
		private static WebElement ErsteZahne;
	
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Milchzahn']")
		private static WebElement Milchzahn;
	
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Paw Patrol']")
		private static WebElement pawpatrol;
	
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Juniorzahn']")
		private static WebElement juniorzahn;
	
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Cool Kids']")
		private static WebElement coolkids;
	
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Vibration Juniorzahn']")
		private static WebElement vibrationjuniorjahn;
	
		@FindBy(xpath = "//a[text()='Bambus Interdent Kids']")
		private static WebElement bambusInterdentkids;
		
		//expert//
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-2']//child::a[text()='GreenSensitive']")
		private static WebElement greensensitive;
		
		
		//special editions//
		
		@FindBy(xpath = "(//a[text()='Limited Edition 2022'])[1]")
		private static WebElement limitededitions;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-2']//a[@href='https://gsk-aktion.de/drbest-summer/?utm_medium=brand-website&utm_source=dr-best&utm_campaign=dr-best-summer-edition&utm_content=menu']")
		private static WebElement summereditions;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-2']//child::a[text()='Bienen Edition 2022']")
		private static WebElement bieneneditions;
		
		
		//nature//
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Bambus Interdent']")
		private static WebElement bambusinterdent;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Bambus Interdent KIDS']")
		private static WebElement bambusinterdentkids;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='GreenClean']")
		private static WebElement greenclean;
		
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Interdentalbürsten']")
		private static WebElement Interdentalbursten;
		
		//professtional//
		
		@FindBy(xpath = "//a[text()='Polimed']")
		private static WebElement polimed;
		
		@FindBy(xpath = "//a[text()='Polimed Kurzkopf']")
		private static WebElement polimedkurzkopf;
		
		@FindBy(xpath = "//div[@class='richText component section nav even col-xs-12']//child::a[text()='Atemfrisch']")
		private static WebElement atemfrisch;
		
		@FindBy(xpath = "//a[text()='Natürlich Weiß']")
		private static WebElement naturlich;
		
		//premium//
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='X-Zwischenzahn']")
		private static WebElement zwischenzahn;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Zwischenzahn']")
		private static WebElement zwischenzahn1;
		
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-2']//child::a[text()='Interdent Aktiv']")
		private static WebElement interdentaktiv;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-2']//child::a[text()='Hoch-Tief']")
		private static WebElement hochtief;
		
		@FindBy(xpath = "//a[text()='Schwingkopf']")
		private static WebElement schwingkopf;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-2']//child::a[text()='Original']")
		private static WebElement original;
		
		//beratung//
		
		@FindBy(xpath = "//a[text()='Beratung ']")
		private static WebElement beratung;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-4']//child::a[text()='Empfindliche Zähne']")
		private static WebElement empfindlichezahne;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-4']//child::a[text()='Ernährung und Zähne']")
		private static WebElement empfindlicheundzahne;
		
		@FindBy(xpath = "//a[text()='Kinderzahnentwicklung']")
		private static WebElement kinderzahentwicklung;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-4']//child::a[text()='Mundgeruch']")
		private static WebElement mundgeruch;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-4']//child::a[text()='Parodontitis']")
		private static WebElement parodontitis;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-4']//child::a[text()='Schutz vor Karies']")
		private static WebElement schutzvorkaries;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Weissere Zähne']")
		private static WebElement weisserezahne;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Zahnpflege bei festen Zahnspangen']")
		private static WebElement zahnpfegebei;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Zahnpflege bei Zahnersatz']")
		private static WebElement zahnpfegebeizahnersat;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Zahnpflege-Hilfsmittel']")
		private static WebElement hilfsmittel;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Zahnputztechnik Erwachsene']")
		private static WebElement zahnputztechnik;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-4']//child::a[text()='Zahnputztechnik Kinder']")
		private static WebElement ZahnputztechnikKinde;
		
		@FindBy(xpath = "//a[text()='Nachhaltigkeit ']")
		private static WebElement Nachhaltigkeit;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-4']//child::a[text()='Bambus']")
		private static WebElement bambus;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-4']//child::a[text()='Biokunststoff']")
		private static WebElement Biokunststoff;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-4']//child::a[text()='Umweltfreundliche Verpackung']")
		private static WebElement UmweltfreundlicheVerpackung;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-4']//child::a[text()='Klimaschutzprojekt']")
		private static WebElement Klimaschutzprojekt;
		
		@FindBy(xpath = "//a[text()='BEST Forschung ']")
		private static WebElement BESTForschung;
		
		@FindBy(xpath = "//input[@type='text']//parent::label")
		private static WebElement searchIcon;
		
		@FindBy(xpath = "(//button[@type='submit'])[1]")
		private static WebElement searchIconbutton;
		
		@FindBy(xpath = "//p[text()='IHRE SUCHERGEBNISSE']//parent::div")
		private static WebElement searchIcontxt;
		
		
		
		
		
		
		
		
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
			
		public void clickondrbestlogo() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(drbestlogo);
			pageLoad();
		}
		public void clickonvibrationmultiexpert() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(vibrationmultiexpert)) {
				clickElementUsingJavaScript(vibrationmultiexpert);
			} else {
				throw new Exception("Vibrationmultiexpert is not present on page");
			}
			pageLoad();
		}
		public void clickonvibrationpolimed() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(vibrationpolimed)) {
				clickElementUsingJavaScript(vibrationpolimed);
			} else {
				throw new Exception("vibrationpolimed is not present on page");
			}
			pageLoad();
		}
		public void clickonvibrationAtemfrisch() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(vibrationAtemfrisch)) {
				clickElementUsingJavaScript(vibrationAtemfrisch);
			} else {
				throw new Exception("vibrationAtemfrisch is not present on page");
			}
			pageLoad();
		}
		public void clickonErsteZahne() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(ErsteZahne)) {
				clickElementUsingJavaScript(ErsteZahne);
			} else {
				throw new Exception("ErsteZahne is not present on page");
			}
			pageLoad();
		}
		public void clickonMilchzahn() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(Milchzahn)) {
				clickElementUsingJavaScript(Milchzahn);
			} else {
				throw new Exception("Milchzahn is not present on page");
			}
			pageLoad();
		}
		public void clickonpawpatrol() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(pawpatrol)) {
				clickElementUsingJavaScript(pawpatrol);
			} else {
				throw new Exception("Pawpatrol is not present on page");
			}
			pageLoad();
		}
		public void clickonjuniorzahn() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(juniorzahn)) {
				clickElementUsingJavaScript(juniorzahn);
			} else {
				throw new Exception("juniorzahn is not present on page");
			}
			pageLoad();
		}
		public void clickoncoolkids() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(coolkids)) {
				clickElementUsingJavaScript(coolkids);
			} else {
				throw new Exception("coolkids is not present on page");
			}
			pageLoad();
		}
		public void clickonVibrationjuniorjahn() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(vibrationjuniorjahn)) {
				clickElementUsingJavaScript(vibrationjuniorjahn);
			} else {
				throw new Exception("vibrationjuniorjahn is not present on page");
			}
			pageLoad();
		}
		public void clickonBambusInterdentkids() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(bambusInterdentkids)) {
				clickElementUsingJavaScript(bambusInterdentkids);
			} else {
				throw new Exception("bambusInterdentkids is not present on page");
			}
			pageLoad();
		}
		public void clickongreensensitive() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(greensensitive)) {
				clickElementUsingJavaScript(greensensitive);
			} else {
				throw new Exception("greensensitive is not present on page");
			}
			pageLoad();
		}
		public void clickonlimitededitions() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(limitededitions)) {
				clickElementUsingJavaScript(limitededitions);
				
			} else {
				throw new Exception("LimitedEditons are not Present on page");
			}
			
		}
		public void clickonsummereditions() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(summereditions)) {
				clickElementUsingJavaScript(summereditions);
				
			} else {
				throw new Exception("Summereditions are not Present on page");
			}
			

		}
		public void clickonbieneeditions() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			if (isElementPresent(bieneneditions)) {
				clickElementUsingJavaScript(bieneneditions);
				
			} else {
				throw new Exception("bieneneditions are not Present on page");
			}
			

		}
		public void clickonbambusinterdent() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(bambusinterdent);
			pageLoad();
			

		}
		public void clickonbambusinterdentkids() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(bambusinterdentkids);
			pageLoad();
			

		}
		public void clickongreenclean() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(greenclean);
			pageLoad();
		}
		public void clickonInterdentalbursten() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(Interdentalbursten);
			pageLoad();
		}
		public void clickonpolimed() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(polimed);
			pageLoad();
		}
		public void clickonpolimedkurzkopf() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(polimedkurzkopf);
			pageLoad();
		}
		public void clickonatemfrisch() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(atemfrisch);
			pageLoad();
		}
		public void clickonaturich() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(naturlich);
			pageLoad();
		}
		public void clickonzwischenzahn() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(zwischenzahn);
			pageLoad();
		}
		public void clickonzwischenzahn1() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(zwischenzahn1);
			pageLoad();
		}
		public void clickoninterdentaktiv() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(interdentaktiv);
			pageLoad();
		}
		public void clickonhochtief() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(hochtief);
			pageLoad();
		}
		public void clickonschwingkopf() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(schwingkopf);
			pageLoad();
		}
		public void clickonOriginal() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(original);
			pageLoad();
		}
		public void clickonBeratung() throws Exception {
			waitForPageLoadJava();
			moveToElement(produkte);
			clickElementUsingJavaScript(beratung);
			pageLoad();
		}
		public void clickonempfindlichezahne() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(empfindlichezahne);
			pageLoad();
		}
		public void clickonErnährungundZähne() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(empfindlicheundzahne);
			pageLoad();
		}
		public void clickonkinderzahentwicklung() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(kinderzahentwicklung);
			pageLoad();
		}
		public void clickonMunderuch() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(mundgeruch);
			pageLoad();
		}
		public void clickonparodontitis() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(parodontitis);
			pageLoad();
		}
		public void clickonschutzvorkaries() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(schutzvorkaries);
			pageLoad();
		}
		public void clickonWeisserezahne() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(weisserezahne);
			pageLoad();
		}
		public void clickonZahnpfegebei() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(zahnpfegebei);
			pageLoad();
		}
		public void clickonZahnpfegebeizahnersatz() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(zahnpfegebeizahnersat);
			pageLoad();
		}
		public void clickonhilfsmittel() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(hilfsmittel);
			pageLoad();
		}
		public void clickonZahnputztechnik() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(zahnputztechnik);
			pageLoad();
		}
		public void clickonZahnputztechnikKinde() throws Exception {
			waitForPageLoadJava();
			moveToElement(beratung);
			clickElementUsingJavaScript(ZahnputztechnikKinde);
			pageLoad();
		}
		public void clickonNachhaltigkeit() throws Exception {
			waitForPageLoadJava();
		
			clickElementUsingJavaScript(Nachhaltigkeit);
			pageLoad();
		}
		public void clickonBambus() throws Exception {
			waitForPageLoadJava();
			moveToElement(Nachhaltigkeit);
			clickElementUsingJavaScript(bambus);
			pageLoad();
		}
		public void clickonBiokunststoff() throws Exception {
			waitForPageLoadJava();
			moveToElement(Nachhaltigkeit);
			clickElementUsingJavaScript(Biokunststoff);
			pageLoad();
		}
		public void clickonUmweltfreundlicheVerpackung() throws Exception {
			waitForPageLoadJava();
			moveToElement(Nachhaltigkeit);
			clickElementUsingJavaScript(UmweltfreundlicheVerpackung);
			pageLoad();
		}
		public void clickonKlimaschutzprojekt() throws Exception {
			waitForPageLoadJava();
			moveToElement(Nachhaltigkeit);
			clickElementUsingJavaScript(Klimaschutzprojekt);
			pageLoad();
		}
		public void clickonBESTForschung() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(BESTForschung);
			pageLoad();
		}
		
		public void clickonSearchIcon() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(searchIcon);
			searchIcon.sendKeys("zahnbuersten");
			clickElementUsingJavaScript(searchIconbutton);
			boolean elementIsDisplayed=elementIsDisplayed(searchIcontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(searchIcontxt));
		
			pageLoad();
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
