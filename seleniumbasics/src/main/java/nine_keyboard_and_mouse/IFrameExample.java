package nine_keyboard_and_mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement obj = driver.findElement(By.xpath("//div[text()='MIDDLE']")); 
		
		System.out.println(obj.getText());
		
	
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebElement obj = driver.findElement(By.xpath("//div[text()='MIDDLE']")); //this throws exception --> since here it is inside i frame..
		//html inside another html --> called as iframe--> here tag is frame
		//obj.click();
		
		//types:
		//frame id or name attribute
		//frame number
		//frame webelement
		
//		driver.switchTo().frame("frame-top"); // using name attribute	
//		
//		driver.switchTo().frame(1);  //using index
//		
	//	WebElement obj = driver.findElement(By.xpath("//div[text()='MIDDLE']")); 
//		
//		System.out.println(obj.getText());
//		
		//for more details, go to thiis link 
		//https://www.selenium.dev/documentation/webdriver/interactions/frames/
		
		driver.switchTo().defaultContent(); // to return to the top element
	}

}
