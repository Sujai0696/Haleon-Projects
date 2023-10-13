package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BeTotalTextPage;
import com.qa.tums.eng.util.DataProviderCode;

public class BeTotalTextTest extends BaseClass{
	
	BeTotalTextPage tt;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		tt = new BeTotalTextPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyBeTotal(String path) throws Exception {
		tt.getBeTotal(path);
	}
	
	

}
