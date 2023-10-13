package com.qa.bens.checklist.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListBrTagPage;
import com.qa.bens.checklist.page.ChecklistGTMPage;
import com.qa.tums.eng.util.DataProviderCode;



public class checklistGTMTest extends BaseClass {
	
	ChecklistGTMPage gtm;
	

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		gtm = new ChecklistGTMPage();
	}
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingGtm(String path) throws Exception {
		gtm.findingGTMInPage(path);
		System.out.println("---->**********************************************<----");
	}
	
}
