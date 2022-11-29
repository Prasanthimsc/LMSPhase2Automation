package Step_Definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.pages.BaseClass;

import Page_Object.Login_Page;
import io.cucumber.java.en.*;

public class LoginStep extends Base_Class{
	
	WebDriver driver;
	

	@Given("Admin/User/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
		

		lp= new Login_Page(driver);

	}

	@When("Admin/User/Staff opens the LMS website")
	public void admin_user_staff_opens_the_lms_website() {
		
      lp.url();
		
	}

	@Then("Admin/user/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {

		lp.login();

	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() {

		lp.headervalidation();
		lp.footervalidation();
		

	}

	@When("^User clicks login button after entering (.*) and (.*)$")
	public void user_clicks_login_button_after_entering_username_and_password(String uname,String psd) {
		
		lp.enterusername(uname);
		lp.enterpassword(psd);
		

	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String string) {
	    
		lp.headerText();
		
	}

	@When("^Admin/Staff clicks login Button after entering (.*) , (.*) , (.*)$")
	public void admin_staff_clicks_login_button_after_entering_username_password_code(String uname,String psd,String code) {

		lp.enterusername(uname);
		lp.enterpassword(psd);
		lp.entercode(code);
		
	}

	@Then("Admin/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String string) {

		lp.headerText();

	}

	@When("^User clicks login button after entering valid (.*) and invalid (.*)$")
	public void user_clicks_login_button_after_entering_valid_username_and_invalid_password(String uname,String psd) {
		
		lp.enterusername(uname);
		lp.enterpassword(psd);

	}

	@Then("User should see a error message {string}")
	public void user_should_see_a_error_message(String string) throws IOException {

		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);

	}

	@When("^User clicks login button after entering Invalid (.*) and invalid (.*)$")
	public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password(String uname,String psd) {
		
		lp.enterusername(uname);
		lp.enterpassword(psd);
		
	}

	@When("^User clicks login button after entering valid (.*) and leaves (.*) field empty$")
	public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty(String uname,String psd) {

		lp.enterusername(uname);
		lp.enterpassword(psd);

	}

	@Then("It should show error message {string}")
	public void it_should_show_error_message(String string) throws IOException {

		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);

	}

	

	@When("^Admin/Staff clicks login button after entering valid (.*) invalid (.*) and (.*)$")
	public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code(String uname,String psd,String code) {

		lp.enterusername(uname);
		lp.enterpassword(psd);
		lp.entercode(code);

	}

	@Then("Admin/Staff should see a error message {string}")
	public void admin_staff_should_see_a_error_message(String string) throws IOException {

		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);

	}
	
	
	@When("^Admin/Staff clicks login button after entering invalid (.*) , valid (.*) and (.*)")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code(String uname,String psd,String code) {

		lp.enterusername(uname);
		lp.enterpassword(psd);
		lp.entercode(code);
		
	}
	
	@Then("Admin/Staff should get a error message {string}")
	public void admin_staff_should_get_a_error_message(String string) throws IOException{
		
		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
		
	}

	
	@When("^Admin/Staff clicks login button after entering invalid (.*) ,valid (.*) and without (.*)$")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_without_code(String uname,String psd,String code) {
		
		lp.enterusername(uname);
		lp.enterpassword(psd);
		lp.entercode(code);
		
	}

	
	@When("Admin/User/Staff clicks {string} link")
	public void admin_user_staff_clicks_link(String string) {

		lp.clickforgetpassword();

	}

	@Then("^Dispalys a text box enter the (.*) id$")
	public void dispalys_a_text_box_enter_the_email_id(String email){
		
		lp.enteremail(email);

	}

	@When("Admin/User/Staff clicks continue after entering valid {string} address")
	public void admin_user_staff_clicks_continue_after_entering_valid_address(String string) {
	    
		lp.enterclick();
		
	}

	@Then("^Admin/User/Staff should be redirected to enter {string} and verification code will be sent to email$")
	public void admin_user_staff_should_be_redirected_to_enter_and_will_be_sent_to_email(String verify) {

		System.out.println("Verification code will be got from Email");
		
	}

	@Given("^Admin/User/Staff is on enter verification code Page$")
	public void admin_user_staff_is_on_enter_verification_code_page() {
		
		lp.verificationheader();
	
		
	}

	@When("^Admin/User/Staff clicks continue after entering (.*)$")
	public void admin_user_staff_clicks_continue_after_entering(String verify) {
	   
		lp.verify(verify);
		
	}

	@Then("Admin/User/Staff should be redirected {string} page")
	public void admin_user_staff_should_be_redirected_page(String string) {
		
		lp.resetURL();
	  
	}

	@When("Admin/User/Staff clicks {string} link to resend")
	public void admin_user_staff_clicks_link_to_resend(String string) {

		lp.enterclick();

	}

	@Then("The {string} should be resend to email")
	public void the_should_be_resend_to_email(String string) {

		System.out.println("Verification code will be resend to Email");

	}

	@Given("Admin/User/Staff is on Reset Password Page")
	public void admin_user_staff_is_on_reset_password_page() {

		lp.resetURL();

	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) and (.*)$")
	public void admin_user_staff_clicks_submit_button_after_entering_and(String newpas , String retype) {
	
		lp.enternewpassword(newpas);
		lp.retype(retype);

	}

	@Then("Admin/User/Staff should be redirected to login page")
	public void admin_user_staff_should_be_redirected_to_login_page() {

		lp.login();

	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) and (.*)$")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password(String newpas , String retype) {

		lp.enternewpassword(newpas);
		lp.retype(retype);
		
	}

	@Then("Admin/User/Staff should see an error message {string}")
	public void admin_user_staff_should_see_an_error_message(String string) throws IOException {
		
		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
	   
	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) with less than eight characters$")
	public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_eight_characters(String Psd) {
		
		lp.enterpassword(Psd);
		lp.clicklogin();
		
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) throws IOException {

		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);

	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) without Capital letter$")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter(String psd) {

		lp.enterpassword(psd);
		lp.clicklogin();

	}
	
	@Then("An error message appears as {string}")
	public void an_error_message_appears_as(String string) throws IOException {
		
		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
		
	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) without Number$")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_number(String psd) {
		
	    lp.enterpassword(psd);
	    lp.clicklogin();

	}
	
	@Then("Display an error message {string}")
	public void Display_an_error_message(String string) throws IOException {
		
		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
		
	}

	@When("^Admin/User/Staff clicks submit button after entering (.*) without Special character$")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character(String psd) {
		
		lp.enterpassword(psd);
	    lp.clicklogin();

	}

	@Then("Error message {string}")
	public void error_message(String string) throws IOException {
		
		lp.Errortext(string);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("//JavaSelenium_akila//Screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
		
	}
	
	@When("^Admin/User/Staff clicks cancel button after entering (.*) and (.*)$")
	public void admin_user_staff_clicks_cancel_button_after_entering_and(String newpas, String retype) {
	    
		lp.enternewpassword(newpas);
		lp.retype(retype);

	}

	@Then("Admin/User/Staff should see a refreshed reset password page with empty fields")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
	   
		lp.resetURL();
		
	}


}
