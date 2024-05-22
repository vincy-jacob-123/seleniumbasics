package fifth_listType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\localDriver\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			
			WebElement jsAlert=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));			
			WebElement jsConfirm=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));			
			WebElement jsPrompt=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
			
			
			//jsAlert.click();			
			//System.out.println("Alert text :  " + driver.switchTo().alert().getText()); //getting a text value
			//driver.switchTo().alert().accept();	//for ok button in an alert
			
			jsConfirm.click();
			System.out.println("Alert text :  " + driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss(); //for cancelling a alert
			//System.out.println("Alert text :  " + driver.switchTo().alert().getText());
			
//			jsPrompt.click();
//			driver.switchTo().alert().sendKeys("hello");   // for passing any object to the alert
//			driver.switchTo().alert().accept();
			
					
	}

}
