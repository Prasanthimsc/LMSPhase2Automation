package StepDefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import lmsPageObject.addBatchPageObject;
import lmsPageObject.batchPageObject;
import lmsPageObject.editBatchPageObject;
//import lmsPageObject.addBatchPageObject;
//import lmsPageObject.editBatchPageObject;

public class batchsteps extends baseClass
{
		
	
	
       	/****Background
       	 * @throws IOException ****/   
	
	@Given("user launches chrome browswer")
	public void user_launches_chrome_browswer() throws IOException {
		
		//configprop=new Properties();
		//FileInputStream configpropfile=new FileInputStream("config.properties");
		//configprop.load(configpropfile);
		
		logger=logger.getLogger("LMSPhase2");
		PropertyConfigurator.configure("log4j.propertiess");
		
		
	    
	}

	@When("user opens URL {string}")
	public void user_opens_url(String string) {
	
	loginpage lp=new LoginPage();
	lp.url();
		
	}
	   

	@And("user enters {string} and {string}")
	public void user_enters_and(String uname, String pwd) {
	
	
	lp.enterusername(uname);
	lp.enterpassword(pwd);
	   
	}

	@And("clicks Login button")
	public void clicks_login_button() {
	 lp.clicklogin();
	    
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	
	   homepage hp=new HomePage();
	   hp.gethomeheader();
	}
	
	/****  Scenario: Validating the Manage Batch Header   ****/

	@When("user clicks on batch link")
	public void user_clicks_on_batch_link() {
	   bpo=new batchPageObject(driver);
	   logger.info("*** Clicking Batchlink ***");
	   bpo.ClickBatchLink();
	}

	@Then("header should be {string}")
	public void header_should_be(String act_header) throws IOException {
		
		String batchheader=bpo.BatchPageHeader();
		if(batchheader.equals(act_header))
		{
			logger.info("*** Batch header text is valid ***");
			Assert.assertTrue(true);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			logger.info("*** Batch header text is Invalid ***");
			Assert.assertTrue(false);
			
		}
	   
	}
		
		/****  Scenario: Validating the Manage Batch Footer   
		 * @throws IOException ****/

	@Then("footer should be {string}")
	public void footer_should_be(String act_footer) throws IOException {
		
		String batchfooter=bpo.BatchPageFooter();
		if(batchfooter.equals(act_footer))
		{
			logger.info("*** Batch footer text is valid ***");
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			logger.info("*** Batch footer text is Invalid ***");
			Assert.assertTrue(false);
			
		}
	    
	}

	/****  Scenario: Validating the Pagination of Batch page   
	 * @throws IOException ****/
	
	@Then("text should be {string}")
	public void text_should_be(String paginationtext) throws IOException {
		
		String pagetext=bpo.BatchPaginatorText();
		if(pagetext.equals(paginationtext))
		{
			logger.info("*** Paginator text is valid ***");
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			logger.info("*** Paginator text is invalid ***");
			Assert.assertTrue(false);
			
		}
	  
	}

	@When("user clicks enabled paginator-next button")
	public void user_clicks_enabled_paginator_next_button() {
		logger.info("*** Clicking Paginator Next link ***");
		bpo.BatchPaginatorNextClick();
	}

	@When("user clicks enabled paginator-prev button")
	public void user_clicks_enabled_paginator_prev_button() {
		logger.info("*** Clicking Paginator previous link ***");
		bpo.BatchPaginatorPrevClick();
	 
	}

	@When("user cliks enabled last button")
	public void user_cliks_enabled_last_button() {
		logger.info("*** Clicking paginator last link***");
		bpo.BatchPaginatorLastClick();
	    
	}

	@Then("page number should be navigated to {string}")
	public void page_number_should_be_navigated_to(int pagenumber) throws IOException {
		
		String pagetext=bpo.BatchPaginatorText();
		int pageno = Integer.valueOf(pagetext.substring(pagetext.indexOf("to")+1, pagetext.indexOf("of")-1));
		if(pageno==pagenumber)
		{ 
			logger.info("*** Page number on pagiantaion text is valid ***");
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			logger.info("*** Page number on pagiantion text is invalid ***");
			Assert.assertTrue(false);
			
		}
	    
	}

	@When("user clicks enabled first button")
	public void user_clicks_enabled_first_button() {
		logger.info("*** Clicking paginator last link ***");
		bpo.BatchPaginatorFirstClick();
		
	}
	    
