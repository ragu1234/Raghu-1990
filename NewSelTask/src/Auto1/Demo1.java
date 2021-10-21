package Auto1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 
{

	public static void main(String[] args) 
	{
		
		
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter BrowserName");
		String vBrowser = myObj.nextLine();

		if (vBrowser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\MY Data\\Selenium files\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
	    myD.get("https://www.google.com");
	    String vTitle=myD.getTitle();
	    System.out.println("URL is "+myD.getCurrentUrl());
	    System.out.println("Title is "+vTitle);
	    myD.close();
	    }
		else if (vBrowser.contains("edge"))
	    {
		System.setProperty("webdriver.edge.driver","C:\\MY Data\\Selenium files\\New folder\\new\\Latest\\edgedriver_win32 (1)\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
	    myD.get("https://www.google.com");
	    String vTitle=myD.getTitle();
	    System.out.println("URL is "+myD.getCurrentUrl());
	    System.out.println("Title is "+vTitle);
	    myD.close();
	    }
		else
	    {
	        System.out.println("Invalid Browser");
	    }
	}
}
