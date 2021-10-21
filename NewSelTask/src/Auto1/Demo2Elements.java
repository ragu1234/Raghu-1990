package Auto1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2Elements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();
		myD.get("https://jqueryui.com/droppable/");
		System.out.println("title is : "+myD.getTitle());
		
		String vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		
		int vFrame=myD.findElements(By.tagName("iframe")).size();
		System.out.println(vFrame);
		
		//myD.switchTo().frame(0);
		myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
		
		vText=myD.findElement(By.id("draggable")).getText();
		System.out.println(vText);
		
		WebElement Drag=myD.findElement(By.id("draggable"));
		WebElement Drop=myD.findElement(By.id("droppable"));
		
		Actions act=new Actions(myD);
		act.dragAndDrop(Drag, Drop).build().perform();
		
		Thread.sleep(4000);
		
		myD.switchTo().defaultContent();
		
		
		vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		myD.close();
		
		}


}
