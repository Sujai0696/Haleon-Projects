package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestSitemapPage extends BaseClass{
	
	public drbestSitemapPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;			
	
		//Produkt//
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Original']")
		private static WebElement Original;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Hoch-Tief']")
		private static WebElement HochTief;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Schwingkopf']")
		private static WebElement Schwingkopf;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Interdent Aktiv']")
		private static WebElement InterdentAktiv;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Zwischenzahn']")
		private static WebElement Zwischenzahn;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='X-Zwischenzahn']")
		private static WebElement XZwischenzahn;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Atemfrisch']")
		private static WebElement Atemfrisch;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Natürlich Weiß']")
		private static WebElement NaturlichWei;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Polimed']")
		private static WebElement Polimed;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Polimed Kurzkopf']")
		private static WebElement PolimedKurpopf;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Vibration multi expert']")
		private static WebElement VibrationMultiExpert;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Vibration Polimed']")
		private static WebElement VibrationPolimed;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Vibration Atemfrisch']")
		private static WebElement VibrationAtemfrisch;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Vibration Juniorzahn']")
		private static WebElement Vibrationjuniorzahn;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Bambus Interdent']")
		private static WebElement BambusInterdent;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Bambus Interdent KIDS']")
		private static WebElement BambusInterdentKIDS;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='GreenClean']")
		private static WebElement GreenClean;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Interdentalbürsten']")
		private static WebElement Interdentalbursten;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='GreenSensitive']")
		private static WebElement GreenSensitive;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Erste Zähne']")
		private static WebElement ErsteZahne;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Milchzahn']")
		private static WebElement Milchzahn;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Juniorzahn']")
		private static WebElement Juniorzahn;
	
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Cool kids']")
		private static WebElement Coolkids;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-sm-4 col-lg-4']//child::a[text()='Paw Patrol']")
		private static WebElement pawpatrol;
		
		
		//Breatung//
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Wie oft Zahnbürste wechseln?']")
		private static WebElement Wieoft;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Zahnputztechnik Erwachsene']")
		private static WebElement zahnputztechnik;
		
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Zahnpflege-Hilfsmittel']")
		private static WebElement Hilfsmittel;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Mundgeruch']")
		private static WebElement Mundgeruch;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[@href='/zahnpflege/weissere-zaehne/']")
		private static WebElement WeissereZahne;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Ernährung und Zähne']")
		private static WebElement ErnahrungZahne;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Schutz vor Karies']")
		private static WebElement SchutzKaries;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[@href='/zahnpflege/parodontitis/']")
		private static WebElement Parodontis;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Empfindliche Zähne']")
		private static WebElement Empfindliche;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement ZahnputztechnikKinder;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Kinderzahnentwicklung']")
		private static WebElement Kinderzahnentwicklung;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Zahnpflege bei Zahnspangen']")
		private static WebElement Zahnspangen;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Pflege bei Zahnersatz']")
		private static WebElement Pflege;
		
		//Nachhaltigkeit//
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Bambus']")
		private static WebElement bambus;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Biokunststoff']")
		private static WebElement Biokunstoff;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Umweltfreundliche Verpackung']")
		private static WebElement Umweltfreundliche;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Klimaschutzprojekt']")
		private static WebElement Klimashutzprojekt;
		
		//Dr.Best Forschung//
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='1971 System-Zahnpflege']")
		private static WebElement SystemZahnflege;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='1988 Flexzone']")
		private static WebElement Flexzone;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='1993 Kugelgelenk']")
		private static WebElement Kugelgelenk;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2003 Zungenreininger']")
		private static WebElement Zungenreininger;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2006 Vibration']")
		private static WebElement Vibration;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2008 Seidenfein']")
		private static WebElement Seidenfein;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2013 Polimed']")
		private static WebElement Polimed1;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2020 Bamboo Interdent']")
		private static WebElement BambooInterdent;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2021 Verpackung']")
		private static WebElement Verpackung;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-lg-4']//child::a[text()='2021 GreenClean']")
		private static WebElement greenClean1;
		
		//Nutzungs- und Datenschutzrichtlinien//
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-lg-4']//child::a[text()='Sitemap']")
		private static WebElement Sitemap;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-lg-4']//child::a[text()='Impressum']")
		private static WebElement Impressum;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-lg-4']//child::a[text()='Nutzungsbedingungen']")
		private static WebElement Nutzungsbeding;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-lg-4']//child::a[text()='Datenschutzrichtlinie']")
		private static WebElement Datenschutzichtline;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 odd col-xs-12 col-md-4 col-lg-4']//child::a[text()='Cookies']")
		private static WebElement cookies;
		
		@FindBy(xpath = "//div[@class='richText component section bullet-style element-margin-90 even col-xs-12 col-md-4 col-md-push-1 col-lg-4']//child::a[text()='Kontakt']")
		private static WebElement Kontakt;
		
		
		
		
		
		
		
		
		
		
		
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
				public void ClickonOriginal() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Original);
					visibilityOf(Original);
					clickElementUsingJavaScript(Original);
					pageLoad();
				}
				public void ClickonHochTief() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(HochTief);
					visibilityOf(HochTief);
					clickElementUsingJavaScript(HochTief);
					pageLoad();
				}
				public void ClickonSchwingkopf() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Schwingkopf);
					visibilityOf(Schwingkopf);
					clickElementUsingJavaScript(Schwingkopf);
					pageLoad();
				}
				public void ClickonInterdentAktiv() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(InterdentAktiv);
					visibilityOf(InterdentAktiv);
					clickElementUsingJavaScript(InterdentAktiv);
					pageLoad();
				}
				public void ClickonZwishzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Zwischenzahn);
					visibilityOf(Zwischenzahn);
					clickElementUsingJavaScript(Zwischenzahn);
					pageLoad();
				}
				public void ClickonXZwishzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(XZwischenzahn);
					visibilityOf(XZwischenzahn);
					clickElementUsingJavaScript(XZwischenzahn);
					pageLoad();
				}
				public void ClickonNaturlichWei() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(NaturlichWei);
					visibilityOf(NaturlichWei);
					clickElementUsingJavaScript(NaturlichWei);
					pageLoad();
				}
				public void ClickonPolimedKurzkopf() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PolimedKurpopf);
					visibilityOf(PolimedKurpopf);
					clickElementUsingJavaScript(PolimedKurpopf);
					pageLoad();
				}
				public void ClickonPolimed() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Polimed);
					visibilityOf(Polimed);
					clickElementUsingJavaScript(Polimed);
					pageLoad();
				}
				public void ClickonVibrationMultiExpert() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationMultiExpert);
					visibilityOf(VibrationMultiExpert);
					clickElementUsingJavaScript(VibrationMultiExpert);
					pageLoad();
				}
				public void ClickonVibrationPolimed() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationPolimed);
					visibilityOf(VibrationPolimed);
					clickElementUsingJavaScript(VibrationPolimed);
					pageLoad();
				}
				public void ClickonVibrationAtemfrisch() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(VibrationAtemfrisch);
					visibilityOf(VibrationAtemfrisch);
					clickElementUsingJavaScript(VibrationAtemfrisch);
					pageLoad();
				}
				public void ClickonVibrationJuniorzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Vibrationjuniorzahn);
					visibilityOf(Vibrationjuniorzahn);
					clickElementUsingJavaScript(Vibrationjuniorzahn);
					pageLoad();
				}
				public void ClickonBambusInterdent() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(BambusInterdent);
					visibilityOf(BambusInterdent);
					clickElementUsingJavaScript(BambusInterdent);
					pageLoad();
				}
				public void ClickonBambusInterdentKIDS() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(BambusInterdentKIDS);
					visibilityOf(BambusInterdentKIDS);
					clickElementUsingJavaScript(BambusInterdentKIDS);
					pageLoad();
				}
				public void ClickonGreenClean() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(GreenClean);
					visibilityOf(GreenClean);
					clickElementUsingJavaScript(GreenClean);
					pageLoad();
				}
				public void ClickonInterdentalbursten() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Interdentalbursten);
					visibilityOf(Interdentalbursten);
					clickElementUsingJavaScript(Interdentalbursten);
					pageLoad();
				}
				public void ClickonGreenSensitive() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(GreenSensitive);
					visibilityOf(GreenSensitive);
					clickElementUsingJavaScript(GreenSensitive);
					pageLoad();
				}
				public void ClickonErsteZahne() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(ErsteZahne);
					visibilityOf(ErsteZahne);
					clickElementUsingJavaScript(ErsteZahne);
					pageLoad();
				}
				public void ClickonMilchzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Milchzahn);
					visibilityOf(Milchzahn);
					clickElementUsingJavaScript(Milchzahn);
					pageLoad();
				}
				public void ClickonJuniorZahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Juniorzahn);
					visibilityOf(Juniorzahn);
					clickElementUsingJavaScript(Juniorzahn);
					pageLoad();
				}
				public void ClickonCoolkids() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Coolkids);
					visibilityOf(Coolkids);
					clickElementUsingJavaScript(Coolkids);
					pageLoad();
				}
				public void ClickonPawpatrol() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(pawpatrol);
					visibilityOf(pawpatrol);
					clickElementUsingJavaScript(pawpatrol);
					pageLoad();
				}
				public void ClickonWieoft() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wieoft);
					visibilityOf(Wieoft);
					clickElementUsingJavaScript(Wieoft);
					pageLoad();
				}
				public void ClickonZahnputztechnik() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(zahnputztechnik);
					visibilityOf(zahnputztechnik);
					clickElementUsingJavaScript(zahnputztechnik);
					pageLoad();
				}
				public void ClickonHilfsmittel() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Hilfsmittel);
					visibilityOf(Hilfsmittel);
					clickElementUsingJavaScript(Hilfsmittel);
					pageLoad();
				}
				public void ClickonMundgeruch() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Mundgeruch);
					visibilityOf(Mundgeruch);
					clickElementUsingJavaScript(Mundgeruch);
					pageLoad();
				}
				public void ClickonWeisserenezahne() throws Exception {
					waitForPageLoadJava();
					//scrollDownUsingElement(WeissereZahne);
					//visibilityOf(WeissereZahne);
					clickElementUsingJavaScript(WeissereZahne);
					pageLoad();
				}
				public void ClickonErnahrungZahne() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(ErnahrungZahne);
					visibilityOf(ErnahrungZahne);
					clickElementUsingJavaScript(ErnahrungZahne);
					pageLoad();
				}
				public void ClickonSchutzKaries() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(SchutzKaries);
					visibilityOf(SchutzKaries);
					clickElementUsingJavaScript(SchutzKaries);
					pageLoad();
				}
				public void ClickonParodontitis() throws Exception {
					waitForPageLoadJava();
					//scrollDownUsingElement(Parodontis);
					//visibilityOf(Parodontis);
					clickElementUsingJavaScript(Parodontis);
					pageLoad();
				}
				public void ClickonEmpfindliche() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Empfindliche);
					visibilityOf(Empfindliche);
					clickElementUsingJavaScript(Empfindliche);
					pageLoad();
				}
				public void ClickonZahnputztechnikKinder() throws Exception {
					waitForPageLoadJava();
					//scrollDownUsingElement(ZahnputztechnikKinder);
					//visibilityOf(ZahnputztechnikKinder);
					clickElementUsingJavaScript(ZahnputztechnikKinder);
					pageLoad();
				}
				public void ClickonKinderzahnentwicklung() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Kinderzahnentwicklung);
					visibilityOf(Kinderzahnentwicklung);
					clickElementUsingJavaScript(Kinderzahnentwicklung);
					pageLoad();
				}
				public void ClickonZahnspangen() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Zahnspangen);
					visibilityOf(Zahnspangen);
					clickElementUsingJavaScript(Zahnspangen);
					pageLoad();
				}
				public void ClickonPflege() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Pflege);
					visibilityOf(Pflege);
					clickElementUsingJavaScript(Pflege);
					pageLoad();
				}
				public void ClickonBambus() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(bambus);
					visibilityOf(bambus);
					clickElementUsingJavaScript(bambus);
					pageLoad();
				}
				public void ClickonBiokunstuff() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Biokunstoff);
					visibilityOf(Biokunstoff);
					clickElementUsingJavaScript(Biokunstoff);
					pageLoad();
				}
				public void ClickonUmweltfreundliche() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Umweltfreundliche);
					visibilityOf(Umweltfreundliche);
					clickElementUsingJavaScript(Umweltfreundliche);
					pageLoad();
				}
				public void ClickonKlimashutzprojekt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Klimashutzprojekt);
					visibilityOf(Klimashutzprojekt);
					clickElementUsingJavaScript(Klimashutzprojekt);
					pageLoad();
				}
				public void ClickonSystemZahnpflege() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(SystemZahnflege);
					visibilityOf(SystemZahnflege);
					clickElementUsingJavaScript(SystemZahnflege);
					pageLoad();
				}
				public void ClickonFlexzone() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Flexzone);
					visibilityOf(Flexzone);
					clickElementUsingJavaScript(Flexzone);
					pageLoad();
				}
				public void ClickonKugelgelenk() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Kugelgelenk);
					visibilityOf(Kugelgelenk);
					clickElementUsingJavaScript(Kugelgelenk);
					pageLoad();
				}
				public void ClickonZungenreininger() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Zungenreininger);
					visibilityOf(Zungenreininger);
					clickElementUsingJavaScript(Zungenreininger);
					pageLoad();
				}
				public void ClickonVibration() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Vibration);
					visibilityOf(Vibration);
					clickElementUsingJavaScript(Vibration);
					pageLoad();
				}
				public void ClickonSeidenfein() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Seidenfein);
					visibilityOf(Seidenfein);
					clickElementUsingJavaScript(Seidenfein);
					pageLoad();
				}
				public void ClickonPolimed1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Polimed1);
					visibilityOf(Polimed1);
					clickElementUsingJavaScript(Polimed1);
					pageLoad();
				}
				public void ClickonBambooInterdent() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(BambooInterdent);
					visibilityOf(BambooInterdent);
					clickElementUsingJavaScript(BambooInterdent);
					pageLoad();
				}
				public void ClickonVerpackung() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Verpackung);
					visibilityOf(Verpackung);
					clickElementUsingJavaScript(Verpackung);
					pageLoad();
				}
				public void ClickonGreenClean1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(greenClean1);
					visibilityOf(greenClean1);
					clickElementUsingJavaScript(greenClean1);
					pageLoad();
				}
				public void ClickonSitemap() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Sitemap);
					visibilityOf(Sitemap);
					clickElementUsingJavaScript(Sitemap);
					pageLoad();
				}
				public void ClickonImpressum() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Impressum);
					visibilityOf(Impressum);
					clickElementUsingJavaScript(Impressum);
					pageLoad();
				}
				public void ClickonNutzungsbeding() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Nutzungsbeding);
					visibilityOf(Nutzungsbeding);
					clickElementUsingJavaScript(Nutzungsbeding);
					pageLoad();
				}
				public void ClickonDatenschutzrichtlinie() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Datenschutzichtline);
					visibilityOf(Datenschutzichtline);
					clickElementUsingJavaScript(Datenschutzichtline);
					pageLoad();
				}
				public void ClickonCookies() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(cookies);
					visibilityOf(cookies);
					clickElementUsingJavaScript(cookies);
					pageLoad();
				}
				public void ClickonKontakt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Kontakt);
					visibilityOf(Kontakt);
					clickElementUsingJavaScript(Kontakt);
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
