import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_link {


		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "D:/Piyush/selenium driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.kelltontech.net/testlink/index.php?caller=login");
		// driver.manage().window().maximize();
		
	driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("piyush.garg");
	driver.findElement(By.xpath(".//*[@id='login_div']/form/div[2]/p[2]/input")).sendKeys("9996424629");
	driver.findElement(By.xpath(".//*[@id='login_div']/form/div[2]/input")).click();*/
		
	/*	String str = "my testing"; 
		String str2 = "";
		
		int length = str.length();
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--){
			
			str2 = str2+str.charAt(i);
			
			
		}
	System.out.println(str2);

	}*/
		
	 public static void main(String[] args){
		String str = "my testing love";
		System.out.println(str);
		String revStr = reverseWordByWord(str);
		System.out.println(revStr);
	 }
	 
				public static String reverseWordByWord(String str) {
					int strLength = str.length()-1;
					String reverse = "" ,temp = "";
					
						for( int i=0;i<=strLength;i++){
							temp += str.charAt(i);
							if((str.charAt(i) == ' ' )|| (i== strLength)){
								for(int j= temp.length()-1; j>=0;j--){
									
									reverse += temp.charAt(j);
									if((j== 0) && (i!= strLength))
										reverse += " ";
									}
								temp = "";
								
							}
						}
						return reverse;
	
		}
	}

	
	