package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		System.out.println("autoScale attribute ID Value:" + mail.getAttribute("title"));
		
		WebElement google = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		System.out.println("autoScale attribute ID Value:" + google.getAttribute("title"));
		

	}

}
