package SelectClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdob {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement alldate = driver.findElement(By.id("day"));
		Select s = new Select(alldate);
		s.selectByVisibleText("05");
		WebElement allmonth = driver.findElement(By.id("month"));
		Select s1 = new Select(allmonth);
		s1.selectByVisibleText("Dec");
		WebElement allyear = driver.findElement(By.id("year"));
		Select s2 = new Select(allyear);
		s2.selectByVisibleText("1992");
	}
}
