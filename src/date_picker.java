import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class date_picker {


	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String d = "24/03/2017";
		/*System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath(".//input[@id='datepicker']")).click();*/
		 
		 // extract month and date
		 
		/* SimpleDateFormat df = new SimpleDateFormat();
		 Date myDate = df.parse(d);
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(myDate);
		 
		 int day =cal.get(Calendar.DAY_OF_MONTH);
		 int month =cal.get(Calendar.MONTH);
		 int year = cal.get(Calendar.YEAR);
		 System.out.println(day);
		 System.out.println(month);
		 System.out.println(year);
			for(int i=0 ;i<datepicker.size();i++){
			System.out.println("dates in datepicker--->" + datepicker.get(i).getText());
		}*/
		
		 String dateTime ="12/07/2014 2:00 PM";
		 
		// System.setProperty("webDriver.gecko.driver", "D:\\geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe");
		 
		
		  WebDriver driver = new FirefoxDriver();

	   //   driver.manage().window().maximize();
	        
	        driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        //button to open calendar

	        WebElement selectDate = driver.findElement(By.xpath(".//span[@class='k-select']/span[1]/span"));
	        selectDate.click();
		
		
		
	}

}
