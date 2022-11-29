package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Login_Page {
	WebDriver driver;
	
	String URL = "https://lms-frontend-phase2.herokuapp.com/login";
	String Login = "http://lmsphase2seleniumhackahon.com";
	String resetpassword = "https://lms-frontend-phase2.herokuapp.com/resetpassword";
	By verifylogin = By.linkText("login verification");
	By FootText = By.linkText("hege@example.com");
	By HeadText = By.linkText("Manage Program");
	By errortext = By.xpath("alert-content");
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@type='submit']");
	By code = By.xpath("//input[@name='code']");
	By email = By.xpath("//input[@name='email']");
	By forgetpassword = By.linkText("Forget Password?");
	By click = By.xpath("//input[@type='button']");
	By verify = By.xpath("//p[contains(text(),'Verification Code')]");
	By Newpassword = By.xpath("//input[@name='new-password']");
	By retypepassword = By.xpath("//input[@name='re-password']");
	
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	public void url() {
		
		driver.get(URL);
		
	}
	public void login() {
		
		driver.get(Login);
		
	}
	public void headervalidation() {
		String ActualTitle=driver.findElement(login).getText();
		String ExpectedTitle = "LMS";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println(ActualTitle);
		
	}
	
	public void footervalidation() {
		
		String Ftext = driver.findElement(FootText).getText();
		System.out.println(Ftext);
	}
	public void headerText() {
		
		String Htext= driver.findElement(HeadText).getText();
		System.out.println(Htext);
		
	}
	public void Errortext(String Error) {
		
		driver.findElement(errortext).getText();
		
	}
	public void verificationheader() {
		String ActualTitle=driver.findElement(verifylogin).getText();
		String ExpectedTitle = "LMS verify";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		System.out.println(ActualTitle);
	}
	public void resetURL() {
		
		driver.get(resetpassword);
		
	}
	public void enterusername(String uname) {
		
		driver.findElement(username).sendKeys(uname);
		
	}
	public void enterpassword(String psd) {
		
		driver.findElement(password).sendKeys(psd);
	}
	public void clicklogin() {
		driver.findElement(login).click();
	}
	public void entercode(String cd) {
		driver.findElement(code).sendKeys(cd);
	}
	public void enteremail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void clickforgetpassword() {
		driver.findElement(forgetpassword).click();
	}
	public void enterclick() {
		driver.findElement(click).click();
	}
	public void verify(String v) {
		driver.findElement(verify).sendKeys(v);
	}
	public void enternewpassword(String newpass) {
		driver.findElement(Newpassword).sendKeys(newpass);
	}
	public void retype(String re) {
		driver.findElement(retypepassword).sendKeys(re);
	}
	}
