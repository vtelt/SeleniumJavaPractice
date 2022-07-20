import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		//4 times
	//	driver.findElement(By.id("hrefIncAdt")).click();
	/*	int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		} */
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
