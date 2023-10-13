package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CentrumGnePage;
import com.qa.bens.checklist.page.FindingTextPage;
import com.qa.tums.eng.util.DataProviderCode;

public class FindingTextTest extends BaseClass{
	
	FindingTextPage ft;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ft = new FindingTextPage();
	}
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingTextInThePage(String path) throws Exception {
		  ft.verifyTextInPage(path);
		  
		  
		
	}
	
	

}
