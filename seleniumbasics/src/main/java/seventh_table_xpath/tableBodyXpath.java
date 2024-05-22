package seventh_table_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableBodyXpath {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		WebElement fourthRowInBody = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[4]//td[3]"));
		System.out.println("fourthRowInBody text ::" +fourthRowInBody.getText());
		
		WebElement sixthRowInBody = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[4]//td[6]"));
		System.out.println("sixthRowInBody text ::" +sixthRowInBody.getText());
		
	}

}

