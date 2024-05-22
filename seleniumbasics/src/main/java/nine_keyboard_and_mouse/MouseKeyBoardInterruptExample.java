package nine_keyboard_and_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class MouseKeyBoardInterruptExample {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement enterProduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions = new Actions(driver);
		
		//two types --> with params & without  params
		actions.clickAndHold().build().perform();//current cursor position press & hold
		actions.clickAndHold(enterProduct).build().perform(); //webelement position press & hold
		Thread.sleep(5000);
		actions.release();
		actions.release(enterProduct);	
		
		actions.sendKeys(enterProduct,"Tables").build().perform();
		actions.keyDown(Keys.ENTER).build().perform();
	}	
	
}
