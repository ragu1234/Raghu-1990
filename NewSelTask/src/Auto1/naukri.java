package Auto1;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		
		// Load the website
		myD.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String parent=myD.getWindowHandle();
		Set<String>s=myD.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			myD.switchTo().window(child_window);

			System.out.println(myD.switchTo().window(child_window).getTitle());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myD.close();
			}

			}
			//switch to the parent window
			myD.switchTo().window(parent);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myD.close();
						
			
			}
	
}
