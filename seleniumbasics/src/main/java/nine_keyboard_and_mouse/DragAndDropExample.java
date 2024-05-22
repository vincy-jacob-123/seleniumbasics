package nine_keyboard_and_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class DragAndDropExample {
//	int a ;
//	a = 5;
	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]")); // or //div[@class='ui-widget-content']//li[2]
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions actions  = new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}

}
