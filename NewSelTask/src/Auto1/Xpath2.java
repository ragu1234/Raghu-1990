package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.className("nav__button-secondary")).click();
		driver.findElement(By.id("username")).sendKeys("bhagawan");
		driver.findElement(By.id("password")).sendKeys("Raghu123");
		//driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		//driver.findElement(By.xpath("//button=[@type='submit' and aria-label='Sign in'")).click();
		driver.close();
	}

}
