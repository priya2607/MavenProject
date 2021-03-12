package com.Hackatone.TestClasses;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.Hackatone.Base.BaseUI;
import com.Hackatone.output.ShowOutputInConsole;
import com.Hackatone.output.ShowOutputInExcel;

public class GetHomeItems extends BaseUI 
{
	@Test
	public void getHomeListItems_one() throws InterruptedException		//test case to be passed
	{
	   	logger = report.createTest("Test 2 :: HomeListItems");			// Point to report using instances

		invokeBrowser();											// Invoke the browser
		openURL("websiteURL");											// open Websites
		//Thread.sleep(3000);
		List<String> listitem=mouseclickAndSelectElements("collection_menu_Xpath","item_Xpath");	// select menu list
		quitBrowser();
		
		ShowOutputInConsole soic = new ShowOutputInConsole();			
		soic.printMenuList(listitem);									// show output in console
		
		ShowOutputInExcel soie = new ShowOutputInExcel();
		soie.showMenuInExcel(listitem);									// show output in Excels
		
		quitBrowser();
	}
	
	@Test
	public void getHomeListItems_two() throws InterruptedException		//test case to be failed
	{
	   	logger = report.createTest("Test 3 :: HomeListItems");			// Point to report using instances

		invokeBrowser();											// Invoke the browser
		openURL("websiteURL");											// open Websites
		//Thread.sleep(3000);
		List<String> listitem=mouseclickAndSelectElements("collection_menu_xpath","item_xpath");	// select menu list, pass wrong xpath
		quitBrowser();
		
		ShowOutputInConsole soic = new ShowOutputInConsole();			
		soic.printMenuList(listitem);									// show output in console
		
		ShowOutputInExcel soie = new ShowOutputInExcel();
		soie.showMenuInExcel(listitem);									// show output in Excels
		
		quitBrowser();
	}
	@AfterTest
	public void endReport()
	{
		report.flush();													// flush the report
	}
}
