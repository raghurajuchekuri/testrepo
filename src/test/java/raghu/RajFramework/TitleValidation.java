package raghu.RajFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TitleValidation {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		/*String x= "Hi Java";		
		driver.findElement(By.name("q")).sendKeys(x);*/

		String t=driver.getTitle();
		if(t.equalsIgnoreCase("Google"))
		{
			System.out.println("Test Passed");
		}
		else 
			{
				System.out.println("Test Failed");
			}
		
		
		/*WebElement e1 = driver.findElement(By.xpath("//*[contains(text(),'Send')]"));
		if (e1.isDisplayed());
		{
			System.out.println("Image icon Test Pass");
		}*/
		
		/*Assert.assertEquals("Google", t);
		System.out.println(t);*/
		
				driver.quit();
	}

}
