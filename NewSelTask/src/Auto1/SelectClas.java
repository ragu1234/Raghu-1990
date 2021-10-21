package Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClas {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in/*");
        Select ProductSelect = new Select(driver.findElement(By.id("searchDropdownBox")));
		ProductSelect.selectByIndex(2);
		Thread.sleep(4000);
		ProductSelect.selectByValue("search-alias=amazon-devices");
		Thread.sleep(4000);
		ProductSelect.selectByVisibleText("Books");
		Thread.sleep(4000);
	}

}
