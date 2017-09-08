package org.DemoCompany.TestConfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver = null;
	
	public void Configuration(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\Chromedriver.exe");
		driver =new ChromeDriver();

	}
		/*driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());*/
		
	/*	
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Ravi");
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Tiwari");
		
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		*/
	}

