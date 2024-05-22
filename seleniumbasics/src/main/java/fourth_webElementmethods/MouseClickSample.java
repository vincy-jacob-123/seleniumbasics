package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class MouseClickSample {

	public static void main(String[] args) {
		
			
			System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
			WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			
			WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			Actions action = new Actions(driver);
			//action.click().build().perform(); //just click(left click)  at current curser s position
			
			action.contextClick().build().perform();
			
			
//			WebElement seleniumButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
//			action.click(seleniumButton).build().perform(); // click on at webelements position
//			
//			action.contextClick().build().perform(); //for right click at current cursors position
//			
			//action.contextClick(rightClick).build().perform(); 
			
		//	action.doubleClick().build().perform(); 

			//action.doubleClick(doubleClick).build().perform(); 
			
			
			
			

	}

}
