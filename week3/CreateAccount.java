package week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR2");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("sukiram");
driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("QA Tester");
        WebElement findElement = driver.findElement(By.name("industryEnumId"));
        Select drop = new Select(findElement);
        drop.selectByVisibleText("Computer Software");
		
        WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2 = new Select (findElement2);
		drop2.selectByVisibleText("S-Corporation");
		
		WebElement findElement3 = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select (findElement3);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement findElement4 = driver.findElement(By.name("marketingCampaignId"));
		Select drop4 = new Select(findElement4);
		drop4.selectByIndex(6);
		
		WebElement findElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5 = new Select(findElement5);
		drop5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		}

}
