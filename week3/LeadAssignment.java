package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadAssignment {
public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("suki");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input[@id='createLeadForm_lastName']")).sendKeys("ram");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/preceding::input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input[@id='createLeadForm_generalProfTitle']")).sendKeys("Tester");
driver.close();

	}

}
