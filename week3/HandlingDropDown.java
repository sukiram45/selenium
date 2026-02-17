package week3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
public static void main(String[] args) {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("guest"); 
	ChromeDriver driver = new ChromeDriver();
    
	driver.get("http://leaftaps.com/opentaps/");
    driver.manage().window().maximize(); 
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click(); 
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suki");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");

    Select sourceDropdown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
    sourceDropdown.selectByIndex(4);

    Select marketingDropdown = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
    marketingDropdown.selectByVisibleText("Automobile");

    Select ownershipDropdown = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
    ownershipDropdown.selectByValue("OWN_CCORP");

    driver.findElement(By.className("smallSubmit")).click();
    String title = driver.getTitle();
    System.out.println("Page Title is: " + title);
    if(title.contains("View Lead")) {
        System.out.println("Lead Created Successfully");
    } else {
        System.out.println("Lead Creation Failed");
    }
    driver.close();
}

}
