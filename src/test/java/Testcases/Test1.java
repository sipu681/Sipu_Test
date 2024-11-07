package Testcases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 
{
 @Test
 public static void Open()throws Exception
 {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.croma.com/");
     Thread.sleep(1000); 
     driver.close();
 }
}
