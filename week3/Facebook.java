package week3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook {
public static void main(String[] args) {
	
	 ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en-gb.facebook.com/");
	    driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Suki");
	    driver.findElement(By.name("lastname")).sendKeys("Ram");
	    driver.findElement(By.name("reg_email__")).sendKeys("7598806268");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("suki123");
	    Select day = new Select(driver.findElement(By.id("day")));
	    day.selectByValue("01");
	    Select month = new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText("Feb");
	    Select year = new Select(driver.findElement(By.id("year")));
	    year.selectByValue("2004");
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    System.out.println("Facebook Registration Form Filled Successfully");
	    driver.quit();

}
}
