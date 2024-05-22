package seventh_table_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableXpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
				
		WebElement tablePositionField = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr[1]//th[2]"));
		System.out.println("Text column :" +tablePositionField.getText());
		
		//table contains thead,tbody,tfoot
		
		//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr[1]//th[3]
		//thead//tr[1]//th[3]  --> this is also correct as here only one table
		//thead//tr//th[3]  --> this is also correct as only one heading row here
		WebElement agePositionField = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr[1]//th[4]"));
		System.out.println("Age column :" +agePositionField.getText() + "\n");
		
		List<WebElement> headings = driver.findElements(By.xpath("//thead//tr[1]//th"));
		//headings.forEach(heading -> System.out.println("text of each headings: " + heading.getText()));
		System.out.println("No. of headings: " + headings.size());
		
		for (WebElement heading : headings) {
			System.out.println("text of each headings: " + heading.getText());
		}		
	}
}
