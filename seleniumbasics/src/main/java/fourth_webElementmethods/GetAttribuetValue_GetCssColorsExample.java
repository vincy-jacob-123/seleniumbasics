package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribuetValue_GetCssColorsExample {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		
		//get attribute values using getattribute
		WebElement alertField = driver.findElement(By.xpath("//div[contains(text(),'Bootstrap Alert')]"));
		System.out.println("attribute Class Value:" + alertField.getAttribute("class"));
		//if attribute doesnt exist, then empty value returns here
		
		WebElement autoScale = driver.findElement(By.xpath("//button[contains(text(),'Autoclosable warning')]"));
		System.out.println("autoScale attribute ID Value:" + autoScale.getAttribute("id"));
		
		//using css for background colour
		System.out.println("autoScale css Value:" + autoScale.getCssValue("background-color"));
		
		System.out.println("autoScale Css colour Value:" + autoScale.getCssValue("color"));
		
		System.out.println("autoScale css Font Value:" + autoScale.getCssValue("font-size"));
		
		System.out.println("autoScale css Font style Value:" + autoScale.getCssValue("font-style"));
		
		//to print toolTip ---> get attribte ("title")
		
		
	}

}
