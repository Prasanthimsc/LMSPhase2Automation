package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class RegisterPage {

	WebDriver driver;
	String URL = "https://lms-frontend-phase2.herokuapp.com/register";
	By registerURL = By.linkText(URL);
	By FootText = By.linkText("hege@example.com");
	By errortext = By.xpath("alert-content");
	By FirstName = By.id("input-register-firstname");
	By LastName = By.id("input-register-lastname");
	By HouseNum = By.id("input-register-address-1");
	By StreetName = By.id("input-register-address-2");
	By City = By.id("input-register-city");
	By State = By.id("id_state");
	By Zip = By.id("input-register-postcode");
	By Country = By.id("input-register-country");
	By PhoneNumber = By.id("input-register-telephone");
	By Username = By.id("input-register-username");
	By Email = By.id("input-register-email");
	By Password = By.id("input-register-password");
	By DOB = By.id("input-register-birth");
	By Birth = By.xpath("//form//input[@name='bdaytime']");
	By signup = By.id("button-register");
	By Login = By.xpath("//button[@id='login']");
	


public RegisterPage(WebDriver driver) {
	this.driver = driver;

}
public void registerURL() {
	
	driver.get(URL);
	
}
public void registerheader() {
	
	String ActualTitle = driver.findElement(registerURL).getText();
	String ExpectedTitle = "LMS REGISTER";
	Assert.assertEquals(ActualTitle,ExpectedTitle);
	System.out.println(ActualTitle);
	
}
public void footervalidation() {
	
	String Ftext = driver.findElement(FootText).getText();
	System.out.println(Ftext);
}
public void Errortext(String Error) {
	
	driver.findElement(errortext).getText();
	
}
public void enterFirstname(String Fname) {
	
	driver.findElement(FirstName).sendKeys(Fname);
	
}
public void enterLastname(String Lname) {
	
	driver.findElement(LastName).sendKeys(Lname);
	
}
public void enterHousenumber(String Hnum) {
	
	driver.findElement(HouseNum).sendKeys(Hnum);
}
public void enterStname(String Sname) {
	
	driver.findElement(StreetName).sendKeys(Sname);
}
public void entercity(String city) {
	
	driver.findElement(City).sendKeys(city);
}
public void selectStatedropdown(String state) {
	
	WebElement stateele = driver.findElement(State);
	Select State = new Select(stateele);
	State.selectByVisibleText(state);
	
}
public void clickstate() {
	
	driver.findElement(State);
	
}
public void selectCountrydropdown(String country) {
	
	WebElement countryele = driver.findElement(Country);
	Select Country = new Select(countryele);
	Country.selectByVisibleText(country);
	
}
public void clickcountry() {
	
	driver.findElement(Country);
	
}
public void selectDateofBirth() {
	
	driver.findElement(DOB).click();
	
}
public void selectBirthday() {
	
	driver.findElement(Birth).click();
	
}
public void enterZip(String zip) {
	
	driver.findElement(Zip).sendKeys(zip);
	
}
public void enterUsername(String uname) {
	
	driver.findElement(Username).sendKeys(uname);
	
}
public void enterEmail(String email) {
	
	driver.findElement(Email).sendKeys(email);
	
}
public void enterPassword(String pswd) {
	
	driver.findElement(Password).sendKeys(pswd);
	
}
public void enterPhonenumber(String ph) {
	
	driver.findElement(PhoneNumber).sendKeys(ph);
	
}
public void clicksignup() {
	driver.findElement(signup).click();
}
public void clicklogin() {
	driver.findElement(Login).click();
}

}