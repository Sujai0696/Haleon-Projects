package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CompresseTextPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CompresseTextTest extends BaseClass{
	
	CompresseTextPage ct;
	
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ct = new CompresseTextPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyCompresse(String path) throws Exception {
		ct.getCompresse(path);
	}

}
