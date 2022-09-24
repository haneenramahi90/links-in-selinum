package linkswithsellinum;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASS_NEW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.facebook.com");
		//List mytag = driver.findElements(By.tagName("a")).size();
		
		// 1- count all the link in the page 
		
		System.out.println ( driver.findElements(By.tagName("a")).size());
		
		//2- count only the links footer 
		
		WebElement myfooter = driver.findElement (By.id("pageFooter"));
		System.out.println(myfooter.findElements(By.tagName("a")).size());
		
		//3 - count under footer by xpath 
	//	WebElement underfooter = driver.findElement(By.xpath("//div[@id='pageFooterChildren']"));
	//	System.out.println(underfooter.findElements(By.tagName("a")).size());
		
		//3.1 count the item in the lastest footer by ID 
		
		WebElement myfootertwo  = driver.findElement(By.id("pageFooterChildren"));
		System.out.println(myfootertwo.findElements(By.tagName("a")).size());
		
		// «—Ã⁄Ì ··œ› — 
		
		
		//6- get the title of each tab 
		
		   Set<String> mytabs = driver.getWindowHandles();
		   
		   Iterator<String> tabView = mytabs.iterator();
		   
		   while (tabView.hasNext()) {
			   
			   driver.switchTo().window(tabView.next());
			   System.out.println(driver.getTitle());
			   
			   
		   }
		
	}

}
