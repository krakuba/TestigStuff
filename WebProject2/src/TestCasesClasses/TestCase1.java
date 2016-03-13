package TestCasesClasses;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
// Email
	private	WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception
	{
		driver = new FirefoxDriver();
		baseUrl = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void gmailLoginTest () throws Exception 
	{
		driver.get(baseUrl);
		driver.findElement(By.id("Email")).sendKeys("krasuski.jakub@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("");
		driver.findElement(By.id("signIn")).click();
	}
}
