package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
        driver.get("https://www.amazon.in");
        System.out.println("title is : "+driver.getTitle());

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();


        System.out.println("title is : "+driver.getTitle());

        Thread.sleep(4000);

        driver.close();
}

}
