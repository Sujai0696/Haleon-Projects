package com.qa.bens.checklist.test;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CentrumGnePage;
import com.qa.tums.eng.util.DataProviderCode;

public class CentrumGneTest extends BaseClass{
	
	CentrumGnePage cgp;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		cgp = new CentrumGnePage();
	}
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingLearnArticles(String path) throws Exception {
		  cgp.getTextForLearnArticles(path);
		  
		  
		
	}

}
