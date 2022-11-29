package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjectModel.AssignmentPage;
import PageObjectModel.ProgramPage;
import io.cucumber.java.en.*;



public class AssignmentStep extends BaseClass {
	
	
	
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		
           pp=new ProgramPage(driver);
           ap=new AssignmentPage(driver);
		
		pp.GetUrl();
		
	    
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
		
		
		ap.ClickAssignPage();
		
		}

	@Then("Admin\\/User\\/Staff Should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String AssignPage) {
		
		
		ap.ValidateHeaderPage();
	
	}

	@Then("Admin\\/User\\/Staff Should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String FText) {
	    
		ap.DisplayFooterText();
		
	}
	
	//Pagination
	
	@Then("Admin\\/User\\/Staff Should see a Paginator text {string}")
	public void admin_user_staff_should_see_a_paginator_text(String PageText) {
	    
		ap.DisplayPaginationText();
		
	}
	
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		
		ap.CheckNextPageEnabled();
		
	}

	@Then("Admin\\/User\\/Staff Should be navigated to next page")
	public void admin_user_staff_should_be_navigated_to_next_page() {
	    
		ap.NavigateNextPage();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-previous button")
	public void admin_user_staff_clicks_on_enabled_paginator_previous_button() {
	    
		ap.PreviousPage();
		
		
	}
	
	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_user_staff_should_be_navigated_to_previous_page() {
	   
		ap.DisplayPaginationText();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-second next button")
	public void admin_user_staff_clicks_on_enabled_paginator_second_next_button() {
	    
		ap.CheckNextPageEnabled();
	}
	
	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_user_staff_should_be_navigated_to_last_page() {
	    
		ap.NavigateNextPage();
		
	}
	
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-first previous button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_previous_button() {
	    
		ap.PreviousPage();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to First page")
	public void admin_user_staff_should_be_navigated_to_first_page() {
	    
		ap.NavigatePage();
	}
	
@When("Admin\\/User\\/Staff clicks Search bar after entering Assignment name")
	public void admin_user_staff_clicks_search_bar_after_entering_assignment_name() {
	    
	pp.CheckSearch();
	ap.SearchAssignmentname();
	
}

	@Then("The requested assignment details should be displayed")
	public void the_requested_assignment_details_should_be_displayed() {
	    
		ap.DisplayAssignmentDetails();
		
	}

	
	@Given("Admin\\/User\\/Staff is on Assignment Page")
	public void admin_user_staff_is_on_assignment_page() {
		
		ap.ClickAssignPage();
	    
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {
	   
		ap.ClickAssignmentNameAscendArrow();
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
	    
		ap.DisplayAssignNameAscending();
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
	   
		ap.ClickAssignDescriptionAscendArrow();
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {
	    
		ap.DisplayAssignmentDescriptionAscending();
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() {
	    
		ap.ClickAscendAssignmentDuedate();
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
	    
		ap.DisplayAscendingDueDate();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
	    
		ap.ClickAssignGrade();
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
	    
		ap.DisplayAscendingGrade();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
		
		ap.ClickDescendingNameArrow();
	   
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
		
	    ap.DisplayNameInDescendingOrder();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
		
       ap.ClickDescendingAssignmentArrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
		
		ap.DisplayAssignmentInDescendingOrder();
		
	  
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow() {
		
		ap.ClickDescendingDueDateArrow();
	    
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
	    
		ap.DisplayDueDateInDescendingOrder();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
		
		ap.ClickDescendingGradeArrow();
	   
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
		
		
		ap.DisplayGradeInDescendingOrder();
		
		
	  
	}


	@Given("Staff\\/User is on Manage Assignment page")
	public void staff_user_is_on_manage_assignment_page() {
	 
		ap.ClickAssignPage();
		
	}

	@When("Staff\\/User clicks a Add new assignment button")
	public void staff_user_clicks_a_add_new_assignment_button() {
	    
		ap.ClickNewAssignmentBtn();
	}

	@Then("Staff\\/User should see Assignment details window")
	public void staff_user_should_see_assignment_details_window() {
	    
		ap.DisplayAssignmentDetails();
		
	}

	@When("Admin clicks a Add New Assignment button")
	public void admin_clicks_a_add_new_assignment_button() {
	    
		ap.ClickAdminAddAssignmentBtn();
	}

	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
	   
		ap.DisplayErrorMsg();
		
	}

	@When("Staff\\/User  clicks on Save after leaving all the fields empty")
	public void staff_user_clicks_on_save_after_leaving_all_the_fields_empty() {
	    
		ap.EmptyField();
	}

	@Then("Staff\\/User should see an error message {string}")
	public void staff_user_should_see_an_error_message(String string) {
	   
		ap.DisplayErrorMessage();
	
	}

	@When("Staff\\/User clicks  Save button after entering Assignment details")
	public void staff_user_clicks_save_button_after_entering_assignment_details() {
	    
		ap.EnterAssignmentDetails();
	}

	@Then("Staff\\/User should see a message {string}")
	public void staff_user_should_see_a_message(String string) {
	    
		ap.DisplayMessage();
		
	}

	@When("Staff\\/User clicks cancel button while entering all fields")
	public void staff_user_clicks_cancel_button_while_entering_all_fields() {
	    
		ap.ClickCancelBtn();
		
	}

	@Then("Staff\\/User should see a Assignment details window is closed by not adding New Assignment in page")
	public void staff_user_should_see_a_assignment_details_window_is_closed_by_not_adding_new_assignment_in_page() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println(ActualTitle);
		
		
	}

	@When("Admin\\/User\\/Staff clicks on Assignment")
	public void admin_user_staff_clicks_on_assignment() {
	    
		ap.ClickAssignPage();
	}

	@Then("Admin\\/User\\/Staff should see a newly added Assignment")
	public void admin_user_staff_should_see_a_newly_added_assignment() {
	    
		
	}

	@When("Staff\\/User clicks manage button under Assignment Grade")
	public void staff_user_clicks_manage_button_under_assignment_grade() {
	   
		ap.ClickAssignGrade();
	}

	@Then("Staff\\/User should be navigated to Grade Window")
	public void staff_user_should_be_navigated_to_grade_window() {
	   driver.navigate().forward();
	}

//Edit Functionality
	
	@Given("Staff is on Manage Assignment page")
	public void staff_is_on_manage_assignment_page() {
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle );
		System.out.println(ActualTitle);
		}
		
	

	@When("Staff\\/User clicks an edit Assignment button")
	public void staff_user_clicks_an_edit_assignment_button() {
	    
		ap.ClickEditButton();
	}

	@Then("Staff\\/User should see a Assignment details window")
	public void staff_user_should_see_a_assignment_details_window() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Assignment Details";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println(ActualTitle);
	}

	@When("Staff\\/User clicks Save button after edits Assignment Name")
	public void staff_user_clicks_save_button_after_edits_assignment_name() {
		
		ap.EditAssignmentName();
	
		pp.ClickSaveBtn();
		
	}

	@When("Staff\\/User clicks Save button  after edits Assignment Description")
	public void staff_user_clicks_save_button_after_edits_assignment_description() {
	    
		ap.EditAssignmentDesc();
		pp.ClickSaveBtn();
	}

	@When("Staff\\/User clicks Save button After edits Assignment Grade")
	public void staff_user_clicks_save_button_after_edits_assignment_grade() {
		
	    ap.EditAssignmentGrade();
    
		pp.ClickSaveBtn();
	}

	@When("Staff\\/User clicks Save button After edits Assignment DueDate")
	public void staff_user_clicks_save_button_after_edits_assignment_due_date() {
	   
		ap.EditAssignmentDueDate();
		pp.ClickSaveBtn();
	}

	@When("Staff\\/User clicks cancel button")
	public void staff_user_clicks_cancel_button() {
	    
		ap.ClickCancelBtn();
	}

	@Then("Staff\\/User Should see a Assignment Details Page is closed without any updates on Assignment details")
	public void staff_user_should_see_a_assignment_details_page_is_closed_without_any_updates_on_assignment_details() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
	    
		ap.ClickEditButton();
	}

	@Then("Admin\\/Staff\\/User should see a message {string}")
	public void admin_staff_user_should_see_a_message(String string) {
	    
		ap.DisplayErrorMessage();
	}

	@Given("Admin\\/User\\/Staff on Assignment page")
	public void admin_user_staff_on_assignment_page() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Name")
	public void admin_user_staff_clicks_on_assignment_name() {
	    
	    ap.ClickAssignmentName();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
	public void admin_user_staff_should_be_navigated_to_assignment_google_form_page() {
	    
		ap.NavigatePageToGoogleForm();
	}

	@When("Admin clicks on Assignment Name")
	public void admin_clicks_on_assignment_name() {
	   
		ap.ClickAssignmentName();
	}

	@Then("Message displays as {string}")
	public void message_displays_as(String string) {
	    
		ap.DisplayErrorMessage();
	}

	@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
	   
		ap.ClickSubmitButton();
	}

	@Then("Admin\\/User\\/Staff entered google forms successfully")
	public void admin_user_staff_entered_google_forms_successfully() {
	   
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Google Forms";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println(ActualTitle);
	}

	@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
	   
		ap.ClickSubmitButton();
	}

	@Then("Message shows need to enter {string}")
	public void message_shows_need_to_enter(String string) {
	    
		ap.DisplayErrorMsg();
	}

	@When("Admin\\/User\\/Staff clicks Switch account link")
	public void admin_user_staff_clicks_switch_account_link() {
	    
		ap.ClickAccountLink();
	}

	@Then("Admin\\/User\\/Staff should be switched over the account Successfully")
	public void admin_user_staff_should_be_switched_over_the_account_successfully() {
	    
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="loggedingoogleform.com";
		Assert.assertEquals(ActualUrl, ExpectedUrl);
	}
	
	@When("Staff\\/User clicks on delete button on the right side")
	public void staff_user_clicks_on_delete_button_on_the_right_side() {
	   
		pp.ClickDelBtn();
	}

	@Then("Staff\\/User should see a Delete Confirmation window")
	public void staff_user_should_see_a_delete_confirmation_window() {
	    
		pp.DisplayDeleteBox();
	}

	@When("Staff\\/User clicks Yes")
	public void staff_user_clicks_yes() {
	    
		pp.ClickYesButton();
	}

	@Then("Message occurs as {string}")
	public void message_occurs_as(String string) {
	    
		pp.DisplayDeleteBox();
	}

	@When("Staff\\/User clicks No")
	public void staff_user_clicks_no() {
	   
		pp.ClickNoButton();
	}

	@Then("Window is closed without deleting the assignment")
	public void window_is_closed_without_deleting_the_assignment() {
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle );
	}

	@When("Admin clicks on delete button")
	public void admin_clicks_on_delete_button() {
	    
		pp.ClickDelBtn();
	}

	@Then("Message says {string}")
	public void message_says(String string) {
	    
		pp.DisplayErrMessage();
	}

	@Given("Admin\\/User\\/Staff is on Assignments page")
	public void admin_user_staff_is_on_assignments_page() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle );
		
	}

	@When("Admin\\/User\\/Staff clicks on delete button on the top left")
	public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {
	    
		pp.ClickDelBtn();
	}

	@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void admin_user_staff_should_see_a_disabled_delete_button() {
	   
		pp.DisabledDel();
	}

	@When("Staff\\/User clicks delete button on the top aftr selecting multiple checkbox")
	public void staff_user_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {
	    
		pp.ClickMultipleCheckBoxes();
	}

	@Then("Staff\\/User should see a Delete confirm window")
	public void staff_user_should_see_a_delete_confirm_window() {
	    
		pp.DisplayDeleteBox();
	}

	@When("Staff clicks Yes")
	public void staff_clicks_yes() {
	    
		pp.ClickYesButton();
	}

	@Then("All Assignments are deleted Successfully")
	public void all_assignments_are_deleted_successfully() {
	    
		pp.DisplayStatusMsg();
	}

	@When("Staff clicks No")
	public void staff_clicks_no() {
	    
		pp.ClickNoButton();
	}

	@Then("Confirmation delete window should be closed successfully")
	public void confirmation_delete_window_should_be_closed_successfully() {
	    
		pp.DisplayDeleteBox();
		driver.close();
	}

	@Given("Admin\\/User\\/Staff is on Manage Assignment page")
	public void admin_user_staff_is_on_manage_assignment_page() {
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle );
		
	}

	@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
	public void admin_user_staff_clicks_check_box_on_the_left_side_to_the_assignment_name() {
	    
		pp.ClickCheckBox();
	}

	@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
	public void admin_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
	   
		pp.EnableDeletebtn();
	}
	

	@When("Admin clicks check box on the left side to the Assignment Name")
	public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
	  
		pp.ClickCheckBox();
	}

	@Then("Message occurs\"No access to Admin to click on Checkbox\"")
	public void message_occurs_no_access_to_admin_to_click_on_checkbox() {
	    
		pp.DisplayErrMessage();
	}

	@When("Admin\\/User\\/Staff clicks individual checkbox button")
	public void admin_user_staff_clicks_individual_checkbox_button() {
	   
		ap.ClickOneCheckBox();
		
	}

	@Then("Admin\\/User\\/Staff should see a delete button on the top left")
	public void admin_user_staff_should_see_a_delete_button_on_the_top_left() {
	    
     ap.EnableDelButton();
	}
	@When("Admin clicks individual checkbox button")
	public void admin_clicks_individual_checkbox_button() {
	   
		ap.ClickOneCheckBox();
	}

	@Then("Alert Message as {string}")
	public void alert_message_as(String string) {
	    
		pp.DisplayErrMessage();
	}


	
	
	
}
