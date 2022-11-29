package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object.Logout_Page;
import io.cucumber.java.en.*;

public class Logout_step extends Base_Class{
	
	WebDriver driver;
	
	
	@Given("The Browser is initiated and the user/staff/admin is in the LMS page")
	public void The_Browser_is_initiated_and_the_user_staff_admin_is_in_the_LMS_page(){
		
		lo = new Logout_Page(driver);
		
	}

	@When("The user/staff/admin clicks the Logout button")
	public void The_user_staff_admin_clicks_the_logout_button() {
		
		lo.logout();
		
	}
	
	@Then("Then The user/staff/admin is logged and taken back to the login screen to supply a fresh set of credentials")
	public void Then_the_user_staff_admin_is_logged_and_taken_back_to_the_login_screen_to_supply_a_fresh_set_of_credentials() {
		
		lp.url();
		lp.headervalidation();
		
	}
}
