package fifth_listType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountrySelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.manage().window().maximize();
		
		
		WebElement dropDownField = driver.findElement(By.xpath("(//span[@class='select2-selection__arrow']//b)[1]"));
		dropDownField.click();
		
		WebElement countryField = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		countryField.sendKeys("Washington");
		countryField.click();
		
		WebElement selectCountryField = driver.findElement(By.xpath("//li[text()='Washington']"));
		selectCountryField.click();
	}
}
