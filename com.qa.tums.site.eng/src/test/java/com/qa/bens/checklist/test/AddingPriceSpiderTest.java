package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.AddingPriceSpiderPage;
import com.qa.tums.eng.util.DataProviderCode;

public class AddingPriceSpiderTest extends BaseClass{
	
	AddingPriceSpiderPage ps;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ps = new AddingPriceSpiderPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyPriceSpider(String path) throws Exception {
		ps.addPriceSpider(path);
	}

}
