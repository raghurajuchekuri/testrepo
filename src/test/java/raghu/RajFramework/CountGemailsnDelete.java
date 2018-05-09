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

public class CountGemailsnDelete {

	public static void main(String[] args) throws Throwable {
		
		
		ExtentReports er = new ExtentReports("Result.html",false);
		ExtentTest et = er.startTest("Gmail Send mail and Delete mails");
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));		
		driver.findElement(By.name("identifier")).sendKeys("raghurajuchekuri");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));			
		driver.findElement(By.xpath("//*[text()='Next']")).click();
				
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));	
		driver.findElement(By.name("password")).sendKeys("xxxx");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));		
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		
	Thread.sleep(2000);
	
			for(int i=1; i<=3; i++)
			{
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label=\"To\"]")));	
				driver.findElement(By.xpath("//*[@aria-label=\"To\"]")).sendKeys("raghuraj.c@gmail.com");
				
				driver.findElement(By.name("subjectbox")).sendKeys(+i+" mail");
				driver.findElement(By.xpath("(//*[@aria-label=\"Message Body\"])[2]")).sendKeys(+i+" mail");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[contains(text(),'Send')])[1]")).click();
				
				if(i<3)
				{				
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));	
					driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
				}
			}
			
			
			driver.findElement(By.xpath("//*[(text()='Sent')]")).click();
			Thread.sleep(2000);
										
			
			for (int j=0; j<5; j++)
			{
				Thread.sleep(2000);
				String x= driver.findElement(By.xpath("(//table)[7]/descendant::tr[1]/td[6]/div/div/div/span")).getText();
				if(x.equals("1 mail") || x.equals("2 mail") || x.equals("3 mail"))
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//table)[7]/descendant::tr[1]/td[6]/div/div/div/span")).click();
					Thread.sleep(2000);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"ar9 T-I-J3 J-J5-Ji\"])[3]")));	
					driver.findElement(By.xpath("(//*[@class=\"ar9 T-I-J3 J-J5-Ji\"])[3]")).click();
				}
				else
				{
					
					et.log(LogStatus.PASS, "Test Passed");
					File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest = new File("ss.png");
					FileUtils.copyFile(src, dest);
					et.log(LogStatus.PASS,et.addScreenCapture("ss.png"));
					
					break;
				}
				
			}
			driver.quit();
			//Save and Close results
			er.endTest(et);
			er.flush();
			
			
	

	}

}
