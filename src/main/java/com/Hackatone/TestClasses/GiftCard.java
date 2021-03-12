package com.Hackatone.TestClasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Hackatone.Base.*;

public class GiftCard extends BaseUI
{
	public static int count = 4;
	@Test (dataProvider = "getData")
	public void testForGiftCards(String amount, String recipient_name, String recipient_email,String sender_name, String sender_mail,String sender_mobile, String message) throws InterruptedException
	{
	   	logger = report.createTest("Test "+count+" ::"+ "Gift Cards");
	   	count++;

		invokeBrowser();						// Invoke the browser
		openURL("websiteURL");							// Open Application
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		elementClick("gift_card_link_Xpath");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		elementClick("gift_for_aniversaryorbirthday_Xpath");
		
		Thread.sleep(2000);
		enterText("amount_Xpath",amount);
		
		Thread.sleep(2000);
		mouseHoverAndSelect("month_drop_down_Xpath","Nov(2020)");
		
		Thread.sleep(2000);
		mouseHoverAndSelect("date_drop_down_Xpath","3");
		
		Thread.sleep(2000);
		elementClick("click_on_next_Xpath");
		
		Thread.sleep(1000);
		enterText("recipient_name_Xpath",recipient_name);
		
		Thread.sleep(1000);
		enterText("recipient_email_Xpath",recipient_email);
		
		Thread.sleep(1000);
		enterText("sender_name_Xpath",sender_name);

		Thread.sleep(1000);
		enterText("sender_email_Xpath",sender_mail);
		
		Thread.sleep(1000);
		enterText("sender_phone_Xpath",sender_mobile);
		
		Thread.sleep(1000);
		enterText("message_Xpath",message);
		
		Thread.sleep(2000);
		elementClick("confirm_Xpath");
		Thread.sleep(2000);

	    validateResult("validate_payment_Xpath");
		
		System.out.println("Gift Card Created Successfully ::)) ");
		
		//quitBrowser();
	}
		
	@DataProvider
	public Object[][] getData()
	{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
	 
		// 1st row
		Object[][] data = new Object[16][7];
		 
		// 1st row
		data[0][0]="2000";
		data[0][1]="Piyank Kumar";
		data[0][2]="piyank@gmail.com";
		data[0][3]="Vikash Kumar Barnwal";	
		data[0][4]="vikash@gmail.com";
		data[0][5]="9693939906";
		data[0][6]="Hii Piyank, How are You ?";
		
		
		 
		// 2nd row
		data[1][0]="10000";
		data[1][1]="Akansha Kumari";
		data[1][2]="akansha@gmail.com";
		data[1][3]="Vikash Kumar Barnwal";	
		data[1][4]="vikash@gmail.com";
		data[1][5]="";
		data[1][6]="Hii Akansha, How are You ?";
		
		// 3rd row
		data[2][0]="4000";
		data[2][1]="Subhash Kumar";
		data[2][2]="subhashgmail.com";
		data[2][3]="";	
		data[2][4]="vikash@gmail.com";
		data[2][5]="9693939906";
		data[2][6]="Hii Shubhash, How are You ?";
		
		// 4th row
		data[3][0]="3000";
		data[3][1]="Aditya";
		data[3][2]="aditya@gmail.com";
		data[3][3]="Akansha Kumari";	
		data[3][4]="akansha@gmail.com";
	    data[3][5]="182855";
	    data[3][6]="Happy BirthDay Aditya !!!";
				
		// 5th row
		data[4][0]="2000";
		data[4][1]="vikash Kumar Barnwal";
		data[4][2]="vikash@gmail.com";
		data[4][3]="Akansha Kumari";	
		data[4][4]="Akanshagmail.com";
		data[4][5]="2252956686";
		data[4][6]="Happy Birthday Barnwal !!!";
				
		// 6th row
		data[5][0]="5000";
		data[5][1]="Subhash Kumar";
		data[5][2]="subhash-gmail.com";
		data[5][3]="Akansha Kumari";	
		data[5][4]="akansha@gmail.com";
		data[5][5]="8493943832";
		data[5][6]="Hii Shubhash, How are You ?";
				
		// 7th row
		data[6][0]="4000";
		data[6][1]="Shivani Kumari";
		data[6][2]="shivani@gmail.com";
		data[6][3]="Vikash Kumar Barnwal";	
		data[6][4]="vikash@gmail.com";
		data[6][5]="";
		data[6][6]="Wish you a very-2 Happy Birthday";
				
		// 8th row
		data[7][0]="10000";
		data[7][1]="Aditya Kumar";
		data[7][2]="aditya@gmail.com";
		data[7][3]="Shivani Kumari";	
		data[7][4]="";
		data[7][5]="8493984934";
		data[7][6]="Happy Birthday Aditya !!! ?";
		
		// 9th row
		data[8][0]="6000";
		data[8][1]="Subhash Kumar";
		data[8][2]="";
		data[8][3]="Vikash Kumar Barnwal";	
		data[8][4]="vikashgmail.com";
		data[8][5]="9693939906";
		data[8][6]="Happy Birthday Shubhash !!!";
		
		//10th row
		data[9][0]="";
		data[9][1]="Subhash";
		data[9][2]="subhash@gmail.com";
		data[9][3]="Vikash Kumar Barnwal";	
		data[9][4]="vikashgmail.com";
		data[9][5]="9693939906";
		data[9][6]="Hii Shubhash, How are You ?";
				
		// 11th row
		data[10][0]="3000";
		data[10][1]="Priyank Kumar";
		data[10][2]="priyank@gmail.com";
		data[10][3]="";	
		data[10][4]="vikashgmail.com";
		data[10][5]="9693939906";
		data[10][6]="Happy Birthday Priyank !!!";
				
		// 12th row
		data[11][0]="7000";
		data[11][1]="Shagun Kumari";
		data[11][2]="shagun@gmail.com";
		data[11][3]="Vikash Kumar Barnwal";	
		data[11][4]="";
		data[11][5]="";
		data[11][6]="Happy Birthday Shagun !!!";
		
		// 13th row
		data[12][0]="9000";
		data[12][1]="Sagar Mehta";
		data[12][2]="sagar@gmail.com";
		data[12][3]="Aditya Kumar";	
		data[12][4]="aditya@gmail.com";
		data[12][5]="9495939204";
		data[12][6]="Happy Birthday MehtaJi";
		
		//14th row
		data[13][0]="3450";
		data[13][1]="";
		data[13][2]="";
		data[13][3]="";	
		data[13][4]="vikashgmail.com";
		data[13][5]="9693939906";
		data[13][6]="Hii Shubhash, How are You ?";
				
		// 15th row
		data[14][0]="7000";
		data[14][1]="Arbind Kapoor";
		data[14][2]="arbind@gmail.com";
		data[14][3]="Vikash Kumar Barnwal";	
		data[14][4]="vikash@gmail.com";
		data[14][5]="969393990684994";
		data[14][6]="Happy Birthday GuptaJi";
		
		// 16th row
		data[15][0]="8000";
		data[15][1]="Rahul Dugar";
		data[15][2]="dugar@gmail.com";
		data[15][3]="Akansha Sen";	
		data[15][4]="akansha@gmail.com";
		data[15][5]="9383028392";
		data[15][6]="Happy BirthDay Dugar Saheb !!!";
		
		
		return data;
	}
}
