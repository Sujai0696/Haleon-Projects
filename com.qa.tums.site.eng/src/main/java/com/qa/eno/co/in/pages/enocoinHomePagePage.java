package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinHomePagePage extends BaseClass{
	
	public enocoinHomePagePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "(//ul[@class='carousel-slides']//child::li[@class='carousel-slide clearfix odd first is-active'])[1]")
		private static WebElement Banner1Active;
		
		@FindBy(xpath = "(//span[text()='FIND OUT HOW ENO WORKS'])[1]")
		private static WebElement howenoworks1;
		
		@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active']//a[text()='1']")
		private static WebElement seq1;
	
		@FindBy(xpath = "//li[@class='carousel-slide clearfix even is-active']")
		private static WebElement Banner2Active;
	
		@FindBy(xpath = "(//span[text()='FIND OUT HOW ENO WORKS'])[2]")
		private static WebElement howenoworks2;
	
		@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item is-active']//a[text()='2']")
		private static WebElement seq2;
	
		@FindBy(xpath = "//li[@class='carousel-slide clearfix odd last is-active']")
		private static WebElement Banner3Active;
	
		@FindBy(xpath = "//ul[@class='carousel-nav']//child::li[@class='carousel-nav-item']//a[text()='3']")
		private static WebElement seq3;
	
		@FindBy(xpath = "(//span[text()='FIND OUT HOW ENO WORKS'])[3]")
		private static WebElement howenoworks3;
	
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::li[@class='slide-1 lslide active']//h3")
		private static WebElement initialsymptomsAcidity;
	
		@FindBy(xpath = "(//ul[@class='lSPager lSpg']//li[@class='active']//a[text()='1'])[1]")
		private static WebElement Articleseq1;
	
		@FindBy(xpath = "(//div[@class='lSSlideWrapper usingCss']//child::h3[text()='Initial Symptoms Of Acidity'])[1]")
		private static WebElement Articletext1;
	
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//li[@class='slide-2 lslide']//h3")
		private static WebElement understandingAcidity;
	
		@FindBy(xpath = "//ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-2 lslide']//h3")
		private static WebElement understandingAciditytxt;
	
		@FindBy(xpath = "//ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-3 lslide']//a")
		private static WebElement HomeremediesAcidity;
		
		@FindBy(xpath = "(//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::h3[text()='Home remedies for acidity'])[1]")
		private static WebElement HomeremediesAciditytxt;
		
		@FindBy(xpath = "//ul[@class='lSPager lSpg']//child::li[@class='active']//a[text()='2']")
		private static WebElement Articleseq2;
		
		@FindBy(xpath = "//ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-4 lslide']//a")
		private static WebElement HeartburnduringPregancy;
		
		@FindBy(xpath = "//h3[text()='Heartburn during Pregnancy']")
		private static WebElement HeartburnduringPregancytxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[1]")
		private static WebElement next;
		
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::ul[@class='lSPager lSpg']//li[@class='active']//a")
		private static WebElement Articleseq3;
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//child::ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-5 lslide']//a")
		private static WebElement gasrelief;
		
		@FindBy(xpath = "//h3[text()='Gas Relief']")
		private static WebElement gasrelieftxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement next1;
		
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement next2;
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-6 lslide']//a")
		private static WebElement livingacidityfree;
		
		@FindBy(xpath = "//li[@class='slide-6 lslide']//h3[text()='Living Life Acidity Free']")
		private static WebElement livingacidityfreetxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement next3;
		
		@FindBy(xpath = "//ul[@class='lSPager lSpg']//li[@class='active']//a[text()='5']")
		private static WebElement Articleseq4;
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//child::ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-7 lslide']//a")
		private static WebElement acidityorIndigestion;
		
		@FindBy(xpath = "(//ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//child::h3[text()='Is It Acidity or Indigestion?'])[2]")
		private static WebElement acidityorIndigestiontxt;
		
		@FindBy(xpath = "//div[@class='box component section container-override featured-articles-box full-width--md even col-xs-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement next4;
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//child::ul[@class='featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-8 lslide']//a")
		private static WebElement StomachHeart;
		
		@FindBy(xpath = "(//h3[text()='Why Does Your Stomach Hurt?'])[2]")
		private static WebElement StomachHearttxt;
		
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-1 lslide active']//a")
		private static WebElement EnoRegular;
		
		@FindBy(xpath = "(//div[@class='box component section container-override product-spotlight product-spotlight-br-com odd col-xs-12 col-md-12']//child::h3[text()='ENO Regular'])[2]")
		private static WebElement EnoRegulartxt;
		
		@FindBy(xpath = "//li[@class='slide-2 lslide active']//a")
		private static WebElement EnoLemons;
		
		@FindBy(xpath = "//div[@class='box component section container-override product-spotlight product-spotlight-br-com odd col-xs-12 col-md-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement enonext1;
		
		@FindBy(xpath = "//div[@class='box component section container-override product-spotlight product-spotlight-br-com odd col-xs-12 col-md-12']//child::div[@class='lSAction']//a[@class='lSNext']")
		private static WebElement enonext2;
		
		@FindBy(xpath = "//li[@class='slide-3 lslide active']//a")
		private static WebElement enoOrange;
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//child::ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-4 lslide active']//a")
		private static WebElement enocola1;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement enonext3;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement enonext4;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style first odd last col-xs-12 reference-product-spotlight-carousel']//child::li[@class='slide-4 lslide active']//a")
		private static WebElement enocola;
		
		@FindBy(xpath = "(//div[@class='lSAction']//a[@class='lSNext'])[2]")
		private static WebElement enocolanext;
		
		//Sliderof Eno//
		
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//li[@class='slide-1 lslide active']//h3[text()='ENO Regular']")
		private static WebElement EnoRegular1;			
	
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoRegulartxt1;		
	
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement EnoLemonnext;	
	
		@FindBy(xpath = "//div[@class='lSSlideWrapper usingCss']//child::li[@class='slide-2 lslide active']//h3[text()='ENO Lemon']")
		private static WebElement EnoLemon;	
	
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoLemontxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement Enoorangenext;
	
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//li[@class='slide-3 lslide active']//a")
		private static WebElement EnoOrange;
	
		@FindBy(xpath = "//div[@class='image component section fixed-header-img--cut switchable-image fixed-header-img fixed-component']//child::h1[text()='ENO Fruit Salts']")
		private static WebElement EnoOrangetxt;
	
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement Enocolanext;
	
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-4 lslide active']//a")
		private static WebElement Enocola;
	
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement Enocolatxt;
	
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement EnoAjwainnext;
	
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-5 lslide active']//a")
		private static WebElement EnoAjwain;
	
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoAjwaintxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement EnoMausambinext;
		
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-6 lslide active']//a")
		private static WebElement EnoMausambi;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoMausambitxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement Enolemonbottlenext;
		
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-7 lslide active']//a")
		private static WebElement Enolemonbottle;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement Enolemonbottletxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement EnoRegularbottlenext;
		
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-8 lslide active']//a")
		private static WebElement EnoRegularbottle;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoRegularbottletxt;
		
		@FindBy(xpath = "(//div[@class='lSAction']//child::a[@class='lSNext'])[2]")
		private static WebElement EnoOrangebottlenext;
		
		@FindBy(xpath = "//ul[@class='product-spotlight-carousel featured-articles-carousel lightSlider lsGrab lSSlide']//child::li[@class='slide-9 lslide active']//a")
		private static WebElement EnoOrangebottle;
		
		@FindBy(xpath = "//h1[text()='ENO Fruit Salts']")
		private static WebElement EnoOrangebottletxt;
		
		
		
		
		
		
		
		
		
		
		
		//next slider//
		
		@FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']")
		 private static WebElement mouseHoverImg;
		
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='«']")
		 private static WebElement previousArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='»']")
		 private static WebElement nextArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix odd first is-active']")
		 private static WebElement peopleActive;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix even last is-active']")
		private static WebElement heartburnActive;
		
		
		
		
		//Methods//
		
		public void clickonHowEnoWorks1() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(seq1);
		//visibilityOf(Banner1Active);
		//boolean elementIsDisplayed=elementIsDisplayed(Banner1Active);
		//Assert.assertTrue(elementIsDisplayed);
		Thread.sleep(1000);
		clickElementUsingJavaScript(howenoworks1);
		pageLoad();
		}
		public void clickonHowEnoWorks2() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(seq2);
			visibilityOf(Banner2Active);
			boolean elementIsDisplayed=elementIsDisplayed(Banner2Active);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(howenoworks2);
			pageLoad();
			}
		public void clickonHowEnoWorks3() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(seq3);
			visibilityOf(Banner3Active);
			boolean elementIsDisplayed=elementIsDisplayed(Banner3Active);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(howenoworks3);
			pageLoad();
			}
		public void clickonInitialSymptomsAcidity() throws Exception {
			waitForPageLoadJava();
			visibilityOf(Articleseq1);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Articletext1));
			clickElementUsingJavaScript(initialsymptomsAcidity);
			pageLoad();
		}
		public void clickonUnderstandAcidity() throws Exception {
			waitForPageLoadJava();
			visibilityOf(Articleseq1);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(understandingAciditytxt));
			clickElementUsingJavaScript(understandingAcidity);
			pageLoad();
		}
		public void clickonHomeRemediesAcidity() throws Exception {
			waitForPageLoadJava();
			visibilityOf(Articleseq1);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HomeremediesAciditytxt));
			clickElementUsingJavaScript(HomeremediesAcidity);
			pageLoad();
		}
		public void clickonHeartburnPregancy() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(next);
			Thread.sleep(1000);
			visibilityOf(Articleseq2);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq2);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HeartburnduringPregancytxt));
			clickElementUsingJavaScript(HeartburnduringPregancy);
			pageLoad();
		}
		public void clickonGasRelief() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(next1);
			Thread.sleep(1000);
			visibilityOf(Articleseq3);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq3);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(gasrelieftxt));
			clickElementUsingJavaScript(gasrelief);
			pageLoad();
		}
		public void clickonLivingAcidityFree() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(next2);
			Thread.sleep(1000);
			visibilityOf(Articleseq3);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq3);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(livingacidityfreetxt));
			clickElementUsingJavaScript(livingacidityfree);
			pageLoad();
		}
		public void clickonAcidityorIndigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(next3);
			Thread.sleep(1000);
			visibilityOf(Articleseq3);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq3);
			Assert.assertTrue(elementIsDisplayed);
			Thread.sleep(1000);
			System.out.println(getElementText(acidityorIndigestiontxt));
			clickElementUsingJavaScript(acidityorIndigestion);
			pageLoad();
		}
		public void clickonStomachHeart() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(next4);
			Thread.sleep(1000);
			visibilityOf(Articleseq3);
			boolean elementIsDisplayed=elementIsDisplayed(Articleseq3);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(StomachHearttxt));
			clickElementUsingJavaScript(StomachHeart);
			pageLoad();
		}
		public void clickonEnoRegular() throws Exception {
			waitForPageLoadJava();
			visibilityOf(EnoRegular);
			
			System.out.println(getElementText(EnoRegulartxt));
			clickElementUsingJavaScript(EnoRegular);
			pageLoad();
		}
		public void clickonEnoLemon() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(enonext1);
			visibilityOf(EnoLemon);
			boolean elementIsDisplayed=elementIsDisplayed(EnoLemon);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(EnoLemon);
			pageLoad();
		}
		public void clickonEnoOrange() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(enonext3);
			visibilityOf(enoOrange);
			boolean elementIsDisplayed=elementIsDisplayed(enoOrange);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(enoOrange);
			pageLoad();
		}
		public void clickonEnoCola23() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(enocolanext);
			visibilityOf(enocola);
			boolean elementIsDisplayed=elementIsDisplayed(enocola);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(enocola);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Eno Sliders//
		
		public void clickonEnoRegular1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(EnoRegular1);
			clickElementUsingJavaScript(EnoRegular1);
			visibilityOf(EnoRegulartxt1);
			boolean elementIsDisplayed=elementIsDisplayed(EnoRegulartxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(EnoRegulartxt1));
			pageLoad();
			}
			
			
			public void clickonEnoLemon1() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				clickElementUsingJavaScript(EnoLemon);
				visibilityOf(EnoLemontxt);
				boolean elementIsDisplayed=elementIsDisplayed(EnoLemontxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(EnoLemontxt));
				pageLoad();
			}
			public void clickonEnoOrange1() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				clickElementUsingJavaScript(EnoOrange);

				pageLoad();
			}
			public void clickonEnoCola() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				clickElementUsingJavaScript(Enocola);
				visibilityOf(Enocolatxt);
				boolean elementIsDisplayed=elementIsDisplayed(Enocolatxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Enocolatxt));

				pageLoad();
			}
			public void clickonEnoAjawin() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoAjwainnext);
				clickElementUsingJavaScript(EnoAjwain);
				visibilityOf(EnoAjwaintxt);
				boolean elementIsDisplayed=elementIsDisplayed(EnoAjwaintxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(EnoAjwaintxt));

				pageLoad();
			}
			public void clickonEnoMausambi() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoAjwainnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoMausambinext);
				clickElementUsingJavaScript(EnoMausambi);
				visibilityOf(EnoMausambitxt);
				boolean elementIsDisplayed=elementIsDisplayed(EnoMausambitxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(EnoMausambitxt));

				pageLoad();
			}
			public void clickonEnoLemonBottle() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoAjwainnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoMausambinext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enolemonbottlenext);
				clickElementUsingJavaScript(Enolemonbottle);
				visibilityOf(Enolemonbottletxt);
				boolean elementIsDisplayed=elementIsDisplayed(Enolemonbottletxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Enolemonbottletxt));

				pageLoad();
			}
			public void clickonEnoRegularBottle() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoAjwainnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoMausambinext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enolemonbottlenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoRegularbottlenext);
				clickElementUsingJavaScript(EnoRegularbottle);
				visibilityOf(EnoRegularbottletxt);
				boolean elementIsDisplayed=elementIsDisplayed(EnoRegularbottletxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(EnoRegularbottletxt));

				pageLoad();
			}
			public void clickonEnoOrangeBottle() throws Exception {
				waitForPageLoadJava();
				//scrollDownUsingElement(EnoLemon);
				clickElementUsingJavaScript(EnoLemonnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enoorangenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enocolanext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoAjwainnext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoMausambinext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(Enolemonbottlenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoRegularbottlenext);
				Thread.sleep(1000);
				clickElementUsingJavaScript(EnoOrangebottlenext);
				clickElementUsingJavaScript(EnoOrangebottle);
				visibilityOf(EnoOrangebottletxt);
				boolean elementIsDisplayed=elementIsDisplayed(EnoOrangebottletxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(EnoOrangebottletxt));

				pageLoad();
			}
			//slidersection//
			
			public void clickonDidYouKnowSection()throws Exception {
				 waitForPageLoadJava();
				 scrollDownUsingElement(mouseHoverImg);
				 clickElementUsingJavaScript(previousArrow);
				 refreshWebPage();
				 scrollDownUsingElement(mouseHoverImg);
				 clickElementUsingJavaScript(previousArrow);
				 moveToElement(mouseHoverImg);
				 doubleClickElement(mouseHoverImg);
				 System.out.println("double clicked successfully on the previous carousel Image Element");
				 visibilityOf(heartburnActive);
				 Assert.assertTrue(elementIsDisplayed(heartburnActive));
				 clickElementUsingJavaScript(nextArrow);
				 moveToElement(mouseHoverImg);
				 doubleClickElement(mouseHoverImg);
				 visibilityOf(peopleActive);
				 Assert.assertTrue(elementIsDisplayed(peopleActive));
				 System.out.println("double clicked successfully on the next carousel Image Element");
			}
			
			
			
		
		
		
		
		
		
		
		
	
	
	

}
