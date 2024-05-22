package nine_keyboard_and_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class Mousebasic {
	
public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		WebElement signIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signIn).build().perform();
		actions.click().build().perform();
	

		//actions.click(signIn).build().perform();
		
//		int x = signIn.getLocation().getX();
//		int y = signIn.getLocation().getY();
//		actions.moveByOffset(x, y).build().perform();;
		
		
}

}
