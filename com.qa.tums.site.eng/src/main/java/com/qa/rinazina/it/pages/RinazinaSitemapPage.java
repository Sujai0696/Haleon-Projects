package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaSitemapPage extends BaseClass {
	
	public RinazinaSitemapPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]//ancestor::a[text()='Home']")
		private static WebElement HomeBreadcrumbs;
	
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]//child::a[text()='Mappa del sito']")
		private static WebElement SitemapBreadcrumbs;	
		
		@FindBy(xpath = "//a[text()='Prodotti']")
		private static WebElement prodotti;
	
		@FindBy(xpath = "//a[text()='Medicinali']")
		private static WebElement Medicinali;
	
		@FindBy(xpath = "//a[text()='Rinazina Spray Nasale']")
		private static WebElement RinazinasprayNasale;
	
		@FindBy(xpath = "//a[text()='Rinazina Gocce Nasali']")
		private static WebElement RinazinaGocceNasali;
	
		@FindBy(xpath = "//a[text()='Rinazina Doppia Azione Spray Nasale']//self::a[@title=\"Rinazina Doppia Azione Spray Nasale\"]")
		private static WebElement DoppiaAzionesprayNasale;
	
		@FindBy(xpath = "//a[text()='Rinazina Antiallergica Spray Nasale']")
		private static WebElement AntiallergicaSprayNasale;
	
		@FindBy(xpath = "//a[text()='Senza Medicinali']")
		private static WebElement senzaMedicinali;
	
		@FindBy(xpath = "//a[text()='Rinazina Aquamarina Spray Nasale Ipertonico']")
		private static WebElement RinazinaAquamarina;
	
		@FindBy(xpath = "(//a[@href=\"/prodotti/senza-medicinali/rinazina-aquamarina-spray-nasale-isotonico/\"])[2]")
		private static WebElement RinazinaAquamarinaIstonico;
		
		//Condizoni//
		
		@FindBy(xpath = "//a[text()='Condizioni']")
		private static WebElement Condizioni;
		
		@FindBy(xpath = "//a[text()='Raffreddore']")
		private static WebElement Raffreddore;
		
		@FindBy(xpath = "//a[text()='Sinusite sintomi']")
		private static WebElement Sinusitesintomi;
		
		@FindBy(xpath = "//a[text()='Rinite allergica']")
		private static WebElement Rinteallergica;
		
		@FindBy(xpath = "//a[text()='Russamento notturno']")
		private static WebElement Russamentonotturno;
		
		//Consigilli//
		
		@FindBy(xpath = "//a[@title=\"Consigli sulla salute nasale\"]//self::a[text()='Consigli sulla salute nasale']")
		private static WebElement consiglisulla;
		
		@FindBy(xpath = "(//a[@href=\"/consigli-sulla-salute-nasale/guida-come-liberare-il-naso-chiuso/\"])[3]")
		private static WebElement comeliberareli;
		
		@FindBy(xpath = "//a[text()='Gocce nasali per dare sollievo alla congestione nasale.']")
		private static WebElement goccenasalipersollievo;
		
		@FindBy(xpath = "//a[text()='Puoi detergere il naso e ripristinare la sua funzione di filtro grazie a un lavaggio con soluzione salina.']")
		private static WebElement puoidetergereilnaso;
		
		@FindBy(xpath = "//a[text()='Lavaggi nasali: a cosa servono e come farli.']")
		private static WebElement lavagginasali;
		
		@FindBy(xpath = "(//a[@href=\"/consigli-sulla-salute-nasale/alimenti-che-possono-influire-sulle-allergie/\"])[3]")
		private static WebElement qualelacorrelazione;
		
		@FindBy(xpath = "//a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente?']")
		private static WebElement Nasosemprechiuso;
		
		@FindBy(xpath = "(//a[@href=\"/consigli-sulla-salute-nasale/gli-aspetti-scientifici-alla-base-del-raffreddore/\"])[3]")
		private static WebElement coseilraffreddore;
		
		@FindBy(xpath = "//a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili.']")
		private static WebElement Riniteallergicacose;
		
		@FindBy(xpath = "(//a[@href=\"/consigli-sulla-salute-nasale/che-cose-la-sinusite/\"])[3]")
		private static WebElement coselasinusite;
		
		@FindBy(xpath = "//a[text()='Polline, Allergia e Rinite: quali sono le correlazioni?']")
		private static WebElement pollineallergicarinite;
		
		@FindBy(xpath = "//a[text()='Come si respira: cos’è e come avviene la respirazione?']")
		private static WebElement comesirespira;
	
		@FindBy(xpath = "(//a[@href=\"/contatti/\"]//self::a[text()='Contatti'])[1]")
		private static WebElement contatti;
		
		
		
		
		
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
					
				public void clickonHomeBreadcrumbs() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(HomeBreadcrumbs);
				}
				public void clickonSitemapBreadcrumbs() throws Exception {
					waitForPageLoadJava();
					visibilityOf(SitemapBreadcrumbs);
					if (isElementPresent(SitemapBreadcrumbs)) {
					Assert.assertTrue(elementIsDisplayed(SitemapBreadcrumbs));	
					} else {
						throw new Exception("Element SitemapBreadcrumbs is not presented on page");
					}
					
				}
				public void clickonProdotti() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(prodotti);
					clickElementUsingJavaScript(prodotti);
					pageLoad();
				}
				
				
				public void clickonMedicinali() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Medicinali);
					clickElementUsingJavaScript(Medicinali);
					pageLoad();
					
					
				}
				public void clickonRinazinasprayNasale() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(RinazinasprayNasale);
					clickElementUsingJavaScript(RinazinasprayNasale);
					pageLoad();
					}
					
				
				public void clickonRinazinaGocciNasali() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(RinazinaGocceNasali);
					clickElementUsingJavaScript(RinazinaGocceNasali);
					pageLoad();
					
				}
				public void clickonDoppiaAzionesprayNasale() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(DoppiaAzionesprayNasale);
					clickElementUsingJavaScript(DoppiaAzionesprayNasale);
					pageLoad();
					
				}
				public void clickonAntiallergicaSprayNasale() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(AntiallergicaSprayNasale);
					clickElementUsingJavaScript(AntiallergicaSprayNasale);
					pageLoad();
					
				}
				public void clickonSenzaMedicinali() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(senzaMedicinali);
					clickElementUsingJavaScript(senzaMedicinali);
					pageLoad();
				}
				public void clickonRinazinaAquamarine() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(RinazinaAquamarina);
					clickElementUsingJavaScript(RinazinaAquamarina);
					pageLoad();
				}
				public void clickonRinazinaAquamarineIstonico() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(RinazinaAquamarinaIstonico);
					clickElementUsingJavaScript(RinazinaAquamarinaIstonico);
					pageLoad();
				}
				public void clickonCondizioni() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Condizioni);
					clickElementUsingJavaScript(Condizioni);
					pageLoad();
					
				}
				public void clickonRaffreddore() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Raffreddore);
					clickElementUsingJavaScript(Raffreddore);
					pageLoad();
					
				}
				public void clickonSinusitesintomi() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Sinusitesintomi);
					clickElementUsingJavaScript(Sinusitesintomi);
					pageLoad();
				}
				public void clickonRiniteallergica() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Rinteallergica);
					clickElementUsingJavaScript(Rinteallergica);
					pageLoad();
					
				}
				public void clickonRussamentoNotturno() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Russamentonotturno);
					clickElementUsingJavaScript(AntiallergicaSprayNasale);
					pageLoad();
					
				}
				public void clickonConsigilisula() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(consiglisulla);
					clickElementUsingJavaScript(consiglisulla);
					pageLoad();
					
				}
				public void clickonComeliberareil() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(comeliberareli);
					clickElementUsingJavaScript(comeliberareli);
					pageLoad();
					
				}
				public void clickonGoccenasaliperdaresolllievo() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(goccenasalipersollievo);
					clickElementUsingJavaScript(goccenasalipersollievo);
					pageLoad();
					
				}
				public void clickonPuoidetergereilnaso() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(puoidetergereilnaso);
					clickElementUsingJavaScript(puoidetergereilnaso);
					pageLoad();
					
				}
				public void clickonLavagginasali() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(lavagginasali);
					clickElementUsingJavaScript(lavagginasali);
					pageLoad();
					
				}
				public void clickonqualelacorrelazione() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(qualelacorrelazione);
					clickElementUsingJavaScript(qualelacorrelazione);
					pageLoad();
					
				}
				public void clickonNasosemprechiuso() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Nasosemprechiuso);
					clickElementUsingJavaScript(Nasosemprechiuso);
					pageLoad();
					
				}
				public void clickonCoseilraffreddore() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(coseilraffreddore);
					clickElementUsingJavaScript(coseilraffreddore);
					pageLoad();
				}
				
				public void clickonRiniteallergicacose() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Riniteallergicacose);
					clickElementUsingJavaScript(Riniteallergicacose);
					pageLoad();
					
				}
				public void clickonCoselaSinusite() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(coselasinusite);
					clickElementUsingJavaScript(coselasinusite);
					pageLoad();
					
					
				}
				public void clickonPollineAllergicaRinite() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(pollineallergicarinite);
					clickElementUsingJavaScript(pollineallergicarinite);
					pageLoad();
					
				}
				public void clickonComesirespira() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(comesirespira);
					clickElementUsingJavaScript(comesirespira);
					pageLoad();
					
				}
				public void clickonContatti() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(contatti);
					clickElementUsingJavaScript(contatti);
					pageLoad();
					
				}
				
				
				
				
				
				
				

}
