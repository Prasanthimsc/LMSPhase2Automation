package StepDefs;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import lmsPageObject.addBatchPageObject;
import lmsPageObject.batchPageObject;
import lmsPageObject.editBatchPageObject;

public class baseClass {
	
	public WebDriver driver;
	public addBatchPageObject abpo;
	public batchPageObject bpo;
	public editBatchPageObject ebpo;
	public static Logger logger;
	public Properties configprop;
	
	//public LoginPage lp;
	
	
	
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
