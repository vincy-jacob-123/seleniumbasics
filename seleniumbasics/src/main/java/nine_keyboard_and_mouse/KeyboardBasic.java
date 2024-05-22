package nine_keyboard_and_mouse;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardBasic {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement enterProduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//enterProduct.sendKeys("mobile");
		
		//this is using search button-- normal
		//WebElement enterField = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));		
		//enterField.click();
		
		//here instead of using search button, use keyboard enter button to search the product
		//enterProduct.sendKeys("mobile"+ Keys.ENTER);
		
		//enter key can be sent separately in diff line
		enterProduct.sendKeys("mobile");
		//enterProduct.sendKeys(Keys.ENTER);
		
		//back space
		//enterProduct.sendKeys(Keys.BACK_SPACE);
		
		//to send multiple keys in one line
		enterProduct.sendKeys(Keys.chord(Keys.CONTROL, "A" ));
		//enterProduct.sendKeys(Keys.DELETE);
		enterProduct.sendKeys(Keys.BACK_SPACE);
		
	}

}
