package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com");
	driver.manage().window().maximize();
	System.out.println("Title : " + driver.getTitle());
	driver.findElement(By.className("nav__button-secondary")).click();
	driver.findElement(By.id("username")).sendKeys("bhagawan");
	driver.findElement(By.id("password")).sendKeys("Raghu123");
	driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.partialLinkText("Forgot")).click();
	System.out.println("Title : " + driver.getTitle());
	
	driver.findElement(By.linkText("Join now")).click();
	System.out.println("Title : " + driver.getTitle());
	
	int size=driver.findElements(By.tagName("a")).size();
	System.out.println("Total number of links: "+ size);
	
	driver.close();
	}

}
