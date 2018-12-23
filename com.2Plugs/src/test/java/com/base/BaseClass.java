
package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.util.Extent_Reports;
import com.util.Xls_Reader;

public class BaseClass {

	public static Properties config = new Properties();
	public static Xls_Reader excel = null;
	public static Extent_Reports extent;
	public static WebDriver driver = null;
	public static Logger app_logs = Logger.getLogger("BaseClass");

	public static void init() throws IOException {
	
		PropertyConfigurator.configure("Log4j.properties");
		
		try
		{ 
			driver = null;
			if (driver == null) 
			{
				
				// load config property file
				FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
				config.load(fis);
				
				app_logs.debug("Debug Messages! loading the config property file");
				
				// load excel file
				excel = new Xls_Reader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
				app_logs.debug("loading the excel file");
	
				if (config.getProperty("browser").equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\browser_drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (config.getProperty("browser").equals("firefox")) {
					FirefoxOptions options = new FirefoxOptions();
					options.setCapability("marionette", false);

					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\browser_drivers\\geckodriver.exe");
					driver = new FirefoxDriver(options);
				}
	
				driver.get(config.getProperty("testsiteURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
			}
		catch (Exception e) {
				System.out.println(e);
		}
	}
	
	public static void tearDown()  {
		driver.quit();
		driver=null;
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters =
				"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	
	

	
	public void takeScreenShot(WebDriver driver, String scrname)
	{
		File directory= new File("screenshotFolder");
        directory.mkdir();
	
		Date d=new Date();
		String fileName=d.toString().replace(":", "_").replace(" ", "_");
	
		System.out.println(fileName);
		System.out.println(System.getProperty("user.dir"));
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//screenshotFolder//"+fileName+scrname+".png"));
			System.out.println("Screenshot taken!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	
	}
	

}