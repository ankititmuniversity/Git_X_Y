package MavenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
	@Test(groups= {"Regresion"})
	public void actionMethod() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar39\\AutomationFramework\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions act =new Actions(driver);
		WebElement element=driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(element).contextClick().build().perform();
		WebElement element1=driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(element1).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		driver.findElement(By.xpath("//span[text()=' beautiful ann napolitano']")).click();
		System.out.println("Hi Maven");
	}

}
