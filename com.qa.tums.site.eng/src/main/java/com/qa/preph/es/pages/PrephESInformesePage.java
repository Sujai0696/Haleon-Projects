package com.qa.preph.es.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrephESInformesePage extends BaseClass{
	
	public PrephESInformesePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Aceptar cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a[@href='/es/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Informese mas']//self::a[@href='/es/informese/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='cambios en el estilo de vida']//self::a[@href='/es/viva-mejor/']")
	private static WebElement hyperLinkCambiosEnElEstilo;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='¿Que son las hemorroides?']//self::a[@href='/es/informese/que-son-las-hemorroides/']")
	private static WebElement articulosOne;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='¿Quien contrae hemorroides?']//self::a[@href='/es/informese/quien-contrae-hemorroides/']")
	private static WebElement articulosTwo;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='Sintomas']//self::a[@href='/es/informese/sintomas/']")
	private static WebElement articulosThree;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='Exacerbaciones de las hemorroides']//self::a[@href='/es/informese/exacerbaciones/']")
	private static WebElement articulosFour;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='Causas']//self::a[@href='/es/informese/las-causas-de-las-hemorrides/']")
	private static WebElement articulosFive;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='Tratamientos medicos']//self::a[@href='/es/informese/tratamientos-medicos/']")
	private static WebElement articulosSix;
	
	@FindBy(xpath = "//h2[text()='ARTÍCULOS']//following::a[text()='Guía de conversación sobre las hemorroides']//self::a[@href='/es/informese/guia-de-conversacion-sobre-las-hemorroides/']")
	private static WebElement articulosSeven;
	
	
	

}
