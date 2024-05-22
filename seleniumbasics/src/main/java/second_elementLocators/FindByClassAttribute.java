package second_elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		//*************FIND BY CLASS ATTRIBUTE****************
		driver.get("https://www.facebook.com/");
		WebElement emailIdField = driver.findElement(By.className("inputtext _55r1 _6luy"));		
		emailIdField.click();
		emailIdField.sendKeys("vincyjacob27@gmail.com");

		WebElement passwordField = driver.findElement(By.className("_6luy _55r1 _1kbt _9nyh"));		
		emailIdField.click();
		passwordField.sendKeys("vinmaria27");

		WebElement loginButon = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));	
		loginButon.click();

	}

}
