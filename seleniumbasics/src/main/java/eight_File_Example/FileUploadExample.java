package eight_File_Example;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filePath = "D:\\Selenium\\Assignments\\AlertSample.png";
		//fileUpload.sendKeys(filePath);
		File file = new File(filePath);
		fileUpload.sendKeys(file.getAbsolutePath());
		
	
		
	}
}
