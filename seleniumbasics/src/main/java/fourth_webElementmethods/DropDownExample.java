package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement allDropDrown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
		
		//select is a class in selenium to select a drop down tag..used only for select tag
		Select select=new Select(allDropDrown);
		
		//***************Syntax using ByIndex**************
		//select.selectByIndex(3); //simply five any index //starting from 0 index
		//select.selectByIndex(4);
		//select.selectByIndex(5); 
				
		// imp ---> here it picks the last declared value if more than 1 element declared
		
		//***************Syntax using ByValue**************
		select.selectByValue("search-alias=baby");  //value of options tag coming under select
		
		
		//***************Syntax using ByVisibleText**************
		select.selectByVisibleText("Audible Audiobooks"); 
		
		//select.getOptions(); //list of elemets
		System.out.println("no."+select.getOptions().size());
		
		
	}

}
