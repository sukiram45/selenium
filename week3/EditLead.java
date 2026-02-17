package week3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
		driver.get("http://leaftaps.com/opentaps/");

	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");


		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");


		driver.findElement(By.className("decorativeSubmit")).click();


		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//span[text()='Company Name']/following::input[@id='createLeadForm_companyName']"))
				.sendKeys("Tester");


		driver.findElement(
				By.xpath("//span[text()='Last name']/following::input[@id='createLeadForm_lastName']"))
				.sendKeys("Ram");

		driver.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']"))
				.sendKeys("Suki");

		driver.findElement(
				By.xpath("//span[text()='First Name (Local)']/following::input[@id='createLeadForm_firstNameLocal']"))
				.sendKeys("Sukilocal");

		driver.findElement(
				By.xpath("//span[text()='Annual Revenue']/preceding::input[@id='createLeadForm_departmentName']"))
				.sendKeys("IT");

		driver.findElement(By.xpath("//td[span[text()='Description']]/following-sibling::td/textarea"))
				.sendKeys("Automation tester");

	
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_primaryEmail']"))
				.sendKeys("testleaf.2023@gmail.com");


		WebElement generalStateProvinceDropdown = driver
				.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select generalStateProvinceDropdownOptions = new Select(generalStateProvinceDropdown);
		generalStateProvinceDropdownOptions.selectByVisibleText("New York");

		
		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Its a important note");
	
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
}

}
