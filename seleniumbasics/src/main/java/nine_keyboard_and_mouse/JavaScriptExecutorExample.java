package nine_keyboard_and_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //explicit type casting
		
		//js.executeScript("window.scrollBy(0,1000)");//400 stands for 400 pixels scrol down..this value can be changed

		WebElement obj = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		js.executeScript("arguments[0].scrollIntoView();", obj); //to scroll to this element
		
		//Click using java script code
		//(//a[text()='Start here.'])[3]
		js.executeScript("arguments[0].click();",obj); // to click to this web element
		
	}

}
