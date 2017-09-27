import java.io.File;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.FileUtils;

public class danik_Bhaskar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
														// Make sure path should be correct
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe"); 
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.google.co.in/?gws_rd=ssl/");
    //	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	
    	WebElement googlemap = driver.findElement(By.xpath("//*[@id='lst-ib']"));
    	googlemap.sendKeys("google map");
    	googlemap.sendKeys(Keys.ENTER);
    	
    	driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
    	
    	 driver.findElement(By.xpath(".//*[@id='searchbox-directions']")).click();
    	 Thread.sleep(2000);
    	 
    	 WebElement placefrom = driver.findElement(By.xpath(".//*[@id='sb_ifc51']/input"));
    	 placefrom.sendKeys("kellton tech");
    
     // driver.findElement(By.xpath("//*[@id='sbse0']/div[2]/div/div/div[1]"));
    	 placefrom.sendKeys(Keys.ENTER);
    
    	 WebElement placeTo = driver.findElement(By.xpath(".//*[@id='sb_ifc52']/input"));
    	 
    	 placeTo.sendKeys("Dwarika sector 9");
    	 placeTo.sendKeys(Keys.ENTER);
    	
    	 
    	 
    	
    	

	}

}
