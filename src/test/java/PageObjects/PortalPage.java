package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortalPage {

	public static WebDriver driver=new ChromeDriver();
	String url="https://dsportalapp.herokuapp.com";

	
	public void openPortal() {

//	System.setProperty("webdiver.chrome.driver","C:\\Users\\Manoj\\eclipse-workspace\\DS-Algo\\src\\test\\resources\\driver\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	public void clickGetStarted() {
		driver.findElement(By.linkText("Get Started")).click();

	}

	public String getTitle() {

		String title=driver.getTitle();
		return title;

	}
}
