package Step_Definition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Driver_Manager {
	public static WebDriver driver_init;
	
	@BeforeAll
	public static void before_all() {
		System.setProperty("WebDriver.Chrome.driver","//Users//jeyakarthikkanainarsureshkumar//Documents//JavaSelenium_akila//src//driver//chromedriver 8 2.exe");
	     driver_init = new ChromeDriver();

	}
	public static WebDriver getDriver() {
		return driver_init;
		
	}
	
	@AfterAll
	public static void after_all() {
		driver_init.quit();
	}
	
	
}
