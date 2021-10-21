package Auto1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.gmail.com");
	    System.out.println("Title is :" + driver.getTitle());
        driver.findElement(By.linkText("Help")).click();
        Set<String>  ids= driver.getWindowHandles();
     
        Iterator<String> it=ids.iterator();

        //System.out.println(ids);

        String GmailWindowID=it.next();
        String HelpWindowID=it.next();

        //System.out.println("Gmail Window ID : "+GmailWindowID);
        //System.out.println("Hwlp Window ID : "+HelpWindowID);

        driver.switchTo().window(HelpWindowID);

        System.out.println("title is : "+driver.getTitle());

        //driver.close();
        driver.quit();  
	}

}
