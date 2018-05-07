package raghu.RajFramework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

public class GmailAddContacts {

	public static void main(String[] args) throws Throwable {
		
		ExtentReports er = new ExtentReports("Result.html",false);
		ExtentTest et = er.startTest("Gmail Add COntact and Delete Test");
		
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));		
		driver.findElement(By.name("identifier")).sendKeys("XXXXX");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));			
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));	
		driver.findElement(By.name("password")).sendKeys("XX");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));		
		//driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		
		driver.findElement(By.xpath("(//*[text()='Gmail'])[3]")).click();
	
		driver.findElement(By.xpath("(//*[text()='Contacts'])[2]")).click();
		
		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());		
		driver.switchTo().window(handles.get(1));		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='iYm0K']")));
		driver.findElement(By.xpath("//*[@class='iYm0K']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label=\"Name\"]")));
		driver.findElement(By.xpath("//*[@aria-label=\"Name\"]")).sendKeys("krishna");
		driver.findElement(By.xpath("//*[@aria-label=\"Company\"]")).sendKeys("krishna");
		driver.findElement(By.xpath("//*[@aria-label=\"Job title\"]")).sendKeys("krishna");
		driver.findElement(By.xpath("//*[@aria-label=\"Email\"]")).sendKeys("krishna@12345@gmail.com");
		driver.findElement(By.xpath("//*[@aria-label=\"Enter a phone number\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@aria-label=\"Close\"])[2]")));
		driver.findElement(By.xpath("(//*[@aria-label=\"Close\"])[2]")).click();
		
		Thread.sleep(2000);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='krishna']")));
		driver.findElement(By.xpath("//*[text()='krishna']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"RANAid jaWtS Xdqvsf\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Delete']")).click();
		Thread.sleep(2000);	
		
		try
		{
			
	
			if (driver.findElement(By.xpath("//*[text()='krishna']")).isDisplayed())
			{
				et.log(LogStatus.FAIL, "Test Failed");
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("ss.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.FAIL,et.addScreenCapture("ss.png"));
			}
			
			
		}
		catch (Exception e) {
			
			et.log(LogStatus.PASS, "Test Passed");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("ss.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.PASS,et.addScreenCapture("ss.png"));
			
		}
	
				
		driver.quit();
		//Save and Close results
		er.endTest(et);
		er.flush();
		
	}

}