	/****  Scenario: Validating Search on Batch Page by batch name  
	 * @throws IOException ****/
	
	@Then("search text box label should be {string}")
	public void search_text_box_label_should_be(String searchlabeltext) throws IOException {
	   
		String searchlabel=bpo.SearchTextLabel();
		if(searchlabel.equals(searchlabeltext))
		{
			Assert.assertTrue(true);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
		
	}

	@When("user enters {string} in text box")
	public void user_enters_in_text_box(String searchtext) {
			
		bpo.EnterSearchText(searchtext);
	    
	}

	@And("clicks search button")
	public void clicks_search_button() {
		
		bpo.SearchEnter();
	    
	}

	@Then("entries for the searched name {string} should be displayed")
	public void entries_for_the_searched_batch_name_should_be_displayed(String batchname) throws IOException {
		
		int rowscount=bpo.rowsintable();
		for(int r=1;r<=rowscount;r++)
		{
			String act_batchname=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+r+"]/td[2]")).getText();
			if(act_batchname.equals(batchname))
			{
				Assert.assertTrue(true);
		
			}
			else
			{
				captureScreen(driver,"batchSteps");
				Assert.assertTrue(false);
				
			}
		
		}
	   
	}
	
	/****  Scenario: Validating Search on Batch Page by batch description  
	 * @throws IOException ****/

	@Then("entries for the searched description {string} shoule be displayed")
	public void entries_for_the_searched_batch_description_shoule_be_displayed(String batchdescription) throws IOException {
		
		int rowscount=bpo.rowsintable();
		for(int r=1;r<=rowscount;r++)
		{
			String act_description=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+r+"]/td[3]")).getText();
			if(act_description.equals(batchdescription))
			{
				Assert.assertTrue(true);
		
			}
			else
			{
				captureScreen(driver,"batchSteps");
				Assert.assertTrue(false);
				
			}
		
		}
	   
	}
	
	/****  Scenario: Validating Search on Batch Page by batch status  
	 * @throws IOException ****/

	@Then("entries for the searched status {string} shoule be displayed")
	public void entries_for_the_searched_batch_status_shoule_be_displayed(String batchstatus) throws IOException {
		
		int rowscount=bpo.rowsintable();
		for(int r=1;r<=rowscount;r++)
		{
			String act_status=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+r+"]/td[4]")).getText();
			if(act_status.equals(batchstatus))
			{
				Assert.assertTrue(true);
		
			}
			else
			{
				captureScreen(driver,"batchSteps");
				Assert.assertTrue(false);
				
			}
		
		}
	    
	}
	
	/****  Scenario: Validating Search on Batch Page by no of classes  
	 * @throws IOException ****/

	@Then("entries for the searched classes {string} shoule be displayed")
	public void entries_for_the_searched_no_of_classes_shoule_be_displayed(String noofclasses) throws IOException {
	    
		int rowscount=bpo.rowsintable();
		for(int r=1;r<=rowscount;r++)
		{
			String act_noofclasses=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+r+"]/td[5]")).getText();
			if(act_noofclasses.equals(noofclasses))
			{
				Assert.assertTrue(true);
		
			}
			else
			{
				captureScreen(driver,"batchSteps");
				Assert.assertTrue(false);
				
			}
		
		}
	}
	
	/****  Scenario: Validating Search on Batch Page by program name 
	 * @throws IOException ****/

	@Then("entries for the searched program {string} should be displayed")
	public void entries_for_the_searched_program_name_should_be_displayed(String programname) throws IOException {
		
		int rowscount=bpo.rowsintable();
		for(int r=1;r<=rowscount;r++)
		{
			String act_pname=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+r+"]/td[6]")).getText();
			if(act_pname.equals(programname))
			{
				Assert.assertTrue(true);
		
			}
			else
			{
				captureScreen(driver,"batchSteps");
				Assert.assertTrue(false);
				
			}
		
		}
	    
	}
	
	/****  Scenario: Valiting the ascending order sort on batch name  
	 * @throws IOException ****/

	@And("user clicks on batch name ascending order arrow")
	public void user_clicks_on_batch_name_ascending_order_arrow() throws IOException {
		
		bpo.BatchNameAscendingOrderClick();
			    
	}

	@Then("batch name should be sorted in ascending order")
	public void batch_name_should_be_sorted_in_ascending_order() throws IOException {
		
		bpo.BatchNameAscendingOrderClick();
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[2]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp);
				
		if(actuallist.equals(temp))
		{
			System.out.println("Ascending order Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Ascending order Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	    
	}
	
	/****  Scenario: Valiting the ascending order sort on batch description  ****/

	@And("user clicks on batch description ascending arrow")
	public void user_clicks_on_batch_description_ascending_arrow() {
		
		bpo.BatchDescriptionAscendingOrderClick();
	   
	}

	@Then("batch description should be sorted in ascending order")
	public void batch_description_should_be_sorted_in_ascending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[3]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp);
				
		if(actuallist.equals(temp))
		{
			System.out.println("Ascending order Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Ascending order Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	   
	}
	
	/****  Scenario: Valiting the ascending order sort on batch status  ****/

	@And("user clicks on batch status ascending order arrow")
	public void user_clicks_on_batch_status_ascending_order_arrow() {
	    
		bpo.BatchStatusAscendingOrderClick();
	}

	@Then("batch status should be sorted in ascending order")
	public void batch_status_should_be_sorted_in_ascending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[4]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp);
				
		if(actuallist.equals(temp))
		{
			System.out.println("Ascending order Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Ascending order Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	   
	}
	
	/****  Scenario: Valiting the ascending order sort on no of classes  ****/

	@And("user clicks on no of classes ascending arrow")
	public void user_clicks_on_no_of_classes_ascending_arrow() {
		
		bpo.BatchNoOfClassesAscendingOrderClick();
	  
	}

	@Then("no of classes should be sorted in ascending order")
	public void no_of_classes_should_be_sorted_in_ascending_order() throws IOException {
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[5]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp);
				
		if(actuallist.equals(temp))
		{
			System.out.println("Ascending order Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Ascending order Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	    
	}
	
	/****  Scenario: Valiting the ascending order sort on program name  ****/

	@And("user clicks on program name ascending arrow")
	public void user_clicks_on_program_name_ascending_arrow() {
		
		bpo.BatchProgramNameAscendingOrderClick();
	    
	}

	@Then("program name should be sorted in ascending order")
	public void program_name_should_be_sorted_in_ascending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[6]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp);
				
		if(actuallist.equals(temp))
		{
			System.out.println("Ascending order Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Ascending order Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	   
	}
	
	/****  Scenario: Valiting the descending order sort on batch name  ****/

	@And("user clicks on batch name descending order arrow")
	public void user_clicks_on_batch_name_descending_order_arrow() {
		
		bpo.BatchNameDescendingOrderClick();
	   
	}

	@Then("batch name should be sorted in descending order")
	public void batch_name_should_be_sorted_in_descending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[2]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp,Collections.reverseOrder());
				
		if(actuallist.equals(temp))
		{
			System.out.println("Descending sort Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Descending sort Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
		
		
	
	}
	
	/****  Scenario: Valiting the descending order sort on batch description  ****/

	@And("user clicks on batch description descending arrow")
	public void user_clicks_on_batch_description_descending_arrow() {
		
		bpo.BatchDescriptionDescendingOrderClick();
	   
	}

	@Then("batch description should be sorted in descending order")
	public void batch_description_should_be_sorted_in_descending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[3]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp,Collections.reverseOrder());
				
		if(actuallist.equals(temp))
		{
			System.out.println("Descending sort Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Descending sort Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	    
	}
	
	/****  Scenario: Valiting the descending order sort on batch status ****/

	@And("user clicks on batch status descending order arrow")
	public void user_clicks_on_batch_status_descending_order_arrow() {
		
		bpo.BatchStatusDescendingOrderClick();
	    
	}

	@Then("batch status should be sorted in descending order")
	public void batch_status_should_be_sorted_in_descending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[4]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp,Collections.reverseOrder());
				
		if(actuallist.equals(temp))
		{
			System.out.println("Descending sort Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Descending sort Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	
	}
	
	/****  Scenario: Valiting the descending order sort on no of classes  ****/

	@And("user clicks on no of classes descending arrow")
	public void user_clicks_on_no_of_classes_descending_arrow() {
		
		bpo.BatchNoOfClassesDescendingOrderClick();
	   
	}

	@Then("no of classes should be sorted in descending order")
	public void no_of_classes_should_be_sorted_in_descending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[5]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp,Collections.reverseOrder());
				
		if(actuallist.equals(temp))
		{
			System.out.println("Descending sort Functionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Descending sort Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	   
	}
	
	/****  Scenario: Valiting the descending order sort on program name  ****/

	@And("user clicks on program name descending arrow")
	public void user_clicks_on_program_name_descending_arrow() {
		
		bpo.BatchProgramNameDescendingOrderClick();
	   
	}

	@Then("program name should be sorted in descending order")
	public void program_name_should_be_sorted_in_descending_order() throws IOException {
		
		List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[6]"));
		List actuallist=new ArrayList();
		for(WebElement ele:tdList)		
		{
			String data=ele.getText();
			actuallist.add(data);
		}
		
		List temp=new ArrayList();
		temp.addAll(actuallist);
		
		// Ascending Order
		Collections.sort(temp,Collections.reverseOrder());
				
		if(actuallist.equals(temp))
		{
			System.out.println("Descending sortFunctionality is working");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Descending sort Functionality is not working");
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	    
	}

	/****  Scenario: Scenario: Valdiating no of rows in table  ****/
	
	@When("user clicks on batch page")
	public void user_clicks_on_batch_page() {
		
		bpo.ClickBatchLink();
	   
	}

	@Then("no of rows should be {string}")
	public void no_of_rows_should_be(String string) throws IOException {
		
		int rowscount=bpo.rowsintable();
		if(rowscount==5)
		{
           Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
		
	 
	}
	
	
	/****  Scenario: Validating new batch button  ****/
	
	@When("admin clicks on batch link")
	public void admin_clicks_on_batch_link() {
		
	  bpo.ClickBatchLink();
	}

	@And("admin cliks +A new batch button")
	public void admin_cliks_a_new_batch_button() {
		
		bpo.ClickNewBatchLink();
	   
	}

	@Then("header text should be {string}")
	public void header_text_should_be(String act_header) throws IOException {
		
		String batchheader=bpo.BatchPageHeader();
		if(batchheader.equals(act_header))
		{
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	    
	}
	
	/****  Scenario: No details entered on new batch details page  ****/

	@And("clicks +A new batch button")
	public void clicks_a_new_batch_button() {
		
		bpo.ClickNewBatchLink();
	    
	}

	@And("clicks on new batch details save button")
	public void clicks_on_new_batch_details_save_button() {
		
		abpo=new addBatchPageObject(driver);
		abpo.addBatchclickSave();
	    
	}

	@Then("message should be {string}")
	public void message_should_be(String act_header) throws IOException {
		
		String batchheader=abpo.addErrorMessage();
		if(batchheader.equals(act_header))
		{
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	  
	}
	
	/****  Scenario: Validating the message when only name is entered on new batch details page ****/

	@And("enters {string}")
	public void enters(String bname) {
		
		abpo.addBatchName(bname);
	 
	}
	
	
	/****  Scenario:Validating the program name drop down in new bathc details page ****/
	
	@And("clicks on program name drop down")
	public void clicks_on_program_name_drop_down() {
		
		abpo.ClickProgramDropDown();
	    
	}

	@Then("list of program names should be visible")
	public void list_of_program_names_should_be_visible() {
		
		
	    
	}
	
	/****  Scenario: Validating the message when only program name is entered on new batch details page ****/

	@And("user selects {string}")
	public void user_selects_program_name(String pname) {
		
		abpo.addBatchProgramName(pname);
	}
	
	/****  Scenario: Validating the message when only status is selected on new batch details page ****/
	
	@And("user selects status")
	public void user_selects_status() {
		
		abpo.addBatchActiveStatus();
	   
	}
	
	/****  Scenario: Validating the message when only no of classes is selected on new batch details page ****/

	@And("user enters {string}")
	public void user_enters_no_of_classes(String classes) {
		
		abpo.addBatchNoOfClasses(classes);
	  
	}
	
	/****  Scenario: Adding a new batch ****/

	@And("user enters all the details required")
	public void user_enters_all_the_details_required(String name,String des,String program, String classes) {
		
		abpo.addBatchName(name);
		abpo.addBatchDescription(des);
		abpo.addBatchProgramName(program);
		abpo.addBatchInactiveStatus();
		abpo.addBatchNoOfClasses(classes);
		abpo.addBatchclickSave();
		
	   
	}

	@Then("new batch should be created")
	public void new_batch_should_be_created() {
		
		abpo.getaddBatchConfirmationMsg();
	  
	}
	
	/****  Scenario: Validating the cancel button on batch details window ****/

	@And("clicks on new batch details cancel button")
	public void clicks_on_new_batch_details_cancel_button() {
		
		abpo.addBatchclickCancel();
	    
	}

	@Then("batch details window is closed")
	public void batch_details_window_is_closed() {
		
		abpo.addBatchclickCancel();
	    
	}
	
	/**** Scenario: Searching for the newly added batch****/

	@And("enters newly added batch in search")
	public void enters_newly_added_batch_in_search(String name) {
		
		bpo.EnterSearchText(name);
	    
	}

	@Then("newly added batch should be displayed")
	public void newly_added_batch_should_be_displayed(String name) throws IOException {
		
		String act_batchname=driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[2]/td[2]")).getText();
		if(act_batchname.equals(name))
		{
			Assert.assertTrue(true);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	
	}
	  
	
	
	/**** Scenario: Validating the add new batch button for user/staff ****/

	@When("staff\\/user clicks on batch link")
	public void staff_user_clicks_on_batch_link() {
		
		bpo.ClickBatchLink();
	    
	}

	@And("clicks on +A new batch button")
	public void clicks_on_a_new_batch_button() {
		
		bpo.ClickNewBatchLink();
	}
	
	/**** Scenario: Validate Edit button ****/

	@And("admin clicks edit on batch page")
	public void admin_clicks_edit_on_batch_page() {
		
		ebpo=new editBatchPageObject(driver);
		bpo.BatchEditClick();
	  
	}
	
	/**** Scenario: To edit batch name on batch details ****/

	@And("admin updates name on batch details")
	public void admin_updates_name_on_batch_details(String name) {
		
		ebpo.editBatchName(name);
	    
	}

	@And("admin clicks save on batch details")
	public void admin_clicks_save_on_batch_details() {
		
		ebpo.editBatchclickSave();
	
	}
	
	/**** Scenario: To edit batch description on batch details ****/

	@And("admin updates description on batch details")
	public void admin_updates_description_on_batch_details(String desc) {
		
		ebpo.editBatchDescription(desc);
	   
	}
	
	/**** Scenario: To edit program name on batch details ****/

	@And("admin updates program name on batch details")
	public void admin_updates_program_name_on_batch_details(String pname) {
		
		ebpo.editBatchProgramName(pname);
	    
	}
	
	/**** Scenario: To edit batch status on batch details ****/

	@And("admin updates status on batch details")
	public void admin_updates_status_on_batch_details() {
		
		ebpo.editBatchActiveStatus();
	  
	}
	
	/**** Scenario: To edit no of classes on batch details ****/

	@And("admin updates no of classes on batch details")
	public void admin_updates_no_of_classes_on_batch_details(String classes) {
		
		ebpo.editBatchNoOfClasses(classes);
	    
	}
	
	/**** Scenario: To click cancel on batch details ****/

	@And("click cancel on batch details")
	public void click_cancel_on_batch_details() {
		
		ebpo.editBatchclickCancel();
	  
	}
	
	/**** Scenario: To validate edit button disabled for user/staff ****/

	@When("user\\/staff clicks on batch link")
	public void user_staff_clicks_on_batch_link() {
		
		bpo.BatchEditClick();
	   
	}
	
	
	@When("user\\/staff clicks edit on batch page")
	public void user_staff_clicks_edit_on_batch_page() {
		
		bpo.BatchEditClick();
	    
	}
	
	/**** Scenario: Verify the delete functionality ****/

	@And("admin clicks delete on batch page")
	public void admin_clicks_delete_on_batch_page() {
		
		bpo.clickDelete();
	   
	}

	@Then("delete dialog box is opened")
	public void delete_dialog_box_is_opened(String act_title) throws IOException {
		
		String deletetitle=bpo.DeleteBoxMessage();
		if(deletetitle.equals(act_title))
		{
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	}

	@When("admin click Yes")
	public void admin_click_yes() {
		
		bpo.DeleteYesClick();
	   
	}

	@Then("message displayed should be {string}")
	public void message_displayed_should_be(String string) {
		
		bpo.DeleteYesMessage();
	    
	}
	
   /**** Scenario: Validating Search on Batch Page by deleted batch name ****/

	@Then("no results with deleted batch name should be displayed")
	public void no_results_with_deleted_batch_name_should_be_displayed(String bname) {
		
	  bpo.EnterSearchText(bname);
	}

	/**** Scenario: To click No button on delete dialog ****/
	
	@When("admin click No")
	public void admin_click_no() {
		
		bpo.DeleteNoClick();
	   
	}
	
	@Then("batch is not deleted")
	public void batch_is_not_deleted() {
		
		bpo.DeleteNoMessage();
	   
	}
	
	/**** Scenario: To validate delete for user/staff ****/

	@When("user\\/staff clicks delete on batch page")
	public void user_staff_clicks_delete_on_batch_page() {
		
		bpo.clickDelete();
	 
	}

	/**** Scenario: To validate the status of delete on top left of batch page 
	 * @throws IOException ****/
	
	@Then("delete on top left is disabled")
	public void delete_on_top_left_is_disabled() throws IOException {
		
		boolean delstatus=bpo.deletebtnstatus();
		if(delstatus==false)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
		
	}
	
	
	/**** Scenario: To verify the multiple selection of batches for deletion ****/
	
	@When("admin user clicks on batch link")
	public void admin_user_clicks_on_batch_link() {
		
	 bpo.ClickBatchLink();
	}

	@And("selects multiple batches")
	public void selects_multiple_batches() {
		
		bpo.bacthcheckboxclick();
		
	    
	}

	@Then("delete on top left is enabled")
	public void delete_on_top_left_is_enabled() throws IOException {
		
		boolean delstatus=bpo.deletebtnstatus();
		if(delstatus==true)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	    
	}

	@When("admin clicks delete on top left")
	public void admin_clicks_delete_on_top_left() {
		
		bpo.TopDeleteClick();
	    
	}

	@Then("confirm delete should be displayed")
	public void confirm_delete_should_be_displayed(String act_title) throws IOException {
		
		String deletetitle=bpo.DeleteBoxMessage();
		if(deletetitle.equals(act_title))
		{
			Assert.assertTrue(false);
	
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
			
		}
	  
	}

	@When("admin clicks yes")
	public void admin_clicks_yes() {
		
		bpo.DeleteYesClick();
	  
	}

	@When("admin searches for deleted batch")
	public void admin_searches_for_deleted_batch(String name) {
		
		bpo.EnterSearchText(name);
		bpo.SearchEnter();
	    
	}

	@Then("no results for batch are displayed")
	public void no_results_for_batch_are_displayed() throws IOException {
		
		int rowscount=bpo.rowsintable();
		if(rowscount==0)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	
	}
	
	 /**** Scenario: To verify no button on multiple batch delete dialog ****/

	@When("admin clicks no")
	public void admin_clicks_no() {
		
		bpo.DeleteNoClick();
	    
	}

	 /**** Scenario: To verify the multiple selection of batches for deletion by user/staff ****/
	
	@When("user\\/staff user clicks on batch link")
	public void user_staff_user_clicks_on_batch_link() {
		
		bpo.ClickBatchLink();
	  
	}

	@And("user\\/staff clicks delete on top left")
	public void user_staff_clicks_delete_on_top_left() {
		
		bpo.TopDeleteClick();
	   
	}
	
	/**** Scenario: To verify the all check box ****/

	@When("admin\\/user\\/staff clicks on batch link")
	public void admin_user_staff_clicks_on_batch_link() {
		
		bpo.ClickBatchLink();
	    
	}

	@And("admin\\/user\\/staff selects all checkbox")
	public void admin_user_staff_selects_all_checkbox() {
		
		bpo.BatchTopCheckBoxClick();
	  
	}

	@Then("all checkboxes in the batch should be selected")
	public void all_checkboxes_in_the_batch_should_be_selected(WebElement path) throws IOException {
		
		int rowscount=bpo.rowsintable();
		List<WebElement> tdList = bpo.chkboxlist(path);
		Boolean status=true;
		for(WebElement chkbox:tdList)
		{
			status=chkbox.isEnabled();
			if(status.FALSE)
				break;
		}
		
		if(status=true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"batchSteps");
			Assert.assertTrue(false);
		}
	
	}

}
