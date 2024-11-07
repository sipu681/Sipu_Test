package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	@Test
	 public static void Open()throws Exception
	 {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.croma.com/");
	     Thread.sleep(1000); 
	     driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div/div[5]/span[1]")).click();
	     driver.close();
	 }
}
