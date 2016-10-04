package without_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nw_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/m.manchanda/Desktop/Mohit/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.co.in");		
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 60);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		driver.findElement(By.id("lst-ib")).sendKeys("Hi");
		System.out.println(driver.findElement(By.id("lst-ib")).getLocation());
		System.out.println(driver.findElement(By.id("sfdiv")).getLocation());
		/*
		List username = new List();
		username.add("ebizlicensee10@licensee.com");
		username.add("Bablu");
		Iterator<String> itr = new username.iterator();
		itr.next();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		System.out.println("Success dude");
		driver.quit();
	}

}
