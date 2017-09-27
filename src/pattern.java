import java.io.UnsupportedEncodingException;
import java.sql.Driver;
import java.util.Scanner;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pattern {

	public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("garg.piyush48@yahoo.com");

		

		/*
		 * byte[] bytesEncoded = Base64.encodeBase64(str .getBytes());
		 * System.out.println("ecncoded value is " + new String(bytesEncoded ));
		 */
		
		String str = "cGl5dXNoZ2FyZ0AxMjM=";
		// Decode our string
		byte[] bytesDecode = Base64.decodeBase64(str.getBytes());
		// System.out.println("ecncoded value is " + new String(bytesDecode));

		WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
		pass.sendKeys(new String(bytesDecode, "UTF-8"));

		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

		driver.findElement(By.xpath(".//*[@id='u_0_4']/div[1]/div[1]/div/a/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='fbTimelineHeadline']/div[2]/ul/li[3]/a")).click();

		do{
		
			System.out.println("test1");
			if(!driver.findElement(By.xpath(".//*[@id='pagelet_timeline_medley_movies']")).isDisplayed()){
				JavascriptExecutor jse1 = (JavascriptExecutor) driver;
                jse1.executeScript("window.scrollBy(0,200)");
				System.out.println("pass");
			}else{
				JavascriptExecutor jse2 = (JavascriptExecutor) driver;
                jse2.executeScript("window.scrollBy(0,200)");
                System.out.println("fail");
                break;
			}
			
		}while(true);
		
}} 
