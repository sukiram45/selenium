package week3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement(By.xpath(
						"//input[@id='createLeadForm_parentPartyId']/preceding::input[@id='createLeadForm_companyName']"))
						.sendKeys("Tester");

	    driver.findElement(By.xpath("//td/input[@id='createLeadForm_lastName']")).sendKeys("Ram");
		 
		driver.findElement(By.xpath("//tr//input[@id='createLeadForm_firstName']")).sendKeys("Suki");

		driver.findElement(By.xpath("//tr/following::input[@name='generalProfTitle']")).sendKeys("Title");

	
		System.out.println(driver.getTitle());
		driver.findElement(By.name("submitButton")).click();

}

}
