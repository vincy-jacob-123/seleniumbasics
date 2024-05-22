package seventh_table_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableBodyWithList {

	public static void main(String[] args) {
			System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/table-pagination.php");
			driver.manage().window().maximize();
			
			List<WebElement> namesList = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr//td[1]"));
			
			namesList.forEach(name -> System.out.println("Name ::" +name.getText()));
			
			//to count the no. of names in the 
			
			//full data of one person
			List<WebElement> fullDataOfAPerson = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[3]//td"));
			fullDataOfAPerson.forEach(data -> System.out.println(data.getText()));
	}
}
