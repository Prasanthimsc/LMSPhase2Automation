package StepDefs;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import Page_Object.Login_Page;
import Page_Object.RegisterPage

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import lmsPageObject.addBatchPageObject;
import lmsPageObject.batchPageObject;
import lmsPageObject.editBatchPageObject;
import lmsPageObject.Login_Page;
import lmsPageObject.Logout_Page;
import lmsPageObject.RegisterPage;
import lmsPageObject.ProgramPage;
import lmsPageObject.User_Page;
import lmsPageObject.Attendance_page;
import lmsPageObject.Assignment_page;

public class baseClass {
	
	public WebDriver driver;
	public addBatchPageObject abpo;
	public batchPageObject bpo;
	public editBatchPageObject ebpo;
	public static Logger logger;
	public Properties configprop;
	public static WebDriver driver;
	public static RegisterPage rp;
	public static Login_Page lp;
	public static Logout_Page lg;
	public static ProgramPage pp;
	public static User_Page up;
        public Attendance_page ap;
        public User_page up;
        public AssignmentPage Asp;
    
        
	static {
		driver = getDriver();
	}
	
	/* /
	@Before
	public void setup(String br)
		{
			//Loading config.proeprties file
			rb=ResourceBundle.getBundle("config");
			
			//Logging
			logger=LogManager.getLogger(this.getClass());
			
			
			//Driver
			
			if(br.equals("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
			else if(br.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@After
		public void tearDown()
		{
			driver.quit();
		}   */
	
	public String randomstring()
	{
	
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public int randomnumber()
	{
	
		String generatedstring2=RandomStringUtils.randomNumeric(5);
		return(Integer.parseInt(generatedstring2));
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
	}

}
