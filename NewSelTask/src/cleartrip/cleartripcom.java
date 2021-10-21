package cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartripcom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		System.out.println("Title is :"+ driver.getTitle());
		
		
		Select ProductSelect = new Select(driver.findElement(By.className("bc-neutral-100 bg-transparent")));
			ProductSelect.selectByIndex(3);
			Thread.sleep(4000);
			ProductSelect.selectByValue("5");
			Thread.sleep(4000);
			ProductSelect.selectByVisibleText("9");
		

}
}


