import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class car {

 public static void main(String[] args) throws InterruptedException {
  // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe"); 
	//	System.setProperty("webdriver.ie.driver", "D:/Piyush/selenium driver/IEDriverServer_Win32_2.53.1/IEDriverServer.exe");
		
		  
	//	WebDriver  driver=new InternetExplorerDriver();
  WebDriver driver = new ChromeDriver();
  driver.get("http://twistarcms.studiographene.co.uk");
  // driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/input")).sendKeys("admin@admin.com");
  driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/input")).sendKeys("123456");
  driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/button")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("html/body/app-root/app-secure-layout/div/app-navigation/ul/li[2]/a")).click();

 Thread.sleep(2000);
 
 // Scroll down
 
 	/*WebElement scrollTo = driver.findElement(By.xpath(".//*[@id='mainContent']/app-sites/perfect-scrollbar/div[1]/div/table/tbody/tr[10]/td[1]"));
 	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scrollTo);*/
 
 WebElement scrollTo = driver.findElement(By.xpath(".//*[@id='mainContent']/app-device/perfect-scrollbar/div[1]/div/table/tbody/tr[18]/td[1]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scrollTo);
	scrollTo.click();
 
}}