package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page {
	
    WebDriver driver;
	String URL = "https://lms-frontend-phase2.herokuapp.com/logout";
	String Login = "http://lmsphase2seleniumhackahon.com";
	By logout =  By.xpath("//input[@type='submit']");


public Logout_Page(WebDriver driver) {
	
	this.driver=driver;
	
}
public void url() {
	
	driver.get(URL);
}
public void logout() {
	
	driver.findElement(logout).click();
	
}
}