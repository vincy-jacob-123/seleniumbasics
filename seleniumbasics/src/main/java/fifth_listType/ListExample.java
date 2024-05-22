package fifth_listType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();

		WebElement homeField = driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[1]//a"));
		System.out.println("Home field :" + homeField.getText());
		
		
 
	}	
}
