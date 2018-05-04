package Stepdefs;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 
public class Hooks {
	
	public  WebDriver driver = null;
	
	@Before
    public void beforeScenario(){
		
		System.out.println("This will run before the Scenario");
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    }	
	
	@After
    public void afterScenario() throws Throwable{
		
        System.out.println("This will run after the Scenario");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("Results\\ss.png");
		FileUtils.copyFile(src, dest);
        
        driver.close();
    }
}