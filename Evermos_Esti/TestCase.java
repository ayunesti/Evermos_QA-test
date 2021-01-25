package Evermos_Esti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebElement element = driver.findElement(By.xpath(xpath));
		
		
		driver.manage().window().maximize();
		
		
		//Success Login test case
		driver.get("http://www.evermos.com");
		
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/ul/li[6]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[1]")).sendKeys("621223334444");
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[2]/span[2]/input")).sendKeys("password");
				
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/button")).click();
		
		//driver.quit();
					
				
				
				
				

	}

}
