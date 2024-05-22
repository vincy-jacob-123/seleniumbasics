package first_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/"); 
		driver.navigate().to("https://www.flipkart.com/"); 
		driver.navigate().to("https://www.amazon.in/"); 
		driver.navigate().to("https://www.myntra.com/"); 
		
		driver.navigate().back(); // to return to previous page
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
