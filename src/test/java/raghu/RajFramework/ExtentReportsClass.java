package raghu.RajFramework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsClass{
	
	
	public static void main(String[] args) {
		
		
		//Create Extent Reports
		
		ExtentReports er = new ExtentReports("Result.html",false);
		ExtentTest et = er.startTest("Google Title Test");
		
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.google.co.in");
			driver.manage().window().maximize();
			
			WebDriverWait w = new WebDriverWait(driver, 100);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
				
			String t=driver.getTitle();
			
			if(t.equalsIgnoreCase("Google"))
			{
				et.log(LogStatus.PASS, "Test Passed");
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("ss.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.PASS,et.addScreenCapture("ss.png"));
			}
			else 
				{
					et.log(LogStatus.FAIL, "Test Failed");
					File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest = new File("ss.png");
					FileUtils.copyFile(src, dest);
					et.log(LogStatus.FAIL,et.addScreenCapture("ss.png"));
					
				}
			
			driver.quit();
		}
		catch (Exception e)
		{
			et.log(LogStatus.ERROR, e.getMessage());
		}
		
		
	//Save and Close results
	er.endTest(et);
	er.flush();
	
	
			
}

 
}