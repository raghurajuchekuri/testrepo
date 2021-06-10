package raghu.RajFramework;



import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDatareader {
	
		
	public static List<Integer> something(String pass) 
	{
		List<Integer> l=null;
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
		 
		
			//Fetch table
			WebElement table = driver.findElement(By.xpath("//*[@id='task-table']/tbody"));
			//Fetch # of rows in a table
			List<WebElement> rows_table = table.findElements(By.tagName("tr"));	
			int rowsCount =rows_table.size();
			System.out.println("RowCount : "+rowsCount);
			
			//Fetch # of columns in a table
			List<WebElement> columns_table = rows_table.get(1).findElements(By.tagName("td"));
			int ColumnCount=columns_table.size();
			System.out.println("ColumnCount : "+ColumnCount);
			
			for(int i=1; i<=rowsCount;i++)
			{
				for(int j=1; j<=ColumnCount; j++)
				{
					String x= driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr["+ i +"]/td["+ j +"]")).getText();
					if(x.equalsIgnoreCase(pass))
					{
						System.out.print(x+ " ");
						System.out.println("(Row:"+ i +"," +"Column:"+ j +")");
						l=Arrays.asList(i,j);						
				    }
				}				
			}
			return l;			
		}
			
	public static void main(String[] args) {
	
		 
		//WebtableDatareader.something("Emily John");
		System.out.print(something("Emily John"));
		 
		 //driver.close();	
	}
	

}
