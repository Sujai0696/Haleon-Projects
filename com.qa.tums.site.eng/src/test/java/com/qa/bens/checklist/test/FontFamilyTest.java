package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.FontFamilyPage;
import com.qa.tums.eng.util.DataProviderCode;
public class FontFamilyTest extends BaseClass{
	
	FontFamilyPage ff;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ff = new FontFamilyPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test
	private void verifyFontFamily() throws Exception {
		ff.launchUrl("https://www.biotene.com/contact-us/");
//		ff.clickCookieBtn();
		ff.getAndVerifyFontFamily();
	}

}
