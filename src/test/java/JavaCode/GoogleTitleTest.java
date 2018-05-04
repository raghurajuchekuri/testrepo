package JavaCode;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class GoogleTitleTest {
	
	public WebDriver driver = null;
	public void test1()
	{
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
			
		String t=driver.getTitle();
	}

}
